package serendustry.recipe;

import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ARC_FURNACE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.unification.material.Materials.Acetone;
import static gregtech.api.unification.material.Materials.Ammonia;
import static gregtech.api.unification.material.Materials.AmmoniumChloride;
import static gregtech.api.unification.material.Materials.Bromine;
import static gregtech.api.unification.material.Materials.Butane;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.CarbonDioxide;
import static gregtech.api.unification.material.Materials.CarbonMonoxide;
import static gregtech.api.unification.material.Materials.Chlorine;
import static gregtech.api.unification.material.Materials.Ethanol;
import static gregtech.api.unification.material.Materials.Ethylene;
import static gregtech.api.unification.material.Materials.HydrochloricAcid;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.Lithium;
import static gregtech.api.unification.material.Materials.LithiumChloride;
import static gregtech.api.unification.material.Materials.Nitrogen;
import static gregtech.api.unification.material.Materials.Oxygen;
import static gregtech.api.unification.material.Materials.Phosphorus;
import static gregtech.api.unification.material.Materials.Rhenium;
import static gregtech.api.unification.material.Materials.Salt;
import static gregtech.api.unification.material.Materials.Selenium;
import static gregtech.api.unification.material.Materials.SodiumSulfide;
import static gregtech.api.unification.material.Materials.Water;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static serendustry.item.material.SerendustryMaterials.Acetylene;
import static serendustry.item.material.SerendustryMaterials.AmmoniumPerrhenate;
import static serendustry.item.material.SerendustryMaterials.BETS;
import static serendustry.item.material.SerendustryMaterials.BETSPerrhenate;
import static serendustry.item.material.SerendustryMaterials.Bromobutane;
import static serendustry.item.material.SerendustryMaterials.Butanol;
import static serendustry.item.material.SerendustryMaterials.DiethylPhosphate;
import static serendustry.item.material.SerendustryMaterials.Dihydro14Dithiine;
import static serendustry.item.material.SerendustryMaterials.Dihydro14dithiine23bislithiumSelenolate;
import static serendustry.item.material.SerendustryMaterials.Diisopropylamine;
import static serendustry.item.material.SerendustryMaterials.EthyleneDibromide;
import static serendustry.item.material.SerendustryMaterials.Formaldehyde;
import static serendustry.item.material.SerendustryMaterials.HydrogenBromide;
import static serendustry.item.material.SerendustryMaterials.LithiumBromide;
import static serendustry.item.material.SerendustryMaterials.LithiumDiisopropylamide;
import static serendustry.item.material.SerendustryMaterials.Phosgene;
import static serendustry.item.material.SerendustryMaterials.PhosphorusTrichloride;
import static serendustry.item.material.SerendustryMaterials.Propylene;
import static serendustry.item.material.SerendustryMaterials.RheniumVIIOxide;
import static serendustry.item.material.SerendustryMaterials.SodiumBromide;
import static serendustry.item.material.SerendustryMaterials.SodiumZ12ethenedithiolate;
import static serendustry.item.material.SerendustryMaterials.TriethylPhosphite;
import static serendustry.item.material.SerendustryMaterials.cis12Dichloroethene;
import static serendustry.item.material.SerendustryMaterials.nButyllithium;
import static serendustry.machine.SerendustryRecipeMaps.ACR_RECIPES;

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

        // 2 Diff Pump
        ACR_RECIPES.recipeBuilder()
                .temperature(195, 273)
                .pressure(80, 160)
                .fluidInputs(Ammonia.getFluid(1000),
                        Acetone.getFluid(2000),
                        Hydrogen.getFluid(4000),
                        nButyllithium.getFluid(1000))
                .output(dust, LithiumDiisopropylamide, 22)
                .fluidOutputs(Butane.getFluid(1000),
                        Water.getFluid(2000))
                .duration(20 * 16).EUt(VA[UV]).buildAndRegister();

        // 5 Lq Cooler + 2 Centri Compr (183 112)
        // 2 Lq Cooler + 2 TE Cooler + 2 Centri Compr (198 121) (Does LDA and this)
        ACR_RECIPES.recipeBuilder()
                .temperature(170, 200)
                .pressure(100, 180)
                .fluidInputs(Dihydro14Dithiine.getFluid(1000),
                        Nitrogen.getFluid(8000))
                .input(dust, LithiumDiisopropylamide)
                .input(dust, Selenium, 2)
                .fluidOutputs(Dihydro14dithiine23bislithiumSelenolate.getFluid(1000),
                        Diisopropylamine.getFluid(2000))
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

        // 2 Res Heater + 2 Centri Compr
        ACR_RECIPES.recipeBuilder()
                .temperature(350, 380)
                .pressure(140, 200)
                .fluidInputs(Dihydro14dithiine23bislithiumSelenolate.getFluid(2000),
                        TriethylPhosphite.getFluid(1000),
                        Phosgene.getFluid(2000))
                .output(dust, BETS, 26)
                .output(dust, LithiumChloride, 8)
                .fluidOutputs(DiethylPhosphate.getFluid(1000),
                        Formaldehyde.getFluid(2000))
                .duration(20 * 24).EUt(VA[UV]).buildAndRegister();

        ARC_FURNACE_RECIPES.recipeBuilder()
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
