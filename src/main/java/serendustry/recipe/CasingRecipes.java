package serendustry.recipe;

import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.EXTRUDER_RECIPES;
import static gregtech.api.unification.material.Materials.Americium;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.Darmstadtium;
import static gregtech.api.unification.material.Materials.Europium;
import static gregtech.api.unification.material.Materials.HSSS;
import static gregtech.api.unification.material.Materials.NaquadahAlloy;
import static gregtech.api.unification.material.Materials.Naquadria;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Tritanium;
import static gregtech.api.unification.material.Materials.YttriumBariumCuprate;
import static gregtech.api.unification.ore.OrePrefix.cableGtDouble;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.api.unification.ore.OrePrefix.screw;
import static gregtech.api.unification.ore.OrePrefix.stick;
import static gregtech.api.unification.ore.OrePrefix.wireGtDouble;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UV;
import static gregtech.common.items.MetaItems.EMITTER_UEV;
import static gregtech.common.items.MetaItems.EMITTER_UHV;
import static gregtech.common.items.MetaItems.EMITTER_UIV;
import static gregtech.common.items.MetaItems.EMITTER_UV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UEV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UHV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UIV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UV;
import static gregtech.common.items.MetaItems.SENSOR_UEV;
import static gregtech.common.items.MetaItems.SENSOR_UHV;
import static gregtech.common.items.MetaItems.SENSOR_UIV;
import static gregtech.common.items.MetaItems.SENSOR_UV;
import static gregtech.common.items.MetaItems.SHAPE_EXTRUDER_ROD;
import static gregtech.common.metatileentities.MetaTileEntities.ADVANCED_LARGE_MINER;
import static serendustry.item.material.SerendustryMaterials.AbyssalAlloy;
import static serendustry.item.material.SerendustryMaterials.Adamantium;
import static serendustry.item.material.SerendustryMaterials.AwakenedDraconium;
import static serendustry.item.material.SerendustryMaterials.CondensedStarMatter;
import static serendustry.item.material.SerendustryMaterials.DeepDarkSteel;
import static serendustry.item.material.SerendustryMaterials.Ferrofluid;
import static serendustry.item.material.SerendustryMaterials.HalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.HighGradeSolderingAlloy;
import static serendustry.item.material.SerendustryMaterials.Hihiirokane;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.SelfRepairingNanobots;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;

import gregtech.api.GTValues;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.common.ConfigHolder;
import gregtech.common.blocks.BlockMultiblockCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.blocks.BlockAALCoreCasing;
import serendustry.blocks.BlockSerendustryMetalCasing;
import serendustry.blocks.BlockSerendustryMultiCasing;
import serendustry.blocks.SerendustryMetaBlocks;

public class CasingRecipes {

    public static void init() {
        // Metal casings
        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Americium, 6)
                .input(frameGt, NaquadahAlloy, 1)
                .circuitMeta(6)
                .outputs(SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING.getItemVariant(
                        BlockSerendustryMetalCasing.SerendustryMetalCasingType.AMERICIUM,
                        ConfigHolder.recipes.casingsPerCraft))
                .duration(20).EUt(VA[GTValues.ZPM]).buildAndRegister();

