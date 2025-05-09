package serendustry.machine;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.recipes.RecipeBuilder;
import gregtech.api.recipes.recipeproperties.CleanroomProperty;
import gregtech.api.recipes.recipeproperties.RecipeProperty;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlasmaFoundryRecipeBuilder extends RecipeBuilder<PlasmaFoundryRecipeBuilder> {

    private final List<ItemStack> validCatalysts = new ArrayList<>();

    public PlasmaFoundryRecipeBuilder() {}

    public PlasmaFoundryRecipeBuilder(RecipeBuilder<PlasmaFoundryRecipeBuilder> recipeBuilder) {
        super(recipeBuilder);
    }

    public PlasmaFoundryRecipeBuilder foundryCatalyst(MetaItem<?>.MetaValueItem... items) {
        for (MetaItem<?>.MetaValueItem item : items) {
            validCatalysts.add(item.getStackForm());
        }
        return this;
    }

    public PlasmaFoundryRecipeBuilder foundryCatalyst(ItemStack... items) {
        validCatalysts.addAll(Arrays.asList(items));
        return this;
    }

    @Override
    public PlasmaFoundryRecipeBuilder copy() {
        return new PlasmaFoundryRecipeBuilder(this);
    }

    @Override
    public boolean applyProperty(@Nonnull String key, @Nullable Object value) {
        if (key.equals(PlasmaFoundryCatalystProperty.KEY)) {
            return applyProperty(PlasmaFoundryCatalystProperty.getInstance(), value);
        }
        if (key.equals(CleanroomProperty.KEY)) return false; // this should not be in the cleanroom,
        return super.applyProperty(key, value);
    }

    @Override
    public boolean applyProperty(@Nonnull RecipeProperty<?> property, @Nullable Object value) {
        if (property == CleanroomProperty.getInstance()) return false; // this should not be in the cleanroom
        return super.applyProperty(property, value);
    }

    @Override
    public void buildAndRegister() {
        super.applyProperty(PlasmaFoundryCatalystProperty.getInstance(), validCatalysts.toArray(new ItemStack[0]));
        super.buildAndRegister();
    }
}
