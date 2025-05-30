package serendustry.recipe;

import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CRACKING_RECIPES;
import static gregtech.api.recipes.RecipeMaps.DISTILLATION_RECIPES;
import static gregtech.api.recipes.RecipeMaps.DISTILLERY_RECIPES;
import static gregtech.api.recipes.RecipeMaps.MACERATOR_RECIPES;
import static gregtech.api.unification.material.Materials.Argon;
import static gregtech.api.unification.material.Materials.Biomass;
import static gregtech.api.unification.material.Materials.DistilledWater;
import static gregtech.api.unification.material.Materials.FermentedBiomass;
import static gregtech.api.unification.material.Materials.Iron;
import static gregtech.api.unification.material.Materials.Naquadah;
import static gregtech.api.unification.material.Materials.NaquadahEnriched;
import static gregtech.api.unification.material.Materials.Naquadria;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Nickel;
import static gregtech.api.unification.material.Materials.Oil;
import static gregtech.api.unification.material.Materials.OilHeavy;
import static gregtech.api.unification.material.Materials.OilLight;
import static gregtech.api.unification.material.Materials.Osmium;
import static gregtech.api.unification.material.Materials.Trinium;
import static gregtech.api.unification.material.Materials.Tritanium;
import static gregtech.api.unification.material.Materials.Water;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.common.items.MetaItems.PETRI_DISH;
import static serendustry.item.SerendustryMetaItems.CRUSHED_SPACEWEED;
import static serendustry.item.SerendustryMetaItems.CULTURE_STEM_CELL;
import static serendustry.item.SerendustryMetaItems.CULTURE_XENOXENE;
import static serendustry.item.SerendustryMetaItems.PETRI_DISH_STERILIZED;
import static serendustry.item.SerendustryMetaItems.SPACEWEED;
import static serendustry.item.material.SerendustryMaterials.CrackedHeavyRadox;
import static serendustry.item.material.SerendustryMaterials.CrackedLightRadox;
import static serendustry.item.material.SerendustryMaterials.HeavyRadox;
import static serendustry.item.material.SerendustryMaterials.LightRadox;
import static serendustry.item.material.SerendustryMaterials.PurifiedRadox;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;
import static serendustry.item.material.SerendustryMaterials.RawRadox;
import static serendustry.item.material.SerendustryMaterials.Xenoxene;
import static serendustry.machine.SerendustryRecipeMaps.ACR_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.BIOLAB_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.GIANT_FRACTIONATING_COLUMN_RECIPES;

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

        // 6 Diff Pump + 6 Lq Cooler
        // End: 1 Diff Pump + 8 Lq Cooler
        ACR_RECIPES.recipeBuilder()
                .temperature(50, 100)
                .pressure(20, 30)
                .input(dust, Neutronium)
                .input(dust, Tritanium, 4)
                .fluidInputs(PurifiedRadox.getFluid(1500),
                        Argon.getPlasma(500))
                .fluidOutputs(RadoxPolymer.getFluid(1440))
                .duration(1600).EUt(VA[ZPM]).buildAndRegister();
    }
}
