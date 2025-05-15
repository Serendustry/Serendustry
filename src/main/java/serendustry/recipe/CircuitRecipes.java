package serendustry.recipe;

import gregtech.api.GTValues;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.metatileentity.multiblock.CleanroomType;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.ConfigHolder;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.SValues;

import static gregtech.api.GTValues.EV;
import static gregtech.api.GTValues.HV;
import static gregtech.api.GTValues.IV;
import static gregtech.api.GTValues.L;
import static gregtech.api.GTValues.LuV;
import static gregtech.api.GTValues.MV;
import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.AUTOCLAVE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.BLAST_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_BATH_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CUTTER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.FORMING_PRESS_RECIPES;
import static gregtech.api.recipes.RecipeMaps.LASER_ENGRAVER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.MIXER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.VACUUM_RECIPES;
import static gregtech.api.unification.material.Materials.Agar;
import static gregtech.api.unification.material.Materials.Americium;
import static gregtech.api.unification.material.Materials.Argon;
import static gregtech.api.unification.material.Materials.Beryllium;
import static gregtech.api.unification.material.Materials.Calcium;
import static gregtech.api.unification.material.Materials.Cerium;
import static gregtech.api.unification.material.Materials.Chrome;
import static gregtech.api.unification.material.Materials.Diamond;
import static gregtech.api.unification.material.Materials.Electrum;
import static gregtech.api.unification.material.Materials.GalliumArsenide;
import static gregtech.api.unification.material.Materials.Glass;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.HSSE;
import static gregtech.api.unification.material.Materials.Helium;
import static gregtech.api.unification.material.Materials.Helium3;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.Iron3Chloride;
import static gregtech.api.unification.material.Materials.Krypton;
import static gregtech.api.unification.material.Materials.Meat;
import static gregtech.api.unification.material.Materials.Mutagen;
import static gregtech.api.unification.material.Materials.Naquadah;
import static gregtech.api.unification.material.Materials.Naquadria;
import static gregtech.api.unification.material.Materials.Neptunium;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.NiobiumTitanium;
import static gregtech.api.unification.material.Materials.Nitrogen;
import static gregtech.api.unification.material.Materials.Osmiridium;
import static gregtech.api.unification.material.Materials.Phosphorus;
import static gregtech.api.unification.material.Materials.Polybenzimidazole;
import static gregtech.api.unification.material.Materials.Radon;
import static gregtech.api.unification.material.Materials.RawGrowthMedium;
import static gregtech.api.unification.material.Materials.Salt;
import static gregtech.api.unification.material.Materials.SiliconeRubber;
import static gregtech.api.unification.material.Materials.SodiumPersulfate;
import static gregtech.api.unification.material.Materials.SterileGrowthMedium;
import static gregtech.api.unification.material.Materials.Tritanium;
import static gregtech.api.unification.material.Materials.Xenon;
import static gregtech.api.unification.material.Materials.Ytterbium;
import static gregtech.api.unification.material.Materials.YttriumBariumCuprate;
import static gregtech.api.unification.ore.OrePrefix.block;
import static gregtech.api.unification.ore.OrePrefix.bolt;
import static gregtech.api.unification.ore.OrePrefix.cableGtSingle;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.dustSmall;
import static gregtech.api.unification.ore.OrePrefix.dustTiny;
import static gregtech.api.unification.ore.OrePrefix.foil;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.gem;
import static gregtech.api.unification.ore.OrePrefix.gemExquisite;
import static gregtech.api.unification.ore.OrePrefix.gemFlawless;
import static gregtech.api.unification.ore.OrePrefix.ingot;
import static gregtech.api.unification.ore.OrePrefix.lens;
import static gregtech.api.unification.ore.OrePrefix.pipeSmallFluid;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.api.unification.ore.OrePrefix.ring;
import static gregtech.api.unification.ore.OrePrefix.screw;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.api.unification.ore.OrePrefix.wireFine;
import static gregtech.api.unification.ore.OrePrefix.wireGtDouble;
import static gregtech.common.items.MetaItems.ADVANCED_SYSTEM_ON_CHIP_WAFER;
import static gregtech.common.items.MetaItems.CENTRAL_PROCESSING_UNIT_WAFER;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_LuV;
import static gregtech.common.items.MetaItems.ELITE_CIRCUIT_BOARD;
import static gregtech.common.items.MetaItems.EMITTER_UHV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UHV;
import static gregtech.common.items.MetaItems.HIGHLY_ADVANCED_SOC;
import static gregtech.common.items.MetaItems.HIGHLY_ADVANCED_SOC_WAFER;
import static gregtech.common.items.MetaItems.HIGH_POWER_INTEGRATED_CIRCUIT_WAFER;
import static gregtech.common.items.MetaItems.INTEGRATED_LOGIC_CIRCUIT_WAFER;
import static gregtech.common.items.MetaItems.LOW_POWER_INTEGRATED_CIRCUIT_WAFER;
import static gregtech.common.items.MetaItems.MULTILAYER_FIBER_BOARD;
import static gregtech.common.items.MetaItems.NAND_MEMORY_CHIP_WAFER;
import static gregtech.common.items.MetaItems.NANO_CENTRAL_PROCESSING_UNIT_WAFER;
import static gregtech.common.items.MetaItems.NAQUADAH_BOULE;
import static gregtech.common.items.MetaItems.NEURO_PROCESSOR;
import static gregtech.common.items.MetaItems.NOR_MEMORY_CHIP;
import static gregtech.common.items.MetaItems.NOR_MEMORY_CHIP_WAFER;
import static gregtech.common.items.MetaItems.PHOSPHORUS_BOULE;
import static gregtech.common.items.MetaItems.POWER_INTEGRATED_CIRCUIT_WAFER;
import static gregtech.common.items.MetaItems.QUBIT_CENTRAL_PROCESSING_UNIT_WAFER;
import static gregtech.common.items.MetaItems.RANDOM_ACCESS_MEMORY;
import static gregtech.common.items.MetaItems.RANDOM_ACCESS_MEMORY_WAFER;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UHV;
import static gregtech.common.items.MetaItems.SENSOR_IV;
import static gregtech.common.items.MetaItems.SILICON_BOULE;
import static gregtech.common.items.MetaItems.SIMPLE_SYSTEM_ON_CHIP_WAFER;
import static gregtech.common.items.MetaItems.SYSTEM_ON_CHIP_WAFER;
import static gregtech.common.items.MetaItems.ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT_WAFER;
import static gregtech.common.items.MetaItems.ULTRA_LOW_POWER_INTEGRATED_CIRCUIT_WAFER;
import static gregtech.common.items.MetaItems.WETWARE_BOARD;
import static gregtech.common.items.MetaItems.WETWARE_CIRCUIT_BOARD;
import static gregtech.common.items.MetaItems.WETWARE_PROCESSOR_LUV;
import static gregtech.common.metatileentities.MetaTileEntities.LASER_ENGRAVER;
import static serendustry.item.SerendustryMetaItems.ACTIVATED_APU_CHIP;
import static serendustry.item.SerendustryMetaItems.ACTIVATED_APU_WAFER;
import static serendustry.item.SerendustryMetaItems.CHIP_OPIC;
import static serendustry.item.SerendustryMetaItems.CIRC_ENTROPIC_UEV;
import static serendustry.item.SerendustryMetaItems.CIRC_ENTROPIC_UHV;
import static serendustry.item.SerendustryMetaItems.CIRC_ENTROPIC_UIV;
import static serendustry.item.SerendustryMetaItems.CIRC_ENTROPIC_UV;
import static serendustry.item.SerendustryMetaItems.CIRC_POSITRONIC_UEV;
import static serendustry.item.SerendustryMetaItems.CIRC_POSITRONIC_UHV;
import static serendustry.item.SerendustryMetaItems.CIRC_POSITRONIC_UV;
import static serendustry.item.SerendustryMetaItems.CIRC_POSITRONIC_ZPM;
import static serendustry.item.SerendustryMetaItems.COSMIC_CIRCUIT_BOARD;
import static serendustry.item.SerendustryMetaItems.CULTURE_STEM_CELL;
import static serendustry.item.SerendustryMetaItems.CULTURE_STEM_CELL_WIRED;
import static serendustry.item.SerendustryMetaItems.ENGRAVED_POSITRONIC_CHIP;
import static serendustry.item.SerendustryMetaItems.ENTROPIC_CIRCUIT_BOARD;
import static serendustry.item.SerendustryMetaItems.ENTROPIC_SOC_CHIP;
import static serendustry.item.SerendustryMetaItems.ENTROPIC_SOC_WAFER;
import static serendustry.item.SerendustryMetaItems.INACTIVE_APU_WAFER;
import static serendustry.item.SerendustryMetaItems.LENS_ARRAY_HYPERAMPLIFYING;
import static serendustry.item.SerendustryMetaItems.LENS_ARRAY_HYPERPRECISE;
import static serendustry.item.SerendustryMetaItems.MASK_APU;
import static serendustry.item.SerendustryMetaItems.MASK_ASOC;
import static serendustry.item.SerendustryMetaItems.MASK_BLANK;
import static serendustry.item.SerendustryMetaItems.MASK_CPU;
import static serendustry.item.SerendustryMetaItems.MASK_HASOC;
import static serendustry.item.SerendustryMetaItems.MASK_HPIC;
import static serendustry.item.SerendustryMetaItems.MASK_ILC;
import static serendustry.item.SerendustryMetaItems.MASK_LPIC;
import static serendustry.item.SerendustryMetaItems.MASK_NAND;
import static serendustry.item.SerendustryMetaItems.MASK_NCPU;
import static serendustry.item.SerendustryMetaItems.MASK_NOR;
import static serendustry.item.SerendustryMetaItems.MASK_PIC;
import static serendustry.item.SerendustryMetaItems.MASK_QCPU;
import static serendustry.item.SerendustryMetaItems.MASK_RAM;
import static serendustry.item.SerendustryMetaItems.MASK_SOC;
import static serendustry.item.SerendustryMetaItems.MASK_SSOC;
import static serendustry.item.SerendustryMetaItems.MASK_UHPIC;
import static serendustry.item.SerendustryMetaItems.MASK_ULPIC;
import static serendustry.item.SerendustryMetaItems.ORUNDUM_BOULE;
import static serendustry.item.SerendustryMetaItems.ORUNDUM_SEED_CRYSTAL;
import static serendustry.item.SerendustryMetaItems.PETRI_DISH_STERILIZED;
import static serendustry.item.SerendustryMetaItems.POSITRONIC_CHIP;
import static serendustry.item.SerendustryMetaItems.POSITRONIC_SOC_CHIP;
import static serendustry.item.SerendustryMetaItems.POSITRONIC_SOC_WAFER;
import static serendustry.item.SerendustryMetaItems.RAW_ORUNDUM_WAFER;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_END;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_NETHER;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_OVERWORLD;
import static serendustry.item.SerendustryMetaItems.SUPREME_SMD_CAPACITOR;
import static serendustry.item.SerendustryMetaItems.SUPREME_SMD_DIODE;
import static serendustry.item.SerendustryMetaItems.SUPREME_SMD_INDUCTOR;
import static serendustry.item.SerendustryMetaItems.SUPREME_SMD_RESISTOR;
import static serendustry.item.SerendustryMetaItems.SUPREME_SMD_TRANSISTOR;
import static serendustry.item.SerendustryMetaItems.TIME_CRYSTAL;
import static serendustry.item.SerendustryMetaItems.WAFER_OPIC;
import static serendustry.item.SerendustryMetaItems.WRAPPED_ORUNDUM_WAFER;
import static serendustry.item.material.SerendustryMaterials.AbyssalAlloy;
import static serendustry.item.material.SerendustryMaterials.Adamantium;
import static serendustry.item.material.SerendustryMaterials.AwakenedDraconium;
import static serendustry.item.material.SerendustryMaterials.Azbantium;
import static serendustry.item.material.SerendustryMaterials.BlackStarMatter;
import static serendustry.item.material.SerendustryMaterials.CarbonNanotubes;
import static serendustry.item.material.SerendustryMaterials.ChromaticGlass;
import static serendustry.item.material.SerendustryMaterials.CondensedStarMatter;
import static serendustry.item.material.SerendustryMaterials.Gadonanotubes;
import static serendustry.item.material.SerendustryMaterials.HalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.HighGradeSolderingAlloy;
import static serendustry.item.material.SerendustryMaterials.Hihiirokane;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.IrradiatedDiamond;
import static serendustry.item.material.SerendustryMaterials.LCNS;
import static serendustry.item.material.SerendustryMaterials.LaminatedBoPET;
import static serendustry.item.material.SerendustryMaterials.MolybdeniteLubricant;
import static serendustry.item.material.SerendustryMaterials.NVCDiamond;
import static serendustry.item.material.SerendustryMaterials.NaquadriaticTaranium;
import static serendustry.item.material.SerendustryMaterials.Originium;
import static serendustry.item.material.SerendustryMaterials.Orundum;
import static serendustry.item.material.SerendustryMaterials.PositroniumHydride;
import static serendustry.item.material.SerendustryMaterials.QCDM;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;
import static serendustry.item.material.SerendustryMaterials.Rhugnor;
import static serendustry.item.material.SerendustryMaterials.ScUevSane;
import static serendustry.item.material.SerendustryMaterials.SelfRepairingNanobots;
import static serendustry.item.material.SerendustryMaterials.SemiconductorGradeSilicon;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.item.material.SerendustryMaterials.Taranium;
import static serendustry.item.material.SerendustryMaterials.TengamAttuned;
import static serendustry.item.material.SerendustryMaterials.TiberiumAboreus;
import static serendustry.item.material.SerendustryMaterials.TiberiumCruentus;
import static serendustry.item.material.SerendustryMaterials.TiberiumRiparius;
import static serendustry.item.material.SerendustryMaterials.TiberiumVinifera;
import static serendustry.item.material.SerendustryMaterials.Vibranium;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;
import static serendustry.item.material.SerendustryMaterials.YeastExtract;
import static serendustry.machine.SerendustryMetaTileEntities.HP_LASER_ARRAY;
import static serendustry.machine.SerendustryRecipeMaps.CRYSTALLIZER_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.CVD_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.HP_LASER_ARRAY_RECIPES;

