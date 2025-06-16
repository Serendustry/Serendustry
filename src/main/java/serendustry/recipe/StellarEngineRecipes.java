package serendustry.recipe;

import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.UXV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.Aluminium;
import static gregtech.api.unification.material.Materials.Antimony;
import static gregtech.api.unification.material.Materials.Argon;
import static gregtech.api.unification.material.Materials.Arsenic;
import static gregtech.api.unification.material.Materials.Beryllium;
import static gregtech.api.unification.material.Materials.Bismuth;
import static gregtech.api.unification.material.Materials.Boron;
import static gregtech.api.unification.material.Materials.Bromine;
import static gregtech.api.unification.material.Materials.Cadmium;
import static gregtech.api.unification.material.Materials.Calcium;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.Chlorine;
import static gregtech.api.unification.material.Materials.Chrome;
import static gregtech.api.unification.material.Materials.Cobalt;
import static gregtech.api.unification.material.Materials.Copper;
import static gregtech.api.unification.material.Materials.Flerovium;
import static gregtech.api.unification.material.Materials.Fluorine;
import static gregtech.api.unification.material.Materials.Gallium;
import static gregtech.api.unification.material.Materials.Germanium;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.Hafnium;
import static gregtech.api.unification.material.Materials.Helium;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.Indium;
import static gregtech.api.unification.material.Materials.Iridium;
import static gregtech.api.unification.material.Materials.Iron;
import static gregtech.api.unification.material.Materials.Krypton;
import static gregtech.api.unification.material.Materials.Lead;
import static gregtech.api.unification.material.Materials.Lithium;
import static gregtech.api.unification.material.Materials.Magnesium;
import static gregtech.api.unification.material.Materials.Mercury;
import static gregtech.api.unification.material.Materials.Molybdenum;
import static gregtech.api.unification.material.Materials.Moscovium;
import static gregtech.api.unification.material.Materials.Neon;
import static gregtech.api.unification.material.Materials.Neptunium;
import static gregtech.api.unification.material.Materials.Nickel;
import static gregtech.api.unification.material.Materials.Niobium;
import static gregtech.api.unification.material.Materials.Nitrogen;
import static gregtech.api.unification.material.Materials.Oganesson;
import static gregtech.api.unification.material.Materials.Osmium;
import static gregtech.api.unification.material.Materials.Oxygen;
import static gregtech.api.unification.material.Materials.Palladium;
import static gregtech.api.unification.material.Materials.Phosphorus;
import static gregtech.api.unification.material.Materials.Platinum;
import static gregtech.api.unification.material.Materials.Plutonium239;
import static gregtech.api.unification.material.Materials.Plutonium241;
import static gregtech.api.unification.material.Materials.Potassium;
import static gregtech.api.unification.material.Materials.Radon;
import static gregtech.api.unification.material.Materials.Rhenium;
import static gregtech.api.unification.material.Materials.Rhodium;
import static gregtech.api.unification.material.Materials.Rubidium;
import static gregtech.api.unification.material.Materials.Ruthenium;
import static gregtech.api.unification.material.Materials.Scandium;
import static gregtech.api.unification.material.Materials.Selenium;
import static gregtech.api.unification.material.Materials.Silicon;
import static gregtech.api.unification.material.Materials.Silver;
import static gregtech.api.unification.material.Materials.Sodium;
import static gregtech.api.unification.material.Materials.Sulfur;
import static gregtech.api.unification.material.Materials.Tantalum;
import static gregtech.api.unification.material.Materials.Tennessine;
import static gregtech.api.unification.material.Materials.Thallium;
import static gregtech.api.unification.material.Materials.Thorium;
import static gregtech.api.unification.material.Materials.Tin;
import static gregtech.api.unification.material.Materials.Titanium;
import static gregtech.api.unification.material.Materials.Tungsten;
import static gregtech.api.unification.material.Materials.Uranium238;
import static gregtech.api.unification.material.Materials.Vanadium;
import static gregtech.api.unification.material.Materials.Xenon;
import static gregtech.api.unification.material.Materials.Yttrium;
import static gregtech.api.unification.material.Materials.Zinc;
import static gregtech.api.unification.ore.OrePrefix.cableGtDouble;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.gear;
import static gregtech.api.unification.ore.OrePrefix.gemExquisite;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.api.unification.ore.OrePrefix.screw;
import static gregtech.api.unification.ore.OrePrefix.wireGtSingle;
import static gregtech.common.items.MetaItems.CONVEYOR_MODULE_UIV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_UIV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UIV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UIV;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_BEYOND;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_END;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_NETHER;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_OVERWORLD;
import static serendustry.item.material.SerendustryMaterials.AwakenedDraconium;
import static serendustry.item.material.SerendustryMaterials.DeepDarkSteel;
import static serendustry.item.material.SerendustryMaterials.Dilithium;
import static serendustry.item.material.SerendustryMaterials.HalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.Realitium;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.machine.SerendustryMetaTileEntities.STELLAR_ENGINE;
import static serendustry.machine.SerendustryMetaTileEntities.STELLAR_INCUBATOR;
import static serendustry.machine.SerendustryRecipeMaps.STELLAR_ENGINE_RECIPES;

import gregtech.api.GTValues;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.PropertyKey;

public class StellarEngineRecipes {

