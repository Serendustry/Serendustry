package serendustry.recipe;

import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.BLAST_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_BATH_RECIPES;
import static gregtech.api.recipes.RecipeMaps.MIXER_RECIPES;
import static gregtech.api.unification.material.Materials.Copper;
import static gregtech.api.unification.material.Materials.Lead;
import static gregtech.api.unification.material.Materials.NitricAcid;
import static gregtech.api.unification.material.Materials.Selenium;
import static gregtech.api.unification.material.Materials.Silver;
import static gregtech.api.unification.material.Materials.Sulfur;
import static gregtech.api.unification.material.Materials.SulfurDioxide;
import static gregtech.api.unification.material.Materials.Thallium;
import static gregtech.api.unification.material.Materials.Water;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.dustImpure;
import static gregtech.api.unification.ore.OrePrefix.ingot;
import static serendustry.item.material.SerendustryMaterials.Crookesite;
import static serendustry.item.material.SerendustryMaterials.Olsacherite;
import static serendustry.item.material.SerendustryMaterials.SeleniumLeadSludge;
import static serendustry.item.material.SerendustryMaterials.SeleniumThalliumSludge;
import static serendustry.item.material.SerendustryMaterials.SelenousAcid;

public class SeleniumChain {

    public static void init() {
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Olsacherite, 12)
                .fluidInputs(NitricAcid.getFluid(1000))
                .output(dustImpure, Lead)
                .output(dustImpure, Sulfur)
                .output(dust, SeleniumLeadSludge, 10)
                .duration(20 * 20).EUt(VA[ZPM]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, SeleniumLeadSludge, 10)
                .fluidInputs(Water.getFluid(1000))
                .output(dustImpure, Lead)
                .fluidOutputs(SelenousAcid.getFluid(1000))
                .duration(20 * 20).EUt(VA[ZPM]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Crookesite, 7)
                .fluidInputs(NitricAcid.getFluid(1000))
                .output(dustImpure, Copper, 2)
                .output(dustImpure, Silver, 2)
                .output(dust, SeleniumThalliumSludge, 3)
                .duration(20 * 20).EUt(VA[ZPM]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, SeleniumThalliumSludge, 3)
                .fluidInputs(Water.getFluid(1000))
                .output(dust, Thallium, 2)
                .fluidOutputs(SelenousAcid.getFluid(1000))
                .duration(20 * 20).EUt(VA[ZPM]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(SelenousAcid.getFluid(1000),
                        SulfurDioxide.getFluid(1000))
                // todo: change to ingotHot
                .output(ingot, Selenium)
                .blastFurnaceTemp(10800)
                .duration(20 * 20).EUt(VA[ZPM]).buildAndRegister();
    }
}
