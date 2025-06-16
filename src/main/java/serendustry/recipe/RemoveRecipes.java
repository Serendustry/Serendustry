package serendustry.recipe;

import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.AUTOCLAVE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.BLAST_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CENTRIFUGE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.DISTILLATION_RECIPES;
import static gregtech.api.recipes.RecipeMaps.FUSION_RECIPES;
import static gregtech.api.recipes.RecipeMaps.LARGE_CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.LASER_ENGRAVER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.MIXER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.VACUUM_RECIPES;
import static gregtech.api.unification.material.MarkerMaterials.Color.Black;
import static gregtech.api.unification.material.Materials.Agar;
import static gregtech.api.unification.material.Materials.Americium;
import static gregtech.api.unification.material.Materials.Argon;
import static gregtech.api.unification.material.Materials.Bacteria;
import static gregtech.api.unification.material.Materials.Calcium;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.DistilledWater;
import static gregtech.api.unification.material.Materials.Electrum;
import static gregtech.api.unification.material.Materials.GalliumArsenide;
import static gregtech.api.unification.material.Materials.Gelatin;
import static gregtech.api.unification.material.Materials.HSSE;
import static gregtech.api.unification.material.Materials.Helium;
import static gregtech.api.unification.material.Materials.Iron3Chloride;
import static gregtech.api.unification.material.Materials.Lubricant;
import static gregtech.api.unification.material.Materials.Meat;
import static gregtech.api.unification.material.Materials.Mutagen;
import static gregtech.api.unification.material.Materials.Naquadah;
import static gregtech.api.unification.material.Materials.Naquadria;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.NiobiumTitanium;
import static gregtech.api.unification.material.Materials.Nitrogen;
import static gregtech.api.unification.material.Materials.Osmiridium;
import static gregtech.api.unification.material.Materials.Phosphorus;
import static gregtech.api.unification.material.Materials.Platinum;
import static gregtech.api.unification.material.Materials.Polybenzimidazole;
import static gregtech.api.unification.material.Materials.Salt;
import static gregtech.api.unification.material.Materials.SamariumMagnetic;
import static gregtech.api.unification.material.Materials.SeedOil;
import static gregtech.api.unification.material.Materials.Silicon;
import static gregtech.api.unification.material.Materials.SiliconeRubber;
import static gregtech.api.unification.material.Materials.SodiumPersulfate;
import static gregtech.api.unification.material.Materials.SolderingAlloy;
import static gregtech.api.unification.material.Materials.SterileGrowthMedium;
import static gregtech.api.unification.material.Materials.Tin;
import static gregtech.api.unification.material.Materials.Tritanium;
import static gregtech.api.unification.material.Materials.Tungsten;
import static gregtech.api.unification.material.Materials.Xenon;
import static gregtech.api.unification.material.Materials.YttriumBariumCuprate;
import static gregtech.api.unification.ore.OrePrefix.block;
import static gregtech.api.unification.ore.OrePrefix.bolt;
import static gregtech.api.unification.ore.OrePrefix.cableGtSingle;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.craftingLens;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.dustSmall;
import static gregtech.api.unification.ore.OrePrefix.foil;
import static gregtech.api.unification.ore.OrePrefix.ingot;
import static gregtech.api.unification.ore.OrePrefix.ingotHot;
import static gregtech.api.unification.ore.OrePrefix.pipeSmallFluid;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.ring;
import static gregtech.api.unification.ore.OrePrefix.round;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.api.unification.ore.OrePrefix.wireFine;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_LuV;
import static gregtech.common.items.MetaItems.HIGHLY_ADVANCED_SOC;
import static gregtech.common.items.MetaItems.MULTILAYER_FIBER_BOARD;
import static gregtech.common.items.MetaItems.NEURO_PROCESSOR;
import static gregtech.common.items.MetaItems.NEUTRONIUM_WAFER;
import static gregtech.common.items.MetaItems.PETRI_DISH;
import static gregtech.common.items.MetaItems.QUANTUM_STAR;
import static gregtech.common.items.MetaItems.SENSOR_IV;
import static gregtech.common.items.MetaItems.STEM_CELLS;
import static gregtech.common.items.MetaItems.WETWARE_CIRCUIT_BOARD;
import static serendustry.item.material.SerendustryMaterials.DeepDarkSteel;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregicality.multiblocks.common.metatileentities.GCYMMetaTileEntities;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;

