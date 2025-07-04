package serendustry.recipe;

import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.Americium;
import static gregtech.api.unification.material.Materials.Naquadria;
import static gregtech.api.unification.material.Materials.Neptunium;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.RutheniumTriniumAmericiumNeutronate;
import static gregtech.api.unification.material.Materials.Tritanium;
import static gregtech.api.unification.material.Materials.YttriumBariumCuprate;
import static gregtech.api.unification.ore.OrePrefix.cableGtSingle;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.foil;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.gear;
import static gregtech.api.unification.ore.OrePrefix.gearSmall;
import static gregtech.api.unification.ore.OrePrefix.pipeLargeFluid;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.ring;
import static gregtech.api.unification.ore.OrePrefix.rotor;
import static gregtech.api.unification.ore.OrePrefix.round;
import static gregtech.api.unification.ore.OrePrefix.screw;
import static gregtech.api.unification.ore.OrePrefix.stick;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.api.unification.ore.OrePrefix.wireFine;
import static gregtech.api.unification.ore.OrePrefix.wireGtSingle;
import static gregtech.common.items.MetaItems.CONVEYOR_MODULE_UEV;
import static gregtech.common.items.MetaItems.CONVEYOR_MODULE_UHV;
import static gregtech.common.items.MetaItems.CONVEYOR_MODULE_UIV;
import static gregtech.common.items.MetaItems.CONVEYOR_MODULE_UV;
import static gregtech.common.items.MetaItems.CONVEYOR_MODULE_UXV;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UEV;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UHV;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UIV;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UV;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UXV;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_ZPM;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_UEV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_UHV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_UIV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_UV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_UXV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UEV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UHV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UIV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UXV;
import static gregtech.common.items.MetaItems.EMITTER_UEV;
import static gregtech.common.items.MetaItems.EMITTER_UHV;
import static gregtech.common.items.MetaItems.EMITTER_UIV;
import static gregtech.common.items.MetaItems.EMITTER_UV;
import static gregtech.common.items.MetaItems.EMITTER_UXV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UEV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UHV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UIV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UXV;
import static gregtech.common.items.MetaItems.GRAVI_STAR;
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
import static serendustry.item.SerendustryMetaItems.QUANTIUM_STAR;
import static serendustry.item.material.SerendustryMaterials.AbyssalAlloy;
import static serendustry.item.material.SerendustryMaterials.AwakenedDraconium;
import static serendustry.item.material.SerendustryMaterials.CondensedStarMatter;
import static serendustry.item.material.SerendustryMaterials.DeepDarkSteel;
import static serendustry.item.material.SerendustryMaterials.Envoite;
import static serendustry.item.material.SerendustryMaterials.ExoHalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.Ferrofluid;
import static serendustry.item.material.SerendustryMaterials.FullerenePolymerMatrix;
import static serendustry.item.material.SerendustryMaterials.HalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.HighGradeSolderingAlloy;
import static serendustry.item.material.SerendustryMaterials.Hihiirokane;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.MagneticHolmium;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;
import static serendustry.item.material.SerendustryMaterials.Realitium;
import static serendustry.item.material.SerendustryMaterials.ReissnerNordstromium;
import static serendustry.item.material.SerendustryMaterials.ScUevSane;
import static serendustry.item.material.SerendustryMaterials.ScUxvSane;
import static serendustry.item.material.SerendustryMaterials.SelfRepairingNanobots;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.item.material.SerendustryMaterials.TengamAttuned;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;

import gregtech.api.unification.material.MarkerMaterials.Tier;

public class HTComponentRecipes {

