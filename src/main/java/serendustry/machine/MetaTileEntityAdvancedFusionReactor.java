package serendustry.machine;

import static gregtech.api.util.RelativeDirection.*;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.recipes.RecipeMaps;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.*;
import serendustry.blocks.BlockSerendustryMultiCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
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

        for(String[] aisle : StructureDefinition.ADVANCED_FUSION_REACTOR) {
            pattern.aisle(aisle);
        }

        pattern.where('C', selfPredicate())
                .where('A',
                        states(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                                .getState(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION))
                                        .setMinGlobalLimited(365).or(autoAbilities()))
                .where('B',
                        states(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                                .getState(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION_COIL)))
                .where('D', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)));

        return pattern.build();
    }

    // todo: adv fusion texture (turns partially transparent when active)
    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        if (this.recipeMapWorkable.isActive()) {
            return SerendustryTextures.CASING_ADV_FUSION_ACTIVE;
        } else {
            return SerendustryTextures.CASING_ADV_FUSION;
        }
    }

    // todo: big laser rendering

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
