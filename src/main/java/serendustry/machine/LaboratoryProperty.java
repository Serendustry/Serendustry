package serendustry.machine;

import java.util.*;

import javax.annotation.Nonnull;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.client.config.GuiUtils;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.TieredMetaTileEntity;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.recipeproperties.RecipeProperty;
import serendustry.SerendustryUtil;
import serendustry.machine.LaboratoryProperty.LaboratoryEntry;

public class LaboratoryProperty extends RecipeProperty<LaboratoryEntry> {

    public static final String KEY = "laboratory_internal";

    private static LaboratoryProperty INSTANCE;

    protected LaboratoryProperty() {
        super(KEY, LaboratoryEntry.class);
    }

    public static LaboratoryProperty getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LaboratoryProperty();
        }
        return INSTANCE;
    }

    @Override
    public void drawInfo(Minecraft minecraft, int x, int y, int color, Object value, int mouseX, int mouseY) {
        LaboratoryEntry entry = castValue(value);
        if (entry.getMachineTable().size() != 0) {
            minecraft.fontRenderer.drawString(I18n.format("serendustry.machine.industrial_laboratory.jei_header"), x, y,
                    color);
            y += 10;
            int xOffset = x;
            for (Table.Cell<RecipeMap<?>, Integer, Integer> cell : entry.getMachineTable().cellSet()) {
                RecipeMap<?> map = cell.getRowKey();
                Integer tier = cell.getColumnKey();
                Integer count = cell.getValue();
                ItemStack renderStack = SerendustryUtil.getMachineStack(map, tier, count);
                if (!renderStack.isEmpty()) {
                    GlStateManager.enableBlend();
                    GlStateManager.enableDepth();
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.disableLighting();
                    RenderHelper.disableStandardItemLighting();
                    RenderHelper.enableStandardItemLighting();
                    RenderHelper.enableGUIStandardItemLighting();
                    GlStateManager.pushMatrix();
                    RenderItem itemRender = minecraft.getRenderItem();
                    itemRender.renderItemAndEffectIntoGUI(renderStack, xOffset, y);
                    itemRender.renderItemOverlayIntoGUI(minecraft.fontRenderer, renderStack, xOffset, y, null);
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

                        List<String> tooltip = renderStack.getTooltip(minecraft.player,
                                ITooltipFlag.TooltipFlags.NORMAL);
                        if (!tooltip.isEmpty() && minecraft.currentScreen != null) {
                            GuiUtils.drawHoveringText(renderStack, tooltip, mouseX, mouseY,
                                    minecraft.currentScreen.width, minecraft.currentScreen.height, -1,
                                    minecraft.fontRenderer);
                            GlStateManager.disableLighting();
                        }
                    }
                    xOffset += 18;
                }
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void drawInfo(Minecraft minecraft, int i, int i1, int i2, Object o) {}

    public static boolean isMachineAllowed(@Nonnull MetaTileEntity machine) {
        if (machine instanceof MultiblockControllerBase) return false;
        return machine instanceof TieredMetaTileEntity && machine.getRecipeMap() != null;
    }

    public static class LaboratoryEntry {

        private final Table<RecipeMap<?>, Integer, Integer> machines;

        public LaboratoryEntry(ImmutableTable.Builder<RecipeMap<?>, Integer, Integer> tableBuilder) {
            this.machines = tableBuilder.build();
        }

        public Table<RecipeMap<?>, Integer, Integer> getMachineTable() {
            return machines;
        }
    }
}
