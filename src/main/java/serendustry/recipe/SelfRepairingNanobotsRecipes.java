package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static java.lang.Math.max;
import static serendustry.item.material.SerendustryMaterials.*;

import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;


public class SelfRepairingNanobotsRecipes {
    public static void init() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(circuit, MarkerMaterials.Tier.UHV)
                .input(ROBOT_ARM_UV)
                .input(bolt, HalkoniteSteel, 32)
                .input(foil, ALMST, 64)
                .input(cableGtSingle, Hihiirokane, 16)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 8), MolybdeniteLubricant.getFluid(8000))
                .output(dust, SelfRepairingNanobots, 64)
                .stationResearch(b -> b
                        .researchStack(OreDictUnifier.get(plate, HighGradeSolderingAlloy))
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(400).EUt(400000).buildAndRegister();

        OrePrefix[] parts = { dust, plate, foil };
        float[] cost = { 1.0F, 1.0f, 0.25F };

        for (int i = 0; i < parts.length; i++) {
            for (int j = 0; j < parts.length; j++) {

                if(i == j) continue;

                ASSEMBLER_RECIPES.recipeBuilder()
                        .input(parts[i], SelfRepairingNanobots, (int) (max(cost[j] / cost[i], 1)))
                        .circuitMeta(j + 1)
                        .output(parts[j], SelfRepairingNanobots, (int) (max(cost[i] / cost[j], 1)))
                        .duration((int) (80 * cost[j])).EUt(VA[UV]).buildAndRegister();
            }

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(parts[i], SelfRepairingNanobots)
                    .circuitMeta(parts.length + 1)
                    .fluidOutputs(SelfRepairingNanobots.getFluid((int) (144 * cost[i])))
                    .duration((int) (80 * cost[i])).EUt(VA[UV]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .fluidInputs(SelfRepairingNanobots.getFluid((int) (144 * cost[i])))
                    .circuitMeta(i + 1)
                    .output(parts[i], SelfRepairingNanobots)
                    .duration((int) (80 * cost[i])).EUt(VA[UV]).buildAndRegister();
        }
    }
}
