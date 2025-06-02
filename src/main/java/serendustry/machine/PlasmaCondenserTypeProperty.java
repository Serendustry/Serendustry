package serendustry.machine;

import gregtech.api.recipes.recipeproperties.RecipeProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PlasmaCondenserTypeProperty extends RecipeProperty<Integer> {

    final static public Integer HEATING = 0;
    final static public Integer COOLING = 1;

    public static final String KEY = "plasma_condenser_type";

    private static PlasmaCondenserTypeProperty INSTANCE;

    private PlasmaCondenserTypeProperty() {
        super(KEY, Integer.class);
    }

    public static PlasmaCondenserTypeProperty getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PlasmaCondenserTypeProperty();
        }
        return INSTANCE;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void drawInfo(Minecraft minecraft, int x, int y, int color, Object value) {
        minecraft.fontRenderer.drawString(
                I18n.format("serendustry.machine.plasma_condenser.property.type",
                        castValue(value) == HEATING ? "Heating" : "Cooling"),
                x, y,
                color);
    }
}
