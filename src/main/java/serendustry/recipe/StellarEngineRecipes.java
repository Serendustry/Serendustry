package serendustry.recipe;

import static gregtech.api.GTValues.MAX;
import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.*;
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
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_END;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_NETHER;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_OVERWORLD;
import static serendustry.item.material.SerendustryMaterials.AwakenedDraconium;
import static serendustry.item.material.SerendustryMaterials.DeepDarkSteel;
import static serendustry.item.material.SerendustryMaterials.Dragonblood;
import static serendustry.item.material.SerendustryMaterials.HalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.Realitium;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.item.material.SerendustryMaterials.Trilithium;
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
                .input(gemExquisite, Trilithium, 64)
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
                        Dragonblood.getFluid(144 * 64))
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
        Material[] materials3 = { Germanium, Selenium, Bromine, Rubidium, Rhenium, Thallium, Flerovium, Moscovium,
                Tennessine, Oganesson };

        SimpleRecipeBuilder builder = STELLAR_ENGINE_RECIPES.recipeBuilder();
        builder.input(STELLAR_ESSENCE_OVERWORLD);
        for (Material material : materials) {
            // Whether to measure by ingots or buckets
            boolean isSolid = material.hasProperty(PropertyKey.DUST) || material.hasProperty(PropertyKey.INGOT) ||
                    material.hasProperty(PropertyKey.GEM);

            builder.fluidOutputs(material.getPlasma(isSolid ? 36_000_000 : 250_000_000)); // 250,000 ingots
        }
        builder.fluidOutputs(Realitium.getFluid(250))
                .duration(20 * 60 * 60 * 8)
                .EUt((int) GTValues.V[MAX])
                // .duration(20 * 60 * 60 / 4)
                // .EUt(GTValues.V[UIV] * 4096); // todo
                .buildAndRegister();

        builder = STELLAR_ENGINE_RECIPES.recipeBuilder();
        builder.input(STELLAR_ESSENCE_NETHER);
        for (Material material : materials2) {
            boolean isSolid = material.hasProperty(PropertyKey.DUST) || material.hasProperty(PropertyKey.INGOT) ||
                    material.hasProperty(PropertyKey.GEM);

            builder.fluidOutputs(material.getPlasma(isSolid ? 36_000_000 : 250_000_000));
        }
        builder.fluidOutputs(Realitium.getFluid(1500))
                .duration(20 * 60 * 60 * 32)
                .EUt((int) GTValues.V[MAX])
                // .duration(20 * 60 * 60)
                // .EUt(GTValues.V[UIV] * 4096); // todo
                .buildAndRegister();

        builder = STELLAR_ENGINE_RECIPES.recipeBuilder();
        builder.input(STELLAR_ESSENCE_END);
        for (Material material : materials3) {
            boolean isSolid = material.hasProperty(PropertyKey.DUST) || material.hasProperty(PropertyKey.INGOT) ||
                    material.hasProperty(PropertyKey.GEM);

            builder.fluidOutputs(material.getPlasma(isSolid ? 36_000_000 : 250_000_000));
        }
        builder.fluidOutputs(Realitium.getFluid(9000))
                .duration(20 * 60 * 60 * 128)
                .EUt((int) GTValues.V[MAX])
                // .duration(20 * 60 * 60 * 4)
                // .EUt(GTValues.V[UIV] * 4096); // todo
                .buildAndRegister();

        /*
         * Realitium/run: 250; 1,500; 9,000
         * EHK/run: 118.008; 708.048; 4,248.2875
         * Total EU/run: 2.473e15 (2.4 Quadrillion); 9.895e15; 3.958e16 (39.5 Quadrillion)
         * 
         * With commented duration and EUt:
         * UIV 4,096A Laser: 0 OCs (137,438,953,500 EU/t)
         * Durations: 900s; 3,600s; 14,400s
         * Realitium/s: 0.277; 0.416; 0.625
         * s/EHK: 7.648; 5.092; 3.389
         * Other outputs/s:
         * Fluid: 27,777.777L/s; 69,444.44L/s; 17,361.11L/s
         * Solid: 277.77I/s; 69.44I/s; 17.36I/s
         * 
         * UXV 4,096A Laser: 1 POC (549,755,813,600 EU/t)
         * Durations: 225s; 900s; 3,600s
         * Realitium/s: 1.108; 1.664; 2.5
         * s/EHK: 1.912; 1.273; 0.8474
         */
    }
}
