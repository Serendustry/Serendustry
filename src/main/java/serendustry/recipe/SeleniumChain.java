package serendustry.recipe;

import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static serendustry.item.material.SerendustryMaterials.*;

public class SeleniumChain {
    public static void init() {
            CHEMICAL_BATH_RECIPES.recipeBuilder()
                    .input(dust, Olsacherite, 12)
                    .fluidInputs(NitricAcid.getFluid(1000))
                    .output(dustImpure, Lead)
                    .output(dustImpure, Sulfur)
                    .output(dust, SeleniumSludge, 10)
                    .duration(20 * 20).EUt(VA[ZPM]).buildAndRegister();

            MIXER_RECIPES.recipeBuilder()
                    .input(dust, SeleniumSludge, 10)
                    .fluidInputs(Water.getFluid(1000))
                    .output(dustImpure, Lead)
                    .fluidOutputs(SelenousAcid.getFluid(1000))
                    .duration(20 * 20).EUt(VA[ZPM]).buildAndRegister();

            BLAST_RECIPES.recipeBuilder()
                    .fluidInputs(SelenousAcid.getFluid(1000), SulfurDioxide.getFluid(1000))
                    .output(ingot, Selenium) // todo: change to ingotHot
                    .blastFurnaceTemp(10800)
                    .duration(20 * 20).EUt(VA[ZPM]).buildAndRegister();
    }
}
