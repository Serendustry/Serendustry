package serendustry.recipe;

import gregtech.api.GTValues;
import gregtech.api.unification.material.MarkerMaterials;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CENTRIFUGE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_BATH_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES;
import static gregtech.api.unification.material.Materials.Aluminium;
import static gregtech.api.unification.material.Materials.Antimony;
import static gregtech.api.unification.material.Materials.AquaRegia;
import static gregtech.api.unification.material.Materials.Arsenic;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.Copper;
import static gregtech.api.unification.material.Materials.Darmstadtium;
import static gregtech.api.unification.material.Materials.FluoroantimonicAcid;
import static gregtech.api.unification.material.Materials.Gallium;
import static gregtech.api.unification.material.Materials.Germanium;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.Iron;
import static gregtech.api.unification.material.Materials.Lead;
import static gregtech.api.unification.material.Materials.Naquadah;
import static gregtech.api.unification.material.Materials.Naquadria;
import static gregtech.api.unification.material.Materials.Neodymium;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Platinum;
import static gregtech.api.unification.material.Materials.Silicon;
import static gregtech.api.unification.material.Materials.Stone;
import static gregtech.api.unification.material.Materials.Tin;
import static gregtech.api.unification.material.Materials.Tungsten;
import static gregtech.api.unification.material.Materials.Zinc;
import static gregtech.api.unification.ore.OrePrefix.cableGtDouble;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.gear;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UHV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UV;
import static serendustry.item.material.SerendustryMaterials.Adamantium;
import static serendustry.item.material.SerendustryMaterials.Azbantium;
import static serendustry.item.material.SerendustryMaterials.Hihiirokane;
import static serendustry.item.material.SerendustryMaterials.SelfRepairingNanobots;
import static serendustry.item.material.SerendustryMaterials.SeparatedTaraniumAlloy;
import static serendustry.item.material.SerendustryMaterials.Taranium;
import static serendustry.item.material.SerendustryMaterials.TaraniumContainingAlloy;
import static serendustry.item.material.SerendustryMaterials.TaraniumMagnetic;
import static serendustry.item.material.SerendustryMaterials.TaraniumPoorSediment;
import static serendustry.item.material.SerendustryMaterials.TaraniumPoorSludge;
import static serendustry.item.material.SerendustryMaterials.TaraniumRichSediment;
import static serendustry.item.material.SerendustryMaterials.TaraniumRichSludge;
import static serendustry.item.material.SerendustryMaterials.Vibranium;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;
import static serendustry.machine.SerendustryMetaTileEntities.DEHYDRATOR;
import static serendustry.machine.SerendustryRecipeMaps.DEHYDRATOR_RECIPES;

public class TaraniumChain {

    public static void init() {
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Stone, 64) // 64 stone
                .fluidInputs(AquaRegia.getFluid(100))
                .fluidOutputs(TaraniumPoorSludge.getFluid(100))
                .duration(20).EUt(VA[GTValues.UHV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(Blocks.STONE, 64) // 64 stone
                .fluidInputs(AquaRegia.getFluid(100))
                .fluidOutputs(TaraniumPoorSludge.getFluid(100))
                .duration(20).EUt(VA[GTValues.UHV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(Blocks.COBBLESTONE, 64) // 64 stone
                .fluidInputs(AquaRegia.getFluid(100))
                .fluidOutputs(TaraniumPoorSludge.getFluid(100))
                .duration(20).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium, 8)
                .input(ELECTRIC_PUMP_UHV, 16)
                .input(ELECTRIC_PUMP_UV, 32)
                .input(circuit, MarkerMaterials.Tier.UHV, 32)
                .input(plateDense, Neutronium, 8)
                .input(plateDense, Adamantium, 16)
                .input(plateDense, Darmstadtium, 16)
                .input(gear, Naquadria, 16)
                .input(stickLong, VibraniumAlloy, 32)
                .input(cableGtDouble, Hihiirokane, 16)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 16),
                        Neutronium.getFluid(144 * 8),
                        Adamantium.getFluid(144 * 16))
                .output(DEHYDRATOR)
                .stationResearch(b -> b
                        .researchStack(new ItemStack(Items.WATER_BUCKET))
                        .CWUt(128)
                        .EUt(VA[GTValues.UHV]))
                .duration(8000).EUt(VA[GTValues.UHV]).buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(TaraniumPoorSludge.getFluid(1000)) // 64*10 = 640 stone
                .output(dust, TaraniumPoorSediment)
                .chancedOutput(dust, Iron, 5000, 0)
                .chancedOutput(dust, Copper, 5000, 0)
                .chancedOutput(dust, Gold, 5000, 0)
                .chancedOutput(dust, Carbon, 5000, 0)
                .chancedOutput(dust, Zinc, 5000, 0)
                .chancedOutput(dust, Lead, 5000, 0)
                .chancedOutput(dust, Silicon, 5000, 0)
                .chancedOutput(dust, Tin, 5000, 0)
                .duration(20 * 10).EUt(VA[GTValues.UHV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, TaraniumPoorSediment, 8) // 640*8 = 5120 stone
                .fluidInputs(FluoroantimonicAcid.getFluid(100))
                .fluidOutputs(TaraniumRichSludge.getFluid(100))
                .duration(20 * 10 * 8).EUt(VA[GTValues.UHV]).buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(TaraniumRichSludge.getFluid(1000)) // 5120*10 = 51200 stone
                .output(dust, TaraniumRichSediment)
                .chancedOutput(dust, Antimony, 5000, 0)
                .chancedOutput(dust, Gallium, 5000, 0)
                .chancedOutput(dust, Arsenic, 5000, 0)
                .chancedOutput(dust, Platinum, 5000, 0)
                .chancedOutput(dust, Aluminium, 5000, 0)
                .chancedOutput(dust, Tungsten, 5000, 0)
                .chancedOutput(dust, Neodymium, 5000, 0)
                .chancedOutput(dust, Germanium, 5000, 0)
                .duration(20 * 10 * 8 * 10).EUt(VA[GTValues.UHV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, TaraniumRichSediment, 8) // 51200*8 = 409600 stone
                .fluidInputs(FluoroantimonicAcid.getFluid(100))
                .output(dust, TaraniumContainingAlloy)
                .duration(20 * 10 * 8 * 10 * 8).EUt(VA[GTValues.UHV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(TaraniumContainingAlloy.getFluid(144))
                .fluidOutputs(SeparatedTaraniumAlloy.getFluid(144))
                .duration(20 * 10 * 8 * 5 * 8).EUt(VA[GTValues.UHV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(SeparatedTaraniumAlloy.getFluid(144 * 8)) // 409600*8=3276800 stone OR 25600*8=204800 stone
                .fluidOutputs(Naquadah.getFluid(144 * 5),
                        Azbantium.getFluid(144),
                        Vibranium.getFluid(144),
                        Taranium.getFluid(144))
                .duration(20 * 10 * 8 * 5 * 8).EUt(VA[GTValues.UHV]).buildAndRegister();

        ELECTROMAGNETIC_SEPARATOR_RECIPES.recipeBuilder()
                .notConsumable(stickLong, TaraniumMagnetic)
                .fluidInputs(TaraniumRichSludge.getFluid(500)) // 5120*5 = 25600 stone
                .output(dust, TaraniumContainingAlloy)
                .duration(20 * 10 * 8 * 5).EUt(VA[GTValues.UHV]).buildAndRegister();
    }
}
