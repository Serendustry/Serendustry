package serendustry.machine;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.capability.IEnergyContainer;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.pattern.PatternStringError;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.unification.material.Materials;
import gregtech.api.util.BlockInfo;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.core.sound.GTSoundEvents;
import serendustry.SValues;
import serendustry.api.SerendustryAPI;
import serendustry.blocks.BlockEICHammerCasing;
import serendustry.blocks.IEICHammerBlockStats;
import serendustry.blocks.SBlockMetalCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.client.utils.STooltipHelper;
import serendustry.machine.structure.StructureDefinition;

public class MetaTileEntityElectricImplosionCompressor extends RecipeMapMultiblockController {

    private static final int[] TIER_PARALLEL = { 16, 64, 256 };
    private int tier;

    public MetaTileEntityElectricImplosionCompressor(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES);
        this.recipeMapWorkable = new MetaTileEntityElectricImplosionCompressor.ElectricImplosionCompressorWorkable(
                this);
    }

    @Override
    public MetaTileEntityElectricImplosionCompressor createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityElectricImplosionCompressor(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);

        Object type = context.get("EICHammerTier");
        if (type instanceof IEICHammerBlockStats) {
            this.tier = ((IEICHammerBlockStats) type).getHammerTier();
        } else
            this.tier = -1;

        List<IEnergyContainer> energyInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
        List<IEnergyContainer> substationInput = new ArrayList<>(
                getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));

        if (!energyInput.isEmpty() && !substationInput.isEmpty()) {
            invalidateStructure();
        }

        // todo: give error message to multiblock builder and make JEI not show mixed hatches

        /*
         * List<IEnergyContainer> powerInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
         * powerInput.addAll(getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));
         * 
         * this.powerInput = new EnergyContainerList(powerInput);
         */  // todo: update ceu so this works and check if this even needed
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        for (String[] aisle : StructureDefinition.ELECTRIC_IMPLOSION_COMPRESSOR) {
            pattern.aisle(aisle);
        }

        pattern.where('E', selfPredicate())
                .where('A',
                        states(SerendustryMetaBlocks.S_METAL_CASING
                                .getState(SBlockMetalCasing.SMetalCasingType.ADAMANTIUM))
                                        .setMinGlobalLimited(401)
                                        .or(autoAbilities(false, false, true, true, true, true, false))
                                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0)
                                                .setMinGlobalLimited(0).setMaxGlobalLimited(2))
                                        .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(1)
                                                .setMaxGlobalLimited(1)))
                .where('B', frames(Materials.NaquadahAlloy))
                .where('C', EICHammerCasings()) // 116
                .where('D', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS))); // todo

        return pattern.build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return SerendustryTextures.CASING_ADAMANTIUM;
    }

    @Override
    public SoundEvent getBreakdownSound() {
        return GTSoundEvents.BREAKDOWN_MECHANICAL;
    }

    private static final Supplier<TraceabilityPredicate> EIC_PREDICATE = () -> new TraceabilityPredicate(
            blockWorldState -> {
                IBlockState blockState = blockWorldState.getBlockState();
                if (SerendustryAPI.EIC_HAMMER_CASINGS.containsKey(blockState)) {
                    BlockEICHammerCasing.EICHammerCasingType tier = SerendustryAPI.EIC_HAMMER_CASINGS.get(blockState);
                    Object casing = blockWorldState.getMatchContext().getOrPut("EICHammerTier", tier);

                    if (!casing.equals(tier)) {
                        blockWorldState.setError(
                                new PatternStringError("serendustry.machine.electric_implosion_compressor.tier"));
                        return false;
                    }

                    blockWorldState.getMatchContext().getOrPut("VBlock", new LinkedList<>())
                            .add(blockWorldState.getPos());

                    return true;
                }

                return false;
            }, () -> SerendustryAPI.EIC_HAMMER_CASINGS.entrySet().stream()
                    .sorted(Comparator.comparingInt(entry -> entry.getValue().ordinal()))
                    .map(entry -> new BlockInfo(entry.getKey(), null))
                    .toArray(BlockInfo[]::new))
                            .addTooltips("serendustry.machine.electric_implosion_compressor.tier");

    public static TraceabilityPredicate EICHammerCasings() {
        return EIC_PREDICATE.get();
    }

    protected class ElectricImplosionCompressorWorkable extends MultiblockRecipeLogic {

        public ElectricImplosionCompressorWorkable(RecipeMapMultiblockController tileEntity) {
            super(tileEntity);
        }

        @Override
        public int getParallelLimit() {
            return TIER_PARALLEL[tier];
        }
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_SUBSTATION, false);
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return SerendustryTextures.OVERLAY_ELECTRIC_IMPLOSION_COMPRESSOR;
    }

    /*
     * @Override
     * public List<MultiblockShapeInfo> getMatchingShapes() {
     * ArrayList<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
     * MultiblockShapeInfo.Builder builder = MultiblockShapeInfo.builder(/*RIGHT, DOWN, FRONT
     *//*
        * )
        * 
        * for (String[] aisle : StructureDefinition.ELECTRIC_IMPLOSION_COMPRESSOR) {
        * builder.aisle(aisle);
        * }
        * builder.where('X', MetaBlocks.S_METAL_CASING.getState(BlockMetalCasing.MetalCasingType.INVAR_HEATPROOF))
        * .where('S', MetaTileEntities.ELECTRIC_BLAST_FURNACE, EnumFacing.SOUTH)
        * .where('#', Blocks.AIR.getDefaultState())
        * .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.LV], EnumFacing.NORTH)
        * .where('I', MetaTileEntities.ITEM_IMPORT_BUS[GTValues.LV], EnumFacing.SOUTH)
        * .where('O', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.LV], EnumFacing.SOUTH)
        * .where('F', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.LV], EnumFacing.WEST)
        * .where('D', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.LV], EnumFacing.EAST)
        * .where('H', MetaTileEntities.MUFFLER_HATCH[GTValues.LV], EnumFacing.UP)
        * .where('M', () -> ConfigHolder.machines.enableMaintenance ? MetaTileEntities.MAINTENANCE_HATCH :
        * MetaBlocks.S_METAL_CASING.getState(BlockMetalCasing.MetalCasingType.INVAR_HEATPROOF), EnumFacing.NORTH);
        * GregTechAPI.HEATING_COILS.entrySet().stream()
        * .sorted(Comparator.comparingInt(entry -> entry.getValue().getTier()))
        * .forEach(entry -> shapeInfo.add(builder.where('C', entry.getKey()).build()));
        * return shapeInfo;
        * }
        */
}
