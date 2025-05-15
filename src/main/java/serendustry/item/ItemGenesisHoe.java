package serendustry.item;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
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
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(I18n.format("item.genesis_hoe.tooltip"));
    }

    // todo add advanced functionality

    public void registerItemModel(Item item) {
        Serendustry.proxy.registerItemRenderer(this, 0, name);
    }
}
