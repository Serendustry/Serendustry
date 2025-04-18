package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gregtech.common.metatileentities.MetaTileEntities.HULL;
import static serendustry.item.SerendustryMetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.*;
import static serendustry.machine.SerendustryRecipeMaps.CVD_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.LABORATORY_RECIPES;

import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.chance.output.ChancedOutputLogic;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Material;
import net.minecraft.init.Items;

public class MiscRecipes {

    public static void init() {
        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(dust, MagnetoResonatic)
                .fluidInputs(DistilledWater.getFluid(50))
                .output(gem, MagnetoResonatic)
                .duration(600).EUt(24).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(dust, Glass, 64)
                .input(QUANTUM_ANOMALY)
                .output(dust, ChromaticGlass)
                .duration(1200).EUt(VA[UHV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(dust, Redstone, 64)
                .input(QUANTUM_ANOMALY)
                .output(dust, OmniversalRedstone)
                .duration(400).EUt(VA[UV]).buildAndRegister();

        BREWING_RECIPES.recipeBuilder()
                .input(dust, OmniversalRedstone)
                .fluidInputs(Xenoxene.getFluid(1000))
                .fluidOutputs(OmniversalLubricant.getFluid(1000))
                .duration(400).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(OmniversalLubricant.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
                .fluidOutputs(OmniversalLubricant.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(GRAVI_STAR)
                .fluidInputs(Quantium40.getFluid(144 * 2))
                .output(QUANTIUM_STAR)
                .duration(20 * 24).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Infinity.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
                .fluidOutputs(Infinity.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Periodicium.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
                .fluidOutputs(Periodicium.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Shirabon.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
                .fluidOutputs(Shirabon.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Flerovium.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
                .fluidOutputs(Flerovium.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Phosphorus.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
                .fluidOutputs(Phosphorus.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Protactinium.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
                .fluidOutputs(Protactinium.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Redstone.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
                .fluidOutputs(Redstone.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Glass.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
                .fluidOutputs(Glass.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Lead.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
                .fluidOutputs(Lead.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        ModHandler.addSmeltingRecipe(OreDictUnifier.get(nugget, Neutronium),
                OreDictUnifier.get(nugget, WroughtNeutronium));

        // todo: hot wood ingot
        /*
         * VACUUM_RECIPES.recipeBuilder()
         * .input(HOT_WOOD_INGOT)
         * .duration(65535).EUt(MAX).buildAndRegister();
         */

        EXTRACTOR_RECIPES.recipeBuilder()
                .input(dust, CheeseAmerican)
                .output(dust, Polyethylene)
                .duration(20).EUt(VA[LV]).buildAndRegister();

        WIREMILL_RECIPES.recipeBuilder()
                .input(stickLong, CheeseMozzarella)
                .output(Items.STRING, 8)
                .duration(40).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(foil, BoneSteel)
                .fluidInputs(Oxygen.getFluid(1000))
                .output(foil, Oxygen)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Molybdenite)
                .fluidInputs(Chrome.getFluid(72))
                .output(dust, ChromiumDopedMolybdenite)
                .duration(256).EUt(VA[HV]).buildAndRegister();

        for (Material material : new Material[] { Oil, Creosote, SeedOil }) {
            BREWING_RECIPES.recipeBuilder()
                    .input(dust, ChromiumDopedMolybdenite)
                    .input(dust, Graphite)
                    .fluidInputs(material.getFluid(1000))
                    .fluidOutputs(MolybdeniteLubricant.getFluid(1000))
                    .duration(256).EUt(VA[HV]).buildAndRegister();

            CVD_RECIPES.recipeBuilder()
                    .circuitMeta(1)
                    .fluidInputs(Methane.getFluid(100), Hydrogen.getFluid(10000))
                    .output(gemExquisite, Diamond)
                    .duration(400).EUt(VA[HV]).buildAndRegister();
        }
    }
}
