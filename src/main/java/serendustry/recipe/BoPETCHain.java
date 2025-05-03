package serendustry.recipe;

import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.item.material.SerendustryMaterials.SiliconCarbide;
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

        CHEMICAL_RECIPES.recipeBuilder()
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
