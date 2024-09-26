package serendustry.machine;

import gregtech.api.GTValues;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.ParallelLogicType;
import gregtech.api.recipes.RecipeMaps;
import gregtech.common.blocks.*;
import gregtech.common.metatileentities.MetaTileEntities;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;

import java.util.Arrays;

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
        return FactoryBlockPattern.start()
                .aisle("###############", "######CGC######", "###############")
                .aisle("######CCC######", "####GGAAAGG####", "######CCC######")
                .aisle("####CC###CC####", "###CAACGCAAC###", "####CC###CC####")
                .aisle("###C#######C###", "##CKCG###GCKC##", "###C#######C###")
                .aisle("##C#########C##", "#GAC#######CAG#", "##C#########C##")
                .aisle("##C#########C##", "#GAG#######GAG#", "##C#########C##")
                .aisle("#C###########C#", "CAC#########CAC", "#C###########C#")
                .aisle("#C###########C#", "GAG#########GAG", "#C###########C#")
                .aisle("#C###########C#", "CAC#########CAC", "#C###########C#")
                .aisle("##C#########C##", "#GAG#######GAG#", "##C#########C##")
                .aisle("##C#########C##", "#GAC#######CAG#", "##C#########C##")
                .aisle("###C#######C###", "##CKCG###GCKC##", "###C#######C###")
                .aisle("####CC###CC####", "###CAACGCAAC###", "####CC###CC####")
                .aisle("######CCC######", "####GGAAAGG####", "######CCC######")
                .aisle("###############", "######CSC######", "###############")
                .where('S', selfPredicate())
                .where('G', states(getCasingState(), getGlassState()))
                .where('C', states(getCasingState()).or(metaTileEntities(Arrays
                        .stream(MetaTileEntities.ENERGY_INPUT_HATCH)
                        .filter(mte -> mte != null && mte.getTier() >= GTValues.UEV)
                        .toArray(MetaTileEntity[]::new))
                        .setPreviewCount(2)).or(abilities(MultiblockAbility.EXPORT_FLUIDS)).or(abilities(MultiblockAbility.IMPORT_FLUIDS)))
                .where('K', states(getCoilState()))
                .where('A', air())
                .where('#', any())
                .build();
    }

    private IBlockState getGlassState() {
        return MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS);
    }

    // todo: adv fusion casing
    private IBlockState getCasingState() {
        return MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_CASING_MK3);
    }

    private IBlockState getCoilState() {
        return MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_COIL);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        if (this.recipeMapWorkable.isActive()) {
            return Textures.ACTIVE_FUSION_TEXTURE;
        } else {
            return Textures.FUSION_TEXTURE;
        }
    }
    /*
    public static int getEUtForParallel(int parallel, int discount) {
        return RecipeMapFurnace.RECIPE_EUT * Math.max(1, (parallel / 8) / discount);
    }

    public static int getMaxParallel(int heatingCoilLevel) {
        return 32 * heatingCoilLevel;
    }

    public static int getDurationForParallel(int parallel, int parallelLimit) {
        return (int) Math.max(1.0, RecipeMapFusionReactor.RECIPE_DURATION * 2 * parallel / Math.max(1, parallelLimit * 1.0));
    }*/

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
