package serendustry.machine;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.capability.IEnergyContainer;
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
import serendustry.machine.structure.StructureDefinition;

public class MetaTileEntityYggdrasil extends RecipeMapMultiblockController {

    public MetaTileEntityYggdrasil(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.YGGDRASIL_RECIPES);
    }

    @Override
    public MetaTileEntityYggdrasil createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityYggdrasil(metaTileEntityId);
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
                        states(getCasingState()).setMinGlobalLimited(1)
                                .or(autoAbilities(false, false, true, true, true, true, false))
                                .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0).setMinGlobalLimited(0)
                                        .setMaxGlobalLimited(2))
                                .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(0)
                                        .setMaxGlobalLimited(1))
                                .or(abilities(MultiblockAbility.INPUT_LASER).setPreviewCount(1)
                                        .setMaxGlobalLimited(1)));

        return pattern.build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return Textures.INERT_PTFE_CASING; // todo
    }

    // todo: add custom ??? Casings
    private IBlockState getCasingState() {
        return MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.UIV);
    }
}
