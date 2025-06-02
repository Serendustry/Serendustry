package serendustry.recipe;

import gregicality.multiblocks.common.metatileentities.GCYMMetaTileEntities;
import gregtech.api.GTValues;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.blocks.BlockMachineCasing;
import serendustry.SValues;
import serendustry.blocks.BlockSerendustryMultiCasing;
import serendustry.blocks.SerendustryMetaBlocks;

import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.Diamond;
import static gregtech.api.unification.material.Materials.EnrichedNaquadahTriniumEuropiumDuranide;
import static gregtech.api.unification.material.Materials.Flerovium;
import static gregtech.api.unification.material.Materials.Moscovium;
import static gregtech.api.unification.material.Materials.Naquadah;
import static gregtech.api.unification.material.Materials.NaquadahAlloy;
import static gregtech.api.unification.material.Materials.Naquadria;
import static gregtech.api.unification.material.Materials.Neptunium;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Osmiridium;
import static gregtech.api.unification.material.Materials.Osmium;
import static gregtech.api.unification.material.Materials.Polybenzimidazole;
import static gregtech.api.unification.material.Materials.SodiumPotassium;
import static gregtech.api.unification.material.Materials.Tritanium;
import static gregtech.api.unification.material.Materials.VanadiumGallium;
import static gregtech.api.unification.material.Materials.YttriumBariumCuprate;
import static gregtech.api.unification.ore.OrePrefix.cableGtDouble;
import static gregtech.api.unification.ore.OrePrefix.cableGtHex;
import static gregtech.api.unification.ore.OrePrefix.cableGtOctal;
import static gregtech.api.unification.ore.OrePrefix.cableGtQuadruple;
import static gregtech.api.unification.ore.OrePrefix.cableGtSingle;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.gear;
import static gregtech.api.unification.ore.OrePrefix.gemExquisite;
import static gregtech.api.unification.ore.OrePrefix.lens;
import static gregtech.api.unification.ore.OrePrefix.pipeNormalFluid;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.api.unification.ore.OrePrefix.spring;
import static gregtech.api.unification.ore.OrePrefix.springSmall;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.api.unification.ore.OrePrefix.wireFine;
import static gregtech.api.unification.ore.OrePrefix.wireGtDouble;
import static gregtech.api.unification.ore.OrePrefix.wireGtHex;
import static gregtech.api.unification.ore.OrePrefix.wireGtOctal;
import static gregtech.api.unification.ore.OrePrefix.wireGtQuadruple;
import static gregtech.api.unification.ore.OrePrefix.wireGtSingle;
import static gregtech.common.blocks.MetaBlocks.MACHINE_CASING;
import static gregtech.common.items.MetaItems.CONVEYOR_MODULE_UEV;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UEV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_UV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UEV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UHV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UEV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UHV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_ZPM;
import static gregtech.common.items.MetaItems.SENSOR_UV;
import static gregtech.common.items.MetaItems.ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT;
import static gregtech.common.metatileentities.MetaTileEntities.ASSEMBLY_LINE;
import static gregtech.common.metatileentities.MetaTileEntities.ELECTRIC_BLAST_FURNACE;
import static gregtech.common.metatileentities.MetaTileEntities.ENERGY_INPUT_HATCH;
import static gregtech.common.metatileentities.MetaTileEntities.ENERGY_OUTPUT_HATCH;
import static gregtech.common.metatileentities.MetaTileEntities.FLUID_HEATER;
import static gregtech.common.metatileentities.MetaTileEntities.HI_AMP_TRANSFORMER;
import static gregtech.common.metatileentities.MetaTileEntities.HULL;
import static gregtech.common.metatileentities.MetaTileEntities.IMPLOSION_COMPRESSOR;
import static gregtech.common.metatileentities.MetaTileEntities.LARGE_CHEMICAL_REACTOR;
import static gregtech.common.metatileentities.MetaTileEntities.LASER_INPUT_HATCH_1024;
import static gregtech.common.metatileentities.MetaTileEntities.LASER_INPUT_HATCH_256;
import static gregtech.common.metatileentities.MetaTileEntities.LASER_INPUT_HATCH_4096;
import static gregtech.common.metatileentities.MetaTileEntities.LASER_OUTPUT_HATCH_1024;
import static gregtech.common.metatileentities.MetaTileEntities.LASER_OUTPUT_HATCH_256;
import static gregtech.common.metatileentities.MetaTileEntities.LASER_OUTPUT_HATCH_4096;
import static gregtech.common.metatileentities.MetaTileEntities.POWER_TRANSFORMER;
import static gregtech.common.metatileentities.MetaTileEntities.TRANSFORMER;
import static gregtech.common.metatileentities.MetaTileEntities.VACUUM_FREEZER;
import static serendustry.item.SerendustryMetaItems.CHIP_OPIC;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_OVERWORLD;
import static serendustry.item.material.SerendustryMaterials.AbyssalAlloy;
import static serendustry.item.material.SerendustryMaterials.Adamantium;
import static serendustry.item.material.SerendustryMaterials.AwakenedDraconium;
import static serendustry.item.material.SerendustryMaterials.Azbantium;
import static serendustry.item.material.SerendustryMaterials.Floppa;
import static serendustry.item.material.SerendustryMaterials.FullerenePolymerMatrix;
import static serendustry.item.material.SerendustryMaterials.HalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.HighGradeSolderingAlloy;
import static serendustry.item.material.SerendustryMaterials.Hihiirokane;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Originium;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;
import static serendustry.item.material.SerendustryMaterials.SelfRepairingNanobots;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.item.material.SerendustryMaterials.TiberiumAboreus;
import static serendustry.item.material.SerendustryMaterials.TiberiumCruentus;
import static serendustry.item.material.SerendustryMaterials.TiberiumRiparius;
import static serendustry.item.material.SerendustryMaterials.TiberiumVinifera;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;
import static serendustry.machine.SerendustryMetaTileEntities.ADVANCED_ASSEMBLY_LINE;
import static serendustry.machine.SerendustryMetaTileEntities.ADVANCED_CHEMICAL_REACTOR;
import static serendustry.machine.SerendustryMetaTileEntities.CRYSTALLIZER;
import static serendustry.machine.SerendustryMetaTileEntities.ELECTRIC_IMPLOSION_COMPRESSOR;
import static serendustry.machine.SerendustryMetaTileEntities.MEGA_CHEMICAL_REACTOR;
import static serendustry.machine.SerendustryMetaTileEntities.PLASMA_CONDENSER;

