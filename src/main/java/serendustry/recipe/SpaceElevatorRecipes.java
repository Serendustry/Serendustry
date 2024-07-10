package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static serendustry.item.SerendustryMetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.SPACE_ELEVATOR;
import static serendustry.machine.SerendustryRecipeMaps.SPACE_ELEVATOR_RECIPES;

import net.minecraft.init.Blocks;

import gregtech.api.recipes.chance.output.ChancedOutputLogic;
import gregtech.api.unification.material.MarkerMaterials;

public class SpaceElevatorRecipes {

    public static void init() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(circuit, MarkerMaterials.Tier.UHV, 1)
                .input(circuit, MarkerMaterials.Tier.UV, 4)
                .input(SENSOR_UV, 2)
                .input(stick, WroughtNeutronium, 16)
                .input(plate, HighDurabilityCompoundSteel, 32)
                .input(bolt, Cinobite, 64)
                .input(screw, Pikyonium, 64)
                .input(wireFine, FluxedElectrum, 64)
                .input(wireFine, FluxedElectrum, 64)
                .input(wireFine, EnrichedNaquadahAlloy, 64)
                .input(wireFine, EnrichedNaquadahAlloy, 64)
                .input(wireGtSingle, EnrichedNaquadahTriniumEuropiumDuranide, 32)
                .fluidInputs(MutatedLivingSolder.getFluid(144 * 12))
                .fluidInputs(Neutronium.getFluid(144 * 4))
                .fluidInputs(Darmstadtium.getFluid(144 * 12))
                .fluidInputs(FluxedElectrum.getFluid(144 * 16))
                .output(SPACE_ELEVATOR)
                .duration(2600).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(circuit, MarkerMaterials.Tier.UV, 2)
                .input(ELECTRIC_MOTOR_UV, 2)
                .input(plate, WroughtNeutronium, 4)
                .input(stick, HighDurabilityCompoundSteel, 8)
                .input(screw, EnrichedNaquadahAlloy, 32)
                .input(wireFine, FluxedElectrum, 32)
                .input(wireFine, Pikyonium, 32)
                .fluidInputs(MutatedLivingSolder.getFluid(144 * 6))
                .fluidInputs(Amogus.getFluid(144 * 8))
                .fluidInputs(Cinobite.getFluid(144 * 6))
                .output(PLANETOID_SCANNING_DRONE, 4)
                .duration(2200).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(circuit, MarkerMaterials.Tier.UV, 4)
                .input(ELECTRIC_MOTOR_UV, 4)
                .input(plate, WroughtNeutronium, 8)
                .input(stick, HighDurabilityCompoundSteel, 16)
                .input(screw, EnrichedNaquadahAlloy, 64)
                .input(wireFine, Cinobite, 64)
                .input(wireFine, Pikyonium, 64)
                .fluidInputs(MutatedLivingSolder.getFluid(144 * 12))
                .fluidInputs(Amogus.getFluid(144 * 16))
                .fluidInputs(FluxedElectrum.getFluid(144 * 12))
                .output(STAR_SCANNING_DRONE, 4)
                .duration(4400).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(circuit, MarkerMaterials.Tier.UV, 4)
                .input(ELECTRIC_MOTOR_UV, 4)
                .input(plate, WroughtNeutronium, 8)
                .input(stick, HighDurabilityCompoundSteel, 16)
                .input(screw, EnrichedNaquadahAlloy, 64)
                .input(wireFine, FluxedElectrum, 64)
                .input(wireFine, Cinobite, 64)
                .fluidInputs(MutatedLivingSolder.getFluid(144 * 12))
                .fluidInputs(Amogus.getFluid(144 * 16))
                .fluidInputs(Pikyonium.getFluid(144 * 12))
                .output(PLANETOID_HARVESTING_DRONE, 4)
                .duration(2200).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(circuit, MarkerMaterials.Tier.UV, 8)
                .input(ELECTRIC_MOTOR_UV, 8)
                .input(plate, WroughtNeutronium, 16)
                .input(stick, HighDurabilityCompoundSteel, 32)
                .input(screw, EnrichedNaquadahAlloy, 64)
                .input(screw, EnrichedNaquadahAlloy, 64)
                .input(wireFine, Pikyonium, 64)
                .input(wireFine, Pikyonium, 64)
                .input(wireFine, Cinobite, 64)
                .input(wireFine, Cinobite, 64)
                .fluidInputs(MutatedLivingSolder.getFluid(144 * 24))
                .fluidInputs(Amogus.getFluid(144 * 32))
                .fluidInputs(FluxedElectrum.getFluid(144 * 24))
                .output(STAR_HARVESTING_DRONE, 4)
                .duration(4400).EUt(VA[UHV]).buildAndRegister();

