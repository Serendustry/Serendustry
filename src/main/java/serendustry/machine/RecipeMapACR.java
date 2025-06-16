package serendustry.machine;

import gregtech.api.recipes.RecipeMap;

public class RecipeMapACR extends RecipeMap<ACRRecipeBuilder> {

    public RecipeMapACR(String name, int inputs, int outputs, int fluidInputs, int fluidOutputs,
                        boolean hidden) {
        super(name, inputs, outputs, fluidInputs, fluidOutputs, new ACRRecipeBuilder(), hidden);
    }
}
