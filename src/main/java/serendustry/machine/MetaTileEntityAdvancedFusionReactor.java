package serendustry.machine;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.recipes.RecipeMaps;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.SValues;
import serendustry.blocks.SBlockActiveMultiCasing;
import serendustry.blocks.SBlockMultiCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.client.utils.STooltipHelper;
import serendustry.machine.structure.StructureDefinition;

public class MetaTileEntityAdvancedFusionReactor extends RecipeMapMultiblockController {

    public MetaTileEntityAdvancedFusionReactor(ResourceLocation rl) {
        super(rl, RecipeMaps.FUSION_RECIPES);
        this.recipeMapWorkable = new AdvancedFusionReactorWorkable(this);
    }

    @Override
    public MetaTileEntityAdvancedFusionReactor createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityAdvancedFusionReactor(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        for (String[] aisle : StructureDefinition.ADVANCED_FUSION_REACTOR) {
            pattern.aisle(aisle);
        }

        pattern.where('C', selfPredicate())
                .where('A',
                        states(SerendustryMetaBlocks.S_MULTI_CASING
                                .getState(SBlockMultiCasing.SMultiCasingType.ADV_FUSION))
                                        .setMinGlobalLimited(365).or(autoAbilities()))
                .where('B',
                        states(SerendustryMetaBlocks.S_ACTIVE_MULTI_CASING
                                .getState(SBlockActiveMultiCasing.SActiveMultiCasingType.ADV_FUSION_COIL)))
                .where('D', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)));

        return pattern.build();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        if (this.recipeMapWorkable.isActive()) {
            return SerendustryTextures.TEXTURE_ADV_FUSION_ACTIVE;
        } else {
            return SerendustryTextures.TEXTURE_ADV_FUSION;
        }
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return SerendustryTextures.OVERLAY_ADVANCED_FUSION_REACTOR;
    }
    // todo: big laser rendering

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_REGULAR, false);
    }

    protected class AdvancedFusionReactorWorkable extends MultiblockRecipeLogic {

        public AdvancedFusionReactorWorkable(RecipeMapMultiblockController tileEntity) {
            super(tileEntity);
        }

        @Override
        public int getParallelLimit() {
            return 32;
        }
    }
}
