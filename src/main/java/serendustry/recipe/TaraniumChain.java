package serendustry.recipe;

import gregtech.api.GTValues;
import net.minecraft.init.Blocks;

import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.CENTRIFUGE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_BATH_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryRecipeMaps.DEHYDRATOR_RECIPES;

public class TaraniumChain {
    public static void init() {
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Stone, 64) // 64 stone
                .fluidInputs(AquaRegia.getFluid(100))
                .fluidOutputs(TaraniumPoorSludge.getFluid(100))
                .duration(20).EUt(VA[GTValues.UHV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(Blocks.STONE, 64) // 64 stone
                .fluidInputs(AquaRegia.getFluid(100))
                .fluidOutputs(TaraniumPoorSludge.getFluid(100))
                .duration(20).EUt(VA[GTValues.UHV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(Blocks.COBBLESTONE, 64) // 64 stone
                .fluidInputs(AquaRegia.getFluid(100))
                .fluidOutputs(TaraniumPoorSludge.getFluid(100))
                .duration(20).EUt(VA[GTValues.UHV]).buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(TaraniumPoorSludge.getFluid(1000)) // 64*10 = 640 stone
                .output(dust, TaraniumPoorSediment)
                .chancedOutput(dust, Iron, 5000, 0)
                .chancedOutput(dust, Copper, 5000, 0)
                .chancedOutput(dust, Gold, 5000, 0)
                .chancedOutput(dust, Carbon, 5000, 0)
                .chancedOutput(dust, Zinc, 5000, 0)
                .chancedOutput(dust, Lead, 5000, 0)
                .chancedOutput(dust, Silicon, 5000, 0)
                .chancedOutput(dust, Tin, 5000, 0)
                .duration(20*10).EUt(VA[GTValues.UHV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, TaraniumPoorSediment, 8) // 640*8 = 5120 stone
                .fluidInputs(FluoroantimonicAcid.getFluid(100))
                .fluidOutputs(TaraniumRichSludge.getFluid(100))
                .duration(20*10*8).EUt(VA[GTValues.UHV]).buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(TaraniumRichSludge.getFluid(1000)) // 5120*10 = 51200 stone
                .output(dust, TaraniumRichSediment)
                .chancedOutput(dust, Antimony, 5000, 0)
                .chancedOutput(dust, Gallium, 5000, 0)
                .chancedOutput(dust, Arsenic, 5000, 0)
                .chancedOutput(dust, Platinum, 5000, 0)
                .chancedOutput(dust, Aluminium, 5000, 0)
                .chancedOutput(dust, Tungsten, 5000, 0)
                .chancedOutput(dust, Neodymium, 5000, 0)
                .chancedOutput(dust, Germanium, 5000, 0)
                .duration(20*10*8*10).EUt(VA[GTValues.UHV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, TaraniumRichSediment, 8) // 51200*8 = 409600 stone
                .fluidInputs(FluoroantimonicAcid.getFluid(100))
                .output(dust, TaraniumContainingAlloy)
                .duration(20*10*8*10*8).EUt(VA[GTValues.UHV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(TaraniumContainingAlloy.getFluid(144))
                .fluidOutputs(SeparatedTaraniumAlloy.getFluid(144))
                .duration(20*10*8*5*8).EUt(VA[GTValues.UHV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(SeparatedTaraniumAlloy.getFluid(144*8)) // 409600*8=3276800 stone OR 25600*8=204800 stone
                .fluidOutputs(Naquadah.getFluid(144*3),
                        Azbantium.getFluid(144*2),
                        Vibranium.getFluid(144*2),
                        Taranium.getFluid(144))
                .duration(20*10*8*5*8).EUt(VA[GTValues.UHV]).buildAndRegister();

        ELECTROMAGNETIC_SEPARATOR_RECIPES.recipeBuilder()
                .notConsumable(stickLong, TaraniumMagnetic)
                .fluidInputs(TaraniumRichSludge.getFluid(500)) // 5120*5 = 25600 stone
                .output(dust, TaraniumContainingAlloy)
                .duration(20*10*8*5).EUt(VA[GTValues.UHV]).buildAndRegister();


    }
}
