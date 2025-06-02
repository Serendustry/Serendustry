package serendustry.recipe;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.FluidProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import serendustry.machine.PlasmaCondenserTypeProperty;

import static gregtech.api.GTValues.EV;
import static gregtech.api.GTValues.V;
import static gregtech.api.recipes.RecipeMaps.PLASMA_GENERATOR_FUELS;
import static gregtech.api.unification.material.Materials.Americium;
import static gregtech.api.unification.material.Materials.Argon;
import static gregtech.api.unification.material.Materials.Bromine;
import static gregtech.api.unification.material.Materials.Flerovium;
import static gregtech.api.unification.material.Materials.Germanium;
import static gregtech.api.unification.material.Materials.Helium;
import static gregtech.api.unification.material.Materials.Iron;
import static gregtech.api.unification.material.Materials.Moscovium;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Nickel;
import static gregtech.api.unification.material.Materials.Nitrogen;
import static gregtech.api.unification.material.Materials.Oganesson;
import static gregtech.api.unification.material.Materials.Oxygen;
import static gregtech.api.unification.material.Materials.Rhenium;
import static gregtech.api.unification.material.Materials.Rubidium;
import static gregtech.api.unification.material.Materials.Selenium;
import static gregtech.api.unification.material.Materials.Tennessine;
import static gregtech.api.unification.material.Materials.Thallium;
import static gregtech.api.unification.material.Materials.Tin;
import static serendustry.item.material.SerendustryMaterials.AwakenedDraconium;
import static serendustry.item.material.SerendustryMaterials.BlackStarMatter;
import static serendustry.item.material.SerendustryMaterials.ChromaticGlass;
import static serendustry.item.material.SerendustryMaterials.CondensedStarMatter;
import static serendustry.item.material.SerendustryMaterials.Draconium;
import static serendustry.item.material.SerendustryMaterials.Dragonblood;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.Periodicium;
import static serendustry.item.material.SerendustryMaterials.Rhugnor;
import static serendustry.item.material.SerendustryMaterials.Shirabon;
import static serendustry.machine.SerendustryRecipeMaps.PLASMA_CONDENSER_RECIPES;

public class PlasmaCondenserRecipes {

    static Material[] materials = GregTechAPI.materialManager.getRegisteredMaterials().toArray(new Material[0]);

    public static void init() {
        Material[] exoticMaterials = { Germanium, Selenium, Bromine, Rubidium, Rhenium, Thallium, Flerovium, Moscovium,
                Tennessine, Oganesson, Neutronium, Draconium, AwakenedDraconium, Infinity, Dragonblood, Rhugnor,
                Hypogen, ChromaticGlass, Shirabon, Periodicium };

        Material[] plasmaFuels = { Helium, Oxygen, Nitrogen, Argon, Iron, Tin, Nickel, Americium };

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
                    .duration(isExotic ? 64 * 16 : 16)
                    .EUt(GTValues.VA[GTValues.UIV])
                    .buildAndRegister();

            PLASMA_CONDENSER_RECIPES.recipeBuilder()
                    .recipeType(PlasmaCondenserTypeProperty.HEATING)
                    .recipeTier(recipeTier)
                    .fluidInputs(CondensedStarMatter.getFluid(isExotic ? 10000 : 1),
                            material.getFluid(isSolid ? 1440 : 10000))
                    .fluidOutputs(material.getPlasma(isSolid ? 1440 : 10000))
                    .duration(isExotic ? 64 * 16 : 16)
                    .EUt(GTValues.VA[GTValues.UIV])
                    .buildAndRegister();

            // Also doing plasma generator fuels here since I've already done all the checking + they're unimportant

            // Make sure the recipe doesn't already exist
            boolean isFuel = false;
            for (Material fuel : plasmaFuels) {
                if (material == fuel) {
                    isFuel = true;
                    break;
                }
            }

            if (isFuel) continue;

            PLASMA_GENERATOR_FUELS.recipeBuilder()
                    .fluidInputs(material.getPlasma(1))
                    .fluidOutputs(material.getFluid(1))
                    .duration(isExotic ? 3600 : 192) // todo balance numbers
                    .EUt((int) V[EV])
                    .buildAndRegister();
        }

        /*
         * Stellar Engine OW output: 29 different plasmas, 25,000 recipes each
         * To process all of that would take 500ks without overclocking
         * Using a 4,096A UIV laser grants 6 POCs (4096x speed) and takes 2265.625s
         * With upgraded cooling coils this takes 566.375s
         * 
         * This also uses 725k Black Star Matter, which takes 72.5 of the Space Elevator recipe, which will take ~630.4
         * scans to get data for
         * All of these SE recipes should take 187.15625s assuming 1 SE with 4,096A UIV (which is somewhat unrealistic,
         * but even if this was several times slower, it's fine)
         * All 630.4 Star Scanning Drones would take ~164s in a single 1A UIV Assembler Multi (since 256 parallel); all
         * 72.5 Star Harvesting Drones would take ~170s
         * 
         * Stellar Engine End output: 9 different exotic plasmas, 25,000 recipes each
         * To process all of that would take 11.52Ms without overclocking
         * Using a 4,096A UIV laser grants 6 POCs (4096x speed) and takes 2812.5s
         * 
         * Realistically no one will process anywhere near all of the Stellar Engine outputs. It's just not necessary.
         * Unless, of course, it is made necessary...
         */
    }
}
