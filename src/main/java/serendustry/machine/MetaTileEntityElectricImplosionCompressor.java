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
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

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
import serendustry.api.SerendustryAPI;
import serendustry.blocks.BlockEICHammerCasing;
import serendustry.blocks.BlockSerendustryMetalCasing;
import serendustry.blocks.IEICHammerBlockStats;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;

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
        return FactoryBlockPattern.start(LEFT, DOWN, FRONT)
                .aisle(
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "      AAA      ")
                .aisle(
                        "               ",
                        "               ",
                        "               ",
                        "       A       ",
                        "       A       ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DED      ",
                        "      DAD      ",
                        "      AAA      ",
                        "     AAAAA     ")
                .aisle(
                        "               ",
                        "               ",
                        "       A       ",
                        "       B       ",
                        "      DAD      ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     AAAAA     ",
                        "    AAAAAAA    ")
                .aisle(
                        "               ",
                        "               ",
                        "       A       ",
                        "       B       ",
                        "     DBABD     ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    AAAAAAA    ",
                        "   AAAAAAAAA   ")
                .aisle(
                        "               ",
                        "               ",
                        "       A       ",
                        "     DBBBD     ",
                        "    D  A  D    ",
                        "   D       D   ",
                        "   D       D   ",
                        "   D       D   ",
                        "   D  CCC  D   ",
                        "   D       D   ",
                        "   D       D   ",
                        "   D       D   ",
                        "   D       D   ",
                        "   D  CCC  D   ",
                        "   D  AAA  D   ",
                        "   AAAAAAAAA   ",
                        "  AAAAAAAAAAA  ")
                .aisle(
                        "               ",
                        "               ",
                        "     BBABB     ",
                        "    D  A  D    ",
                        "   D   A   D   ",
                        "  B    A    B  ",
                        "  B    A    B  ",
                        "  B    A    B  ",
                        "  B  CCCCC  B  ",
                        "  B   CCC   B  ",
                        "  B         B  ",
                        "  B         B  ",
                        "  B   CCC   B  ",
                        "  B  CCCCC  B  ",
                        "  B  AAAAA  B  ",
                        "  AAAAAAAAAAA  ",
                        " AAAAAAAAAAAAA ")
                .aisle(
                        "       B       ",
                        "      BAB      ",
                        "     BAAAB     ",
                        "    B  BB B    ",
                        "  DB   A   BD  ",
                        " D     B     D ",
                        " D     A     D ",
                        " D     B     D ",
                        " D  CCCCCCC  D ",
                        " D   CCCCC   D ",
                        " D           D ",
                        " D           D ",
                        " D   CCCCC   D ",
                        " D  CCCCCCC  D ",
                        " D  AAAAAAA  D ",
                        " AAAAAAAAAAAAA ",
                        "AAAAAAAAAAAAAAA")
                .aisle(
                        "      BAB      ",
                        "      AAA      ",
                        "  AAAAAAAAAAA  ",
                        " ABBBABABABBBA ",
                        " AAAAAAAAAAAAA ",
                        " A   ABABA   A ",
                        " A   AAAAA   A ",
                        " A   ABABA   A ",
                        " A  CCCCCCC  A ",
                        " A   CCCCC   A ",
                        " AA          A ",
                        " A           A ",
                        " A   CCCCC   A ",
                        " A  CCCCCCC  A ",
                        " A  AAAAAAA  A ",
                        " AAAAAAAAAAAAA ",
                        "AAAAAAAAAAAAAAA")
                .aisle(
                        "       B       ",
                        "      BAB      ",
                        "     BAAAB     ",
                        "    B BBB B    ",
                        "  DB   A   BD  ",
                        " D     B     D ",
                        " D     A     D ",
                        " D     B     D ",
                        " D  CCCCCCC  D ",
                        " D   CCCCC   D ",
                        " D           D ",
                        " D           D ",
                        " D   CCCCC   D ",
                        " D  CCCCCCC  D ",
                        " D  AAAAAAA  D ",
                        " AAAAAAAAAAAAA ",
                        "AAAAAAAAAAAAAAA")
                .aisle(
                        "               ",
                        "               ",
                        "     BBABB     ",
                        "    D  A  D    ",
                        "   D   A   D   ",
                        "  B    A    B  ",
                        "  B    A    B  ",
                        "  B    A    B  ",
                        "  B  CCCCC  B  ",
                        "  B   CCC   B  ",
                        "  B         B  ",
                        "  B         B  ",
                        "  B   CCC   B  ",
                        "  B  CCCCC  B  ",
                        "  B  AAAAA  B  ",
                        "  AAAAAAAAAAA  ",
                        " AAAAAAAAAAAAA ")
                .aisle(
                        "               ",
                        "               ",
                        "       A       ",
                        "     DBBBD     ",
                        "    D  A  D    ",
                        "   D       D   ",
                        "   D       D   ",
                        "   D       D   ",
                        "   D  CCC  D   ",
                        "   D       D   ",
                        "   D       D   ",
                        "   D       D   ",
                        "   D       D   ",
                        "   D  CCC  D   ",
                        "   D  AAA  D   ",
                        "   AAAAAAAAA   ",
                        "  AAAAAAAAAAA  ")
                .aisle(
                        "               ",
                        "               ",
                        "       A       ",
                        "       B       ",
                        "     DBABD     ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    D     D    ",
                        "    AAAAAAA    ",
                        "   AAAAAAAAA   ")
                .aisle(
                        "               ",
                        "               ",
                        "       A       ",
                        "       B       ",
                        "      DAD      ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     B   B     ",
                        "     AAAAA     ",
                        "    AAAAAAA    ")
                .aisle(
                        "               ",
                        "               ",
                        "               ",
                        "       A       ",
                        "       A       ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      DAD      ",
                        "      AAA      ",
                        "     AAAAA     ")
                .aisle(
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "      AAA      ")
                .where('E', selfPredicate())
                .where('A',
                        states(SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING
                                .getState(BlockSerendustryMetalCasing.SerendustryMetalCasingType.ADAMANTIUM))
                                        .setMinGlobalLimited(401)
                                        .or(autoAbilities(false, false, true, true, true, true, false))
                                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0)
                                                .setMinGlobalLimited(0).setMaxGlobalLimited(2))
                                        .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(1)
                                                .setMaxGlobalLimited(1)))
                .where('B', frames(Materials.NaquadahAlloy))
                .where('C', EICHammerCasings()) // 116
                .where('D', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS))) // todo
                .build();
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
            // logger.info("eic tier: " + tier);
            // logger.info("eic parallel: " + new int[]{16, 64, 256}[tier]);
            return TIER_PARALLEL[tier];
        }
    }
}
