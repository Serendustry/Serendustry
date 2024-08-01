package serendustry.machine;

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

public class MetaTileEntityPlasmaFoundry extends RecipeMapMultiblockController {

    public MetaTileEntityPlasmaFoundry(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.PLASMA_FOUNDRY_RECIPES);
    }

    @Override
    public MetaTileEntityPlasmaFoundry createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityPlasmaFoundry(metaTileEntityId);
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX")
                .aisle("XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX")
                .aisle("XXX", "XXX", "XXX", "XXX", "XSX", "XXX", "XXX", "XXX", "XXX")
                .where('S', selfPredicate())
                .where('X', states(getCasingState()).setMinGlobalLimited(40).or(autoAbilities()))
                .build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return Textures.INERT_PTFE_CASING; // todo
    }

    // todo: add custom ??? Casing
    private IBlockState getCasingState() {
        return MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.UV);
    }
}
