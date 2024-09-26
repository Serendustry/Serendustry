package serendustry.machine;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;

public class SerendustryRecipeMaps {

    public static final RecipeMapIndustrialLaboratory LABORATORY_RECIPES = new RecipeMapIndustrialLaboratory(
            "industrial_laboratory", 6, 6, 6, 6, false);
    public static final RecipeMapTranscendentPlasmaMixer PLASMA_MIXER_RECIPES = new RecipeMapTranscendentPlasmaMixer(
            "transcendent_plasma_mixer", 0, 0, 9, 2, false);
    public static final RecipeMapSpaceElevator SPACE_ELEVATOR_RECIPES = new RecipeMapSpaceElevator("space_elevator", 2,
            4097, 1, 3, false);
    public static final RecipeMapNebulaicNexus NEBULAIC_NEXUS_RECIPES = new RecipeMapNebulaicNexus("nebulaic_nexus", 1,
            1, 6, 1, false);
    public static final RecipeMapPlasmaFoundry PLASMA_FOUNDRY_RECIPES = new RecipeMapPlasmaFoundry("plasma_foundry", 0,
            0, 6, 2, false);
    public static final RecipeMapGiantFractionatingColumn GIANT_FRACTIONATING_COLUMN_RECIPES = new RecipeMapGiantFractionatingColumn("giant_fractionating_column", 0,
            0, 1, 9, false);
    public static final RecipeMapCVDChamber CVD_RECIPES = new RecipeMapCVDChamber("cvd_chamber", 4,
            1, 2, 1, false);
    public static final RecipeMapSonicator SONICATOR_RECIPES = new RecipeMapSonicator("sonicator", 2,
            1, 0, 1, false);
    public static final RecipeMapHPLaserArray HP_LASER_ARRAY_RECIPES = new RecipeMapHPLaserArray("hp_laser_array", 3,
            6, 2, 3, false);
    public static final RecipeMapBiolab BIOLAB_RECIPES = new RecipeMapBiolab("biolab", 2,
            2, 2, 1, false);
    public static final RecipeMap<SimpleRecipeBuilder> DIGESTER_RECIPES = new RecipeMap<>("digester", 3, 9, 3, 3,
            new SimpleRecipeBuilder(), false);
    public static final RecipeMapYggdrasil YGGDRASIL_RECIPES = new RecipeMapYggdrasil("yggdrasil", 1,
            1, 1, 1, false);

    public static void preInit() {
        RecipeMaps.BLAST_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.BLAST_RECIPES.setMaxFluidOutputs(2);
        RecipeMaps.CENTRIFUGE_RECIPES.setMaxOutputs(9);
        RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES.setMaxOutputs(6);
        RecipeMaps.LASER_ENGRAVER_RECIPES.setMaxInputs(4);
        RecipeMaps.LASER_ENGRAVER_RECIPES.setMaxFluidInputs(1);
        RecipeMaps.MIXER_RECIPES.setMaxInputs(9);
        RecipeMaps.MIXER_RECIPES.setMaxFluidInputs(3);
        RecipeMaps.BREWING_RECIPES.setMaxInputs(2);
        RecipeMaps.DISTILLERY_RECIPES.setMaxInputs(1);
        RecipeMaps.MACERATOR_RECIPES.setMaxFluidOutputs(2);
        RecipeMaps.MIXER_RECIPES.setMaxFluidInputs(4);
        RecipeMaps.IMPLOSION_RECIPES.setMaxInputs(6);
        RecipeMaps.ASSEMBLER_RECIPES.setMaxFluidOutputs(1);
        RecipeMaps.CHEMICAL_RECIPES.setMaxFluidInputs(4);
        RecipeMaps.FLUID_HEATER_RECIPES.setMaxInputs(1);
        RecipeMaps.FLUID_HEATER_RECIPES.setMaxOutputs(1);
    }
}
