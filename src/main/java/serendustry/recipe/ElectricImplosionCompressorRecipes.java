package serendustry.recipe;

import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.ingredients.GTRecipeInput;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import serendustry.machine.SerendustryRecipeMaps;

//import java.util.logging.Logger;

public class ElectricImplosionCompressorRecipes {
    //private static final Logger logger = Logger.getLogger(ElectricImplosionCompressorRecipes.class.getName());

    public static void init() {
        for (Recipe recipe : RecipeMaps.IMPLOSION_RECIPES.getRecipeList()) {
            SerendustryRecipeMaps.ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES.recipeBuilder()
                    .inputs(recipe.getInputs().toArray(new GTRecipeInput[0])) // todo remove TNT/Powderbarrel/ITNT
                    .outputs(recipe.getOutputs())
                    .EUt(recipe.getEUt())
                    .duration(Math.max(1, recipe.getDuration() / 2))
                    .buildAndRegister();
        }
    }
}
