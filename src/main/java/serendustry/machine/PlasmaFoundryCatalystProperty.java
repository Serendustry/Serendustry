package serendustry.machine;

import com.google.common.collect.Table;
import gregtech.api.recipes.RecipeMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;

import gregtech.api.recipes.recipeproperties.RecipeProperty;
import net.minecraftforge.fml.client.config.GuiUtils;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import serendustry.SerendustryUtil;

import java.util.List;

public class PlasmaFoundryCatalystProperty extends RecipeProperty<ItemStack[]> {

    public static final String KEY = "plasma_foundry_catalyst";

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
    public void drawInfo(Minecraft minecraft, int x, int y, int color, Object value, int mouseX, int mouseY) {
        ItemStack[] catalysts = castValue(value);
        if (catalysts.length > 0) {
            minecraft.fontRenderer.drawString(I18n.format("serendustry.machine.plasma_foundry.catalyst.accepted"), x, y,
                    color);
            y += 10;
            int xOffset = x;
            for (ItemStack catalyst : catalysts) {
                //RecipeMap<?> map = cell.getRowKey();
                //Integer tier = cell.getColumnKey();
                //Integer count = cell.getValue();
                //ItemStack renderStack = SerendustryUtil.getMachineStack(map, tier, count);
                //if (!renderStack.isEmpty()) {
                // todo: clean up this code (most calls are likely unneeded) and make it work better
                    GlStateManager.enableBlend();
                    GlStateManager.enableDepth();
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.disableLighting();
                    RenderHelper.disableStandardItemLighting();
                    RenderHelper.enableStandardItemLighting();
                    RenderHelper.enableGUIStandardItemLighting();
                    GlStateManager.pushMatrix();
                    RenderItem itemRender = minecraft.getRenderItem();
                    itemRender.renderItemAndEffectIntoGUI(catalyst, xOffset, y);
                    itemRender.renderItemOverlayIntoGUI(minecraft.fontRenderer, catalyst, xOffset, y, null);
                    GlStateManager.enableAlpha();
                    GlStateManager.popMatrix();
                    RenderHelper.disableStandardItemLighting();
                    if (mouseX >= x + xOffset && mouseY >= y && x + 16 > mouseX && y + 16 > mouseY) {
                        GlStateManager.disableDepth();
                        GlStateManager.colorMask(true, true, true, false);
                        Gui.drawRect(x + xOffset, y, x + xOffset + 16, y + 16, -2130706433);
                        GlStateManager.color(1, 1, 1, 1);
                        GlStateManager.enableBlend();
                        GlStateManager.colorMask(true, true, true, true);
                        GlStateManager.enableDepth();

                        List<String> tooltip = catalyst.getTooltip(minecraft.player,
                                ITooltipFlag.TooltipFlags.NORMAL);
                        if (!tooltip.isEmpty() && minecraft.currentScreen != null) {
                            GuiUtils.drawHoveringText(catalyst, tooltip, mouseX, mouseY,
                                    minecraft.currentScreen.width, minecraft.currentScreen.height, -1,
                                    minecraft.fontRenderer);
                            GlStateManager.disableLighting();
                        }
                    }
                    xOffset += 18;
                //}
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void drawInfo(Minecraft minecraft, int x, int y, int color, Object value) {}
}
