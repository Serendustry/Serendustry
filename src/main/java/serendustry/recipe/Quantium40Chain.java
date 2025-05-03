package serendustry.recipe;

import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.BLAST_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.LARGE_CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.MIXER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.VACUUM_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static serendustry.item.SerendustryMetaItems.LENS_ARRAY_HYPERAMPLIFYING;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_NETHER;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryRecipeMaps.ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.HP_LASER_ARRAY_RECIPES;

public class Quantium40Chain {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Toluene.getFluid(1000),
                        Chlorine.getFluid(2000))
                .fluidOutputs(BenzylChloride.getFluid(1000),
                        HydrochloricAcid.getFluid(1000))
                .duration(200).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(BenzylChloride.getFluid(1000),
                        Ammonia.getFluid(1000))
                .fluidOutputs(Benzylamine.getFluid(1000),
                        HydrochloricAcid.getFluid(1000))
                .duration(200).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ethylene.getFluid(1000),
                        Oxygen.getFluid(1000))
                .fluidOutputs(Acetaldehyde.getFluid(1000))
                .duration(200).EUt(VA[UV]).buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Acetaldehyde.getFluid(1000),
                        NitricAcid.getFluid(1000))
                .fluidOutputs(Glyoxal.getFluid(1000),
                        Ammonia.getFluid(1000),
                        Oxygen.getFluid(2000))
                .duration(200).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Benzylamine.getFluid(6000),
                        Glyoxal.getFluid(3000))
                .output(dust, HexabenzylHexaazaisowurtzitane)
                .fluidOutputs(Water.getFluid(6000))
                .duration(200 * 6).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ethenone.getFluid(1000),
                        AceticAcid.getFluid(1000))
                .fluidOutputs(AceticAnhydride.getFluid(1000))
                .duration(200).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, HexabenzylHexaazaisowurtzitane)
                .input(dust, Palladium)
                .fluidInputs(AceticAnhydride.getFluid(4000),
                        Glyoxal.getFluid(3000))
                .output(dust, TetraacetylHexaazaisowurtzitane)
                .fluidOutputs(Ethylbenzene.getFluid(4000),
                        CarbonDioxide.getFluid(4000))
                .duration(200 * 4).EUt(VA[UV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, Borax)
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .output(dust, BoronTrioxide, 2)
                .output(dust, SodiumSulfate)
                .blastFurnaceTemp(8000)
                .duration(200 * 2).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, BoronTrioxide)
                .fluidInputs(HydrofluoricAcid.getFluid(6000))
                .fluidOutputs(BoronTrifluoride.getFluid(2000),
                        Water.getFluid(3000))
                .duration(200).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(NitricAcid.getFluid(1000),
                        HydrofluoricAcid.getFluid(1000),
                        BoronTrifluoride.getFluid(4000))
                .output(dust, NitroniumTetrafluoroborate, 8)
                .fluidOutputs(Water.getFluid(1000))
                .duration(200 * 2).EUt(VA[UV]).buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(NitricOxide.getFluid(1000),
                        NitrogenDioxide.getFluid(1000))
                .fluidOutputs(DinitrogenTrioxide.getFluid(1000))
                .duration(200).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000),
                        DinitrogenTrioxide.getFluid(1000))
                .fluidOutputs(NitrousAcid.getFluid(1000))
                .duration(200).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(NitrousAcid.getFluid(1000),
                        HydrofluoricAcid.getFluid(1000),
                        BoronTrifluoride.getFluid(4000))
                .output(dust, NitrosylTetrafluoroborate, 7)
                .fluidOutputs(Water.getFluid(1000))
                .duration(200 * 2).EUt(VA[UV]).buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, TetraacetylHexaazaisowurtzitane)
                .input(dust, NitroniumTetrafluoroborate, 32)
                .input(dust, NitrosylTetrafluoroborate, 14)
                .output(dust, HNIW, 32)
                .output(dust, Carbon, 4)
                .fluidOutputs(BoronTrifluoride.getFluid(24000),
                        Ethylbenzene.getFluid(2000),
                        CarbonMonoxide.getFluid(2000))
                .duration(200 * 8).EUt(VA[UV]).buildAndRegister();

        HP_LASER_ARRAY_RECIPES.recipeBuilder()
                .circuitMeta(0)
                .notConsumable(LENS_ARRAY_HYPERAMPLIFYING)
                .input(dust, Potassium, 64 * 8)
                .output(dust, Potassium40)
                .duration(24).EUt(VA[UEV]).buildAndRegister();

        HP_LASER_ARRAY_RECIPES.recipeBuilder()
                .notConsumable(STELLAR_ESSENCE_NETHER)
                .notConsumable(LENS_ARRAY_HYPERAMPLIFYING)
                .input(dust, Potassium, 64 * 6)
                .output(dust, Potassium40)
                .duration(16).EUt(VA[UEV]).buildAndRegister();

        ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES.recipeBuilder()
                .input(dust, Potassium40)
                .input(dust, HNIW, 4)
                .output(dust, Quantium40)
                .duration(20).EUt(VA[UEV]).buildAndRegister();
    }
}
