package serendustry.recipe;

import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.V;
import static serendustry.item.material.SerendustryMaterials.PositroniumHydride;
import static serendustry.machine.SerendustryRecipeMaps.ANTIMATTER_GENERATOR_FUELS;

public class GeneratorFuels {

    public static void init() {
        ANTIMATTER_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(PositroniumHydride.getFluid(2000))
                .duration(20 * 100)
                .EUt((int) V[UHV])
                .buildAndRegister();
    }
}
