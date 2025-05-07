package serendustry.machine;

import gregtech.api.recipes.RecipeMap;

public class RecipeMapPlasmaCondenser extends RecipeMap<PlasmaCondenserRecipeBuilder> {

    public RecipeMapPlasmaCondenser(String name, int inputs, int outputs, int fluidInputs, int fluidOutputs,
                                    boolean hidden) {
        super(name, inputs, outputs, fluidInputs, fluidOutputs, new PlasmaCondenserRecipeBuilder(), hidden);
    }
}