public class CircuitRecipes {

    public static void init() {
        waferRecipes();
        boardRecipes();
        componentRecipes();
        circuitRecipes();
    }

    private static void waferRecipes() {
        BLAST_RECIPES.recipeBuilder()
                .input(dust, SemiconductorGradeSilicon, 16)
                .input(dustSmall, GalliumArsenide)
                .circuitMeta(2)
                .output(SILICON_BOULE)
                .blastFurnaceTemp(1784)
                .duration(400 * 20).EUt(VA[MV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, SemiconductorGradeSilicon, 64)
                .input(dust, Phosphorus, 8)
                .input(dustSmall, GalliumArsenide, 2)
                .fluidInputs(Nitrogen.getFluid(8000))
                .output(PHOSPHORUS_BOULE)
                .blastFurnaceTemp(2484)
                .duration(600 * 20).EUt(VA[HV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(block, SemiconductorGradeSilicon, 16)
                .input(ingot, Naquadah)
                .input(dust, GalliumArsenide)
                .fluidInputs(Argon.getFluid(8000))
                .output(NAQUADAH_BOULE)
                .blastFurnaceTemp(5400)
                .duration(750 * 20).EUt(VA[EV]).buildAndRegister();

        CRYSTALLIZER_RECIPES.recipeBuilder()
                .notConsumable(stickLong, Osmiridium)
                .input(dust, SemiconductorGradeSilicon, 16 * 3)
                .input(dustSmall, GalliumArsenide, 3)
                .fluidInputs(Nitrogen.getFluid(FluidStorageKeys.LIQUID, 2000))
                .output(SILICON_BOULE, 4)
                .duration(400 * 20 * 4 / 32 / 8).EUt(VA[ZPM]).buildAndRegister();

        CRYSTALLIZER_RECIPES.recipeBuilder()
                .notConsumable(stickLong, Adamantium)
                .input(dust, SemiconductorGradeSilicon, 64 * 3)
                .input(dust, Phosphorus, 8 * 3)
                .input(dustSmall, GalliumArsenide, 2 * 3)
                .fluidInputs(Helium.getFluid(FluidStorageKeys.LIQUID, 8000))
                .output(PHOSPHORUS_BOULE, 4)
                .duration(600 * 20 * 4 / 16 / 8).EUt(VA[ZPM]).buildAndRegister();

        CRYSTALLIZER_RECIPES.recipeBuilder()
                .notConsumable(stickLong, VibraniumAlloy)
                .input(block, SemiconductorGradeSilicon, 16 * 3)
                .input(ingot, Naquadah, 3)
                .input(dust, GalliumArsenide, 3)
                .fluidInputs(Helium.getFluid(FluidStorageKeys.LIQUID, 16000))
                .output(NAQUADAH_BOULE, 4)
                .duration(750 * 20 * 4 / 8 / 8).EUt(VA[ZPM]).buildAndRegister();

        CVD_RECIPES.recipeBuilder()
                .input(dust, Originium, 4)
                .input(dust, SemiconductorGradeSilicon, 2)
                .input(dust, Naquadria)
                .input(dust, Cerium)
                .fluidInputs(Xenon.getFluid(100))
                .output(dust, Orundum, 8)
                .duration(200 * 20).EUt(VA[UHV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(gemExquisite, Orundum, 8)
                .fluidInputs(Neutronium.getFluid(144 * 32))
                .output(ORUNDUM_SEED_CRYSTAL)
                .cleanroom(CleanroomType.CLEANROOM)
                .duration(400 * 20).EUt(VA[UHV]).buildAndRegister();

        CRYSTALLIZER_RECIPES.recipeBuilder()
                .notConsumable(stickLong, Neutronium)
                .input(ORUNDUM_SEED_CRYSTAL)
                .input(gemExquisite, Orundum)
                .fluidInputs(Xenon.getFluid(16000))
                .output(ORUNDUM_BOULE)
                .duration(200 * 20).EUt(VA[UV]).buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(ORUNDUM_BOULE)
                .output(RAW_ORUNDUM_WAFER, 64)
                .output(ORUNDUM_SEED_CRYSTAL)
                .fluidInputs(MolybdeniteLubricant.getFluid(500))
                .cleanroom(CleanroomType.CLEANROOM)
                .duration(40 * 20).EUt(VA[UV]).buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(RAW_ORUNDUM_WAFER)
                .input(foil, RadoxPolymer)
                .input(foil, Hihiirokane)
                .output(WRAPPED_ORUNDUM_WAFER)
                .cleanroom(CleanroomType.CLEANROOM)
                .duration(20 * 20).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT_WAFER)
                .input(dust, Orundum)
                .fluidInputs(Naquadria.getFluid(L * 16))
                .output(WAFER_OPIC)
                .cleanroom(CleanroomType.CLEANROOM)
                .duration(600).EUt(VA[UHV]).buildAndRegister();

        CUTTER_RECIPES.recipeBuilder().duration(600).EUt(VA[UV]).input(WAFER_OPIC)
                .fluidInputs(MolybdeniteLubricant.getFluid(250))
                .output(CHIP_OPIC, 2).cleanroom(CleanroomType.CLEANROOM).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium, 8)
                .input(FIELD_GENERATOR_UHV, 8)
                .input(ROBOT_ARM_UHV, 8)
                .input(EMITTER_UHV, 8)
                .input(circuit, MarkerMaterials.Tier.UHV, 16)
                .inputs(MetaBlocks.TRANSPARENT_CASING.getItemVariant(
                        BlockGlassCasing.CasingType.FUSION_GLASS, 16))
                .input(plate, Neutronium, 32)
                .input(screw, VibraniumAlloy, 64)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 8),
                        MolybdeniteLubricant.getFluid(32000),
                        Naquadria.getFluid(144 * 16))
                .output(HP_LASER_ARRAY)
                .stationResearch(b -> b
                        .researchStack(LASER_ENGRAVER[UHV].getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(6400).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(lens, Orundum, 4)
                .input(gemExquisite, Orundum, 4)
                .input(gemExquisite, TiberiumRiparius, 8)
                .input(gemExquisite, TiberiumVinifera, 8)
                .input(gemExquisite, Azbantium, 16)
                .input(foil, Naquadria, 64)
                .input(cableGtSingle, Hihiirokane, 32)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 16))
                .output(LENS_ARRAY_HYPERAMPLIFYING)
                .duration(1200).EUt(VA[UHV]).buildAndRegister();

        HP_LASER_ARRAY_RECIPES.recipeBuilder()
                .notConsumable(LENS_ARRAY_HYPERAMPLIFYING)
                .input(lens, Glass)
                .input(dust, Glass, 64)
                .output(dust, ChromaticGlass)
                .fluidOutputs(Glass.getFluid(144 * 16),
                        ChromaticGlass.getFluid(72))
                .duration(24).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(lens, ChromaticGlass, 4)
                .input(gemExquisite, ChromaticGlass, 4)
                .input(gemExquisite, TiberiumCruentus, 8)
                .input(gemExquisite, TiberiumAboreus, 8)
                .input(gemExquisite, Azbantium, 16)
                .input(foil, Naquadria, 64)
                .input(cableGtSingle, Hihiirokane, 32)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 16))
                .output(LENS_ARRAY_HYPERPRECISE)
                .duration(1200).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(foil, LaminatedBoPET, 16)
                .input(foil, Polybenzimidazole, 64)
                .input(WRAPPED_ORUNDUM_WAFER)
                .fluidInputs(Chrome.getFluid(144 * 8))
                .output(MASK_BLANK, 64)
                .duration(20 * 40).EUt(VA[UHV]).buildAndRegister();

