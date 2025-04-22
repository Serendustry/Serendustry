package serendustry.recipe;

import gregtech.api.GTValues;
import gregtech.api.unification.material.MarkerMaterials;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.SENSOR_HV;
import static gregtech.common.metatileentities.MetaTileEntities.HULL;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.CVD_CHAMBER;
import static serendustry.machine.SerendustryRecipeMaps.CVD_RECIPES;

public class SemiconductorGradeSiliconChain {
    public static void init() {

        FLUID_HEATER_RECIPES.recipeBuilder()
                .input(dust, SiliconDioxide, 3)
                .input(dust, Magnesium, 2)
                .output(dust, MagnesiumSilicide, 3)
                .fluidOutputs(Oxygen.getFluid(6000))
                .duration(60).EUt(VA[MV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, MagnesiumSilicide, 1)
                .fluidInputs(HydrochloricAcid.getFluid(4000))
                .output(dust, MagnesiumDichloride, 2)
                .fluidOutputs(Silane.getFluid(1000))
                .duration(60).EUt(VA[MV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(HULL[GTValues.HV])
                .input(circuit, MarkerMaterials.Tier.HV, 4)
                .input(SENSOR_HV, 2)
                .input(plate, StainlessSteel, 16)
                .input(plate, Polyethylene, 16)
                .input(cableGtSingle, Gold, 32)
                .fluidInputs(Polyethylene.getFluid(144 * 16))
                .output(CVD_CHAMBER)
                .duration(60).EUt(VA[HV]).buildAndRegister();

        CVD_RECIPES.recipeBuilder()
                .fluidInputs(Silane.getFluid(1000),
                        Nitrogen.getFluid(100))
                .output(dust, SemiconductorGradeSilicon)
                .fluidOutputs(Hydrogen.getFluid(4000))
                .duration(300).EUt(VA[MV]).buildAndRegister();
    }
}
