package serendustry.recipe;

import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import static gregtech.api.GTValues.EV;
import static gregtech.api.GTValues.HV;
import static gregtech.api.GTValues.IV;
import static gregtech.api.GTValues.LV;
import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.ULV;
import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.AUTOCLAVE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.BREWING_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_BATH_RECIPES;
import static gregtech.api.recipes.RecipeMaps.EXTRACTOR_RECIPES;
import static gregtech.api.recipes.RecipeMaps.IMPLOSION_RECIPES;
import static gregtech.api.recipes.RecipeMaps.LASER_ENGRAVER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.VACUUM_RECIPES;
import static gregtech.api.recipes.RecipeMaps.WIREMILL_RECIPES;
import static gregtech.api.unification.material.Materials.Chrome;
import static gregtech.api.unification.material.Materials.Creosote;
import static gregtech.api.unification.material.Materials.Diamond;
import static gregtech.api.unification.material.Materials.DistilledWater;
import static gregtech.api.unification.material.Materials.Glass;
import static gregtech.api.unification.material.Materials.Graphite;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.Iron;
import static gregtech.api.unification.material.Materials.Methane;
import static gregtech.api.unification.material.Materials.Molybdenite;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Nitrogen;
import static gregtech.api.unification.material.Materials.Oil;
import static gregtech.api.unification.material.Materials.Oxygen;
import static gregtech.api.unification.material.Materials.Polyethylene;
import static gregtech.api.unification.material.Materials.Redstone;
import static gregtech.api.unification.material.Materials.SeedOil;
import static gregtech.api.unification.material.Materials.Tennessine;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.foil;
import static gregtech.api.unification.ore.OrePrefix.gearSmall;
import static gregtech.api.unification.ore.OrePrefix.gem;
import static gregtech.api.unification.ore.OrePrefix.gemExquisite;
import static gregtech.api.unification.ore.OrePrefix.nugget;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.common.items.MetaItems.GRAVI_STAR;
import static gregtech.common.items.MetaItems.QUANTUM_STAR;
import static serendustry.item.SerendustryMetaItems.QUANTIUM_STAR;
import static serendustry.item.SerendustryMetaItems.QUANTUM_ANOMALY;
import static serendustry.item.material.SerendustryMaterials.Adamantium;
import static serendustry.item.material.SerendustryMaterials.BoneSteel;
import static serendustry.item.material.SerendustryMaterials.CheeseAmerican;
import static serendustry.item.material.SerendustryMaterials.CheeseMozzarella;
import static serendustry.item.material.SerendustryMaterials.ChromaticGlass;
import static serendustry.item.material.SerendustryMaterials.ChromiumDopedMolybdenite;
import static serendustry.item.material.SerendustryMaterials.MagnetoResonatic;
import static serendustry.item.material.SerendustryMaterials.MolybdeniteLubricant;
import static serendustry.item.material.SerendustryMaterials.OmniversalLubricant;
import static serendustry.item.material.SerendustryMaterials.OmniversalRedstone;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.WroughtNeutronium;
import static serendustry.item.material.SerendustryMaterials.Xenoxene;
import static serendustry.machine.SerendustryRecipeMaps.CVD_RECIPES;

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

        // Liquid Nitrogen
        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(Nitrogen.getFluid(1000))
                .fluidOutputs(Nitrogen.getFluid(FluidStorageKeys.LIQUID, 1000))
                .duration(240).EUt(VA[EV]).buildAndRegister();

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
    }
}
