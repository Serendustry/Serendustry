package serendustry.recipe;

import gregtech.api.metatileentity.multiblock.CleanroomType;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.chance.output.ChancedOutputLogic;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.common.blocks.BlockCleanroomCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static serendustry.item.SerendustryMetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.BIOLAB;
import static serendustry.machine.SerendustryRecipeMaps.BIOLAB_RECIPES;

public class BiolabRecipes {
    public static void init() {
        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(PETRI_DISH)
                .fluidInputs(Ethanol.getFluid(500))
                .output(PETRI_DISH_STERILIZED)
                .duration(20 * 2).EUt(VA[IV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(circuit, MarkerMaterials.Tier.UV, 8)
                .input(ROBOT_ARM_ZPM, 4)
                .input(SENSOR_ZPM, 4)
                .inputs(MetaBlocks.CLEANROOM_CASING.getItemVariant(
                                BlockCleanroomCasing.CasingType.FILTER_CASING_STERILE, 32))
                .input(plateDense, NaquadahAlloy, 4)
                .input(cableGtDouble, Europium, 8)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 16), Europium.getFluid(144 * 8))
                .output(BIOLAB)
                .stationResearch(b -> b
                        .researchStack(PETRI_DISH_STERILIZED.getStackForm())
                        .CWUt(32)
                        .EUt(VA[ZPM]))
                .duration(30 * 20).EUt(100000).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Sugar)
                .fluidInputs(SulfuricAcid.getFluid(100))
                .chancedOutput(dust, Glucose, 1000, 0)
                .duration(20 * 4).EUt(VA[LuV]).buildAndRegister();

        FERMENTING_RECIPES.recipeBuilder()
                .fluidInputs(BiologicalWaste.getFluid(1000))
                .fluidOutputs(Ethanol.getFluid(100))
                .duration(20 * 2).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(Items.POTATO)
                .input(dust, Glucose)
                .fluidInputs(DistilledWater.getFluid(1000))
                .fluidOutputs(PotatoDextroseBroth.getFluid(1000))
                .duration(20 * 4).EUt(VA[LuV]).buildAndRegister();

        BIOLAB_RECIPES.recipeBuilder()
                .input(PETRI_DISH_STERILIZED)
                .input(dust, Meat)
                .fluidInputs(PotatoDextroseBroth.getFluid(500))
                .chancedOutput(CULTURE_E_COLI, 1000, 0)
                .chancedOutput(PETRI_DISH, 10000, 0)
                .chancedOutputLogic(ChancedOutputLogic.XOR)
                .duration(20 * 12).EUt(VA[LuV]).buildAndRegister();

        BIOLAB_RECIPES.recipeBuilder()
                .notConsumable(CULTURE_E_COLI)
                .input(PETRI_DISH_STERILIZED)
                .fluidInputs(PotatoDextroseBroth.getFluid(500))
                .chancedOutput(CULTURE_E_COLI, 5000, 0)
                .chancedOutput(PETRI_DISH, 10000, 0)
                .chancedOutputLogic(ChancedOutputLogic.XOR)
                .duration(20 * 4).EUt(VA[LuV]).buildAndRegister();

