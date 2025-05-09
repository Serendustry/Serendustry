package serendustry.recipe;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.PropertyKey;

import static gregtech.api.unification.material.Materials.Nitrogen;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.gem;
import static gregtech.api.unification.ore.OrePrefix.gemExquisite;
import static gregtech.api.unification.ore.OrePrefix.gemFlawless;
import static serendustry.machine.SerendustryRecipeMaps.CRYSTALLIZER_RECIPES;

public class CrystallizerRecipes {

    static Material[] materials = GregTechAPI.materialManager.getRegisteredMaterials().toArray(new Material[0]);

    public static void init() {
        for (Material material : materials) {

            // Skip material if it doesn't have a gem
            if (!material.hasProperty(PropertyKey.GEM)) continue;

            CRYSTALLIZER_RECIPES.recipeBuilder()
                    .circuitMeta(1)
                    .input(dust, material)
                    .fluidInputs(Nitrogen.getFluid(FluidStorageKeys.LIQUID, 4))
                    .output(gem, material)
                    .duration(1)
                    .EUt(GTValues.VA[GTValues.ZPM])
                    .buildAndRegister();

            // Skip material if it doesn't have flawless / exquisite gems
            if (material.hasFlag(MaterialFlags.NO_UNIFICATION) || gemExquisite.isIgnored(material)) continue;

            CRYSTALLIZER_RECIPES.recipeBuilder()
                    .circuitMeta(2)
                    .input(dust, material, 2)
                    .fluidInputs(Nitrogen.getFluid(FluidStorageKeys.LIQUID, 8))
                    .output(gemFlawless, material)
                    .duration(2)
                    .EUt(GTValues.VA[GTValues.ZPM])
                    .buildAndRegister();

            CRYSTALLIZER_RECIPES.recipeBuilder()
                    .circuitMeta(4)
                    .input(dust, material, 4)
                    .fluidInputs(Nitrogen.getFluid(FluidStorageKeys.LIQUID, 16))
                    .output(gemExquisite, material)
                    .duration(4)
                    .EUt(GTValues.VA[GTValues.ZPM])
                    .buildAndRegister();
        }
    }
}