    // Todo: require research for all Assembly Line recipes
    public static void init() {
        // Motors

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, MagneticHolmium)
                .input(stickLong, Tritanium, 4)
                .input(ring, Tritanium, 4)
                .input(round, Tritanium, 8)
                .input(wireFine, Americium, 64)
                .input(wireFine, Americium, 64)
                .input(cableGtSingle, YttriumBariumCuprate, 2)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 4))
                .fluidInputs(Ferrofluid.getFluid(500))
                .fluidInputs(Naquadria.getFluid(144 * 4))
                .output(ELECTRIC_MOTOR_UV)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_MOTOR_ZPM.getStackForm())
                        .CWUt(32)
                        .EUt(VA[ZPM]))
                .duration(30 * 20).EUt(VA[ZPM]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, MagneticHolmium, 2)
                .input(stickLong, Neutronium, 6)
                .input(stickLong, VibraniumAlloy, 6)
                .input(ring, Neutronium, 6)
                .input(round, Neutronium, 12)
                .input(wireFine, Hihiirokane, 64)
                .input(wireFine, Hihiirokane, 64)
                .input(wireFine, Hihiirokane, 64)
                .input(cableGtSingle, Hihiirokane, 4)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 2))
                .fluidInputs(Ferrofluid.getFluid(1000))
                .fluidInputs(CondensedStarMatter.getFluid(1000))
                .output(ELECTRIC_MOTOR_UHV)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_MOTOR_UV.getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(30 * 20).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, TengamAttuned, 4)
                .input(stickLong, HalkoniteSteel, 8)
                .input(stickLong, AbyssalAlloy, 8)
                .input(ring, HalkoniteSteel, 8)
                .input(round, HalkoniteSteel, 16)
                .input(wireFine, Quantium40, 64)
                .input(wireFine, Quantium40, 64)
                .input(wireFine, Quantium40, 64)
                .input(wireFine, Quantium40, 64)
                .input(cableGtSingle, Quantium40, 6)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 4))
                .fluidInputs(Ferrofluid.getFluid(2000))
                .fluidInputs(AbyssalAlloy.getFluid(144 * 4))
                .output(ELECTRIC_MOTOR_UEV)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_MOTOR_UHV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UHV]))
                .duration(30 * 30).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, TengamAttuned, 6)
                .input(stickLong, DeepDarkSteel, 10)
                .input(stickLong, AwakenedDraconium, 10)
                .input(ring, DeepDarkSteel, 10)
                .input(round, DeepDarkSteel, 20)
                .input(wireFine, Infinity, 64)
                .input(wireFine, Infinity, 64)
                .input(wireFine, Infinity, 64)
                .input(wireFine, Infinity, 64)
                .input(wireFine, Infinity, 64)
                .input(wireFine, Infinity, 64)
                .input(wireGtSingle, Hypogen, 8)
                .fluidInputs(SentientNanobots.getFluid(144 * 4))
                .fluidInputs(Ferrofluid.getFluid(4000))
                .fluidInputs(Infinity.getFluid(144 * 4))
                .output(ELECTRIC_MOTOR_UIV)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_MOTOR_UEV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UEV]))
                .duration(30 * 45).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, TengamAttuned, 8)
                .input(stickLong, ExoHalkoniteSteel, 12)
                .input(stickLong, ReissnerNordstromium, 12)
                .input(ring, ExoHalkoniteSteel, 12)
                .input(round, ExoHalkoniteSteel, 24)
                .input(wireFine, Envoite, 64)
                .input(wireFine, Envoite, 64)
                .input(wireFine, Envoite, 64)
                .input(wireFine, Envoite, 64)
                .input(wireFine, Envoite, 64)
                .input(wireFine, Envoite, 64)
                .input(wireFine, Envoite, 64)
                .input(wireGtSingle, ScUxvSane, 10)
                .fluidInputs(SentientNanobots.getFluid(144 * 8))
                .fluidInputs(Ferrofluid.getFluid(6000))
                .fluidInputs(Neptunium.getFluid(144 * 16),
                        Realitium.getFluid(100))
                .output(ELECTRIC_MOTOR_UXV)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_MOTOR_UIV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UIV]))
                .duration(30 * 65).EUt(VA[UIV]).buildAndRegister();

        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(stickLong, KerrBlackHole, 2)
        // .input(stickLong, Quantum, 4)
        // .input(ring, CallistoIce, 4)
        // .input(round, CallistoIce, 8)
        // .input(wireFine, Quantium, 64)
        // .input(wireFine, Quantium, 64)
        // .input(wireFine, Ledox, 64)
        // .input(wireFine, Ledox, 64)
        // .input(cableGtSingle, Quantium, 2)
        // .fluidInputs(MutatedLivingSolder.getFluid(2304))
        // .fluidInputs(OmniversalLubricant.getPlasma(8000))
        // .fluidInputs(Periodicium.getPlasma(576))
        // .fluidInputs(Shirabon.getFluid(144))
        // .output(ELECTRIC_MOTOR_OpV)
        // .stationResearch(b -> b
        // .researchStack(ELECTRIC_MOTOR_UXV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[UXV]))
        // .duration(30 * 100).EUt(VA[UXV]).buildAndRegister();
        //
        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(stickLong, KerrBlackHole, 8)
        // .input(stickLong, Floppa, 4)
        // .input(ring, Shirabon, 4)
        // .input(round, Shirabon, 8)
        // .input(wireFine, Floppa, 64)
        // .input(wireFine, Floppa, 64)
        // .input(wireFine, Shirabon, 64)
        // .input(wireFine, Shirabon, 64)
        // .input(wireGtSingle, Floppa, 2)
        // .fluidInputs(MutatedLivingSolder.getFluid(9216))
        // .fluidInputs(OmniversalLubricant.getPlasma(32000))
        // .fluidInputs(MultiversalAlloy.getFluid(2304))
        // .fluidInputs(TransResidue.getFluid(64000))
        // .output(ELECTRIC_MOTOR_MAX)
        // .stationResearch(b -> b
        // .researchStack(ELECTRIC_MOTOR_OpV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[OpV]))
        // .duration(30 * 300).EUt(VA[OpV]).buildAndRegister();

        // Conveyors

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UHV, 2)
                .input(plate, Neutronium, 4)
                .input(plate, VibraniumAlloy, 4)
                .input(ring, Neutronium, 6)
                .input(round, Neutronium, 20)
                .input(screw, Neutronium, 6)
                .input(cableGtSingle, Hihiirokane, 4)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 2))
                .fluidInputs(Ferrofluid.getFluid(1000))
                .fluidInputs(RadoxPolymer.getFluid(144))
                .fluidInputs(CondensedStarMatter.getFluid(1000))
                .output(CONVEYOR_MODULE_UHV)
                .stationResearch(b -> b
                        .researchStack(CONVEYOR_MODULE_UV.getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(30 * 20).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UEV, 2)
                .input(plate, HalkoniteSteel, 6)
                .input(plate, AbyssalAlloy, 6)
                .input(ring, HalkoniteSteel, 8)
                .input(round, HalkoniteSteel, 24)
                .input(screw, HalkoniteSteel, 8)
                .input(cableGtSingle, Quantium40, 6)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 4))
                .fluidInputs(Ferrofluid.getFluid(2000))
                .fluidInputs(RadoxPolymer.getFluid(144 * 2))
                .fluidInputs(AbyssalAlloy.getFluid(144 * 4))
                .output(CONVEYOR_MODULE_UEV)
                .stationResearch(b -> b
                        .researchStack(CONVEYOR_MODULE_UHV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UHV]))
                .duration(30 * 30).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UIV, 2)
                .input(plate, DeepDarkSteel, 8)
                .input(plate, AwakenedDraconium, 8)
                .input(ring, DeepDarkSteel, 10)
                .input(round, Infinity, 28)
                .input(screw, Infinity, 10)
                .input(wireGtSingle, Hypogen, 8)
                .fluidInputs(SentientNanobots.getFluid(144 * 4))
                .fluidInputs(Ferrofluid.getFluid(4000))
                .fluidInputs(RadoxPolymer.getFluid(576))
                .fluidInputs(Infinity.getFluid(576))
                .output(CONVEYOR_MODULE_UIV)
                .stationResearch(b -> b
                        .researchStack(CONVEYOR_MODULE_UEV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UEV]))
                .duration(30 * 45).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UXV, 2)
                .input(plate, ExoHalkoniteSteel, 10)
                .input(plate, ReissnerNordstromium, 10)
                .input(ring, ExoHalkoniteSteel, 12)
                .input(round, ReissnerNordstromium, 32)
                .input(screw, ReissnerNordstromium, 12)
                .input(wireGtSingle, ScUxvSane, 10)
                .fluidInputs(SentientNanobots.getFluid(144 * 8))
                .fluidInputs(FullerenePolymerMatrix.getFluid(144 * 6))
                .fluidInputs(Neptunium.getFluid(144 * 16),
                        Realitium.getFluid(100))
                .output(CONVEYOR_MODULE_UXV)
                .stationResearch(b -> b
                        .researchStack(CONVEYOR_MODULE_UIV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UIV]))
                .duration(30 * 65).EUt(VA[UIV]).buildAndRegister();

        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(ELECTRIC_MOTOR_OpV, 2)
        // .input(plate, Quantum, 2)
        // .input(ring, Quantum, 4)
        // .input(round, CallistoIce, 16)
        // .input(screw, CallistoIce, 4)
        // .input(cableGtSingle, Quantium, 2)
        // .fluidInputs(MutatedLivingSolder.getFluid(2304))
        // .fluidInputs(RadoxPolymer.getFluid(2304))
        // .fluidInputs(Periodicium.getPlasma(576))
        // .fluidInputs(Shirabon.getFluid(144))
        // .output(CONVEYOR_MODULE_OpV)
        // .stationResearch(b -> b
        // .researchStack(CONVEYOR_MODULE_UXV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[UXV]))
        // .duration(30 * 100).EUt(VA[UXV]).buildAndRegister();
        //
        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(ELECTRIC_MOTOR_MAX, 2)
        // .input(plate, Floppa, 2)
        // .input(ring, Shirabon, 4)
        // .input(round, Shirabon, 16)
        // .input(screw, Shirabon, 4)
        // .input(wireGtSingle, Floppa, 2)
        // .fluidInputs(MutatedLivingSolder.getFluid(9216))
        // .fluidInputs(RadoxPolymer.getFluid(9216))
        // .fluidInputs(MultiversalAlloy.getFluid(2304))
        // .fluidInputs(TransResidue.getFluid(64000))
        // .output(CONVEYOR_MODULE_MAX)
        // .stationResearch(b -> b
        // .researchStack(CONVEYOR_MODULE_OpV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[OpV]))
        // .duration(30 * 300).EUt(VA[OpV]).buildAndRegister();

        // Pumps

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UHV)
                .input(pipeLargeFluid, VibraniumAlloy)
                .input(plate, Neutronium, 4)
                .input(plate, VibraniumAlloy, 4)
                .input(screw, Neutronium, 10)
                .input(ring, RadoxPolymer, 8)
                .input(rotor, VibraniumAlloy)
                .input(cableGtSingle, Hihiirokane, 4)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 2))
                .fluidInputs(Ferrofluid.getFluid(1000))
                .fluidInputs(CondensedStarMatter.getFluid(1000))
                .output(ELECTRIC_PUMP_UHV)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_PUMP_UV.getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(30 * 20).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UEV)
                .input(pipeLargeFluid, AbyssalAlloy)
                .input(plate, HalkoniteSteel, 6)
                .input(plate, AbyssalAlloy, 6)
                .input(screw, HalkoniteSteel, 12)
                .input(ring, RadoxPolymer, 16)
                .input(rotor, AbyssalAlloy)
                .input(cableGtSingle, Quantium40, 6)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 4))
                .fluidInputs(Ferrofluid.getFluid(2000))
                .fluidInputs(AbyssalAlloy.getFluid(144 * 4))
                .output(ELECTRIC_PUMP_UEV)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_PUMP_UHV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UHV]))
                .duration(30 * 30).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UIV)
                .input(pipeLargeFluid, DeepDarkSteel)
                .input(plate, DeepDarkSteel, 8)
                .input(plate, AwakenedDraconium, 8)
                .input(screw, Infinity, 14)
                .input(ring, RadoxPolymer, 32)
                .input(rotor, DeepDarkSteel)
                .input(wireGtSingle, Hypogen, 8)
                .fluidInputs(SentientNanobots.getFluid(144 * 4))
                .fluidInputs(Ferrofluid.getFluid(4000))
                .fluidInputs(Infinity.getFluid(576))
                .output(ELECTRIC_PUMP_UIV)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_PUMP_UEV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UEV]))
                .duration(30 * 45).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UXV)
                .input(pipeLargeFluid, Envoite)
                .input(plate, ExoHalkoniteSteel, 10)
                .input(plate, ReissnerNordstromium, 10)
                .input(screw, ReissnerNordstromium, 16)
                .input(ring, FullerenePolymerMatrix, 36)
                .input(rotor, ExoHalkoniteSteel)
                .input(wireGtSingle, ScUxvSane, 10)
                .fluidInputs(SentientNanobots.getFluid(144 * 8))
                .fluidInputs(Ferrofluid.getFluid(6000))
                .fluidInputs(Neptunium.getFluid(144 * 16),
                        Realitium.getFluid(100))
                .output(ELECTRIC_PUMP_UXV)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_PUMP_UIV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UIV]))
                .duration(30 * 65).EUt(VA[UIV]).buildAndRegister();

        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(ELECTRIC_MOTOR_OpV)
        // .input(pipeLargeFluid, CallistoIce)
        // .input(plate, Quantum, 2)
        // .input(screw, Quantum, 8)
        // .input(ring, RadoxPolymer, 64)
        // .input(rotor, Quantium, 1)
        // .input(cableGtSingle, Quantium, 2)
        // .fluidInputs(MutatedLivingSolder.getFluid(2304))
        // .fluidInputs(OmniversalLubricant.getPlasma(8000))
        // .fluidInputs(Periodicium.getPlasma(576))
        // .fluidInputs(Shirabon.getFluid(144))
        // .output(ELECTRIC_PUMP_OpV)
        // .stationResearch(b -> b
        // .researchStack(ELECTRIC_PUMP_UXV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[UXV]))
        // .duration(30 * 100).EUt(VA[UXV]).buildAndRegister();
        //
        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(ELECTRIC_MOTOR_MAX)
        // .input(pipeLargeFluid, Shirabon)
        // .input(plate, Floppa, 2)
        // .input(screw, Shirabon, 8)
        // .input(ring, RadoxPolymer, 64)
        // .input(ring, RadoxPolymer, 64)
        // .input(ring, RadoxPolymer, 64)
        // .input(ring, RadoxPolymer, 64)
        // .input(rotor, Shirabon, 1)
        // .input(wireGtSingle, Floppa, 2)
        // .fluidInputs(MutatedLivingSolder.getFluid(9216))
        // .fluidInputs(OmniversalLubricant.getPlasma(32000))
        // .fluidInputs(MultiversalAlloy.getFluid(2304))
        // .fluidInputs(TransResidue.getFluid(64000))
        // .output(ELECTRIC_PUMP_MAX)
        // .stationResearch(b -> b
        // .researchStack(ELECTRIC_PUMP_OpV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[OpV]))
        // .duration(30 * 300).EUt(VA[OpV]).buildAndRegister();

        // Pistons

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UHV)
                .input(plate, Neutronium, 6)
                .input(plate, VibraniumAlloy, 6)
                .input(ring, Neutronium, 6)
                .input(round, Neutronium, 20)
                .input(stick, Neutronium, 6)
                .input(gear, VibraniumAlloy, 2)
                .input(gearSmall, VibraniumAlloy, 4)
                .input(cableGtSingle, Hihiirokane, 4)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 2))
                .fluidInputs(Ferrofluid.getFluid(1000))
                .fluidInputs(CondensedStarMatter.getFluid(1000))
                .output(ELECTRIC_PISTON_UHV)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_PISTON_UV.getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(30 * 20).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UEV)
                .input(plate, HalkoniteSteel, 8)
                .input(plate, AbyssalAlloy, 8)
                .input(ring, HalkoniteSteel, 8)
                .input(round, HalkoniteSteel, 24)
                .input(stick, HalkoniteSteel, 8)
                .input(gear, AbyssalAlloy, 3)
                .input(gearSmall, AbyssalAlloy, 6)
                .input(cableGtSingle, Quantium40, 6)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 4))
                .fluidInputs(Ferrofluid.getFluid(2000))
                .fluidInputs(AbyssalAlloy.getFluid(144 * 4))
                .output(ELECTRIC_PISTON_UEV)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_PISTON_UHV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UHV]))
                .duration(30 * 30).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UIV)
                .input(plate, DeepDarkSteel, 10)
                .input(plate, AwakenedDraconium, 10)
                .input(ring, DeepDarkSteel, 10)
                .input(round, Infinity, 28)
                .input(stick, DeepDarkSteel, 10)
                .input(gear, DeepDarkSteel, 4)
                .input(gearSmall, Infinity, 8)
                .input(wireGtSingle, Hypogen, 8)
                .fluidInputs(SentientNanobots.getFluid(144 * 4))
                .fluidInputs(Ferrofluid.getFluid(4000))
                .fluidInputs(Infinity.getFluid(576))
                .output(ELECTRIC_PISTON_UIV)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_PISTON_UEV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UEV]))
                .duration(30 * 45).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UXV)
                .input(plate, ExoHalkoniteSteel, 12)
                .input(plate, ReissnerNordstromium, 12)
                .input(ring, ExoHalkoniteSteel, 12)
                .input(round, ReissnerNordstromium, 32)
                .input(stick, ExoHalkoniteSteel, 12)
                .input(gear, ExoHalkoniteSteel, 5)
                .input(gearSmall, ReissnerNordstromium, 10)
                .input(wireGtSingle, ScUxvSane, 10)
                .fluidInputs(SentientNanobots.getFluid(144 * 8))
                .fluidInputs(Ferrofluid.getFluid(6000))
                .fluidInputs(Neptunium.getFluid(144 * 16),
                        Realitium.getFluid(100))
                .output(ELECTRIC_PISTON_UXV)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_PISTON_UIV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UIV]))
                .duration(30 * 65).EUt(VA[UIV]).buildAndRegister();

        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(ELECTRIC_MOTOR_OpV)
        // .input(plate, Quantum, 4)
        // .input(ring, Quantum, 4)
        // .input(round, CallistoIce, 16)
        // .input(stick, Quantum, 4)
        // .input(gear, Quantium)
        // .input(gearSmall, Ledox, 2)
        // .input(cableGtSingle, Quantium, 2)
        // .fluidInputs(MutatedLivingSolder.getFluid(2304))
        // .fluidInputs(OmniversalLubricant.getPlasma(8000))
        // .fluidInputs(Periodicium.getPlasma(576))
        // .fluidInputs(Shirabon.getFluid(144))
        // .output(ELECTRIC_PISTON_OpV)
        // .stationResearch(b -> b
        // .researchStack(ELECTRIC_PISTON_UXV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[UXV]))
        // .duration(3600).EUt(6000000).buildAndRegister();
        //
        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(ELECTRIC_MOTOR_MAX)
        // .input(plate, Floppa, 4)
        // .input(ring, Shirabon, 4)
        // .input(round, Shirabon, 16)
        // .input(stick, Floppa, 4)
        // .input(gear, Shirabon)
        // .input(gearSmall, Floppa, 2)
        // .input(wireGtSingle, Floppa, 2)
        // .fluidInputs(MutatedLivingSolder.getFluid(9216))
        // .fluidInputs(OmniversalLubricant.getPlasma(32000))
        // .fluidInputs(MultiversalAlloy.getFluid(2304))
        // .fluidInputs(TransResidue.getFluid(64000))
        // .output(ELECTRIC_PISTON_MAX)
        // .stationResearch(b -> b
        // .researchStack(ELECTRIC_PISTON_OpV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[OpV]))
        // .duration(6400).EUt(6000000).buildAndRegister();

        // Robot Arms

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, Neutronium, 6)
                .input(stickLong, VibraniumAlloy, 6)
                .input(gear, Neutronium, 2)
                .input(gearSmall, Neutronium, 6)
                .input(ELECTRIC_MOTOR_UHV, 2)
                .input(ELECTRIC_PISTON_UHV, 1)
                .input(circuit, Tier.UHV, 1)
                .input(circuit, Tier.UV, 2)
                .input(circuit, Tier.ZPM, 4)
                .input(cableGtSingle, Hihiirokane, 6)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 6))
                .fluidInputs(Ferrofluid.getFluid(1000))
                .fluidInputs(CondensedStarMatter.getFluid(1000))
                .output(ROBOT_ARM_UHV)
                .stationResearch(b -> b
                        .researchStack(ROBOT_ARM_UV.getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(30 * 20).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, HalkoniteSteel, 8)
                .input(stickLong, AbyssalAlloy, 8)
                .input(gear, HalkoniteSteel, 3)
                .input(gearSmall, HalkoniteSteel, 9)
                .input(ELECTRIC_MOTOR_UEV, 2)
                .input(ELECTRIC_PISTON_UEV, 1)
                .input(circuit, Tier.UEV, 1)
                .input(circuit, Tier.UHV, 2)
                .input(circuit, Tier.UV, 4)
                .input(cableGtSingle, Quantium40, 8)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 12))
                .fluidInputs(Ferrofluid.getFluid(2000))
                .fluidInputs(AbyssalAlloy.getFluid(144 * 4))
                .output(ROBOT_ARM_UEV)
                .stationResearch(b -> b
                        .researchStack(ROBOT_ARM_UHV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UHV]))
                .duration(30 * 30).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, DeepDarkSteel, 10)
                .input(stickLong, AwakenedDraconium, 10)
                .input(gear, Infinity, 4)
                .input(gearSmall, DeepDarkSteel, 12)
                .input(ELECTRIC_MOTOR_UIV, 2)
                .input(ELECTRIC_PISTON_UIV, 1)
                .input(circuit, Tier.UIV, 1)
                .input(circuit, Tier.UEV, 2)
                .input(circuit, Tier.UHV, 4)
                .input(wireGtSingle, Hypogen, 10)
                .fluidInputs(SentientNanobots.getFluid(144 * 12))
                .fluidInputs(Ferrofluid.getFluid(4000))
                .fluidInputs(Infinity.getFluid(576))
                .output(ROBOT_ARM_UIV)
                .stationResearch(b -> b
                        .researchStack(ROBOT_ARM_UEV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UEV]))
                .duration(30 * 45).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, ExoHalkoniteSteel, 12)
                .input(stickLong, ReissnerNordstromium, 12)
                .input(gear, ReissnerNordstromium, 6)
                .input(gearSmall, ExoHalkoniteSteel, 14)
                .input(ELECTRIC_MOTOR_UXV, 2)
                .input(ELECTRIC_PISTON_UXV, 1)
                .input(circuit, Tier.UXV, 1)
                .input(circuit, Tier.UIV, 2)
                .input(circuit, Tier.UEV, 4)
                .input(wireGtSingle, ScUxvSane, 12)
                .fluidInputs(SentientNanobots.getFluid(144 * 24))
                .fluidInputs(Ferrofluid.getFluid(6000))
                .fluidInputs(Neptunium.getFluid(144 * 16),
                        Realitium.getFluid(100))
                .output(ROBOT_ARM_UXV)
                .stationResearch(b -> b
                        .researchStack(ROBOT_ARM_UIV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UIV]))
                .duration(30 * 65).EUt(VA[UIV]).buildAndRegister();

        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(stickLong, Quantum, 4)
        // .input(gear, Quantium, 1)
        // .input(gearSmall, Ledox, 3)
        // .input(ELECTRIC_MOTOR_OpV, 2)
        // .input(ELECTRIC_PISTON_OpV, 1)
        // .input(circuit, Tier.OpV, 1)
        // .input(circuit, Tier.UXV, 2)
        // .input(circuit, Tier.UIV, 4)
        // .input(cableGtSingle, Quantium, 4)
        // .fluidInputs(MutatedLivingSolder.getFluid(2304))
        // .fluidInputs(OmniversalLubricant.getPlasma(8000))
        // .fluidInputs(Periodicium.getPlasma(576))
        // .fluidInputs(Shirabon.getFluid(144))
        // .output(ROBOT_ARM_OpV)
        // .stationResearch(b -> b
        // .researchStack(ROBOT_ARM_UXV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[UXV]))
        // .duration(30 * 100).EUt(VA[UXV]).buildAndRegister();
        //
        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(stickLong, Floppa, 4)
        // .input(gear, Shirabon, 1)
        // .input(gearSmall, Floppa, 3)
        // .input(ELECTRIC_MOTOR_MAX, 2)
        // .input(ELECTRIC_PISTON_MAX, 1)
        // .input(circuit, Tier.MAX, 1)
        // .input(circuit, Tier.OpV, 2)
        // .input(circuit, Tier.UXV, 4)
        // .input(wireGtSingle, Floppa, 4)
        // .fluidInputs(MutatedLivingSolder.getFluid(9216))
        // .fluidInputs(OmniversalLubricant.getPlasma(32000))
        // .fluidInputs(MultiversalAlloy.getFluid(2304))
        // .fluidInputs(TransResidue.getFluid(64000))
        // .output(ROBOT_ARM_MAX)
        // .stationResearch(b -> b
        // .researchStack(ROBOT_ARM_OpV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[OpV]))
        // .duration(30 * 300).EUt(VA[OpV]).buildAndRegister();

        // Field Generators

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium)
                .input(plate, Neutronium, 8)
                .input(plate, VibraniumAlloy, 8)
                .input(GRAVI_STAR, 2)
                .input(EMITTER_UHV, 2)
                .input(circuit, Tier.UHV, 2)
                .input(wireFine, RutheniumTriniumAmericiumNeutronate, 64)
                .input(wireFine, RutheniumTriniumAmericiumNeutronate, 64)
                .input(wireFine, RutheniumTriniumAmericiumNeutronate, 64)
                .input(cableGtSingle, Hihiirokane, 6)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 6))
                .fluidInputs(CondensedStarMatter.getFluid(1000))
                .output(FIELD_GENERATOR_UHV)
                .stationResearch(b -> b
                        .researchStack(FIELD_GENERATOR_UV.getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(30 * 20).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, AbyssalAlloy)
                .input(plate, HalkoniteSteel, 10)
                .input(plate, AbyssalAlloy, 10)
                .input(QUANTIUM_STAR, 2)
                .input(EMITTER_UEV, 2)
                .input(circuit, Tier.UEV, 2)
                .input(wireFine, ScUevSane, 64)
                .input(wireFine, ScUevSane, 64)
                .input(wireFine, ScUevSane, 64)
                .input(wireFine, ScUevSane, 64)
                .input(cableGtSingle, Quantium40, 8)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 12))
                .fluidInputs(AbyssalAlloy.getFluid(144 * 4))
                .output(FIELD_GENERATOR_UEV)
                .stationResearch(b -> b
                        .researchStack(FIELD_GENERATOR_UHV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UHV]))
                .duration(30 * 30).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, DeepDarkSteel)
                .input(plate, DeepDarkSteel, 12)
                .input(plate, AwakenedDraconium, 12)
                .input(QUANTIUM_STAR, 4)
                .input(EMITTER_UIV, 2)
                .input(circuit, Tier.UIV, 2)
                .input(wireFine, Hypogen, 64)
                .input(wireFine, Hypogen, 64)
                .input(wireFine, Hypogen, 64)
                .input(wireFine, Hypogen, 64)
                .input(wireFine, Hypogen, 64)
                .input(wireGtSingle, Hypogen, 10)
                .fluidInputs(SentientNanobots.getFluid(144 * 12))
                .fluidInputs(Infinity.getFluid(576))
                .output(FIELD_GENERATOR_UIV)
                .stationResearch(b -> b
                        .researchStack(FIELD_GENERATOR_UEV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UEV]))
                .duration(30 * 45).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Envoite)
                .input(plate, ExoHalkoniteSteel, 14)
                .input(plate, ReissnerNordstromium, 14)
                .input(QUANTIUM_STAR, 6)
                .input(EMITTER_UXV, 2)
                .input(circuit, Tier.UXV, 2)
                .input(wireFine, ScUxvSane, 64)
                .input(wireFine, ScUxvSane, 64)
                .input(wireFine, ScUxvSane, 64)
                .input(wireFine, ScUxvSane, 64)
                .input(wireFine, ScUxvSane, 64)
                .input(wireFine, ScUxvSane, 64)
                .input(wireGtSingle, ScUxvSane, 12)
                .fluidInputs(SentientNanobots.getFluid(144 * 24))
                .fluidInputs(Neptunium.getFluid(144 * 16),
                        Realitium.getFluid(100))
                .output(FIELD_GENERATOR_UXV)
                .stationResearch(b -> b
                        .researchStack(FIELD_GENERATOR_UIV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UIV]))
                .duration(30 * 65).EUt(VA[UIV]).buildAndRegister();

        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(frameGt, Quantum)
        // .input(plate, Quantium, 6)
        // .input(QUANTIUM_STAR, 1)
        // .input(EMITTER_OpV, 2)
        // .input(circuit, Tier.OpV, 2)
        // .input(wireFine, ScOpv, 64)
        // .input(wireFine, ScOpv, 64)
        // .input(wireFine, Quantium, 64)
        // .input(wireFine, Infinity, 64)
        // .input(cableGtSingle, Quantium, 4)
        // .fluidInputs(MutatedLivingSolder.getFluid(2304))
        // .fluidInputs(Periodicium.getPlasma(576))
        // .fluidInputs(Shirabon.getFluid(144))
        // .output(FIELD_GENERATOR_OpV)
        // .stationResearch(b -> b
        // .researchStack(FIELD_GENERATOR_UXV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[UXV]))
        // .duration(30 * 100).EUt(VA[UXV]).buildAndRegister();
        //
        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(frameGt, Shirabon)
        // .input(plate, Floppa, 6)
        // .input(QUANTIUM_STAR, 4)
        // .input(EMITTER_MAX, 2)
        // .input(circuit, Tier.MAX, 2)
        // .input(wireFine, Floppa, 64)
        // .input(wireFine, Floppa, 64)
        // .input(wireFine, Shirabon, 64)
        // .input(wireFine, Shirabon, 64)
        // .input(wireGtSingle, Floppa, 4)
        // .fluidInputs(MutatedLivingSolder.getFluid(9216))
        // .fluidInputs(MultiversalAlloy.getFluid(2304))
        // .fluidInputs(TransResidue.getFluid(64000))
        // .output(FIELD_GENERATOR_MAX)
        // .stationResearch(b -> b
        // .researchStack(FIELD_GENERATOR_OpV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[OpV]))
        // .duration(30 * 300).EUt(VA[OpV]).buildAndRegister();

        // Sensors

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium)
                .input(ELECTRIC_MOTOR_UHV)
                .input(plate, Neutronium, 6)
                .input(plate, VibraniumAlloy, 6)
                .input(GRAVI_STAR, 2)
                .input(circuit, Tier.UHV, 2)
                .input(foil, Hihiirokane, 64)
                .input(foil, Hihiirokane, 64)
                .input(foil, Hihiirokane, 64)
                .input(cableGtSingle, Hihiirokane, 6)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 4))
                .fluidInputs(CondensedStarMatter.getFluid(1000))
                .output(SENSOR_UHV)
                .stationResearch(b -> b
                        .researchStack(SENSOR_UV.getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(30 * 20).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, AbyssalAlloy)
                .input(ELECTRIC_MOTOR_UEV)
                .input(plate, HalkoniteSteel, 8)
                .input(plate, AbyssalAlloy, 8)
                .input(QUANTIUM_STAR, 2)
                .input(circuit, Tier.UEV, 2)
                .input(foil, Quantium40, 64)
                .input(foil, Quantium40, 64)
                .input(foil, Quantium40, 64)
                .input(foil, Quantium40, 64)
                .input(cableGtSingle, Quantium40, 8)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 8))
                .fluidInputs(AbyssalAlloy.getFluid(144 * 4))
                .output(SENSOR_UEV)
                .stationResearch(b -> b
                        .researchStack(SENSOR_UHV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UHV]))
                .duration(30 * 30).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, DeepDarkSteel)
                .input(ELECTRIC_MOTOR_UIV)
                .input(plate, DeepDarkSteel, 10)
                .input(plate, AwakenedDraconium, 10)
                .input(QUANTIUM_STAR, 4)
                .input(circuit, Tier.UIV, 2)
                .input(foil, Infinity, 64)
                .input(foil, Infinity, 64)
                .input(foil, Infinity, 64)
                .input(foil, Infinity, 64)
                .input(foil, Infinity, 64)
                .input(wireGtSingle, Hypogen, 10)
                .fluidInputs(SentientNanobots.getFluid(144 * 8))
                .fluidInputs(Infinity.getFluid(576))
                .output(SENSOR_UIV)
                .stationResearch(b -> b
                        .researchStack(SENSOR_UEV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UEV]))
                .duration(30 * 45).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Envoite)
                .input(ELECTRIC_MOTOR_UXV)
                .input(plate, ExoHalkoniteSteel, 12)
                .input(plate, ReissnerNordstromium, 12)
                .input(QUANTIUM_STAR, 6)
                .input(circuit, Tier.UXV, 2)
                .input(foil, Envoite, 64)
                .input(foil, Envoite, 64)
                .input(foil, Envoite, 64)
                .input(foil, Envoite, 64)
                .input(foil, Envoite, 64)
                .input(wireGtSingle, ScUxvSane, 12)
                .fluidInputs(SentientNanobots.getFluid(144 * 16))
                .fluidInputs(Neptunium.getFluid(144 * 16),
                        Realitium.getFluid(100))
                .output(SENSOR_UXV)
                .stationResearch(b -> b
                        .researchStack(SENSOR_UIV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UIV]))
                .duration(30 * 65).EUt(VA[UIV]).buildAndRegister();

        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(frameGt, Quantum)
        // .input(ELECTRIC_MOTOR_OpV)
        // .input(plate, Ledox, 4)
        // .input(QUANTIUM_STAR)
        // .input(circuit, Tier.OpV, 2)
        // .input(foil, Quantium, 64)
        // .input(foil, Infinity, 32)
        // .input(cableGtSingle, Quantium, 4)
        // .fluidInputs(MutatedLivingSolder.getFluid(2304))
        // .fluidInputs(Periodicium.getPlasma(576))
        // .fluidInputs(Shirabon.getFluid(144))
        // .output(SENSOR_OpV)
        // .stationResearch(b -> b
        // .researchStack(SENSOR_UXV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[UXV]))
        // .duration(30 * 100).EUt(VA[UXV]).buildAndRegister();
        //
        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(frameGt, Shirabon)
        // .input(ELECTRIC_MOTOR_MAX)
        // .input(plate, Shirabon, 4)
        // .input(QUANTIUM_STAR, 4)
        // .input(circuit, Tier.MAX, 2)
        // .input(foil, Shirabon, 64)
        // .input(foil, Floppa, 32)
        // .input(wireGtSingle, Floppa, 4)
        // .fluidInputs(MutatedLivingSolder.getFluid(9216))
        // .fluidInputs(MultiversalAlloy.getFluid(2304))
        // .fluidInputs(TransResidue.getFluid(64000))
        // .output(SENSOR_MAX)
        // .stationResearch(b -> b
        // .researchStack(SENSOR_OpV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[OpV]))
        // .duration(30 * 300).EUt(VA[OpV]).buildAndRegister();

        // Emitters

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium)
                .input(ELECTRIC_MOTOR_UHV)
                .input(stickLong, Neutronium, 6)
                .input(stickLong, VibraniumAlloy, 6)
                .input(GRAVI_STAR, 2)
                .input(circuit, Tier.UHV, 2)
                .input(foil, Hihiirokane, 64)
                .input(foil, Hihiirokane, 64)
                .input(foil, Hihiirokane, 64)
                .input(cableGtSingle, Hihiirokane, 6)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 4))
                .fluidInputs(CondensedStarMatter.getFluid(1000))
                .output(EMITTER_UHV)
                .stationResearch(b -> b
                        .researchStack(EMITTER_UV.getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(30 * 20).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, AbyssalAlloy)
                .input(ELECTRIC_MOTOR_UEV)
                .input(stickLong, HalkoniteSteel, 8)
                .input(stickLong, AbyssalAlloy, 8)
                .input(QUANTIUM_STAR, 2)
                .input(circuit, Tier.UEV, 2)
                .input(foil, Quantium40, 64)
                .input(foil, Quantium40, 64)
                .input(foil, Quantium40, 64)
                .input(foil, Quantium40, 64)
                .input(cableGtSingle, Quantium40, 8)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 8))
                .fluidInputs(AbyssalAlloy.getFluid(144 * 4))
                .output(EMITTER_UEV)
                .stationResearch(b -> b
                        .researchStack(EMITTER_UHV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UHV]))
                .duration(30 * 30).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, DeepDarkSteel)
                .input(ELECTRIC_MOTOR_UIV)
                .input(stickLong, DeepDarkSteel, 10)
                .input(stickLong, AwakenedDraconium, 10)
                .input(QUANTIUM_STAR, 4)
                .input(circuit, Tier.UIV, 2)
                .input(foil, Infinity, 64)
                .input(foil, Infinity, 64)
                .input(foil, Infinity, 64)
                .input(foil, Infinity, 64)
                .input(foil, Infinity, 64)
                .input(wireGtSingle, Hypogen, 10)
                .fluidInputs(SentientNanobots.getFluid(144 * 8))
                .fluidInputs(Infinity.getFluid(576))
                .output(EMITTER_UIV)
                .stationResearch(b -> b
                        .researchStack(EMITTER_UEV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UEV]))
                .duration(30 * 45).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Envoite)
                .input(ELECTRIC_MOTOR_UXV)
                .input(stickLong, ExoHalkoniteSteel, 12)
                .input(stickLong, ReissnerNordstromium, 12)
                .input(QUANTIUM_STAR, 6)
                .input(circuit, Tier.UXV, 2)
                .input(foil, Envoite, 64)
                .input(foil, Envoite, 64)
                .input(foil, Envoite, 64)
                .input(foil, Envoite, 64)
                .input(foil, Envoite, 64)
                .input(wireGtSingle, ScUxvSane, 12)
                .fluidInputs(SentientNanobots.getFluid(144 * 16))
                .fluidInputs(Neptunium.getFluid(144 * 16),
                        Realitium.getFluid(100))
                .output(EMITTER_UXV)
                .stationResearch(b -> b
                        .researchStack(EMITTER_UIV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UIV]))
                .duration(30 * 65).EUt(VA[UIV]).buildAndRegister();

        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(frameGt, Quantum)
        // .input(ELECTRIC_MOTOR_OpV)
        // .input(stickLong, Ledox, 4)
        // .input(QUANTIUM_STAR)
        // .input(circuit, Tier.OpV, 2)
        // .input(foil, Quantium, 64)
        // .input(foil, Infinity, 32)
        // .input(cableGtSingle, Quantium, 4)
        // .fluidInputs(MutatedLivingSolder.getFluid(2304))
        // .fluidInputs(Periodicium.getPlasma(576))
        // .fluidInputs(Shirabon.getFluid(144))
        // .output(EMITTER_OpV)
        // .stationResearch(b -> b
        // .researchStack(EMITTER_UXV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[UXV]))
        // .duration(30 * 100).EUt(VA[UXV]).buildAndRegister();
        //
        // ASSEMBLY_LINE_RECIPES.recipeBuilder()
        // .input(frameGt, Shirabon)
        // .input(ELECTRIC_MOTOR_MAX)
        // .input(stickLong, Shirabon, 4)
        // .input(QUANTIUM_STAR, 4)
        // .input(circuit, Tier.MAX, 2)
        // .input(foil, Shirabon, 64)
        // .input(foil, Floppa, 32)
        // .input(wireGtSingle, Floppa, 4)
        // .fluidInputs(MutatedLivingSolder.getFluid(9216))
        // .fluidInputs(MultiversalAlloy.getFluid(2304))
        // .fluidInputs(TransResidue.getFluid(64000))
        // .output(EMITTER_MAX)
        // .stationResearch(b -> b
        // .researchStack(EMITTER_OpV.getStackForm())
        // .CWUt(128)
        // .EUt(VA[OpV]))
        // .duration(30 * 300).EUt(VA[OpV]).buildAndRegister();
    }
}
