package serendustry.machine;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import gregtech.api.recipes.RecipeBuilder;
import gregtech.api.recipes.recipeproperties.CleanroomProperty;
import gregtech.api.recipes.recipeproperties.RecipeProperty;
import serendustry.client.utils.IntegerRange;

public class ACRRecipeBuilder extends RecipeBuilder<ACRRecipeBuilder> {

    private IntegerRange temperature = new IntegerRange(-1, -1);
    private IntegerRange pressure = new IntegerRange(-1, -1);

    public ACRRecipeBuilder() {}

    public ACRRecipeBuilder(RecipeBuilder<ACRRecipeBuilder> recipeBuilder) {
        super(recipeBuilder);
    }

    /*
     * Default: 295K, 101kPa
     * With 36 components:
     * All Res Heaters: 3,825K, 353kPa
     * All Lq Coolers: 18K, 18kPa
     * All Diff Pumps: 68K, 1kPa
     * All Recip Compressors: 1,075K, 41,272kPa
     */
    public ACRRecipeBuilder temperature(int lower, int upper) {
        temperature = new IntegerRange(lower, upper);
        return this;
    }

    public ACRRecipeBuilder pressure(int lower, int upper) {
        pressure = new IntegerRange(lower, upper);
        return this;
    }

    public ACRRecipeBuilder temperature(IntegerRange range) {
        temperature = range;
        return this;
    }

    public ACRRecipeBuilder pressure(IntegerRange range) {
        pressure = range;
        return this;
    }

    @Override
    public ACRRecipeBuilder copy() {
        return new ACRRecipeBuilder(this);
    }

    @Override
    public boolean applyProperty(@Nonnull String key, @Nullable Object value) {
        if (key.equals(ACRTemperatureProperty.KEY)) {
            return applyProperty(ACRTemperatureProperty.getInstance(), value);
        }
        if (key.equals(ACRPressureProperty.KEY)) {
            return applyProperty(ACRPressureProperty.getInstance(), value);
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
        super.applyProperty(ACRTemperatureProperty.getInstance(), temperature);
        super.applyProperty(ACRPressureProperty.getInstance(), pressure);
        super.buildAndRegister();
    }
}
