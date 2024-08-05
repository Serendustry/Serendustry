package serendustry.machine;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.common.collect.ImmutableTable;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.recipes.RecipeBuilder;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.recipeproperties.CleanroomProperty;
import gregtech.api.recipes.recipeproperties.RecipeProperty;
import serendustry.machine.LaboratoryProperty.LaboratoryEntry;

public class PlasmaFoundryRecipeBuilder extends RecipeBuilder<PlasmaFoundryRecipeBuilder> {

    private final ImmutableTable.Builder<RecipeMap<?>, Integer, Integer> internalBuilder = ImmutableTable.builder();

    public PlasmaFoundryRecipeBuilder() {}

    public PlasmaFoundryRecipeBuilder(RecipeBuilder<PlasmaFoundryRecipeBuilder> recipeBuilder) {
        super(recipeBuilder);
    }

    @Override
    public PlasmaFoundryRecipeBuilder copy() {
        return new PlasmaFoundryRecipeBuilder(this);
    }

    @Override
    public boolean applyProperty(@Nonnull String key, @Nullable Object value) {
        if (key.equals(PlasmaFoundryCatalystProperty.KEY)) {
            if (value instanceof LaboratoryEntry) {
                return applyProperty(PlasmaFoundryCatalystProperty.getInstance(), value);
            }
            if (value instanceof String) { // from GrS or CT
                String[] stringPair = ((String) value).split(",");
                if (stringPair.length == 2 || stringPair.length == 3) {
                    String catalyst;
                    try {
                        catalyst = Integer.parseInt(stringPair[1].trim());
                    } catch (NumberFormatException e) {
                        return false;
                    }
                    this.plasmaFoundryCatalyst(catalyst);
                    return true;
                } else return false;
            }
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
        super.applyProperty(PlasmaFoundryCatalystProperty.getInstance(), new LaboratoryEntry(internalBuilder));
        super.buildAndRegister();
    }

    public PlasmaFoundryRecipeBuilder plasmaFoundryCatalyst(String catalyst) {
        return plasmaFoundryCatalyst(catalyst);
    }
}
