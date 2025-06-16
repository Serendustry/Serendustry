package serendustry.machine;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

import javax.annotation.Nonnull;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.capability.IEnergyContainer;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.MultiblockDisplayText;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.pattern.PatternStringError;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.recipes.Recipe;
import gregtech.api.util.BlockInfo;
import gregtech.api.util.GTUtility;
import gregtech.api.util.TextComponentUtil;
import gregtech.api.util.TextFormattingUtil;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.SValues;
import serendustry.api.SerendustryAPI;
import serendustry.api.capability.IPCCoil;
import serendustry.api.capability.impl.PCRecipeLogic;
import serendustry.blocks.BlockMetalCasing;
import serendustry.blocks.BlockPCCoilCooling;
import serendustry.blocks.BlockPCCoilHeating;
import serendustry.blocks.IPCCoilCoolingBlockStats;
import serendustry.blocks.IPCCoilHeatingBlockStats;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.client.utils.STooltipHelper;
import serendustry.item.material.SerendustryMaterials;
import serendustry.machine.structure.StructurePlasmaCondenser;

public class MetaTileEntityPlasmaCondenser extends RecipeMapMultiblockController implements IPCCoil {

    private int tierHeating;
    private int tierCooling;

    public MetaTileEntityPlasmaCondenser(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, SerendustryRecipeMaps.PLASMA_CONDENSER_RECIPES);
        this.recipeMapWorkable = new PCRecipeLogic(this);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityPlasmaCondenser(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);

        Object type = context.get("PCCoilHeatingTier");
        if (type instanceof IPCCoilHeatingBlockStats) {
            this.tierHeating = ((IPCCoilHeatingBlockStats) type).getTier();
        } else
            this.tierHeating = -1;

        type = context.get("PCCoilCoolingTier");
        if (type instanceof IPCCoilCoolingBlockStats) {
            this.tierCooling = ((IPCCoilCoolingBlockStats) type).getTier();
        } else
            this.tierCooling = -1;

