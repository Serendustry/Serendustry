package serendustry.machine;

import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.recipes.RecipeMaps;
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

public class MetaTileEntityYggdrasil extends RecipeMapMultiblockController {

    public MetaTileEntityYggdrasil(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.YGGDRASIL_RECIPES);
    }

    @Override
    public MetaTileEntityYggdrasil createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityYggdrasil(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#C#####C#", "#XXXXXXX#", "#C#####C#")
                .aisle("#XXXXXXX#", "#C#####C#", "#XXXXXXX#", "#XXXXXXX#", "YXXXSXXXY", "#XXXXXXX#", "#########", "#########", "#########")

                .where('S', selfPredicate())
                .where('X', states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.PTFE_INERT_CASING)).setMinGlobalLimited(530))
                .where('Y', states(getCasingState()).setMinGlobalLimited(1).or(autoAbilities(false, false, true, true, true, true, false))
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setMinGlobalLimited(0).setMaxGlobalLimited(2))
                        .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setMaxGlobalLimited(1))
                        .or(abilities(MultiblockAbility.INPUT_LASER).setMaxGlobalLimited(1)))
                .where('C', states(MetaBlocks.WIRE_COIL.getState(BlockWireCoil.CoilType.CUPRONICKEL)))
                .where('#', air())
                .build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return Textures.INERT_PTFE_CASING; // todo
    }

    // todo: add custom ??? Casings
    private IBlockState getCasingState() {
        return MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.UIV);
    }
}
