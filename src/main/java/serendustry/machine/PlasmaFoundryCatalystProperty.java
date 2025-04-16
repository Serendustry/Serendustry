package serendustry.machine;

import gregtech.api.recipes.recipeproperties.RecipeProperty;
import gregtech.api.unification.material.Material;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;

import net.minecraft.item.ItemStack;
import org.apache.commons.lang3.Validate;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

public class PlasmaFoundryCatalystProperty extends RecipeProperty<ItemStack[]> {

    public static final String KEY = "catalyst";

    private static PlasmaFoundryCatalystProperty INSTANCE;

    private PlasmaFoundryCatalystProperty() {
        super(KEY, ItemStack[].class);
    }

    public static PlasmaFoundryCatalystProperty getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PlasmaFoundryCatalystProperty();
        }
        return INSTANCE;
    }

    @Override
    public void drawInfo(Minecraft minecraft, int x, int y, int color, Object value) {

    }
}
