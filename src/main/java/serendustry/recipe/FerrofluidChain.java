package serendustry.recipe;

import static gregtech.api.GTValues.IV;
import static gregtech.api.GTValues.LV;
import static gregtech.api.GTValues.MV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.DISTILLATION_RECIPES;
import static gregtech.api.recipes.RecipeMaps.MIXER_RECIPES;
import static gregtech.api.unification.material.Materials.Ammonia;
import static gregtech.api.unification.material.Materials.CalciumChloride;
import static gregtech.api.unification.material.Materials.DistilledWater;
import static gregtech.api.unification.material.Materials.HydrochloricAcid;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.Iron;
import static gregtech.api.unification.material.Materials.Iron3Chloride;
import static gregtech.api.unification.material.Materials.Lubricant;
import static gregtech.api.unification.material.Materials.Methanol;
import static gregtech.api.unification.material.Materials.SeedOil;
import static gregtech.api.unification.material.Materials.Water;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static serendustry.item.material.SerendustryMaterials.AmmoniumOleate;
import static serendustry.item.material.SerendustryMaterials.Ferrofluid;
import static serendustry.item.material.SerendustryMaterials.Iron2Chloride;
import static serendustry.item.material.SerendustryMaterials.Kerosene;
import static serendustry.item.material.SerendustryMaterials.MagneticNanoparticleMixture;
import static serendustry.item.material.SerendustryMaterials.OleicAcid;
import static serendustry.item.material.SerendustryMaterials.StearicAcid;

public class FerrofluidChain {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Iron)
                .fluidInputs(Iron3Chloride.getFluid(1000))
                .fluidOutputs(Iron2Chloride.getFluid(1000))
                .duration(80).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Iron)
                .fluidInputs(HydrochloricAcid.getFluid(1000),
                        Methanol.getFluid(1000))
                .fluidOutputs(Iron2Chloride.getFluid(1000))
                .circuitMeta(2)
                .duration(80).EUt(VA[LV]).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(SeedOil.getFluid(1000))
                .output(dust, StearicAcid)
                .fluidOutputs(Lubricant.getFluid(500))
                .duration(650).EUt(VA[MV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, StearicAcid)
                .input(dust, CalciumChloride)
                .fluidOutputs(OleicAcid.getFluid(1000))
                .duration(240).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(OleicAcid.getFluid(500),
                        Hydrogen.getFluid(1000))
                .output(dust, StearicAcid)
                .duration(240).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000),
                        OleicAcid.getFluid(1000),
                        Ammonia.getFluid(1000))
                .output(dust, AmmoniumOleate)
                .duration(240).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, AmmoniumOleate)
                .fluidInputs(DistilledWater.getFluid(1000),
                        Iron2Chloride.getFluid(1000),
                        Iron3Chloride.getFluid(1000),
                        HydrochloricAcid.getFluid(1000))
                .output(dust, MagneticNanoparticleMixture)
                .duration(480).EUt(VA[IV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, MagneticNanoparticleMixture, 10)
                .fluidInputs(Kerosene.getFluid(1000))
                .fluidOutputs(Ferrofluid.getFluid(1000))
                .duration(2400).EUt(VA[ZPM]).buildAndRegister();
    }
}
