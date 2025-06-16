package serendustry.recipe;

import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.ingredients.GTRecipeInput;
import gregtech.api.unification.material.Materials;

// todo: replace with build action after updating CEu
public class PlasmaArcRecipes {

    public static void init() {
        for (Recipe recipe : RecipeMaps.ARC_FURNACE_RECIPES.getRecipeList()) {
            int fluidAmount = Math.max(1, recipe.getFluidInputs().get(0).getAmount() / 72);

            RecipeMaps.ARC_FURNACE_RECIPES.recipeBuilder()
                    .inputs(recipe.getInputs().toArray(new GTRecipeInput[0]))
                    .fluidInputs(Materials.Nitrogen.getPlasma(fluidAmount))
                    .outputs(recipe.getOutputs())
                    .fluidOutputs(Materials.Nitrogen.getFluid(fluidAmount))
                    .EUt(recipe.getEUt())
                    .duration(Math.max(1, recipe.getDuration() / 10))
                    .category(recipe.getRecipeCategory())
                    .buildAndRegister();
        }
    }
}
