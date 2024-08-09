package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.FUSION_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static serendustry.item.material.SerendustryMaterials.*;

public class LargeAlloySmelterRecipes {

    public static void init() {
        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Dysprosium.getFluid(16)).fluidInputs(Indium.getFluid(16))
                .fluidOutputs(Moscovium.getFluid(16))
                .duration(32).EUt(VA[ZPM]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Erbium.getFluid(16)).fluidInputs(Palladium.getFluid(16))
                .fluidOutputs(Flerovium.getFluid(16))
                .duration(32).EUt(VA[ZPM]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Gold.getFluid(128)).fluidInputs(Thaumium.getFluid(128))
                .fluidOutputs(InfusedGold.getFluid(64))
                .duration(50).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(128)).fluidInputs(TinAlloy.getFluid(64))
                .fluidOutputs(Water.getPlasma(64))
                .duration(100).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Aluminium.getFluid(512)).fluidInputs(Americium.getFluid(196))
                .fluidOutputs(Aluminum.getFluid(64))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Aluminum.getFluid(16)).fluidInputs(Europium.getFluid(16))
                .fluidOutputs(Aluminium.getFluid(1024))
                .duration(50).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Uranium238.getFluid(128)).fluidInputs(Neutronium.getFluid(64))
                .fluidOutputs(TastyNeutronium.getFluid(32))
                .duration(260).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(ChargedDraconium.getFluid(64)).fluidInputs(TastyNeutronium.getFluid(32))
                .fluidOutputs(AwakenedDraconium.getFluid(32))
                .duration(260).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(InfinityCatalyst.getFluid(128)).fluidInputs(TastyNeutronium.getFluid(64))
                .fluidOutputs(Infinity.getFluid(32))
                .duration(400).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();
    }
}
