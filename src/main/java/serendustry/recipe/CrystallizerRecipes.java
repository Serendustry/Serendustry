package serendustry.recipe;

import static gregtech.api.unification.material.Materials.Charcoal;
import static gregtech.api.unification.material.Materials.EnderEye;
import static gregtech.api.unification.material.Materials.EnderPearl;
import static gregtech.api.unification.material.Materials.Flint;
import static gregtech.api.unification.material.Materials.NetherStar;
import static gregtech.api.unification.material.Materials.Sugar;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.gem;
import static gregtech.api.unification.ore.OrePrefix.gemExquisite;
import static gregtech.api.unification.ore.OrePrefix.gemFlawless;
import static serendustry.machine.SerendustryRecipeMaps.CRYSTALLIZER_RECIPES;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.PropertyKey;

public class CrystallizerRecipes {

    static Material[] materials = GregTechAPI.materialManager.getRegisteredMaterials().toArray(new Material[0]);

    public static void init() {
        Material[] Vanilla = { Charcoal, Sugar, EnderPearl, NetherStar, Flint, EnderEye };

        for (Material material : materials) {

            // Skip material if it doesn't have a gem
            if (!material.hasProperty(PropertyKey.GEM)) continue;

            CRYSTALLIZER_RECIPES.recipeBuilder()
                    .circuitMeta(1)
                    .input(dust, material)
                    .output(gem, material)
                    .duration(10)
                    .EUt(GTValues.VA[GTValues.UV])
                    .buildAndRegister();

            // Skip material if it doesn't have flawless / exquisite gems
            if (material.hasFlag(MaterialFlags.NO_UNIFICATION) || gemExquisite.isIgnored(material)) continue;

            CRYSTALLIZER_RECIPES.recipeBuilder()
                    .circuitMeta(2)
                    .input(dust, material, 2)
                    .output(gemFlawless, material)
                    .duration(20)
                    .EUt(GTValues.VA[GTValues.UV])
                    .buildAndRegister();

            CRYSTALLIZER_RECIPES.recipeBuilder()
                    .circuitMeta(4)
                    .input(dust, material, 4)
                    .output(gemExquisite, material)
                    .duration(40)
                    .EUt(GTValues.VA[GTValues.UV])
                    .buildAndRegister();
        }
    }
}
