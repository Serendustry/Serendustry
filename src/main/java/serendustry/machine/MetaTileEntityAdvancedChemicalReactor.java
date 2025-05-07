package serendustry.machine;

import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockDisplayText;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.util.BlockInfo;
import gregtech.api.util.GTUtility;
import gregtech.api.util.TextComponentUtil;
import gregtech.api.util.TextFormattingUtil;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;
import serendustry.api.SerendustryAPI;
import serendustry.blocks.BlockACRComponent;
import serendustry.blocks.IACRComponentBlockStats;
import serendustry.machine.structure.StructureDefinition;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

public class MetaTileEntityAdvancedChemicalReactor extends RecipeMapMultiblockController {

    private int temperature;
    private int pressure;

    public MetaTileEntityAdvancedChemicalReactor(ResourceLocation rl) {
        super(rl, RecipeMaps.FUSION_RECIPES);
        //this.recipeMapWorkable = new MegaFusionReactorWorkable(this);
    }

    @Override
    public MetaTileEntityAdvancedChemicalReactor createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityAdvancedChemicalReactor(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);

        this.temperature = 295;
        this.pressure = 101;

        Object type = context.get("ACRComponents");
        if (type instanceof IACRComponentBlockStats) {
            this.temperature += ((IACRComponentBlockStats) type).getTemperatureMod();
            this.pressure += ((IACRComponentBlockStats) type).getPressureMod();
        }
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
        this.temperature = -1;
        this.pressure = -1;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        for (String[] aisle : StructureDefinition.ADVANCED_CHEMICAL_REACTOR) {
            pattern.aisle(aisle);
        }

        pattern.where('S', selfPredicate())
                .where('X',
                        states(MetaBlocks.METAL_CASING
                                .getState(BlockMetalCasing.MetalCasingType.PTFE_INERT_CASING))
                                .setMinGlobalLimited(1).or(autoAbilities()))
                .where('A', ACRComponents())
                .where('G', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS)));

        return pattern.build();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
            return Textures.INERT_PTFE_CASING;
    }

    private static final Supplier<TraceabilityPredicate> ACR_COMPONENT_PREDICATE = () -> new TraceabilityPredicate(
            blockWorldState -> {
                IBlockState blockState = blockWorldState.getBlockState();
                if (SerendustryAPI.ACR_COMPONENTS.containsKey(blockState)) {
                    BlockACRComponent.ACRComponentType block = SerendustryAPI.ACR_COMPONENTS.get(blockState);
                    Object casing = blockWorldState.getMatchContext().getOrPut("ACRComponents", block);

                    blockWorldState.getMatchContext().getOrPut("VBlock", new LinkedList<>())
                            .add(blockWorldState.getPos());

                    return true;
                }
                return false;
            }, () -> SerendustryAPI.ACR_COMPONENTS.entrySet().stream()
            .sorted(Comparator.comparingInt(entry -> entry.getValue().ordinal()))
            .map(entry -> new BlockInfo(entry.getKey(), null))
            .toArray(BlockInfo[]::new));

    public static TraceabilityPredicate ACRComponents() {
        return ACR_COMPONENT_PREDICATE.get();
    }

    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        MultiblockDisplayText.builder(textList, isStructureFormed())
                .setWorkingStatus(recipeMapWorkable.isWorkingEnabled(), recipeMapWorkable.isActive())
                .addEnergyUsageLine(getEnergyContainer())
                .addEnergyTierLine(GTUtility.getTierByVoltage(recipeMapWorkable.getMaxVoltage()))

                // Temperature line
                .addCustom(tl -> {
                    if (isStructureFormed()) {
                        ITextComponent temperatureText = TextComponentUtil.stringWithColor(TextFormatting.YELLOW,
                                TextFormattingUtil.formatNumbers(temperature) + "K");

                        tl.add(TextComponentUtil.translationWithColor(TextFormatting.GRAY,
                                "serendustry.machine.advanced_chemical_reactor.property.temperature", temperatureText));
                    }
                })

                // Pressure line
                .addCustom(tl -> {
                    if (isStructureFormed()) {
                        ITextComponent pressureText = TextComponentUtil.stringWithColor(TextFormatting.YELLOW,
                                TextFormattingUtil.formatNumbers(pressure) + "kPa");

                        tl.add(TextComponentUtil.translationWithColor(TextFormatting.GRAY,
                                "serendustry.machine.advanced_chemical_reactor.property.pressure", pressureText));
                    }
                })
                .addWorkingStatusLine()
                .addProgressLine(recipeMapWorkable.getProgressPercent());
    }
}
