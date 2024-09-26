package serendustry.recipe;

import static gregtech.api.GTValues.UHV;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.properties.PropertyKey.GEM;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UHV;
import static gregtech.common.items.MetaItems.ULTIMATE_BATTERY;
import static gregtech.loaders.recipe.handlers.ToolRecipeHandler.*;
import static serendustry.item.SerendustryMetaItems.POWER_UNIT_UHV;
import static serendustry.item.material.SerendustryMaterials.PolyethyleneTerephtalate;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;

import gregtech.api.capability.GregtechCapabilities;
import gregtech.api.capability.IElectricItem;
import gregtech.api.items.toolitem.IGTTool;
import gregtech.api.items.toolitem.ToolHelper;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.items.ToolItems;
import gregtech.loaders.recipe.handlers.ToolRecipeHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import serendustry.item.SerendustryToolItems;

import java.util.Objects;

public class ToolPrefixHandlers {

    public static void init() {
        registerToolPrefixHandler();
        registerPowerUnitRecipes();
        processSoftTools();
    }
    public static void registerToolPrefixHandler() {
        plate.addProcessingHandler(PropertyKey.TOOL, ToolPrefixHandlers::processTool);
        plate.addProcessingHandler(PropertyKey.TOOL, ToolPrefixHandlers::processElectricTool);
    }

    public static void registerPowerUnitRecipes() {
        long maxCharge = Objects.requireNonNull(ULTIMATE_BATTERY.getStackForm().getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null))
                .getMaxCharge();

        ModHandler.addShapedEnergyTransferRecipe("power_unit_uhv", POWER_UNIT_UHV.getMaxChargeOverrideStack(maxCharge),
                Ingredient.fromStacks(ULTIMATE_BATTERY.getStackForm()), true, false,
                "S d", "GMG", "PBP",
                'M', ELECTRIC_MOTOR_UHV.getStackForm(),
                'S', new UnificationEntry(OrePrefix.screw, Neutronium),
                'P', new UnificationEntry(OrePrefix.plate, Neutronium),
                'G', new UnificationEntry(OrePrefix.gearSmall, Neutronium),
                'B', ULTIMATE_BATTERY.getStackForm());
    }

    public static void processSoftTools() {
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
    private static void processTool(OrePrefix prefix, Material material, ToolProperty property) {
        UnificationEntry block = new UnificationEntry(OrePrefix.block, material);
        UnificationEntry plate = new UnificationEntry(OrePrefix.plate, material);
        UnificationEntry ingot = new UnificationEntry(
                (material.hasProperty(GEM)) ? gem : OrePrefix.ingot,
                material);
        UnificationEntry stickLong = new UnificationEntry(OrePrefix.stickLong, material);
        UnificationEntry screw = new UnificationEntry(OrePrefix.screw, material);

        if (material.hasFlag(GENERATE_PLATE) && material.hasFlag(GENERATE_ROD) &&
                material.hasFlag(GENERATE_BOLT_SCREW)) {

            ToolRecipeHandler.addToolRecipe(
                    material, SerendustryToolItems.SKOOKUM_CHOOCHER, true,
                    "BdP", "IPP", "LS ",
                    'B', block,
                    'P', plate,
                    'I', ingot,
                    'L', stickLong,
                    'S', screw);

        }
    }

    private static void processElectricTool(OrePrefix prefix, Material material, ToolProperty property) {
        OrePrefix toolPrefix;

        if (material.hasFlag(GENERATE_PLATE)) {
            // drill
            toolPrefix = OrePrefix.toolHeadDrill;
            addUHVElectricToolRecipe(toolPrefix, material, new IGTTool[] { SerendustryToolItems.DRILL_UHV });

            // chainsaw
            toolPrefix = OrePrefix.toolHeadChainsaw;
            addUHVElectricToolRecipe(toolPrefix, material, new IGTTool[] { SerendustryToolItems.CHAINSAW_UHV });

            // wrench
            toolPrefix = OrePrefix.toolHeadWrench;
            addUHVElectricToolRecipe(toolPrefix, material,
                    new IGTTool[] { SerendustryToolItems.WRENCH_UHV });

            // buzzsaw todo?
            //toolPrefix = OrePrefix.toolHeadBuzzSaw;
            //addElectricToolRecipe(toolPrefix, material, new IGTTool[] { ToolItems.BUZZSAW });

            // wirecutter
            addUHVElectricWirecutterRecipe(material,
                    new IGTTool[] { SerendustryToolItems.WIRECUTTER_UHV });
        }

        // screwdriver
        if (material.hasFlag(GENERATE_LONG_ROD)) {
            toolPrefix = OrePrefix.toolHeadScrewdriver;
            addUHVElectricToolRecipe(toolPrefix, material, new IGTTool[] { SerendustryToolItems.SCREWDRIVER_UHV });
        }
    }

    public static void addUHVElectricToolRecipe(OrePrefix toolHead, Material material, IGTTool[] toolItems) {
        for (IGTTool toolItem : toolItems) {
            int tier = UHV;
            IElectricItem powerUnit = POWER_UNIT_UHV.getStackForm().getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
            ItemStack tool = toolItem.get(material, 0, powerUnit.getMaxCharge());
            ModHandler.addShapedEnergyTransferRecipe(String.format("%s_%s", toolItem.getToolId(), material),
                    tool,
                    Ingredient.fromStacks(POWER_UNIT_UHV.getStackForm()), true, true,
                    "wHd", " U ",
                    'H', new UnificationEntry(toolHead, material),
                    'U', POWER_UNIT_UHV.getStackForm());
        }
    }

    public static void addUHVElectricWirecutterRecipe(Material material, IGTTool[] toolItems) {
        for (IGTTool toolItem : toolItems) {
            int tier = UHV;
            IElectricItem powerUnit = POWER_UNIT_UHV.getStackForm().getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
            ItemStack tool = toolItem.get(material, 0, powerUnit.getMaxCharge());
            ModHandler.addShapedEnergyTransferRecipe(String.format("%s_%s", toolItem.getToolId(), material), tool,
                    Ingredient.fromStacks(POWER_UNIT_UHV.getStackForm()), true, true,
                    "PfP", "hPd", "RUR",
                    'P', new UnificationEntry(OrePrefix.plate, material),
                    'U', POWER_UNIT_UHV.getStackForm(),
                    'R', new UnificationEntry(OrePrefix.stick, material));
        }
    }
}
