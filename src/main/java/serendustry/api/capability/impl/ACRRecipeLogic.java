package serendustry.api.capability.impl;

import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.unification.material.Material;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.IFluidTankProperties;
import serendustry.Serendustry;
import serendustry.api.capability.IACRComponent;

import java.util.List;

public class ACRRecipeLogic extends MultiblockRecipeLogic {

    public ACRRecipeLogic(RecipeMapMultiblockController metaTileEntity) {
        super(metaTileEntity);
        if (!(metaTileEntity instanceof IACRComponent)) {
            throw new IllegalArgumentException("MetaTileEntity must be instanceof IACRComponent");
        }
    }

    // Drain needed fluids each tick
    @Override
    protected boolean canProgressRecipe() {
        IACRComponent mte = ((IACRComponent) metaTileEntity);
        List<FluidStack> addedFluids = mte.getCurrentAddedFluids();

        // No needed fluids
        if(addedFluids.isEmpty()) return super.canProgressRecipe();

        IFluidHandler handler = metaTileEntity.getImportFluids();
        if(handler.getTankProperties().length > 0) {
            for(IFluidTankProperties props : handler.getTankProperties()) {
                Serendustry.logger.info(props.getContents().getFluid().getName());
            }
        } else {
            Serendustry.logger.info("handler.getTankProperties is empty!");
            return false;
        }

        for(int i = 0; i <= addedFluids.size(); i++) {
            FluidStack fluidStack = addedFluids.get(i);

            // Make sure the desired amount can be drained before actually trying to drain it
            Serendustry.logger.info("Attempting to drain " + fluidStack.amount + "L of " + fluidStack.getFluid().getName());
            FluidStack stack = handler.drain(fluidStack, false);
            if(stack == null || stack.amount < fluidStack.amount) {
                Serendustry.logger.info("Failed to drain fluid!");
                return false;
            }
            handler.drain(fluidStack, true);
        }

        return super.canProgressRecipe();
    }
}
