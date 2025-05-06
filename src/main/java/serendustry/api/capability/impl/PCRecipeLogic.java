package serendustry.api.capability.impl;

import org.jetbrains.annotations.NotNull;

import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.recipes.recipeproperties.IRecipePropertyStorage;
import serendustry.Serendustry;
import serendustry.api.capability.IPCCoil;
import serendustry.machine.PlasmaCondenserTierProperty;
import serendustry.machine.PlasmaCondenserTypeProperty;

import static gregtech.api.recipes.logic.OverclockingLogic.PERFECT_OVERCLOCK_DURATION_DIVISOR;

public class PCRecipeLogic extends MultiblockRecipeLogic {

    public PCRecipeLogic(RecipeMapMultiblockController metaTileEntity) {
        super(metaTileEntity);
        if (!(metaTileEntity instanceof IPCCoil)) {
            throw new IllegalArgumentException("MetaTileEntity must be instanceof IPCCoil");
        }
    }

    @Override
    protected double getOverclockingDurationDivisor() {
        return PERFECT_OVERCLOCK_DURATION_DIVISOR;
    }

    @Override
    protected void modifyOverclockPre(int @NotNull [] values, @NotNull IRecipePropertyStorage storage) {
        super.modifyOverclockPre(values, storage);
        // coil speed doubling
        values[1] = applyPCCoilSpeed(((IPCCoil) metaTileEntity).getCurrentHeatingTier(), ((IPCCoil) metaTileEntity).getCurrentCoolingTier(), values[1], storage.getRecipePropertyValue(PlasmaCondenserTierProperty.getInstance(), -1), storage.getRecipePropertyValue(PlasmaCondenserTypeProperty.getInstance(), -1));
    }

    /*
     * todo ceu update
     *
     * @Override
     * protected void modifyOverclockPre(@NotNull OCParams ocParams, @NotNull RecipePropertyStorage storage) {
     * super.modifyOverclockPre(ocParams, storage);
     * // core speed doubling
     * ocParams.setDuration(applyAALCoreSpeed(ocParams.eut(),
     * ((IAALCore) metaTileEntity).getCurrentTier(),
     * ocParams.duration()));
     * }
     */

    public static int applyPCCoilSpeed(int tierHeating, int tierCooling, int recipeTime, int recipeTier, int recipeType) {
        // Halves recipe time for each tier that coils exceed recipe tier
        return recipeTime / ((recipeType == PlasmaCondenserTypeProperty.HEATING ? tierHeating : tierCooling) - recipeTier + 1);
    }
}
