package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gregtech.common.metatileentities.MetaTileEntities.ALLOY_SMELTER;
import static serendustry.item.SerendustryMetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.PLASMA_FOUNDRY;
import static serendustry.machine.SerendustryRecipeMaps.PLASMA_FOUNDRY_RECIPES;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.material.MarkerMaterials;

public class PlasmaFoundryRecipes {

    public static void init() {
        multiRecipes();
        catalysts();
        catalystRecipes();
        alloyRecipes();
    }

    private static void multiRecipes() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy, 8)
                .input(circuit, MarkerMaterials.Tier.UV, 32)
                .input(ROBOT_ARM_ZPM, 8)
                .input(ELECTRIC_PUMP_ZPM, 16)
                .input(ELECTRIC_PISTON_ZPM, 16)
                .input(plateDense, NaquadahAlloy, 4)
                .input(plate, Duranium, 64)
                .input(plate, Osmiridium, 64)
                .input(stick, Americium, 64)
                .input(wireGtDouble, EnrichedNaquadahTriniumEuropiumDuranide, 64)
                .input(wireGtHex, HSSG, 64)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 16),
                        Europium.getFluid(144 * 16))
                .output(PLASMA_FOUNDRY)
                .stationResearch(b -> b
                        .researchStack(ALLOY_SMELTER[ZPM].getStackForm())
                        .CWUt(32)
                        .EUt(VA[ZPM]))
                .duration(6400).EUt(VA[ZPM]).buildAndRegister();
    }

    private static void catalysts() {
        MetaItem<?>.MetaValueItem[] metaItemCatalysts = new MetaItem.MetaValueItem[] {
                CATALYST_STEELS, CATALYST_COPPER_ALLOYS, CATALYST_TIN_ALLOYS, CATALYST_GOLD_ALLOYS,
                CATALYST_BATTERY_ALLOY, CATALYST_SOLDERING_ALLOYS,
                CATALYST_PLATINUM_GROUP_ALLOYS, CATALYST_NAQUADAH_ALLOYS, CATALYST_SUPERCONDUCTORS, CATALYST_HAM_ALLOY,
                CATALYST_ARCANITE,
                CATALYST_ABYSSAL_ALLOY, CATALYST_VIBRANIUM_ALLOY, CATALYST_HALKONITE,
                CATALYST_OGANESSON_TETRATENNESSIDE, CATALYST_AWAKENED_DRACONIUM,
                CATALYST_EXO_HALKONITE,
                CATALYST_TITANIUM_ALLOYS, CATALYST_VANADIUM_ALLOYS
        };
        for (MetaItem<?>.MetaValueItem item : metaItemCatalysts) {
            PLASMA_FOUNDRY_RECIPES.registerCatalyst(item.getStackForm(), 50);
        }
    }

    private static void catalystRecipes() {
        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy)
                .input(circuit, MarkerMaterials.Tier.UV)
                .input(plate, StainlessSteel, 64)
                .input(plate, BlueSteel, 64)
                .input(stickLong, RedSteel, 64)
                .input(gear, HSSS, 16)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 8))
                .output(CATALYST_STEELS)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy)
                .input(circuit, MarkerMaterials.Tier.UV)
                .input(plate, Bronze, 64)
                .input(plate, Brass, 64)
                .input(wireGtDouble, RedAlloy, 64)
                .input(wireGtDouble, YttriumBariumCuprate, 64)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 8))
                .output(CATALYST_COPPER_ALLOYS)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy)
                .input(circuit, MarkerMaterials.Tier.UV)
                .input(plate, TinAlloy, 64)
                .input(stickLong, Brass, 64)
                .input(pipeHugeFluid, Potin, 6)
                .input(wireGtDouble, IndiumTinBariumTitaniumCuprate, 64)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 8))
                .output(CATALYST_TIN_ALLOYS)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy)
                .input(circuit, MarkerMaterials.Tier.UV)
                .input(plate, RoseGold, 64)
                .input(plate, Electrum, 64)
                .input(stickLong, BlueSteel, 64)
                .input(stickLong, BlackBronze, 64)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 8))
                .output(CATALYST_GOLD_ALLOYS)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy)
                .input(circuit, MarkerMaterials.Tier.UV)
                .input(plate, BatteryAlloy, 64)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 8))
                .output(CATALYST_BATTERY_ALLOY)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy)
                .input(circuit, MarkerMaterials.Tier.UV)
                .input(plate, SolderingAlloy, 64)
                .input(plate, HighGradeSolderingAlloy, 64)
                .output(CATALYST_SOLDERING_ALLOYS)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy)
                .input(circuit, MarkerMaterials.Tier.UV)
                .input(plate, Ruridit, 64)
                .input(stick, Osmiridium, 64)
                .input(wireGtDouble, RTMAlloy, 64)
                .input(wireGtDouble, UraniumTriplatinum, 64)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 8))
                .output(CATALYST_PLATINUM_GROUP_ALLOYS)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy)
                .input(circuit, MarkerMaterials.Tier.UV)
                .input(plate, NaquadahAlloy, 64)
                .input(wireGtDouble, UraniumRhodiumDinaquadide, 64)
                .input(wireGtDouble, EnrichedNaquadahTriniumEuropiumDuranide, 64)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 8))
                .output(CATALYST_NAQUADAH_ALLOYS)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy)
                .input(circuit, MarkerMaterials.Tier.UV)
                .input(stickLong, NiobiumTitanium, 64)
                .input(plate, IndiumTinBariumTitaniumCuprate, 64)
                .input(ingot, ALMST, 64)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 8))
                .output(CATALYST_TITANIUM_ALLOYS)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy)
                .input(circuit, MarkerMaterials.Tier.UV)
                .input(wireGtDouble, ManganesePhosphide, 64)
                .input(wireGtDouble, MagnesiumDiboride, 64)
                .input(wireGtDouble, MercuryBariumCalciumCuprate, 64)
                .input(wireGtDouble, SamariumIronArsenicOxide, 64)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 8))
                .output(CATALYST_SUPERCONDUCTORS)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, Adamantium)
                .input(circuit, MarkerMaterials.Tier.UHV)
                .input(plate, Vibranium, 64)
                .input(plateDense, Adamantium, 8)
                .input(plate, Duranium, 64)
                .input(gemExquisite, Azbantium, 16)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 16))
                .output(CATALYST_VIBRANIUM_ALLOY)
                .duration(1200).EUt(VA[UV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, HastelloyK243)
                .input(circuit, MarkerMaterials.Tier.UEV)
                .input(Items.PORKCHOP, 64)
                .input(Items.PORKCHOP, 64)
                .input(Items.PORKCHOP, 64)
                .input(Items.COOKED_PORKCHOP, 64)
                .input(Items.COOKED_PORKCHOP, 64)
                .input(Items.COOKED_PORKCHOP, 64)
                .input(stickLong, MagneticHolmium, 64)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 4))
                .output(CATALYST_HAM_ALLOY)
                .duration(2400).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, HastelloyK243)
                .input(circuit, MarkerMaterials.Tier.UEV)
                .input(lens, IgnisCrystal, 64)
                .input(lens, AquaCrystal, 64)
                .input(lens, TerraCrystal, 64)
                .input(lens, AerCrystal, 64)
                .input(lens, OrdoCrystal, 64)
                .input(lens, PerditioCrystal, 64)
                .input(lens, EnergyCrystal, 64)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 4))
                .output(CATALYST_ARCANITE)
                .duration(4800).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium)
                .input(circuit, MarkerMaterials.Tier.UHV)
                .input(plate, Naquadria, 64)
                .input(wireFine, Taranium, 64)
                .input(stickLong, NetherizedDiamond, 64)
                .input(gear, TungstenCarbide, 64)
                .input(dust, Germanium, 64)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 4))
                .output(CATALYST_ABYSSAL_ALLOY)
                .duration(1200).EUt(VA[UV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium)
                .input(circuit, MarkerMaterials.Tier.UHV)
                .input(plateDense, Oganesson, 16)
                .input(plateDense, Tennessine, 16)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 8))
                .output(CATALYST_OGANESSON_TETRATENNESSIDE)
                .duration(1200).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium)
                .input(circuit, MarkerMaterials.Tier.UEV)
                .input(plate, OganessonTetratennesside, 64)
                .input(stickLong, Azbantium, 64)
                .input(gear, HSSS, 64)
                .input(dust, Carbon, 64)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 32))
                .output(CATALYST_HALKONITE)
                .duration(1800).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, AbyssalAlloy)
                .input(circuit, MarkerMaterials.Tier.UEV)
                .input(plate, Draconium, 64)
                .input(plateDouble, Dragonblood, 64)
                .input(Blocks.REDSTONE_BLOCK, 64)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 64))
                .output(CATALYST_AWAKENED_DRACONIUM)
                .duration(2400).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, DeepDarkSteel)
                .input(circuit, MarkerMaterials.Tier.UIV)
                .input(plate, HalkoniteSteel, 64)
                .input(gear, Infinity, 64)
                .input(plateDense, AwakenedDraconium, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 32))
                .output(CATALYST_EXO_HALKONITE)
                .duration(3200).EUt(VA[UIV]).buildAndRegister();
    }

    private static void alloyRecipes() {
        // Recipe duration: Original 1x EBF blast time * quantity / 2 once for every tier up to UV / 4 an extra time

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Iron.getFluid(144 * 1024),
                        Oxygen.getPlasma(100))
                .foundryCatalyst(CATALYST_STEELS)
                .fluidOutputs(Steel.getFluid(144 * 1024))
                .duration(25 * 20 * 1024 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(BlackBronze.getFluid(144 * 75),
                        Nickel.getFluid(144 * 75),
                        Steel.getFluid(144 * 300),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_STEELS, CATALYST_COPPER_ALLOYS)
                .fluidOutputs(BlackSteel.getFluid(144 * 500))
                .duration(76 * 20 * 500 / 2 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Iron.getFluid(144 * 336),
                        Nickel.getFluid(144 * 56),
                        Manganese.getFluid(144 * 56),
                        Chrome.getFluid(144 * 56),
                        Nitrogen.getPlasma(1000))
                .foundryCatalyst(CATALYST_STEELS)
                .fluidOutputs(StainlessSteel.getFluid(144 * 504))
                .duration(55 * 20 * 504 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(RoseGold.getFluid(144 * 32),
                        Brass.getFluid(144 * 32),
                        BlackSteel.getFluid(144 * 128),
                        Steel.getFluid(144 * 64),
                        Tin.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_STEELS, CATALYST_COPPER_ALLOYS, CATALYST_GOLD_ALLOYS)
                .fluidOutputs(BlueSteel.getFluid(144 * 512))
                .duration(50 * 20 * 512 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(SterlingSilver.getFluid(144 * 32),
                        BismuthBronze.getFluid(144 * 32),
                        BlackSteel.getFluid(144 * 128),
                        Steel.getFluid(144 * 64),
                        Tin.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_STEELS, CATALYST_COPPER_ALLOYS)
                .fluidOutputs(RedSteel.getFluid(144 * 512))
                .duration(50 * 20 * 512 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Iron.getFluid(144 * 128),
                        Tungsten.getFluid(144 * 128),
                        Iron.getPlasma(144 * 32))
                .foundryCatalyst(CATALYST_STEELS)
                .fluidOutputs(TungstenSteel.getFluid(144 * 256))
                .duration(50 * 20 * 256 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Steel.getFluid(144 * 32 * 7),
                        Vanadium.getFluid(144 * 32),
                        Chrome.getFluid(144 * 32),
                        Oxygen.getPlasma(4000))
                .foundryCatalyst(CATALYST_STEELS, CATALYST_VANADIUM_ALLOYS)
                .fluidOutputs(VanadiumSteel.getFluid(144 * 32 * 9))
                .duration(80 * 20 * 32 * 9 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Vanadium.getFluid(144 * 32 * 3),
                        Gallium.getFluid(144 * 32),
                        Tin.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_VANADIUM_ALLOYS)
                .fluidOutputs(VanadiumGallium.getFluid(144 * 128))
                .duration(80 * 20 * 32 * 9 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(TungstenSteel.getFluid(144 * 120),
                        Chrome.getFluid(144 * 24),
                        Molybdenum.getFluid(144 * 48),
                        Vanadium.getFluid(144 * 24),
                        Tin.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_STEELS, CATALYST_VANADIUM_ALLOYS)
                .fluidOutputs(HSSG.getFluid(144 * 216))
                .duration(65 * 20 * 216 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(HSSG.getFluid(144 * 144),
                        Cobalt.getFluid(144 * 24),
                        Manganese.getFluid(144 * 24),
                        Silicon.getFluid(144 * 24),
                        Oxygen.getPlasma(1000))
                .foundryCatalyst(CATALYST_STEELS)
                .fluidOutputs(HSSE.getFluid(144 * 216))
                .duration(70 * 20 * 216 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(HSSG.getFluid(144 * 144),
                        Osmium.getFluid(144 * 24),
                        Iridium.getFluid(144 * 48),
                        Nitrogen.getPlasma(1000))
                .foundryCatalyst(CATALYST_STEELS, CATALYST_PLATINUM_GROUP_ALLOYS)
                .fluidOutputs(HSSS.getFluid(144 * 216))
                .duration(75 * 20 * 216 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Manganese.getFluid(144 * 256),
                        Phosphorus.getFluid(144 * 256),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS)
                .fluidOutputs(ManganesePhosphide.getFluid(144 * 512))
                .duration(50 * 20 * 512 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Magnesium.getFluid(144 * 160),
                        Boron.getFluid(144 * 320),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS)
                .fluidOutputs(MagnesiumDiboride.getFluid(144 * 480))
                .duration(50 * 20 * 480 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Barium.getFluid(144 * 64),
                        Calcium.getFluid(144 * 64),
                        Copper.getFluid(144 * 96),
                        Mercury.getFluid(32000),
                        Oxygen.getPlasma(4000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS, CATALYST_COPPER_ALLOYS)
                .fluidOutputs(MercuryBariumCalciumCuprate.getFluid(144 * 512))
                .duration(75 * 20 * 512 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Uranium238.getFluid(144 * 64),
                        Platinum.getFluid(144 * 192),
                        Nitrogen.getPlasma(1000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS, CATALYST_PLATINUM_GROUP_ALLOYS)
                .fluidOutputs(UraniumTriplatinum.getFluid(144 * 256))
                .duration(75 * 20 * 256 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Samarium.getFluid(144 * 64),
                        Iron.getFluid(144 * 64),
                        Arsenic.getFluid(144 * 64),
                        Oxygen.getPlasma(12000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS)
                .fluidOutputs(SamariumIronArsenicOxide.getFluid(144 * 256))
                .duration(75 * 20 * 256 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Indium.getFluid(144 * 64),
                        Tin.getFluid(144 * 24),
                        Barium.getFluid(144 * 24),
                        Titanium.getFluid(144 * 16),
                        Copper.getFluid(144 * 112),
                        Oxygen.getPlasma(24000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS, CATALYST_COPPER_ALLOYS, CATALYST_TIN_ALLOYS, CATALYST_TITANIUM_ALLOYS)
                .fluidOutputs(IndiumTinBariumTitaniumCuprate.getFluid(144 * 256))
                .duration(50 * 20 * 256 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Uranium238.getFluid(144 * 32),
                        Rhodium.getFluid(144 * 32),
                        Naquadah.getFluid(144 * 64),
                        Argon.getPlasma(1000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS, CATALYST_NAQUADAH_ALLOYS)
                .fluidOutputs(UraniumRhodiumDinaquadide.getFluid(144 * 128))
                .duration(75 * 20 * 128 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(NaquadahEnriched.getFluid(144 * 27),
                        Trinium.getFluid(144 * 18),
                        Europium.getFluid(144 * 12),
                        Duranium.getFluid(144 * 6),
                        Nickel.getPlasma(1000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS, CATALYST_NAQUADAH_ALLOYS)
                .fluidOutputs(EnrichedNaquadahTriniumEuropiumDuranide.getFluid(144 * 60))
                .duration(60 * 20 * 60 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Ruthenium.getFluid(144 * 5),
                        Trinium.getFluid(144 * 10),
                        Americium.getFluid(144 * 5),
                        Neutronium.getFluid(144 * 10),
                        Oxygen.getPlasma(12000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS, CATALYST_PLATINUM_GROUP_ALLOYS)
                .fluidOutputs(RutheniumTriniumAmericiumNeutronate.getFluid(144 * 70))
                .duration(50 * 20 * 70 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 768),
                        Tin.getFluid(144 * 256),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS, CATALYST_TIN_ALLOYS)
                .fluidOutputs(Bronze.getFluid(144 * 1024))
                .duration(15 * 20 * 1024 / 2 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 768),
                        Zinc.getFluid(144 * 256),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(Brass.getFluid(144 * 1024))
                .duration(15 * 20 * 1024 / 2 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 1024),
                        Redstone.getFluid(144 * 4096),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(RedAlloy.getFluid(144 * 1024))
                .duration(15 * 20 * 1024 / 2 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 1024),
                        Electrotine.getFluid(144 * 4096),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(BlueAlloy.getFluid(144 * 1024))
                .duration(15 * 20 * 1024 / 2 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 512),
                        Nickel.getFluid(144 * 512),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(Cupronickel.getFluid(144 * 1024))
                .duration(15 * 20 * 1024 / 2 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 672),
                        Tin.getFluid(144 * 224),
                        Lead.getFluid(144 * 112),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS, CATALYST_TIN_ALLOYS)
                .fluidOutputs(Potin.getFluid(144 * 1008))
                .duration(15 * 20 * 1008 / 2 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 300),
                        Electrum.getFluid(144 * 200),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS, CATALYST_GOLD_ALLOYS)
                .fluidOutputs(BlackBronze.getFluid(144 * 500))
                .duration(50 * 20 * 500 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Bismuth.getFluid(144 * 100),
                        Brass.getFluid(144 * 400),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(BismuthBronze.getFluid(144 * 500))
                .duration(50 * 20 * 500 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Silver.getFluid(144 * 400),
                        Copper.getFluid(144 * 100),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(SterlingSilver.getFluid(144 * 500))
                .duration(50 * 20 * 500 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Gold.getFluid(144 * 400),
                        Copper.getFluid(144 * 100),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS, CATALYST_GOLD_ALLOYS)
                .fluidOutputs(RoseGold.getFluid(144 * 500))
                .duration(50 * 20 * 500 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Gold.getFluid(144 * 512),
                        Silver.getFluid(144 * 512),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_GOLD_ALLOYS)
                .fluidOutputs(Electrum.getFluid(144 * 1024))
                .duration(15 * 20 * 1024 / 2 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Lead.getFluid(144 * 832),
                        Silver.getFluid(144 * 208),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_BATTERY_ALLOY)
                .fluidOutputs(BatteryAlloy.getFluid(144 * 1040))
                .duration(15 * 20 * 1040 / 2 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Tin.getFluid(144 * 624),
                        Lead.getFluid(144 * 312),
                        Antimony.getFluid(144 * 104),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_SOLDERING_ALLOYS)
                .fluidOutputs(SolderingAlloy.getFluid(144 * 1040))
                .duration(15 * 20 * 1040 / 2 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Cadmium.getFluid(144 * 96),
                        Antimony.getFluid(144 * 69),
                        Indium.getFluid(144 * 24),
                        Nitrogen.getPlasma(1000))
                .foundryCatalyst(CATALYST_SOLDERING_ALLOYS)
                .fluidOutputs(HighGradeSolderingAlloy.getFluid(144 * 192))
                .duration(75 * 20 * 192 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Tin.getFluid(144 * 512),
                        Iron.getFluid(144 * 512),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_TIN_ALLOYS)
                .fluidOutputs(TinAlloy.getFluid(144 * 1024))
                .duration(15 * 20 * 1024 / 2 / 2 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Ruthenium.getFluid(144 * 144),
                        Tungsten.getFluid(144 * 72),
                        Molybdenum.getFluid(144 * 36),
                        Argon.getPlasma(1000))
                .foundryCatalyst(CATALYST_PLATINUM_GROUP_ALLOYS)
                .fluidOutputs(RTMAlloy.getFluid(144 * 252))
                .duration(70 * 20 * 252 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Yttrium.getFluid(144 * 15),
                        Barium.getFluid(144 * 30),
                        Copper.getFluid(144 * 45),
                        Oxygen.getPlasma(24000))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(YttriumBariumCuprate.getFluid(144 * 195))
                .duration(50 * 20 * 65 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Ruthenium.getFluid(144 * 120),
                        Iridium.getFluid(144 * 60),
                        Argon.getPlasma(1000))
                .foundryCatalyst(CATALYST_PLATINUM_GROUP_ALLOYS)
                .fluidOutputs(Ruridit.getFluid(144 * 180))
                .duration(80 * 20 * 180 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Osmium.getFluid(144 * 32),
                        Iridium.getFluid(144 * 96),
                        Tin.getPlasma(144 * 16))
                .foundryCatalyst(CATALYST_PLATINUM_GROUP_ALLOYS)
                .fluidOutputs(Osmiridium.getFluid(144 * 128))
                .duration(50 * 20 * 128 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Naquadah.getFluid(144 * 64),
                        Trinium.getFluid(144 * 32),
                        Osmiridium.getFluid(144 * 32),
                        Iron.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_NAQUADAH_ALLOYS)
                .fluidOutputs(NaquadahAlloy.getFluid(144 * 128))
                .duration(50 * 20 * 128 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(RoseGold.getFluid(144 * 24),
                        Promethium.getFluid(144 * 16),
                        Naquadria.getFluid(144 * 16),
                        Thulium.getFluid(144 * 8),
                        Nickel.getPlasma(144 * 8),
                        Argon.getPlasma(1000))
                .foundryCatalyst(CATALYST_GOLD_ALLOYS, CATALYST_NAQUADAH_ALLOYS)
                .fluidOutputs(Hihiirokane.getFluid(144 * 64))
                .duration(100 * 20 * 64 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Tritanium.getFluid(144 * 24),
                        Darmstadtium.getFluid(144 * 16),
                        ALMST.getFluid(144 * 16),
                        HSSS.getFluid(144 * 8),
                        Nickel.getPlasma(144 * 8),
                        Iron.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_PLATINUM_GROUP_ALLOYS)
                .fluidOutputs(RawAdamantium.getFluid(144 * 64))
                .duration(100 * 20 * 64 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Niobium.getFluid(144 * 32),
                        Titanium.getFluid(144 * 32),
                        Nitrogen.getPlasma(2000))
                .foundryCatalyst(CATALYST_TITANIUM_ALLOYS)
                .fluidOutputs(NiobiumTitanium.getFluid(144 * 64))
                .duration(20 * 45 * 64 / 2 / 2 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Aluminium.getFluid(144 * 32),
                        Lithium.getFluid(144 * 32),
                        Magnesium.getFluid(144 * 16),
                        Scandium.getFluid(144 * 32),
                        Titanium.getFluid(144 * 48),
                        Iron.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_TITANIUM_ALLOYS)
                .fluidOutputs(ALMST.getFluid(144 * 16 * 9))
                .duration(45 * 20 * 16 * 9 / 2 / 2 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Vibranium.getFluid(144 * 32),
                        Adamantium.getFluid(144 * 16),
                        Duranium.getFluid(144 * 8),
                        Azbantium.getFluid(144 * 8),
                        Tin.getPlasma(144 * 8),
                        Americium.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_VIBRANIUM_ALLOY)
                .fluidOutputs(VibraniumAlloy.getFluid(144 * 64))
                .duration(100 * 20 * 64 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Oganesson.getFluid(144 * 16),
                        Tennessine.getFluid(144 * 64),
                        Nickel.getPlasma(144 * 24))
                .foundryCatalyst(CATALYST_OGANESSON_TETRATENNESSIDE)
                .fluidOutputs(OganessonTetratennesside.getFluid(144 * 80))
                .duration(100 * 20 * 80 / 2 / 4).EUt(VA[UHV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(OganessonTetratennesside.getFluid(144 * 16),
                        Azbantium.getFluid(144 * 16),
                        HSSS.getFluid(144 * 16),
                        Carbon.getFluid(144 * 8),
                        CondensedStarMatter.getFluid(144 * 8),
                        Iron.getPlasma(144 * 16))
                .foundryCatalyst(CATALYST_HALKONITE)
                .fluidOutputs(HalkonitePreparationBase.getFluid(144 * 64))
                .duration(100 * 20 * 64 / 2 / 4).EUt(VA[UHV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Holmium.getFluid(144 * 32),
                        Americium.getFluid(144 * 16),
                        Moscovium.getFluid(144 * 16),
                        Nickel.getPlasma(144 * 8),
                        Tin.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_HAM_ALLOY)
                .fluidOutputs(HAMAlloy.getFluid(144 * 64))
                .duration(100 * 20 * 64 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Flerovium.getFluid(144 * 32),
                        HighGradeSolderingAlloy.getFluid(144 * 24),
                        Darmstadtium.getFluid(144 * 8),
                        Nickel.getPlasma(144 * 8),
                        Nitrogen.getPlasma(1000))
                .foundryCatalyst(CATALYST_SOLDERING_ALLOYS)
                .fluidOutputs(SuperheavySolderingAlloy.getFluid(144 * 64))
                .duration(100 * 20 * 64 / 2 / 4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Thorium.getFluid(144 * 108),
                        EnergyCrystal.getFluid(144 * 108),
                        OrdoCrystal.getFluid(144 * 27),
                        PerditioCrystal.getFluid(144 * 27),
                        Nickel.getPlasma(144 * 64),
                        Tin.getPlasma(144 * 64))
                .foundryCatalyst(CATALYST_ARCANITE)
                .fluidOutputs(Arcanite.getFluid(144 * 240))
                .duration(400000).EUt(VA[UEV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(NaquadriaticTaranium.getFluid(144 * 32),
                        TungstenCarbide.getFluid(144 * 8),
                        NetherizedDiamond.getFluid(144 * 8),
                        Germanium.getFluid(144 * 8),
                        BlackStarMatter.getFluid(3200),
                        Iron.getPlasma(144 * 128))
                .foundryCatalyst(CATALYST_ABYSSAL_ALLOY)
                .fluidOutputs(AbyssalAlloy.getFluid(144 * 64))
                .duration(100 * 20 * 64 / 2 / 4 / 2).EUt(VA[UEV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Taranium.getFluid(144 * 13),
                        Hihiirokane.getFluid(144 * 13),
                        BETSPerrhenate.getFluid(144 * 13),
                        Orundum.getFluid(144 * 13),
                        Bromine.getFluid(13000),
                        Americium.getPlasma(144 * 64))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS)
                .fluidOutputs(ScUevSane.getFluid(144 * 65))
                .duration(100 * 20 * 64 / 2 / 4 / 2).EUt(VA[UEV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Draconium.getFluid(144 * 64),
                        Dragonblood.getFluid(144 * 64),
                        Redstone.getFluid(144 * 128),
                        CondensedStarMatter.getFluid(10000),
                        Flerovium.getPlasma(144 * 32))
                .foundryCatalyst(CATALYST_AWAKENED_DRACONIUM)
                .fluidOutputs(AwakenedDraconium.getFluid(144 * 64))
                .duration(100 * 20 * 64 / 2 / 4 / 2).EUt(VA[UIV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(HalkonitePreparationBase.getFluid(144 * 128),
                        Infinity.getFluid(144 * 64),
                        AwakenedDraconium.getFluid(144 * 16),
                        ExoticUnreality.getFluid(8000),
                        TrilithiumResin.getFluid(10000),
                        Dragonblood.getPlasma(144 * 32))
                .fluidOutputs(ExoHalkoniteBase.getFluid(144 * 64))
                .foundryCatalyst(CATALYST_EXO_HALKONITE)
                .duration(100 * 20 * 64 / 2 / 4 / 2).EUt(VA[UXV]).buildAndRegister();
    }
}
