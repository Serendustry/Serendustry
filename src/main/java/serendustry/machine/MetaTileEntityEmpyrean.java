package serendustry.machine;

import gregtech.api.capability.IEnergyContainer;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import serendustry.SValues;
import serendustry.client.utils.STooltipHelper;
import serendustry.machine.structure.StructureDefinition;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

public class MetaTileEntityEmpyrean extends RecipeMapMultiblockController {

    public MetaTileEntityEmpyrean(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, SerendustryRecipeMaps.EMPYREAN_RECIPES);
        this.recipeMapWorkable = new MultiblockRecipeLogic(this, true);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityEmpyrean(metaTileEntityId);
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

        // todo: give error message to multiblock builder

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

        for (String[] aisle : StructureDefinition.CUBE) {
            pattern.aisle(aisle);
        }

        pattern.where('S', selfPredicate())
                .where('X',
                        states(getCasingState()).setMinGlobalLimited(1)
                                .or(autoAbilities(false, false, true, true, true, true, false))
                                .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0).setMinGlobalLimited(0)
                                        .setMaxGlobalLimited(1))
                                .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(0)
                                        .setMaxGlobalLimited(1))
                                .or(abilities(MultiblockAbility.INPUT_LASER).setPreviewCount(1)
                                        .setMaxGlobalLimited(1)));

        return pattern.build();
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return Textures.INERT_PTFE_CASING; // todo
    }

    protected IBlockState getCasingState() {
        return MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.UIV); // todo
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_LASER, true);
    }
}
