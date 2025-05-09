package serendustry.recipe;

import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_BATH_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.unification.material.Materials.CarbonMonoxide;
import static gregtech.api.unification.material.Materials.Chloromethane;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.Methanol;
import static gregtech.api.unification.material.Materials.Nitrobenzene;
import static gregtech.api.unification.material.Materials.Phenol;
import static gregtech.api.unification.material.Materials.Salt;
import static gregtech.api.unification.material.Materials.SodiumHydroxide;
import static gregtech.api.unification.material.Materials.Water;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static serendustry.item.material.SerendustryMaterials.Aniline;
import static serendustry.item.material.SerendustryMaterials.Anisole;
import static serendustry.item.material.SerendustryMaterials.Butanol;
import static serendustry.item.material.SerendustryMaterials.FormicAcid;
import static serendustry.item.material.SerendustryMaterials.Gadonanotubes;
import static serendustry.item.material.SerendustryMaterials.LCNS;
import static serendustry.item.material.SerendustryMaterials.MBBA;
import static serendustry.item.material.SerendustryMaterials.Methoxybenzaldehyde;
import static serendustry.item.material.SerendustryMaterials.MethylFormate;
import static serendustry.item.material.SerendustryMaterials.SodiumPhenoxide;
import static serendustry.item.material.SerendustryMaterials.nButylaniline;
import static serendustry.machine.SerendustryRecipeMaps.ACR_RECIPES;

public class LCNSChain {

    public static void init() {
        // 6 Res Heater + 2 Diff Pump
        ACR_RECIPES.recipeBuilder()
                .temperature(470, 570)
                .pressure(70, 120)
                .fluidInputs(Nitrobenzene.getFluid(1000),
                        Hydrogen.getFluid(5000))
                .fluidOutputs(Aniline.getFluid(1000),
                        Water.getFluid(2000))
                .duration(200).EUt(VA[UEV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Aniline.getFluid(5000),
                        Butanol.getFluid(1000))
                .fluidOutputs(nButylaniline.getFluid(1000),
                        Water.getFluid(1000))
                .duration(200 * 5).EUt(VA[UEV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SodiumHydroxide)
                .fluidInputs(Phenol.getFluid(1000))
                .output(dust, SodiumPhenoxide)
                .fluidOutputs(Water.getFluid(1000))
                .duration(200).EUt(VA[UEV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SodiumPhenoxide)
                .fluidInputs(Chloromethane.getFluid(1000))
                .output(dust, Salt)
                .fluidOutputs(Anisole.getFluid(1000))
                .duration(200).EUt(VA[UEV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Methanol.getFluid(1000),
                        CarbonMonoxide.getFluid(1000))
                .fluidOutputs(MethylFormate.getFluid(1000))
                .duration(200).EUt(VA[UEV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(MethylFormate.getFluid(1000),
                        Water.getFluid(1000))
                .fluidOutputs(FormicAcid.getFluid(1000),
                        Methanol.getFluid(1000))
                .duration(200).EUt(VA[UEV]).buildAndRegister();

        // 1 TE Cooler
        ACR_RECIPES.recipeBuilder()
                .temperature(160, 280)
                .pressure(75, 160)
                .fluidInputs(Anisole.getFluid(1000),
                        FormicAcid.getFluid(1000))
                .fluidOutputs(Methoxybenzaldehyde.getFluid(1000),
                        Water.getFluid(1000))
                .duration(200).EUt(VA[UEV]).buildAndRegister();

        // 4 TE Cooler + 2 Diff Pump (194, 73)
        // 4 TE Cooler + 1 Diff Pump + 1 Piston Pump (200, 75) (Also does MXBH)
        ACR_RECIPES.recipeBuilder()
                .temperature(120, 200)
                .pressure(20, 80)
                .fluidInputs(nButylaniline.getFluid(1000),
                        Methoxybenzaldehyde.getFluid(1000))
                .fluidOutputs(MBBA.getFluid(1000),
                        Water.getFluid(3000))
                .duration(200 * 5).EUt(VA[UEV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Gadonanotubes, 8)
                .fluidInputs(MBBA.getFluid(1000))
                .fluidOutputs(LCNS.getFluid(1000))
                .duration(200 * 5).EUt(VA[UEV]).buildAndRegister();
    }
}
