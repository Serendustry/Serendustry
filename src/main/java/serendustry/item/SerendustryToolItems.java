package serendustry.item;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.init.SoundEvents;

import gregtech.api.items.toolitem.*;
import gregtech.common.items.ToolItems;
import gregtech.common.items.tool.BlockRotatingBehavior;
import gregtech.common.items.tool.EntityDamageBehavior;
import serendustry.Serendustry;

import static serendustry.item.material.SerendustryMaterials.PolyethyleneTerephtalate;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;

public class SerendustryToolItems {

    public static IGTTool SKOOKUM_CHOOCHER;

    public static void init() {
        SKOOKUM_CHOOCHER = ToolItems.register(ItemGTTool.Builder.of(Serendustry.MODID, "skookum_choocher")
                .toolStats(b -> {
                    return b.blockBreaking().crafting().sneakBypassUse().damagePerCraftingAction(2)
                            .attackDamage(1.0f).attackSpeed(-2.8f)
                            .behaviors(BlockRotatingBehavior.INSTANCE,
                                    new EntityDamageBehavior(2.0f, EntityGolem.class));
                })
                .oreDict(ToolOreDict.toolHammer)
                .secondaryOreDicts("craftingToolHardHammer", "toolWrench", "craftingToolWrench")
                .sound(SoundEvents.BLOCK_ANVIL_LAND)
                .toolClasses(ToolClasses.PICKAXE, ToolClasses.HARD_HAMMER, ToolClasses.WRENCH));

        Material[] softMaterials = new Material[] { PolyethyleneTerephtalate, RadoxPolymer };
        int[] dura = new int[]{ 4096, 65536 };

        final UnificationEntry stick = new UnificationEntry(OrePrefix.stick, Materials.Wood);

        for (int i = 0; i < softMaterials.length; i++) {
            Material softMaterial = softMaterials[i];

            ModHandler.addMirroredShapedRecipe(String.format("soft_mallet_%s", softMaterial),
                    ToolHelper.getAndSetToolData(ToolItems.SOFT_MALLET, softMaterial, dura[i] - 1, 1, 4F, 1F),
                    "II ", "IIS", "II ",
                    'I', new UnificationEntry(OrePrefix.ingot, softMaterial),
                    'S', stick);

            ModHandler.addMirroredShapedRecipe(String.format("plunger_%s", softMaterial),
                    ToolHelper.getAndSetToolData(ToolItems.PLUNGER, softMaterial, dura[i] / 2 - 1, 1, 4F, 0F),
                    "xPP", " SP", "S f",
                    'P', new UnificationEntry(OrePrefix.plate, softMaterial),
                    'S', stick);
        }
    }
}
