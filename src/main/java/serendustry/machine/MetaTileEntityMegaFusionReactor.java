package serendustry.machine;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.capability.IEnergyContainer;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.recipes.RecipeMaps;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.SValues;
import serendustry.blocks.SBlockActiveMultiCasing;
import serendustry.blocks.SBlockMultiCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.client.utils.STooltipHelper;
import serendustry.item.material.SerendustryMaterials;
import serendustry.machine.structure.StructureDefinition;

public class MetaTileEntityMegaFusionReactor extends RecipeMapMultiblockController {

    public MetaTileEntityMegaFusionReactor(ResourceLocation rl) {
        super(rl, RecipeMaps.FUSION_RECIPES);
        this.recipeMapWorkable = new MegaFusionReactorWorkable(this);
    }

    @Override
    public MetaTileEntityMegaFusionReactor createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityMegaFusionReactor(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);

        List<IEnergyContainer> energyInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
        List<IEnergyContainer> substationInput = new ArrayList<>(
                getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));
        List<IEnergyContainer> laserInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_LASER));

        // Allow only 1 type of energy input at a time
        if ((!energyInput.isEmpty() && !substationInput.isEmpty()) ||
                (!energyInput.isEmpty() && !laserInput.isEmpty()) ||
                (!substationInput.isEmpty() && !laserInput.isEmpty())) {
            invalidateStructure();
        }

        // todo: give error message to multiblock builder and make JEI not show mixed hatches

        /*
         * List<IEnergyContainer> powerInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
         * powerInput.addAll(getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));
         * powerInput.addAll(getAbilities(MultiblockAbility.INPUT_LASER));
         *
         * this.powerInput = new EnergyContainerList(powerInput);
         */  // todo: update ceu so this works and check if this even needed
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        for (String[] aisle : StructureDefinition.MEGA_FUSION_REACTOR) {
            pattern.aisle(aisle);
        }

        pattern.where('E', selfPredicate())
                .where('D',
                        states(SerendustryMetaBlocks.S_MULTI_CASING
                                .getState(SBlockMultiCasing.SMultiCasingType.ADV_FUSION))
                                        .setMinGlobalLimited(1681)
                                        .or(autoAbilities(false, false, false, false, true, true, false))
                                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0)
                                                .setMinGlobalLimited(0).setMaxGlobalLimited(2))
                                        .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(0)
                                                .setMaxGlobalLimited(1))
                                        .or(abilities(MultiblockAbility.INPUT_LASER).setPreviewCount(1)
                                                .setMaxGlobalLimited(1)))
                .where('B',
                        states(SerendustryMetaBlocks.S_ACTIVE_MULTI_CASING
                                .getState(SBlockActiveMultiCasing.SActiveMultiCasingType.ADV_FUSION_COIL)))
                .where('A', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)))
                .where('C', frames(SerendustryMaterials.DeepDarkSteel));

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

    protected class MegaFusionReactorWorkable extends MultiblockRecipeLogic {

        public MegaFusionReactorWorkable(RecipeMapMultiblockController tileEntity) {
            super(tileEntity);
        }

        @Override
        public int getParallelLimit() {
            return 4096;
        }
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_LASER, false);
    }
}
