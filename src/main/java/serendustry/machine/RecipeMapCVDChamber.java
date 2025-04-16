package serendustry.machine;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;

public class RecipeMapCVDChamber extends
        RecipeMap<SimpleRecipeBuilder> {

    public RecipeMapCVDChamber(String name, int inputs, int outputs, int fluidInputs, int fluidOutputs,
                                             boolean hidden) {
        super(name, inputs, outputs, fluidInputs, fluidOutputs, new SimpleRecipeBuilder(), hidden);
    }
}
