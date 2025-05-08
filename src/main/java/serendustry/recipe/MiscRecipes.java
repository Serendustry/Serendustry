package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static serendustry.item.SerendustryMetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryRecipeMaps.ACR_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.CVD_RECIPES;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;

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
        }

        CVD_RECIPES.recipeBuilder()
                .circuitMeta(1)
                .fluidInputs(Methane.getFluid(100), Hydrogen.getFluid(10000))
                .output(gemExquisite, Diamond)
                .duration(400).EUt(VA[HV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(QUANTUM_STAR)
                .fluidInputs(Tennessine.getFluid(144 * 8))
                .output(GRAVI_STAR)
                .duration(20 * 24).EUt(VA[IV]).buildAndRegister();

        // test recipes
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, Neutronium)
                .input(gearSmall, Neutronium)
                .input(plate, Iron)
                .fluidInputs(Hydrogen.getFluid(1))
                .output(Items.EGG)
                .duration(20 * 60 * 60).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, Adamantium)
                .input(gearSmall, Neutronium)
                .input(plate, Iron)
                .fluidInputs(Hydrogen.getFluid(1))
                .output(Items.EGG)
                .duration(20).EUt(VA[LV]).buildAndRegister();

        IMPLOSION_RECIPES.recipeBuilder()
                .input(Blocks.DIRT)
                .output(Blocks.OBSIDIAN)
                .explosivesAmount(1)
                .duration(20 * 60 * 240 * 32).EUt(VA[ULV]).buildAndRegister();

        // 7 Recip Compressor 6 Liq Cooler
        ACR_RECIPES.recipeBuilder()
                .temperature(200, 250)
                .pressure(300, 350)
                .input(dust, Iron)
                .output(dust, Gold)
                .duration(20).EUt(VA[UV]).buildAndRegister();

        ACR_RECIPES.recipeBuilder()
                .temperature(20, 30)
                .pressure(80, 120)
                .input(dust, BlueSteel)
                .output(dust, Emerald)
                .duration(20).EUt(VA[UV]).buildAndRegister();

        ACR_RECIPES.recipeBuilder()
                .temperature(3100, 3200)
                .pressure(120, 140)
                .input(dust, RedSteel)
                .output(dust, Sapphire)
                .duration(20).EUt(VA[UV]).buildAndRegister();

        ACR_RECIPES.recipeBuilder()
                .temperature(100, 150)
                .pressure(20, 30)
                .input(dust, Steel)
                .output(dust, Ruby)
                .duration(20).EUt(VA[UV]).buildAndRegister();

        ACR_RECIPES.recipeBuilder()
                .temperature(600, 650)
                .pressure(2000, 2100)
                .input(dust, BlackSteel)
                .output(dust, Silver)
                .duration(20).EUt(VA[UV]).buildAndRegister();
    }
}
