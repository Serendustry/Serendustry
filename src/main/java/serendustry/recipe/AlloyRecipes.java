package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gregtech.common.items.MetaItems.EMITTER_UV;
import static gregtech.common.metatileentities.MetaTileEntities.*;
import static serendustry.item.SerendustryMetaItems.CULTURE_STEM_CELL_WIRED;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryRecipeMaps.CVD_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.LABORATORY_RECIPES;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import net.minecraft.init.Blocks;

import gregtech.api.fluids.store.FluidStorageKeys;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class AlloyRecipes {

    public static void init() {
        MIXER_RECIPES.recipeBuilder()
                .input(dust, Gallium, 1).input(dust, Yttrium, 1)
                .output(dust, GalliumYttrium, 2)
                .duration(90).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, RoseGold, 1).input(dust, SterlingSilver, 1).input(dust, Electrum, 2)
                .input(dust, InfusedGold, 2).input(dust, Naquadria, 4)
                .fluidInputs(SolderingAlloy.getFluid(1440))
                .output(dust, FluxedElectrum, 4)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Americium, 1).input(dust, Oganesson, 1).input(dust, Uranium238, 1).input(dust, Sulfur, 1)
                .output(dust, Amogus, 4)
                .duration(800).EUt(VA[ZPM] + 10).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, NaquadahAlloy, 10).input(dust, Rhenium, 5).input(dust, Naquadria, 4)
                .input(dust, Polonium, 3).input(dust, Rutherfordium, 2).input(dust, Fermium, 1)
                .output(dust, HastelloyX78, 30)
                .duration(3000).EUt(VA[ZPM] + 25).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, HastelloyX78, 5).input(dust, Tritanium, 4).input(dust, TungstenCarbide, 4)
                .input(dust, Promethium, 4).input(dust, NiobiumNitride, 2).input(dust, Mendelevium, 1)
                .output(dust, HastelloyK243, 20)
                .duration(2500).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Steel, 20).input(dust, Chrome, 13).input(dust, Copper, 10).input(dust, Nickel, 3)
                .input(dust, Molybdenum, 2).input(dust, Tungsten, 2)
                .output(dust, Zeron100, 50)
                .duration(3500).EUt(VA[IV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Zeron100, 8).input(dust, Titanium, 6).input(dust, Naquadria, 4).input(dust, Gadolinium, 3)
                .input(dust, Osmiridium, 1)
                .fluidInputs(Mercury.getFluid(1000))
                .output(dust, Cinobite, 26)
                .duration(1600).EUt(VA[ZPM]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Nickel, 2).input(dust, Aluminium, 2).input(dust, Niobium, 1).input(dust, Nichrome, 1)
                .output(dust, Inconel792, 6)
                .duration(280).EUt(VA[HV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Invar, 5).input(dust, Iron, 4).input(dust, Kanthal, 1).input(dust, Sulfur, 1)
                .input(dust, Silicon, 1).input(dust, Carbon, 1)
                .output(dust, EglinSteel, 13)
                .duration(600).EUt(VA[HV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Antimony, 2).input(dust, Platinium, 2).input(dust, Ytterbium).input(dust, Nichrome)
                .input(dust, SiliconCarbide)
                .output(dust, Onionium, 7)
                .duration(400).EUt(VA[IV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Inconel792, 8).input(dust, EglinSteel, 5).input(dust, NaquadahEnriched, 4)
                .input(dust, TungstenSteel, 4).input(dust, Cerium, 3).input(dust, Onionium, 7)
                .output(dust, Pikyonium, 29)
                .duration(1900).EUt(VA[ZPM]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Nickel, 15).input(dust, Molybdenum, 4).input(dust, Yttrium, 2).input(dust, Chrome, 2)
                .input(dust, Titanium, 2)
                .output(dust, HastelloyN, 25)
                .duration(1200).EUt(VA[EV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, HastelloyN, 8).input(dust, Nickel, 8).input(dust, Aluminum, 6).input(dust, Naquadah, 4)
                .input(dust, Tungsten, 4).input(dust, Samarium, 2).input(dust, Carbon, 2)
                .fluidInputs(Argon.getFluid(2000))
                .output(dust, Lafium, 36)
                .duration(2400).EUt(VA[UV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, Lafium, 36)
                .output(dust, HastelloyN, 8).output(dust, Nickel, 8).output(dust, Aluminum, 6).output(dust, Naquadah, 4)
                .output(dust, Tungsten, 4).output(dust, Samarium, 2).output(dust, Carbon, 2)
                .fluidOutputs(Argon.getFluid(2000))
                .duration(3960).EUt(60).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, NaquadahEnriched, 4).input(dust, Rhodium, 2).input(dust, Ruthenium, 2)
                .input(dust, Rubidium, 2).input(dust, Dubnium, 1).input(dust, Einsteinium, 1)
                .output(dust, EnrichedNaquadahAlloy, 12)
                .duration(500).EUt(VA[ZPM]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Silicon, 5).input(dust, Iron, 1)
                .fluidInputs(Oxygen.getFluid(10000))
                .output(dust, Prasiolite, 16)
                .duration(6000).EUt(VA[HV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Zirconium, 1).input(dust, Oxygen, 2)
                .output(dust, CubicZirconia, 3)
                .duration(113).EUt(VA[HV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, BismuthTellurite, 4).input(dust, Prasiolite, 3).input(dust, CubicZirconia, 1)
                .input(dust, SamariumMagnetic, 1)
                .output(dust, MagnetoResonatic, 9)
                .duration(352).EUt(VA[HV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, TungstenSteel, 12).input(dust, HSSS, 9).input(dust, HSSG, 6).input(dust, Ruridit, 3)
                .input(dust, MagnetoResonatic, 2).input(dust, Plutonium239, 1)
                .output(dust, HighDurabilityCompoundSteel, 33)
                .duration(3100).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, MagnetoResonatic, 3).input(dust, Cinobite, 1).input(dust, Pikyonium, 1)
                .input(dust, Aluminum, 1)
                .output(dust, ScUev, 6)
                .duration(2400).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Aluminum).input(dust, Phosphate)
                .output(dust, Luminessence, 2)
                .duration(400).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Luminessence, 2).input(dust, TinAlloy).input(dust, RoseGold).input(dust, Phosphate)
                .output(dust, Lumiium, 5)
                .duration(800).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Lumiium, 3).input(dust, Aluminum, 2).input(dust, FluxedElectrum).input(dust, Phosphate)
                .output(dust, Signalium, 7)
                .duration(1100).EUt(VA[UHV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Signalium, 4).input(dust, EnderPearl, 2).input(dust, TastyNeutronium, 2)
                .input(dust, Phosphate)
                .output(dust, EnderiiumBase, 9)
                .duration(1400).EUt(VA[UHV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, EnderiiumBase, 4).input(dust, InfusedGold).input(dust, Phosphate)
                .output(dust, Enderiiium, 6)
                .duration(1000).EUt(VA[UHV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Iron).input(dust, EnderPearl).input(dust, Uraninite)
                .output(dust, PulsatingIron, 3)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, PulsatingIron, 4).input(dust, Zeolite).input(dust, GarnetSand).input(dust, HSSS)
                .fluidInputs(Mercury.getFluid(1000))
                .output(dust, EnergeticAlloy, 8)
                .duration(800).EUt(VA[ZPM]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, EnergeticAlloy, 5).input(dust, Zeolite).input(dust, BasalticMineralSand)
                .input(dust, GraniticMineralSand)
                .output(dust, VibrantAlloy, 8)
                .duration(900).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, VibrantAlloy, 8).input(dust, TastyNeutronium, 2).input(dust, Aluminum, 2)
                .input(dust, AluminiumSulfite)
                .output(dust, StellarAlloy, 13)
                .duration(1600).EUt(VA[UHV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, VibrantAlloy, 3).input(dust, Naquadria, 2).input(dust, FluxedElectrum, 2)
                .input(dust, EnderiiumBase, 2)
                .output(dust, ScUiv, 9)
                .duration(1500).EUt(VA[UHV]).buildAndRegister();

        IMPLOSION_RECIPES.recipeBuilder()
                .input(gemExquisite, Diamond).input(dust, NetherStar)
                .output(dust, CrystalMatrix)
                .explosivesAmount(4)
                .duration(20).EUt(VA[UHV]).buildAndRegister();

        IMPLOSION_RECIPES.recipeBuilder()
                .input(dust, CrystalMatrix, 8).input(dust, Neutronium, 8)
                .output(dust, InfinityCatalyst)
                .explosivesAmount(4)
                .duration(20).EUt(VA[UHV]).buildAndRegister();

        IMPLOSION_RECIPES.recipeBuilder()
                .input(dust, TinAlloy, 8).input(Blocks.DRAGON_EGG)
                .output(dust, Draconium)
                .explosivesAmount(4)
                .duration(20).EUt(VA[UHV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(dust, Draconium)
                .fluidInputs(Redstone.getFluid(1000))
                .output(dust, ChargedDraconium)
                .duration(180).EUt(VA[UHV]).buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(dust, Stone, 64).input(dust, Stone, 64).input(dust, Stone, 64).input(dust, Stone, 64)
                .input(dust, Stone, 64).input(dust, Stone, 64)
                .output(dust, Bedrockium, 1)
                .duration(120).EUt(VA[UHV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, ChargedDraconium, 4).input(dust, StellarAlloy, 4).input(dust, Luminessence, 3)
                .input(dust, InfinityCatalyst, 2)
                .output(dust, ScUxv, 13)
                .duration(1800).EUt(VA[UEV]).buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(dust, SiliconDioxide, 64).input(dust, SiliconDioxide, 64).input(dust, SiliconDioxide, 64)
                .input(dust, SiliconDioxide, 64).input(dust, SiliconDioxide, 64).input(dust, SiliconDioxide, 64)
                .output(dust, Jasper, 8)
                .duration(500).EUt(VA[UHV]).buildAndRegister();

        CVD_RECIPES.recipeBuilder()
                .input(dust, Carbon)
                .fluidInputs(Silane.getFluid(1000), Argon.getFluid(100))
                .output(dust, SiliconCarbide, 2)
                .fluidOutputs(Hydrogen.getFluid(4000))
                .duration(100).EUt(VA[HV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Trinium, 3).input(dust, HSSS, 4).input(dust, TungstenCarbide, 2).input(dust, Osmiridium)
                .input(dust, Strontium)
                .output(dust, ArceusAlloy2B, 11)
                .duration(600).EUt(VA[LuV]).buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .input(ASSEMBLY_LINE)
                .fluidOutputs(AssemblyLine.getFluid(100))
                .duration(1000).EUt(VA[UEV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(AssemblyLine.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
                .fluidOutputs(AssemblyLine.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(1200).EUt(VA[UEV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, StellarAlloy, 15).input(dust, ArceusAlloy2B, 10).input(dust, Lafium, 10)
                .input(dust, Jasper, 5).input(dust, Americium, 5).input(dust, EnergyCrystal, 5).input(dust, Germanium, 5)
                .input(dust, SiliconCarbide, 5)
                .fluidInputs(AssemblyLine.getPlasma(144))
                .output(dust, Quantum, 60)
                .duration(4800).EUt(VA[UIV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, Quantum, 60)
                .output(dust, StellarAlloy, 15).output(dust, ArceusAlloy2B, 10).output(dust, Lafium, 10)
                .output(dust, Jasper, 5).output(dust, Americium, 5).output(dust, EnergyCrystal, 5)
                .output(dust, Germanium, 5).output(dust, SiliconCarbide, 5)
                .fluidOutputs(AssemblyLine.getPlasma(144))
                .duration(7200).EUt(60).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(QUANTUM_MAINFRAME_ZPM)
                .fluidInputs(Quantum.getFluid(288))
                .output(dust, Quantium)
                .duration(200).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Naquadria, 4)
                .fluidInputs(CoalTar.getFluid(1000))
                .output(dust, NaquadriaticTaranium, 5)
                .duration(500).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Quantum, 5).input(dust, Ledox, 4).input(dust, AwakenedDraconium, 3)
                .input(dust, Enderiiium, 3).input(dust, Infinity, 3).input(dust, NaquadriaticTaranium, 3)
                .input(dust, Amogus, 2)
                .output(dust, ScOpv, 23)
                .duration(2500).EUt(VA[UIV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, ScOpv, 23)
                .output(dust, Quantum, 5).output(dust, Ledox, 4).output(dust, AwakenedDraconium, 3)
                .output(dust, Enderiiium, 3).output(dust, Infinity, 3).output(dust, NaquadriaticTaranium, 3)
                .output(dust, Amogus, 2)
                .duration(2760).EUt(60).buildAndRegister();

        LABORATORY_RECIPES.recipeBuilder()
                .input(CULTURE_STEM_CELL_WIRED).input(dust, SolderingAlloy, 4).input(dust, NetherStar)
                .fluidInputs(Iron.getPlasma(144), Nickel.getPlasma(144))
                .fluidOutputs(MutatedLivingSolder.getFluid(576))
                .requireInside(CHEMICAL_RECIPES, UV, 1)
                .requireInside(CHEMICAL_BATH_RECIPES, UV, 1)
                .duration(600).EUt(VA[UHV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Iron)
                .fluidInputs(Magic2.getFluid(100))
                .output(dust, Thaumium)
                .duration(300).EUt(VA[LV]).buildAndRegister();

        for (int i = LV; i <= OpV; i++) {
            EXTRACTOR_RECIPES.recipeBuilder()
                    .input(ELECTROLYZER[i])
                    .fluidOutputs(Magic2.getFluid((int) (V[i] / 32)))
                    .duration(500).EUt(VA[i]).buildAndRegister();
        }

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Copper, 40).input(dust, Nickel, 22).input(dust, Iron, 1).input(dust, Manganese, 1)
                .circuitMeta(2)
                .output(dust, RealCupronickel, 64)
                .duration(6400).EUt(24).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, NaquadahEnriched, 8).input(dust, Holmium)
                .output(dust, EnrichedHolmium, 9)
                .duration(380).EUt(VA[LuV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(foil, Teflon, 8).input(foil, NaquadahEnriched).input(foil, EnrichedHolmium)
                .input(foil, EnrichedNaquadahAlloy).input(foil, EglinSteel).input(foil, Zeron100)
                .input(foil, HastelloyN).input(foil, TinAlloy).input(foil, TungstenSteel)
                .output(dust, EnrichedTeflon)
                .duration(420).EUt(VA[LuV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, EnrichedTeflon)
                .output(foil, NaquadahEnriched, 8).output(foil, Teflon).output(foil, EnrichedHolmium)
                .output(foil, EnrichedNaquadahAlloy).output(foil, EglinSteel).output(foil, Zeron100)
                .output(foil, HastelloyN).output(foil, TinAlloy).output(foil, TungstenSteel)
                .duration(120).EUt(60).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Infinity, 5)
                .input(dust, Shirabon, 3)
                .input(dust, ScOpv, 2)
                .input(dust, StellarAlloy, 2)
                .input(dust, ScUxv, 1)
                .input(dust, Quantum)
                .input(dust, Actinoids)
                .input(dust, Lanthanoids)
                .input(dust, Periodicium)
                .output(dust, MultiversalAlloy, 17)
                .duration(4000).EUt(VA[OpV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, MultiversalAlloy, 17)
                .output(dust, Infinity, 5).output(dust, Shirabon, 3).output(dust, ScOpv, 2)
                .output(dust, StellarAlloy, 2).output(dust, ScUxv, 1).output(dust, TastyNeutronium)
                .output(dust, Quantum).output(dust, Periodicium).output(dust, Alkalis)
                .duration(1820).EUt(60).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Rhodium, 1).input(dust, Palladium, 1).input(dust, Ruthenium, 1)
                .output(dust, Rhopalthenit, 3)
                .duration(400).EUt(VA[IV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Cadmium, 4).input(dust, Antimony, 3).input(dust, Indium, 1)
                .output(dust, HighGradeSolderingAlloy, 8)
                .duration(480).EUt(VA[IV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Aluminium, 2).input(dust, Lithium, 2).input(dust, Magnesium, 1)
                .input(dust, Scandium, 2).input(dust, Titanium, 3)
                .output(dust, ALMST, 9)
                .duration(440).EUt(VA[IV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Diamond)
                .fluidInputs(Lava.getFluid(100))
                .output(dust, IgnisCrystal)
                .duration(30).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Diamond)
                .fluidInputs(DistilledWater.getFluid(100))
                .output(dust, AquaCrystal)
                .duration(30).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Diamond)
                .fluidInputs(Polyethylene.getFluid(100))
                .output(dust, TerraCrystal)
                .duration(30).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Diamond)
                .fluidInputs(Air.getFluid(100))
                .output(dust, AerCrystal)
                .duration(30).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Diamond)
                .fluidInputs(Antimony.getFluid(100))
                .output(dust, OrdoCrystal)
                .duration(30).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Diamond)
                .fluidInputs(TinAlloy.getFluid(100))
                .output(dust, PerditioCrystal)
                .duration(30).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, IgnisCrystal, 1)
                .input(dust, AquaCrystal, 1)
                .input(dust, TerraCrystal, 1)
                .input(dust, AerCrystal, 1)
                .output(dust, EnergyCrystal, 4)
                .duration(400).EUt(VA[EV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(ingot, Arcanite)
                .notConsumable(lens, EnergyCrystal)
                .notConsumable(lens, OrdoCrystal)
                .notConsumable(lens, PerditioCrystal)
                .output(round, Arcanite, 9)
                .duration(3200).EUt(VA[UEV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, AbyssalAlloy, 8)
                .output(dust, Naquadria, 3)
                .output(dust, Taranium, 1)
                .output(dust, TungstenCarbide, 1)
                .output(dust, NetherizedDiamond, 1)
                .output(dust, Germanium, 1)
                .fluidOutputs(BlackStarMatter.getFluid(400))
                .duration(2400).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Tungsten, 9).input(dust, Naquadria, 8).input(dust, Bedrockium, 6)
                .input(dust, Vanadium, 5).input(dust, BlackSteel, 2).input(dust, Taranium).input(dust, SiliconCarbide)
                .output(dust, Tairitsu, 32)
                .duration(2400).EUt(VA[UHV]).buildAndRegister();

        IMPLOSION_RECIPES.recipeBuilder()
                .input(gemExquisite, LigniteCoal).input(gemExquisite, AnthraciteCoal)
                .input(gemExquisite, BituminousCoal).input(gemExquisite, SubBituminousCoal).input(gemExquisite, PeatCoal)
                .output(dust, CondensedCoal)
                .explosivesAmount(8)
                .duration(20).EUt(VA[MAX]).buildAndRegister();

        IMPLOSION_RECIPES.recipeBuilder()
                .input(gemExquisite, TiberiumAboreus).input(gemExquisite, TiberiumCruentus).input(gemExquisite, TiberiumRiparius)
                .input(gemExquisite, TiberiumVinifera).input(crushedCentrifuged, Originite)
                .output(dust, ExtremelyUnstableTiberium)
                .explosivesAmount(8)
                .duration(20).EUt(VA[MAX]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(ingot, Steel).input(Items.BONE)
                //.fluidInputs(Blood.getFluid(100))
                .output(ingot, BoneSteel)
                .blastFurnaceTemp(1800)
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Tungsten)
                .fluidInputs(Chlorine.getFluid(6000))
                .output(dust, TungstenHexachloride, 7)
                .duration(20 * 5).EUt(VA[EV]).buildAndRegister();

        CVD_RECIPES.recipeBuilder()
                .input(dust, TungstenHexachloride, 7)
                .fluidInputs(Hydrogen.getFluid(2000), Methane.getFluid(1000))
                .output(dust, TungstenCarbide)
                .fluidOutputs(HydrochloricAcid.getFluid(6000))
                .duration(20 * 5).EUt(VA[EV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, PostTransitionMetals).input(dust, Chrome).input(dust, Rhodium)
                .input(dust, Europium).input(dust, Rutile).input(dust, Onionium)
                .input(dust, ScUiv).input(dust, Jasper).input(dust, Shirabon)
                .output(dust, Pinkium, 9)
                .duration(1200).EUt(VA[MAX]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(RawAdamantium.getFluid(144), Krypton.getFluid(10))
                .output(ingotHot, Adamantium)
                .blastFurnaceTemp(10800)
                .duration(737).EUt(VA[UV]).buildAndRegister();
    }
}
