package serendustry.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import serendustry.SValues;
import serendustry.Serendustry;

import javax.annotation.Nullable;
import java.util.List;

public class ItemGenesisHoe extends ItemHoe {

    private String name;

    public ItemGenesisHoe(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setTranslationKey(name);
        this.name = name;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(I18n.format("item.genesis_hoe.tooltip"));
        tooltip.add("");
        tooltip.add(SValues.FORMAT_ENVOIDIA + I18n.format("serendustry.machine.author.envoidia"));
        tooltip.add(I18n.format("serendustry.machine.author.serenibyss"));
        tooltip.add(SValues.FORMAT_IRIS_1 + I18n.format("serendustry.machine.author.iris.1") +
                SValues.FORMAT_IRIS_2 + I18n.format("serendustry.machine.author.iris.2") +
                SValues.FORMAT_IRIS_3 + I18n.format("serendustry.machine.author.iris.3"));
        tooltip.add(I18n.format("serendustry.machine.author.twilight"));
        Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.world != null) tooltip.add(I18n.format("serendustry.text.and_you") + " " + TextFormatting.YELLOW +
                minecraft.player.getDisplayName().getUnformattedText());
    }

    // todo add advanced functionality

    public void registerItemModel(Item item) {
        Serendustry.proxy.registerItemRenderer(this, 0, name);
    }
}
