package serendustry.item;

import gregtech.api.GTValues;
import gregtech.api.items.toolitem.IGTTool;
import gregtech.api.items.toolitem.ItemGTTool;
import gregtech.api.items.toolitem.ToolClasses;
import gregtech.api.items.toolitem.ToolOreDict;
import gregtech.common.items.tool.BlockRotatingBehavior;
import gregtech.common.items.tool.DisableShieldBehavior;
import gregtech.common.items.tool.EntityDamageBehavior;
import gregtech.common.items.tool.HarvestIceBehavior;
import gregtech.common.items.tool.TorchPlaceBehavior;
import gregtech.common.items.tool.TreeFellingBehavior;
import gregtech.core.sound.GTSoundEvents;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;
import serendustry.Serendustry;

import java.util.function.Supplier;

import static gregtech.common.items.ToolItems.register;
import static serendustry.item.SerendustryMetaItems.POWER_UNIT_UHV;

public class SerendustryToolItems {

    public static IGTTool SKOOKUM_CHOOCHER;
    public static IGTTool DRILL_UHV;
    public static IGTTool CHAINSAW_UHV;
    public static IGTTool WRENCH_UHV;
    public static IGTTool SCREWDRIVER_UHV;
    public static IGTTool WIRECUTTER_UHV;

    public static final Item.ToolMaterial genesisMaterial = EnumHelper.addToolMaterial("GENESIS", 10, 2147483647, 65536, 10, 33);
    public static ItemGenesisHoe GENESIS_HOE = new ItemGenesisHoe(genesisMaterial, "genesis_hoe");
    // public static IGTTool TRISHULA;

    public static final Supplier<ItemStack> SUPPLY_POWER_UNIT_UHV = () -> POWER_UNIT_UHV.getStackForm();

    public static void registerGenesisHoe(IForgeRegistry<Item> registry) {
        registry.register(GENESIS_HOE);
        GENESIS_HOE.registerItemModel(GENESIS_HOE);
    }

    public static void init() {
        SKOOKUM_CHOOCHER = register(ItemGTTool.Builder.of(Serendustry.MODID, "skookum_choocher")
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

        DRILL_UHV = register(ItemGTTool.Builder.of(Serendustry.MODID, "drill_uhv")
                .toolStats(b -> b.blockBreaking().aoe(8, 8, 16)
                        .attackDamage(1.0F).attackSpeed(-3.2F).durabilityMultiplier(12.0F)
                        .brokenStack(SUPPLY_POWER_UNIT_UHV)
                        .behaviors(TorchPlaceBehavior.INSTANCE))
                .oreDict(ToolOreDict.toolDrill)
                .secondaryOreDicts(ToolOreDict.toolPickaxe, ToolOreDict.toolShovel)
                .sound(GTSoundEvents.DRILL_TOOL, true)
                .toolClasses(ToolClasses.DRILL)
                .electric(GTValues.UHV));

        CHAINSAW_UHV = register(ItemGTTool.Builder.of(Serendustry.MODID, "chainsaw_uhv")
                .toolStats(b -> b.blockBreaking()
                        .efficiencyMultiplier(12.0F)
                        .attackDamage(16.0F).attackSpeed(-3.2F)
                        .brokenStack(SUPPLY_POWER_UNIT_UHV)
                        .behaviors(HarvestIceBehavior.INSTANCE, DisableShieldBehavior.INSTANCE,
                                TreeFellingBehavior.INSTANCE))
                .oreDict(ToolOreDict.toolAxe)
                .secondaryOreDicts(ToolOreDict.toolChainsaw)
                .sound(GTSoundEvents.CHAINSAW_TOOL, true)
                .toolClasses(ToolClasses.AXE)
                .electric(GTValues.UHV));

        WRENCH_UHV = register(ItemGTTool.Builder.of(Serendustry.MODID, "wrench_uhv")
                .toolStats(b -> b.blockBreaking().crafting().sneakBypassUse()
                        .efficiencyMultiplier(10.0F)
                        .attackDamage(1.0F).attackSpeed(-2.8F)
                        .behaviors(BlockRotatingBehavior.INSTANCE, new EntityDamageBehavior(3.0F, EntityGolem.class))
                        .brokenStack(SUPPLY_POWER_UNIT_UHV))
                .sound(GTSoundEvents.WRENCH_TOOL, true)
                .oreDict(ToolOreDict.toolWrench)
                .secondaryOreDicts("craftingToolWrench")
                .toolClasses(ToolClasses.WRENCH)
                .electric(GTValues.UHV));

        SCREWDRIVER_UHV = register(ItemGTTool.Builder.of(Serendustry.MODID, "screwdriver_uhv")
                .toolStats(b -> b.crafting().sneakBypassUse()
                        .attackDamage(-1.0F).attackSpeed(3.0F).durabilityMultiplier(12.0F)
                        .behaviors(new EntityDamageBehavior(12.0F, EntitySpider.class))
                        .brokenStack(SUPPLY_POWER_UNIT_UHV))
                .sound(GTSoundEvents.SCREWDRIVER_TOOL)
                .oreDict(ToolOreDict.toolScrewdriver)
                .secondaryOreDicts("craftingToolScrewdriver")
                .toolClasses(ToolClasses.SCREWDRIVER)
                .electric(GTValues.UHV));

        WIRECUTTER_UHV = register(ItemGTTool.Builder.of(Serendustry.MODID, "wire_cutter_uhv")
                .toolStats(b -> b.blockBreaking().crafting().damagePerCraftingAction(4)
                        .efficiencyMultiplier(10.0F)
                        .attackDamage(-1.0F).attackSpeed(-2.4F)
                        .brokenStack(SUPPLY_POWER_UNIT_UHV))
                .sound(GTSoundEvents.WIRECUTTER_TOOL, true)
                .oreDict(ToolOreDict.toolWireCutter)
                .secondaryOreDicts("craftingToolWireCutter")
                .toolClasses(ToolClasses.WIRE_CUTTER)
                .electric(GTValues.UHV));

        /*
         * TRISHULA = register(ItemGTTool.Builder.of(Serendustry.MODID, "trishula")
         * .toolStats(b -> {
         * return b.blockBreaking().aoe(8, 8, 16).sneakBypassUse()
         * .attackDamage(65536.0f).attackSpeed(-2.8f)
         * .behaviors(BlockRotatingBehavior.INSTANCE,
         * HarvestIceBehavior.INSTANCE, DisableShieldBehavior.INSTANCE,
         * TreeFellingBehavior.INSTANCE);
         * })
         * .oreDict(ToolOreDict.toolDrill)
         * .secondaryOreDicts("toolWrench", "toolWireCutter")
         * .sound(SoundEvents.BLOCK_ANVIL_LAND)
         * .toolClasses(ToolClasses.PICKAXE, ToolClasses.AXE, ToolClasses.SHOVEL, ToolClasses.WRENCH,
         * ToolClasses.WIRE_CUTTER)
         * .electric(GTValues.LuV));
         */
    }

}
