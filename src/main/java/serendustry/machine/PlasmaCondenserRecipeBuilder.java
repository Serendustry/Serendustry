package serendustry.machine;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import gregtech.api.recipes.RecipeBuilder;
import gregtech.api.recipes.recipeproperties.CleanroomProperty;
import gregtech.api.recipes.recipeproperties.RecipeProperty;

public class PlasmaCondenserRecipeBuilder extends RecipeBuilder<PlasmaCondenserRecipeBuilder> {

    private int type = -1;
    private int tier = -1;

    public PlasmaCondenserRecipeBuilder() {}

    public PlasmaCondenserRecipeBuilder(RecipeBuilder<PlasmaCondenserRecipeBuilder> recipeBuilder) {
        super(recipeBuilder);
    }

    // 0 = heating; 1 = cooling
    public PlasmaCondenserRecipeBuilder recipeType(int recipeType_) {
        type = recipeType_;
        return this;
    }

    // 0 = infernal / glacial; 1 = supernova / black hole
    public PlasmaCondenserRecipeBuilder recipeTier(int recipeTier_) {
        tier = recipeTier_;
        return this;
    }

    @Override
    public PlasmaCondenserRecipeBuilder copy() {
        return new PlasmaCondenserRecipeBuilder(this);
    }

    @Override
    public boolean applyProperty(@Nonnull String key, @Nullable Object value) {
        if (key.equals(PlasmaCondenserTypeProperty.KEY)) {
            return applyProperty(PlasmaCondenserTypeProperty.getInstance(), value);
        }
        if (key.equals(PlasmaCondenserTierProperty.KEY)) {
            return applyProperty(PlasmaCondenserTierProperty.getInstance(), value);
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
        super.applyProperty(PlasmaCondenserTypeProperty.getInstance(), type);
        super.applyProperty(PlasmaCondenserTierProperty.getInstance(), tier);
        super.buildAndRegister();
    }
}
