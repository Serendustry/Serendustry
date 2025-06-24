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

import gregtech.api.block.IHeatingCoilBlockStats;
import gregtech.api.capability.IEnergyContainer;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.client.renderer.ICubeRenderer;
import serendustry.SValues;
import serendustry.blocks.SBlockMetalCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.client.utils.STooltipHelper;
import serendustry.machine.structure.StructureDefinition;

public class MetaTileEntityNebulaicNexus extends RecipeMapMultiblockController {

    private int coilTier = 0;
    // private IEnergyContainer powerInput; // todo: update ceu so this works and check if this even needed

    public MetaTileEntityNebulaicNexus(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.NEBULAIC_NEXUS_RECIPES);
        this.recipeMapWorkable = new NNWorkable(this);
    }

    @Override
    public MetaTileEntityNebulaicNexus createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityNebulaicNexus(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);

        Object type = context.get("CoilType");
        if (type instanceof IHeatingCoilBlockStats) {
            this.coilTier = Math.max(0, ((IHeatingCoilBlockStats) type).getTier());
        }

        // Must be at least Tritanium
        if (coilTier < 7) {
            // todo error
            invalidateStructure();
        }

        List<IEnergyContainer> energyInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
        List<IEnergyContainer> substationInput = new ArrayList<>(
                getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));

        if (!energyInput.isEmpty() && !substationInput.isEmpty()) {
            invalidateStructure();
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
        this.coilTier = 0;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        for (String[] aisle : StructureDefinition.NEBULAIC_NEXUS) {
            pattern.aisle(aisle);
        }

        pattern.where('D', selfPredicate())
                .where('C',
                        states(SerendustryMetaBlocks.S_METAL_CASING
                                .getState(SBlockMetalCasing.SMetalCasingType.CARBON))
                                        .setMinGlobalLimited(803)
                                        .or(autoAbilities(false, false, true, true, true, true, false))
                                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0)
                                                .setMinGlobalLimited(0).setMaxGlobalLimited(2))
                                        .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(1)
                                                .setMaxGlobalLimited(1)))
                .where('B',
                        states(SerendustryMetaBlocks.S_METAL_CASING
                                .getState(SBlockMetalCasing.SMetalCasingType.AMERICIUM)))
                .where('A', heatingCoils());

        return pattern.build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return SerendustryTextures.CASING_CARBON;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_SUBSTATION, false);
    }

    protected class NNWorkable extends MultiblockRecipeLogic {

        public NNWorkable(RecipeMapMultiblockController tileEntity) {
            super(tileEntity);
        }

        @Override
        public int getParallelLimit() {
            return (coilTier >= 8) ? coilTier * 2 : 1;
        }
    }
}
