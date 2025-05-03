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
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.blocks.BlockSerendustryMetalCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.item.material.SerendustryMaterials;

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
                        "AAAAAAAAAAAA")
                .aisle(
                        "B          B",
                        " AAAAAAAAAA ",
                        " ACCCCCCAAA ",
                        " ACCCCCCAAA ",
                        " ACCCCCCADA ",
                        " ACCCCCCAAA ",
                        " AAAAAAAAAA ",
                        "AAAAAAAAAAAA")
                .aisle(
                        "B          B",
                        " AAAAAAAAAA ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " AAAAAAAAAA ",
                        "AAAAAAAAAAAA")
                .aisle(
                        "B          B",
                        " AAAAAAAAAA ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " AAAAAAAAAA ",
                        "AAAAAAAAAAAA")
                .aisle(
                        "B          B",
                        " AAAAAAAAAA ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " AAAAAAAAAA ",
                        "AAAAAAAAAAAA")
                .aisle(
                        "B          B",
                        " AAAAAAAAAA ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " C        C ",
                        " AAAAAAAAAA ",
                        "AAAAAAAAAAAA")
                .aisle(
                        "B          B",
                        " AAAAAAAAAA ",
                        " AAAAAAAAAA ",
                        " AAAAAAAAAA ",
                        " AAAAAAAAAA ",
                        " AAAAAAAAAA ",
                        " AAAAAAAAAA ",
                        "AAAAAAAAAAAA")
                .aisle(
                        "BBBBBBBBBBBB",
                        "B          B",
                        "B          B",
                        "B          B",
                        "B          B",
                        "B          B",
                        "A          A",
                        "AAAAAAAAAAAA")

                .where('D', selfPredicate())
                .where('A',
                        states(SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING
                                .getState(BlockSerendustryMetalCasing.SerendustryMetalCasingType.CARBON))
                                        .setMinGlobalLimited(262).or(autoAbilities()))
                .where('B', frames(SerendustryMaterials.Adamantium))
                .where('C', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS))) // todo
                .build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return SerendustryTextures.CASING_CARBON; // todo
    }
}