        List<IEnergyContainer> energyInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
        List<IEnergyContainer> substationInput = new ArrayList<>(
                getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));
        List<IEnergyContainer> laserInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_LASER));

        // Allow only 1 type of energy input at a time
        if ((!energyInput.isEmpty() && !substationInput.isEmpty()) ||
                (!energyInput.isEmpty() && !laserInput.isEmpty()) ||
                (!substationInput.isEmpty() && !laserInput.isEmpty())) {
            invalidateStructure();
        }

        // todo: give error message to multiblock builder and make JEI not show mixed hatches

        /*
         * List<IEnergyContainer> powerInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
         * powerInput.addAll(getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));
         * powerInput.addAll(getAbilities(MultiblockAbility.INPUT_LASER));
         * 
         * this.powerInput = new EnergyContainerList(powerInput);
         */  // todo: update ceu so this works and check if this even needed
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
        this.tierHeating = 0;
        this.tierCooling = 0;
    }

    @Override
    public int getCurrentHeatingTier() {
        return this.tierHeating;
    }

    @Override
    public int getCurrentCoolingTier() {
        return this.tierCooling;
    }

    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        for (String[] aisle : StructurePlasmaCondenser.PLASMA_CONDENSER) {
            pattern.aisle(aisle);
        }

        pattern.where('G', selfPredicate())
                .where('A', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS))) // todo
                                                                                                                      // chromatic
                                                                                                                      // glass
                .where('B', PCCoilsCooling())
                .where('C',
                        states(SerendustryMetaBlocks.METAL_CASING
                                .getState(BlockMetalCasing.SerendustryMetalCasingType.NEUTRONIUM))
                                        .setMinGlobalLimited(1227)
                                        .or(autoAbilities(false, false, true, true, true, true, false))
                                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0)
                                                .setMinGlobalLimited(0)
                                                .setMaxGlobalLimited(2))
                                        .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(0)
                                                .setMaxGlobalLimited(1))
                                        .or(abilities(MultiblockAbility.INPUT_LASER).setPreviewCount(1)
                                                .setMaxGlobalLimited(1)))
                .where('D', PCCoilsHeating())
                .where('E',
                        states(SerendustryMetaBlocks.METAL_CASING
                                .getState(BlockMetalCasing.SerendustryMetalCasingType.CARBON)))
                .where('F', frames(SerendustryMaterials.DeepDarkSteel));

        return pattern.build();
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return SerendustryTextures.CASING_NEUTRONIUM;
    }

    private static final Supplier<TraceabilityPredicate> PC_COIL_HEATING_PREDICATE = () -> new TraceabilityPredicate(
            blockWorldState -> {
                IBlockState blockState = blockWorldState.getBlockState();
                if (SerendustryAPI.PC_COILS_HEATING.containsKey(blockState)) {
                    BlockPCCoilHeating.PCCoilHeatingType tier = SerendustryAPI.PC_COILS_HEATING.get(blockState);
                    Object casing = blockWorldState.getMatchContext().getOrPut("PCCoilHeatingTier", tier);

                    if (!casing.equals(tier)) {
                        blockWorldState.setError(
                                new PatternStringError("serendustry.machine.plasma_condenser.error.tier_coil.heating"));
                        return false;
                    }

                    blockWorldState.getMatchContext().getOrPut("VBlock", new LinkedList<>())
                            .add(blockWorldState.getPos());

                    return true;
                }

                return false;
            }, () -> SerendustryAPI.PC_COILS_HEATING.entrySet().stream()
                    .sorted(Comparator.comparingInt(entry -> entry.getValue().ordinal()))
                    .map(entry -> new BlockInfo(entry.getKey(), null))
                    .toArray(BlockInfo[]::new))
                            .addTooltips("serendustry.machine.plasma_condenser.error.tier_coil.heating");

    public static TraceabilityPredicate PCCoilsHeating() {
        return PC_COIL_HEATING_PREDICATE.get();
    }

    private static final Supplier<TraceabilityPredicate> PC_COIL_COOLING_PREDICATE = () -> new TraceabilityPredicate(
            blockWorldState -> {
                IBlockState blockState = blockWorldState.getBlockState();
                if (SerendustryAPI.PC_COILS_COOLING.containsKey(blockState)) {
                    BlockPCCoilCooling.PCCoilCoolingType tier = SerendustryAPI.PC_COILS_COOLING.get(blockState);
                    Object casing = blockWorldState.getMatchContext().getOrPut("PCCoilCoolingTier", tier);

                    if (!casing.equals(tier)) {
                        blockWorldState.setError(
                                new PatternStringError("serendustry.machine.plasma_condenser.error.tier_coil.cooling"));
                        return false;
                    }

                    blockWorldState.getMatchContext().getOrPut("VBlock", new LinkedList<>())
                            .add(blockWorldState.getPos());

                    return true;
                }

                return false;
            }, () -> SerendustryAPI.PC_COILS_COOLING.entrySet().stream()
                    .sorted(Comparator.comparingInt(entry -> entry.getValue().ordinal()))
                    .map(entry -> new BlockInfo(entry.getKey(), null))
                    .toArray(BlockInfo[]::new))
                            .addTooltips("serendustry.machine.plasma_condenser.error.tier_coil.cooling");

    public static TraceabilityPredicate PCCoilsCooling() {
        return PC_COIL_COOLING_PREDICATE.get();
    }

    @Override
    public boolean checkRecipe(@NotNull Recipe recipe, boolean consumeIfSuccess) {
        int recipeTier = recipe.getProperty(PlasmaCondenserTierProperty.getInstance(), 0);
        int recipeType = recipe.getProperty(PlasmaCondenserTypeProperty.getInstance(), -1);

        return recipeType == PlasmaCondenserTypeProperty.HEATING ? tierHeating >= recipeTier :
                tierCooling >= recipeTier;
    }

    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        MultiblockDisplayText.builder(textList, isStructureFormed())
                .setWorkingStatus(recipeMapWorkable.isWorkingEnabled(), recipeMapWorkable.isActive())
                .addEnergyUsageLine(getEnergyContainer())
                .addEnergyTierLine(GTUtility.getTierByVoltage(recipeMapWorkable.getMaxVoltage()))

                // Heating coil tier line
                .addCustom(tl -> {
                    if (isStructureFormed()) {
                        ITextComponent heatingCoilText = TextComponentUtil.stringWithColor(TextFormatting.RED,
                                TextFormattingUtil.formatNumbers(tierHeating + 1));

                        tl.add(TextComponentUtil.translationWithColor(TextFormatting.GRAY,
                                "serendustry.machine.plasma_condenser.tier_coil.heating", heatingCoilText));
                    }
                })

                // Cooling coil tier line
                .addCustom(tl -> {
                    if (isStructureFormed()) {
                        ITextComponent coolingCoilText = TextComponentUtil.stringWithColor(TextFormatting.BLUE,
                                TextFormattingUtil.formatNumbers(tierCooling + 1));

                        tl.add(TextComponentUtil.translationWithColor(TextFormatting.GRAY,
                                "serendustry.machine.plasma_condenser.tier_coil.cooling", coolingCoilText));
                    }
                })
                .addWorkingStatusLine()
                .addProgressLine(recipeMapWorkable.getProgressPercent());
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_LASER, true);
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return SerendustryTextures.OVERLAY_PLASMA_CONDENSER;
    }
}
