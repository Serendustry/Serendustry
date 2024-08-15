package serendustry.recipe;

import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.properties.PropertyKey.GEM;
import static gregtech.api.unification.ore.OrePrefix.*;
import static serendustry.item.material.SerendustryMaterials.PolyethyleneTerephtalate;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;

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
import serendustry.item.SerendustryToolItems;

public class ToolPrefixHandlers {

    public static void registerToolPrefixHandler() {
        plate.addProcessingHandler(PropertyKey.TOOL, ToolPrefixHandlers::processTool);
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
}
