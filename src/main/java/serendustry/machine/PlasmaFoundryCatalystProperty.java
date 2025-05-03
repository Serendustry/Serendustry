package serendustry.machine;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;

import gregtech.api.recipes.recipeproperties.RecipeProperty;

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
    public void drawInfo(Minecraft minecraft, int x, int y, int color, Object value) {}
}
