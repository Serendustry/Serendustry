package serendustry.recipe;

import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.Almandine;
import static gregtech.api.unification.material.Materials.Americium;
import static gregtech.api.unification.material.Materials.Amethyst;
import static gregtech.api.unification.material.Materials.Apatite;
import static gregtech.api.unification.material.Materials.Barite;
import static gregtech.api.unification.material.Materials.Bastnasite;
import static gregtech.api.unification.material.Materials.BlueTopaz;
import static gregtech.api.unification.material.Materials.Bornite;
import static gregtech.api.unification.material.Materials.Calcite;
import static gregtech.api.unification.material.Materials.Cassiterite;
import static gregtech.api.unification.material.Materials.CertusQuartz;
import static gregtech.api.unification.material.Materials.Chalcopyrite;
import static gregtech.api.unification.material.Materials.Coal;
import static gregtech.api.unification.material.Materials.Cobaltite;
import static gregtech.api.unification.material.Materials.Cooperite;
import static gregtech.api.unification.material.Materials.Diamond;
import static gregtech.api.unification.material.Materials.Emerald;
import static gregtech.api.unification.material.Materials.EnrichedNaquadahTriniumEuropiumDuranide;
import static gregtech.api.unification.material.Materials.Europium;
import static gregtech.api.unification.material.Materials.Galena;
import static gregtech.api.unification.material.Materials.GarnetRed;
import static gregtech.api.unification.material.Materials.GarnetYellow;
import static gregtech.api.unification.material.Materials.Garnierite;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.Graphite;
import static gregtech.api.unification.material.Materials.GreenSapphire;
import static gregtech.api.unification.material.Materials.Grossular;
import static gregtech.api.unification.material.Materials.Iron;
import static gregtech.api.unification.material.Materials.Lapis;
import static gregtech.api.unification.material.Materials.Lazurite;
import static gregtech.api.unification.material.Materials.Lead;
import static gregtech.api.unification.material.Materials.Lepidolite;
import static gregtech.api.unification.material.Materials.Magnetite;
import static gregtech.api.unification.material.Materials.Monazite;
import static gregtech.api.unification.material.Materials.Naquadah;
import static gregtech.api.unification.material.Materials.NaquadahAlloy;
import static gregtech.api.unification.material.Materials.Naquadria;
import static gregtech.api.unification.material.Materials.Neodymium;
import static gregtech.api.unification.material.Materials.NetherQuartz;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Nickel;
import static gregtech.api.unification.material.Materials.Olivine;
import static gregtech.api.unification.material.Materials.Opal;
import static gregtech.api.unification.material.Materials.Palladium;
import static gregtech.api.unification.material.Materials.Pentlandite;
import static gregtech.api.unification.material.Materials.Pitchblende;
import static gregtech.api.unification.material.Materials.Platinum;
import static gregtech.api.unification.material.Materials.Plutonium239;
import static gregtech.api.unification.material.Materials.Pyrochlore;
import static gregtech.api.unification.material.Materials.Pyrolusite;
import static gregtech.api.unification.material.Materials.Pyrope;
import static gregtech.api.unification.material.Materials.Quartzite;
import static gregtech.api.unification.material.Materials.Realgar;
import static gregtech.api.unification.material.Materials.Redstone;
import static gregtech.api.unification.material.Materials.RockSalt;
import static gregtech.api.unification.material.Materials.RocketFuel;
import static gregtech.api.unification.material.Materials.Ruby;
import static gregtech.api.unification.material.Materials.Salt;
import static gregtech.api.unification.material.Materials.Samarium;
import static gregtech.api.unification.material.Materials.Sapphire;
import static gregtech.api.unification.material.Materials.Silver;
import static gregtech.api.unification.material.Materials.Sodalite;
import static gregtech.api.unification.material.Materials.Spessartine;
import static gregtech.api.unification.material.Materials.Spodumene;
import static gregtech.api.unification.material.Materials.Tantalite;
import static gregtech.api.unification.material.Materials.Tin;
import static gregtech.api.unification.material.Materials.Topaz;
import static gregtech.api.unification.material.Materials.TricalciumPhosphate;
import static gregtech.api.unification.material.Materials.Tritanium;
import static gregtech.api.unification.material.Materials.Uraninite;
import static gregtech.api.unification.material.Materials.VanadiumMagnetite;
import static gregtech.api.unification.material.Materials.Zeolite;
import static gregtech.api.unification.ore.OrePrefix.cableGtQuadruple;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.ore;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.api.unification.ore.OrePrefix.screw;
import static gregtech.api.unification.ore.OrePrefix.stick;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.api.unification.ore.OrePrefix.toolHeadDrill;
import static gregtech.api.unification.ore.OrePrefix.wireFine;
import static gregtech.api.unification.ore.OrePrefix.wireGtQuadruple;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_UEV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_ZPM;
import static gregtech.common.items.MetaItems.EMITTER_ZPM;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UEV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_ZPM;
import static gregtech.common.items.MetaItems.SENSOR_UEV;
import static gregtech.common.items.MetaItems.SENSOR_UHV;
import static gregtech.common.items.MetaItems.SENSOR_ZPM;
import static gregtech.common.items.MetaItems.TOOL_DATA_MODULE;
import static serendustry.item.SerendustryMetaItems.APATITE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.AZBANTIUM_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.BLACK_DWARF_STAR_DATA;
import static serendustry.item.SerendustryMetaItems.BLUE_GIANT_STAR_DATA;
import static serendustry.item.SerendustryMetaItems.BROWN_DWARF_STAR_DATA;
import static serendustry.item.SerendustryMetaItems.CASSITERITE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.CHALCOPYRITE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.CHEESE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.COAL_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.COOPERITE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.DEEP_DARK_HARVESTING_DRONE;
import static serendustry.item.SerendustryMetaItems.DEEP_DARK_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.DEEP_DARK_SCANNING_DRONE;
import static serendustry.item.SerendustryMetaItems.DRACONIUM_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.END_STONE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.EXOTIC_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.GALENA_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.GEM_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.GRAPHITE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.LAPIS_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.MAGNETITE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.MONAZITE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.NAQUADAH_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.NETHERITE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.NETHERRACK_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.NEUTRON_STAR_DATA;
import static serendustry.item.SerendustryMetaItems.NICKEL_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.OBSIDIAN_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.PITCHBLENDE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.PLANETOID_HARVESTING_DRONE;
import static serendustry.item.SerendustryMetaItems.PLANETOID_SCANNING_DRONE;
import static serendustry.item.SerendustryMetaItems.PLANETOID_SCANNING_DRONE_MK_2;
import static serendustry.item.SerendustryMetaItems.PULSAR_STAR_DATA;
import static serendustry.item.SerendustryMetaItems.PYROLUSITE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.QUARTZ_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.REDSTONE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.RED_DWARF_STAR_DATA;
import static serendustry.item.SerendustryMetaItems.RED_GIANT_STAR_DATA;
import static serendustry.item.SerendustryMetaItems.RED_SUPERGIANT_STAR_DATA;
import static serendustry.item.SerendustryMetaItems.SALT_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.SPACEWEED;
import static serendustry.item.SerendustryMetaItems.STAR_HARVESTING_DRONE;
import static serendustry.item.SerendustryMetaItems.STAR_SCANNING_DRONE;
import static serendustry.item.SerendustryMetaItems.STONE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.TENGAM_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.TIBERIUM_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.VIBRANITE_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.WHITE_DWARF_STAR_DATA;
import static serendustry.item.SerendustryMetaItems.XENOTIME_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.YELLOW_DWARF_STAR_DATA;
import static serendustry.item.material.SerendustryMaterials.AbyssalAlloy;
import static serendustry.item.material.SerendustryMaterials.Adamantium;
import static serendustry.item.material.SerendustryMaterials.AnthraciteCoal;
import static serendustry.item.material.SerendustryMaterials.AwakenedDraconium;
import static serendustry.item.material.SerendustryMaterials.Azbantium;
import static serendustry.item.material.SerendustryMaterials.BituminousCoal;
import static serendustry.item.material.SerendustryMaterials.BlackStarMatter;
import static serendustry.item.material.SerendustryMaterials.BlueStarMatter;
import static serendustry.item.material.SerendustryMaterials.Bromargyrite;
import static serendustry.item.material.SerendustryMaterials.BrownStarMatter;
import static serendustry.item.material.SerendustryMaterials.CheeseAmerican;
import static serendustry.item.material.SerendustryMaterials.CheeseCheddar;
import static serendustry.item.material.SerendustryMaterials.CheeseMozzarella;
import static serendustry.item.material.SerendustryMaterials.CheeseSwiss;
import static serendustry.item.material.SerendustryMaterials.Crookesite;
import static serendustry.item.material.SerendustryMaterials.Draconium;
import static serendustry.item.material.SerendustryMaterials.HalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.HighGradeSolderingAlloy;
import static serendustry.item.material.SerendustryMaterials.Hihiirokane;
import static serendustry.item.material.SerendustryMaterials.LigniteCoal;
import static serendustry.item.material.SerendustryMaterials.MolybdeniteLubricant;
import static serendustry.item.material.SerendustryMaterials.Netherite;
import static serendustry.item.material.SerendustryMaterials.NetheritePoorAncientDebris;
import static serendustry.item.material.SerendustryMaterials.NetheriteRichAncientDebris;
import static serendustry.item.material.SerendustryMaterials.NeutronStarMatter;
import static serendustry.item.material.SerendustryMaterials.Olsacherite;
import static serendustry.item.material.SerendustryMaterials.Originite;
import static serendustry.item.material.SerendustryMaterials.Originium;
import static serendustry.item.material.SerendustryMaterials.PeatCoal;
import static serendustry.item.material.SerendustryMaterials.PulsarStarMatter;
import static serendustry.item.material.SerendustryMaterials.RawAncientDebris;
import static serendustry.item.material.SerendustryMaterials.RedStarMatter;
import static serendustry.item.material.SerendustryMaterials.Renierite;
import static serendustry.item.material.SerendustryMaterials.Rheniite;
import static serendustry.item.material.SerendustryMaterials.SelfRepairingNanobots;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.item.material.SerendustryMaterials.SubBituminousCoal;
import static serendustry.item.material.SerendustryMaterials.TengamRaw;
import static serendustry.item.material.SerendustryMaterials.TiberiumAboreus;
import static serendustry.item.material.SerendustryMaterials.TiberiumCruentus;
import static serendustry.item.material.SerendustryMaterials.TiberiumRiparius;
import static serendustry.item.material.SerendustryMaterials.TiberiumVinifera;
import static serendustry.item.material.SerendustryMaterials.Vibranite;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;
import static serendustry.item.material.SerendustryMaterials.WhiteStarMatter;
import static serendustry.item.material.SerendustryMaterials.Xenotime;
import static serendustry.item.material.SerendustryMaterials.YellowStarMatter;
import static serendustry.machine.SerendustryMetaTileEntities.SPACE_ELEVATOR;
import static serendustry.machine.SerendustryRecipeMaps.SPACE_ELEVATOR_RECIPES;

