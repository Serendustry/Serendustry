package serendustry.recipe;

import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.BLAST_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.MIXER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.VACUUM_RECIPES;
import static gregtech.api.unification.material.Materials.AceticAcid;
import static gregtech.api.unification.material.Materials.Ammonia;
import static gregtech.api.unification.material.Materials.Borax;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.CarbonDioxide;
import static gregtech.api.unification.material.Materials.CarbonMonoxide;
import static gregtech.api.unification.material.Materials.Chlorine;
import static gregtech.api.unification.material.Materials.Ethenone;
import static gregtech.api.unification.material.Materials.Ethylbenzene;
import static gregtech.api.unification.material.Materials.Ethylene;
import static gregtech.api.unification.material.Materials.HydrochloricAcid;
import static gregtech.api.unification.material.Materials.HydrofluoricAcid;
import static gregtech.api.unification.material.Materials.NitricAcid;
import static gregtech.api.unification.material.Materials.NitricOxide;
import static gregtech.api.unification.material.Materials.NitrogenDioxide;
import static gregtech.api.unification.material.Materials.Oxygen;
import static gregtech.api.unification.material.Materials.Palladium;
import static gregtech.api.unification.material.Materials.Potassium;
import static gregtech.api.unification.material.Materials.SulfuricAcid;
import static gregtech.api.unification.material.Materials.Toluene;
import static gregtech.api.unification.material.Materials.Water;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static serendustry.item.SerendustryMetaItems.LENS_ARRAY_HYPERAMPLIFYING;
import static serendustry.item.material.SerendustryMaterials.Acetaldehyde;
import static serendustry.item.material.SerendustryMaterials.AceticAnhydride;
import static serendustry.item.material.SerendustryMaterials.BenzylChloride;
import static serendustry.item.material.SerendustryMaterials.Benzylamine;
import static serendustry.item.material.SerendustryMaterials.BoronTrifluoride;
import static serendustry.item.material.SerendustryMaterials.BoronTrioxide;
import static serendustry.item.material.SerendustryMaterials.DinitrogenTrioxide;
import static serendustry.item.material.SerendustryMaterials.Glyoxal;
import static serendustry.item.material.SerendustryMaterials.HNIW;
import static serendustry.item.material.SerendustryMaterials.HexabenzylHexaazaisowurtzitane;
import static serendustry.item.material.SerendustryMaterials.NitroniumTetrafluoroborate;
import static serendustry.item.material.SerendustryMaterials.NitrosylTetrafluoroborate;
import static serendustry.item.material.SerendustryMaterials.NitrousAcid;
import static serendustry.item.material.SerendustryMaterials.Potassium40;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.SodiumSulfate;
import static serendustry.item.material.SerendustryMaterials.TetraacetylHexaazaisowurtzitane;
import static serendustry.machine.SerendustryRecipeMaps.ACR_RECIPES;
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

        // 1 Res Heater
        ACR_RECIPES.recipeBuilder()
                .temperature(310, 335)
                .pressure(80, 120)
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

        // 1 Res Heater + 1 Gas Heater
        // 2 Res Heater + 2 Gas Heater + 1 TE Cooler + 2 Diff Pump + 1 Piston Pump (335 85) (Also does Glyoxal!)
        // todo: can it coexist with BETS?
        ACR_RECIPES.recipeBuilder()
                .temperature(335, 350)
                .pressure(85, 140)
                .input(dust, TetraacetylHexaazaisowurtzitane)
                .input(dust, NitroniumTetrafluoroborate, 32)
                .input(dust, NitrosylTetrafluoroborate, 14)
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .output(dust, HNIW, 32)
                .output(dust, Carbon, 4)
                .fluidOutputs(BoronTrifluoride.getFluid(24000),
                        Ethylbenzene.getFluid(2000),
                        CarbonMonoxide.getFluid(2000))
                .duration(200 * 8).EUt(VA[UV]).buildAndRegister();

        HP_LASER_ARRAY_RECIPES.recipeBuilder()
                .notConsumable(LENS_ARRAY_HYPERAMPLIFYING)
                .input(dust, Potassium, 64 * 8)
                .output(dust, Potassium40)
                .duration(24).EUt(VA[UEV]).buildAndRegister();

        ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES.recipeBuilder()
                .input(dust, Potassium40)
                .input(dust, HNIW, 4)
                .output(dust, Quantium40)
                .duration(20).EUt(VA[UEV]).buildAndRegister();
    }
}
