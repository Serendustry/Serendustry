package serendustry.machine;

import gregtech.api.capability.IEnergyContainer;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.unification.material.Materials;
import gregtech.client.renderer.ICubeRenderer;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import serendustry.SValues;
import serendustry.blocks.BlockSerendustryMetalCasing;
import serendustry.blocks.BlockSerendustryMultiCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.client.utils.STooltipHelper;
import serendustry.machine.structure.StructureSpaceElevator;

import java.util.ArrayList;
import java.util.List;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

public class MetaTileEntitySpaceElevator extends RecipeMapMultiblockController {

    public MetaTileEntitySpaceElevator(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.SPACE_ELEVATOR_RECIPES);
    }

    @Override
    public MetaTileEntitySpaceElevator createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntitySpaceElevator(metaTileEntityId);
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
         * 
         * this.powerInput = new EnergyContainerList(powerInput);
         */  // todo: update ceu so this works and check if this even needed
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        for (String[] aisle : StructureSpaceElevator.SPACE_ELEVATOR) {
            pattern.aisle(aisle);
        }

        pattern.where('D', selfPredicate())
                .where('B',
                        states(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                                .getState(BlockSerendustryMultiCasing.SerendustryMultiCasingType.SPACE_ELEVATOR))
                                        .setMinGlobalLimited(4640)
                                        .or(autoAbilities(false, false, true, true, true, true, false))
                                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0)
                                                .setMinGlobalLimited(0).setMaxGlobalLimited(2))
                                        .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(0)
                                                .setMaxGlobalLimited(1))
                                        .or(abilities(MultiblockAbility.INPUT_LASER).setPreviewCount(1)
                                                .setMaxGlobalLimited(1)))
                .where('A',
                        states(SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING
                                .getState(BlockSerendustryMetalCasing.SerendustryMetalCasingType.CARBON)))
                .where('C', frames(Materials.Scandium));

        return pattern.build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return SerendustryTextures.CASING_SPACE_ELEVATOR;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_LASER, false);
    }
}
