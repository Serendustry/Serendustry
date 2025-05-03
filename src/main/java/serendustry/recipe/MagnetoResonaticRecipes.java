package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static serendustry.item.SerendustryMetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;

import gregtech.api.metatileentity.multiblock.CleanroomType;

public class MagnetoResonaticRecipes {

    public static void init() {
        waferRecipes();
        circuitRecipes();
    }

    private static void waferRecipes() {
        LATHE_RECIPES.recipeBuilder()
                .input(plate, PolyvinylChloride)
                .output(lens, PolyvinylChloride).output(dustSmall, PolyvinylChloride)
                .duration(1200).EUt(120).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, MagnetoResonatic, 32)
                .input(dust, Quartzite, 8)
                .fluidInputs(Nitrogen.getFluid(8000))
                .output(MAGNETO_RESONATIC_BOULE)
                .blastFurnaceTemp(2484)
                .duration(48000).EUt(VA[HV]).buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(MAGNETO_RESONATIC_BOULE)
                .output(MAGNETO_RESONATIC_WAFER, 16)
                .cleanroom(CleanroomType.CLEANROOM)
                .duration(2400).EUt(VA[HV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(MAGNETO_RESONATIC_WAFER)
                .notConsumable(lens, MagnetoResonatic)
                .notConsumable(lens, AnimalWaste)
                .notConsumable(lens, PolyvinylChloride)
                .output(RESONANCE_WAFER)
                .cleanroom(CleanroomType.CLEANROOM)
                .duration(2400).EUt(VA[HV]).buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(RESONANCE_WAFER)
                .output(RESONANCE_CHIP, 4)
                .cleanroom(CleanroomType.CLEANROOM)
                .duration(2400).EUt(VA[HV]).buildAndRegister();
    }

    private static void circuitRecipes() {
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(GOOD_CIRCUIT_BOARD)
                .input(RESONANCE_CHIP, 2)
                .input(foil, Oxygen)
                .input(foil, RealCupronickel)
                .input(wireFine, Thaumium)
                .input(ring, GalliumYttrium)
                .fluidInputs(MagnetoResonatic.getFluid(72))
                .output(MAGNETO_RESONATIC_ULV)
                .duration(1000).EUt(VA[LV]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(PLASTIC_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_ULV, 4)
                .input(wireFine, TinAlloy, 2)
                .input(SMD_RESISTOR, 2)
                .input(SMD_TRANSISTOR, 2)
                .input(SMD_CAPACITOR, 2)
                .fluidInputs(MagnetoResonatic.getFluid(144))
                .output(MAGNETO_RESONATIC_LV)
                .duration(1000).EUt(VA[MV]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(PLASTIC_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_LV, 4)
                .input(wireFine, TinAlloy, 4)
                .input(SMD_RESISTOR, 4)
                .input(SMD_TRANSISTOR, 4)
                .input(SMD_CAPACITOR, 4)
                .fluidInputs(MagnetoResonatic.getFluid(144 + 72))
                .output(MAGNETO_RESONATIC_MV)
                .duration(1000).EUt(VA[HV]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(ADVANCED_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_MV, 4)
                .input(wireFine, TinAlloy, 8)
                .input(SMD_RESISTOR, 8)
                .input(SMD_TRANSISTOR, 8)
                .input(SMD_CAPACITOR, 8)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 2))
                .output(MAGNETO_RESONATIC_HV)
                .duration(1000).EUt(VA[EV]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(EXTREME_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_HV, 4)
                .input(plate, Technetium22, 4)
                .input(wireFine, TinAlloy, 16)
                .input(SMD_RESISTOR, 16)
                .input(SMD_TRANSISTOR, 16)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 3))
                .output(MAGNETO_RESONATIC_EV)
                .duration(1000).EUt(VA[IV]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(EXTREME_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_EV, 4)
                .input(wireFine, TinAlloy, 32)
                .input(ADVANCED_SMD_RESISTOR, 16)
                .input(ADVANCED_SMD_TRANSISTOR, 16)
                .input(ADVANCED_SMD_CAPACITOR, 16)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 4))
                .output(MAGNETO_RESONATIC_IV)
                .duration(1000).EUt(VA[LuV]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(ELITE_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_IV, 4)
                .input(plate, HighDurabilityCompoundSteel, 4)
                .input(wireFine, TinAlloy, 64)
                .input(ADVANCED_SMD_RESISTOR, 24)
                .input(ADVANCED_SMD_TRANSISTOR, 24)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 6))
                .output(MAGNETO_RESONATIC_LuV)
                .duration(1000).EUt(VA[ZPM]).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(ELITE_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_LuV, 4)
                .input(wireFine, TinAlloy, 64)
                .input(plate, MagneticHAMAlloy, 4)
                .input(ADVANCED_SMD_TRANSISTOR, 32)
                .input(ADVANCED_SMD_CAPACITOR, 32)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 8))
                .output(MAGNETO_RESONATIC_ZPM)
                .duration(1000).EUt(VA[UV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Tritanium)
                .input(WETWARE_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_ZPM, 4)
                .input(RESONANCE_CHIP, 4)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, CheeseAmerican, 32)
                .input(wireFine, HastelloyX78)
                .input(plate, TengamAttuned, 8)
                .input(plate, WroughtNeutronium, 8)
                .input(ring, EnrichedTeflon, 8)
                .input(wireGtOctal, EnrichedNaquadahTriniumEuropiumDuranide, 4)
                .input(ADVANCED_SMD_RESISTOR, 32)
                .input(ADVANCED_SMD_TRANSISTOR, 32)
                .input(ADVANCED_SMD_CAPACITOR, 32)
                .input(ADVANCED_SMD_DIODE, 32)
                .input(ADVANCED_SMD_INDUCTOR, 32)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 12))
                .fluidInputs(TinAlloy.getFluid(144 * 6))
                .fluidInputs(AnimalWaste.getFluid(144 * 4))
                .fluidInputs(FluxedElectrum.getFluid(144 * 4))
                .output(MAGNETO_RESONATIC_UV)
                .duration(10000).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium)
                .input(WETWARE_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_UV, 4)
                .input(RESONANCE_CHIP, 4)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, CheeseMozzarella, 64)
                .input(plate, Lafium, 8)
                .input(plate, Pikyonium, 8)
                .input(round, Arcanite)
                .input(ring, EnrichedTeflon, 16)
                .input(wireGtOctal, RutheniumTriniumAmericiumNeutronate, 4)
                .input(SUPREME_SMD_RESISTOR, 16)
                .input(SUPREME_SMD_TRANSISTOR, 16)
                .input(SUPREME_SMD_CAPACITOR, 16)
                .input(SUPREME_SMD_DIODE, 16)
                .input(SUPREME_SMD_INDUCTOR, 16)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 16))
                .fluidInputs(TinAlloy.getFluid(144 * 8))
                .fluidInputs(AnimalWaste.getFluid(144 * 6))
                .fluidInputs(SuperheavySolderingAlloy.getFluid(144 * 12))
                .output(MAGNETO_RESONATIC_UHV)
                .duration(15000).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HastelloyK243)
                .input(COSMIC_CIRCUIT_BOARD)
                .input(MAGNETO_RESONATIC_UHV, 4)
                .input(RESONANCE_CHIP, 8)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, CheeseSwiss, 64)
                .input(plate, NobleGases, 8)
                .input(plate, KerrBlackHole, 8)
                .input(MYSTERIOUS_BLOB_KRYPTON, 16)
                .input(ring, EnrichedTeflon, 24)
                .input(wireGtOctal, ScUev, 4)
                .input(SUPREME_SMD_RESISTOR, 24)
                .input(SUPREME_SMD_TRANSISTOR, 24)
                .input(SUPREME_SMD_CAPACITOR, 24)
                .input(SUPREME_SMD_DIODE, 24)
                .input(SUPREME_SMD_INDUCTOR, 24)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 24))
                .fluidInputs(TinAlloy.getFluid(144 * 12))
                .fluidInputs(AnimalWaste.getFluid(144 * 8))
                .fluidInputs(Tairitsu.getFluid(144 * 12))
                .output(MAGNETO_RESONATIC_UEV)
                .duration(20000).EUt(VA[UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder() // todo: Doesn't work
                .input(frameGt, Enderiiium, 2)
                .input(COSMIC_CIRCUIT_BOARD, 2)
                .input(MAGNETO_RESONATIC_UEV, 4)
                .input(RESONANCE_CHIP, 16)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, CallistoIce, 64)
                .input(wireFine, CheeseCheddar, 64)
                .input(plate, PreciousMetals, 8)
                .input(plate, PartialSuperheavies, 8)
                .input(ring, EnrichedTeflon, 32)
                .input(wireGtOctal, ScUiv, 4)
                .input(SUPREME_SMD_RESISTOR, 32)
                .input(SUPREME_SMD_TRANSISTOR, 32)
                .input(SUPREME_SMD_CAPACITOR, 32)
                .input(SUPREME_SMD_DIODE, 32)
                .input(SUPREME_SMD_INDUCTOR, 32)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 32))
                .fluidInputs(TinAlloy.getFluid(144 * 16))
                .fluidInputs(AnimalWaste.getFluid(144 * 12))
                .fluidInputs(OmniversalLubricant.getPlasma(1000))
                .output(MAGNETO_RESONATIC_UIV)
                .duration(20000).EUt(VA[UXV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, InfinityCatalyst, 4)
                .input(COSMIC_CIRCUIT_BOARD, 4)
                .input(MAGNETO_RESONATIC_UIV, 4)
                .input(RESONANCE_CHIP, 24)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, CheeseAmerican, 64)
                .input(plate, Superheavies, 16)
                .input(plate, Bedrockium, 16)
                .input(ring, EnrichedTeflon, 48)
                .input(wireGtOctal, ScUxv, 4)
                .input(SUPREME_SMD_RESISTOR, 40)
                .input(SUPREME_SMD_TRANSISTOR, 40)
                .input(SUPREME_SMD_CAPACITOR, 40)
                .input(SUPREME_SMD_DIODE, 40)
                .input(SUPREME_SMD_INDUCTOR, 40)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 48))
                .fluidInputs(TinAlloy.getFluid(144 * 24))
                .fluidInputs(AnimalWaste.getFluid(144 * 16))
                .fluidInputs(MutatedLivingSolder.getFluid(144 * 16))
                .output(MAGNETO_RESONATIC_UXV)
                .duration(20000).EUt(VA[OpV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Quantum, 8)
                .input(COSMIC_CIRCUIT_BOARD, 8)
                .input(MAGNETO_RESONATIC_UXV, 4)
                .input(RESONANCE_CHIP, 32)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, Quantium, 64)
                .input(wireFine, CheeseSwiss, 64)
                .input(plate, Periodicium, 32)
                .input(plate, Ledox, 32)
                .input(ring, EnrichedTeflon, 64)
                .input(wireGtOctal, ScOpv, 4)
                .input(SUPREME_SMD_RESISTOR, 48)
                .input(SUPREME_SMD_TRANSISTOR, 48)
                .input(SUPREME_SMD_CAPACITOR, 48)
                .input(SUPREME_SMD_DIODE, 48)
                .input(SUPREME_SMD_INDUCTOR, 48)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 64))
                .fluidInputs(TinAlloy.getFluid(144 * 32))
                .fluidInputs(AnimalWaste.getFluid(144 * 24))
                .fluidInputs(Periodicium.getFluid(144 * 8))
                .output(MAGNETO_RESONATIC_OpV)
                .duration(25000).EUt(VA[MAX]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, MultiversalAlloy, 64)
                .input(COSMIC_CIRCUIT_BOARD, 64)
                .input(MAGNETO_RESONATIC_OpV, 4)
                .input(RESONANCE_CHIP, 64)
                .input(wireFine, TinAlloy, 64)
                .input(wireFine, Quantium, 64)
                .input(wireFine, CheeseAmerican, 64)
                .input(plate, CondensedCoal, 64)
                .input(plate, ExtremelyUnstableTiberium, 64)
                .input(ring, EnrichedTeflon, 64)
                .input(wireGtHex, Floppa, 64)
                .input(SUPREME_SMD_RESISTOR, 64)
                .input(SUPREME_SMD_TRANSISTOR, 64)
                .input(SUPREME_SMD_CAPACITOR, 64)
                .input(SUPREME_SMD_DIODE, 64)
                .input(SUPREME_SMD_INDUCTOR, 64)
                .fluidInputs(MagnetoResonatic.getFluid(144 * 128))
                .fluidInputs(TinAlloy.getFluid(144 * 64))
                .fluidInputs(AnimalWaste.getFluid(144 * 64))
                .fluidInputs(Shirabon.getFluid(144 * 64))
                .output(MAGNETO_RESONATIC_MAX)
                .duration(150000).EUt(VA[MAX]).buildAndRegister();
    }
}