public class RemoveRecipes {

    public static void init() {
        // UV Motor
        GTRecipeHandler.removeRecipesByInputs(ASSEMBLY_LINE_RECIPES,
                new ItemStack[] { OreDictUnifier.get(stickLong, SamariumMagnetic),
                        OreDictUnifier.get(stickLong, Tritanium, 4), OreDictUnifier.get(ring, Tritanium, 4),
                        OreDictUnifier.get(round, Tritanium, 8),
                        OreDictUnifier.get(wireFine, Americium, 64),
                        OreDictUnifier.get(wireFine, Americium, 64),
                        OreDictUnifier.get(cableGtSingle, YttriumBariumCuprate, 2) },
                new FluidStack[] { SolderingAlloy.getFluid(576),
                        Lubricant.getFluid(1000),
                        Naquadria.getFluid(576) });

        // Neutronium
        GTRecipeHandler.removeRecipesByInputs(FUSION_RECIPES,
                new FluidStack[] { Americium.getFluid(128), Naquadria.getFluid(128) });

        // Seed Oil -> Lubricant
        GTRecipeHandler.removeRecipesByInputs(DISTILLATION_RECIPES, new FluidStack[] { SeedOil.getFluid(24) });

        // Tungsten Carbide
        GTRecipeHandler.removeRecipesByInputs(MIXER_RECIPES, new ItemStack[] {
                OreDictUnifier.get(dust, Tungsten),
                OreDictUnifier.get(dust, Carbon),
                IntCircuitIngredient.getIntegratedCircuit(1) });

        // Boules
        GTRecipeHandler.removeRecipesByInputs(BLAST_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, Silicon, 64),
                        OreDictUnifier.get(dust, Phosphorus, 8),
                        OreDictUnifier.get(dustSmall, GalliumArsenide, 2) },
                new FluidStack[] { Nitrogen.getFluid(8000) });

        GTRecipeHandler.removeRecipesByInputs(BLAST_RECIPES,
                new ItemStack[] { OreDictUnifier.get(block, Silicon, 16),
                        OreDictUnifier.get(ingot, Naquadah),
                        OreDictUnifier.get(dust, GalliumArsenide) },
                new FluidStack[] { Argon.getFluid(8000) });

        GTRecipeHandler.removeRecipesByInputs(BLAST_RECIPES,
                new ItemStack[] { OreDictUnifier.get(block, Silicon, 32),
                        OreDictUnifier.get(ingot, Neutronium, 4),
                        OreDictUnifier.get(dust, GalliumArsenide, 2) },
                new FluidStack[] { Xenon.getFluid(8000) });

        // HASoC Wafer
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                new ItemStack[] { NEUTRONIUM_WAFER.getStackForm(),
                        OreDictUnifier.get(craftingLens, Black) });

        // Elite Circuit Board
        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { MULTILAYER_FIBER_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Platinum, 8) },
                new FluidStack[] { SodiumPersulfate.getFluid(4000) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { MULTILAYER_FIBER_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Platinum, 8) },
                new FluidStack[] { Iron3Chloride.getFluid(2000) });

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { MULTILAYER_FIBER_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Platinum, 8) },
                new FluidStack[] { SodiumPersulfate.getFluid(4000) });

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { MULTILAYER_FIBER_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Platinum, 8) },
                new FluidStack[] { Iron3Chloride.getFluid(2000) });

        // Apple -> Methane
        GTRecipeHandler.removeRecipesByInputs(CENTRIFUGE_RECIPES, new ItemStack[] { new ItemStack(Items.APPLE) });

        // Agar
        GTRecipeHandler.removeRecipesByInputs(AUTOCLAVE_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, Gelatin) },
                new FluidStack[] { DistilledWater.getFluid(1000) });

        // Raw Growth Medium
        GTRecipeHandler.removeRecipesByInputs(MIXER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, Meat, 4),
                        OreDictUnifier.get(dust, Salt, 4),
                        OreDictUnifier.get(dust, Calcium, 4),
                        OreDictUnifier.get(dust, Agar, 4) },
                new FluidStack[] { Mutagen.getFluid(4000) });

        // Stem Cells
        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, Osmiridium) },
                new FluidStack[] { SterileGrowthMedium.getFluid(500),
                        Bacteria.getFluid(500) });

        // Wetware Lifesupport Circuit Board
        GTRecipeHandler.removeRecipesByInputs(CIRCUIT_ASSEMBLER_RECIPES,
                new ItemStack[] { MULTILAYER_FIBER_BOARD.getStackForm(16),
                        PETRI_DISH.getStackForm(),
                        ELECTRIC_PUMP_LuV.getStackForm(),
                        SENSOR_IV.getStackForm(),
                        OreDictUnifier.get(circuit, MarkerMaterials.Tier.IV),
                        OreDictUnifier.get(foil, NiobiumTitanium, 16) },
                new FluidStack[] { SterileGrowthMedium.getFluid(4000) });

        // Stem Cells
        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, Osmiridium) },
                new FluidStack[] { SterileGrowthMedium.getFluid(500), Bacteria.getFluid(500) });

        // Neuro Processor
        GTRecipeHandler.removeRecipesByInputs(CIRCUIT_ASSEMBLER_RECIPES, new ItemStack[] {
                WETWARE_CIRCUIT_BOARD.getStackForm(),
                STEM_CELLS.getStackForm(16),
                OreDictUnifier.get(pipeSmallFluid, Polybenzimidazole, 8),
                OreDictUnifier.get(plate, Electrum, 8),
                OreDictUnifier.get(foil, SiliconeRubber, 16),
                OreDictUnifier.get(bolt, HSSE, 8) },
                new FluidStack[] { SterileGrowthMedium.getFluid(250) });

        // Wetware LuV Circuit
        GTRecipeHandler.removeRecipesByInputs(CIRCUIT_ASSEMBLER_RECIPES, new ItemStack[] {
                NEURO_PROCESSOR.getStackForm(),
                HIGHLY_ADVANCED_SOC.getStackForm(),
                OreDictUnifier.get(wireFine, YttriumBariumCuprate, 8),
                OreDictUnifier.get(bolt, Naquadah, 8) },
                new FluidStack[] { SolderingAlloy.getFluid(72) });

        GTRecipeHandler.removeRecipesByInputs(CIRCUIT_ASSEMBLER_RECIPES, new ItemStack[] {
                NEURO_PROCESSOR.getStackForm(),
                HIGHLY_ADVANCED_SOC.getStackForm(),
                OreDictUnifier.get(wireFine, YttriumBariumCuprate, 8),
                OreDictUnifier.get(bolt, Naquadah, 8) },
                new FluidStack[] { Tin.getFluid(144) });

        // Gravi Star
        GTRecipeHandler.removeRecipesByInputs(AUTOCLAVE_RECIPES, new ItemStack[] {
                QUANTUM_STAR.getStackForm() },
                new FluidStack[] { Neutronium.getFluid(288) });

        // GCYM
        // todo: fix (doesnt work)
    }

    public static void initLate() {
        // Deep Dark Steel Hot Ingot cooling
        GTRecipeHandler.removeRecipesByInputs(VACUUM_RECIPES, new ItemStack[] {
                OreDictUnifier.get(ingotHot, DeepDarkSteel) },
                new FluidStack[] { Helium.getFluid(FluidStorageKeys.LIQUID, 500) });

        // GCYM
        ModHandler.removeRecipeByOutput(GCYMMetaTileEntities.ELECTRIC_IMPLOSION_COMPRESSOR.getStackForm());
        ModHandler.removeRecipeByOutput(GCYMMetaTileEntities.MEGA_BLAST_FURNACE.getStackForm());
        ModHandler.removeRecipeByOutput(GCYMMetaTileEntities.MEGA_VACUUM_FREEZER.getStackForm());
    }
}
