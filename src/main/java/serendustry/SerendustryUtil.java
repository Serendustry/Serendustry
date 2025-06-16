package serendustry;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.TieredMetaTileEntity;
import gregtech.api.recipes.RecipeMap;

@Mod.EventBusSubscriber
public class SerendustryUtil {

    private static final Table<RecipeMap<?>, Integer, ItemStack> MAP_TIER_TO_MACHINE_STACK = HashBasedTable.create();

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void initMachineMap(RegistryEvent.Register<IRecipe> event) {
        for (MetaTileEntity mte : GregTechAPI.MTE_REGISTRY) {
            if (mte instanceof TieredMetaTileEntity && mte.getRecipeMap() != null) {
                TieredMetaTileEntity tieredMte = (TieredMetaTileEntity) mte;
                ItemStack stack = tieredMte.getStackForm();
                MAP_TIER_TO_MACHINE_STACK.put(mte.getRecipeMap(), tieredMte.getTier(), stack);
            }
        }
    }

    public static ItemStack getMachineStack(RecipeMap<?> map, int tier, int count) {
        if (tier < 0 || tier > GTValues.MAX) return ItemStack.EMPTY;
        ItemStack stack = MAP_TIER_TO_MACHINE_STACK.get(map, tier);
        if (stack == null) return ItemStack.EMPTY;
        stack = stack.copy();
        stack.setCount(count);
        return stack;
    }

    public static ItemStack getMachineStack(RecipeMap<?> map, int tier) {
        return getMachineStack(map, tier, 1);
    }
}
