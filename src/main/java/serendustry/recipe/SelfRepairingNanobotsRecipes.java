package serendustry.recipe;

import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;

import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.bolt;
import static gregtech.api.unification.ore.OrePrefix.cableGtSingle;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.foil;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.wireGtSingle;
import static gregtech.common.items.MetaItems.NEURO_PROCESSOR;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UEV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UV;
import static java.lang.Math.max;
import static serendustry.item.material.SerendustryMaterials.ALMST;
import static serendustry.item.material.SerendustryMaterials.Ferrofluid;
import static serendustry.item.material.SerendustryMaterials.HalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.HighGradeSolderingAlloy;
import static serendustry.item.material.SerendustryMaterials.Hihiirokane;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.MolybdeniteLubricant;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;
import static serendustry.item.material.SerendustryMaterials.SelfRepairingNanobots;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.item.material.SerendustryMaterials.TengamAttuned;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;

public class SelfRepairingNanobotsRecipes {

    public static void init() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(circuit, MarkerMaterials.Tier.UHV)
                .input(ROBOT_ARM_UV)
                .input(bolt, VibraniumAlloy, 32)
                .input(foil, ALMST, 64)
                .input(cableGtSingle, Hihiirokane, 16)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 8),
                        MolybdeniteLubricant.getFluid(8000))
                .output(dust, SelfRepairingNanobots, 64)
                .stationResearch(b -> b
                        .researchStack(OreDictUnifier.get(plate, HighGradeSolderingAlloy))
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(400).EUt(400000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(NEURO_PROCESSOR)
                .input(circuit, MarkerMaterials.Tier.UEV, 2)
                .input(ROBOT_ARM_UEV)
                .input(bolt, HalkoniteSteel, 64)
                .input(foil, TengamAttuned, 64)
                .input(foil, RadoxPolymer, 64)
                .input(cableGtSingle, Quantium40, 32)
                .input(wireGtSingle, Hypogen, 16)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 128),
                        Ferrofluid.getFluid(16000))
                .output(dust, SentientNanobots, 64)
                .stationResearch(b -> b
                        .researchStack(OreDictUnifier.get(dust, SelfRepairingNanobots))
                        .CWUt(144)
                        .EUt(VA[UEV]))
                .duration(800).EUt(800000).buildAndRegister();

        Material[] materials = { SelfRepairingNanobots, SentientNanobots };
        OrePrefix[] parts = { dust, plate, foil };
        float[] cost = { 1.0F, 1.0f, 0.25F };

        for (Material material : materials) {
            for (int i = 0; i < parts.length; i++) {
                for (int j = 0; j < parts.length; j++) {

                    if (i == j) continue;

                    ASSEMBLER_RECIPES.recipeBuilder()
                            .input(parts[i], material, (int) (max(cost[j] / cost[i], 1)))
                            .circuitMeta(j + 1)
                            .output(parts[j], material, (int) (max(cost[i] / cost[j], 1)))
                            .duration((int) (80 * cost[j])).EUt(VA[UV]).buildAndRegister();
                }

                ASSEMBLER_RECIPES.recipeBuilder()
                        .input(parts[i], material)
                        .circuitMeta(parts.length + 1)
                        .fluidOutputs(material.getFluid((int) (144 * cost[i])))
                        .duration((int) (80 * cost[i])).EUt(VA[UV]).buildAndRegister();

                ASSEMBLER_RECIPES.recipeBuilder()
                        .fluidInputs(material.getFluid((int) (144 * cost[i])))
                        .circuitMeta(i + 1)
                        .output(parts[i], material)
                        .duration((int) (80 * cost[i])).EUt(VA[UV]).buildAndRegister();
            }
        }
    }
}
