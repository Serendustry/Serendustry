package serendustry.item.behavior;

import static serendustry.item.SerendustryMetaItems.WASTE_FLUID_EXTRACTOR_FILLED;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

import org.jetbrains.annotations.Nullable;

import gregtech.api.items.metaitem.stats.IItemBehaviour;

public class WasteExtractorBehavior implements IItemBehaviour {

    public boolean onLeftClickEntity(@Nullable ItemStack itemStack, @Nullable EntityPlayer player,
                                     @Nullable Entity entity) {
        if (entity instanceof EntityCow) { // todo just a test?
            if (player != null) {
                player.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, WASTE_FLUID_EXTRACTOR_FILLED.getStackForm());
            }
        }
        // false because this will still apply the "hit"
        return false;
    }
}
