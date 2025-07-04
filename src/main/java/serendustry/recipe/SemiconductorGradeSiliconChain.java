package serendustry.recipe;

import static gregtech.api.GTValues.HV;
import static gregtech.api.GTValues.MV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.HydrochloricAcid;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.Magnesium;
import static gregtech.api.unification.material.Materials.Nitrogen;
import static gregtech.api.unification.material.Materials.Oxygen;
import static gregtech.api.unification.material.Materials.Polyethylene;
import static gregtech.api.unification.material.Materials.SiliconDioxide;
import static gregtech.api.unification.material.Materials.StainlessSteel;
import static gregtech.api.unification.ore.OrePrefix.cableGtSingle;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.common.items.MetaItems.SENSOR_HV;
import static gregtech.common.metatileentities.MetaTileEntities.HULL;
import static serendustry.item.material.SerendustryMaterials.MagnesiumDichloride;
import static serendustry.item.material.SerendustryMaterials.MagnesiumSilicide;
import static serendustry.item.material.SerendustryMaterials.SemiconductorGradeSilicon;
import static serendustry.item.material.SerendustryMaterials.Silane;
import static serendustry.machine.SerendustryMetaTileEntities.CVD_CHAMBER;
import static serendustry.machine.SerendustryRecipeMaps.CVD_RECIPES;

import gregtech.api.GTValues;
import gregtech.api.unification.material.MarkerMaterials;

public class SemiconductorGradeSiliconChain {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
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
