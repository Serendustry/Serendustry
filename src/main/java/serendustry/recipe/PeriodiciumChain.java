package serendustry.recipe;

import static gregtech.api.GTValues.UXV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.MIXER_RECIPES;
import static gregtech.api.unification.material.Materials.Actinium;
import static gregtech.api.unification.material.Materials.Aluminium;
import static gregtech.api.unification.material.Materials.Americium;
import static gregtech.api.unification.material.Materials.Antimony;
import static gregtech.api.unification.material.Materials.Argon;
import static gregtech.api.unification.material.Materials.Arsenic;
import static gregtech.api.unification.material.Materials.Astatine;
import static gregtech.api.unification.material.Materials.Barium;
import static gregtech.api.unification.material.Materials.Berkelium;
import static gregtech.api.unification.material.Materials.Beryllium;
import static gregtech.api.unification.material.Materials.Bismuth;
import static gregtech.api.unification.material.Materials.Bohrium;
import static gregtech.api.unification.material.Materials.Boron;
import static gregtech.api.unification.material.Materials.Bromine;
import static gregtech.api.unification.material.Materials.Cadmium;
import static gregtech.api.unification.material.Materials.Caesium;
import static gregtech.api.unification.material.Materials.Calcium;
import static gregtech.api.unification.material.Materials.Californium;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.Cerium;
import static gregtech.api.unification.material.Materials.Chlorine;
import static gregtech.api.unification.material.Materials.Chrome;
import static gregtech.api.unification.material.Materials.Cobalt;
import static gregtech.api.unification.material.Materials.Copernicium;
import static gregtech.api.unification.material.Materials.Copper;
import static gregtech.api.unification.material.Materials.Curium;
import static gregtech.api.unification.material.Materials.Darmstadtium;
import static gregtech.api.unification.material.Materials.Dubnium;
import static gregtech.api.unification.material.Materials.Dysprosium;
import static gregtech.api.unification.material.Materials.Einsteinium;
import static gregtech.api.unification.material.Materials.Erbium;
import static gregtech.api.unification.material.Materials.Europium;
import static gregtech.api.unification.material.Materials.Fermium;
import static gregtech.api.unification.material.Materials.Flerovium;
import static gregtech.api.unification.material.Materials.Fluorine;
import static gregtech.api.unification.material.Materials.Francium;
import static gregtech.api.unification.material.Materials.Gadolinium;
import static gregtech.api.unification.material.Materials.Gallium;
import static gregtech.api.unification.material.Materials.Germanium;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.Hafnium;
import static gregtech.api.unification.material.Materials.Hassium;
import static gregtech.api.unification.material.Materials.Helium;
import static gregtech.api.unification.material.Materials.Holmium;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.Indium;
import static gregtech.api.unification.material.Materials.Iodine;
import static gregtech.api.unification.material.Materials.Iridium;
import static gregtech.api.unification.material.Materials.Iron;
import static gregtech.api.unification.material.Materials.Krypton;
import static gregtech.api.unification.material.Materials.Lanthanum;
import static gregtech.api.unification.material.Materials.Lawrencium;
import static gregtech.api.unification.material.Materials.Lead;
import static gregtech.api.unification.material.Materials.Lithium;
import static gregtech.api.unification.material.Materials.Livermorium;
import static gregtech.api.unification.material.Materials.Lutetium;
import static gregtech.api.unification.material.Materials.Magnesium;
import static gregtech.api.unification.material.Materials.Manganese;
import static gregtech.api.unification.material.Materials.Meitnerium;
import static gregtech.api.unification.material.Materials.Mendelevium;
import static gregtech.api.unification.material.Materials.Mercury;
import static gregtech.api.unification.material.Materials.Molybdenum;
import static gregtech.api.unification.material.Materials.Moscovium;
import static gregtech.api.unification.material.Materials.Neodymium;
import static gregtech.api.unification.material.Materials.Neon;
import static gregtech.api.unification.material.Materials.Neptunium;
import static gregtech.api.unification.material.Materials.Nickel;
import static gregtech.api.unification.material.Materials.Nihonium;
import static gregtech.api.unification.material.Materials.Niobium;
import static gregtech.api.unification.material.Materials.Nitrogen;
import static gregtech.api.unification.material.Materials.Nobelium;
import static gregtech.api.unification.material.Materials.Oganesson;
import static gregtech.api.unification.material.Materials.Osmium;
import static gregtech.api.unification.material.Materials.Oxygen;
import static gregtech.api.unification.material.Materials.Palladium;
import static gregtech.api.unification.material.Materials.Phosphorus;
import static gregtech.api.unification.material.Materials.Platinum;
import static gregtech.api.unification.material.Materials.Plutonium239;
import static gregtech.api.unification.material.Materials.Plutonium241;
import static gregtech.api.unification.material.Materials.Polonium;
import static gregtech.api.unification.material.Materials.Potassium;
import static gregtech.api.unification.material.Materials.Praseodymium;
import static gregtech.api.unification.material.Materials.Promethium;
import static gregtech.api.unification.material.Materials.Protactinium;
import static gregtech.api.unification.material.Materials.Radium;
import static gregtech.api.unification.material.Materials.Radon;
import static gregtech.api.unification.material.Materials.Rhenium;
import static gregtech.api.unification.material.Materials.Rhodium;
import static gregtech.api.unification.material.Materials.Roentgenium;
import static gregtech.api.unification.material.Materials.Rubidium;
import static gregtech.api.unification.material.Materials.Ruthenium;
import static gregtech.api.unification.material.Materials.Rutherfordium;
import static gregtech.api.unification.material.Materials.Samarium;
import static gregtech.api.unification.material.Materials.Scandium;
import static gregtech.api.unification.material.Materials.Seaborgium;
import static gregtech.api.unification.material.Materials.Selenium;
import static gregtech.api.unification.material.Materials.Silicon;
import static gregtech.api.unification.material.Materials.Silver;
import static gregtech.api.unification.material.Materials.Sodium;
import static gregtech.api.unification.material.Materials.Strontium;
import static gregtech.api.unification.material.Materials.Sulfur;
import static gregtech.api.unification.material.Materials.Tantalum;
import static gregtech.api.unification.material.Materials.Technetium;
import static gregtech.api.unification.material.Materials.Tellurium;
import static gregtech.api.unification.material.Materials.Tennessine;
import static gregtech.api.unification.material.Materials.Terbium;
import static gregtech.api.unification.material.Materials.Thallium;
import static gregtech.api.unification.material.Materials.Thorium;
import static gregtech.api.unification.material.Materials.Thulium;
import static gregtech.api.unification.material.Materials.Tin;
import static gregtech.api.unification.material.Materials.Titanium;
import static gregtech.api.unification.material.Materials.Tungsten;
import static gregtech.api.unification.material.Materials.Uranium235;
import static gregtech.api.unification.material.Materials.Uranium238;
import static gregtech.api.unification.material.Materials.Vanadium;
import static gregtech.api.unification.material.Materials.Xenon;
import static gregtech.api.unification.material.Materials.Ytterbium;
import static gregtech.api.unification.material.Materials.Yttrium;
import static gregtech.api.unification.material.Materials.Zinc;
import static gregtech.api.unification.material.Materials.Zirconium;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static serendustry.item.material.SerendustryMaterials.Actinoids;
import static serendustry.item.material.SerendustryMaterials.Alkalis;
import static serendustry.item.material.SerendustryMaterials.Aluminum;
import static serendustry.item.material.SerendustryMaterials.Gases;
import static serendustry.item.material.SerendustryMaterials.Lanthanoids;
import static serendustry.item.material.SerendustryMaterials.LightTransitionMetals;
import static serendustry.item.material.SerendustryMaterials.NobleGases;
import static serendustry.item.material.SerendustryMaterials.NonMetals;
import static serendustry.item.material.SerendustryMaterials.PartialActinoids;
import static serendustry.item.material.SerendustryMaterials.PartialAlkalis;
import static serendustry.item.material.SerendustryMaterials.PartialLanthanoids;
import static serendustry.item.material.SerendustryMaterials.PartialNobleGases;
import static serendustry.item.material.SerendustryMaterials.PartialPostTransitionMetals;
import static serendustry.item.material.SerendustryMaterials.PartialSuperheavies;
import static serendustry.item.material.SerendustryMaterials.Periodicium;
import static serendustry.item.material.SerendustryMaterials.PostTransitionMetals;
import static serendustry.item.material.SerendustryMaterials.PreciousMetals;
import static serendustry.item.material.SerendustryMaterials.RefractoryMetals;
import static serendustry.item.material.SerendustryMaterials.Superheavies;
import static serendustry.item.material.SerendustryMaterials.Technetium22;
import static serendustry.machine.SerendustryRecipeMaps.DISTORTION_ENGINE_RECIPES;

