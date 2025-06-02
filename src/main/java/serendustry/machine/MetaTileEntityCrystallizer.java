package serendustry.machine;

import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import serendustry.SValues;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.client.utils.STooltipHelper;
import serendustry.machine.structure.StructureDefinition;

import java.util.List;

public class MetaTileEntityCrystallizer extends RecipeMapMultiblockController {

    public MetaTileEntityCrystallizer(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.CRYSTALLIZER_RECIPES);
    }

    @Override
    public MetaTileEntityCrystallizer createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityCrystallizer(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(/* LEFT, DOWN, FRONT */);

        for (String[] aisle : StructureDefinition.CUBE) {
            pattern.aisle(aisle);
        }

        pattern.where('S', selfPredicate())
                .where('X', states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.PTFE_INERT_CASING))
                        .setMinGlobalLimited(1).or(autoAbilities()));

        return pattern.build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return SerendustryTextures.CASING_CARBON;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_REGULAR, false);
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return SerendustryTextures.OVERLAY_CRYSTALLIZER;
    }
}
