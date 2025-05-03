package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.common.items.MetaItems.PETRI_DISH;
import static serendustry.item.SerendustryMetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryRecipeMaps.*;

import gregtech.api.recipes.chance.output.ChancedOutputLogic;

public class RadoxChain {

    public static void init() {
        MACERATOR_RECIPES.recipeBuilder()
                .input(SPACEWEED)
                .output(CRUSHED_SPACEWEED)
                .fluidOutputs(Water.getFluid(10), Xenoxene.getFluid(1))
                .duration(20).EUt(VA[ZPM]).buildAndRegister();

        BIOLAB_RECIPES.recipeBuilder()
                .input(CULTURE_STEM_CELL)
                .input(CRUSHED_SPACEWEED, 64)
                .chancedOutput(CULTURE_XENOXENE, 250, 0)
                .chancedOutput(PETRI_DISH, 10000, 0)
                .chancedOutputLogic(ChancedOutputLogic.XOR)
                .fluidOutputs(Xenoxene.getFluid(25))
                .duration(20 * 64).EUt(VA[UHV]).buildAndRegister();

        BIOLAB_RECIPES.recipeBuilder()
                .input(CULTURE_XENOXENE)
                .input(PETRI_DISH_STERILIZED)
                .input(CRUSHED_SPACEWEED, 64)
                .chancedOutput(CULTURE_XENOXENE, 5000, 0)
                .chancedOutput(PETRI_DISH, 10000, 0)
                .chancedOutputLogic(ChancedOutputLogic.XOR)
                .fluidOutputs(Xenoxene.getFluid(25))
                .duration(20 * 64).EUt(VA[UHV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(CULTURE_XENOXENE)
                .input(CRUSHED_SPACEWEED, 16)
                .fluidInputs(Oil.getFluid(1000), Trinium.getFluid(144), Osmium.getFluid(144 * 2))
                .fluidOutputs(Xenoxene.getFluid(250))
                .duration(80).EUt(VA[ZPM]).buildAndRegister();

        DISTILLERY_RECIPES.recipeBuilder()
                .input(dust, Naquadria)
                .fluidInputs(Xenoxene.getFluid(1000))
                .fluidOutputs(RawRadox.getFluid(1000))
                .duration(320).EUt(VA[ZPM]).buildAndRegister();

        GIANT_FRACTIONATING_COLUMN_RECIPES.recipeBuilder()
                .fluidInputs(RawRadox.getFluid(5000))
                .fluidOutputs(Xenoxene.getFluid(100),
                        LightRadox.getFluid(1000),
                        HeavyRadox.getFluid(500),
                        FermentedBiomass.getFluid(200),
                        Biomass.getFluid(200),
                        OilLight.getFluid(400),
                        OilHeavy.getFluid(200),
                        DistilledWater.getFluid(500),
                        Water.getFluid(1000))
                .duration(20 * 45).EUt(VA[UIV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(LightRadox.getFluid(100), Iron.getPlasma(25))
                .fluidOutputs(CrackedLightRadox.getFluid(100))
                .duration(160).EUt(VA[ZPM]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(HeavyRadox.getFluid(100), Nickel.getPlasma(25))
                .fluidOutputs(CrackedHeavyRadox.getFluid(100))
                .duration(320).EUt(VA[ZPM]).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(CrackedLightRadox.getFluid(1000))
                .output(dust, Naquadah)
                .fluidOutputs(PurifiedRadox.getFluid(100), RawRadox.getFluid(900))
                .duration(1600).EUt(VA[ZPM]).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(CrackedHeavyRadox.getFluid(1000))
                .output(dust, NaquadahEnriched)
                .fluidOutputs(PurifiedRadox.getFluid(250), RawRadox.getFluid(750))
                .duration(3200).EUt(VA[ZPM]).buildAndRegister();

        LABORATORY_RECIPES.recipeBuilder()
                .circuitMeta(0)
                .input(dust, Neutronium).input(dust, Tritanium, 4)
                .fluidInputs(PurifiedRadox.getFluid(1500), Argon.getPlasma(500))
                .fluidOutputs(RadoxPolymer.getFluid(1440))
                .requireInside(CHEMICAL_RECIPES, UV, 1)
                .requireInside(CHEMICAL_BATH_RECIPES, UV, 1)
                .duration(1600).EUt(VA[ZPM]).buildAndRegister();

        LABORATORY_RECIPES.recipeBuilder()
                .notConsumable(STELLAR_ESSENCE_OVERWORLD)
                .input(dust, Neutronium).input(dust, Tritanium, 2)
                .fluidInputs(PurifiedRadox.getFluid(1250), Argon.getPlasma(500))
                .fluidOutputs(RadoxPolymer.getFluid(1440))
                .requireInside(CHEMICAL_RECIPES, UV, 1)
                .requireInside(CHEMICAL_BATH_RECIPES, UV, 1)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();
    }
}