import net.minecraft.init.Blocks;

import gregtech.api.unification.material.MarkerMaterials;
import gregtech.common.metatileentities.MetaTileEntities;
import serendustry.blocks.SBlockMultiCasing;
import serendustry.blocks.SerendustryMetaBlocks;

public class SpaceElevatorRecipes {

    public static void init() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.S_MULTI_CASING.getItemVariant(
                        SBlockMultiCasing.SMultiCasingType.SPACE_ELEVATOR, 4))
                .input(circuit, MarkerMaterials.Tier.UHV, 16)
                .input(circuit, MarkerMaterials.Tier.UV, 64)
                .input(SENSOR_ZPM, 32)
                .input(plateDense, Adamantium, 8)
                .input(plate, Tritanium, 64)
                .input(screw, Adamantium, 64)
                .input(screw, Adamantium, 64)
                .input(wireGtQuadruple, EnrichedNaquadahTriniumEuropiumDuranide, 64)
                .input(cableGtQuadruple, Hihiirokane, 64)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 64))
                .fluidInputs(MolybdeniteLubricant.getFluid(64000))
                .fluidInputs(Naquadria.getFluid(144 * 64))
                .fluidInputs(Europium.getFluid(144 * 64))
                .output(SPACE_ELEVATOR)
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.S_MULTI_CASING
                                .getItemVariant(SBlockMultiCasing.SMultiCasingType.SPACE_ELEVATOR))
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(9600).EUt(VA[UV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(MetaTileEntities.SCANNER[ZPM])
                .input(circuit, MarkerMaterials.Tier.UV, 1)
                .input(SENSOR_ZPM, 2)
                .input(plate, Adamantium, 16)
                .input(stick, Tritanium, 16)
                .input(screw, Tritanium, 32)
                .input(wireFine, Hihiirokane, 32)
                .input(wireFine, Americium, 32)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 8))
                .output(PLANETOID_SCANNING_DRONE, 48)
                .duration(24000 * 4).EUt(VA[UV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(MetaTileEntities.SCANNER[UV])
                .input(circuit, MarkerMaterials.Tier.UHV, 1)
                .input(SENSOR_UHV, 2)
                .input(plate, VibraniumAlloy, 32)
                .input(stick, Neutronium, 16)
                .input(screw, Neutronium, 32)
                .input(wireFine, Hihiirokane, 32)
                .input(wireFine, Tritanium, 64)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 12))
                .output(PLANETOID_SCANNING_DRONE_MK_2, 48)
                .duration(24000 * 4).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(MetaTileEntities.SCANNER[ZPM])
                .input(circuit, MarkerMaterials.Tier.UV, 1)
                .input(SENSOR_ZPM, 2)
                .input(stickLong, VibraniumAlloy, 16)
                .input(stick, Tritanium, 16)
                .input(screw, Neutronium, 32)
                .input(wireFine, Hihiirokane, 64)
                .input(wireFine, Americium, 64)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 8))
                .output(STAR_SCANNING_DRONE, 48)
                .duration(32000 * 4).EUt(VA[UV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(toolHeadDrill, NaquadahAlloy, 4)
                .input(circuit, MarkerMaterials.Tier.UV, 2)
                .input(ROBOT_ARM_ZPM)
                .input(ELECTRIC_PISTON_ZPM, 4)
                .input(plate, Adamantium, 8)
                .input(screw, Adamantium, 32)
                .input(screw, Tritanium, 64)
                .input(wireFine, Hihiirokane, 32)
                .input(wireFine, Americium, 64)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 16))
                .output(PLANETOID_HARVESTING_DRONE, 4)
                .duration(12000 * 4).EUt(VA[UV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(MetaTileEntities.QUANTUM_TANK[ZPM])
                .input(circuit, MarkerMaterials.Tier.UV, 2)
                .input(EMITTER_ZPM, 8)
                .input(stickLong, Neutronium, 8)
                .input(screw, Neutronium, 32)
                .input(screw, VibraniumAlloy, 32)
                .input(wireFine, Hihiirokane, 32)
                .input(wireFine, Americium, 64)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 8))
                .output(STAR_HARVESTING_DRONE, 4)
                .duration(12000 * 4).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(MetaTileEntities.SCANNER[UEV])
                .input(circuit, MarkerMaterials.Tier.UIV, 1)
                .input(SENSOR_UEV, 4)
                .input(plate, Draconium, 32)
                .input(stick, HalkoniteSteel, 16)
                .input(screw, HalkoniteSteel, 32)
                .input(wireFine, Originium, 32)
                .input(wireFine, AwakenedDraconium, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 12))
                .output(DEEP_DARK_SCANNING_DRONE, 48)
                .duration(48000 * 8).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(toolHeadDrill, AbyssalAlloy, 4)
                .input(circuit, MarkerMaterials.Tier.UEV, 2)
                .input(ROBOT_ARM_UEV)
                .input(ELECTRIC_PISTON_UEV, 4)
                .input(plate, HalkoniteSteel, 8)
                .input(screw, AwakenedDraconium, 64)
                .input(wireFine, Originium, 32)
                .input(wireFine, AwakenedDraconium, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 12))
                .output(DEEP_DARK_HARVESTING_DRONE, 4)
                .duration(24000 * 8).EUt(VA[UEV]).buildAndRegister();

        // todo: planetoids for more ores, fluid drones?

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_SCANNING_DRONE)
                .input(TOOL_DATA_MODULE)
                .fluidInputs(RocketFuel.getFluid(500))
                .chancedOutput(STONE_PLANETOID_DATA, 800, 0)
                .chancedOutput(NETHERRACK_PLANETOID_DATA, 800, 0)
                .chancedOutput(END_STONE_PLANETOID_DATA, 800, 0)
                .chancedOutput(OBSIDIAN_PLANETOID_DATA, 800, 0)
                .chancedOutput(MAGNETITE_PLANETOID_DATA, 500, 0)
                .chancedOutput(CHALCOPYRITE_PLANETOID_DATA, 500, 0)
                .chancedOutput(REDSTONE_PLANETOID_DATA, 500, 0)
                .chancedOutput(PYROLUSITE_PLANETOID_DATA, 500, 0)
                .chancedOutput(COAL_PLANETOID_DATA, 500, 0)
                .chancedOutput(GRAPHITE_PLANETOID_DATA, 500, 0)
                .chancedOutput(CASSITERITE_PLANETOID_DATA, 500, 0)
                .chancedOutput(APATITE_PLANETOID_DATA, 500, 0)
                .chancedOutput(NICKEL_PLANETOID_DATA, 500, 0)
                .chancedOutput(GALENA_PLANETOID_DATA, 500, 0)
                .chancedOutput(CHEESE_PLANETOID_DATA, 500, 0)
                .chancedOutput(GEM_PLANETOID_DATA, 500, 0)
                .chancedOutput(SALT_PLANETOID_DATA, 500, 0)
                .chancedOutput(LAPIS_PLANETOID_DATA, 500, 0)
                .chancedOutput(QUARTZ_PLANETOID_DATA, 500, 0)
                .chancedOutput(NETHERITE_PLANETOID_DATA, 500, 0)
                .chancedOutput(MONAZITE_PLANETOID_DATA, 500, 0)
                .chancedOutput(PITCHBLENDE_PLANETOID_DATA, 300, 0)
                .chancedOutput(COOPERITE_PLANETOID_DATA, 300, 0)
                .chancedOutput(XENOTIME_PLANETOID_DATA, 300, 0)
                .chancedOutput(NAQUADAH_PLANETOID_DATA, 300, 0)
                .chancedOutput(AZBANTIUM_PLANETOID_DATA, 300, 0)
                .chancedOutput(VIBRANITE_PLANETOID_DATA, 300, 0)
                .duration(800).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_SCANNING_DRONE_MK_2)
                .input(TOOL_DATA_MODULE)
                .fluidInputs(RocketFuel.getFluid(1000))
                .chancedOutput(STONE_PLANETOID_DATA, 2000, 0)
                .chancedOutput(NETHERRACK_PLANETOID_DATA, 2000, 0)
                .chancedOutput(END_STONE_PLANETOID_DATA, 2000, 0)
                .chancedOutput(OBSIDIAN_PLANETOID_DATA, 2000, 0)
                .chancedOutput(MAGNETITE_PLANETOID_DATA, 1250, 0)
                .chancedOutput(CHALCOPYRITE_PLANETOID_DATA, 1250, 0)
                .chancedOutput(REDSTONE_PLANETOID_DATA, 1250, 0)
                .chancedOutput(PYROLUSITE_PLANETOID_DATA, 1250, 0)
                .chancedOutput(COAL_PLANETOID_DATA, 1250, 0)
                .chancedOutput(GRAPHITE_PLANETOID_DATA, 1250, 0)
                .chancedOutput(CASSITERITE_PLANETOID_DATA, 1250, 0)
                .chancedOutput(APATITE_PLANETOID_DATA, 1250, 0)
                .chancedOutput(NICKEL_PLANETOID_DATA, 1250, 0)
                .chancedOutput(GALENA_PLANETOID_DATA, 1250, 0)
                .chancedOutput(CHEESE_PLANETOID_DATA, 1250, 0)
                .chancedOutput(GEM_PLANETOID_DATA, 1250, 0)
                .chancedOutput(SALT_PLANETOID_DATA, 1250, 0)
                .chancedOutput(LAPIS_PLANETOID_DATA, 1250, 0)
                .chancedOutput(QUARTZ_PLANETOID_DATA, 1250, 0)
                .chancedOutput(NETHERITE_PLANETOID_DATA, 1250, 0)
                .chancedOutput(MONAZITE_PLANETOID_DATA, 1250, 0)
                .chancedOutput(PITCHBLENDE_PLANETOID_DATA, 1200, 0)
                .chancedOutput(COOPERITE_PLANETOID_DATA, 1200, 0)
                .chancedOutput(XENOTIME_PLANETOID_DATA, 1200, 0)
                .chancedOutput(NAQUADAH_PLANETOID_DATA, 1200, 0)
                .chancedOutput(AZBANTIUM_PLANETOID_DATA, 900, 0)
                .chancedOutput(VIBRANITE_PLANETOID_DATA, 900, 0)
                .chancedOutput(EXOTIC_PLANETOID_DATA, 900, 0)
                .chancedOutput(TIBERIUM_PLANETOID_DATA, 900, 0)
                .chancedOutput(TENGAM_PLANETOID_DATA, 700, 0)
                .chancedOutput(DRACONIUM_PLANETOID_DATA, 500, 0)
                .duration(1600).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(DEEP_DARK_SCANNING_DRONE)
                .input(TOOL_DATA_MODULE)
                .fluidInputs(RocketFuel.getFluid(100000))
                .output(DEEP_DARK_PLANETOID_DATA)
                .duration(6000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_SCANNING_DRONE)
                .input(TOOL_DATA_MODULE)
                .fluidInputs(RocketFuel.getFluid(500))
                .chancedOutput(YELLOW_DWARF_STAR_DATA, 1600, 0)
                .chancedOutput(RED_DWARF_STAR_DATA, 1050, 0)
                .chancedOutput(RED_GIANT_STAR_DATA, 500, 0)
                .chancedOutput(BLUE_GIANT_STAR_DATA, 800, 0)
                .chancedOutput(WHITE_DWARF_STAR_DATA, 1200, 0)
                .chancedOutput(BROWN_DWARF_STAR_DATA, 1200, 0)
                .chancedOutput(BLACK_DWARF_STAR_DATA, 1150, 0)
                .chancedOutput(NEUTRON_STAR_DATA, 2200, 0)
                .chancedOutput(PULSAR_STAR_DATA, 300, 0)
                .duration(1200).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(STONE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(100))
                .output(Blocks.STONE, 64 * 2048) // total 262144 stone; abt 2.6m per set of mk2 scanners
                .output(Blocks.COBBLESTONE, 64 * 2048)
                .output(SPACEWEED, 1)
                .duration(200).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(NETHERRACK_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(100))
                .output(Blocks.NETHERRACK, 64 * 4096)
                .output(SPACEWEED, 1)
                .duration(200).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(END_STONE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(100))
                .output(Blocks.END_STONE, 64 * 4096)
                .output(SPACEWEED, 1)
                .duration(200).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(OBSIDIAN_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(1000))
                .output(Blocks.OBSIDIAN, 64 * 512)
                .output(SPACEWEED, 20)
                .duration(4000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(MAGNETITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Magnetite, 64 * 64)
                .output(ore, VanadiumMagnetite, 64 * 32)
                .output(ore, Gold, 64 * 16)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(REDSTONE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Redstone, 64 * 128)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(CHALCOPYRITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Chalcopyrite, 64 * 64)
                .output(ore, Zeolite, 64 * 16)
                .output(ore, Cassiterite, 64 * 16)
                .output(ore, Realgar, 64 * 16)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(PYROLUSITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Pyrolusite, 64 * 64)
                .output(ore, Tantalite, 64 * 16)
                .output(ore, Spessartine, 64 * 16)
                .output(ore, Grossular, 64 * 16)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(COAL_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(5000))
                .output(ore, Coal, 64 * 64)
                .output(ore, LigniteCoal, 64 * 64)
                .output(ore, AnthraciteCoal, 64 * 64)
                .output(ore, BituminousCoal, 64 * 64)
                .output(ore, SubBituminousCoal, 64 * 64)
                .output(ore, PeatCoal, 64 * 64)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 30)
                .duration(6000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(GRAPHITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Graphite, 64 * 64)
                .output(ore, Coal, 64 * 16)
                .output(ore, Diamond, 64 * 8)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(CASSITERITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Cassiterite, 64 * 64)
                .output(ore, Tin, 64 * 48)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(APATITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Apatite, 64 * 48)
                .output(ore, TricalciumPhosphate, 64 * 48)
                .output(ore, Pyrochlore, 64 * 48)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(NICKEL_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Nickel, 64 * 48)
                .output(ore, Garnierite, 64 * 32)
                .output(ore, Cobaltite, 64 * 16)
                .output(ore, Pentlandite, 64 * 16)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(COOPERITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .output(ore, Cooperite, 64 * 48)
                .output(ore, Platinum, 64 * 32)
                .output(ore, Palladium, 64 * 16)
                .output(ore, Bornite, 64 * 12)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 80)
                .duration(16000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(MONAZITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .output(ore, Monazite, 64 * 48)
                .output(ore, Bastnasite, 64 * 48)
                .output(ore, Neodymium, 64 * 24)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 80)
                .duration(16000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(NETHERITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .output(ore, RawAncientDebris, 64 * 32)
                .output(ore, NetheritePoorAncientDebris, 64 * 32)
                .output(ore, NetheriteRichAncientDebris, 64 * 16)
                .output(ore, Netherite, 64 * 8)
                .output(Blocks.NETHERRACK, 64 * 256)
                .output(SPACEWEED, 80)
                .duration(16000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(NAQUADAH_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(30000))
                .output(ore, Naquadah, 64 * 64)
                .output(ore, Plutonium239, 64 * 16)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 120)
                .duration(24000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(AZBANTIUM_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(30000))
                .output(ore, Azbantium, 8)
                .output(ore, Graphite, 64 * 64)
                .output(ore, Amethyst, 64 * 16)
                .output(ore, Diamond, 64 * 8)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 120)
                .duration(24000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(VIBRANITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(30000))
                .output(ore, Vibranite, 64)
                .output(ore, Gold, 64 * 32)
                .output(ore, Silver, 64 * 32)
                .output(ore, Diamond, 64 * 8)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 120)
                .duration(24000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(XENOTIME_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(30000))
                .output(ore, Xenotime, 64 * 32)
                .output(ore, Monazite, 64 * 24)
                .output(ore, Bastnasite, 64 * 24)
                .output(ore, Samarium, 64 * 12)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 120)
                .duration(24000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(GALENA_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Galena, 64 * 64)
                .output(ore, Silver, 64 * 24)
                .output(ore, Lead, 64 * 24)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(TENGAM_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(60000))
                .output(ore, Iron, 64 * 64)
                .output(ore, Neodymium, 64 * 24)
                .output(ore, Samarium, 64 * 12)
                .output(ore, Salt, 64 * 24)
                .output(ore, RockSalt, 64 * 24)
                .output(ore, TengamRaw, 64)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 240)
                .duration(24000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(CHEESE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(5000))
                .output(ore, CheeseCheddar, 64 * 8)
                .output(ore, CheeseAmerican, 64 * 8)
                .output(ore, CheeseSwiss, 64 * 8)
                .output(ore, CheeseMozzarella, 64 * 8)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 30)
                .duration(6000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(GEM_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, GarnetRed, 64 * 12)
                .output(ore, GarnetYellow, 64 * 12)
                .output(ore, Amethyst, 64 * 12)
                .output(ore, Opal, 64 * 12)
                .output(ore, Emerald, 64 * 12)
                .output(ore, Ruby, 64 * 12)
                .output(ore, Olivine, 64 * 12)
                .output(ore, Sapphire, 64 * 12)
                .output(ore, GreenSapphire, 64 * 12)
                .output(ore, GarnetRed, 64 * 12)
                .output(ore, Almandine, 64 * 12)
                .output(ore, Pyrope, 64 * 12)
                .output(ore, Topaz, 64 * 12)
                .output(ore, BlueTopaz, 64 * 12)
                .output(ore, Spessartine, 64 * 12)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(SALT_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Salt, 64 * 64)
                .output(ore, RockSalt, 64 * 64)
                .output(ore, Lepidolite, 64 * 16)
                .output(ore, Spodumene, 64 * 16)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(LAPIS_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Lapis, 64 * 32)
                .output(ore, Lazurite, 64 * 32)
                .output(ore, Sodalite, 64 * 32)
                .output(ore, Calcite, 64 * 16)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(PITCHBLENDE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Pitchblende, 64 * 64)
                .output(ore, Uraninite, 64 * 64)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(QUARTZ_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, NetherQuartz, 64 * 32)
                .output(ore, CertusQuartz, 64 * 32)
                .output(ore, Quartzite, 64 * 32)
                .output(ore, Barite, 64 * 16)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 60)
                .duration(12000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(TIBERIUM_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(30000))
                .output(ore, TiberiumRiparius, 64)
                .output(ore, TiberiumVinifera, 64)
                .output(ore, TiberiumCruentus, 64)
                .output(ore, TiberiumAboreus, 64)
                .output(ore, Originite, 16)
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 120) // ~10.7 Originium, or 21.5 Orundum, or 5.4 boules
                .duration(24000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(EXOTIC_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(30000))
                .output(ore, Bromargyrite, 32) // ~32 buckets Bromine, or ~160 ScUevSane, or 10 Positronic Mainframes
                .output(ore, Olsacherite, 32) // ~5.3 Selenium, or 41 BETS Perrhenate, or 205.38 ScUevSane, or 12.8
                                              // Positronic Mainframes
                .output(ore, Crookesite, 16) // ~4.57 Selenium, or ~35 BETS Perrhenate, and ~9.1 Thallium
                .output(ore, Rheniite, 3) // ~2 Rhenium, or ~82 BETS Perrhenate
                .output(ore, Renierite, 64 * 4) // ~22.24 Germanium, or 178 Abyssal Alloy, or 14.8 Positronic Mainframes
                .output(ore, Originite, 8) // ~1.6 Originium, or 3.2 Orundum, or 0.8 boules
                .output(Blocks.STONE, 64 * 256)
                .output(SPACEWEED, 120)
                .duration(24000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(DRACONIUM_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(60000))
                .output(ore, Draconium, 64)
                .output(SPACEWEED, 240)
                .duration(48000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(YELLOW_DWARF_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .fluidOutputs(YellowStarMatter.getFluid(10000))
                .duration(16000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(RED_DWARF_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .fluidOutputs(RedStarMatter.getFluid(10000))
                .duration(16000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(RED_GIANT_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(40000))
                .fluidOutputs(RedStarMatter.getFluid(80000))
                .duration(24000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(RED_SUPERGIANT_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(80000))
                .fluidOutputs(RedStarMatter.getFluid(640000))
                .duration(32000).EUt(VA[UEV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(BLUE_GIANT_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(40000))
                .fluidOutputs(BlueStarMatter.getFluid(80000))
                .duration(40000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(WHITE_DWARF_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .fluidOutputs(WhiteStarMatter.getFluid(10000))
                .duration(16000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(BROWN_DWARF_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .fluidOutputs(BrownStarMatter.getFluid(10000))
                .duration(16000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(BLACK_DWARF_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .fluidOutputs(BlackStarMatter.getFluid(10000))
                .duration(16000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(NEUTRON_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(35000))
                .fluidOutputs(NeutronStarMatter.getFluid(10000))
                .duration(24000).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(PULSAR_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(80000))
                .fluidOutputs(PulsarStarMatter.getFluid(10000))
                .duration(12000).EUt(VA[UEV]).buildAndRegister();
    }
}
