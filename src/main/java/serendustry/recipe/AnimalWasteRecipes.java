package serendustry.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static serendustry.item.SerendustryMetaItems.WASTE_FLUID_EXTRACTOR;
import static serendustry.item.SerendustryMetaItems.WASTE_FLUID_EXTRACTOR_FILLED;
import static serendustry.item.material.SerendustryMaterials.*;

import net.minecraft.init.Blocks;

public class AnimalWasteRecipes {

    public static void init() {
        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Polyethylene, 8)
                .input(plate, Bronze, 4)
                .input(stickLong, Brass, 4)
                .input(foil, TinAlloy, 16)
                .output(WASTE_FLUID_EXTRACTOR)
                .duration(90).EUt(24).buildAndRegister();

        CANNER_RECIPES.recipeBuilder()
                .input(WASTE_FLUID_EXTRACTOR_FILLED)
                .output(WASTE_FLUID_EXTRACTOR)
                .duration(20).EUt(24).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(dust, AnimalWaste)
                .fluidInputs(DistilledWater.getFluid(50))
                .output(gem, AnimalWaste)
                .duration(600).EUt(24).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, AnimalWaste, 4)
                .fluidInputs(SulfuricAcid.getFluid(250))
                .chancedOutput(dust, Phosphorus, 2, 2500, 500)
                .chancedOutput(dust, Calcium, 2, 2500, 500)
                .chancedOutput(dustTiny, Copper, 1, 750, 150)
                .chancedOutput(dust, Carbon, 1, 1000, 200)
                .chancedOutput(dust, DriedEarth, 1, 5000, 1000)
                .chancedOutput(dustTiny, AmmoniumNitrate, 1, 250, 50)
                .fluidOutputs(SulfuricApatiteMix.getFluid(50))
                .duration(400).EUt(60).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricApatiteMix.getFluid(5200))
                .fluidOutputs(SulfurousAcid.getFluid(3800),
                        ISHydrochloricAcid.getFluid(1000),
                        ISHydrofluoricAcid.getFluid(400))
                .duration(800).EUt(60).buildAndRegister();

        COMPRESSOR_RECIPES.recipeBuilder()
                .input(dust, DriedEarth, 9)
                .output(Blocks.DIRT)
                .duration(100).EUt(60).buildAndRegister();
    }
}
