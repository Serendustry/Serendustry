package serendustry.machine;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

import net.minecraft.util.ResourceLocation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.unification.material.Materials;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.blocks.BlockSerendustryMetalCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;

public class MetaTileEntitySonicator extends RecipeMapMultiblockController {

    public MetaTileEntitySonicator(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.SONICATOR_RECIPES);
    }

    @Override
    public MetaTileEntitySonicator createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntitySonicator(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(LEFT, DOWN, FRONT)
                .aisle(
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        " AAAAAAAAA        ",
                        " AADDDDDAA        ",
                        " AADDDDDAA        ",
                        " AADDDDDAA        ",
                        " AADDDDDAA        ",
                        " AADDDDDAA        ",
                        " AADDDDDAA        ",
                        " AAAAAAAAA        ",
                        " AAAAAAAAA        ")
                .aisle(
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        " AAAAAAAAA        ",
                        "A         A       ",
                        "A         A       ",
                        "A         A       ",
                        "A         A       ",
                        "A         A       ",
                        "A         A       ",
                        "A         A       ",
                        "A         A       ",
                        " AAAAAAAAA        ")
                .aisle(
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        " AAAAAAAAA        ",
                        "A         A       ",
                        "A         A       ",
                        "A         A       ",
                        "A         A       ",
                        "A         A  AAAAA",
                        "A         A  AAAAA",
                        "A         A  ADEDA",
                        "A         A  AAAAA",
                        " AAAAAAAAA   AAAAA")
                .aisle(
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        " AAAAAAAAA        ",
                        "A         A       ",
                        "A         A       ",
                        "A         A       ",
                        "A         A  AAAAA",
                        "A         A  A   A",
                        "A         A  A   A",
                        "A         A  A   A",
                        "A         A  A   A",
                        " AAAAAAAAA   AAAAA")
                .aisle(
                        "                  ",
                        "     CCCCCCCCCCC  ",
                        "     C         C  ",
                        "     C         C  ",
                        "     C         C  ",
                        " AAAACAAAA     C  ",
                        "A    C    A    C  ",
                        "A    C    A    C  ",
                        "A    C    A    C  ",
                        "A    C    A  AAAAA",
                        "A    C    A  A C A",
                        "A    C    A  A C A",
                        "A    C    A  A C A",
                        "A    C    A  A C A",
                        " AAAABAAAA   AABAA")
                .aisle(
                        "     CCCCCCCCCCC  ",
                        "    CBBBBBBBBBBBC ",
                        "    CBCCCCCCCCCBC ",
                        "    CBC       CBC ",
                        "    CBC       CBC ",
                        " AAACBCAAA    CBC ",
                        "A   CBC   A   CBC ",
                        "A   CBC   A   CBC ",
                        "A   CBC   A   CBC ",
                        "A   CBC   A  AABAA",
                        "A   CBC   A  ACBCA",
                        "A   CBC   A  ACBCA",
                        "A   CBC   A  ACBCA",
                        "A   CBC   A  ACBCA",
                        " AAABBBAAA   ABBBA")
                .aisle(
                        "                  ",
                        "     CCCCCCCCCCC  ",
                        "     C         C  ",
                        "     C         C  ",
                        "     C         C  ",
                        " AAAACAAAA     C  ",
                        "A    C    A    C  ",
                        "A    C    A    C  ",
                        "A    C    A    C  ",
                        "A    C    A  AAAAA",
                        "A    C    A  A C A",
                        "A    C    A  A C A",
                        "A    C    A  A C A",
                        "A    C    A  A C A",
                        " AAAABAAAA   AABAA")
                .aisle(
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        " AAAAAAAAA        ",
                        "A         A       ",
                        "A         A       ",
                        "A         A       ",
                        "A         A  AAAAA",
                        "A         A  A   A",
                        "A         A  A   A",
                        "A         A  A   A",
                        "A         A  A   A",
                        " AAAAAAAAA   AAAAA")
                .aisle(
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        " AAAAAAAAA        ",
                        "A         A       ",
                        "A         A       ",
                        "A         A       ",
                        "A         A  AAAAA",
                        "A         A  AAAAA",
                        "A         A  AAAAA",
                        "A         A  AAAAA",
                        "A         A  AAAAA",
                        " AAAAAAAAA   AAAAA")
                .aisle(
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        "                  ",
                        " AAAAAAAAA        ",
                        " AAAAAAAAA        ",
                        " AAAAAAAAA        ",
                        " AAAAAAAAA        ",
                        " AAAAAAAAA        ",
                        " AAAAAAAAA        ",
                        " AAAAAAAAA        ",
                        " AAAAAAAAA        ",
                        " AAAAAAAAA        ",
                        " AAAAAAAAA        ")

                .where('E', selfPredicate())
                .where('A',
                        states(SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING
                                .getState(BlockSerendustryMetalCasing.SerendustryMetalCasingType.CARBON))
                                        .setMinGlobalLimited(526).or(autoAbilities()))
                .where('B',
                        states(SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING
                                .getState(BlockSerendustryMetalCasing.SerendustryMetalCasingType.ADAMANTIUM)))
                .where('C', frames(Materials.NaquadahAlloy))
                .where('D', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS))) // todo
                .build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return SerendustryTextures.CASING_ADAMANTIUM;
    }
}
