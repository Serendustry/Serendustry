package serendustry.recipe;

import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Material;

import static gregtech.api.GTValues.MAX;
import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.gemExquisite;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.api.unification.ore.OrePrefix.wireGtSingle;
import static gregtech.common.items.MetaItems.CONVEYOR_MODULE_UIV;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UIV;
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
import static serendustry.item.material.SerendustryMaterials.Realitium;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.item.material.SerendustryMaterials.Trilithium;
import static serendustry.machine.SerendustryMetaTileEntities.STELLAR_ENGINE;
import static serendustry.machine.SerendustryMetaTileEntities.STELLAR_INCUBATOR;
import static serendustry.machine.SerendustryRecipeMaps.STELLAR_ENGINE_RECIPES;

public class StellarEngineRecipes {
    public static void init() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, DeepDarkSteel, 32)
                .input(frameGt, AwakenedDraconium, 32)
                .input(gemExquisite, Trilithium, 64)
                .input(FIELD_GENERATOR_UIV, 16)
                .input(ROBOT_ARM_UIV, 16)
                .input(ELECTRIC_PISTON_UIV, 16)
                .input(CONVEYOR_MODULE_UIV, 16)
                .input(ELECTRIC_MOTOR_UIV, 32)
                .input(circuit, MarkerMaterials.Tier.UIV, 32)
                .input(circuit, MarkerMaterials.Tier.UEV, 64)
                .input(plateDense, Neutronium, 64)
                .input(plateDense, HalkoniteSteel, 32)
                .input(plateDense, AwakenedDraconium, 32)
                .input(plateDense, DeepDarkSteel, 32)
                .input(plateDense, Infinity, 32)
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

        Material[] materials = {Hydrogen, Helium, Lithium, Beryllium, Boron, Carbon, Nitrogen, Oxygen, Fluorine, Sodium, Magnesium, Aluminium, Silicon, Phosphorus, Sulfur, Chlorine,
                Potassium, Calcium, Chrome, Magnesium, Iron, Cobalt, Nickel, Copper, Zinc, Silver, Tin, Mercury, Lead};
        Material[] materials2 = {Neon, Argon, Scandium, Titanium, Vanadium, Gallium, Arsenic, Krypton, Yttrium, Niobium, Molybdenum, Ruthenium, Rhodium, Palladium, Cadmium, Indium, Antimony, Xenon, Hafnium,
                Tantalum, Tungsten, Osmium, Iridium, Platinum, Gold, Bismuth, Radon, Thorium, Uranium238, Plutonium239, Plutonium241};
        Material[] materials3 = {Germanium, Selenium, Bromine, Rubidium, Rhenium, Thallium, Flerovium, Moscovium, Tennessine, Oganesson};

        SimpleRecipeBuilder builder = STELLAR_ENGINE_RECIPES.recipeBuilder();
        builder.input(STELLAR_ESSENCE_OVERWORLD);
        for(Material material : materials) {builder.fluidOutputs(material.getPlasma(1_000_000));} //6,944.5 ingots
        builder.fluidOutputs(Realitium.getFluid(1000))
                .duration(20*60*60*8).EUt(VA[MAX]).buildAndRegister();

        builder = STELLAR_ENGINE_RECIPES.recipeBuilder();
        builder.input(STELLAR_ESSENCE_NETHER);
        for(Material material : materials2) {builder.fluidOutputs(material.getPlasma(1_000_000));}
        builder.fluidOutputs(Realitium.getFluid(6000))
                .duration(20*60*60*32).EUt(VA[MAX]).buildAndRegister();

        builder = STELLAR_ENGINE_RECIPES.recipeBuilder();
        builder.input(STELLAR_ESSENCE_END);
        for(Material material : materials3) {builder.fluidOutputs(material.getPlasma(1_000_000));}
        builder.fluidOutputs(Realitium.getFluid(32000))
                .duration(20*60*60*128).EUt(VA[MAX]).buildAndRegister();
    }
}
