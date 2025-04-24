package serendustry.machine;

import gregtech.api.GTValues;
import gregtech.api.capability.IEnergyContainer;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.unification.material.Materials;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.BlockWireCoil;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.item.material.SerendustryMaterials;

import java.util.ArrayList;
import java.util.List;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;
import static gregtech.common.metatileentities.MetaTileEntities.LASER_OUTPUT_HATCH_256;

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
        List<IEnergyContainer> substationInput = new ArrayList<>(getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));

        if(!energyInput.isEmpty() && !substationInput.isEmpty()) {
            invalidateStructure();
        }

        // todo: give error message to multiblock builder and make JEI not show mixed hatches

        /*List<IEnergyContainer> powerInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
        powerInput.addAll(getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));

        this.powerInput = new EnergyContainerList(powerInput);*/  // todo: update ceu so this works and check if this even needed
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
                        "                     ",
                        "                     ",
                        "          A          "
                ).aisle(
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
                        "                     ",
                        "          A          ",
                        "         AAA         "
                ).aisle(
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
                        "          A          ",
                        "         AAA         ",
                        "        AAAAA        "
                ).aisle(
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
                        "         AAA         ",
                        "        AAAAA        ",
                        "       AAAAAAA       "
                ).aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "                     ",
                        "          B          ",
                        "          A          ",
                        "        AAAAA        ",
                        "       AAAAAAA       ",
                        "      AAAAAAAAA      "
                ).aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "          B          ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BFB         ",
                        "         BAB         ",
                        "         AAA         ",
                        "       AAAAAAA       ",
                        "      AAAAAAAAA      ",
                        "     AAAAAAAAAAA     "
                ).aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "          B          ",
                        "         BAB         ",
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
                        "    AAAAAAAAAAAAA    "
                ).aisle(
                        "                     ",
                        "                     ",
                        "          B          ",
                        "         BAB         ",
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
                        "   AAAAAAAAAAAAAAA   "
                ).aisle(
                        "                     ",
                        "                     ",
                        "          B          ",
                        "        CBABC        ",
                        "       C  B  C       ",
                        "      C   B   C      ",
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
                        "  AAAAAAAAAAAAAAAAA  "
                ).aisle(
                        "                     ",
                        "          B          ",
                        "         BAB         ",
                        "       BB B BB       ",
                        "      B   B   B      ",
                        "     B   BAB   B     ",
                        "     B    B    B     ",
                        "     B         B     ",
                        "     B         B     ",
                        "     B         B     ",
                        "     B         B     ",
                        "     B    D    B     ",
                        "     B         B     ",
                        "     B         B     ",
                        "     B         B     ",
                        "     B         B     ",
                        "     B    B    B     ",
                        "     B    A    B     ",
                        "     A   AAA   A     ",
                        "   AAAAAAAAAAAAAAA   ",
                        "  AAAAAAAAAAAAAAAAA  ",
                        " AAAAAAAAAAAAAAAAAAA "
                ).aisle(
                        "                     ",
                        "         BAB         ",
                        "       BBAAABB       ",
                        "      BAABABAAB      ",
                        "     BABBBABBBAB     ",
                        "    BAB BAAAB BAB    ",
                        "    BAB  BAB  BAB    ",
                        "    BAB   E   BAB    ",
                        "    BAB   D   BAB    ",
                        "    BAB   D   BAB    ",
                        "    BAB   D   BAB    ",
                        "    BAEDDDDDDDEAB    ",
                        "    BAB   D   BAB    ",
                        "    BAB   D   BAB    ",
                        "    BAB   D   BAB    ",
                        "    BAB   E   BAB    ",
                        "    BAB  BAB  BAB    ",
                        "    BAB  AAA  BAB    ",
                        "    AAA AAAAA AAA    ",
                        "  AAAAAAAAAAAAAAAAA  ",
                        " AAAAAAAAAAAAAAAAAAA ",
                        "AAAAAAAAAAAAAAAAAAAAA"
                ).aisle(
                        "                     ",
                        "          B          ",
                        "         BAB         ",
                        "       BB BCBB       ",
                        "      B   B   B      ",
                        "     B   BAB   B     ",
                        "     B    B    B     ",
                        "     B         B     ",
                        "     B         B     ",
                        "     B         B     ",
                        "     B         B     ",
                        "     B    D    B     ",
                        "     B         B     ",
                        "     B         B     ",
                        "     B         B     ",
                        "     B         B     ",
                        "     B    B    B     ",
                        "     B    A    B     ",
                        "     A   AAA   A     ",
                        "   AAAAAAAAAAAAAAA   ",
                        "  AAAAAAAAAAAAAAAAA  ",
                        " AAAAAAAAAAAAAAAAAAA "
                ).aisle(
                        "                     ",
                        "                     ",
                        "          B          ",
                        "        CBABC        ",
                        "       C  B  C       ",
                        "      C   B   C      ",
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
                        "  AAAAAAAAAAAAAAAAA  "
                ).aisle(
                        "                     ",
                        "                     ",
                        "          B          ",
                        "         BAB         ",
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
                        "   AAAAAAAAAAAAAAA   "
                ).aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "          B          ",
                        "         BAB         ",
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
                        "    AAAAAAAAAAAAA    "
                ).aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "          B          ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         BAB         ",
                        "         AAA         ",
                        "       AAAAAAA       ",
                        "      AAAAAAAAA      ",
                        "     AAAAAAAAAAA     "
                ).aisle(
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "                     ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          B          ",
                        "          A          ",
                        "        AAAAA        ",
                        "       AAAAAAA       ",
                        "      AAAAAAAAA      "
                ).aisle(
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
                        "         AAA         ",
                        "        AAAAA        ",
                        "       AAAAAAA       "
                ).aisle(
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
                        "          A          ",
                        "         AAA         ",
                        "        AAAAA        "
                ).aisle(
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
                        "                     ",
                        "          A          ",
                        "         AAA         "
                ).aisle(
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
                        "                     ",
                        "                     ",
                        "          A          "
                )

                .where('F', selfPredicate())
                .where('A', states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.TITANIUM_STABLE)) // todo
                        .setMinGlobalLimited(650).or(autoAbilities(false, false, true, true, true, true, false))
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0).setMinGlobalLimited(0).setMaxGlobalLimited(2))
                        .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(1).setMaxGlobalLimited(1)))
                .where('B', frames(Materials.NaquadahAlloy))
                .where('C', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS))) // todo
                .where('D', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)))
                .where('E', states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.TUNGSTENSTEEL_ROBUST))) // todo: use laser sources (tiered)
                .build();
    }

    // todo: big laser rendering

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return Textures.STABLE_TITANIUM_CASING; // todo
    }
}
