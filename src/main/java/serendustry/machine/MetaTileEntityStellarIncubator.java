package serendustry.machine;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.jetbrains.annotations.Nullable;

import gregtech.api.capability.IEnergyContainer;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.BlockWireCoil;
import gregtech.common.blocks.MetaBlocks;
import serendustry.SValues;
import serendustry.blocks.SBlockMetalCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.client.utils.STooltipHelper;
import serendustry.machine.structure.StructureStellarIncubator;

public class MetaTileEntityStellarIncubator extends RecipeMapMultiblockController {

    public MetaTileEntityStellarIncubator(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, SerendustryRecipeMaps.STELLAR_INCUBATOR_RECIPES);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityStellarIncubator(metaTileEntityId);
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

    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        for (String[] aisle : StructureStellarIncubator.STELLAR_INCUBATOR) {
            pattern.aisle(aisle);
        }

        pattern.where('F', selfPredicate())
                .where('E',
                        states(SerendustryMetaBlocks.S_METAL_CASING
                                .getState(SBlockMetalCasing.SMetalCasingType.CARBON))
                                        .setMinGlobalLimited(1974)
                                        .or(autoAbilities(false, false, true, true, true, true, false))
                                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0)
                                                .setMinGlobalLimited(0)
                                                .setMaxGlobalLimited(1))
                                        .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(0)
                                                .setMaxGlobalLimited(1))
                                        .or(abilities(MultiblockAbility.INPUT_LASER).setPreviewCount(1)
                                                .setMaxGlobalLimited(1)))
                .where('A', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)))
                .where('C', states(MetaBlocks.WIRE_COIL.getState(BlockWireCoil.CoilType.TRITANIUM)))
                .where('D',
                        states(SerendustryMetaBlocks.S_METAL_CASING
                                .getState(SBlockMetalCasing.SMetalCasingType.NEUTRONIUM)));

        return pattern.build();
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return SerendustryTextures.CASING_CARBON; // todo
    }

    protected IBlockState getCasingState() {
        // todo: add custom casing
        return MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.UIV);
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_LASER, false);
    }
}