        MetaItem.MetaValueItem[] wafers = { INTEGRATED_LOGIC_CIRCUIT_WAFER, RANDOM_ACCESS_MEMORY_WAFER,
                CENTRAL_PROCESSING_UNIT_WAFER, NAND_MEMORY_CHIP_WAFER,
                NOR_MEMORY_CHIP_WAFER, SIMPLE_SYSTEM_ON_CHIP_WAFER, SYSTEM_ON_CHIP_WAFER, ADVANCED_SYSTEM_ON_CHIP_WAFER,
                HIGHLY_ADVANCED_SOC_WAFER,
                ULTRA_LOW_POWER_INTEGRATED_CIRCUIT_WAFER, LOW_POWER_INTEGRATED_CIRCUIT_WAFER,
                POWER_INTEGRATED_CIRCUIT_WAFER, HIGH_POWER_INTEGRATED_CIRCUIT_WAFER,
                ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT_WAFER, NANO_CENTRAL_PROCESSING_UNIT_WAFER,
                QUBIT_CENTRAL_PROCESSING_UNIT_WAFER };
        MetaItem.MetaValueItem[] masks = { MASK_ILC, MASK_RAM, MASK_CPU, MASK_NAND, MASK_NOR, MASK_SSOC, MASK_SOC,
                MASK_ASOC, MASK_HASOC,
                MASK_ULPIC, MASK_LPIC, MASK_PIC, MASK_HPIC, MASK_UHPIC, MASK_NCPU, MASK_QCPU };
        int[] amount = { 16, 16, 16, 8, 8, 16, 8, 2, 1, 16, 16, 8, 4, 1, 8, 4 };

