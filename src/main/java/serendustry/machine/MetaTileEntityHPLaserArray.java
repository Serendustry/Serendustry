package serendustry.machine;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.GTValues;
import gregtech.api.capability.IEnergyContainer;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.unification.material.Materials;
import gregtech.api.util.GTUtility;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.SValues;
import serendustry.blocks.BlockMetalCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.client.utils.STooltipHelper;
import serendustry.machine.structure.StructureDefinition;

public class MetaTileEntityHPLaserArray extends RecipeMapMultiblockController {

    private int sourceTier = 0;
    private int sourceAmps = 0;

    public MetaTileEntityHPLaserArray(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.HP_LASER_ARRAY_RECIPES);
        this.recipeMapWorkable = new HPLaserArrayWorkable(this);
    }

    @Override
    public MetaTileEntityHPLaserArray createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityHPLaserArray(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);

        // Check laser sources
        List<IEnergyContainer> sources = new ArrayList<>(getAbilities(MultiblockAbility.OUTPUT_LASER));
        for (IEnergyContainer source : sources) {
            int tier = GTUtility.getTierByVoltage(source.getOutputVoltage());
            long amps = source.getOutputAmperage();

            // Not the first loop, make sure all sources are the same. Invalidate if not
            if (sourceTier != 0) {
                if (tier != sourceTier || amps != sourceAmps) {
                    // todo error
                    invalidateStructure();
                }
            }
            // First loop, set to the first source's values
            else {
                sourceTier = tier;
                sourceAmps = Math.toIntExact(amps);
            }
        }

        List<IEnergyContainer> energyInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
        List<IEnergyContainer> substationInput = new ArrayList<>(
                getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));

        if (!energyInput.isEmpty()) {
            // Cannot exceed source tier
            if (energyInput.get(0).getInputVoltage() > GTValues.V[sourceTier]) {
                // todo error
                invalidateStructure();
            }

            // Disallow mixing hatch types
            if (!substationInput.isEmpty()) {
                invalidateStructure();
            }
        } else if (!substationInput.isEmpty()) {
            // Cannot exceed source tier
            if (substationInput.get(0).getInputVoltage() > GTValues.V[sourceTier]) {
                // todo error
                invalidateStructure();
            }
        }

        // todo: give error message to multiblock builder and make JEI not show mixed hatches

        /*
         * List<IEnergyContainer> powerInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
         * powerInput.addAll(getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));
         * 
         * this.powerInput = new EnergyContainerList(powerInput);
         */  // todo: update ceu so this works and check if this even needed
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
        this.sourceTier = 0;
        this.sourceAmps = 0;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        for (String[] aisle : StructureDefinition.HP_LASER_ARRAY) {
            pattern.aisle(aisle);
        }

        pattern.where('F', selfPredicate())
                .where('A',
                        states(SerendustryMetaBlocks.METAL_CASING
                                .getState(BlockMetalCasing.SerendustryMetalCasingType.AMERICIUM))
                                        .setMinGlobalLimited(794)
                                        .or(autoAbilities(false, false, true, true, true, true, false))
                                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0)
                                                .setMinGlobalLimited(0).setMaxGlobalLimited(2))
                                        .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(1)
                                                .setMaxGlobalLimited(1)))
                .where('B', frames(Materials.Neutronium))
                .where('C', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS))) // todo
                .where('D', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)))
                .where('E', abilities(MultiblockAbility.OUTPUT_LASER)); // todo facing

        return pattern.build();
    }

    // todo: big laser rendering

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return SerendustryTextures.CASING_AMERICIUM;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_SUBSTATION, false);
    }

    protected class HPLaserArrayWorkable extends MultiblockRecipeLogic {

        public HPLaserArrayWorkable(RecipeMapMultiblockController tileEntity) {
            super(tileEntity);
        }

        @Override
        public int getParallelLimit() {
            return sourceAmps / 64;
        }
    }
}
