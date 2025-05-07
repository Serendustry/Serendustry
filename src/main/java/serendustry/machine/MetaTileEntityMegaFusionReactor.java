package serendustry.machine;

import static gregtech.api.util.RelativeDirection.*;

import gregtech.api.capability.IEnergyContainer;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.pattern.PatternMatchContext;
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

import java.util.ArrayList;
import java.util.List;

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

        for (String[] aisle : StructureDefinition.CUBE) {
            pattern.aisle(aisle);
        }

        pattern.where('S', selfPredicate())
                .where('X',
                        states(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                                .getState(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION))
                                .setMinGlobalLimited(365)
                                .or(autoAbilities(false, false, false, false, true, true, false))
                                .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0)
                                        .setMinGlobalLimited(0).setMaxGlobalLimited(2))
                                .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(0)
                                        .setMaxGlobalLimited(1))
                                .or(abilities(MultiblockAbility.INPUT_LASER).setPreviewCount(1)
                                        .setMaxGlobalLimited(1)))
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

    protected class MegaFusionReactorWorkable extends MultiblockRecipeLogic {

        public MegaFusionReactorWorkable(RecipeMapMultiblockController tileEntity) {
            super(tileEntity);
        }

        @Override
        public int getParallelLimit() {
            return 4096;
        }
    }
}
