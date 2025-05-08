package serendustry.machine;

import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockDisplayText;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.recipes.Recipe;
import gregtech.api.util.BlockInfo;
import gregtech.api.util.GTUtility;
import gregtech.api.util.TextComponentUtil;
import gregtech.api.util.TextFormattingUtil;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.jetbrains.annotations.NotNull;
import serendustry.api.SerendustryAPI;
import serendustry.api.capability.IACRComponent;
import serendustry.api.capability.impl.ACRRecipeLogic;
import serendustry.blocks.BlockACRComponent;
import serendustry.blocks.IACRComponentBlockStats;
import serendustry.machine.structure.StructureDefinition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

public class MetaTileEntityAdvancedChemicalReactor extends RecipeMapMultiblockController implements IACRComponent {

    private int temperature;
    private int pressure;

    private double EUtMod;

    private List<FluidStack> addedFluids = new ArrayList<>();

    public MetaTileEntityAdvancedChemicalReactor(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.ACR_RECIPES);
        this.recipeMapWorkable = new ACRRecipeLogic(this);
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

        Object casings = context.get("ACRComponents");
        if (casings instanceof List<?>) {
            for (Object casing : (List<?>) casings) {
                if (casing instanceof IACRComponentBlockStats) {
                    IACRComponentBlockStats component = (IACRComponentBlockStats) casing;

                    // Multiply temperature and pressure
                    this.temperature *= component.getTemperatureMod();
                    this.pressure *= component.getPressureMod();

                    // Figure out how much to multiply EUt of recipes by
                    this.EUtMod += component.getEUtMod();

                    // Figure out which extra fluids to add to recipes
                    FluidStack fluidInput = component.getAddedFluidInput();

                    if(fluidInput.amount != 0) {
                        this.addedFluids.add(fluidInput);
                    }

                }
            }
        }

        recipeMapWorkable.setEUDiscount(1 + EUtMod);
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
        this.temperature = -1;
        this.pressure = -1;
    }

    @Override
    public List<FluidStack> getCurrentAddedFluids() {
        return this.addedFluids;
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
                                        .setMinGlobalLimited(1).or(autoAbilities(true, false, true, true, true, true, false)))
                .where('A', ACRComponents())
                .where('G', air());//states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS)));

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

                    blockWorldState.getMatchContext().getOrPut("ACRComponents", new ArrayList())
                            .add(block);

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
    public boolean checkRecipe(@NotNull Recipe recipe, boolean consumeIfSuccess) {
        IntegerRange recipeTemperature = recipe.getProperty(ACRTemperatureProperty.getInstance(), new IntegerRange(0, 0));
        IntegerRange recipePressure = recipe.getProperty(ACRPressureProperty.getInstance(), new IntegerRange(0, 0));

        return !(temperature < recipeTemperature.getStart() || temperature > recipeTemperature.getEnd()
                || pressure < recipePressure.getStart() || pressure > recipePressure.getEnd());
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
