package serendustry.api.capability.impl;

import gregtech.api.capability.IMultipleTankHandler;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import net.minecraftforge.fluids.FluidStack;
import serendustry.api.capability.IACRComponent;
import serendustry.machine.MetaTileEntityAdvancedChemicalReactor;

import java.util.List;

public class ACRRecipeLogic extends MultiblockRecipeLogic {

    public ACRRecipeLogic(RecipeMapMultiblockController metaTileEntity) {
        super(metaTileEntity);
        if (!(metaTileEntity instanceof IACRComponent)) {
            throw new IllegalArgumentException("MetaTileEntity must be instanceof IACRComponent");
        }
    }

    // Drain needed fluids each second (todo: fix drains even when machine isnt running) (also fix it just saying needs more energy)
    @Override
    protected boolean canProgressRecipe() {
        MetaTileEntityAdvancedChemicalReactor mte = ((MetaTileEntityAdvancedChemicalReactor) metaTileEntity);

        if(mte.isActive()) {
            List<FluidStack> addedFluids = mte.getCurrentAddedFluids();

            // No needed fluids
            if (addedFluids.isEmpty()) return super.canProgressRecipe();

            IMultipleTankHandler handler = mte.getInputFluidInventory();
            if (!(handler.getTankProperties().length > 0)) return false;

            for (FluidStack fluidStack : addedFluids) {
                // Make sure the desired amount can be drained before actually trying to drain it
                FluidStack stack = handler.drain(fluidStack, false);
                if (stack == null || stack.amount < fluidStack.amount) return false;
                handler.drain(fluidStack, true);
            }
        }

        return super.canProgressRecipe();
    }
}
