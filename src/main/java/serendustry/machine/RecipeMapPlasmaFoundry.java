package serendustry.machine;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.api.util.ItemStackHashStrategy;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import net.minecraft.item.ItemStack;

import static serendustry.item.SerendustryMetaItems.*;

public class RecipeMapPlasmaFoundry extends
        RecipeMap<PlasmaFoundryRecipeBuilder> {
    // not really part of the recipes, but used for uses + machine acceptance
    private final Object2IntMap<ItemStack> catalysts = new Object2IntOpenCustomHashMap<>(ItemStackHashStrategy.builder().compareItem(true).compareDamage(true).build());

    public RecipeMapPlasmaFoundry(String name, int inputs, int outputs, int fluidInputs, int fluidOutputs,
                                  boolean hidden) {
        super(name, inputs, outputs, fluidInputs, fluidOutputs, new PlasmaFoundryRecipeBuilder(), hidden);
    }
    // todo custom page

    public void registerCatalyst(ItemStack stack, int uses) {
        if(uses == 0) {
            catalysts.removeInt(stack);
        } else {
            catalysts.put(stack, uses);
        }
    }

    public boolean isValidCatalyst(ItemStack stack) {
        return catalysts.containsKey(stack);
    }

    public int getCatalystUses(ItemStack stack) {
        return catalysts.getInt(stack);
    }
}