        BIOLAB_RECIPES.recipeBuilder()
                .notConsumable(CULTURE_E_COLI)
                .input(dust, Sugar)
                .chancedOutput(dust, Glucose, 5000, 0)
                .duration(20 * 2).EUt(VA[LuV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Silver)
                .fluidInputs(Methanol.getFluid(10000), Oxygen.getFluid(10000))
                .fluidOutputs(Formaldehyde.getFluid(10000))
                .duration(20 * 8).EUt(VA[HV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(CULTURE_E_COLI)
                .fluidInputs(Formaldehyde.getFluid(500))
                .output(PETRI_DISH)
                .fluidOutputs(BiologicalWaste.getFluid(1000))
                .duration(20).EUt(VA[IV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(Items.APPLE)
                .fluidOutputs(Methane.getFluid(18), YeastRichMixture.getFluid(50)) // todo : check if this is the right amt of methane
                .duration(20 * 8).EUt(VA[IV]).buildAndRegister();

        BIOLAB_RECIPES.recipeBuilder()
                .input(PETRI_DISH_STERILIZED)
                .fluidInputs(YeastRichMixture.getFluid(500), PotatoDextroseBroth.getFluid(500))
                .chancedOutput(CULTURE_YEAST, 1000, 0)
                .chancedOutput(PETRI_DISH, 10000, 0)
                .chancedOutputLogic(ChancedOutputLogic.XOR)
                .duration(20 * 12).EUt(VA[LuV]).buildAndRegister();

        BIOLAB_RECIPES.recipeBuilder()
                .notConsumable(CULTURE_YEAST)
                .input(PETRI_DISH_STERILIZED)
                .fluidInputs(PotatoDextroseBroth.getFluid(500))
                .chancedOutput(CULTURE_YEAST, 5000, 0)
                .chancedOutput(PETRI_DISH, 10000, 0)
                .chancedOutputLogic(ChancedOutputLogic.XOR)
                .duration(20 * 4).EUt(VA[LuV]).buildAndRegister();

        ModHandler.addSmeltingRecipe(CULTURE_YEAST.getStackForm(), CULTURE_YEAST_RUPTURED.getStackForm());

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(CULTURE_YEAST_RUPTURED)
                .output(PETRI_DISH)
                .output(dust, YeastExtract)
                .fluidOutputs(BiologicalWaste.getFluid(1000))
                .duration(20 * 2).EUt(VA[LuV]).buildAndRegister();

        BIOLAB_RECIPES.recipeBuilder()
                .input(PETRI_DISH_STERILIZED)
                .input(Blocks.WATERLILY)
                .fluidInputs(PotatoDextroseBroth.getFluid(500))
                .chancedOutput(CULTURE_RED_ALGAE, 1000, 0)
                .chancedOutput(PETRI_DISH, 10000, 0)
                .chancedOutputLogic(ChancedOutputLogic.XOR)
                .duration(20 * 12).EUt(VA[LuV]).buildAndRegister();

        BIOLAB_RECIPES.recipeBuilder()
                .notConsumable(CULTURE_RED_ALGAE)
                .input(PETRI_DISH_STERILIZED)
                .fluidInputs(PotatoDextroseBroth.getFluid(500))
                .chancedOutput(CULTURE_RED_ALGAE, 5000, 0)
                .chancedOutput(PETRI_DISH, 10000, 0)
                .chancedOutputLogic(ChancedOutputLogic.XOR)
                .duration(20 * 4).EUt(VA[LuV]).buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .input(CULTURE_RED_ALGAE)
                .fluidInputs(DistilledWater.getFluid(1000))
                .output(CULTURE_RED_ALGAE_BOILED)
                .fluidOutputs(Water.getFluid(1000))
                .duration(20 * 2).EUt(VA[LuV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(CULTURE_RED_ALGAE_BOILED)
                .output(PETRI_DISH)
                .output(dust, Agar)
                .fluidOutputs(BiologicalWaste.getFluid(1000))
                .duration(20 * 2).EUt(VA[LuV]).buildAndRegister();

        BIOLAB_RECIPES.recipeBuilder()
                .input(PETRI_DISH_STERILIZED)
                .input(dust, Osmiridium, 2)
                .fluidInputs(Bacteria.getFluid(1000),
                        SterileGrowthMedium.getFluid(1000))
                .chancedOutput(CULTURE_STEM_CELL, 1000, 0)
                .chancedOutput(PETRI_DISH, 10000, 0)
                .chancedOutputLogic(ChancedOutputLogic.XOR)
                .fluidOutputs(BacterialSludge.getFluid(500))
                .duration(20 * 12).EUt(VA[LuV]).buildAndRegister();

        BIOLAB_RECIPES.recipeBuilder()
                .notConsumable(CULTURE_STEM_CELL)
                .input(PETRI_DISH_STERILIZED)
                .fluidInputs(SterileGrowthMedium.getFluid(500))
                .chancedOutput(CULTURE_STEM_CELL, 5000, 0)
                .chancedOutput(PETRI_DISH, 10000, 0)
                .chancedOutputLogic(ChancedOutputLogic.XOR)
                .duration(20 * 4).EUt(VA[LuV]).buildAndRegister();
    }
}
