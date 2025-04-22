package serendustry.recipe;

import gregtech.api.GTValues;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.ore.OrePrefix;

import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static serendustry.item.material.SerendustryMaterials.*;

public class TengamChain {
    public static void init() {
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, MagneticHolmium)
                .fluidInputs(RadoxPolymer.getFluid(144))
                .output(dust, XenomagneticSeparationCatalyst)
                .duration(180).EUt(VA[GTValues.UEV]).buildAndRegister();

        ELECTROMAGNETIC_SEPARATOR_RECIPES.recipeBuilder()
                .input(dust, TengamRaw)
                .fluidInputs(XenomagneticSeparationCatalyst.getFluid(144))
                .output(dust, TengamResidue)
                .chancedOutput(dust, IronMagnetic, 1000, 0)
                .chancedOutput(dust, SteelMagnetic, 1000, 0)
                .chancedOutput(dust, NeodymiumMagnetic, 1000, 0)
                .chancedOutput(dust, SamariumMagnetic, 1000, 0)
                .chancedOutput(dust, MagneticHolmium, 1000, 0)
                .duration(180).EUt(VA[GTValues.UEV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, TengamResidue)
                .fluidInputs(FluoroantimonicAcid.getFluid(1000))
                .fluidOutputs(TengamSludge.getFluid(1000))
                .chancedOutput(dust, IronMagnetic, 1000, 0)
                .chancedOutput(dust, SteelMagnetic, 1000, 0)
                .chancedOutput(dust, NeodymiumMagnetic, 1000, 0)
                .chancedOutput(dust, SamariumMagnetic, 1000, 0)
                .chancedOutput(dust, MagneticHolmium, 1000, 0)
                .chancedOutput(dust, MagnetoResonatic, 1000, 0)
                .duration(180).EUt(VA[GTValues.UEV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(TengamSludge.getFluid(1000))
                .chancedOutput(dust, AntimonyTengamide, 5000, 0)
                .chancedOutput(dust, IronMagnetic, 1000, 0)
                .chancedOutput(dust, SteelMagnetic, 1000, 0)
                .chancedOutput(dust, NeodymiumMagnetic, 1000, 0)
                .chancedOutput(dust, SamariumMagnetic, 1000, 0)
                .chancedOutput(dust, MagneticHolmium, 1000, 0)
                .chancedOutput(dust, MagnetoResonatic, 1000, 0)
                .duration(180).EUt(VA[GTValues.UEV]).buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, AntimonyTengamide, 2)
                .output(dust, Antimony)
                .output(dust, TengamPurified)
                .duration(180).EUt(VA[GTValues.UEV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Phosphorus)
                .input(dust, SodiumHydroxide, 3)
                .fluidInputs(Water.getFluid(3000))
                .output(dust, SodiumHypophosphite)
                .fluidOutputs(Phosphine.getFluid(1000))
                .duration(180).EUt(VA[GTValues.UEV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Potassium)
                .fluidInputs(Chlorine.getFluid(1000))
                .fluidOutputs(PotassiumChloride.getFluid(1000))
                .duration(60).EUt(VA[GTValues.HV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PotassiumChloride.getFluid(1000), Water.getFluid(1000))
                .output(dust, PotassiumHydroxide)
                .fluidOutputs(Chlorine.getFluid(1000), Hydrogen.getFluid(1000))
                .duration(60).EUt(VA[GTValues.HV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Phosphorus)
                .input(dust, PotassiumHydroxide, 3)
                .fluidInputs(Water.getFluid(3000))
                .output(dust, PotassiumHypophosphite)
                .fluidOutputs(Phosphine.getFluid(1000))
                .duration(180).EUt(VA[GTValues.UEV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, Plutonium241)
                .fluidInputs(Hydrogen.getFluid(2000))
                .output(dust, PlutoniumHydride, 3)
                .duration(180).EUt(VA[GTValues.UEV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, PlutoniumHydride)
                .fluidInputs(Phosphine.getFluid(1000))
                .output(dust, Plutonium3Phosphide)
                .fluidOutputs(Hydrogen.getFluid(3000))
                .duration(180).EUt(VA[GTValues.UEV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Plutonium3Phosphide, 2)
                .input(dust, MagneticHolmium, 2)
                .input(dust, Actinium)
                .fluidInputs(Samarium.getFluid(144 * 8))
                .output(dust, XenomagneticAttunementCatalyst, 8)
                .duration(180).EUt(VA[GTValues.UEV]).buildAndRegister();

        OrePrefix[] parts = { ingot, plate, stick, stickLong, foil };
        float[] cost = { 1.0f, 1.0f, 0.5f, 1.0f, 0.25F };

        for (int i = 0; i < parts.length; i++) {
            POLARIZER_RECIPES.recipeBuilder()
                    .input(parts[i], TengamPurified)
                    .fluidInputs(XenomagneticAttunementCatalyst.getFluid((int) (72 * cost[i])))
                    .output(parts[i], TengamAttuned)
                    .duration((int) (180 * cost[i])).EUt(VA[GTValues.UEV]).buildAndRegister();

            ModHandler.addSmeltingRecipe(OreDictUnifier.get(parts[i], TengamAttuned),
                    OreDictUnifier.get(parts[i], TengamPurified));

            EXTRACTOR_RECIPES.recipeBuilder()
                    .input(parts[i], TengamAttuned)
                    .fluidOutputs(TengamPurified.getFluid((int) (144 * cost[i])))
                    .duration((int) (98 * cost[i])).EUt(VA[GTValues.HV]).buildAndRegister();

            ARC_FURNACE_RECIPES.recipeBuilder()
                    .input(parts[i], TengamAttuned, (int) (1 / cost[i]))
                    .fluidOutputs(Oxygen.getFluid((int) (98 * cost[i])))
                    .output(ingot, TengamPurified)
                    .duration((int) (98 * cost[i])).EUt(VA[GTValues.HV]).buildAndRegister();

            MACERATOR_RECIPES.recipeBuilder()
                    .input(parts[i], TengamAttuned, (int) (1 / cost[i]))
                    .output(dust, TengamPurified)
                    .duration((int) (98 * cost[i])).EUt(VA[GTValues.LV]).buildAndRegister();
        }

    }
}
