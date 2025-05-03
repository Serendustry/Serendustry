package serendustry.recipe;

import static gregtech.api.recipes.RecipeMaps.EXTRACTOR_RECIPES;
import static serendustry.item.SerendustryMetaItems.WASTE_FLUID_EXTRACTOR;
import static serendustry.item.SerendustryMetaItems.WASTE_FLUID_EXTRACTOR_FILLED;
import static serendustry.item.material.SerendustryMaterials.AnimalWaste;
import static serendustry.machine.SerendustryRecipeMaps.LABORATORY_RECIPES;

import gregtech.api.GTValues;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;

public class WasteFluidRecipes {

    public static void init() {
        EXTRACTOR_RECIPES.recipeBuilder()
                .input(WASTE_FLUID_EXTRACTOR_FILLED)
                .output(WASTE_FLUID_EXTRACTOR)
                .fluidOutputs(AnimalWaste.getFluid(1000))
                .duration(400).EUt(30).buildAndRegister();

        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(MetaItems.BATTERY_ULV_TANTALUM).input(OrePrefix.pipeNonupleFluid,
        // Materials.Lead).inputs(MetaBlocks.WARNING_SIGN.getItemVariant(BlockWarningSign.SignType.SMALL_YELLOW_STRIPES)).input(MetaItems.BATTERY_ULV_TANTALUM)

        // .input(OrePrefix.pipeTinyFluid,
        // Materials.Lead).inputs(MetaBlocks.WARNING_SIGN.getItemVariant(BlockWarningSign.SignType.YELLOW_STRIPES)).input(OrePrefix.toolHeadScrewdriver,
        // Materials.VanadiumSteel).input(OrePrefix.toolHeadScrewdriver, Materials.Titanium)

        // .inputs(MetaBlocks.WARNING_SIGN.getItemVariant(BlockWarningSign.SignType.SMALL_YELLOW_STRIPES)).input(OrePrefix.toolHeadScrewdriver,
        // Materials.DamascusSteel).input(OrePrefix.toolHeadScrewdriver, Materials.Steel).input(OrePrefix.pipeHugeFluid,
        // Materials.Lead)

        // .input(MetaItems.BATTERY_ULV_TANTALUM).input(OrePrefix.toolHeadScrewdriver,
        // Materials.Bronze).input(OrePrefix.pipeQuadrupleFluid, Materials.Lead).input(MetaItems.BATTERY_ULV_TANTALUM)

        // .fluidInputs(AnimalWaste.getFluid(144000))
        // .fluidInputs(Naquadria.getFluid(288000))
        // .fluidInputs(Neutronium.getFluid(576000))
        // .fluidInputs(BioDiesel.getFluid(100000))
        // .output(ERROR_INGOT)
        // .EUt(GTValues.VA[GTValues.UEV]).duration(20000).buildAndRegister();

        // todo test laboratory recipe
        LABORATORY_RECIPES.recipeBuilder()
                .input(OrePrefix.ingot, Materials.Iron)
                .output(OrePrefix.dust, Materials.Gold)
                .requireInside(RecipeMaps.CHEMICAL_RECIPES, GTValues.HV, 2)
                .requireInside(RecipeMaps.ELECTROLYZER_RECIPES, GTValues.HV)
                .duration(50).EUt(480).buildAndRegister();
    }
}
