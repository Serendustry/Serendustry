package serendustry.machine;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.ResourceLocation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.capability.IEnergyContainer;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.unification.material.Materials;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.blocks.BlockSerendustryMetalCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;

public class MetaTileEntityHPLaserArray extends RecipeMapMultiblockController {

    public MetaTileEntityHPLaserArray(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.HP_LASER_ARRAY_RECIPES);
    }

    @Override
    public MetaTileEntityHPLaserArray createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityHPLaserArray(metaTileEntityId);
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);

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
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(LEFT, DOWN, FRONT)
                .aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "          A          ")
                .aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "          A          ",
                        "         AAA         ")
                .aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "          A          ",
                        "         AAA         ",
                        "        AAAAA        ")
                .aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "         AAA         ",
                        "        AAAAA        ",
                        "       AAAAAAA       ")
                .aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "         AAA         ",
                        "        AAAAA        ",
                        "       AAAAAAA       ",
                        "      AAAAAAAAA      ")
                .aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AFA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "       AAAAAAA       ",
                        "      AAAAAAAAA      ",
                        "     AAAAAAAAAAA     ")
                .aisle(
                        "                     ",
                        "                     ",
                        "         AAA         ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C E C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C A C        ",
                        "      AAAAAAAAA      ",
                        "     AAAAAAAAAAA     ",
                        "    AAAAAAAAAAAAA    ")
                .aisle(
                        "                     ",
                        "         AAA         ",
                        "        C B C        ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C  D  C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "     AAAAAAAAAAA     ",
                        "    AAAAAAAAAAAAA    ",
                        "   AAAAAAAAAAAAAAA   ")
                .aisle(
                        "                     ",
                        "        CAAAC        ",
                        "       C  B  C       ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C   D   C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C   A   C      ",
                        "    AAAAAAAAAAAAA    ",
                        "   AAAAAAAAAAAAAAA   ",
                        "  AAAAAAAAAAAAAAAAA  ")
                .aisle(
                        "         AAA         ",
                        "       AA B AA       ",
                        "      A   B   A      ",
                        "     A    A    A     ",
                        "     A    B    A     ",
                        "     A         A     ",
                        "     A         A     ",
                        "     A         A     ",
                        "     A         A     ",
                        "     A    D    A     ",
                        "     A         A     ",
                        "     A         A     ",
                        "     A         A     ",
                        "     A         A     ",
                        "     A    B    A     ",
                        "     A    A    A     ",
                        "    AA   AAA   AA    ",
                        "   AAAAAAAAAAAAAAA   ",
                        "  AAAAAAAAAAAAAAAAA  ",
                        " AAAAAAAAAAAAAAAAAAA ")
                .aisle(
                        "         AAA         ",
                        "       AABABAA       ",
                        "      ABBBABBBA      ",
                        "     AB  AAA  BA     ",
                        "     AB  BAB  BA     ",
                        "     AB   E   BA     ",
                        "     AB   D   BA     ",
                        "     AB   D   BA     ",
                        "     AB   D   BA     ",
                        "     AEDDDDDDDEA     ",
                        "     AB   D   BA     ",
                        "     AB   D   BA     ",
                        "     AB   D   BA     ",
                        "     AB   E   BA     ",
                        "     AB  BAB  BA     ",
                        "     AB  AAA  BA     ",
                        "    AAA AAAAA AAA    ",
                        "  AAAAAAAAAAAAAAAAA  ",
                        " AAAAAAAAAAAAAAAAAAA ",
                        "AAAAAAAAAAAAAAAAAAAAA")
                .aisle(
                        "         AAA         ",
                        "       AA B AA       ",
                        "      A   B   A      ",
                        "     A    AB   A     ",
                        "     A    B    A     ",
                        "     A         A     ",
                        "     A         A     ",
                        "     A         A     ",
                        "     A         A     ",
                        "     A    D    A     ",
                        "     A         A     ",
                        "     A         A     ",
                        "     A         A     ",
                        "     A         A     ",
                        "     A    B    A     ",
                        "     A    A    A     ",
                        "    AA   AAA   AA    ",
                        "   AAAAAAAAAAAAAAA   ",
                        "  AAAAAAAAAAAAAAAAA  ",
                        " AAAAAAAAAAAAAAAAAAA ")
                .aisle(
                        "                     ",
                        "        CAAAC        ",
                        "       C  B  C       ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C   D   C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C       C      ",
                        "      C   A   C      ",
                        "    AAAAAAAAAAAAA    ",
                        "   AAAAAAAAAAAAAAA   ",
                        "  AAAAAAAAAAAAAAAAA  ")
                .aisle(
                        "                     ",
                        "         AAA         ",
                        "        C B C        ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C  D  C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "       C     C       ",
                        "     AAAAAAAAAAA     ",
                        "    AAAAAAAAAAAAA    ",
                        "   AAAAAAAAAAAAAAA   ")
                .aisle(
                        "                     ",
                        "                     ",
                        "         AAA         ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C E C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C B C        ",
                        "        C A C        ",
                        "      AAAAAAAAA      ",
                        "     AAAAAAAAAAA     ",
                        "    AAAAAAAAAAAAA    ")
                .aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "         AAA         ",
                        "       AAAAAAA       ",
                        "      AAAAAAAAA      ",
                        "     AAAAAAAAAAA     ")
                .aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "         AAA         ",
                        "        AAAAA        ",
                        "       AAAAAAA       ",
                        "      AAAAAAAAA      ")
                .aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "         AAA         ",
                        "        AAAAA        ",
                        "       AAAAAAA       ")
                .aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "          A          ",
                        "         AAA         ",
                        "        AAAAA        ")
                .aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "          A          ",
                        "         AAA         ")
                .aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "          A          ")

                .where('F', selfPredicate())
                .where('A',
                        states(SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING
                                .getState(BlockSerendustryMetalCasing.SerendustryMetalCasingType.AMERICIUM))
                                        .setMinGlobalLimited(794)
                                        .or(autoAbilities(false, false, true, true, true, true, false))
                                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0)
                                                .setMinGlobalLimited(0).setMaxGlobalLimited(2))
                                        .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(1)
                                                .setMaxGlobalLimited(1)))
                .where('B', frames(Materials.Neutronium))
                .where('C', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS))) // todo
                .where('D', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)))
                .where('E',
                        states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.TUNGSTENSTEEL_ROBUST))) // todo:
                                                                                                                         // use
                                                                                                                         // laser
                                                                                                                         // sources
                                                                                                                         // (tiered)
                .build();
    }

    // todo: big laser rendering

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return SerendustryTextures.CASING_AMERICIUM; // todo
    }
}
