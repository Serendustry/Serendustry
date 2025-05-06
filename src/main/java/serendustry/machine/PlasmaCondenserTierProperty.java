package serendustry.machine;

import net.minecraft.client.Minecraft;

import gregtech.api.recipes.recipeproperties.RecipeProperty;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import serendustry.Serendustry;

public class PlasmaCondenserTierProperty extends RecipeProperty<Integer> {

    public static final String KEY = "plasma_condenser_tier";

    private static PlasmaCondenserTierProperty INSTANCE;

    private PlasmaCondenserTierProperty() {
        super(KEY, Integer.class);
    }

    public static PlasmaCondenserTierProperty getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PlasmaCondenserTierProperty();
        }
        return INSTANCE;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void drawInfo(Minecraft minecraft, int x, int y, int color, Object value) {
        minecraft.fontRenderer.drawString(I18n.format("serendustry.machine.plasma_condenser.property.tier", castValue(value) + 1), x, y,
                color);
    }
}
