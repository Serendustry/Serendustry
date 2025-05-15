package serendustry.machine;

import gregtech.api.recipes.recipeproperties.RecipeProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import serendustry.client.utils.IntegerRange;

public class ACRTemperatureProperty extends RecipeProperty<IntegerRange> {

    public static final String KEY = "acr_temperature";

    private static ACRTemperatureProperty INSTANCE;

    private ACRTemperatureProperty() {
        super(KEY, IntegerRange.class);
    }

    public static ACRTemperatureProperty getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ACRTemperatureProperty();
        }
        return INSTANCE;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void drawInfo(Minecraft minecraft, int x, int y, int color, Object value) {
        IntegerRange temperature = castValue(value);
        minecraft.fontRenderer.drawString(
                I18n.format("serendustry.machine.advanced_chemical_reactor.property.temperature",
                        temperature.getStart() + "K-" + temperature.getEnd() + "K"),
                x, y, color);
    }
}
