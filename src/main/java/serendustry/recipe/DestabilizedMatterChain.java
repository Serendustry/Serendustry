package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static serendustry.item.SerendustryMetaItems.QUANTUM_ANOMALY;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryRecipeMaps.LABORATORY_RECIPES;

import gregtech.api.fluids.store.FluidStorageKeys;

public class DestabilizedMatterChain {

    public static void init() {
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Thaumium)
                .fluidInputs(Magic2.getFluid(1000))
                .fluidOutputs(DestabilizedMatter.getFluid(500))
                .duration(400).EUt(VA[UV]).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(MagnetoResonatic.getFluid(128)).fluidInputs(Xenoxene.getFluid(32))
                .fluidOutputs(AtomicResonanceCatalyst.getFluid(96))
                .duration(50).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(DestabilizedMatter.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
                .fluidOutputs(DestabilizedMatter.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(250).EUt(VA[UV]).buildAndRegister();

        LABORATORY_RECIPES.recipeBuilder()
                .input(dust, AtomicResonanceCatalyst)
                .fluidInputs(DestabilizedMatter.getPlasma(1000))
                .fluidOutputs(ExoticMatter.getPlasma(500), DarkMatter.getPlasma(250), RedMatter.getPlasma(100))
                .requireInside(CHEMICAL_RECIPES, UEV, 1).requireInside(ELECTROLYZER_RECIPES, UEV, 1)
                .duration(1200).EUt(VA[UV]).buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .notConsumable(dust, AtomicResonanceCatalyst)
                .fluidInputs(ExoticMatter.getPlasma(100))
                .fluidOutputs(ExoticMatter.getFluid(100))
                .duration(50).EUt(VA[UV]).buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .notConsumable(dust, AtomicResonanceCatalyst)
                .fluidInputs(DarkMatter.getPlasma(100))
                .fluidOutputs(DarkMatter.getFluid(100))
                .duration(50).EUt(VA[UV]).buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .notConsumable(dust, AtomicResonanceCatalyst)
                .fluidInputs(RedMatter.getPlasma(100))
                .fluidOutputs(RedMatter.getFluid(100))
                .duration(50).EUt(VA[UV]).buildAndRegister();

        // Quantum Anomaly

        LABORATORY_RECIPES.recipeBuilder()
                .input(dust, Neutronium).input(dust, TinAlloy, 4)
                .fluidInputs(AtomicResonanceCatalyst.getFluid(72), ExoticMatter.getFluid(500), DarkMatter.getFluid(250),
                        RedMatter.getFluid(100))
                .output(QUANTUM_ANOMALY)
                .fluidOutputs(ExoticMatter.getPlasma(250), DarkMatter.getPlasma(125), RedMatter.getPlasma(50))
                .requireInside(LASER_ENGRAVER_RECIPES, UV, 1)
                .duration(600).EUt(VA[UV]).buildAndRegister();

        // Kerr Black Hole

        LABORATORY_RECIPES.recipeBuilder()
                .input(stickLong, TengamAttuned, 2).input(dust, RadoxPolymer).input(dust, TinAlloy, 4)
                .fluidInputs(AtomicResonanceCatalyst.getFluid(144), ExoticMatter.getFluid(1000),
                        DarkMatter.getFluid(500), RedMatter.getFluid(200))
                .output(stickLong, KerrBlackHole)
                .fluidOutputs(ExoticMatter.getPlasma(500), DarkMatter.getPlasma(250), RedMatter.getPlasma(100))
                .requireInside(FLUID_SOLIDFICATION_RECIPES, UIV, 1)
                .duration(1200).EUt(VA[UXV]).buildAndRegister();
    }
}
