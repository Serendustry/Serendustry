package serendustry.machine;

import gregtech.api.recipes.RecipeMap;

public class RecipeMapIndustrialLaboratory extends RecipeMap<LaboratoryRecipeBuilder> {

    public RecipeMapIndustrialLaboratory(String name, int inputs, int outputs, int fluidInputs, int fluidOutputs,
                                         boolean hidden) {
        super(name, inputs, outputs, fluidInputs, fluidOutputs, new LaboratoryRecipeBuilder(), hidden);
    }
    // todo custom layout
}
