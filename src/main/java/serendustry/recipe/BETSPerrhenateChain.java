package serendustry.recipe;

import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static serendustry.item.material.SerendustryMaterials.*;

public class BETSPerrhenateChain {
    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Acetylene.getFluid(1000), Chlorine.getFluid(2000))
                .fluidOutputs(cis12Dichloroethene.getFluid(1000))
                .duration(20 * 2).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SodiumSulfide, 6)
                .fluidInputs(cis12Dichloroethene.getFluid(1000))
                .output(dust, SodiumZ12ethenedithiolate, 8)
                .output(dust, Salt, 4)
                .duration(20 * 12).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ethylene.getFluid(1000), Bromine.getFluid(2000))
                .fluidOutputs(EthyleneDibromide.getFluid(1000))
                .duration(20 * 2).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SodiumZ12ethenedithiolate)
                .fluidInputs(EthyleneDibromide.getFluid(1000))
                .output(dust, SodiumBromide)
                .fluidOutputs(Dihydro14Dithiine.getFluid(1000))
                .duration(20 * 2).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Propylene.getFluid(1000), Water.getFluid(2000), CarbonMonoxide.getFluid(3000))
                .fluidOutputs(Butanol.getFluid(1000), CarbonDioxide.getFluid(1000))
                .duration(20 * 2).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Butanol.getFluid(1000), HydrogenBromide.getFluid(1000))
                .fluidOutputs(Bromobutane.getFluid(1000), Water.getFluid(1000))
                .duration(20 * 2).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Lithium, 2)
                .fluidInputs(Bromobutane.getFluid(1000))
                .output(dust, LithiumBromide)
                .fluidOutputs(nButyllithium.getFluid(1000))
                .duration(20 * 2).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ammonia.getFluid(1000), Acetone.getFluid(2000), Hydrogen.getFluid(4000), nButyllithium.getFluid(1000))
                .output(dust, LithiumDiisopropylamide, 22)
                .fluidOutputs(Butane.getFluid(1000), Water.getFluid(2000))
                .duration(20 * 16).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Dihydro14Dithiine.getFluid(1000))
                .input(dust, LithiumDiisopropylamide)
                .input(dust, Selenium, 2) // todo: add way to get selenium
                .fluidOutputs(Dihydro14dithiine23bislithiumSelenolate.getFluid(1000), Diisopropylamine.getFluid(2000))
                .duration(20 * 2).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Phosphorus)
                .fluidInputs(Chlorine.getFluid(3000))
                .fluidOutputs(PhosphorusTrichloride.getFluid(1000))
                .duration(20 * 2).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PhosphorusTrichloride.getFluid(3000), Ethanol.getFluid(3000))
                .fluidOutputs(TriethylPhosphite.getFluid(1000), HydrochloricAcid.getFluid(1000))
                .duration(20 * 2).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Carbon)
                .fluidInputs(CarbonMonoxide.getFluid(10000), Chlorine.getFluid(20000))
                .fluidOutputs(Phosgene.getFluid(10000))
                .duration(20 * 20).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Dihydro14dithiine23bislithiumSelenolate.getFluid(2000), TriethylPhosphite.getFluid(1000), Phosgene.getFluid(2000))
                .output(dust, BETS, 26)
                .output(dust, LithiumChloride, 8)
                .fluidOutputs(DiethylPhosphate.getFluid(1000), Formaldehyde.getFluid(2000))
                .duration(20 * 24).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Rhenium, 2)
                .fluidInputs(Oxygen.getFluid(7000))
                .output(dust, RheniumVIIOxide, 9)
                .duration(20 * 10).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, RheniumVIIOxide, 9)
                .fluidInputs(Ammonia.getFluid(2000), Water.getFluid(1000))
                .output(dust, AmmoniumPerrhenate, 20)
                .duration(20 * 18).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, BETS, 26)
                .input(dust, AmmoniumPerrhenate, 10)
                .fluidInputs(Chlorine.getFluid(1000))
                .output(dust, BETSPerrhenate, 31)
                .output(dust, AmmoniumChloride, 6)
                .duration(20 * 32).EUt(VA[UV]).buildAndRegister();
    }
}