        EXTRUDER_RECIPES.recipeBuilder()
                .input(dust, Carbon)
                .notConsumable(SHAPE_EXTRUDER_ROD)
                .output(stick, Carbon, 2)
                .duration(20 + 12).EUt(42).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plateDense, Carbon, 6)
                .input(frameGt, Carbon)
                .circuitMeta(6)
                .outputs(SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING.getItemVariant(
                        BlockSerendustryMetalCasing.SerendustryMetalCasingType.CARBON,
                        ConfigHolder.recipes.casingsPerCraft))
                .duration(20).EUt(VA[GTValues.UV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Adamantium, 6)
                .input(frameGt, Adamantium, 1)
                .circuitMeta(6)
                .outputs(SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING.getItemVariant(
                        BlockSerendustryMetalCasing.SerendustryMetalCasingType.ADAMANTIUM,
                        ConfigHolder.recipes.casingsPerCraft))
                .duration(20).EUt(VA[GTValues.UV]).buildAndRegister();

        // Multi casings
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UV)
                .input(frameGt, Adamantium, 4)
                .input(plate, HSSS, 64)
                .input(plate, Carbon, 64)
                .input(screw, Adamantium, 32)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 16))
                .fluidInputs(Europium.getFluid(144 * 16))
                .outputs(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING.getItemVariant(BlockSerendustryMultiCasing.SerendustryMultiCasingType.SPACE_ELEVATOR,
                        ConfigHolder.recipes.casingsPerCraft * 16))
                .stationResearch(b -> b
                        .researchStack(ADVANCED_LARGE_MINER.getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(20 * 32).EUt(VA[GTValues.UV]).buildAndRegister();

        // AAL core casings
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Adamantium)
                .input(circuit, MarkerMaterials.Tier.UHV)
                .input(ROBOT_ARM_UV, 4)
                .input(SENSOR_UV)
                .input(EMITTER_UV)
                .input(plate, Tritanium, 16)
                .input(screw, Adamantium, 32)
                .input(cableGtDouble, YttriumBariumCuprate, 32)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 64))
                .fluidInputs(Ferrofluid.getFluid(1000 * 8))
                .fluidInputs(Naquadria.getFluid(144 * 32))
                .outputs(SerendustryMetaBlocks.AAL_CORE_CASING.getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UV))
                .stationResearch(b -> b
                        .researchStack(MetaBlocks.MULTIBLOCK_CASING.getItemVariant(BlockMultiblockCasing.MultiblockCasingType.ASSEMBLY_CONTROL))
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(20 * 60 * 8).EUt(VA[GTValues.UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium)
                .input(circuit, MarkerMaterials.Tier.UEV)
                .input(ROBOT_ARM_UHV, 4)
                .input(SENSOR_UHV)
                .input(EMITTER_UHV)
                .input(plate, Neutronium, 16)
                .input(plate, VibraniumAlloy, 16)
                .input(screw, VibraniumAlloy, 32)
                .input(cableGtDouble, Hihiirokane, 32)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 32))
                .fluidInputs(Ferrofluid.getFluid(1000 * 16))
                .fluidInputs(CondensedStarMatter.getFluid(1000 * 16))
                .outputs(SerendustryMetaBlocks.AAL_CORE_CASING.getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UHV))
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.AAL_CORE_CASING.getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UV))
                        .CWUt(128)
                        .EUt(VA[GTValues.UHV]))
                .duration(20 * 60 * 8).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, AbyssalAlloy)
                .input(circuit, MarkerMaterials.Tier.UIV)
                .input(ROBOT_ARM_UEV, 4)
                .input(SENSOR_UEV)
                .input(EMITTER_UEV)
                .input(plate, HalkoniteSteel, 16)
                .input(plate, AbyssalAlloy, 16)
                .input(screw, AbyssalAlloy, 32)
                .input(cableGtDouble, Quantium40, 32)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 64))
                .fluidInputs(Ferrofluid.getFluid(1000 * 16 * 2))
                .fluidInputs(AbyssalAlloy.getFluid(144 * 32))
                .outputs(SerendustryMetaBlocks.AAL_CORE_CASING.getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UEV))
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.AAL_CORE_CASING.getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UHV))
                        .CWUt(144)
                        .EUt(VA[GTValues.UEV]))
                .duration(20 * 60 * 8).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, DeepDarkSteel)
                .input(circuit, MarkerMaterials.Tier.UXV)
                .input(ROBOT_ARM_UIV, 4)
                .input(SENSOR_UIV)
                .input(EMITTER_UIV)
                .input(plate, DeepDarkSteel, 16)
                .input(plate, AwakenedDraconium, 16)
                .input(screw, AwakenedDraconium, 32)
                .input(wireGtDouble, Hypogen, 32)
                .fluidInputs(SentientNanobots.getFluid(144 * 64))
                .fluidInputs(Ferrofluid.getFluid(1000 * 16 * 4))
                .fluidInputs(Infinity.getFluid(144 * 32))
                .outputs(SerendustryMetaBlocks.AAL_CORE_CASING.getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UIV))
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.AAL_CORE_CASING.getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UEV))
                        .CWUt(144)
                        .EUt(VA[GTValues.UIV]))
                .duration(20 * 60 * 8).EUt(VA[GTValues.UIV]).buildAndRegister();

        // todo: UXV, OpV, MAX AAL Core recipes
    }
}
