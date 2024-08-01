package serendustry.machine;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;

public class SerendustryRecipeMaps {

    public static final RecipeMapIndustrialLaboratory LABORATORY_RECIPES = new RecipeMapIndustrialLaboratory(
            "industrial_laboratory", 4, 4, 4, 4, false);
    public static final RecipeMapTranscendentPlasmaMixer PLASMA_MIXER_RECIPES = new RecipeMapTranscendentPlasmaMixer(
            "transcendent_plasma_mixer", 0, 0, 9, 2, false);
    public static final RecipeMapSpaceElevator SPACE_ELEVATOR_RECIPES = new RecipeMapSpaceElevator("space_elevator", 2,
            4096, 1, 3, false);
    public static final RecipeMapNebulaicNexus NEBULAIC_NEXUS_RECIPES = new RecipeMapNebulaicNexus("nebulaic_nexus", 1,
            1, 9, 1, false);
    public static final RecipeMapPlasmaFoundry PLASMA_FOUNDRY_RECIPES = new RecipeMapPlasmaFoundry("plasma_foundry", 0,
            0, 6, 2, false);
    public static final RecipeMap<SimpleRecipeBuilder> DIGESTER_RECIPES = new RecipeMap<>("digester", 3, 9, 3, 3,
            new SimpleRecipeBuilder(), false);

    public static void preInit() {
        RecipeMaps.BLAST_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.BLAST_RECIPES.setMaxFluidOutputs(2);
        RecipeMaps.CENTRIFUGE_RECIPES.setMaxOutputs(9);
        RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES.setMaxOutputs(6);
        RecipeMaps.LASER_ENGRAVER_RECIPES.setMaxInputs(4);
        RecipeMaps.MIXER_RECIPES.setMaxInputs(9);
        RecipeMaps.MIXER_RECIPES.setMaxFluidInputs(3);
        RecipeMaps.BREWING_RECIPES.setMaxInputs(4);
    }
}
