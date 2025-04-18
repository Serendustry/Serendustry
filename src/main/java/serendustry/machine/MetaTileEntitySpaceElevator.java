package serendustry.machine;

import gregtech.api.metatileentity.multiblock.MultiblockAbility;
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

public class MetaTileEntitySpaceElevator extends RecipeMapMultiblockController {

    public MetaTileEntitySpaceElevator(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.SPACE_ELEVATOR_RECIPES);
    }

    @Override
    public MetaTileEntitySpaceElevator createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntitySpaceElevator(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX")
                .aisle("XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX")
                .aisle("XXX", "XXX", "XXX", "XXX", "XSX", "XXX", "XXX", "XXX", "XXX")
                .where('S', selfPredicate())
                .where('X', states(getCasingState()).setMinGlobalLimited(40).or(autoAbilities(false, false, true, true, true, true, false))
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setMinGlobalLimited(0).setMaxGlobalLimited(2))
                        .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setMaxGlobalLimited(1)))
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
