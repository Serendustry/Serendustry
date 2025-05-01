package serendustry.recipe;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.FluidProperty;
import gregtech.api.unification.material.properties.PropertyKey;

import static gregtech.api.unification.material.Materials.Flerovium;
import static gregtech.api.unification.material.Materials.Neutronium;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryRecipeMaps.PLASMA_CONDENSER_RECIPES;

public class PlasmaCondenserRecipes {
    static Material[] materials = GregTechAPI.materialManager.getRegisteredMaterials().toArray(new Material[0]);

    public static void init() {
        Material[] exoticMaterials = {Flerovium, Neutronium, Draconium, AwakenedDraconium, Infinity, Dragonblood, Rhugnor, Hypogen, ChromaticGlass, Shirabon, Periodicium};

        for(Material material : materials) {
            FluidProperty prop = material.getProperty(PropertyKey.FLUID);
            if (prop == null) {prop = new FluidProperty();}

            // Skip material if it doesn't have a fluid and a plasma
            if ((prop.get(FluidStorageKeys.LIQUID) == null && prop.get(FluidStorageKeys.GAS) == null) || prop.get(FluidStorageKeys.PLASMA) == null) {continue;}

            // Certain high tier materials get more expensive recipes
            boolean isExotic = false;
            for(Material exoticMaterial : exoticMaterials) {
                if(material == exoticMaterial){
                    isExotic = true;
                    break;
                }
            }

            // Whether to measure by ingots or buckets
            boolean isSolid = material.hasProperty(PropertyKey.DUST) || material.hasProperty(PropertyKey.INGOT) || material.hasProperty(PropertyKey.GEM);

            PLASMA_CONDENSER_RECIPES.recipeBuilder()
                    .fluidInputs(BlackStarMatter.getFluid(isExotic ? 1000 : 10),
                            material.getPlasma(isSolid ? 144 : 1000))
                    .fluidOutputs(material.getFluid(isSolid ? 144 : 1000))
                    .duration(isExotic ? 16*20 : 16).EUt(GTValues.VA[isExotic ? GTValues.MAX : GTValues.UHV]).buildAndRegister();

            PLASMA_CONDENSER_RECIPES.recipeBuilder()
                    .fluidInputs(CondensedStarMatter.getFluid(isExotic ? 1000 : 10),
                            material.getFluid(isSolid ? 144 : 1000))
                    .fluidOutputs(material.getPlasma(isSolid ? 144 : 1000))
                    .duration(isExotic ? 16*20 : 16).EUt(GTValues.VA[isExotic ? GTValues.MAX : GTValues.UHV]).buildAndRegister();
        }
    }
}
