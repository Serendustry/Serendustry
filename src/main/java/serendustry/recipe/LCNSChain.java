package serendustry.recipe;

import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_BATH_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.FLUID_HEATER_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static serendustry.item.material.SerendustryMaterials.*;

public class LCNSChain {

    public static void init() {
        FLUID_HEATER_RECIPES.recipeBuilder()
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

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Anisole.getFluid(1000),
                        FormicAcid.getFluid(1000))
                .fluidOutputs(Methoxybenzaldehyde.getFluid(1000),
                        Water.getFluid(1000))
                .duration(200).EUt(VA[UEV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
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
