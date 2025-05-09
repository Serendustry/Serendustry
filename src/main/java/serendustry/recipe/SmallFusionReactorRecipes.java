package serendustry.recipe;

import static gregtech.api.GTValues.EV;
import static gregtech.api.GTValues.HV;
import static gregtech.api.GTValues.IV;
import static gregtech.api.GTValues.LuV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.ALLOY_SMELTER_RECIPES;
import static gregtech.api.unification.material.Materials.Actinium;
import static gregtech.api.unification.material.Materials.Aluminium;
import static gregtech.api.unification.material.Materials.Astatine;
import static gregtech.api.unification.material.Materials.Barium;
import static gregtech.api.unification.material.Materials.Berkelium;
import static gregtech.api.unification.material.Materials.Bismuth;
import static gregtech.api.unification.material.Materials.Bohrium;
import static gregtech.api.unification.material.Materials.Cadmium;
import static gregtech.api.unification.material.Materials.Calcium;
import static gregtech.api.unification.material.Materials.Californium;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.Cobalt;
import static gregtech.api.unification.material.Materials.Copernicium;
import static gregtech.api.unification.material.Materials.Curium;
import static gregtech.api.unification.material.Materials.Dubnium;
import static gregtech.api.unification.material.Materials.Dysprosium;
import static gregtech.api.unification.material.Materials.Einsteinium;
import static gregtech.api.unification.material.Materials.Europium;
import static gregtech.api.unification.material.Materials.Fermium;
import static gregtech.api.unification.material.Materials.Francium;
import static gregtech.api.unification.material.Materials.Gadolinium;
import static gregtech.api.unification.material.Materials.Gallium;
import static gregtech.api.unification.material.Materials.Germanium;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.Hassium;
import static gregtech.api.unification.material.Materials.Indium;
import static gregtech.api.unification.material.Materials.Iodine;
import static gregtech.api.unification.material.Materials.Iron;
import static gregtech.api.unification.material.Materials.Lawrencium;
import static gregtech.api.unification.material.Materials.Livermorium;
import static gregtech.api.unification.material.Materials.Magnesium;
import static gregtech.api.unification.material.Materials.Meitnerium;
import static gregtech.api.unification.material.Materials.Mendelevium;
import static gregtech.api.unification.material.Materials.Neodymium;
import static gregtech.api.unification.material.Materials.Neptunium;
import static gregtech.api.unification.material.Materials.Nihonium;
import static gregtech.api.unification.material.Materials.Niobium;
import static gregtech.api.unification.material.Materials.Nobelium;
import static gregtech.api.unification.material.Materials.Osmium;
import static gregtech.api.unification.material.Materials.Palladium;
import static gregtech.api.unification.material.Materials.Platinum;
import static gregtech.api.unification.material.Materials.Polonium;
import static gregtech.api.unification.material.Materials.Promethium;
import static gregtech.api.unification.material.Materials.Radium;
import static gregtech.api.unification.material.Materials.Rhodium;
import static gregtech.api.unification.material.Materials.Roentgenium;
import static gregtech.api.unification.material.Materials.Rubidium;
import static gregtech.api.unification.material.Materials.Ruthenium;
import static gregtech.api.unification.material.Materials.Rutherfordium;
import static gregtech.api.unification.material.Materials.Samarium;
import static gregtech.api.unification.material.Materials.Seaborgium;
import static gregtech.api.unification.material.Materials.Silicon;
import static gregtech.api.unification.material.Materials.Silver;
import static gregtech.api.unification.material.Materials.Strontium;
import static gregtech.api.unification.material.Materials.Technetium;
import static gregtech.api.unification.material.Materials.Tellurium;
import static gregtech.api.unification.material.Materials.Tin;
import static gregtech.api.unification.material.Materials.Titanium;
import static gregtech.api.unification.material.Materials.Tungsten;
import static gregtech.api.unification.material.Materials.Vanadium;
import static gregtech.api.unification.material.Materials.Yttrium;
import static gregtech.api.unification.material.Materials.Zinc;
import static gregtech.api.unification.material.Materials.Zirconium;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.ingot;
import static serendustry.item.material.SerendustryMaterials.BismuthTellurite;
import static serendustry.item.material.SerendustryMaterials.Platinium;
import static serendustry.item.material.SerendustryMaterials.Technetium22;

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

        /*
         * ALLOY_SMELTER_RECIPES.recipeBuilder()
         * .input(ingot, Vanadium, 1).input(ingot, Tellurium, 1)
         * .output(ingot, Rhenium, 1)
         * .duration(200).EUt(VA[EV]).buildAndRegister();
         */

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Titanium, 1).input(ingot, Germanium, 1)
                .output(ingot, Polonium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Zinc, 1).input(ingot, Aluminium, 1)
                .output(ingot, Technetium, 1)
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
                .input(ingot, Niobium, 1).input(ingot, Silver, 1)
                .output(ingot, Radium, 1)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Technetium22, 1).input(ingot, Ruthenium, 1)
                .output(ingot, Francium, 1)
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
