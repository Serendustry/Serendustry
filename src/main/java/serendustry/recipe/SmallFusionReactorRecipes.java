package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.ALLOY_SMELTER_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.ingot;
import static serendustry.item.material.SerendustryMaterials.*;

public class SmallFusionReactorRecipes {

    public static void init() {
        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Platinum, 3).input(ingot, Aluminium, 1)
                .output(ingot, Platinium, 4)
                .duration(500).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Technetium, 22)
                .output(ingot, Technetium22, 1)
                .duration(1100).EUt(VA[IV] + 100).buildAndRegister();

        /*ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Vanadium, 1).input(ingot, Tellurium, 1)
                .output(ingot, Rhenium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();*/

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Zirconium, 1).input(ingot, Chrome, 1)
                .output(ingot, Gadolinium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Titanium, 1).input(ingot, Germanium, 1)
                .output(ingot, Polonium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Vanadium, 1).input(dust, Phosphorus, 1)
                .output(ingot, Strontium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Niobium, 1).input(dust, Calcium, 1)
                .output(ingot, Promethium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Zinc, 1).input(ingot, Aluminium, 1)
                .output(ingot, Technetium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Cobalt, 1).input(ingot, Technetium22, 1)
                .output(ingot, Ytterbium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(dust, Magnesium, 1).input(ingot, Manganese, 1)
                .output(ingot, Rubidium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Magnesium, 1).input(ingot, Zirconium, 1)
                .output(ingot, Tellurium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Iron, 1).input(ingot, Silicon, 1)
                .output(ingot, Zirconium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Scandium, 1).input(dust, Sodium, 1)
                .output(ingot, Germanium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(dust, Boron, 1).input(dust, Sulfur, 1)
                .output(ingot, Scandium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Rhodium, 1).input(ingot, Palladium, 1)
                .output(ingot, Protactinium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Chrome, 1).input(ingot, Technetium22, 1)
                .output(ingot, Holmium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Niobium, 1).input(ingot, Silver, 1)
                .output(ingot, Radium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Technetium22, 1).input(ingot, Ruthenium, 1)
                .output(ingot, Francium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Rhodium, 1).input(dust, Calcium, 1)
                .output(ingot, Terbium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Yttrium, 1).input(ingot, Zinc, 1)
                .output(ingot, Thulium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Palladium, 1).input(ingot, Manganese, 1)
                .output(ingot, Lutetium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Molybdenum, 1).input(ingot, Iron, 1)
                .output(ingot, Erbium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Chrome, 1).input(ingot, Molybdenum, 1)
                .output(ingot, Dysprosium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Silver, 1).input(dust, Magnesium, 1)
                .output(ingot, Praseodymium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Tantalum, 1).input(dust, Sulfur, 1)
                .output(ingot, Actinium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Osmium, 1).input(dust, Calcium, 1)
                .output(ingot, Curium, 1)
                .duration(200).EUt(VA[LuV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Tungsten, 1).input(ingot, Vanadium, 1)
                .output(ingot, Berkelium, 1)
                .duration(200).EUt(VA[LuV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Zirconium, 1).input(ingot, Iodine, 1)
                .output(ingot, Neptunium, 1)
                .duration(200).EUt(VA[LuV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Cadmium, 1).input(ingot, Tin, 1)
                .output(ingot, Californium, 1)
                .duration(200).EUt(VA[LuV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Titanium, 1).input(dust, Gallium, 1)
                .output(ingot, Iodine, 1)
                .duration(400).EUt(VA[LuV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Gold, 1).input(dust, Carbon, 1)
                .output(ingot, Astatine, 1)
                .duration(400).EUt(VA[LuV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Yttrium, 1).input(dust, Arsenic, 1)
                .output(ingot, Hafnium, 1)
                .duration(400).EUt(VA[LuV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Chrome, 1).input(ingot, Lanthanum, 1)
                .output(ingot, Thallium, 1)
                .duration(400).EUt(VA[LuV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Yttrium, 1).input(ingot, Neodymium, 1)
                .output(ingot, Einsteinium, 1)
                .duration(300).EUt(VA[ZPM] + 1).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Samarium, 1).input(ingot, Strontium, 1)
                .output(ingot, Fermium, 1)
                .duration(300).EUt(VA[ZPM] + 1).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Tungsten, 1).input(ingot, Cobalt, 1)
                .output(ingot, Mendelevium, 1)
                .duration(300).EUt(VA[ZPM] + 1).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Palladium, 1).input(dust, Barium, 1)
                .output(ingot, Nobelium, 1)
                .duration(400).EUt(VA[ZPM] + 2).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Niobium, 1).input(ingot, Samarium, 1)
                .output(ingot, Lawrencium, 1)
                .duration(400).EUt(VA[ZPM] + 2).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Yttrium, 1).input(ingot, Dysprosium, 1)
                .output(ingot, Dubnium, 1)
                .duration(400).EUt(VA[ZPM] + 2).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Tungsten, 1).input(ingot, Germanium, 1)
                .output(ingot, Seaborgium, 1)
                .duration(400).EUt(VA[ZPM] + 2).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Technetium22, 1).input(ingot, Gadolinium, 1)
                .output(ingot, Bohrium, 1)
                .duration(400).EUt(VA[ZPM] + 2).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Osmium, 1).input(ingot, Germanium, 1)
                .output(ingot, Hassium, 1)
                .duration(400).EUt(VA[ZPM] + 2).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Rhodium, 1).input(ingot, Gadolinium, 1)
                .output(ingot, Meitnerium, 1)
                .duration(400).EUt(VA[ZPM] + 2).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Actinium, 1).input(ingot, Titanium, 1)
                .output(ingot, Roentgenium, 1)
                .duration(400).EUt(VA[ZPM] + 2).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Indium, 1).input(ingot, Europium, 1)
                .output(ingot, Copernicium, 1)
                .duration(400).EUt(VA[ZPM] + 2).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Silver, 1).input(ingot, Dysprosium, 1)
                .output(ingot, Nihonium, 1)
                .duration(400).EUt(VA[ZPM] + 2).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Gold, 1).input(ingot, Rubidium, 1)
                .output(ingot, Livermorium, 1)
                .duration(400).EUt(VA[ZPM] + 2).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Promethium, 1).input(ingot, Technetium22, 1)
                .output(ingot, Rutherfordium, 1)
                .duration(500).EUt(VA[ZPM] + 2).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Bismuth, 2).input(ingot, Tellurium, 3)
                .output(dust, BismuthTellurite, 5)
                .duration(200).EUt(VA[HV]).buildAndRegister();
    }
}
