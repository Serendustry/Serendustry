package serendustry.machine;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.common.collect.ImmutableTable;

import gregtech.api.recipes.RecipeBuilder;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.recipeproperties.CleanroomProperty;
import gregtech.api.recipes.recipeproperties.RecipeProperty;
import serendustry.machine.LaboratoryProperty.LaboratoryEntry;

public class LaboratoryRecipeBuilder extends RecipeBuilder<LaboratoryRecipeBuilder> {

    private final ImmutableTable.Builder<RecipeMap<?>, Integer, Integer> internalBuilder = ImmutableTable.builder();

    public LaboratoryRecipeBuilder() {}

    public LaboratoryRecipeBuilder(RecipeBuilder<LaboratoryRecipeBuilder> recipeBuilder) {
        super(recipeBuilder);
    }

    @Override
    public LaboratoryRecipeBuilder copy() {
        return new LaboratoryRecipeBuilder(this);
    }

    @Override
    public boolean applyProperty(@Nonnull String key, @Nullable Object value) {
        if (key.equals(LaboratoryProperty.KEY)) {
            if (value instanceof LaboratoryEntry) {
                return applyProperty(LaboratoryProperty.getInstance(), value);
            }
            if (value instanceof String) { // from GrS or CT
                String[] stringPair = ((String) value).split(",");
                if (stringPair.length == 2 || stringPair.length == 3) {
                    RecipeMap<?> map = RecipeMap.getByName(stringPair[0].trim());
                    if (map == null) return false;
                    int tier;
                    try {
                        tier = Integer.parseInt(stringPair[1].trim());
                    } catch (NumberFormatException e) {
                        return false;
                    }
                    int amount = 1;
                    if (stringPair.length == 3) {
                        try {
                            amount = Integer.parseInt(stringPair[2].trim());
                        } catch (NumberFormatException ignored) {}
                    }
                    this.requireInside(map, tier, amount);
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
        super.applyProperty(LaboratoryProperty.getInstance(), new LaboratoryEntry(internalBuilder));
        super.buildAndRegister();
    }

    public LaboratoryRecipeBuilder requireInside(@Nonnull RecipeMap<?> map, int tier, int amount) {
        internalBuilder.put(map, tier, amount);
        return this;
    }

    public LaboratoryRecipeBuilder requireInside(@Nonnull RecipeMap<?> map, int tier) {
        return requireInside(map, tier, 1);
    }
}
