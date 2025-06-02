package serendustry.recipe;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.item.ItemStack;

import static gregtech.api.recipes.RecipeMaps.BENDER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.IMPLOSION_RECIPES;
import static gregtech.api.unification.material.Materials.Darmstadtium;
import static gregtech.api.unification.material.Materials.Moscovium;
import static gregtech.api.unification.material.Materials.NaquadahAlloy;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Oganesson;
import static gregtech.api.unification.material.Materials.Tennessine;
import static gregtech.api.unification.material.info.MaterialFlags.GENERATE_DENSE;
import static gregtech.api.unification.ore.OrePrefix.ingot;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static serendustry.item.material.SerendustryMaterials.Adamantium;
import static serendustry.item.material.SerendustryMaterials.AwakenedDraconium;
import static serendustry.item.material.SerendustryMaterials.DeepDarkSteel;
import static serendustry.item.material.SerendustryMaterials.Envoite;
import static serendustry.item.material.SerendustryMaterials.ErrorEnvoidia;
import static serendustry.item.material.SerendustryMaterials.ErrorSerenibyss;
import static serendustry.item.material.SerendustryMaterials.ExoHalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.Floppa;
import static serendustry.item.material.SerendustryMaterials.FullerenePolymerMatrix;
import static serendustry.item.material.SerendustryMaterials.HalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.HotExoHalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.HotHalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.Periodicium;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;
import static serendustry.machine.SerendustryRecipeMaps.ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES;

public class DensePlateRecipes {

    static Material[] materials = GregTechAPI.materialManager.getRegisteredMaterials().toArray(new Material[0]);

    public static void init() {
        // Materials to not generate recipes for
        Material[] skips = { HotHalkoniteSteel, HalkoniteSteel, HotExoHalkoniteSteel, ExoHalkoniteSteel, ErrorEnvoidia,
                ErrorSerenibyss };

        // Special cased high tier materials
        Material[] highTiers = { NaquadahAlloy, Darmstadtium, Adamantium, Moscovium, VibraniumAlloy };
        Material[] higherTiers = { RadoxPolymer, Oganesson, Tennessine, Neutronium, Infinity, AwakenedDraconium,
                DeepDarkSteel, FullerenePolymerMatrix, Floppa, Envoite, Periodicium };
        int NORMAL = 0, HIGH = 1, HIGHER = 2;
        int[] Tiers = { GTValues.EV, GTValues.LuV };

        for (Material material : materials) {
            if (material.hasFlag(GENERATE_DENSE)) {

                // Skip certain materials
                boolean skipMat = false;
                for (Material skip : skips) {
                    if (skip == material) {
                        skipMat = true;
                    }
                }
                if (skipMat) {
                    continue;
                }

                // Special cases for certain high tier materials
                int tier = NORMAL;
                for (Material highTier : highTiers) {
                    if (highTier == material) {
                        tier = HIGH;
                        break;
                    }
                }
                if (tier == NORMAL) {
                    for (Material higherTier : higherTiers) {
                        if (higherTier == material) {
                            tier = HIGHER;
                            break;
                        }
                    }
                }

                // Add implosion compressor dense plate recipe
                if (tier != HIGHER) {
                    IMPLOSION_RECIPES.recipeBuilder()
                            .input(plate, material, 9)
                            .explosivesAmount(18 + (tier * 18))
                            .output(plateDense, material)
                            .duration(20 * 9 + (tier * 20 * 9))
                            .EUt(GTValues.VA[Tiers[tier]])
                            .buildAndRegister();
                } else {
                    ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES.recipeBuilder()
                            .input(plate, material, 9)
                            .output(plateDense, material)
                            .duration(20 * 60)
                            .EUt(GTValues.VA[GTValues.UHV])
                            .buildAndRegister();
                }

                // Remove normal dense plate recipes
                for (OrePrefix part : new OrePrefix[] { plate, ingot }) {
                    GTRecipeHandler.removeRecipesByInputs(BENDER_RECIPES, new ItemStack[] {
                            OreDictUnifier.get(part, material, 9),
                            IntCircuitIngredient.getIntegratedCircuit(9) });
                }
            }
        }
    }
}
