package serendustry.recipe;

import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.BENDER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.BLAST_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.FLUID_SOLIDFICATION_RECIPES;
import static gregtech.api.unification.material.Materials.Aluminium;
import static gregtech.api.unification.material.Materials.Argon;
import static gregtech.api.unification.material.Materials.Asbestos;
import static gregtech.api.unification.material.Materials.Bromine;
import static gregtech.api.unification.material.Materials.Cobalt;
import static gregtech.api.unification.material.Materials.DistilledWater;
import static gregtech.api.unification.material.Materials.Ethylene;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.Manganese;
import static gregtech.api.unification.material.Materials.Naphtha;
import static gregtech.api.unification.material.Materials.Oxygen;
import static gregtech.api.unification.material.Materials.Platinum;
import static gregtech.api.unification.material.Materials.Polybenzimidazole;
import static gregtech.api.unification.material.Materials.Rhenium;
import static gregtech.api.unification.material.Materials.SiliconDioxide;
import static gregtech.api.unification.material.Materials.Silver;
import static gregtech.api.unification.material.Materials.Water;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.foil;
import static serendustry.item.material.SerendustryMaterials.AluminizedBoPET;
import static serendustry.item.material.SerendustryMaterials.BoPET;
import static serendustry.item.material.SerendustryMaterials.EthyleneGlycol;
import static serendustry.item.material.SerendustryMaterials.EthyleneOxide;
import static serendustry.item.material.SerendustryMaterials.HeatSetBoPET;
import static serendustry.item.material.SerendustryMaterials.HydrogenBromide;
import static serendustry.item.material.SerendustryMaterials.LaminatedBoPET;
import static serendustry.item.material.SerendustryMaterials.MoPET;
import static serendustry.item.material.SerendustryMaterials.PolyethyleneTerephtalate;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;
import static serendustry.item.material.SerendustryMaterials.SiliconCarbide;
import static serendustry.item.material.SerendustryMaterials.TerephtalicAcid;
import static serendustry.item.material.SerendustryMaterials.paraXylene;
import static serendustry.machine.SerendustryRecipeMaps.ACR_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.CVD_RECIPES;

public class BoPETCHain {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Silver)
                .input(dust, SiliconCarbide)
                .fluidInputs(Ethylene.getFluid(10000), Oxygen.getFluid(10000))
                .fluidOutputs(EthyleneOxide.getFluid(10000))
                .duration(20 * 60).EUt(VA[ZPM]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(EthyleneOxide.getFluid(1000), Water.getFluid(1000))
                .fluidOutputs(EthyleneGlycol.getFluid(1000))
                .duration(20 * 6).EUt(VA[ZPM]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Rhenium)
                .fluidInputs(Naphtha.getFluid(10000))
                .fluidOutputs(paraXylene.getFluid(1000))
                .duration(20 * 60).EUt(VA[ZPM]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Platinum)
                .input(dust, Asbestos)
                .fluidInputs(Hydrogen.getFluid(10000), Bromine.getFluid(10000)) // todo: bromine recipe
                .fluidOutputs(HydrogenBromide.getFluid(10000))
                .duration(20 * 60).EUt(VA[ZPM]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Cobalt)
                .input(dust, Manganese)
                .fluidInputs(HydrogenBromide.getFluid(1000), Oxygen.getFluid(10000), paraXylene.getFluid(10000))
                .output(dust, TerephtalicAcid, 10)
                .duration(20 * 60).EUt(VA[ZPM]).buildAndRegister();

        // 4 Recip Compr + 4 Res Heater
        // 5 Centri Compr + 6 Gas Heater
        ACR_RECIPES.recipeBuilder()
                .temperature(495, 535)
                .pressure(270, 550)
                .input(dust, TerephtalicAcid, 10)
                .fluidInputs(EthyleneGlycol.getFluid(1000))
                .fluidOutputs(PolyethyleneTerephtalate.getFluid(144), DistilledWater.getFluid(2000))
                .duration(20 * 6).EUt(VA[ZPM]).buildAndRegister();

        BENDER_RECIPES.recipeBuilder()
                .input(foil, PolyethyleneTerephtalate)
                .output(foil, MoPET)
                .duration(30).EUt(VA[ZPM]).buildAndRegister();

        BENDER_RECIPES.recipeBuilder()
                .input(foil, MoPET)
                .output(foil, BoPET)
                .duration(30).EUt(VA[ZPM]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(foil, BoPET)
                .input(dust, SiliconDioxide)
                .output(foil, HeatSetBoPET)
                .blastFurnaceTemp(480)
                .duration(30).EUt(VA[ZPM]).buildAndRegister();

        CVD_RECIPES.recipeBuilder()
                .input(foil, HeatSetBoPET, 4)
                .input(dust, Aluminium)
                .fluidInputs(Aluminium.getFluid(144), Argon.getFluid(1000))
                .output(foil, AluminizedBoPET, 4)
                .duration(20 * 6).EUt(VA[ZPM]).buildAndRegister();

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .input(foil, AluminizedBoPET)
                .fluidInputs(Polybenzimidazole.getFluid(144 * 8))
                .output(foil, LaminatedBoPET)
                .duration(90).EUt(VA[ZPM]).buildAndRegister();

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .input(foil, AluminizedBoPET)
                .fluidInputs(RadoxPolymer.getFluid(18))
                .output(foil, LaminatedBoPET)
                .duration(30).EUt(VA[ZPM]).buildAndRegister();
    }
}