        // todo: planetoids for more ores, fluid drones?

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_SCANNING_DRONE)
                .input(TOOL_DATA_ORB)
                .fluidInputs(RocketFuel.getFluid(1000))
                .chancedOutput(STONE_PLANETOID_DATA, 400, 0)
                .chancedOutput(NETHERRACK_PLANETOID_DATA, 400, 0)
                .chancedOutput(OBSIDIAN_PLANETOID_DATA, 400, 0)
                .chancedOutput(MAGNETITE_PLANETOID_DATA, 500, 0)
                .chancedOutput(CHALCOPYRITE_PLANETOID_DATA, 500, 0)
                .chancedOutput(PYROLUSITE_PLANETOID_DATA, 500, 0)
                .chancedOutput(COAL_PLANETOID_DATA, 600, 0)
                .chancedOutput(GRAPHITE_PLANETOID_DATA, 500, 0)
                .chancedOutput(CASSITERITE_PLANETOID_DATA, 500, 0)
                .chancedOutput(APATITE_PLANETOID_DATA, 400, 0)
                .chancedOutput(NICKEL_PLANETOID_DATA, 500, 0)
                .chancedOutput(COOPERITE_PLANETOID_DATA, 400, 0)
                .chancedOutput(MONAZITE_PLANETOID_DATA, 400, 0)
                .chancedOutput(NAQUADAH_PLANETOID_DATA, 400, 0)
                .chancedOutput(GALENA_PLANETOID_DATA, 500, 0)
                .chancedOutput(TENGAM_PLANETOID_DATA, 1000, 0) // More common due to being important
                .chancedOutput(CHEESE_PLANETOID_DATA, 500, 0)
                .chancedOutput(GEM_PLANETOID_DATA, 400, 0)
                .chancedOutput(SALT_PLANETOID_DATA, 400, 0)
                .chancedOutput(LAPIS_PLANETOID_DATA, 400, 0)
                .chancedOutput(PITCHBLENDE_PLANETOID_DATA, 500, 0)
                .chancedOutput(QUARTZ_PLANETOID_DATA, 400, 0)
                .chancedOutputLogic(ChancedOutputLogic.XOR)
                .duration(10000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_SCANNING_DRONE)
                .input(TOOL_DATA_ORB)
                .fluidInputs(RocketFuel.getFluid(1000))
                .chancedOutput(YELLOW_DWARF_STAR_DATA, 1900, 0)
                .chancedOutput(RED_DWARF_STAR_DATA, 1800, 0)
                .chancedOutput(RED_GIANT_STAR_DATA, 1200, 0)
                .chancedOutput(RED_SUPERGIANT_STAR_DATA, 1000, 0)
                .chancedOutput(BLUE_GIANT_STAR_DATA, 900, 0)
                .chancedOutput(WHITE_DWARF_STAR_DATA, 800, 0)
                .chancedOutput(BROWN_DWARF_STAR_DATA, 1000, 0)
                .chancedOutput(BLACK_DWARF_STAR_DATA, 500, 0)
                .chancedOutput(NEUTRON_STAR_DATA, 500, 0)
                .chancedOutput(PULSAR_STAR_DATA, 400, 0)
                .chancedOutputLogic(ChancedOutputLogic.XOR)
                .duration(15000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(STONE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(100))
                .output(Blocks.STONE, 64 * 24)
                .duration(100).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(NETHERRACK_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(100))
                .output(Blocks.NETHERRACK, 64 * 24)
                .duration(100).EUt(VA[UV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(OBSIDIAN_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(1000))
                .output(Blocks.OBSIDIAN, 64 * 24)
                .duration(2000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(MAGNETITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Magnetite, 64 * 20)
                .output(ore, VanadiumMagnetite, 64 * 4)
                .output(ore, Gold, 64 * 4)
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(CHALCOPYRITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Chalcopyrite, 64 * 16)
                .output(ore, Zeolite, 64 * 4)
                .output(ore, Cassiterite, 64 * 4)
                .output(ore, Realgar, 64 * 4)
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(PYROLUSITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Pyrolusite, 64 * 16)
                .output(ore, Tantalite, 64 * 4)
                .output(ore, Spessartine, 64 * 4)
                .output(ore, Grossular, 64 * 4)
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(COAL_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(5000))
                .output(ore, Coal, 64 * 6)
                .output(ore, LigniteCoal, 64 * 6)
                .output(ore, AnthraciteCoal, 64 * 4)
                .output(ore, BituminousCoal, 64 * 4)
                .output(ore, SubBituminousCoal, 64 * 4)
                .output(ore, PeatCoal, 64 * 4)
                .duration(6000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(GRAPHITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Graphite, 64 * 20)
                .output(ore, Diamond, 64 * 4)
                .output(ore, Coal, 64 * 4)
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(CASSITERITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Cassiterite, 64 * 16)
                .output(ore, Tin, 64 * 12)
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(APATITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Apatite, 64 * 6)
                .output(ore, TricalciumPhosphate, 64 * 6)
                .output(ore, Pyrochlore, 64 * 6)
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(NICKEL_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Nickel, 64 * 12)
                .output(ore, Garnierite, 64 * 8)
                .output(ore, Cobaltite, 64 * 4)
                .output(ore, Pentlandite, 64 * 4)
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(COOPERITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .output(ore, Cooperite, 64 * 10)
                .output(ore, Platinum, 64 * 8)
                .output(ore, Palladium, 64 * 6)
                .output(ore, Bornite, 64 * 4)
                .duration(16000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(MONAZITE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .output(ore, Monazite, 64 * 12)
                .output(ore, Bastnasite, 64 * 12)
                .output(ore, Neodymium, 64 * 4)
                .duration(16000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(NAQUADAH_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(30000))
                .output(ore, Naquadah, 64 * 24)
                .output(ore, Plutonium239, 64 * 4)
                .duration(24000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(GALENA_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Galena, 64 * 16)
                .output(ore, Silver, 64 * 6)
                .output(ore, Lead, 64 * 6)
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(TENGAM_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(60000))
                .output(ore, Iron, 64 * 16)
                .output(ore, Neodymium, 64 * 6)
                .output(ore, Samarium, 64 * 5)
                .output(ore, TengamRaw, 64)
                .duration(48000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(CHEESE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(5000))
                .output(ore, CheeseCheddar, 64 * 7)
                .output(ore, CheeseAmerican, 64 * 7)
                .output(ore, CheeseSwiss, 64 * 7)
                .output(ore, CheeseMozzarella, 64 * 7)
                .duration(6000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(GEM_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, GarnetRed, 64 * 2)
                .output(ore, GarnetYellow, 64 * 2)
                .output(ore, Amethyst, 64 * 2)
                .output(ore, Opal, 64 * 2)
                .output(ore, Emerald, 64 * 2)
                .output(ore, Ruby, 64 * 2)
                .output(ore, Olivine, 64 * 2)
                .output(ore, Sapphire, 64 * 2)
                .output(ore, GreenSapphire, 64 * 2)
                .output(ore, GarnetRed, 64 * 2)
                .output(ore, Almandine, 64 * 2)
                .output(ore, Pyrope, 64 * 2)
                .output(ore, Topaz, 64 * 2)
                .output(ore, BlueTopaz, 64 * 2)
                .output(ore, Spessartine, 64 * 2)
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(SALT_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Salt, 64 * 10)
                .output(ore, RockSalt, 64 * 10)
                .output(ore, Lepidolite, 64 * 4)
                .output(ore, Spodumene, 64 * 4)
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(LAPIS_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Lapis, 64 * 8)
                .output(ore, Lazurite, 64 * 8)
                .output(ore, Sodalite, 64 * 8)
                .output(ore, Calcite, 64 * 4)
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(PITCHBLENDE_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, Pitchblende, 64 * 14)
                .output(ore, Uraninite, 64 * 14)
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(PLANETOID_HARVESTING_DRONE)
                .input(QUARTZ_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(10000))
                .output(ore, NetherQuartz, 64 * 8)
                .output(ore, CertusQuartz, 64 * 8)
                .output(ore, Quartzite, 64 * 8)
                .output(ore, Barite, 64 * 4)
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(YELLOW_DWARF_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .fluidOutputs(YellowStarMatter.getFluid(10000))
                .duration(8000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(RED_DWARF_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .fluidOutputs(RedStarMatter.getFluid(10000))
                .duration(8000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(RED_GIANT_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(40000))
                .fluidOutputs(RedStarMatter.getFluid(80000))
                .duration(20000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(RED_SUPERGIANT_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(80000))
                .fluidOutputs(RedStarMatter.getFluid(640000))
                .duration(24000).EUt(VA[UEV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(BLUE_GIANT_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(40000))
                .fluidOutputs(BlueStarMatter.getFluid(80000))
                .duration(20000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(WHITE_DWARF_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .fluidOutputs(WhiteStarMatter.getFluid(10000))
                .duration(8000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(BROWN_DWARF_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .fluidOutputs(BrownStarMatter.getFluid(10000))
                .duration(8000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(BLACK_DWARF_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(20000))
                .fluidOutputs(BlackStarMatter.getFluid(10000))
                .duration(8000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(NEUTRON_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(35000))
                .fluidOutputs(Neutronium.getFluid(144 * 64))
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SPACE_ELEVATOR_RECIPES.recipeBuilder()
                .input(STAR_HARVESTING_DRONE)
                .input(PULSAR_STAR_DATA)
                .fluidInputs(RocketFuel.getFluid(80000))
                .fluidOutputs(PulsarStarMatter.getFluid(10000))
                .duration(24000).EUt(VA[UEV]).buildAndRegister();
    }
}
