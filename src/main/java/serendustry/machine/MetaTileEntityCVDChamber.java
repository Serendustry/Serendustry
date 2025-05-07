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
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.machine.structure.StructureDefinition;

public class MetaTileEntityCVDChamber extends RecipeMapMultiblockController {

    public MetaTileEntityCVDChamber(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.CVD_RECIPES);
    }

    @Override
    public MetaTileEntityCVDChamber createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityCVDChamber(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        for (String[] aisle : StructureDefinition.CVD_CHAMBER) {
            pattern.aisle(aisle);
        }

        pattern.where('C', selfPredicate())
                .where('A',
                        states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN))
                                .setMinGlobalLimited(38).or(autoAbilities()))
                .where('B', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS)));

        return pattern.build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return Textures.CLEAN_STAINLESS_STEEL_CASING;
    }
}
