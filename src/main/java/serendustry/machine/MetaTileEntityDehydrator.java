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
import serendustry.item.material.SerendustryMaterials;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

public class MetaTileEntityDehydrator extends RecipeMapMultiblockController {

    public MetaTileEntityDehydrator(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.DEHYDRATOR_RECIPES);
    }

    @Override
    public MetaTileEntityDehydrator createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityDehydrator(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(LEFT, DOWN, FRONT)
                .aisle(
                        "BBBBBBBBBBBB",
                        "B          B",
                        "B          B",
                        "B          B",
                        "B          B",
                        "B          B",
                        "A          A",
                        "AAAAAAAAAAAA"
                ).aisle(
                        "B          B",
                        " AAAAAAAAAA ",
                        " ACCCCCCAAA ",
                        " ACCCCCCAAA ",
                        " ACCCCCCADA ",
                        " ACCCCCCAAA ",
                        " AAAAAAAAAA ",
                        "AAAAAAAAAAAA"
                ).aisle(
                        "B          B",
                        " AAAAAAAAAA ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " AAAAAAAAAA ",
                        "AAAAAAAAAAAA"
                ).aisle(
                        "B          B",
                        " AAAAAAAAAA ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " AAAAAAAAAA ",
                        "AAAAAAAAAAAA"
                ).aisle(
                        "B          B",
                        " AAAAAAAAAA ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " AAAAAAAAAA ",
                        "AAAAAAAAAAAA"
                ).aisle(
                        "B          B",
                        " AAAAAAAAAA ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " AAAAAAAAAA ",
                        "AAAAAAAAAAAA"
                ).aisle(
                        "B          B",
                        " AAAAAAAAAA ",
                        " AAAAAAAAAA ",
                        " AAAAAAAAAA ",
                        " AAAAAAAAAA ",
                        " AAAAAAAAAA ",
                        " AAAAAAAAAA ",
                        "AAAAAAAAAAAA"
                ).aisle(
                        "BBBBBBBBBBBB",
                        "B          B",
                        "B          B",
                        "B          B",
                        "B          B",
                        "B          B",
                        "A          A",
                        "AAAAAAAAAAAA"
                )

                .where('D', selfPredicate())
                .where('A', states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.TUNGSTENSTEEL_ROBUST)) // todo
                        .setMinGlobalLimited(262).or(autoAbilities()))
                .where('B', frames(SerendustryMaterials.Adamantium))
                .where('C', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS))) // todo
                .build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return Textures.ROBUST_TUNGSTENSTEEL_CASING; // todo
    }
}
