package serendustry.api.capability.impl;

import org.jetbrains.annotations.NotNull;

import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.recipes.recipeproperties.IRecipePropertyStorage;
import gregtech.api.util.GTUtility;
import serendustry.api.capability.IAALCore;

public class AALRecipeLogic extends MultiblockRecipeLogic {

    public AALRecipeLogic(RecipeMapMultiblockController metaTileEntity) {
        super(metaTileEntity);
        if (!(metaTileEntity instanceof IAALCore)) {
            throw new IllegalArgumentException("MetaTileEntity must be instanceof IAALCore");
        }
    }

    @Override
    protected void modifyOverclockPre(int @NotNull [] values, @NotNull IRecipePropertyStorage storage) {
        super.modifyOverclockPre(values, storage);

        // Core speed doubling
        values[1] = applyAALCoreSpeed(values[0], ((IAALCore) metaTileEntity).getCurrentTier(), values[1]);
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

    // Halves recipe time for each tier that core tier exceeds recipe voltage tier
    public static int applyAALCoreSpeed(long recipeEUt, int tier, int recipeTime) {
        return (int) (recipeTime / (Math.pow(2, Math.max(tier - GTUtility.getTierByVoltage(recipeEUt), 0))));
    }
}