    public static void init() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, AwakenedDraconium, 32)
                .input(gemExquisite, Dilithium, 64)
                .input(circuit, MarkerMaterials.Tier.UIV, 32)
                .input(circuit, MarkerMaterials.Tier.UEV, 64)
                .input(FIELD_GENERATOR_UIV, 16)
                .input(ROBOT_ARM_UIV, 16)
                .input(ELECTRIC_PISTON_UIV, 16)
                .input(CONVEYOR_MODULE_UIV, 16)
                .input(plateDense, HalkoniteSteel, 32)
                .input(plateDense, AwakenedDraconium, 32)
                .input(plateDense, DeepDarkSteel, 32)
                .input(plateDense, Infinity, 32)
                .input(gear, HalkoniteSteel, 32)
                .input(screw, HalkoniteSteel, 64)
                .input(cableGtDouble, Quantium40, 64)
                .input(wireGtSingle, Hypogen, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 64),
                        Hypogen.getFluid(144 * 32),
                        Infinity.getFluid(144 * 64),
                        Indium.getPlasma(144 * 512))
                .output(STELLAR_ENGINE)
                .stationResearch(b -> b
                        .researchStack(STELLAR_INCUBATOR.getStackForm())
                        .CWUt(144)
                        .EUt(VA[UEV]))
                .duration(25600).EUt(VA[UIV]).buildAndRegister();

        Material[] materials = { Hydrogen, Helium, Lithium, Beryllium, Boron, Carbon, Nitrogen, Oxygen, Fluorine,
                Sodium, Magnesium, Aluminium, Silicon, Phosphorus, Sulfur, Chlorine,
                Potassium, Calcium, Chrome, Magnesium, Iron, Cobalt, Nickel, Copper, Zinc, Silver, Tin, Mercury, Lead };
        Material[] materials2 = { Neon, Argon, Scandium, Titanium, Vanadium, Gallium, Arsenic, Krypton, Yttrium,
                Niobium, Molybdenum, Ruthenium, Rhodium, Palladium, Cadmium, Indium, Antimony, Xenon, Hafnium,
                Tantalum, Tungsten, Osmium, Iridium, Platinum, Gold, Bismuth, Radon, Thorium, Uranium238, Plutonium239,
                Plutonium241 };
        Material[] materials3 = { Germanium, Selenium, Bromine, Rubidium, Rhenium, Thallium, Moscovium,
                Tennessine, Oganesson };

        SimpleRecipeBuilder builder = STELLAR_ENGINE_RECIPES.recipeBuilder();
        builder.input(STELLAR_ESSENCE_OVERWORLD);
        for (Material material : materials) {
            // Whether to measure by ingots or buckets
            boolean isSolid = material.hasProperty(PropertyKey.DUST) || material.hasProperty(PropertyKey.INGOT) ||
                    material.hasProperty(PropertyKey.GEM);

            builder.fluidOutputs(material.getPlasma(isSolid ? 36_000_000 : 250_000_000)); // 250,000 ingots / buckets
        }
        builder.fluidOutputs(Realitium.getFluid(250))
                .duration(20 * 60 * 60 / 4 * 4096)
                .EUt(GTValues.VA[UIV])
                .buildAndRegister();

        builder = STELLAR_ENGINE_RECIPES.recipeBuilder();
        builder.input(STELLAR_ESSENCE_NETHER);
        for (Material material : materials2) {
            boolean isSolid = material.hasProperty(PropertyKey.DUST) || material.hasProperty(PropertyKey.INGOT) ||
                    material.hasProperty(PropertyKey.GEM);

            builder.fluidOutputs(material.getPlasma(isSolid ? 36_000_000 : 250_000_000));
        }
        builder.fluidOutputs(Realitium.getFluid(1500))
                .duration(20 * 60 * 60 * 4096)
                .EUt(GTValues.VA[UIV])
                .buildAndRegister();

        builder = STELLAR_ENGINE_RECIPES.recipeBuilder();
        builder.input(STELLAR_ESSENCE_END);
        for (Material material : materials3) {
            boolean isSolid = material.hasProperty(PropertyKey.DUST) || material.hasProperty(PropertyKey.INGOT) ||
                    material.hasProperty(PropertyKey.GEM);

            builder.fluidOutputs(material.getPlasma(isSolid ? 36_000_000 : 250_000_000));
        }
        builder.fluidOutputs(Realitium.getFluid(9000))
                .duration(20 * 60 * 60 * 4 * 4096)
                .EUt(GTValues.VA[UIV])
                .buildAndRegister();

        STELLAR_ENGINE_RECIPES.recipeBuilder()
                .input(STELLAR_ESSENCE_BEYOND)
                .fluidOutputs(Neptunium.getPlasma(36_000_000),
                        Flerovium.getPlasma(36_000_000),
                        Realitium.getFluid(54000))
                .duration(20 * 60 * 60 * 4 * 4096)
                .EUt(GTValues.VA[UXV])
                .buildAndRegister();
        /*
         * Realitium/run: 250; 1,500; 9,000; 54,000
         * EHK/run: 118.008; 708.048; 4,248.2875; 25,489.725
         * Total EU/run: 2.473e15 (2.4 Quadrillion); 9.895e15; 3.958e16 (39.5 Quadrillion); 1.588e17 (158.8 Quadrillion)
         *
         * UIV 4,096A Laser: 6 POCs (137,438,953,500 EU/t)
         * Durations: 900s; 3,600s; 14,400s
         * Realitium/s: 0.277; 0.416; 0.625
         * s/EHK: 7.648; 5.092; 3.389
         * Other outputs/s:
         * Fluid: 27,777.777L/s; 69,444.44L/s; 17,361.11L/s
         * Solid: 277.77I/s; 69.44I/s; 17.36I/s
         * 
         * UXV 4,096A Laser: 7 POCs (6 for beyond) (549,755,813,600 EU/t)
         * Durations: 225s; 900s; 3,600s; 14,400s
         * Realitium/s: 1.108; 1.664; 2.5; 3.75
         * s/EHK: 1.912; 1.273; 0.8474; 0.5649
         */
    }
}
