package serendustry.recipe;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Loader;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.blocks.BlockMachineCasing.MachineCasingType.UHV;
import static gregtech.common.blocks.MetaBlocks.MACHINE_CASING;
import static gregtech.common.items.MetaItems.*;

public class RemoveRecipes {
    public static void init() {
        // UV Motor
        GTRecipeHandler.removeRecipesByInputs(ASSEMBLY_LINE_RECIPES, new ItemStack[] { OreDictUnifier.get(stickLong, SamariumMagnetic), OreDictUnifier.get(stickLong, Tritanium, 4), OreDictUnifier.get(ring, Tritanium, 4), OreDictUnifier.get(round, Tritanium, 8),
                        OreDictUnifier.get(wireFine, Americium, 64),
                        OreDictUnifier.get(wireFine, Americium, 64),
                        OreDictUnifier.get(cableGtSingle, YttriumBariumCuprate, 2)},
                new FluidStack[] { SolderingAlloy.getFluid(576),
                        Lubricant.getFluid(1000),
                        Naquadria.getFluid(576)});

        // Neutronium
        GTRecipeHandler.removeRecipesByInputs(FUSION_RECIPES, new FluidStack[] { Americium.getFluid(128), Naquadria.getFluid(128) });

        // Seed Oil -> Lubricant
        GTRecipeHandler.removeRecipesByInputs(DISTILLATION_RECIPES, new FluidStack[] { SeedOil.getFluid(24) });

        // Tungsten Carbide
        GTRecipeHandler.removeRecipesByInputs(MIXER_RECIPES,new ItemStack[] {
                OreDictUnifier.get(dust, Tungsten),
                OreDictUnifier.get(dust, Carbon),
                IntCircuitIngredient.getIntegratedCircuit(1)});

        // Boules
        GTRecipeHandler.removeRecipesByInputs(BLAST_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, Silicon, 64),
                        OreDictUnifier.get(dust, Phosphorus, 8),
                        OreDictUnifier.get(dustSmall, GalliumArsenide, 2)},
                new FluidStack[] { Nitrogen.getFluid(8000) });

        GTRecipeHandler.removeRecipesByInputs(BLAST_RECIPES,
                new ItemStack[] { OreDictUnifier.get(block, Silicon, 16),
                        OreDictUnifier.get(ingot, Naquadah),
                        OreDictUnifier.get(dust, GalliumArsenide)},
                new FluidStack[] { Argon.getFluid(8000) });

        GTRecipeHandler.removeRecipesByInputs(BLAST_RECIPES,
                new ItemStack[] { OreDictUnifier.get(block, Silicon, 32),
                        OreDictUnifier.get(ingot, Neutronium, 4),
                        OreDictUnifier.get(dust, GalliumArsenide, 2)},
                new FluidStack[] { Xenon.getFluid(8000) });

        // Elite Circuit Board
        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { MULTILAYER_FIBER_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Platinum, 8)},
                new FluidStack[] { SodiumPersulfate.getFluid(4000) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { MULTILAYER_FIBER_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Platinum, 8)},
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
                    Bacteria.getFluid(500)});

        // Wetware Lifesupport Circuit Board
        GTRecipeHandler.removeRecipesByInputs(CIRCUIT_ASSEMBLER_RECIPES,
                new ItemStack[] { MULTILAYER_FIBER_BOARD.getStackForm(16),
                        PETRI_DISH.getStackForm(),
                        ELECTRIC_PUMP_LuV.getStackForm(),
                        SENSOR_IV.getStackForm(),
                        OreDictUnifier.get(circuit, MarkerMaterials.Tier.IV),
                        OreDictUnifier.get(foil, NiobiumTitanium, 16)},
                new FluidStack[] { SterileGrowthMedium.getFluid(4000) });

        // Neuro Processor
        GTRecipeHandler.removeRecipesByInputs(CIRCUIT_ASSEMBLER_RECIPES, new ItemStack[] {
                        WETWARE_CIRCUIT_BOARD.getStackForm(),
                        STEM_CELLS.getStackForm(16),
                        OreDictUnifier.get(pipeSmallFluid, Polybenzimidazole, 8),
                        OreDictUnifier.get(plate, Electrum, 8),
                        OreDictUnifier.get(foil, SiliconeRubber, 16),
                        OreDictUnifier.get(bolt, HSSE, 8) },
                new FluidStack[] { SterileGrowthMedium.getFluid(250) });

        // UHV Machine Hull
        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES, new ItemStack[] {
                MACHINE_CASING.getItemVariant(UHV),
                OreDictUnifier.get(cableGtSingle, Europium, 2) },
                new FluidStack[] { Polybenzimidazole.getFluid(288) });

        // Botania compat (should be moved to a different file)
        if (Loader.isModLoaded("botania")) { OreDictUnifier.registerOre(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("botania", "manaresource")), 1, 14), "ingotGaiaSpirit"); }

    }
}