        for (int i = 0; i < wafers.length; i++) {
            LASER_ENGRAVER_RECIPES.recipeBuilder()
                    .notConsumable(lens, ChromaticGlass)
                    .input(MASK_BLANK, 64)
                    .input(wafers[i])
                    .output(masks[i], 64)
                    .duration(800).EUt(VA[UHV]).buildAndRegister();

            HP_LASER_ARRAY_RECIPES.recipeBuilder()
                    .notConsumable(LENS_ARRAY_HYPERPRECISE)
                    .input(masks[i])
                    .input(WRAPPED_ORUNDUM_WAFER)
                    .output(wafers[i], amount[i] * 16)
                    .duration(20).EUt(VA[UHV]).buildAndRegister();
        }

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .notConsumable(lens, Orundum)
                .input(MASK_BLANK, 64)
                .input(INACTIVE_APU_WAFER)
                .output(MASK_APU, 64)
                .duration(1600).EUt(VA[UHV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .notConsumable(lens, ChromaticGlass)
                .input(WRAPPED_ORUNDUM_WAFER)
                .fluidInputs(Neutronium.getFluid(288))
                .output(HIGHLY_ADVANCED_SOC_WAFER)
                .duration(1600).EUt(VA[UHV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .notConsumable(lens, Orundum)
                .input(WRAPPED_ORUNDUM_WAFER)
                .fluidInputs(Originium.getFluid(288))
                .output(INACTIVE_APU_WAFER)
                .duration(2400).EUt(VA[UHV]).buildAndRegister();

        HP_LASER_ARRAY_RECIPES.recipeBuilder()
                .notConsumable(LENS_ARRAY_HYPERPRECISE)
                .input(MASK_APU)
                .input(WRAPPED_ORUNDUM_WAFER)
                .fluidInputs(Originium.getFluid(36))
                .output(INACTIVE_APU_WAFER)
                .duration(20 * 8).EUt(VA[UHV]).buildAndRegister();

        HP_LASER_ARRAY_RECIPES.recipeBuilder()
                .notConsumable(LENS_ARRAY_HYPERAMPLIFYING)
                .input(lens, ChromaticGlass)
                .input(plate, Gold, 64)
                .fluidInputs(Hydrogen.getFluid(200000))
                .fluidOutputs(Gold.getFluid(144 * 16), ChromaticGlass.getFluid(112), PositroniumHydride.getFluid(250))
                .duration(20).EUt(VA[UHV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(INACTIVE_APU_WAFER)
                .fluidInputs(PositroniumHydride.getFluid(1000))
                .output(ACTIVATED_APU_WAFER)
                .duration(20 * 40).EUt(VA[UHV]).buildAndRegister();

        CUTTER_RECIPES.recipeBuilder().duration(20 * 40).EUt(VA[UV]).input(ACTIVATED_APU_WAFER)
                .fluidInputs(MolybdeniteLubricant.getFluid(250))
                .output(ACTIVATED_APU_CHIP, 6).cleanroom(CleanroomType.CLEANROOM).buildAndRegister();

        // Posi SoC
        HP_LASER_ARRAY_RECIPES.recipeBuilder()
                .input(HIGHLY_ADVANCED_SOC_WAFER)
                .input(ENGRAVED_POSITRONIC_CHIP)
                .input(foil, QCDM)
                .fluidInputs(Nitrogen.getPlasma(100))
                .output(POSITRONIC_SOC_WAFER)
                .duration(20 * 20).EUt(VA[UEV]).buildAndRegister();

        CUTTER_RECIPES.recipeBuilder().duration(20 * 10).EUt(VA[UHV]).input(POSITRONIC_SOC_WAFER)
                .fluidInputs(MolybdeniteLubricant.getFluid(250))
                .output(POSITRONIC_SOC_CHIP, 6).cleanroom(CleanroomType.CLEANROOM).buildAndRegister();

        // Entrop SoC
        HP_LASER_ARRAY_RECIPES.recipeBuilder()
                .input(HIGHLY_ADVANCED_SOC_WAFER)
                .input(TIME_CRYSTAL)
                .input(foil, Infinity)
                .fluidInputs(Neptunium.getFluid(36))
                .output(ENTROPIC_SOC_WAFER)
                .duration(20 * 20).EUt(VA[UIV]).buildAndRegister();

        CUTTER_RECIPES.recipeBuilder().duration(20 * 10).EUt(VA[UEV]).input(ENTROPIC_SOC_WAFER)
                .fluidInputs(MolybdeniteLubricant.getFluid(250))
                .output(ENTROPIC_SOC_CHIP, 6).cleanroom(CleanroomType.CLEANROOM).buildAndRegister();
    }

    private static void boardRecipes() {
        CHEMICAL_RECIPES.recipeBuilder().duration(1500).EUt(VA[MV])
                .input(MULTILAYER_FIBER_BOARD)
                .input(foil, CarbonNanotubes, 8)
                .fluidInputs(SodiumPersulfate.getFluid(4000))
                .output(ELITE_CIRCUIT_BOARD)
                .cleanroom(CleanroomType.CLEANROOM)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(1500).EUt(VA[MV])
                .input(MULTILAYER_FIBER_BOARD)
                .input(foil, CarbonNanotubes, 8)
                .fluidInputs(Iron3Chloride.getFluid(2000))
                .output(ELITE_CIRCUIT_BOARD)
                .cleanroom(CleanroomType.CLEANROOM)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Meat, 4)
                .input(dust, Salt, 4)
                .input(dust, Calcium, 4)
                .input(dust, Agar, 4)
                .input(dust, YeastExtract, 4)
                .fluidInputs(Mutagen.getFluid(4000))
                .fluidOutputs(RawGrowthMedium.getFluid(4000))
                .EUt(VA[IV]).duration(60 * 20).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(VA[LuV]).duration(60 * 20)
                .input(MULTILAYER_FIBER_BOARD, 16)
                .input(PETRI_DISH_STERILIZED)
                .input(ELECTRIC_PUMP_LuV)
                .input(SENSOR_IV)
                .input(circuit, MarkerMaterials.Tier.IV)
                .input(foil, NiobiumTitanium, 16)
                .fluidInputs(SterileGrowthMedium.getFluid(4000))
                .output(WETWARE_BOARD, 16)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(CULTURE_STEM_CELL)
                .input(screw, Osmiridium, 4)
                .input(cableGtSingle, YttriumBariumCuprate, 2)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144))
                .output(CULTURE_STEM_CELL_WIRED)
                .cleanroom(CleanroomType.STERILE_CLEANROOM)
                .EUt(80000).duration(200).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().EUt(80000).duration(600)
                .input(WETWARE_CIRCUIT_BOARD)
                .input(CULTURE_STEM_CELL_WIRED)
                .input(pipeSmallFluid, Polybenzimidazole, 8)
                .input(plate, Electrum, 8)
                .input(foil, SiliconeRubber, 16)
                .input(bolt, HSSE, 8)
                .fluidInputs(SterileGrowthMedium.getFluid(250))
                .output(NEURO_PROCESSOR)
                .cleanroom(CleanroomType.STERILE_CLEANROOM)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(plate, RadoxPolymer)
                .input(foil, Gadonanotubes, 8)
                .fluidInputs(Originium.getFluid(32), RadoxPolymer.getFluid(144), ChromaticGlass.getFluid(288))
                .output(COSMIC_CIRCUIT_BOARD)
                .cleanroom(CleanroomType.CLEANROOM)
                .EUt(VA[UHV]).duration(1000).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(COSMIC_CIRCUIT_BOARD)
                .input(foil, Taranium, 2)
                .fluidInputs(LCNS.getFluid(1000), RadoxPolymer.getFluid(144 * 2), ChromaticGlass.getFluid(288 * 2))
                .output(ENTROPIC_CIRCUIT_BOARD)
                .cleanroom(CleanroomType.CLEANROOM)
                .EUt(VA[UEV]).duration(1000).buildAndRegister();
    }

    private static void componentRecipes() {
        // SMDs
        ASSEMBLER_RECIPES.recipeBuilder()
                .input(dust, Vibranium)
                .input(wireFine, Gadonanotubes, 4)
                .fluidInputs(RadoxPolymer.getFluid(72))
                .output(SUPREME_SMD_RESISTOR, 8)
                .cleanroom(CleanroomType.CLEANROOM)
                .EUt(VA[UHV]).duration(320).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(foil, Originium)
                .input(wireFine, Naquadria, 8)
                .fluidInputs(RadoxPolymer.getFluid(72))
                .output(SUPREME_SMD_TRANSISTOR, 8)
                .cleanroom(CleanroomType.CLEANROOM)
                .EUt(VA[UHV]).duration(320).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(foil, Gadonanotubes, 2)
                .input(foil, ChromaticGlass, 2)
                .fluidInputs(RadoxPolymer.getFluid(72))
                .output(SUPREME_SMD_CAPACITOR, 8)
                .cleanroom(CleanroomType.CLEANROOM)
                .EUt(VA[UHV]).duration(320).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(dust, ChromaticGlass)
                .input(wireFine, Orundum, 4)
                .fluidInputs(RadoxPolymer.getFluid(72))
                .output(SUPREME_SMD_DIODE, 8)
                .cleanroom(CleanroomType.CLEANROOM)
                .EUt(VA[UHV]).duration(320).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ring, Neutronium)
                .input(wireFine, Hihiirokane, 4)
                .fluidInputs(RadoxPolymer.getFluid(72))
                .output(SUPREME_SMD_INDUCTOR, 8)
                .cleanroom(CleanroomType.CLEANROOM)
                .EUt(VA[UHV]).duration(320).buildAndRegister();

        CVD_RECIPES.recipeBuilder()
                .input(dust, Orundum)
                .fluidInputs(Originium.getFluid(16), Krypton.getFluid(500))
                .output(wireFine, Orundum, 8)
                .duration(25 * 20).EUt(VA[UHV]).buildAndRegister();

        CVD_RECIPES.recipeBuilder()
                .input(dust, ChromaticGlass)
                .fluidInputs(ChromaticGlass.getFluid(16), Krypton.getFluid(500))
                .output(foil, ChromaticGlass, 4)
                .duration(25 * 20).EUt(VA[UHV]).buildAndRegister();

        // Positronic
        HP_LASER_ARRAY_RECIPES.recipeBuilder()
                .input(lens, Diamond)
                .input(gemExquisite, Diamond)
                .notConsumable(LENS_ARRAY_HYPERAMPLIFYING)
                .fluidInputs(Americium.getFluid(144), Beryllium.getFluid(144))
                .chancedOutput(dustTiny, IrradiatedDiamond, 2500, 0)
                .chancedOutput(dustSmall, IrradiatedDiamond, 2500, 0)
                .chancedOutput(dust, IrradiatedDiamond, 2000, 0)
                .chancedOutput(gem, IrradiatedDiamond, 1500, 0)
                .chancedOutput(gemFlawless, IrradiatedDiamond, 1000, 0)
                .chancedOutput(gemExquisite, IrradiatedDiamond, 500, 0)
                .fluidOutputs(Diamond.getFluid(72))
                .duration(20 * 4).EUt(VA[UHV]).buildAndRegister();

        OrePrefix[] gems = { gem, gemFlawless, gemExquisite };
        int[] chance = { 2500, 5000, 10000 };

        for (int i = 0; i < gems.length; i++) {
            BLAST_RECIPES.recipeBuilder()
                    .input(gems[i], IrradiatedDiamond)
                    .fluidInputs(Radon.getFluid(2000))
                    .output(gems[i], NVCDiamond)
                    .duration(20 * 20).EUt(VA[UHV]).buildAndRegister();

            CUTTER_RECIPES.recipeBuilder()
                    .input(gems[i], NVCDiamond)
                    .fluidInputs(PositroniumHydride.getFluid(100))
                    .chancedOutput(POSITRONIC_CHIP, chance[i], 0)
                    .duration(20 * 20).EUt(VA[UHV]).buildAndRegister();
        }

        HP_LASER_ARRAY_RECIPES.recipeBuilder()
                .notConsumable(LENS_ARRAY_HYPERAMPLIFYING)
                .input(lens, Orundum)
                .input(POSITRONIC_CHIP)
                .input(plate, Neutronium)
                .fluidInputs(Naquadria.getFluid(144 * 2),
                        Tritanium.getFluid(144 * 2))
                .output(ENGRAVED_POSITRONIC_CHIP)
                .fluidOutputs(Orundum.getFluid(128))
                .duration(20 * 100).EUt(VA[UHV]).buildAndRegister();

        // Entropic
        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(Helium3.getFluid(1000))
                .fluidOutputs(Helium3.getFluid(FluidStorageKeys.LIQUID, 1000))
                .duration(240).EUt(VA[EV]).buildAndRegister();

        CRYSTALLIZER_RECIPES.recipeBuilder()
                .input(dust, NVCDiamond, 16)
                .input(dust, Ytterbium, 8)
                .fluidInputs(BlackStarMatter.getFluid(2000),
                        Helium3.getFluid(FluidStorageKeys.LIQUID, 8000))
                .output(TIME_CRYSTAL)
                .duration(20 * 60 * 4).EUt(VA[UEV]).buildAndRegister();
    }

    private static void circuitRecipes() {
        int outputAmount = ConfigHolder.recipes.harderCircuitRecipes ? 1 : 2;

        // Any X Circuit
        for (int i = GTValues.ULV; i <= GTValues.MAX; i++) {
            FORMING_PRESS_RECIPES.recipeBuilder()
                    .input(circuit, SValues.TIER_MARKER_MATERIAL[i])
                    .circuitMeta(1)
                    .output(SValues.TIER_ANY_CIRCUIT[i])
                    .duration(1).EUt(1).buildAndRegister();

            FORMING_PRESS_RECIPES.recipeBuilder()
                    .input(circuit, SValues.TIER_MARKER_MATERIAL[i], 64)
                    .circuitMeta(2)
                    .output(SValues.TIER_ANY_CIRCUIT[i], 64)
                    .duration(1).EUt(1).buildAndRegister();
        }

        // T7: Wetware =================================================================================================

        // SoC LuV
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .notConsumable(STELLAR_ESSENCE_OVERWORLD)
                .input(NEURO_PROCESSOR)
                .input(HIGHLY_ADVANCED_SOC)
                .input(wireFine, YttriumBariumCuprate, 8)
                .input(bolt, Naquadah, 8)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144))
                .output(WETWARE_PROCESSOR_LUV, outputAmount * 2)
                .cleanroom(CleanroomType.CLEANROOM)
                .EUt(VA[UV]).duration(20 * 5).buildAndRegister();