public class PeriodiciumChain {

    public static void init() {
        MIXER_RECIPES.recipeBuilder().duration(270).EUt(250000)
                .input(dust, Ruthenium)
                .input(dust, Rhodium)
                .input(dust, Palladium)
                .input(dust, Silver)
                .input(dust, Rhenium)
                .input(dust, Osmium)
                .input(dust, Iridium)
                .input(dust, Platinum)
                .input(dust, Gold)
                .output(dust, PreciousMetals)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(210).EUt(250000)
                .input(dust, Zirconium)
                .input(dust, Hafnium)
                .input(dust, Niobium)
                .input(dust, Tantalum)
                .input(dust, Molybdenum)
                .input(dust, Tungsten)
                .input(dust, Technetium22)
                .output(dust, RefractoryMetals)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(240).EUt(250000)
                .input(dust, Titanium)
                .input(dust, Vanadium)
                .input(dust, Manganese)
                .input(dust, Chrome)
                .input(dust, Iron)
                .input(dust, Nickel)
                .input(dust, Cobalt)
                .input(dust, Copper)
                .output(dust, LightTransitionMetals)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(420).EUt(250000)
                .input(dust, Lithium)
                .input(dust, Sodium)
                .input(dust, Potassium)
                .input(dust, Rubidium)
                .input(dust, Caesium)
                .input(dust, Francium)
                .output(dust, PartialAlkalis)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(420).EUt(250000)
                .input(dust, PartialAlkalis)
                .input(dust, Beryllium)
                .input(dust, Magnesium)
                .input(dust, Calcium)
                .input(dust, Strontium)
                .input(dust, Barium)
                .input(dust, Radium)
                .input(dust, Scandium)
                .input(dust, Yttrium)
                .output(dust, Alkalis)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(420).EUt(250000)
                .input(dust, Tin)
                .input(dust, Gallium)
                .input(dust, Indium)
                .input(dust, Bismuth)
                .input(dust, Polonium)
                .fluidInputs(Mercury.getFluid(144))
                .output(dust, PartialPostTransitionMetals)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(420).EUt(250000)
                .input(dust, PartialPostTransitionMetals)
                .input(dust, Zinc)
                .input(dust, Cadmium)
                .input(dust, Aluminum)
                .input(dust, Silicon)
                .input(dust, Germanium)
                .input(dust, Antimony)
                .input(dust, Thallium)
                .input(dust, Lead)
                .output(dust, PostTransitionMetals)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(450).EUt(250000)
                .input(dust, Dysprosium)
                .input(dust, Lanthanum)
                .input(dust, Cerium)
                .input(dust, Praseodymium)
                .input(dust, Neodymium)
                .input(dust, Europium)
                .input(dust, Ytterbium)
                .output(dust, PartialLanthanoids)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(450).EUt(250000)
                .input(dust, PartialLanthanoids)
                .input(dust, Samarium)
                .input(dust, Gadolinium)
                .input(dust, Terbium)
                .input(dust, Thulium)
                .input(dust, Holmium)
                .input(dust, Lutetium)
                .input(dust, Promethium)
                .input(dust, Erbium)
                .output(dust, Lanthanoids)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(390).EUt(250000)
                .input(dust, Californium)
                .input(dust, Neptunium)
                .input(dust, Plutonium241)
                .input(dust, Mendelevium)
                .input(dust, Einsteinium)
                .output(dust, PartialActinoids)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(390).EUt(250000)
                .input(dust, PartialActinoids)
                .input(dust, Actinium)
                .input(dust, Thorium)
                .input(dust, Protactinium)
                .input(dust, Uranium235)
                .input(dust, Americium)
                .input(dust, Curium)
                .input(dust, Berkelium)
                .input(dust, Fermium)
                .output(dust, Actinoids)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(450).EUt(250000)
                .input(dust, Oxygen)
                .input(dust, Nitrogen)
                .input(dust, Hydrogen)
                .fluidInputs(Fluorine.getFluid(1000))
                .fluidInputs(Chlorine.getFluid(1000))
                .fluidInputs(Bromine.getFluid(1000))
                .output(dust, Gases)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(450).EUt(250000)
                .input(dust, Boron)
                .input(dust, Carbon)
                .input(dust, Phosphorus)
                .input(dust, Sulfur)
                .input(dust, Arsenic)
                .input(dust, Selenium)
                .input(dust, Tellurium)
                .input(dust, Iodine)
                .input(dust, Astatine)
                .output(dust, NonMetals)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(180).EUt(250000)
                .fluidInputs(Helium.getFluid(1000))
                .fluidInputs(Neon.getFluid(1000))
                .fluidInputs(Argon.getFluid(1000))
                .output(dust, PartialNobleGases)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(180).EUt(250000)
                .input(dust, PartialNobleGases)
                .fluidInputs(Krypton.getFluid(1000))
                .fluidInputs(Xenon.getFluid(1000))
                .fluidInputs(Radon.getFluid(1000))
                .output(dust, NobleGases)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(180).EUt(250000)
                .input(dust, Nobelium)
                .input(dust, Lawrencium)
                .input(dust, Rutherfordium)
                .input(dust, Dubnium)
                .input(dust, Seaborgium)
                .input(dust, Bohrium)
                .input(dust, Hassium)
                .input(dust, Meitnerium)
                .input(dust, Darmstadtium)
                .output(dust, PartialSuperheavies)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder().duration(180).EUt(250000)
                .input(dust, PartialSuperheavies)
                .input(dust, Roentgenium)
                .input(dust, Copernicium)
                .input(dust, Nihonium)
                .input(dust, Flerovium)
                .input(dust, Moscovium)
                .input(dust, Livermorium)
                .input(dust, Tennessine)
                .input(dust, Oganesson)
                .output(dust, Superheavies)
                .buildAndRegister();

        /*MIXER_RECIPES.recipeBuilder().duration(360).EUt(5400000)
                .input(dust, Alkalis)
                .input(dust, RefractoryMetals)
                .input(dust, LightTransitionMetals)
                .input(dust, PreciousMetals)
                .input(dust, PostTransitionMetals)
                .input(dust, Lanthanoids)
                .input(dust, Actinoids)
                .input(dust, Superheavies)
                .input(dust, Gases)
                .fluidInputs(NonMetals.getFluid(144), NobleGases.getFluid(144), TransCataCrude.getFluid(500))
                .output(dust, Periodicium)
                .buildAndRegister();*/

        // You have to use 2x UIV ehatches at first and then can use UXV lasers
        DISTORTION_ENGINE_RECIPES.recipeBuilder()
                .fluidInputs(Hydrogen.getFluid(1000),
                        Helium.getFluid(1000),
                        Lithium.getFluid(144),
                        Beryllium.getFluid(144),
                        Boron.getFluid(144),
                        Carbon.getFluid(144),
                        Nitrogen.getFluid(1000),
                        Oxygen.getFluid(1000),
                        Fluorine.getFluid(1000),
                        Neon.getFluid(1000),
                        Sodium.getFluid(144),
                        Magnesium.getFluid(144),
                        Aluminium.getFluid(144),
                        Silicon.getFluid(144),
                        Phosphorus.getFluid(144),
                        Sulfur.getFluid(144),
                        Chlorine.getFluid(1000),
                        Argon.getFluid(1000),
                        Potassium.getFluid(144),
                        Calcium.getFluid(144),
                        Scandium.getFluid(144),
                        Titanium.getFluid(144),
                        Vanadium.getFluid(144),
                        Chrome.getFluid(144),
                        Manganese.getFluid(144),
                        Iron.getFluid(144),
                        Cobalt.getFluid(144),
                        Nickel.getFluid(144),
                        Copper.getFluid(144),
                        Zinc.getFluid(144),
                        Gallium.getFluid(144),
                        Germanium.getFluid(144),
                        Arsenic.getFluid(144),
                        Selenium.getFluid(144),
                        Bromine.getFluid(1000),
                        Krypton.getFluid(1000),
                        Rubidium.getFluid(144),
                        Strontium.getFluid(144),
                        Yttrium.getFluid(144),
                        Zirconium.getFluid(144),
                        Niobium.getFluid(144),
                        Molybdenum.getFluid(144),
                        Technetium.getFluid(144),
                        Ruthenium.getFluid(144),
                        Rhodium.getFluid(144),
                        Palladium.getFluid(144),
                        Silver.getFluid(144),
                        Cadmium.getFluid(144),
                        Indium.getFluid(144),
                        Tin.getFluid(144),
                        Antimony.getFluid(144),
                        Tellurium.getFluid(144),
                        Iodine.getFluid(144),
                        Xenon.getFluid(1000),
                        Caesium.getFluid(144),
                        Barium.getFluid(144),
                        Lanthanum.getFluid(144),
                        Cerium.getFluid(144),
                        Praseodymium.getFluid(144),
                        Neodymium.getFluid(144),
                        Promethium.getFluid(144),
                        Samarium.getFluid(144),
                        Europium.getFluid(144),
                        Gadolinium.getFluid(144),
                        Terbium.getFluid(144),
                        Dysprosium.getFluid(144),
                        Holmium.getFluid(144),
                        Erbium.getFluid(144),
                        Thulium.getFluid(144),
                        Ytterbium.getFluid(144),
                        Lutetium.getFluid(144),
                        Hafnium.getFluid(144),
                        Tantalum.getFluid(144),
                        Tungsten.getFluid(144),
                        Rhenium.getFluid(144),
                        Osmium.getFluid(144),
                        Iridium.getFluid(144),
                        Platinum.getFluid(144),
                        Gold.getFluid(144),
                        Mercury.getFluid(144),
                        Thallium.getFluid(144),
                        Lead.getFluid(144),
                        Bismuth.getFluid(144),
                        Polonium.getFluid(144),
                        Astatine.getFluid(144),
                        Radon.getFluid(144),
                        Francium.getFluid(144),
                        Radium.getFluid(144),
                        Actinium.getFluid(144),
                        Thorium.getFluid(144),
                        Protactinium.getFluid(144),
                        Uranium238.getFluid(144),
                        Neptunium.getFluid(144),
                        Plutonium239.getFluid(144),
                        Americium.getFluid(144),
                        Curium.getFluid(144),
                        Berkelium.getFluid(144),
                        Californium.getFluid(144),
                        Einsteinium.getFluid(144),
                        Fermium.getFluid(144),
                        Mendelevium.getFluid(144),
                        Nobelium.getFluid(144),
                        Lawrencium.getFluid(144),
                        Rutherfordium.getFluid(144),
                        Dubnium.getFluid(144),
                        Seaborgium.getFluid(144),
                        Bohrium.getFluid(144),
                        Hassium.getFluid(144),
                        Meitnerium.getFluid(144),
                        Darmstadtium.getFluid(144),
                        Roentgenium.getFluid(144),
                        Copernicium.getFluid(144),
                        Nihonium.getFluid(144),
                        Flerovium.getFluid(144),
                        Moscovium.getFluid(144),
                        Livermorium.getFluid(144),
                        Tennessine.getFluid(144),
                        Oganesson.getFluid(144))
                .output(dust, Periodicium)
                .duration(1000).EUt(VA[UXV]).buildAndRegister();
    }
}
