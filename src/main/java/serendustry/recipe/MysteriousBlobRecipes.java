package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.metatileentities.MetaTileEntities.HULL;
import static serendustry.item.SerendustryMetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;

import net.minecraft.init.Blocks;

public class MysteriousBlobRecipes {

    public static void init() {
        primeRecipes();
        machineHullRecipes();
        matterCreationRecipes();
    }

    private static void primeRecipes() {
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(Blocks.TNT, 1)
                .fluidInputs(Air.getFluid(1000))
                .fluidOutputs(PrimedAir.getFluid(100))
                .duration(3800).EUt(VA[EV]).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(PrimedAir.getFluid(1000))
                .output(MYSTERIOUS_BLOB_HYDROGEN)
                .fluidOutputs(Air.getFluid(1000))
                .duration(4600).EUt(VA[EV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(MYSTERIOUS_BLOB_HYDROGEN)
                .fluidInputs(Hydrogen.getFluid(10000))
                .fluidOutputs(HydrogenPrime.getFluid(100))
                .duration(9600).EUt(VA[EV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(MYSTERIOUS_BLOB_HYDROGEN)
                .fluidInputs(Gold.getFluid(576))
                .output(MYSTERIOUS_BLOB_HELIUM)
                .duration(9600).EUt(VA[IV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(MYSTERIOUS_BLOB_HELIUM)
                .fluidInputs(Helium.getFluid(10000))
                .fluidOutputs(HeliumPrime.getFluid(100))
                .duration(9600).EUt(VA[IV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(MYSTERIOUS_BLOB_HELIUM)
                .fluidInputs(Electrum.getFluid(576))
                .output(MYSTERIOUS_BLOB_NITROGEN)
                .duration(9600).EUt(VA[LuV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(MYSTERIOUS_BLOB_NITROGEN)
                .fluidInputs(Nitrogen.getFluid(10000))
                .fluidOutputs(NitrogenPrime.getFluid(100))
                .duration(9600).EUt(VA[LuV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(MYSTERIOUS_BLOB_NITROGEN)
                .fluidInputs(Thaumium.getFluid(576))
                .output(MYSTERIOUS_BLOB_OXYGEN)
                .duration(9600).EUt(VA[ZPM]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(MYSTERIOUS_BLOB_OXYGEN)
                .fluidInputs(Oxygen.getFluid(10000))
                .fluidOutputs(OxygenPrime.getFluid(100))
                .duration(9600).EUt(VA[ZPM]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(MYSTERIOUS_BLOB_OXYGEN)
                .fluidInputs(InfusedGold.getFluid(576))
                .output(MYSTERIOUS_BLOB_NEON)
                .duration(9600).EUt(VA[UHV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(MYSTERIOUS_BLOB_NEON)
                .fluidInputs(Neon.getFluid(10000))
                .fluidOutputs(NeonPrime.getFluid(100))
                .duration(9600).EUt(VA[UHV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(MYSTERIOUS_BLOB_NEON)
                .fluidInputs(FluxedElectrum.getFluid(2304))
                .output(MYSTERIOUS_BLOB_ARGON)
                .duration(9600).EUt(VA[UEV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(MYSTERIOUS_BLOB_ARGON)
                .fluidInputs(Argon.getFluid(10000))
                .fluidOutputs(ArgonPrime.getFluid(100))
                .duration(9600).EUt(VA[UEV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(MYSTERIOUS_BLOB_ARGON)
                .fluidInputs(Quantium.getFluid(2304))
                .output(MYSTERIOUS_BLOB_KRYPTON)
                .duration(9600).EUt(VA[UIV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(MYSTERIOUS_BLOB_KRYPTON)
                .fluidInputs(Krypton.getFluid(10000))
                .fluidOutputs(KryptonPrime.getFluid(100))
                .duration(9600).EUt(VA[UIV]).buildAndRegister();
    }

    private static void machineHullRecipes() {
        ASSEMBLER_RECIPES.recipeBuilder()
                .input(screw, Tin, 8)
                .fluidInputs(HydrogenPrime.getFluid(10))
                .output(HULL[LV])
                .duration(50).EUt(VA[MV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stickLong, Electrum, 2)
                .fluidInputs(HydrogenPrime.getFluid(60))
                .output(HULL[MV])
                .duration(50).EUt(VA[HV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Manganese, 2)
                .fluidInputs(HeliumPrime.getFluid(10))
                .output(HULL[HV])
                .duration(50).EUt(VA[EV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(gear, Titanium, 1)
                .fluidInputs(HeliumPrime.getFluid(60))
                .output(HULL[EV])
                .duration(50).EUt(VA[IV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(bolt, Rhopalthenit, 12)
                .fluidInputs(NitrogenPrime.getFluid(10))
                .output(HULL[IV])
                .duration(50).EUt(VA[LuV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(gear, EnrichedHolmium, 1)
                .fluidInputs(NitrogenPrime.getFluid(60))
                .output(HULL[LuV])
                .duration(50).EUt(VA[ZPM]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Americium, 4)
                .fluidInputs(OxygenPrime.getFluid(10))
                .output(HULL[ZPM])
                .duration(50).EUt(VA[UV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Darmstadtium, 2)
                .fluidInputs(OxygenPrime.getFluid(60))
                .output(HULL[UV])
                .duration(50).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ring, Neutronium, 13)
                .fluidInputs(NeonPrime.getFluid(10))
                .output(HULL[UHV])
                .duration(50).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ingot, NobleGases, 3)
                .fluidInputs(NeonPrime.getFluid(60))
                .output(HULL[UEV])
                .duration(50).EUt(VA[UIV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(round, StellarAlloy, 41)
                .fluidInputs(ArgonPrime.getFluid(10))
                .output(HULL[UIV])
                .duration(50).EUt(VA[UXV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(wireFine, CrystalMatrix, 64)
                .fluidInputs(ArgonPrime.getFluid(60))
                .output(HULL[UXV])
                .duration(50).EUt(VA[OpV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, CallistoIce, 4)
                .fluidInputs(KryptonPrime.getFluid(10))
                .output(HULL[OpV])
                .duration(50).EUt(VA[MAX]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Floppa, 6)
                .fluidInputs(KryptonPrime.getFluid(180))
                .output(HULL[MAX])
                .duration(50).EUt(VA[MAX]).buildAndRegister();
    }

    private static void matterCreationRecipes() {
        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Lithium.getFluid(144), HydrogenPrime.getFluid(100))
                .fluidOutputs(Lithium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Beryllium.getFluid(144), HydrogenPrime.getFluid(100))
                .fluidOutputs(Beryllium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Boron, 1)
                .fluidInputs(HydrogenPrime.getFluid(100))
                .output(dust, Boron, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Carbon.getFluid(144), HydrogenPrime.getFluid(50))
                .fluidOutputs(Carbon.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Fluorine.getFluid(100), HydrogenPrime.getFluid(100))
                .fluidOutputs(Fluorine.getFluid(1000))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Sodium.getFluid(144), HydrogenPrime.getFluid(100))
                .fluidOutputs(Sodium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Magnesium.getFluid(144), HydrogenPrime.getFluid(100))
                .fluidOutputs(Magnesium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Aluminium.getFluid(144), HeliumPrime.getFluid(100))
                .fluidOutputs(Aluminium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Silicon.getFluid(144), HeliumPrime.getFluid(50))
                .fluidOutputs(Silicon.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Phosphorus, 1)
                .fluidInputs(HeliumPrime.getFluid(100))
                .output(dust, Phosphorus, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Sulfur, 1)
                .fluidInputs(HeliumPrime.getFluid(50))
                .output(dust, Sulfur, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Chlorine.getFluid(100), HeliumPrime.getFluid(50))
                .fluidOutputs(Chlorine.getFluid(1000))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Potassium.getFluid(144), HeliumPrime.getFluid(50))
                .fluidOutputs(Potassium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Calcium, 1)
                .fluidInputs(HeliumPrime.getFluid(50))
                .output(dust, Calcium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Scandium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Scandium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Titanium.getFluid(144), OxygenPrime.getFluid(150))
                .fluidOutputs(Titanium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Vanadium.getFluid(144), OxygenPrime.getFluid(100))
                .fluidOutputs(Vanadium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Chrome.getFluid(144), OxygenPrime.getFluid(100))
                .fluidOutputs(Chrome.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Manganese.getFluid(144), OxygenPrime.getFluid(100))
                .fluidOutputs(Manganese.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Iron.getFluid(144), HydrogenPrime.getFluid(50))
                .fluidOutputs(Iron.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Cobalt.getFluid(144), OxygenPrime.getFluid(100))
                .fluidOutputs(Cobalt.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Nickel.getFluid(144), HydrogenPrime.getFluid(50))
                .fluidOutputs(Nickel.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144), HydrogenPrime.getFluid(50))
                .fluidOutputs(Copper.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Zinc.getFluid(144), HydrogenPrime.getFluid(50))
                .fluidOutputs(Zinc.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Gallium.getFluid(144), ArgonPrime.getFluid(100))
                .fluidOutputs(Gallium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Germanium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Germanium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Arsenic.getFluid(144), OxygenPrime.getFluid(200))
                .fluidOutputs(Arsenic.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Selenium, 1)
                .fluidInputs(KryptonPrime.getFluid(50))
                .output(dust, Selenium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Bromine.getFluid(100), ArgonPrime.getFluid(100))
                .fluidOutputs(Bromine.getFluid(1000))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Rubidium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Rubidium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Strontium, 1)
                .fluidInputs(KryptonPrime.getFluid(50))
                .output(dust, Strontium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Yttrium.getFluid(144), ArgonPrime.getFluid(50))
                .fluidOutputs(Yttrium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Zirconium, 1)
                .fluidInputs(KryptonPrime.getFluid(50))
                .output(dust, Zirconium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Niobium.getFluid(144), OxygenPrime.getFluid(150))
                .fluidOutputs(Niobium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Molybdenum.getFluid(144), OxygenPrime.getFluid(150))
                .fluidOutputs(Molybdenum.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Technetium, 1)
                .fluidInputs(OxygenPrime.getFluid(100))
                .output(dust, Technetium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Ruthenium.getFluid(144), ArgonPrime.getFluid(100))
                .fluidOutputs(Ruthenium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Rhodium.getFluid(144), ArgonPrime.getFluid(100))
                .fluidOutputs(Rhodium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Palladium.getFluid(144), ArgonPrime.getFluid(100))
                .fluidOutputs(Palladium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Silver.getFluid(144), OxygenPrime.getFluid(100))
                .fluidOutputs(Silver.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Cadmium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Cadmium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Indium.getFluid(144), KryptonPrime.getFluid(200))
                .fluidOutputs(Indium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Tin.getFluid(144), HydrogenPrime.getFluid(50))
                .fluidOutputs(Tin.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Antimony.getFluid(144), OxygenPrime.getFluid(50))
                .fluidOutputs(Antimony.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Tellurium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Tellurium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Iodine, 1)
                .fluidInputs(ArgonPrime.getFluid(50))
                .output(dust, Iodine, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Xenon.getFluid(100), KryptonPrime.getFluid(200))
                .fluidOutputs(Xenon.getFluid(1000))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Caesium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Caesium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Barium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Barium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Lanthanum.getFluid(144), ArgonPrime.getFluid(100))
                .fluidOutputs(Lanthanum.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Cerium.getFluid(144), ArgonPrime.getFluid(100))
                .fluidOutputs(Cerium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Praseodymium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Praseodymium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Neodymium.getFluid(144), OxygenPrime.getFluid(100))
                .fluidOutputs(Neodymium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Promethium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Promethium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Samarium.getFluid(144), ArgonPrime.getFluid(100))
                .fluidOutputs(Samarium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Europium.getFluid(144), KryptonPrime.getFluid(100))
                .fluidOutputs(Europium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Gadolinium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Gadolinium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Terbium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Terbium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Dysprosium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Dysprosium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Holmium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Holmium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Erbium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Erbium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Thulium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Thulium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Ytterbium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Ytterbium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Lutetium.getFluid(144), KryptonPrime.getFluid(100))
                .fluidOutputs(Lutetium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Hafnium, 1)
                .fluidInputs(KryptonPrime.getFluid(100))
                .output(dust, Hafnium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Tantalum.getFluid(144), ArgonPrime.getFluid(100))
                .fluidOutputs(Tantalum.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Tungsten.getFluid(144), ArgonPrime.getFluid(100))
                .fluidOutputs(Tungsten.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Rhenium, 1)
                .fluidInputs(KryptonPrime.getFluid(100))
                .output(dust, Rhenium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Osmium.getFluid(144), KryptonPrime.getFluid(150))
                .fluidOutputs(Osmium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Iridium.getFluid(144), KryptonPrime.getFluid(100))
                .fluidOutputs(Iridium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Platinum.getFluid(144), OxygenPrime.getFluid(150))
                .fluidOutputs(Platinum.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Gold.getFluid(144), OxygenPrime.getFluid(50))
                .fluidOutputs(Gold.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Mercury.getFluid(144), OxygenPrime.getFluid(50))
                .fluidOutputs(Mercury.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Thallium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Thallium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Lead.getFluid(144), HydrogenPrime.getFluid(50))
                .fluidOutputs(Lead.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Bismuth.getFluid(144), OxygenPrime.getFluid(100))
                .fluidOutputs(Bismuth.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Polonium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Polonium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Astatine, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Astatine, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Radon.getFluid(100), ArgonPrime.getFluid(100))
                .fluidOutputs(Radon.getFluid(1000))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Francium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Francium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Radium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Radium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Actinium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Actinium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Thorium.getFluid(144), OxygenPrime.getFluid(100))
                .fluidOutputs(Thorium.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Protactinium, 1)
                .fluidInputs(ArgonPrime.getFluid(100))
                .output(dust, Protactinium, 9)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Uranium235.getFluid(144), ArgonPrime.getFluid(150))
                .fluidOutputs(Uranium235.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Uranium238.getFluid(144), OxygenPrime.getFluid(100))
                .fluidOutputs(Uranium238.getFluid(1296))
                .duration(400).EUt(VA[LV]).buildAndRegister();

        /*
         * MIXER_RECIPES.recipeBuilder()
         * .fluidInputs(SterlingSilver.getFluid(4608), HydrogenPrime.getFluid(300))
         * .output(ore, CheeseCheddar, 64)
         * .duration(800).EUt(VA[MV]).buildAndRegister();
         */

        /*
         * MIXER_RECIPES.recipeBuilder()
         * .fluidInputs(Samarium.getFluid(2304), Neodymium.getFluid(2304), NeonPrime.getFluid(300))
         * .output(ore, TengamRaw, 32)
         * .duration(2400).EUt(VA[ZPM]).buildAndRegister();
         */
    }
}
