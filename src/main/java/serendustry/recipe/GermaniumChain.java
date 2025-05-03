package serendustry.recipe;

import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static serendustry.item.material.SerendustryMaterials.*;

public class GermaniumChain {

    public static void init() {
        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, Renierite, 46)
                .output(dust, Copper, 11)
                .output(dust, Zinc, 11)
                .output(dust, GermaniumDisulfide, 6)
                .output(dust, Arsenic, 2)
                .output(dust, Iron, 4)
                .output(dust, Sulfur, 12)
                .duration(20 * 26).EUt(VA[ZPM]).buildAndRegister();
        // .components(Copper, 11, Zinc, 11, Germanium, 2, Arsenic, 2, Iron, 4, Sulfur, 16)

        BLAST_RECIPES.recipeBuilder()
                .input(dust, GermaniumDisulfide, 3)
                .fluidInputs(Oxygen.getFluid(6000))
                .output(dust, GermaniumDioxide, 3)
                .fluidOutputs(SulfurDioxide.getFluid(2000))
                .blastFurnaceTemp(10800)
                .duration(20 * 13).EUt(VA[ZPM]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, GermaniumDioxide, 3)
                .fluidInputs(Hydrogen.getFluid(4000))
                .output(dust, Germanium)
                .fluidOutputs(Water.getFluid(2000))
                .duration(20 * 15).EUt(VA[ZPM]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, GermaniumDioxide, 3)
                .input(dust, Carbon)
                .output(dust, Germanium)
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .duration(20 * 11).EUt(VA[ZPM]).buildAndRegister();
    }
}
