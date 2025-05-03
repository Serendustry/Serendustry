package serendustry.recipe;

import static serendustry.item.material.SerendustryMaterials.ISHydrochloricAcid;
import static serendustry.item.material.SerendustryMaterials.ISHydrofluoricAcid;
import static serendustry.item.material.SerendustryMaterials.ISSulfuricAcid;
import static serendustry.machine.SerendustryRecipeMaps.DIGESTER_RECIPES;

import java.util.Map;

import net.minecraft.item.ItemStack;

import com.google.common.collect.ImmutableMap;

import gregtech.api.GTValues;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.OreProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.MaterialStack;
import gregtech.common.ConfigHolder;

public class PrefixHandlers {

    static void registerPrefixHandlers() {
        OrePrefix.ore.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
        OrePrefix.oreNetherrack.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
        OrePrefix.oreEndstone.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
        if (ConfigHolder.worldgen.allUniqueStoneTypes) {
            OrePrefix.oreGranite.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreDiorite.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreAndesite.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreBasalt.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreBlackgranite.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreMarble.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreRedgranite.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreSand.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreRedSand.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
        }
    }

    private static final ImmutableMap<Material, Integer> fluids = ImmutableMap.of(
            ISSulfuricAcid, 2,
            ISHydrochloricAcid, 3,
            ISHydrofluoricAcid, 4);

    private static void processOre(OrePrefix prefix, Material material, OreProperty property) {
        int amountOfCrushedOre = property.getOreMultiplier();
        int oreTypeMultiplier = (prefix == OrePrefix.oreNetherrack || prefix == OrePrefix.oreEndstone) ? 2 : 1;
        Material byproduct = property.getOreByProduct(0, material);
        ItemStack byproductStack = OreDictUnifier.get(OrePrefix.gem, byproduct, 32);
        if (byproductStack.isEmpty()) {
            byproductStack = OreDictUnifier.get(OrePrefix.dust, byproduct, 32);
        }

        int outputCrushed = amountOfCrushedOre * 8 * oreTypeMultiplier;

        SimpleRecipeBuilder builder = DIGESTER_RECIPES.recipeBuilder()
                .input(prefix, material, 8)
                .duration(500)
                .EUt(GTValues.VA[GTValues.HV]);

        for (Map.Entry<Material, Integer> entry : fluids.entrySet()) {
            int intValue = entry.getValue();
            SimpleRecipeBuilder builder2 = builder.copy();
            ItemStack byproductStack2 = byproductStack.copy();
            byproductStack2.setCount(byproductStack.getCount() * intValue);
            builder2.chancedOutput(byproductStack2, 1400, 850);
            int outputCrushed2 = outputCrushed * intValue;
            while (outputCrushed2 > 0) {
                int amountToDo = Math.min(outputCrushed2, 64);
                builder2.output(OrePrefix.crushed, material, amountToDo);
                outputCrushed2 -= amountToDo;
            }
            for (MaterialStack secondary : prefix.secondaryMaterials) {
                if (secondary.material.hasProperty(PropertyKey.DUST)) {
                    ItemStack dustStack = OreDictUnifier.getGem(secondary);
                    dustStack.setCount(16 * intValue);
                    builder2.chancedOutput(dustStack, 6700, 800);
                }
            }
            builder2.fluidInputs(entry.getKey().getFluid(1000));
            builder2.buildAndRegister();
        }
    }
}
