package serendustry.item.material;

import gregtech.api.unification.OreDictUnifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class VazkiiWhatAreYouDoing {

    // todo fix
    public static void init() {
        OreDictUnifier
                .registerOre(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("botania", "manaresource")),
                        1, 14), "ingotGaiaSpirit");
    }
}
