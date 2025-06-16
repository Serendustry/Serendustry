package serendustry.recipe;

import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.unification.material.Materials.Endstone;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Oganesson;
import static gregtech.api.unification.material.Materials.SterileGrowthMedium;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static serendustry.item.material.SerendustryMaterials.Dragonblood;
import static serendustry.machine.SerendustryRecipeMaps.ACR_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.LABORATORY_RECIPES;

import net.minecraft.init.Blocks;

import gregtech.api.recipes.RecipeMaps;

public class DragonEggRecipes {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Endstone, 64)
                .input(dust, Neutronium, 16)
                .fluidInputs(SterileGrowthMedium.getFluid(2000))
                .output(Blocks.DRAGON_EGG)
                .duration(20 * 128).EUt(VA[UHV]).buildAndRegister();

        // 10 Diff Pump + 17 Lq Cooler
        // End: 2 Diff Pump + 19 Lq Cooler
        // todo possible only in end?
        ACR_RECIPES.recipeBuilder()
                .temperature(10, 30)
                .pressure(10, 15)
                .input(Blocks.DRAGON_EGG)
                .input(dust, Oganesson)
                .fluidInputs(SterileGrowthMedium.getFluid(1000))
                .output(Blocks.DRAGON_EGG, 2)
                .duration(20 * 16).EUt(VA[UHV]).buildAndRegister();

        LABORATORY_RECIPES.recipeBuilder()
                .input(Blocks.DRAGON_EGG, 4)
                .fluidOutputs(Dragonblood.getFluid(144))
                .requireInside(RecipeMaps.MACERATOR_RECIPES, UEV, 1)
                .requireInside(RecipeMaps.CUTTER_RECIPES, UEV, 1)
                .duration(250).EUt(VA[UIV]).buildAndRegister();
    }
}