        // T8: Positronic ==============================================================================================

        // ZPM
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(COSMIC_CIRCUIT_BOARD)
                .input(ENGRAVED_POSITRONIC_CHIP)
                .input(ACTIVATED_APU_CHIP)
                .input(SUPREME_SMD_CAPACITOR, 16)
                .input(SUPREME_SMD_TRANSISTOR, 16)
                .input(wireFine, Hihiirokane, 16)
                .fluidInputs(SelfRepairingNanobots.getFluid(144))
                .output(CIRC_POSITRONIC_ZPM, outputAmount)
                .cleanroom(CleanroomType.CLEANROOM)
                .duration(20 * 10).EUt(VA[UHV]).buildAndRegister();

        // SoC ZPM
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .notConsumable(STELLAR_ESSENCE_NETHER)
                .input(COSMIC_CIRCUIT_BOARD)
                .input(POSITRONIC_SOC_CHIP)
                .input(wireFine, Hihiirokane, 16)
                .input(bolt, NaquadriaticTaranium, 4)
                .fluidInputs(SelfRepairingNanobots.getFluid(144))
                .output(CIRC_POSITRONIC_ZPM, outputAmount * 2)
                .cleanroom(CleanroomType.CLEANROOM)
                .duration(20 * 5).EUt(VA[UEV]).buildAndRegister();

