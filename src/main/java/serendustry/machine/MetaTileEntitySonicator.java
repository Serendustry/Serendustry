package serendustry.machine;

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

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

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
                        " AAAAAAAAA        "
                ).aisle(
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
                        " AAAAAAAAA        "
                ).aisle(
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
                        " AAAAAAAAA   AAAAA"
                ).aisle(
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
                        " AAAAAAAAA   AAAAA"
                ).aisle(
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
                        " AAAABAAAA   AABAA"
                ).aisle(
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
                        " AAABBBAAA   ABBBA"
                ).aisle(
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
                        " AAAABAAAA   AABAA"
                ).aisle(
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
                        " AAAAAAAAA   AAAAA"
                ).aisle(
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
                        " AAAAAAAAA   AAAAA"
                ).aisle(
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
                        " AAAAAAAAA        "
                )

                .where('E', selfPredicate())
                .where('A', states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.TUNGSTENSTEEL_ROBUST)) // todo
                        .setMinGlobalLimited(526).or(autoAbilities()))
                .where('B', states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.TITANIUM_STABLE)))
                .where('C', frames(Materials.NaquadahAlloy))
                .where('D', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS))) // todo
                .build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return Textures.ROBUST_TUNGSTENSTEEL_CASING; // todo
    }
}
