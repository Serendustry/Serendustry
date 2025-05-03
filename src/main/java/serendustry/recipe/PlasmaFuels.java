package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static serendustry.item.material.SerendustryMaterials.*;

import gregtech.api.recipes.RecipeMaps;

public class PlasmaFuels {

    public static void init() {
        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(OmniversalLubricant.getPlasma(1))
                .fluidOutputs(OmniversalLubricant.getFluid(1))
                .duration(32)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(Water.getPlasma(1))
                .fluidOutputs(Water.getFluid(1))
                .duration(64)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(AssemblyLine.getPlasma(1))
                .fluidOutputs(AssemblyLine.getFluid(1))
                .duration(256)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(DestabilizedMatter.getPlasma(1))
                .fluidOutputs(DestabilizedMatter.getFluid(1))
                .duration(32)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(ExoticMatter.getPlasma(1))
                .fluidOutputs(ExoticMatter.getFluid(1))
                .duration(48)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(DarkMatter.getPlasma(1))
                .fluidOutputs(DarkMatter.getFluid(1))
                .duration(64)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(RedMatter.getPlasma(1))
                .fluidOutputs(RedMatter.getFluid(1))
                .duration(72)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(Flerovium.getPlasma(1))
                .fluidOutputs(Flerovium.getFluid(1))
                .duration(32)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(Phosphorus.getPlasma(1))
                .fluidOutputs(Phosphorus.getFluid(1))
                .duration(32)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(Protactinium.getPlasma(1))
                .fluidOutputs(Protactinium.getFluid(1))
                .duration(32)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(Redstone.getPlasma(1))
                .fluidOutputs(Redstone.getFluid(1))
                .duration(32)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(Glass.getPlasma(1))
                .fluidOutputs(Glass.getFluid(1))
                .duration(32)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(Lead.getPlasma(1))
                .fluidOutputs(Lead.getFluid(1))
                .duration(32)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(Periodicium.getPlasma(1))
                .fluidOutputs(Periodicium.getFluid(1))
                .duration(48)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(Infinity.getPlasma(1))
                .fluidOutputs(Infinity.getFluid(1))
                .duration(48)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(Shirabon.getPlasma(1))
                .fluidOutputs(Shirabon.getFluid(1))
                .duration(64)
                .EUt((int) V[EV])
                .buildAndRegister();
    }
}
