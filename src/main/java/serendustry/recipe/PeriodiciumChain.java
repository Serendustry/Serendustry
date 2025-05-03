package serendustry.recipe;

import static gregtech.api.recipes.RecipeMaps.MIXER_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static serendustry.item.material.SerendustryMaterials.*;

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

        MIXER_RECIPES.recipeBuilder().duration(360).EUt(5400000)
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
                .buildAndRegister();
    }
}