public class HTMachineRecipes {

    public static void init() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy, 4)
                .input(ROBOT_ARM_ZPM, 8)
                .input(circuit, MarkerMaterials.Tier.UV, 4)
                .input(circuit, MarkerMaterials.Tier.ZPM, 8)
                .input(plate, Osmiridium, 16)
                .input(plate, Polybenzimidazole, 64)
                .input(gear, NaquadahAlloy, 8)
                .input(gear, Osmiridium, 16)
                .input(plateDense, NaquadahAlloy, 4)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 16)
                .input(cableGtDouble, VanadiumGallium, 16)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 16),
                        Osmium.getFluid(144 * 8),
                        Diamond.getFluid(144 * 128))
                .output(CRYSTALLIZER)
                .stationResearch(b -> b
                        .researchStack(OreDictUnifier.get(gemExquisite, Diamond))
                        .CWUt(64)
                        .EUt(VA[GTValues.ZPM]))
                .duration(4000).EUt(VA[GTValues.UV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ELECTRIC_BLAST_FURNACE, 64)
                .input(FIELD_GENERATOR_UV, 2)
                .input(circuit, MarkerMaterials.Tier.UHV, 1)
                .input(spring, NaquadahAlloy, 16)
                .input(plateDense, Adamantium, 4)
                .input(plateDense, Moscovium, 4)
                .input(wireGtDouble, EnrichedNaquadahTriniumEuropiumDuranide, 8)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 16))
                .output(GCYMMetaTileEntities.MEGA_BLAST_FURNACE)
                .duration(20 * 60 * 4).EUt(VA[GTValues.UV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(VACUUM_FREEZER, 64)
                .input(FIELD_GENERATOR_UV, 2)
                .input(circuit, MarkerMaterials.Tier.UHV, 1)
                .input(pipeNormalFluid, Naquadah, 16)
                .input(plateDense, Adamantium, 4)
                .input(plateDense, Moscovium, 4)
                .input(wireGtDouble, EnrichedNaquadahTriniumEuropiumDuranide, 8)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 16))
                .output(GCYMMetaTileEntities.MEGA_VACUUM_FREEZER)
                .duration(20 * 60 * 4).EUt(VA[GTValues.UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Adamantium, 4)
                .input(ROBOT_ARM_UV, 8)
                .input(circuit, MarkerMaterials.Tier.UHV, 4)
                .input(circuit, MarkerMaterials.Tier.UV, 8)
                .input(plateDense, Adamantium, 4)
                .input(plate, Tritanium, 16)
                .input(plate, Polybenzimidazole, 64)
                .input(gear, Neutronium, 8)
                .input(gear, Naquadria, 16)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 16)
                .input(cableGtDouble, YttriumBariumCuprate, 16)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 16),
                        Naquadria.getFluid(144 * 8))
                .output(ADVANCED_ASSEMBLY_LINE)
                .stationResearch(b -> b
                        .researchStack(ASSEMBLY_LINE.getStackForm())
                        .CWUt(64)
                        .EUt(VA[GTValues.UV]))
                .duration(8000).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                        .getItemVariant(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ACR, 4))
                .input(circuit, MarkerMaterials.Tier.UHV, 8)
                .input(FIELD_GENERATOR_UV, 4)
                .input(SENSOR_UV, 8)
                .input(plate, Tritanium, 32)
                .input(plate, Adamantium, 32)
                .input(cableGtDouble, Hihiirokane, 16)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 16),
                        VibraniumAlloy.getFluid(144 * 16))
                .output(ADVANCED_CHEMICAL_REACTOR)
                .stationResearch(b -> b
                        .researchStack(LARGE_CHEMICAL_REACTOR.getStackForm())
                        .CWUt(32)
                        .EUt(VA[GTValues.UV]))
                .duration(20 * 60).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium, 4)
                .input(ELECTRIC_PISTON_UV, 32)
                .input(circuit, MarkerMaterials.Tier.UHV, 8)
                .input(circuit, MarkerMaterials.Tier.UV, 16)
                .input(plateDense, NaquadahAlloy, 16)
                .input(gear, Neutronium, 8)
                .input(gear, Naquadria, 16)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 32)
                .input(cableGtDouble, Hihiirokane, 16)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 32),
                        Neutronium.getFluid(144 * 8))
                .output(ELECTRIC_IMPLOSION_COMPRESSOR)
                .stationResearch(b -> b
                        .researchStack(IMPLOSION_COMPRESSOR.getStackForm())
                        .CWUt(64)
                        .EUt(VA[GTValues.UV]))
                .duration(8000).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(STELLAR_ESSENCE_OVERWORLD)
                .input(frameGt, Neutronium, 8)
                .input(FIELD_GENERATOR_UHV, 8)
                .input(ELECTRIC_PUMP_UHV, 16)
                .input(circuit, MarkerMaterials.Tier.UHV, 32)
                .input(plateDense, Neutronium, 16)
                .input(gear, Adamantium, 32)
                .input(gear, Naquadria, 32)
                .input(plate, Azbantium, 32)
                .input(stickLong, Neutronium, 32)
                .input(stickLong, Naquadria, 64)
                .input(CHIP_OPIC, 16)
                .input(gemExquisite, TiberiumAboreus, 64)
                .input(gemExquisite, TiberiumCruentus, 64)
                .input(gemExquisite, TiberiumRiparius, 64)
                .input(gemExquisite, TiberiumVinifera, 64)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 16),
                        Neutronium.getFluid(144 * 16),
                        VibraniumAlloy.getFluid(144 * 32),
                        Originium.getFluid(144 * 4))
                .output(MEGA_CHEMICAL_REACTOR)
                .stationResearch(b -> b
                        .researchStack(LARGE_CHEMICAL_REACTOR.getStackForm())
                        .CWUt(144)
                        .EUt(VA[GTValues.UHV]))
                .duration(16000).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, AbyssalAlloy, 32)
                .input(FIELD_GENERATOR_UEV, 12)
                .input(ELECTRIC_PUMP_UEV, 16)
                .input(CONVEYOR_MODULE_UEV, 16)
                .input(ELECTRIC_MOTOR_UEV, 16)
                .input(circuit, MarkerMaterials.Tier.UIV, 16)
                .input(circuit, MarkerMaterials.Tier.UEV, 32)
                .input(circuit, MarkerMaterials.Tier.UHV, 64)
                .input(plateDense, Neutronium, 64)
                .input(plateDense, AwakenedDraconium, 32)
                .input(plateDense, HalkoniteSteel, 32)
                .input(gear, Neutronium, 64)
                .input(gear, HalkoniteSteel, 32)
                .input(gear, AbyssalAlloy, 32)
                .input(wireGtSingle, Hypogen, 64)
                .input(cableGtDouble, Quantium40, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 64),
                        Hypogen.getFluid(144 * 32),
                        Flerovium.getPlasma(144 * 64),
                        Neptunium.getPlasma(144 * 64))
                .output(PLASMA_CONDENSER)
                .stationResearch(b -> b
                        .researchStack(FLUID_HEATER[UIV].getStackForm())
                        .CWUt(144)
                        .EUt(VA[UIV]))
                .duration(25600).EUt(VA[UIV]).buildAndRegister();

        // Voltage Coils
        for (int i = GTValues.UHV; i <= GTValues.MAX; i++) {
            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(stickLong, SValues.TIER_MAGNET[i])
                    .input(wireFine, SValues.TIER_CABLE[i], 16)
                    .circuitMeta(1)
                    .output(SValues.TIER_COIL[i])
                    .duration(200).EUt(VA[i]).buildAndRegister();
        }

        // Machine Casings

        ModHandler.addShapedRecipe(true, "casing_uev",
                MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UEV), "PPP", "PwP", "PPP", 'P',
                new UnificationEntry(plate, SValues.TIER_PLATE[GTValues.UEV]));
        ModHandler.addShapedRecipe(true, "casing_uiv",
                MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UIV), "PPP", "PwP", "PPP", 'P',
                new UnificationEntry(plate, SValues.TIER_PLATE[GTValues.UIV]));
        ModHandler.addShapedRecipe(true, "casing_uxv",
                MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UXV), "PPP", "PwP", "PPP", 'P',
                new UnificationEntry(plate, SValues.TIER_PLATE[GTValues.UXV]));
        ModHandler.addShapedRecipe(true, "casing_opv",
                MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.OpV), "PPP", "PwP", "PPP", 'P',
                new UnificationEntry(plate, SValues.TIER_PLATE[GTValues.OpV]));
        ModHandler.addShapedRecipe(true, "casing_max",
                MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.MAX), "PPP", "PwP", "PPP", 'P',
                new UnificationEntry(plateDense, SValues.TIER_PLATE[GTValues.MAX]));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, SValues.TIER_PLATE[GTValues.UEV], 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UEV))
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, SValues.TIER_PLATE[GTValues.UIV], 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UIV))
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, SValues.TIER_PLATE[GTValues.UXV], 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UXV))
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, SValues.TIER_PLATE[GTValues.OpV], 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.OpV))
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plateDense, SValues.TIER_PLATE[GTValues.MAX], 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.MAX))
                .duration(50).EUt(16).buildAndRegister();

        // Machine Hull Assembler Recipes

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UHV))
                .input(cableGtSingle, SValues.TIER_CABLE[GTValues.UHV], 2)
                .fluidInputs(RadoxPolymer.getFluid(288))
                .output(HULL[GTValues.UHV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UEV))
                .input(cableGtSingle, SValues.TIER_CABLE[GTValues.UEV], 2)
                .fluidInputs(RadoxPolymer.getFluid(288))
                .output(HULL[GTValues.UEV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UIV))
                .input(wireGtSingle, SValues.TIER_CABLE[GTValues.UIV], 2)
                .fluidInputs(RadoxPolymer.getFluid(288))
                .output(HULL[GTValues.UIV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UXV))
                .input(cableGtSingle, SValues.TIER_CABLE[GTValues.UXV], 2)
                .fluidInputs(FullerenePolymerMatrix.getFluid(288))
                .output(HULL[GTValues.UXV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.OpV))
                .input(cableGtSingle, SValues.TIER_CABLE[GTValues.OpV], 2)
                .fluidInputs(FullerenePolymerMatrix.getFluid(288))
                .output(HULL[GTValues.OpV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.MAX))
                .input(wireGtHex, SValues.TIER_CABLE[GTValues.MAX], 2)
                .fluidInputs(Floppa.getFluid(2592))
                .output(HULL[GTValues.MAX])
                .duration(50).EUt(16).buildAndRegister();

        // Energy Output Hatches

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UEV])
                .input(spring, SValues.TIER_CABLE[GTValues.UEV], 4)
                .input(CHIP_OPIC, 4)
                .input(circuit, MarkerMaterials.Tier.UEV)
                .input(wireGtDouble, SValues.TIER_SUPERCONDUCTOR[GTValues.UEV], 2)
                .fluidInputs(SodiumPotassium.getFluid(18000))
                .fluidInputs(SelfRepairingNanobots.getFluid(576))
                .output(ENERGY_OUTPUT_HATCH[GTValues.UEV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_OUTPUT_HATCH[GTValues.UHV].getStackForm())
                        .CWUt(128)
                        .EUt(VA[GTValues.UEV]))
                .duration(1000).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UIV])
                .input(spring, SValues.TIER_CABLE[GTValues.UIV], 4)
                .input(CHIP_OPIC, 8)
                .input(circuit, MarkerMaterials.Tier.UIV)
                .input(wireGtDouble, SValues.TIER_SUPERCONDUCTOR[GTValues.UIV], 2)
                .fluidInputs(SodiumPotassium.getFluid(24000))
                .fluidInputs(SentientNanobots.getFluid(144 * 4))
                .output(ENERGY_OUTPUT_HATCH[GTValues.UIV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_OUTPUT_HATCH[GTValues.UEV].getStackForm())
                        .CWUt(128)
                        .EUt(VA[GTValues.UIV]))
                .duration(1000).EUt(VA[GTValues.UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UXV])
                .input(spring, SValues.TIER_CABLE[GTValues.UXV], 4)
                .input(CHIP_OPIC, 16)
                .input(circuit, MarkerMaterials.Tier.UXV)
                .input(wireGtDouble, SValues.TIER_SUPERCONDUCTOR[GTValues.UXV], 2)
                .fluidInputs(SodiumPotassium.getFluid(32000))
                .fluidInputs(SentientNanobots.getFluid(144 * 8))
                .output(ENERGY_OUTPUT_HATCH[GTValues.UXV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_OUTPUT_HATCH[GTValues.UIV].getStackForm())
                        .CWUt(128)
                        .EUt(VA[GTValues.UXV]))
                .duration(1000).EUt(VA[GTValues.UXV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.OpV])
                .input(spring, SValues.TIER_CABLE[GTValues.OpV], 4)
                .input(CHIP_OPIC, 32)
                .input(circuit, MarkerMaterials.Tier.OpV)
                .input(wireGtDouble, SValues.TIER_SUPERCONDUCTOR[GTValues.OpV], 2)
                .fluidInputs(SodiumPotassium.getFluid(64000))
                .fluidInputs(SentientNanobots.getFluid(144 * 16))
                .output(ENERGY_OUTPUT_HATCH[GTValues.OpV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_OUTPUT_HATCH[GTValues.UXV].getStackForm())
                        .CWUt(128)
                        .EUt(VA[GTValues.OpV]))
                .duration(1000).EUt(VA[GTValues.OpV]).buildAndRegister();

        // Energy Input Hatches

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UEV])
                .input(cableGtSingle, SValues.TIER_CABLE[GTValues.UEV], 4)
                .input(CHIP_OPIC, 4)
                .input(circuit, MarkerMaterials.Tier.UEV)
                .input(wireGtDouble, SValues.TIER_SUPERCONDUCTOR[GTValues.UEV], 2)
                .fluidInputs(SodiumPotassium.getFluid(18000))
                .fluidInputs(SelfRepairingNanobots.getFluid(576))
                .output(ENERGY_INPUT_HATCH[GTValues.UEV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_INPUT_HATCH[GTValues.UHV].getStackForm())
                        .CWUt(128)
                        .EUt(VA[GTValues.UEV]))
                .duration(1000).EUt(VA[GTValues.UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UIV])
                .input(CHIP_OPIC, 8)
                .input(circuit, MarkerMaterials.Tier.UIV)
                .input(wireGtDouble, SValues.TIER_SUPERCONDUCTOR[GTValues.UIV], 4)
                .fluidInputs(SodiumPotassium.getFluid(24000))
                .fluidInputs(SentientNanobots.getFluid(576))
                .output(ENERGY_INPUT_HATCH[GTValues.UIV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_INPUT_HATCH[GTValues.UEV].getStackForm())
                        .CWUt(128)
                        .EUt(VA[GTValues.UIV]))
                .duration(1000).EUt(VA[GTValues.UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UXV])
                .input(CHIP_OPIC, 16)
                .input(circuit, MarkerMaterials.Tier.UXV)
                .input(wireGtDouble, SValues.TIER_SUPERCONDUCTOR[GTValues.UXV], 4)
                .fluidInputs(SodiumPotassium.getFluid(32000))
                .fluidInputs(SentientNanobots.getFluid(576 * 2))
                .output(ENERGY_INPUT_HATCH[GTValues.UXV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_INPUT_HATCH[GTValues.UIV].getStackForm())
                        .CWUt(128)
                        .EUt(VA[GTValues.UXV]))
                .duration(1000).EUt(VA[GTValues.UXV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.OpV])
                .input(cableGtSingle, SValues.TIER_CABLE[GTValues.OpV], 4)
                .input(CHIP_OPIC, 32)
                .input(circuit, MarkerMaterials.Tier.OpV)
                .input(wireGtDouble, SValues.TIER_SUPERCONDUCTOR[GTValues.OpV], 2)
                .fluidInputs(SodiumPotassium.getFluid(64000))
                .fluidInputs(SentientNanobots.getFluid(144 * 16))
                .output(ENERGY_INPUT_HATCH[GTValues.OpV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_INPUT_HATCH[GTValues.UXV].getStackForm())
                        .CWUt(128)
                        .EUt(VA[GTValues.OpV]))
                .duration(1000).EUt(VA[GTValues.OpV]).buildAndRegister();

        for (int i = GTValues.UHV; i <= GTValues.UXV; i++) {
            OrePrefix single = (i < GTValues.UEV) ? cableGtSingle : wireGtSingle;
            OrePrefix doubl = (i < GTValues.UEV) ? cableGtDouble : wireGtDouble;
            OrePrefix quad = (i < GTValues.UEV) ? cableGtQuadruple : wireGtQuadruple;
            OrePrefix oct = (i < GTValues.UEV) ? cableGtOctal : wireGtOctal;
            OrePrefix hex = (i < GTValues.UIV) ? cableGtHex : wireGtHex;

            // Transformers
            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(SValues.TIER_POWER_IC[i], 2)
                    .input(single, SValues.TIER_CABLE[i + 1])
                    .input(single, SValues.TIER_CABLE[i], 4)
                    .output(TRANSFORMER[i])
                    .duration(100).EUt(VA[i - 1]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(TRANSFORMER[i])
                    .input(SValues.TIER_COIL[i], 2)
                    .input(quad, SValues.TIER_CABLE[i + 1])
                    .input(quad, SValues.TIER_CABLE[i], 4)
                    .output(HI_AMP_TRANSFORMER[i])
                    .duration(150).EUt(VA[i - 1]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HI_AMP_TRANSFORMER[i])
                    .input(SValues.TIER_PUMP[i - 3])
                    .input(oct, SValues.TIER_CABLE[i + 1])
                    .input(hex, SValues.TIER_CABLE[i], 2)
                    .input(springSmall, SValues.TIER_CABLE[i])
                    .input(spring, SValues.TIER_CABLE[i + 1])
                    .fluidInputs(SValues.TIER_LUBRICANT[i].getFluid(2000))
                    .output(POWER_TRANSFORMER[i])
                    .duration(200).EUt(VA[i - 1]).buildAndRegister();

            // Lasers
            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(lens, Diamond)
                    .input(SValues.TIER_SENSOR[i])
                    .input(SValues.TIER_PUMP[i])
                    .input(single, SValues.TIER_CABLE[i], 4)
                    .circuitMeta(1)
                    .output(LASER_INPUT_HATCH_256[i - 5])
                    .duration(300).EUt(VA[i]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(lens, Diamond)
                    .input(SValues.TIER_EMITTER[i])
                    .input(SValues.TIER_PUMP[i])
                    .input(single, SValues.TIER_CABLE[i], 4)
                    .circuitMeta(1)
                    .output(LASER_OUTPUT_HATCH_256[i - 5])
                    .duration(300).EUt(VA[i]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(lens, Diamond, 2)
                    .input(SValues.TIER_SENSOR[i], 2)
                    .input(SValues.TIER_PUMP[i], 2)
                    .input(doubl, SValues.TIER_CABLE[i], 4)
                    .circuitMeta(2)
                    .output(LASER_INPUT_HATCH_1024[i - 5])
                    .duration(600).EUt(VA[i]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(lens, Diamond, 2)
                    .input(SValues.TIER_EMITTER[i], 2)
                    .input(SValues.TIER_PUMP[i], 2)
                    .input(doubl, SValues.TIER_CABLE[i], 4)
                    .circuitMeta(2)
                    .output(LASER_OUTPUT_HATCH_1024[i - 5])
                    .duration(600).EUt(VA[i]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(lens, Diamond, 4)
                    .input(SValues.TIER_SENSOR[i], 4)
                    .input(SValues.TIER_PUMP[i], 4)
                    .input(quad, SValues.TIER_CABLE[i], 4)
                    .circuitMeta(3)
                    .output(LASER_INPUT_HATCH_4096[i - 5])
                    .duration(1200).EUt(VA[i]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(lens, Diamond, 4)
                    .input(SValues.TIER_EMITTER[i], 4)
                    .input(SValues.TIER_PUMP[i], 4)
                    .input(quad, SValues.TIER_CABLE[i], 4)
                    .circuitMeta(3)
                    .output(LASER_OUTPUT_HATCH_4096[i - 5])
                    .duration(1200).EUt(VA[i]).buildAndRegister();
        }

        // todo: UHV+ 4a/16a/64a hatches

        // The stuff below is commented out because none of these things actually get generated at high tiers, probably
        // by mistake. Uncomment it if that gets changed
        // 4A Energy Hatches
        /*
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_INPUT_HATCH[GTValues.UEV], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 2)
         * .input(wireGtDouble, ScUev)
         * .input(wireGtQuadruple, Lafium, 2)
         * .output(ENERGY_INPUT_HATCH_4A[6])
         * .duration(100).EUt(VA[GTValues.UHV]).buildAndRegister();
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_INPUT_HATCH[GTValues.UIV], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 4)
         * .input(wireGtDouble, ScUiv)
         * .input(wireGtQuadruple, Signalium, 2)
         * .output(ENERGY_INPUT_HATCH_4A[7])
         * .duration(100).EUt(VA[GTValues.UEV]).buildAndRegister();
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_INPUT_HATCH[GTValues.UXV], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 8)
         * .input(wireGtDouble, ScUxv)
         * .input(wireGtQuadruple, Bedrockium, 2)
         * .output(ENERGY_INPUT_HATCH_4A[8])
         * .duration(100).EUt(VA[GTValues.UIV]).buildAndRegister();
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_INPUT_HATCH[GTValues.OpV], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 16)
         * .input(wireGtDouble, ScOpv)
         * .input(wireGtQuadruple, Bedrockium, 2)
         * .output(ENERGY_INPUT_HATCH_4A[9])
         * .duration(100).EUt(VA[GTValues.UXV]).buildAndRegister();
         *
         * // 16A Energy Hatches
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_INPUT_HATCH_4A[6], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 4)
         * .input(wireGtDouble, ScUev)
         * .input(wireGtOctal, Lafium, 2)
         * .output(ENERGY_INPUT_HATCH_16A[5])
         * .duration(200).EUt(VA[GTValues.UHV]).buildAndRegister();
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_INPUT_HATCH_4A[7], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 8)
         * .input(wireGtDouble, ScUiv)
         * .input(wireGtOctal, Signalium, 2)
         * .output(ENERGY_INPUT_HATCH_16A[6])
         * .duration(200).EUt(VA[GTValues.UEV]).buildAndRegister();
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_INPUT_HATCH_4A[8], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 16)
         * .input(wireGtDouble, ScUxv)
         * .input(wireGtOctal, Bedrockium, 2)
         * .output(ENERGY_INPUT_HATCH_16A[7])
         * .duration(200).EUt(VA[GTValues.UIV]).buildAndRegister();
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_INPUT_HATCH_4A[9], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 32)
         * .input(wireGtDouble, ScOpv)
         * .input(wireGtOctal, Quantium, 2)
         * .output(ENERGY_INPUT_HATCH_16A[8])
         * .duration(200).EUt(VA[GTValues.UXV]).buildAndRegister();
         *
         * // 4A Dynamo Hatches
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_OUTPUT_HATCH[GTValues.UEV], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 2)
         * .input(wireGtDouble, ScUev)
         * .input(wireGtQuadruple, Lafium, 2)
         * .output(ENERGY_OUTPUT_HATCH_4A[6])
         * .duration(100).EUt(VA[GTValues.UHV]).buildAndRegister();
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_OUTPUT_HATCH[GTValues.UIV], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 4)
         * .input(wireGtDouble, ScUiv)
         * .input(wireGtQuadruple, Signalium, 2)
         * .output(ENERGY_OUTPUT_HATCH_4A[7])
         * .duration(100).EUt(VA[GTValues.UEV]).buildAndRegister();
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_OUTPUT_HATCH[GTValues.UXV], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 8)
         * .input(wireGtDouble, ScUxv)
         * .input(wireGtQuadruple, Bedrockium, 2)
         * .output(ENERGY_OUTPUT_HATCH_4A[8])
         * .duration(100).EUt(VA[GTValues.UIV]).buildAndRegister();
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_OUTPUT_HATCH[GTValues.OpV], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 16)
         * .input(wireGtDouble, ScOpv)
         * .input(wireGtQuadruple, Quantium, 2)
         * .output(ENERGY_OUTPUT_HATCH_4A[9])
         * .duration(100).EUt(VA[GTValues.UXV]).buildAndRegister();
         *
         * // 16A Dynamo Hatches
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_OUTPUT_HATCH_4A[6], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 4)
         * .input(wireGtDouble, ScUev)
         * .input(wireGtOctal, Lafium, 2)
         * .output(ENERGY_OUTPUT_HATCH_16A[5])
         * .duration(200).EUt(VA[GTValues.UHV]).buildAndRegister();
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_OUTPUT_HATCH_4A[7], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 8)
         * .input(wireGtDouble, ScUiv)
         * .input(wireGtOctal, Signalium, 2)
         * .output(ENERGY_OUTPUT_HATCH_16A[6])
         * .duration(200).EUt(VA[GTValues.UEV]).buildAndRegister();
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_OUTPUT_HATCH_4A[8], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 16)
         * .input(wireGtDouble, ScUxv)
         * .input(wireGtOctal, Bedrockium, 2)
         * .output(ENERGY_OUTPUT_HATCH_16A[7])
         * .duration(200).EUt(VA[GTValues.UIV]).buildAndRegister();
         *
         * ASSEMBLER_RECIPES.recipeBuilder()
         * .input(ENERGY_OUTPUT_HATCH_4A[9], 2)
         * .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 32)
         * .input(wireGtDouble, ScOpv)
         * .input(wireGtOctal, Quantium, 2)
         * .output(ENERGY_OUTPUT_HATCH_16A[8])
         * .duration(200).EUt(VA[GTValues.UXV]).buildAndRegister();
         *
         * // Rotor Holders
         *
         * ModHandler.addShapedRecipe(true, "rotor_holder_uhv", MetaTileEntities.ROTOR_HOLDER[6].getStackForm(), "SGS",
         * "GHG", "SGS",
         * 'H', MetaTileEntities.HULL[GTValues.UHV].getStackForm(),
         * 'G', UnificationEntry(gear, EnrichedNaquadahAlloy),
         * 'S', UnificationEntry(gearSmall, Pikyonium))
         *
         * ModHandler.addShapedRecipe(true, "rotor_holder_uev", MetaTileEntities.ROTOR_HOLDER[7].getStackForm(), "SGS",
         * "GHG", "SGS",
         * 'H', MetaTileEntities.HULL[GTValues.UEV].getStackForm(),
         * 'G', UnificationEntry(gear, Aluminum),
         * 'S', UnificationEntry(gearSmall, Lafium))
         *
         * ModHandler.addShapedRecipe(true, "rotor_holder_uiv", MetaTileEntities.ROTOR_HOLDER[8].getStackForm(), "SGS",
         * "GHG", "SGS",
         * 'H', MetaTileEntities.HULL[GTValues.UIV].getStackForm(),
         * 'G', UnificationEntry(gear, Lumiium),
         * 'S', UnificationEntry(gearSmall, VibrantAlloy))
         *
         * ModHandler.addShapedRecipe(true, "rotor_holder_uxv", MetaTileEntities.ROTOR_HOLDER[9].getStackForm(), "SGS",
         * "GHG", "SGS",
         * 'H', MetaTileEntities.HULL[GTValues.UXV].getStackForm(),
         * 'G', UnificationEntry(gear, CrystalMatrix),
         * 'S', UnificationEntry(gearSmall, Draconium))
         *
         * ModHandler.addShapedRecipe(true, "rotor_holder_opv", MetaTileEntities.ROTOR_HOLDER[10].getStackForm(), "SGS",
         * "GHG", "SGS",
         * 'H', MetaTileEntities.HULL[GTValues.OpV].getStackForm(),
         * 'G', UnificationEntry(gear, Quantium),
         * 'S', UnificationEntry(gearSmall, Ledox))
         */
    }
}
