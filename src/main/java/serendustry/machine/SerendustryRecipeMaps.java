package serendustry.machine;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;

public class SerendustryRecipeMaps {

    public static final RecipeMapIndustrialLaboratory LABORATORY_RECIPES = new RecipeMapIndustrialLaboratory(
            "industrial_laboratory", 6, 6, 6, 6, false);
    public static final RecipeMap<SimpleRecipeBuilder> PLASMA_MIXER_RECIPES = new RecipeMap<>(
            "transcendent_plasma_mixer", 0, 0, 9, 2, new SimpleRecipeBuilder(), false);
    public static final RecipeMap<SimpleRecipeBuilder> SPACE_ELEVATOR_RECIPES = new RecipeMap<>("space_elevator", 2,
            30000, 1, 3, new SimpleRecipeBuilder(), false);
    public static final RecipeMap<SimpleRecipeBuilder> NEBULAIC_NEXUS_RECIPES = new RecipeMap<>("nebulaic_nexus", 2, 1,
            6, 2, new SimpleRecipeBuilder(), false);
    public static final RecipeMapPlasmaFoundry PLASMA_FOUNDRY_RECIPES = new RecipeMapPlasmaFoundry("plasma_foundry", 0,
            0, 6, 2, false);
    public static final RecipeMap<SimpleRecipeBuilder> GIANT_FRACTIONATING_COLUMN_RECIPES = new RecipeMap<>(
            "giant_fractionating_column", 0, 0, 1, 9, new SimpleRecipeBuilder(), false);
    public static final RecipeMap<SimpleRecipeBuilder> CVD_RECIPES = new RecipeMap<>("cvd_chamber", 4, 1, 2, 1,
            new SimpleRecipeBuilder(), false);
    public static final RecipeMap<SimpleRecipeBuilder> SONICATOR_RECIPES = new RecipeMap<>("sonicator", 3, 1, 1, 1,
            new SimpleRecipeBuilder(), false);
    public static final RecipeMap<SimpleRecipeBuilder> HP_LASER_ARRAY_RECIPES = new RecipeMap<>("hp_laser_array", 3, 6,
            2, 3, new SimpleRecipeBuilder(), false);
    public static final RecipeMap<SimpleRecipeBuilder> BIOLAB_RECIPES = new RecipeMap<>("biolab", 3, 2, 2, 1,
            new SimpleRecipeBuilder(), false);
    public static final RecipeMap<SimpleRecipeBuilder> DIGESTER_RECIPES = new RecipeMap<>("digester", 3, 9, 3, 3,
            new SimpleRecipeBuilder(), false);
    public static final RecipeMap<SimpleRecipeBuilder> YGGDRASIL_RECIPES = new RecipeMap<>("yggdrasil", 1, 1, 1, 1,
            new SimpleRecipeBuilder(), false);
    public static final RecipeMap<SimpleRecipeBuilder> STELLAR_INCUBATOR_RECIPES = new RecipeMap<>("stellar_incubator",
            3, 1, 3, 0, new SimpleRecipeBuilder(), false);
    public static final RecipeMap<SimpleRecipeBuilder> DEHYDRATOR_RECIPES = new RecipeMap<>("dehydrator", 0, 9, 1, 0,
            new SimpleRecipeBuilder(), false);
    public static final RecipeMap<SimpleRecipeBuilder> STELLAR_ENGINE_RECIPES = new RecipeMap<>("stellar_engine", 1, 0,
            0, 32, new SimpleRecipeBuilder(), false);
    public static final RecipeMapPlasmaCondenser PLASMA_CONDENSER_RECIPES = new RecipeMapPlasmaCondenser("plasma_condenser", 0, 0, 2, 1, false);
    public static final RecipeMap<SimpleRecipeBuilder> ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES = new RecipeMap<>(
            "electric_implosion_compressor", 6, 2, 0, 0, new SimpleRecipeBuilder(), false);
    /*
     * public static final RecipeMap<SimpleRecipeBuilder> ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES = new
     * RecipeMapBuilder<>("electric_implosion_compressor",
     * new SimpleRecipeBuilder().duration(1).EUt(GTValues.VA[GTValues.UEV]))
     * .itemInputs(2)
     * .itemOutputs(2)
     * .sound(SoundEvents.ENTITY_GENERIC_EXPLODE)
     * .build();
     */

    public static void preInit() {
        RecipeMaps.BLAST_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.BLAST_RECIPES.setMaxFluidOutputs(2);
        RecipeMaps.CENTRIFUGE_RECIPES.setMaxOutputs(9);
        RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES.setMaxFluidInputs(1);
        RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES.setMaxOutputs(6);
        RecipeMaps.POLARIZER_RECIPES.setMaxFluidInputs(1);
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
        RecipeMaps.FLUID_HEATER_RECIPES.setMaxInputs(2);
        RecipeMaps.FLUID_HEATER_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.FLUID_HEATER_RECIPES.setMaxOutputs(1);
        RecipeMaps.FLUID_HEATER_RECIPES.setMaxFluidOutputs(2);
    }
}
