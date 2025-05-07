package serendustry.recipe;

import static gregtech.api.unification.material.Materials.*;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryRecipeMaps.PLASMA_CONDENSER_RECIPES;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.FluidProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import serendustry.machine.PlasmaCondenserTypeProperty;

public class PlasmaCondenserRecipes {

    static Material[] materials = GregTechAPI.materialManager.getRegisteredMaterials().toArray(new Material[0]);

    public static void init() {
        Material[] exoticMaterials = { Germanium, Selenium, Bromine, Rubidium, Rhenium, Thallium, Flerovium, Moscovium, Tennessine, Oganesson, Neutronium, Draconium, AwakenedDraconium, Infinity, Dragonblood, Rhugnor, Hypogen, ChromaticGlass, Shirabon, Periodicium };

        for (Material material : materials) {
            FluidProperty prop = material.getProperty(PropertyKey.FLUID);
            if (prop == null) {
                prop = new FluidProperty();
            }

            // Skip material if it doesn't have a fluid and a plasma
            if ((prop.get(FluidStorageKeys.LIQUID) == null && prop.get(FluidStorageKeys.GAS) == null) ||
                    prop.get(FluidStorageKeys.PLASMA) == null) {
                continue;
            }

            // Certain high tier materials get more expensive recipes
            boolean isExotic = false;
            for (Material exoticMaterial : exoticMaterials) {
                if (material == exoticMaterial) {
                    isExotic = true;
                    break;
                }
            }

            // Whether to measure by ingots or buckets
            boolean isSolid = material.hasProperty(PropertyKey.DUST) || material.hasProperty(PropertyKey.INGOT) ||
                    material.hasProperty(PropertyKey.GEM);

            Integer recipeTier = isExotic ? Integer.valueOf(1) : Integer.valueOf(0);

            PLASMA_CONDENSER_RECIPES.recipeBuilder()
                    .recipeType(PlasmaCondenserTypeProperty.COOLING)
                    .recipeTier(recipeTier)
                    .fluidInputs(BlackStarMatter.getFluid(isExotic ? 10000 : 1),
                            material.getPlasma(isSolid ? 1440 : 10000))
                    .fluidOutputs(material.getFluid(isSolid ? 1440 : 10000))
                    .duration(isExotic ? 64 : 1)
                    .EUt((int) GTValues.V[GTValues.MAX])
                    .buildAndRegister();

            PLASMA_CONDENSER_RECIPES.recipeBuilder()
                    .recipeType(PlasmaCondenserTypeProperty.HEATING)
                    .recipeTier(recipeTier)
                    .fluidInputs(CondensedStarMatter.getFluid(isExotic ? 10000 : 1),
                            material.getFluid(isSolid ? 1440 : 10000))
                    .fluidOutputs(material.getPlasma(isSolid ? 1440 : 10000))
                    .duration(isExotic ? 64 : 1)
                    .EUt((int) GTValues.V[GTValues.MAX])
                    .buildAndRegister();
        }

        /*
        Stellar Engine OW output: 29 different plasmas, 25,000 recipes each
            To process all of that would take 36,250s without overclocking (2GEUt == 4,096A UV == 1,024A UHV == 256A UEV == 64A UIV)
            Using a 4,096A UIV laser grants 3 POCs (64x speed) and takes 566.4s
            With upgraded cooling coils this takes 141.6s

            This also uses 725k Black Star Matter, which takes 72.5 of the Space Elevator recipe, which will take ~630.4 scans to get data for
            All of these SE recipes should take 187.15625s assuming 1 SE with 4,096A UIV (which is somewhat unrealistic, but even if this was several times slower, it's fine)
            All 630.4 Star Scanning Drones would take ~164s in a single 1A UIV Assembler Multi (since 256 parallel); all 72.5 Star Harvesting Drones would take ~170s

        Stellar Engine End output: 10 different exotic plasmas, 25,000 recipes each
            To process all of that would take 800,000s (222.2h) without overclocking
            Using a 4,096A UIV laser grants 3 POCs (64x speed) and takes 12,500s (208.3m)

        Realistically no one will process anywhere near all of the Stellar Engine outputs. It's just not necessary. Unless, of course, it is made necessary...
        */

    }
}
