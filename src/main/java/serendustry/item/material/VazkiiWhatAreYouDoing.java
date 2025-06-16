package serendustry.item.material;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import gregtech.api.unification.OreDictUnifier;

public class VazkiiWhatAreYouDoing {

    // todo fix
    public static void init() {
        OreDictUnifier
                .registerOre(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("botania", "manaresource")),
                        1, 14), "ingotGaiaSpirit");
    }
}
