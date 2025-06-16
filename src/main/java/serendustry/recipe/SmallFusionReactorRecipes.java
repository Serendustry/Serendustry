package serendustry.recipe;

import static gregtech.api.GTValues.EV;
import static gregtech.api.GTValues.HV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ALLOY_SMELTER_RECIPES;
import static gregtech.api.unification.material.Materials.Aluminium;
import static gregtech.api.unification.material.Materials.Bismuth;
import static gregtech.api.unification.material.Materials.Platinum;
import static gregtech.api.unification.material.Materials.Tellurium;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.ingot;
import static serendustry.item.material.SerendustryMaterials.BismuthTellurite;
import static serendustry.item.material.SerendustryMaterials.Platinium;

public class SmallFusionReactorRecipes {

    public static void init() {
        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Platinum, 3).input(ingot, Aluminium, 1)
                .output(ingot, Platinium, 4)
                .duration(500).EUt(VA[EV]).buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(ingot, Bismuth, 2).input(ingot, Tellurium, 3)
                .output(dust, BismuthTellurite, 5)
                .duration(200).EUt(VA[HV]).buildAndRegister();
    }
}
