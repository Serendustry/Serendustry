package serendustry.recipe;

import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.EXTRUDER_RECIPES;
import static gregtech.api.unification.material.Materials.Americium;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.Copper;
import static gregtech.api.unification.material.Materials.Darmstadtium;
import static gregtech.api.unification.material.Materials.Europium;
import static gregtech.api.unification.material.Materials.Flerovium;
import static gregtech.api.unification.material.Materials.HSSS;
import static gregtech.api.unification.material.Materials.Helium;
import static gregtech.api.unification.material.Materials.Lava;
import static gregtech.api.unification.material.Materials.NaquadahAlloy;
import static gregtech.api.unification.material.Materials.Naquadria;
import static gregtech.api.unification.material.Materials.Neptunium;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Polybenzimidazole;
import static gregtech.api.unification.material.Materials.RutheniumTriniumAmericiumNeutronate;
import static gregtech.api.unification.material.Materials.Tritanium;
import static gregtech.api.unification.material.Materials.YttriumBariumCuprate;
import static gregtech.api.unification.ore.OrePrefix.block;
import static gregtech.api.unification.ore.OrePrefix.cableGtDouble;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.pipeSmallFluid;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.api.unification.ore.OrePrefix.rotor;
import static gregtech.api.unification.ore.OrePrefix.screw;
import static gregtech.api.unification.ore.OrePrefix.stick;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.api.unification.ore.OrePrefix.wireGtDouble;
import static gregtech.api.unification.ore.OrePrefix.wireGtQuadruple;
import static gregtech.api.unification.ore.OrePrefix.wireGtSingle;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_LUV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_UEV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_UHV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_UIV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_ZPM;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_LuV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UHV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_ZPM;
import static gregtech.common.items.MetaItems.EMITTER_UEV;
import static gregtech.common.items.MetaItems.EMITTER_UHV;
import static gregtech.common.items.MetaItems.EMITTER_UIV;
import static gregtech.common.items.MetaItems.EMITTER_UV;
import static gregtech.common.items.MetaItems.EMITTER_UXV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UEV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UHV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UV;
import static gregtech.common.items.MetaItems.NEUTRON_REFLECTOR;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UEV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UHV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UIV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UXV;
import static gregtech.common.items.MetaItems.SENSOR_UEV;
import static gregtech.common.items.MetaItems.SENSOR_UHV;
import static gregtech.common.items.MetaItems.SENSOR_UIV;
import static gregtech.common.items.MetaItems.SENSOR_UV;
import static gregtech.common.items.MetaItems.SENSOR_UXV;
import static gregtech.common.items.MetaItems.SHAPE_EXTRUDER_ROD;
import static gregtech.common.metatileentities.MetaTileEntities.ADVANCED_LARGE_MINER;
import static serendustry.item.SerendustryMetaItems.COIL_UEV;
import static serendustry.item.material.SerendustryMaterials.AbyssalAlloy;
import static serendustry.item.material.SerendustryMaterials.Adamantium;
import static serendustry.item.material.SerendustryMaterials.AwakenedDraconium;
import static serendustry.item.material.SerendustryMaterials.CondensedStarMatter;
import static serendustry.item.material.SerendustryMaterials.DeepDarkSteel;
import static serendustry.item.material.SerendustryMaterials.Draconium;
import static serendustry.item.material.SerendustryMaterials.Dragonblood;
import static serendustry.item.material.SerendustryMaterials.Envoite;
import static serendustry.item.material.SerendustryMaterials.ExoHalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.Ferrofluid;
import static serendustry.item.material.SerendustryMaterials.FullerenePolymerMatrix;
import static serendustry.item.material.SerendustryMaterials.HalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.HighGradeSolderingAlloy;
import static serendustry.item.material.SerendustryMaterials.Hihiirokane;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;
import static serendustry.item.material.SerendustryMaterials.ReissnerNordstromium;
import static serendustry.item.material.SerendustryMaterials.ScUevSane;
import static serendustry.item.material.SerendustryMaterials.ScUxvSane;
import static serendustry.item.material.SerendustryMaterials.SelfRepairingNanobots;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import gregtech.api.GTValues;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.common.ConfigHolder;
import gregtech.common.blocks.BlockFusionCasing;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.BlockMultiblockCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.blocks.BlockAALCoreCasing;
import serendustry.blocks.BlockACRComponent;
import serendustry.blocks.BlockEICHammerCasing;
import serendustry.blocks.BlockPCCoilCooling;
import serendustry.blocks.BlockPCCoilHeating;
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
                .duration(20 * 32).EUt(VA[GTValues.ZPM]).buildAndRegister();

        EXTRUDER_RECIPES.recipeBuilder()
                .input(dust, Carbon)
                .notConsumable(SHAPE_EXTRUDER_ROD)
                .output(stick, Carbon, 2)
                .duration(20 + 12).EUt(42).buildAndRegister();

        /*
         * todo ceu update + change time and eu
         * FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
         * .fluidInputs(Carbon.getFluid(72))
         * .notConsumable(SHAPE_MOLD_ROD)
         * .output(stick, Carbon)
         * .duration(20 + 12).EUt(42).buildAndRegister();
         */

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plateDense, Carbon, 6)
                .input(frameGt, Carbon)
                .circuitMeta(6)
                .outputs(SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING.getItemVariant(
                        BlockSerendustryMetalCasing.SerendustryMetalCasingType.CARBON,
                        ConfigHolder.recipes.casingsPerCraft))
                .duration(20 * 32).EUt(VA[GTValues.ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Adamantium, 6)
                .input(frameGt, Adamantium, 1)
                .circuitMeta(6)
                .outputs(SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING.getItemVariant(
                        BlockSerendustryMetalCasing.SerendustryMetalCasingType.ADAMANTIUM,
                        ConfigHolder.recipes.casingsPerCraft))
                .duration(20 * 32).EUt(VA[GTValues.UV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Neutronium, 6)
                .input(frameGt, Neutronium, 1)
                .circuitMeta(6)
                .outputs(SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING.getItemVariant(
                        BlockSerendustryMetalCasing.SerendustryMetalCasingType.NEUTRONIUM,
                        ConfigHolder.recipes.casingsPerCraft))
                .duration(20 * 32).EUt(VA[GTValues.UHV]).buildAndRegister();

        // Space Elevator casing
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UV)
                .input(frameGt, Adamantium, 4)
                .input(plate, HSSS, 64)
                .input(plate, Carbon, 64)
                .input(screw, Adamantium, 32)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 16))
                .fluidInputs(Europium.getFluid(144 * 16))
                .outputs(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING.getItemVariant(
                        BlockSerendustryMultiCasing.SerendustryMultiCasingType.SPACE_ELEVATOR,
                        ConfigHolder.recipes.casingsPerCraft * 16))
                .stationResearch(b -> b
                        .researchStack(ADVANCED_LARGE_MINER.getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(20 * 32 * 12).EUt(VA[GTValues.UV]).buildAndRegister();

        // ACR casing
        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium, 1)
                .input(plateDense, NaquadahAlloy)
                .input(plate, Polybenzimidazole, 16)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 4))
                .outputs(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING.getItemVariant(
                        BlockSerendustryMultiCasing.SerendustryMultiCasingType.ACR,
                        ConfigHolder.recipes.casingsPerCraft))
                .duration(20 * 32).EUt(VA[GTValues.UV]).buildAndRegister();

        // EIC hammer casings
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium)
                .input(ELECTRIC_PISTON_UHV)
                .input(plate, Neutronium, 16)
                .input(plate, NaquadahAlloy, 8)
                .input(plateDense, Darmstadtium)
                .input(plateDense, Adamantium)
                .input(stickLong, Neutronium, 8)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 4),
                        Neutronium.getFluid(144 * 4))
                .outputs(SerendustryMetaBlocks.EIC_HAMMER_CASING.getItemVariant(
                        BlockEICHammerCasing.EICHammerCasingType.NEUTRONIUM, ConfigHolder.recipes.casingsPerCraft * 2))
                .stationResearch(b -> b
                        .researchStack(OreDictUnifier.get(block, Neutronium))
                        .CWUt(64)
                        .EUt(VA[GTValues.UV]))
                .duration(20 * 60 * 16).EUt(VA[GTValues.UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, AbyssalAlloy)
                .input(ELECTRIC_PISTON_UEV)
                .input(plate, HalkoniteSteel, 16)
                .input(plate, Tritanium, 8)
                .input(plateDense, Neutronium)
                .input(plateDense, VibraniumAlloy)
                .input(stickLong, HalkoniteSteel, 8)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 8),
                        AbyssalAlloy.getFluid(144 * 4))
                .outputs(SerendustryMetaBlocks.EIC_HAMMER_CASING.getItemVariant(
                        BlockEICHammerCasing.EICHammerCasingType.HALKONITE, ConfigHolder.recipes.casingsPerCraft * 2))
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.EIC_HAMMER_CASING
                                .getItemVariant(BlockEICHammerCasing.EICHammerCasingType.NEUTRONIUM))
                        .CWUt(128)
                        .EUt(VA[GTValues.UHV]))
                .duration(20 * 60 * 16).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, DeepDarkSteel)
                .input(ELECTRIC_PISTON_UIV)
                .input(plate, ExoHalkoniteSteel, 16)
                .input(plate, AbyssalAlloy, 8)
                .input(plateDense, AwakenedDraconium)
                .input(plateDense, HalkoniteSteel)
                .input(stickLong, ExoHalkoniteSteel, 8)
                .fluidInputs(SentientNanobots.getFluid(144 * 8),
                        DeepDarkSteel.getFluid(144 * 4))
                .outputs(SerendustryMetaBlocks.EIC_HAMMER_CASING.getItemVariant(
                        BlockEICHammerCasing.EICHammerCasingType.EHK, ConfigHolder.recipes.casingsPerCraft * 2))
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.EIC_HAMMER_CASING
                                .getItemVariant(BlockEICHammerCasing.EICHammerCasingType.HALKONITE))
                        .CWUt(144)
                        .EUt(VA[GTValues.UEV]))
                .duration(20 * 60 * 16).EUt(VA[GTValues.UEV]).buildAndRegister();

        // Adv fusion casings + coils
        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UV))
                .inputs(MetaBlocks.FUSION_CASING.getItemVariant(BlockFusionCasing.CasingType.FUSION_COIL, 4))
                .inputs(COIL_UEV.getStackForm(2))
                .inputs(FIELD_GENERATOR_UHV.getStackForm())
                .input(plate, HalkoniteSteel, 8)
                .input(plate, AbyssalAlloy, 8)
                .fluidInputs(RadoxPolymer.getFluid(144 * 8))
                .outputs(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING.getItemVariant(
                        BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION,
                        ConfigHolder.recipes.casingsPerCraft))
                .duration(20 * 10).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(MetaBlocks.FUSION_CASING.getItemVariant(BlockFusionCasing.CasingType.FUSION_COIL))
                .input(FIELD_GENERATOR_UV, 2)
                .input(ELECTRIC_PUMP_UV)
                .input(NEUTRON_REFLECTOR, 8)
                .input(circuit, MarkerMaterials.Tier.UHV, 4)
                .input(pipeSmallFluid, VibraniumAlloy, 4)
                .input(plate, Neutronium, 4)
                .input(plateDense, RadoxPolymer)
                .input(cableGtDouble, Hihiirokane, 2)
                .input(wireGtSingle, RutheniumTriniumAmericiumNeutronate, 2)
                .fluidInputs(Quantium40.getFluid(144 * 4),
                        Hihiirokane.getFluid(144 * 4),
                        Copper.getPlasma(144 * 8))
                .outputs(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                        .getItemVariant(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION_COIL))
                .stationResearch(b -> b
                        .researchStack(
                                MetaBlocks.FUSION_CASING.getItemVariant(BlockFusionCasing.CasingType.FUSION_COIL))
                        .CWUt(144)
                        .EUt(VA[GTValues.UHV]))
                .duration(20 * 60 * 6).EUt(VA[GTValues.UHV]).buildAndRegister();

        // Plasma Condenser coils
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                        .getItemVariant(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION_COIL, 2))
                .input(FIELD_GENERATOR_UHV)
                .input(ELECTRIC_PUMP_UV)
                .input(circuit, MarkerMaterials.Tier.UEV, 2)
                .input(pipeSmallFluid, AbyssalAlloy, 4)
                .input(plate, HalkoniteSteel, 4)
                .input(plateDense, RadoxPolymer)
                .input(cableGtDouble, Quantium40, 2)
                .input(wireGtSingle, ScUevSane, 2)
                .fluidInputs(Lava.getFluid(1000),
                        Dragonblood.getFluid(144 * 4),
                        Draconium.getFluid(144 * 4),
                        Flerovium.getPlasma(144))
                .outputs(SerendustryMetaBlocks.PC_COIL_HEATING
                        .getItemVariant(BlockPCCoilHeating.PCCoilHeatingType.INFERNAL, 2))
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                                .getItemVariant(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION_COIL))
                        .CWUt(144)
                        .EUt(VA[GTValues.UEV]))
                .duration(20 * 60 * 4).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                        .getItemVariant(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION_COIL, 2))
                .input(FIELD_GENERATOR_UHV)
                .input(ELECTRIC_PUMP_UV)
                .input(circuit, MarkerMaterials.Tier.UEV, 2)
                .input(pipeSmallFluid, AbyssalAlloy, 4)
                .input(plate, HalkoniteSteel, 4)
                .input(plateDense, RadoxPolymer)
                .input(cableGtDouble, Quantium40, 2)
                .input(wireGtSingle, ScUevSane, 2)
                .fluidInputs(Helium.getFluid(FluidStorageKeys.LIQUID, 1000),
                        Dragonblood.getFluid(144 * 4),
                        Draconium.getFluid(144 * 4),
                        Neptunium.getPlasma(144))
                .outputs(SerendustryMetaBlocks.PC_COIL_COOLING
                        .getItemVariant(BlockPCCoilCooling.PCCoilCoolingType.GLACIAL, 2))
                .stationResearch(b -> b
                        .researchStack(new ItemStack(Blocks.PACKED_ICE))
                        .CWUt(144)
                        .EUt(VA[GTValues.UEV]))
                .duration(20 * 60 * 4).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.PC_COIL_HEATING
                        .getItemVariant(BlockPCCoilHeating.PCCoilHeatingType.INFERNAL, 2))
                .input(FIELD_GENERATOR_UEV)
                .input(ELECTRIC_PUMP_UHV)
                .input(circuit, MarkerMaterials.Tier.UIV, 2)
                .input(pipeSmallFluid, DeepDarkSteel, 4)
                .input(plate, Infinity, 4)
                .input(plateDense, Neutronium, 2)
                .input(plateDense, RadoxPolymer, 2)
                .input(wireGtSingle, Hypogen, 4)
                .fluidInputs(Lava.getFluid(1000),
                        Dragonblood.getFluid(144 * 4),
                        Draconium.getFluid(144 * 4),
                        Flerovium.getPlasma(144 * 2))
                .outputs(SerendustryMetaBlocks.PC_COIL_HEATING
                        .getItemVariant(BlockPCCoilHeating.PCCoilHeatingType.SUPERNOVA, 2))
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.PC_COIL_HEATING
                                .getItemVariant(BlockPCCoilHeating.PCCoilHeatingType.INFERNAL))
                        .CWUt(144)
                        .EUt(VA[GTValues.UEV]))
                .duration(20 * 60 * 4).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.PC_COIL_COOLING
                        .getItemVariant(BlockPCCoilCooling.PCCoilCoolingType.GLACIAL, 2))
                .input(FIELD_GENERATOR_UEV)
                .input(ELECTRIC_PUMP_UHV)
                .input(circuit, MarkerMaterials.Tier.UIV, 2)
                .input(pipeSmallFluid, DeepDarkSteel, 4)
                .input(plate, Infinity, 4)
                .input(plateDense, Neutronium, 2)
                .input(plateDense, RadoxPolymer, 2)
                .input(wireGtSingle, Hypogen, 4)
                .fluidInputs(Helium.getFluid(FluidStorageKeys.LIQUID, 1000),
                        Dragonblood.getFluid(144 * 4),
                        Draconium.getFluid(144 * 4),
                        Neptunium.getPlasma(144 * 2))
                .outputs(SerendustryMetaBlocks.PC_COIL_COOLING
                        .getItemVariant(BlockPCCoilCooling.PCCoilCoolingType.BLACK_HOLE, 2))
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.PC_COIL_COOLING
                                .getItemVariant(BlockPCCoilCooling.PCCoilCoolingType.GLACIAL))
                        .CWUt(144)
                        .EUt(VA[GTValues.UEV]))
                .duration(20 * 60 * 4).EUt(VA[GTValues.UEV]).buildAndRegister();

        // AAL cores
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
                .fluidInputs(Polybenzimidazole.getFluid(144 * 16))
                .outputs(SerendustryMetaBlocks.AAL_CORE_CASING.getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UV))
                .stationResearch(b -> b
                        .researchStack(MetaBlocks.MULTIBLOCK_CASING
                                .getItemVariant(BlockMultiblockCasing.MultiblockCasingType.ASSEMBLY_CONTROL))
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
                .fluidInputs(RadoxPolymer.getFluid(144 * 8))
                .outputs(SerendustryMetaBlocks.AAL_CORE_CASING.getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UHV))
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.AAL_CORE_CASING
                                .getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UV))
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
                .fluidInputs(RadoxPolymer.getFluid(144 * 16))
                .outputs(SerendustryMetaBlocks.AAL_CORE_CASING.getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UEV))
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.AAL_CORE_CASING
                                .getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UHV))
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
                .fluidInputs(RadoxPolymer.getFluid(144 * 32))
                .outputs(SerendustryMetaBlocks.AAL_CORE_CASING.getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UIV))
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.AAL_CORE_CASING
                                .getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UEV))
                        .CWUt(144)
                        .EUt(VA[GTValues.UIV]))
                .duration(20 * 60 * 8).EUt(VA[GTValues.UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Envoite)
                .input(circuit, MarkerMaterials.Tier.OpV)
                .input(ROBOT_ARM_UXV, 4)
                .input(SENSOR_UXV)
                .input(EMITTER_UXV)
                .input(plate, ExoHalkoniteSteel, 16)
                .input(plate, ReissnerNordstromium, 16)
                .input(screw, ReissnerNordstromium, 32)
                .input(wireGtDouble, ScUxvSane, 32)
                .fluidInputs(SentientNanobots.getFluid(144 * 128))
                .fluidInputs(Ferrofluid.getFluid(1000 * 16 * 8))
                .fluidInputs(Neptunium.getFluid(144 * 32))
                .fluidInputs(FullerenePolymerMatrix.getFluid(144 * 32))
                .outputs(SerendustryMetaBlocks.AAL_CORE_CASING.getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UXV))
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.AAL_CORE_CASING
                                .getItemVariant(BlockAALCoreCasing.AALCoreCasingType.UIV))
                        .CWUt(144)
                        .EUt(VA[GTValues.UXV]))
                .duration(20 * 60 * 8).EUt(VA[GTValues.UXV]).buildAndRegister();

        // ACR Components
        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                        .getItemVariant(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ACR))
                .input(circuit, MarkerMaterials.Tier.UV)
                .input(plate, Neutronium, 6)
                .input(cableGtDouble, Hihiirokane, 4)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 4))
                .outputs(SerendustryMetaBlocks.ACR_COMPONENT.getItemVariant(BlockACRComponent.ACRComponentType.EMPTY))
                .duration(20 * 20).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.ACR_COMPONENT.getItemVariant(BlockACRComponent.ACRComponentType.EMPTY))
                .input(wireGtQuadruple, Tritanium, 8)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144))
                .outputs(SerendustryMetaBlocks.ACR_COMPONENT
                        .getItemVariant(BlockACRComponent.ACRComponentType.HEATER_RESISTIVE))
                .duration(20 * 20).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.ACR_COMPONENT.getItemVariant(BlockACRComponent.ACRComponentType.EMPTY))
                .input(plate, Adamantium, 8)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144))
                .outputs(SerendustryMetaBlocks.ACR_COMPONENT
                        .getItemVariant(BlockACRComponent.ACRComponentType.HEATER_GAS))
                .duration(20 * 20).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.ACR_COMPONENT.getItemVariant(BlockACRComponent.ACRComponentType.EMPTY))
                .input(ELECTRIC_PUMP_ZPM)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144))
                .outputs(SerendustryMetaBlocks.ACR_COMPONENT
                        .getItemVariant(BlockACRComponent.ACRComponentType.COOLER_LIQUID))
                .duration(20 * 20).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.ACR_COMPONENT.getItemVariant(BlockACRComponent.ACRComponentType.EMPTY))
                .input(plate, VibraniumAlloy, 8)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144))
                .outputs(SerendustryMetaBlocks.ACR_COMPONENT
                        .getItemVariant(BlockACRComponent.ACRComponentType.COOLER_THERMOELECTRIC))
                .duration(20 * 20).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.ACR_COMPONENT.getItemVariant(BlockACRComponent.ACRComponentType.EMPTY))
                .input(ELECTRIC_PUMP_LuV)
                .input(wireGtQuadruple, Tritanium, 4)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144))
                .outputs(SerendustryMetaBlocks.ACR_COMPONENT
                        .getItemVariant(BlockACRComponent.ACRComponentType.PUMP_DIFFUSION))
                .duration(20 * 20).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.ACR_COMPONENT.getItemVariant(BlockACRComponent.ACRComponentType.EMPTY))
                .input(ELECTRIC_PUMP_LuV)
                .input(ELECTRIC_PISTON_LUV)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144))
                .outputs(SerendustryMetaBlocks.ACR_COMPONENT
                        .getItemVariant(BlockACRComponent.ACRComponentType.PUMP_PISTON))
                .duration(20 * 20).EUt(VA[GTValues.ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.ACR_COMPONENT.getItemVariant(BlockACRComponent.ACRComponentType.EMPTY))
                .input(ELECTRIC_PISTON_ZPM)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144))
                .outputs(SerendustryMetaBlocks.ACR_COMPONENT
                        .getItemVariant(BlockACRComponent.ACRComponentType.COMPRESSOR_RECIPROCATING))
                .duration(20 * 20).EUt(VA[GTValues.ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.ACR_COMPONENT.getItemVariant(BlockACRComponent.ACRComponentType.EMPTY))
                .input(rotor, Neutronium)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144))
                .outputs(SerendustryMetaBlocks.ACR_COMPONENT
                        .getItemVariant(BlockACRComponent.ACRComponentType.COMPRESSOR_CENTRIFUGAL))
                .duration(20 * 20).EUt(VA[GTValues.UHV]).buildAndRegister();
    }
}
