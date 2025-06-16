package serendustry.machine;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import gregtech.api.recipes.recipeproperties.RecipeProperty;
import serendustry.client.utils.IntegerRange;

public class ACRPressureProperty extends RecipeProperty<IntegerRange> {

    public static final String KEY = "acr_pressure";

    private static ACRPressureProperty INSTANCE;

    private ACRPressureProperty() {
        super(KEY, IntegerRange.class);
    }

    public static ACRPressureProperty getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ACRPressureProperty();
        }
        return INSTANCE;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void drawInfo(Minecraft minecraft, int x, int y, int color, Object value) {
        IntegerRange pressure = castValue(value);
        minecraft.fontRenderer.drawString(
                I18n.format("serendustry.machine.advanced_chemical_reactor.property.pressure",
                        pressure.getStart() + "kPa-" + pressure.getEnd() + "kPa"),
                x, y, color);
    }
}
