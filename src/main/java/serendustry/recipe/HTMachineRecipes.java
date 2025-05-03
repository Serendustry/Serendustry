package serendustry.recipe;

import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.blocks.MetaBlocks.MACHINE_CASING;
import static gregtech.common.items.MetaItems.CONVEYOR_MODULE_UIV;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UIV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_UV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UHV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UIV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UHV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UIV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UV;
import static gregtech.common.items.MetaItems.ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT;
import static gregtech.common.metatileentities.MetaTileEntities.*;
import static serendustry.item.SerendustryMetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.ADVANCED_ASSEMBLY_LINE;
import static serendustry.machine.SerendustryMetaTileEntities.ADVANCED_FUSION_REACTOR;
import static serendustry.machine.SerendustryMetaTileEntities.ELECTRIC_IMPLOSION_COMPRESSOR;
import static serendustry.machine.SerendustryMetaTileEntities.FLAMEL_CRUCIBLE;
import static serendustry.machine.SerendustryMetaTileEntities.PLASMA_CONDENSER;

import gregtech.api.GTValues;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.blocks.BlockMachineCasing;
import serendustry.SValues;

public class HTMachineRecipes {

    public static void init() {
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
                .input(FIELD_GENERATOR_UHV, 16)
                .input(ELECTRIC_PUMP_UHV, 32)
                .input(circuit, MarkerMaterials.Tier.UHV, 64)
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
                .output(FLAMEL_CRUCIBLE)
                .stationResearch(b -> b
                        .researchStack(LARGE_CHEMICAL_REACTOR.getStackForm())
                        .CWUt(144)
                        .EUt(VA[GTValues.UHV]))
                .duration(16000).EUt(VA[GTValues.UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, DeepDarkSteel, 32)
                .input(FIELD_GENERATOR_UIV, 12)
                .input(ELECTRIC_PUMP_UIV, 16)
                .input(CONVEYOR_MODULE_UIV, 16)
                .input(ELECTRIC_MOTOR_UIV, 16)
                .input(circuit, MarkerMaterials.Tier.UIV, 16)
                .input(circuit, MarkerMaterials.Tier.UEV, 32)
                .input(circuit, MarkerMaterials.Tier.UHV, 64)
                .input(plateDense, Neutronium, 64)
                .input(plateDense, AwakenedDraconium, 32)
                .input(plateDense, DeepDarkSteel, 32)
                .input(gear, HalkoniteSteel, 32)
                .input(gear, DeepDarkSteel, 32)
                .input(gear, Infinity, 32)
                .input(wireGtSingle, Hypogen, 64)
                .input(cableGtDouble, Quantium40, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 64),
                        Hypogen.getFluid(144 * 32),
                        Infinity.getFluid(144 * 64),
                        Flerovium.getPlasma(144 * 256))
                .output(PLASMA_CONDENSER)
                .stationResearch(b -> b
                        .researchStack(ADVANCED_FUSION_REACTOR.getStackForm())
                        .CWUt(144)
                        .EUt(VA[UEV]))
                .duration(25600).EUt(VA[UIV]).buildAndRegister();

        // Voltage Coils
        for (int i = GTValues.UHV; i <= GTValues.MAX; i++) {
            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(stickLong, SValues.Tier_Magnet[i])
                    .input(wireFine, SValues.Tier_Cable[i], 16)
                    .circuitMeta(1)
                    .output(SValues.Tier_Coil[i])
                    .duration(200).EUt(VA[i]).buildAndRegister();
        }

        // Machine Casings

        ModHandler.addShapedRecipe(true, "casing_uev",
                MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UEV), "PPP", "PwP", "PPP", 'P',
                new UnificationEntry(plate, SValues.Tier_Plate[GTValues.UEV]));
        ModHandler.addShapedRecipe(true, "casing_uiv",
                MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UIV), "PPP", "PwP", "PPP", 'P',
                new UnificationEntry(plate, SValues.Tier_Plate[GTValues.UIV]));
        ModHandler.addShapedRecipe(true, "casing_uxv",
                MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UXV), "PPP", "PwP", "PPP", 'P',
                new UnificationEntry(plate, SValues.Tier_Plate[GTValues.UXV]));
        ModHandler.addShapedRecipe(true, "casing_opv",
                MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.OpV), "PPP", "PwP", "PPP", 'P',
                new UnificationEntry(plate, SValues.Tier_Plate[GTValues.OpV]));
        ModHandler.addShapedRecipe(true, "casing_max",
                MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.MAX), "PPP", "PwP", "PPP", 'P',
                new UnificationEntry(plateDense, SValues.Tier_Plate[GTValues.MAX]));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, SValues.Tier_Plate[GTValues.UEV], 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UEV))
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, SValues.Tier_Plate[GTValues.UIV], 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UIV))
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, SValues.Tier_Plate[GTValues.UXV], 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UXV))
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, SValues.Tier_Plate[GTValues.OpV], 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.OpV))
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plateDense, SValues.Tier_Plate[GTValues.MAX], 8)
                .circuitMeta(8)
                .outputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.MAX))
                .duration(50).EUt(16).buildAndRegister();

        // Machine Hull Assembler Recipes

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UHV))
                .input(cableGtSingle, SValues.Tier_Cable[GTValues.UHV], 2)
                .fluidInputs(RadoxPolymer.getFluid(288))
                .output(HULL[GTValues.UHV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UEV))
                .input(cableGtSingle, SValues.Tier_Cable[GTValues.UEV], 2)
                .fluidInputs(RadoxPolymer.getFluid(288))
                .output(HULL[GTValues.UEV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UIV))
                .input(wireGtSingle, SValues.Tier_Cable[GTValues.UIV], 2)
                .fluidInputs(RadoxPolymer.getFluid(288))
                .output(HULL[GTValues.UIV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UXV))
                .input(cableGtSingle, SValues.Tier_Cable[GTValues.UXV], 2)
                .fluidInputs(RadoxPolymer.getFluid(288))
                .output(HULL[GTValues.UXV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.OpV))
                .input(cableGtSingle, SValues.Tier_Cable[GTValues.OpV], 2)
                .fluidInputs(RadoxPolymer.getFluid(288))
                .output(HULL[GTValues.OpV])
                .duration(50).EUt(16).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.MAX))
                .input(wireGtHex, SValues.Tier_Cable[GTValues.MAX], 2)
                .fluidInputs(Floppa.getFluid(2592))
                .output(HULL[GTValues.MAX])
                .duration(50).EUt(16).buildAndRegister();

        // Energy Output Hatches

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UEV])
                .input(spring, SValues.Tier_Cable[GTValues.UEV], 4)
                .input(CHIP_OPIC, 4)
                .input(circuit, MarkerMaterials.Tier.UEV)
                .input(wireGtDouble, SValues.Tier_Superconductor[GTValues.UEV], 2)
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
                .input(spring, SValues.Tier_Cable[GTValues.UIV], 4)
                .input(CHIP_OPIC, 8)
                .input(circuit, MarkerMaterials.Tier.UIV)
                .input(wireGtDouble, SValues.Tier_Superconductor[GTValues.UIV], 2)
                .fluidInputs(SodiumPotassium.getFluid(24000))
                .fluidInputs(MutatedLivingSolder.getFluid(1152))
                .output(ENERGY_OUTPUT_HATCH[GTValues.UIV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_OUTPUT_HATCH[GTValues.UEV].getStackForm())
                        .CWUt(128)
                        .EUt(VA[GTValues.UIV]))
                .duration(1000).EUt(VA[GTValues.UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UXV])
                .input(spring, SValues.Tier_Cable[GTValues.UXV], 4)
                .input(CHIP_OPIC, 16)
                .input(circuit, MarkerMaterials.Tier.UXV)
                .input(wireGtDouble, SValues.Tier_Superconductor[GTValues.UXV], 2)
                .fluidInputs(SodiumPotassium.getFluid(32000))
                .fluidInputs(MutatedLivingSolder.getFluid(2304))
                .output(ENERGY_OUTPUT_HATCH[GTValues.UXV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_OUTPUT_HATCH[GTValues.UIV].getStackForm())
                        .CWUt(128)
                        .EUt(VA[GTValues.UXV]))
                .duration(1000).EUt(VA[GTValues.UXV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.OpV])
                .input(spring, SValues.Tier_Cable[GTValues.OpV], 4)
                .input(CHIP_OPIC, 32)
                .input(circuit, MarkerMaterials.Tier.OpV)
                .input(wireGtDouble, SValues.Tier_Superconductor[GTValues.OpV], 2)
                .fluidInputs(SodiumPotassium.getFluid(64000))
                .fluidInputs(MutatedLivingSolder.getFluid(4608))
                .output(ENERGY_OUTPUT_HATCH[GTValues.OpV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_OUTPUT_HATCH[GTValues.UXV].getStackForm())
                        .CWUt(128)
                        .EUt(VA[GTValues.OpV]))
                .duration(1000).EUt(VA[GTValues.OpV]).buildAndRegister();

        // Energy Input Hatches

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.UEV])
                .input(cableGtSingle, SValues.Tier_Cable[GTValues.UEV], 4)
                .input(CHIP_OPIC, 4)
                .input(circuit, MarkerMaterials.Tier.UEV)
                .input(wireGtDouble, SValues.Tier_Superconductor[GTValues.UEV], 2)
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
                .input(wireGtDouble, SValues.Tier_Superconductor[GTValues.UIV], 4)
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
                .input(cableGtSingle, SValues.Tier_Cable[GTValues.UXV], 4)
                .input(CHIP_OPIC, 16)
                .input(circuit, MarkerMaterials.Tier.UXV)
                .input(wireGtDouble, SValues.Tier_Superconductor[GTValues.UXV], 2)
                .fluidInputs(SodiumPotassium.getFluid(32000))
                .fluidInputs(MutatedLivingSolder.getFluid(2304))
                .output(ENERGY_INPUT_HATCH[GTValues.UXV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_INPUT_HATCH[GTValues.UIV].getStackForm())
                        .CWUt(128)
                        .EUt(VA[GTValues.UXV]))
                .duration(1000).EUt(VA[GTValues.UXV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[GTValues.OpV])
                .input(cableGtSingle, SValues.Tier_Cable[GTValues.OpV], 4)
                .input(CHIP_OPIC, 32)
                .input(circuit, MarkerMaterials.Tier.OpV)
                .input(wireGtDouble, SValues.Tier_Superconductor[GTValues.OpV], 2)
                .fluidInputs(SodiumPotassium.getFluid(64000))
                .fluidInputs(MutatedLivingSolder.getFluid(4608))
                .output(ENERGY_INPUT_HATCH[GTValues.OpV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_INPUT_HATCH[GTValues.UXV].getStackForm())
                        .CWUt(128)
                        .EUt(VA[GTValues.OpV]))
                .duration(1000).EUt(VA[GTValues.OpV]).buildAndRegister();

        for (int i = GTValues.UHV; i <= GTValues.UXV; i++) {

            // Transformers
            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(SValues.Tier_PowerIC[i], 2)
                    .input(cableGtSingle, SValues.Tier_Cable[i], 4)
                    .input(cableGtSingle, SValues.Tier_Cable[i + 1])
                    .output(TRANSFORMER[i])
                    .duration(100).EUt(VA[i - 1]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(TRANSFORMER[i])
                    .input(SValues.Tier_Coil[i], 2)
                    .input(cableGtQuadruple, SValues.Tier_Cable[i], 4)
                    .input(cableGtQuadruple, SValues.Tier_Cable[i + 1])
                    .output(HI_AMP_TRANSFORMER[i])
                    .duration(150).EUt(VA[i - 1]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HI_AMP_TRANSFORMER[i])
                    .input(SValues.Tier_Pump[i - 3])
                    .input(cableGtOctal, SValues.Tier_Cable[i + 1])
                    .input(cableGtHex, SValues.Tier_Cable[i], 2)
                    .input(springSmall, SValues.Tier_Cable[i])
                    .input(spring, SValues.Tier_Cable[i + 1])
                    .fluidInputs(SValues.Tier_Lube[i].getFluid(2000))
                    .output(POWER_TRANSFORMER[i])
                    .duration(200).EUt(VA[i - 1]).buildAndRegister();
        }

        // OpV Transformers
        ASSEMBLER_RECIPES.recipeBuilder()
                .input(HULL[GTValues.OpV])
                .input(SValues.Tier_PowerIC[GTValues.OpV], 2)
                .input(cableGtSingle, SValues.Tier_Cable[GTValues.OpV], 4)
                .input(wireGtSingle, SValues.Tier_Cable[GTValues.OpV + 1])
                .output(TRANSFORMER[GTValues.OpV])
                .duration(200).EUt(VA[GTValues.OpV - 1]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(TRANSFORMER[GTValues.OpV])
                .input(SValues.Tier_Coil[GTValues.OpV], 2)
                .input(cableGtQuadruple, SValues.Tier_Cable[GTValues.OpV], 4)
                .input(wireGtQuadruple, SValues.Tier_Cable[GTValues.OpV + 1])
                .output(HI_AMP_TRANSFORMER[GTValues.OpV])
                .duration(300).EUt(VA[GTValues.OpV - 1]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(HI_AMP_TRANSFORMER[GTValues.OpV])
                .input(SValues.Tier_Pump[GTValues.OpV - 3])
                .input(wireGtOctal, SValues.Tier_Cable[GTValues.OpV + 1])
                .input(cableGtHex, SValues.Tier_Cable[GTValues.OpV], 2)
                .input(springSmall, SValues.Tier_Cable[GTValues.OpV])
                .input(spring, SValues.Tier_Cable[GTValues.OpV + 1])
                .fluidInputs(SValues.Tier_Lube[GTValues.OpV].getFluid(8000))
                .output(POWER_TRANSFORMER[GTValues.OpV])
                .duration(400).EUt(VA[GTValues.OpV - 1]).buildAndRegister();

        for (int i = GTValues.UHV; i <= GTValues.OpV; i++) {
            // Lasers
            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(lens, Diamond)
                    .input(SValues.Tier_Sensor[i])
                    .input(SValues.Tier_Pump[i])
                    .input(cableGtSingle, SValues.Tier_Cable[i], 4)
                    .circuitMeta(1)
                    .output(LASER_INPUT_HATCH_256[i - 5])
                    .duration(300).EUt(VA[i]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(lens, Diamond)
                    .input(SValues.Tier_Emitter[i])
                    .input(SValues.Tier_Pump[i])
                    .input(cableGtSingle, SValues.Tier_Cable[i], 4)
                    .circuitMeta(1)
                    .output(LASER_OUTPUT_HATCH_256[i - 5])
                    .duration(300).EUt(VA[i]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(lens, Diamond, 2)
                    .input(SValues.Tier_Sensor[i], 2)
                    .input(SValues.Tier_Pump[i], 2)
                    .input(cableGtDouble, SValues.Tier_Cable[i], 4)
                    .circuitMeta(2)
                    .output(LASER_INPUT_HATCH_1024[i - 5])
                    .duration(600).EUt(VA[i]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(lens, Diamond, 2)
                    .input(SValues.Tier_Emitter[i], 2)
                    .input(SValues.Tier_Pump[i], 2)
                    .input(cableGtDouble, SValues.Tier_Cable[i], 4)
                    .circuitMeta(2)
                    .output(LASER_OUTPUT_HATCH_1024[i - 5])
                    .duration(600).EUt(VA[i]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(lens, Diamond, 4)
                    .input(SValues.Tier_Sensor[i], 4)
                    .input(SValues.Tier_Pump[i], 4)
                    .input(cableGtQuadruple, SValues.Tier_Cable[i], 4)
                    .circuitMeta(3)
                    .output(LASER_INPUT_HATCH_4096[i - 5])
                    .duration(1200).EUt(VA[i]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(HULL[i])
                    .input(lens, Diamond, 4)
                    .input(SValues.Tier_Emitter[i], 4)
                    .input(SValues.Tier_Pump[i], 4)
                    .input(cableGtQuadruple, SValues.Tier_Cable[i], 4)
                    .circuitMeta(3)
                    .output(LASER_OUTPUT_HATCH_4096[i - 5])
                    .duration(1200).EUt(VA[i]).buildAndRegister();
        }

        // todo: UHV 4a/16a/64a hatches

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
