package serendustry.api.capability.impl;

import gregtech.api.capability.IMultipleTankHandler;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import net.minecraftforge.fluids.FluidStack;
import serendustry.api.capability.IACRComponent;
import serendustry.machine.MetaTileEntityAdvancedChemicalReactor;

import java.util.List;

import static gregtech.api.recipes.logic.OverclockingLogic.PERFECT_OVERCLOCK_DURATION_DIVISOR;

public class ACRRecipeLogic extends MultiblockRecipeLogic {

    public ACRRecipeLogic(RecipeMapMultiblockController metaTileEntity) {
        super(metaTileEntity);
        if (!(metaTileEntity instanceof IACRComponent)) {
            throw new IllegalArgumentException("MetaTileEntity must be instanceof IACRComponent");
        }
    }

    @Override
    protected double getOverclockingDurationDivisor() {
        return PERFECT_OVERCLOCK_DURATION_DIVISOR;
    }

    // Drain needed fluids each second (todo: fix it just saying needs more energy)
    @Override
    protected boolean canProgressRecipe() {
        MetaTileEntityAdvancedChemicalReactor mte = ((MetaTileEntityAdvancedChemicalReactor) metaTileEntity);

        if (mte.isActive()) {
            List<FluidStack> addedFluids = mte.getCurrentAddedFluids();

            // No needed fluids
            if (addedFluids.isEmpty()) return super.canProgressRecipe();

            // Get fluid input contents
            IMultipleTankHandler handler = mte.getInputFluidInventory();
            if (!(handler.getTankProperties().length > 0)) return false;

            // Make sure the desired amount can be drained before actually trying to drain it
            for (FluidStack fluidStack : addedFluids) {
                FluidStack stack = handler.drain(fluidStack, false);
                if (stack == null || stack.amount < fluidStack.amount) return false;
            }

            // Actually drain fluids
            for (FluidStack fluidStack : addedFluids) handler.drain(fluidStack, true);
        }

        return super.canProgressRecipe();
    }
}
