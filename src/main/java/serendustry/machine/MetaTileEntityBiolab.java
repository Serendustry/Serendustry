package serendustry.machine;

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

public class MetaTileEntityBiolab extends RecipeMapMultiblockController {

    public MetaTileEntityBiolab(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.BIOLAB_RECIPES);
    }

    @Override
    public MetaTileEntityBiolab createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityBiolab(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(LEFT, DOWN, FRONT)
                .aisle(
                        "AAAAAAAAAA",
                        "       AAA",
                        "       ACA",
                        "       AAA",
                        "AAAAAAAAAA"
                ).aisle(
                        "AAAAAAAAAA",
                        " AAAAAA  A",
                        " BBBBBA  B",
                        " AAAAAA  A",
                        "AAAAAAAAAA"
                ).aisle(
                        "AAAAAAAAAA",
                        " A       A",
                        " B       B",
                        " A       A",
                        "AAAAAAAAAA"
                ).aisle(
                        "AAAAAAAAAA",
                        " A      A ",
                        " B      B ",
                        " A      A ",
                        "AAAAAAAAAA"
                ).aisle(
                        "AAAAAAAAAA",
                        " AAAAAAAA ",
                        " BBBBBBBB ",
                        " AAAAAAAA ",
                        "AAAAAAAAAA"
                ).aisle(
                        "AAAAAAAAAA",
                        "          ",
                        "          ",
                        "          ",
                        "AAAAAAAAAA"
                )

                .where('C', selfPredicate())
                .where('A', states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.PTFE_INERT_CASING))
                        .setMinGlobalLimited(157).or(autoAbilities()))
                .where('B', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS)))
                .build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return Textures.INERT_PTFE_CASING; // todo
    }
}