        // UV
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(COSMIC_CIRCUIT_BOARD)
                .input(CIRC_POSITRONIC_ZPM, 2)
                .input(SUPREME_SMD_RESISTOR, 8)
                .input(SUPREME_SMD_TRANSISTOR, 8)
                .input(SUPREME_SMD_CAPACITOR, 8)
                .input(SUPREME_SMD_DIODE, 8)
                .input(SUPREME_SMD_INDUCTOR, 8)
                .input(RANDOM_ACCESS_MEMORY, 32)
                .input(wireFine, Hihiirokane, 16)
                .input(foil, Adamantium, 16)
                .input(plate, VibraniumAlloy, 4)
                .fluidInputs(SelfRepairingNanobots.getFluid(144))
                .output(CIRC_POSITRONIC_UV)
                .stationResearch(b -> b
                        .researchStack(CIRC_POSITRONIC_ZPM.getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(20 * 20).EUt(VA[UHV]).buildAndRegister();

        // UHV
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(COSMIC_CIRCUIT_BOARD)
                .input(CIRC_POSITRONIC_UV, 2)
                .input(SUPREME_SMD_RESISTOR, 16)
                .input(SUPREME_SMD_TRANSISTOR, 16)
                .input(SUPREME_SMD_CAPACITOR, 16)
                .input(SUPREME_SMD_DIODE, 16)
                .input(SUPREME_SMD_INDUCTOR, 16)
                .input(NOR_MEMORY_CHIP, 32)
                .input(RANDOM_ACCESS_MEMORY, 64)
                .input(wireFine, Hihiirokane, 24)
                .input(foil, LaminatedBoPET, 16)
                .input(plate, Neutronium, 4)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 4))
                .output(CIRC_POSITRONIC_UHV)
                .stationResearch(b -> b
                        .researchStack(CIRC_POSITRONIC_UV.getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(20 * 20).EUt(VA[UHV]).buildAndRegister();

        // UEV
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium, 2)
                .input(CIRC_POSITRONIC_UHV, 2)
                .input(SUPREME_SMD_RESISTOR, 32)
                .input(SUPREME_SMD_TRANSISTOR, 32)
                .input(SUPREME_SMD_CAPACITOR, 32)
                .input(SUPREME_SMD_DIODE, 32)
                .input(SUPREME_SMD_INDUCTOR, 32)
                .input(foil, AbyssalAlloy, 16)
                .input(foil, RadoxPolymer, 8)
                .input(foil, SelfRepairingNanobots, 8)
                .input(RANDOM_ACCESS_MEMORY, 64)
                .input(wireGtDouble, ScUevSane, 16)
                .input(plateDense, VibraniumAlloy)
                .input(plate, AbyssalAlloy, 8)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 16))
                .fluidInputs(PositroniumHydride.getFluid(10000))
                .fluidInputs(CondensedStarMatter.getFluid(5000))
                .fluidInputs(Originium.getFluid(144))
                .output(CIRC_POSITRONIC_UEV)
                .stationResearch(b -> b
                        .researchStack(CIRC_POSITRONIC_UHV.getStackForm())
                        .CWUt(128)
                        .EUt(VA[UHV]))
                .duration(150 * 20).EUt(VA[UHV]).buildAndRegister();

        // T9: Entropic ================================================================================================

        // UV
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ENTROPIC_CIRCUIT_BOARD)
                .input(TIME_CRYSTAL)
                .input(SUPREME_SMD_RESISTOR, 8)
                .input(SUPREME_SMD_TRANSISTOR, 8)
                .input(SUPREME_SMD_CAPACITOR, 8)
                .input(SUPREME_SMD_DIODE, 8)
                .input(SUPREME_SMD_INDUCTOR, 8)
                .input(wireFine, Quantium40, 8)
                .input(foil, TengamAttuned, 4)
                .input(foil, QCDM)
                .input(plate, HalkoniteSteel)
                .fluidInputs(SelfRepairingNanobots.getFluid(144))
                .fluidInputs(LCNS.getFluid(1000))
                .output(CIRC_ENTROPIC_UV, outputAmount)
                .stationResearch(b -> b
                        .researchStack(CIRC_POSITRONIC_UEV.getStackForm())
                        .CWUt(144)
                        .EUt(VA[UEV]))
                .duration(20 * 10).EUt(VA[UEV]).buildAndRegister();

        // SoC UV
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .notConsumable(STELLAR_ESSENCE_END)
                .input(ENTROPIC_CIRCUIT_BOARD)
                .input(ENTROPIC_SOC_CHIP)
                .input(wireFine, Quantium40, 8)
                .input(bolt, Rhugnor, 4)
                .fluidInputs(SelfRepairingNanobots.getFluid(144))
                .output(CIRC_ENTROPIC_UV, outputAmount * 2)
                .cleanroom(CleanroomType.CLEANROOM)
                .duration(20 * 5).EUt(VA[UIV]).buildAndRegister();

        // UHV
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ENTROPIC_CIRCUIT_BOARD)
                .input(CIRC_ENTROPIC_UV, 2)
                .input(SUPREME_SMD_RESISTOR, 16)
                .input(SUPREME_SMD_TRANSISTOR, 16)
                .input(SUPREME_SMD_CAPACITOR, 16)
                .input(SUPREME_SMD_DIODE, 16)
                .input(SUPREME_SMD_INDUCTOR, 16)
                .input(RANDOM_ACCESS_MEMORY, 64)
                .input(wireFine, Quantium40, 16)
                .input(foil, Quantium40, 16)
                .input(foil, QCDM, 2)
                .input(plate, TengamAttuned, 4)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 2))
                .fluidInputs(LCNS.getFluid(2000))
                .output(CIRC_ENTROPIC_UHV)
                .stationResearch(b -> b
                        .researchStack(CIRC_ENTROPIC_UV.getStackForm())
                        .CWUt(144)
                        .EUt(VA[UEV]))
                .duration(20 * 20).EUt(VA[UEV]).buildAndRegister();

        // UEV
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ENTROPIC_CIRCUIT_BOARD)
                .input(CIRC_ENTROPIC_UHV, 2)
                .input(SUPREME_SMD_RESISTOR, 32)
                .input(SUPREME_SMD_TRANSISTOR, 32)
                .input(SUPREME_SMD_CAPACITOR, 32)
                .input(SUPREME_SMD_DIODE, 32)
                .input(SUPREME_SMD_INDUCTOR, 32)
                .input(NOR_MEMORY_CHIP, 64)
                .input(RANDOM_ACCESS_MEMORY, 64)
                .input(RANDOM_ACCESS_MEMORY, 64)
                .input(wireFine, Quantium40, 24)
                .input(foil, RadoxPolymer, 16)
                .input(foil, QCDM, 2)
                .input(plate, HalkoniteSteel, 4)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 8))
                .fluidInputs(LCNS.getFluid(4000))
                .output(CIRC_ENTROPIC_UEV)
                .stationResearch(b -> b
                        .researchStack(CIRC_ENTROPIC_UHV.getStackForm())
                        .CWUt(144)
                        .EUt(VA[UEV]))
                .duration(20 * 20).EUt(VA[UEV]).buildAndRegister();

        // UIV
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, AwakenedDraconium, 2)
                .input(CIRC_ENTROPIC_UEV, 2)
                .input(SUPREME_SMD_RESISTOR, 64)
                .input(SUPREME_SMD_TRANSISTOR, 64)
                .input(SUPREME_SMD_CAPACITOR, 64)
                .input(SUPREME_SMD_DIODE, 64)
                .input(SUPREME_SMD_INDUCTOR, 64)
                .input(foil, AwakenedDraconium, 16)
                .input(foil, Hypogen, 8)
                .input(foil, SentientNanobots, 8)
                .input(RANDOM_ACCESS_MEMORY, 64)
                .input(wireGtDouble, Hypogen, 16)
                .input(plateDense, HalkoniteSteel)
                .input(plate, AwakenedDraconium, 8)
                .input(plate, QCDM)
                .fluidInputs(SentientNanobots.getFluid(144 * 16))
                .fluidInputs(LCNS.getFluid(8000))
                .fluidInputs(Originium.getFluid(144 * 2))
                .fluidInputs(Rhugnor.getFluid(144 * 16))
                .output(CIRC_ENTROPIC_UIV)
                .stationResearch(b -> b
                        .researchStack(CIRC_ENTROPIC_UEV.getStackForm())
                        .CWUt(144)
                        .EUt(VA[UIV]))
                .duration(200 * 20).EUt(VA[UEV]).buildAndRegister();
    }
}
