package serendustry.machine;

import gregtech.api.recipes.recipeproperties.RecipeProperty;
import gregtech.api.unification.material.Material;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;

import org.apache.commons.lang3.Validate;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class PlasmaFoundryCatalystProperty extends RecipeProperty<Integer> {

    public static final String KEY = "catalyst";

    private static PlasmaFoundryCatalystProperty INSTANCE;

    private PlasmaFoundryCatalystProperty() {
        super(KEY, Integer.class);
    }

    public static PlasmaFoundryCatalystProperty getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PlasmaFoundryCatalystProperty();
        }
        return INSTANCE;
    }

    @Override
    public void drawInfo(Minecraft minecraft, int x, int y, int color, Object value) {
        minecraft.fontRenderer.drawString(I18n.format("gregtech.recipe.temperature",
                value, getMinTierForTemperature(castValue(value))), x, y, color);
    }

    @NotNull
    private String getMinTierForTemperature(Integer value) {
        String name = "";
        for (Map.Entry<Integer, Object> coil : registeredCoilTypes.entrySet()) {
            if (value <= coil.getKey()) {
                Object mapValue = coil.getValue();
                if (mapValue instanceof Material) {
                    name = ((Material) mapValue).getLocalizedName();
                } else if (mapValue instanceof String) {
                    name = I18n.format((String) mapValue);
                }
            }
        }
        if (name.length() >= 13) {
            name = name.substring(0, 10) + "..";
        }
        return name;
    }

    /**
     * This Maps coil Materials to its Integer temperatures.
     * In case the coil was not constructed with a Material you can pass a String name,
     * ideally an unlocalized name
     */
    public static void registerCoilType(int temperature, Material coilMaterial, String coilName) {
        Validate.notNull(coilName);
        if (coilMaterial == null) {
            registeredCoilTypes.put(temperature, coilName);
        } else {
            registeredCoilTypes.put(temperature, coilMaterial);
        }
    }
}
