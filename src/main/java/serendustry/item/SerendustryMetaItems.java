package serendustry.item;

import net.minecraft.item.Item;

import gregtech.api.GTValues;
import gregtech.api.items.metaitem.ElectricStats;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import serendustry.item.behavior.WasteExtractorBehavior;

public class SerendustryMetaItems {

    private static MetaItem<?> ITEMS;

    public static MetaItem<?>.MetaValueItem WASTE_FLUID_EXTRACTOR;
    public static MetaItem<?>.MetaValueItem WASTE_FLUID_EXTRACTOR_FILLED;
    public static MetaItem<?>.MetaValueItem ERROR_INGOT;

    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_ULV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_LV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_MV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_HV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_EV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_IV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_LuV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_ZPM;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_UV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_UHV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_UEV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_UIV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_UXV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_OpV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_MAX;

    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_BOULE;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_WAFER;
    public static MetaItem<?>.MetaValueItem RESONANCE_WAFER;
    public static MetaItem<?>.MetaValueItem RESONANCE_CHIP;
    public static MetaItem<?>.MetaValueItem COSMIC_CIRCUIT_BOARD;
    public static MetaItem<?>.MetaValueItem SUPREME_SMD_RESISTOR;
    public static MetaItem<?>.MetaValueItem SUPREME_SMD_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem SUPREME_SMD_CAPACITOR;
    public static MetaItem<?>.MetaValueItem SUPREME_SMD_DIODE;
    public static MetaItem<?>.MetaValueItem SUPREME_SMD_INDUCTOR;
    public static MetaItem<?>.MetaValueItem QUANTUM_ANOMALY;
    public static MetaItem<?>.MetaValueItem QUANTIUM_STAR;
    public static MetaItem<?>.MetaValueItem ELECTRIC_MOTOR_MAX;
    public static MetaItem<?>.MetaValueItem CONVEYOR_MODULE_MAX;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PUMP_MAX;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PISTON_MAX;
    public static MetaItem<?>.MetaValueItem ROBOT_ARM_MAX;
    public static MetaItem<?>.MetaValueItem FIELD_GENERATOR_MAX;
    public static MetaItem<?>.MetaValueItem SENSOR_MAX;
    public static MetaItem<?>.MetaValueItem EMITTER_MAX;
    public static MetaItem<?>.MetaValueItem MYSTERIOUS_BLOB_ARGON;
    public static MetaItem<?>.MetaValueItem MYSTERIOUS_BLOB_HELIUM;
    public static MetaItem<?>.MetaValueItem MYSTERIOUS_BLOB_HYDROGEN;
    public static MetaItem<?>.MetaValueItem MYSTERIOUS_BLOB_KRYPTON;
    public static MetaItem<?>.MetaValueItem MYSTERIOUS_BLOB_NEON;
    public static MetaItem<?>.MetaValueItem MYSTERIOUS_BLOB_NITROGEN;
    public static MetaItem<?>.MetaValueItem MYSTERIOUS_BLOB_OXYGEN;
    public static MetaItem<?>.MetaValueItem HOT_WOOD_INGOT;
    public static MetaItem<?>.MetaValueItem PLANETOID_SCANNING_DRONE;
    public static MetaItem<?>.MetaValueItem PLANETOID_HARVESTING_DRONE;

    public static MetaItem<?>.MetaValueItem STONE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem OBSIDIAN_PLANETOID_DATA;

    public static MetaItem<?>.MetaValueItem MAGNETITE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem CHALCOPYRITE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem PYROLUSITE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem COAL_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem GRAPHITE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem CASSITERITE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem APATITE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem NICKEL_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem COOPERITE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem MONAZITE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem NAQUADAH_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem GALENA_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem TENGAM_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem CHEESE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem GEM_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem SALT_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem LAPIS_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem NETHERRACK_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem PITCHBLENDE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem QUARTZ_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem AZBANTIUM_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem VIBRANITE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem NETHERITE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem DRACONIUM_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem REDSTONE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem END_STONE_PLANETOID_DATA;

    public static MetaItem<?>.MetaValueItem YELLOW_DWARF_STAR_DATA;
    public static MetaItem<?>.MetaValueItem RED_DWARF_STAR_DATA;
    public static MetaItem<?>.MetaValueItem RED_GIANT_STAR_DATA;
    public static MetaItem<?>.MetaValueItem RED_SUPERGIANT_STAR_DATA;
    public static MetaItem<?>.MetaValueItem BLUE_GIANT_STAR_DATA;
    public static MetaItem<?>.MetaValueItem WHITE_DWARF_STAR_DATA;
    public static MetaItem<?>.MetaValueItem BROWN_DWARF_STAR_DATA;
    public static MetaItem<?>.MetaValueItem BLACK_DWARF_STAR_DATA;
    public static MetaItem<?>.MetaValueItem NEUTRON_STAR_DATA;
    public static MetaItem<?>.MetaValueItem PULSAR_STAR_DATA;

    public static MetaItem<?>.MetaValueItem STAR_SCANNING_DRONE;
    public static MetaItem<?>.MetaValueItem STAR_HARVESTING_DRONE;

    public static MetaItem<?>.MetaValueItem SPACEWEED;
    public static MetaItem<?>.MetaValueItem CRUSHED_SPACEWEED;

    public static MetaItem<?>.MetaValueItem CATALYST_STEELS;
    public static MetaItem<?>.MetaValueItem CATALYST_COPPER_ALLOYS;
    public static MetaItem<?>.MetaValueItem CATALYST_TIN_ALLOYS;
    public static MetaItem<?>.MetaValueItem CATALYST_GOLD_ALLOYS;
    public static MetaItem<?>.MetaValueItem CATALYST_BATTERY_ALLOY;
    public static MetaItem<?>.MetaValueItem CATALYST_SOLDERING_ALLOYS;
    public static MetaItem<?>.MetaValueItem CATALYST_PLATINUM_GROUP_ALLOYS;
    public static MetaItem<?>.MetaValueItem CATALYST_NAQUADAH_ALLOYS;
    public static MetaItem<?>.MetaValueItem CATALYST_SUPERCONDUCTORS;
    public static MetaItem<?>.MetaValueItem CATALYST_HAM_ALLOY;
    public static MetaItem<?>.MetaValueItem CATALYST_ARCANITE;
    public static MetaItem<?>.MetaValueItem CATALYST_ABYSSAL_ALLOY;
    public static MetaItem<?>.MetaValueItem CATALYST_VIBRANIUM_ALLOY;
    public static MetaItem<?>.MetaValueItem CATALYST_OGANESSON_TETRATENNESSIDE;
    public static MetaItem<?>.MetaValueItem CATALYST_HALKONITE;
    public static MetaItem<?>.MetaValueItem CATALYST_AWAKENED_DRACONIUM;
    public static MetaItem<?>.MetaValueItem CATALYST_EXO_HALKONITE;
    public static MetaItem<?>.MetaValueItem CATALYST_TITANIUM_ALLOYS;
    public static MetaItem<?>.MetaValueItem CATALYST_VANADIUM_ALLOYS;

    public static MetaItem<?>.MetaValueItem COIL_UHV;
    public static MetaItem<?>.MetaValueItem COIL_UEV;
    public static MetaItem<?>.MetaValueItem COIL_UIV;
    public static MetaItem<?>.MetaValueItem COIL_UXV;
    public static MetaItem<?>.MetaValueItem COIL_OpV;
    public static MetaItem<?>.MetaValueItem COIL_MAX;

    public static MetaItem<?>.MetaValueItem ORUNDUM_SEED_CRYSTAL;
    public static MetaItem<?>.MetaValueItem ORUNDUM_BOULE;
    public static MetaItem<?>.MetaValueItem RAW_ORUNDUM_WAFER;
    public static MetaItem<?>.MetaValueItem WRAPPED_ORUNDUM_WAFER;
    public static MetaItem<?>.MetaValueItem INACTIVE_APU_WAFER;
    public static MetaItem<?>.MetaValueItem ACTIVATED_APU_WAFER;
    public static MetaItem<?>.MetaValueItem ACTIVATED_APU_CHIP;
    public static MetaItem<?>.MetaValueItem MASK_ILC;
    public static MetaItem<?>.MetaValueItem MASK_RAM;
    public static MetaItem<?>.MetaValueItem MASK_CPU;
    public static MetaItem<?>.MetaValueItem MASK_NAND;
    public static MetaItem<?>.MetaValueItem MASK_NOR;
    public static MetaItem<?>.MetaValueItem MASK_SSOC;
    public static MetaItem<?>.MetaValueItem MASK_SOC;
    public static MetaItem<?>.MetaValueItem MASK_ASOC;
    public static MetaItem<?>.MetaValueItem MASK_HASOC;
    public static MetaItem<?>.MetaValueItem MASK_ULPIC;
    public static MetaItem<?>.MetaValueItem MASK_LPIC;
    public static MetaItem<?>.MetaValueItem MASK_PIC;
    public static MetaItem<?>.MetaValueItem MASK_HPIC;
    public static MetaItem<?>.MetaValueItem MASK_UHPIC;
    public static MetaItem<?>.MetaValueItem MASK_NCPU;
    public static MetaItem<?>.MetaValueItem MASK_QCPU;
    public static MetaItem<?>.MetaValueItem MASK_BLANK;
    public static MetaItem<?>.MetaValueItem WAFER_OPIC;
    public static MetaItem<?>.MetaValueItem CHIP_OPIC;

    public static MetaItem<?>.MetaValueItem LENS_ARRAY_HYPERAMPLIFYING;
    public static MetaItem<?>.MetaValueItem LENS_ARRAY_HYPERPRECISE;
    public static MetaItem<?>.MetaValueItem MASK_APU;

    public static MetaItem<?>.MetaValueItem CIRC_POSITRONIC_ZPM;
    public static MetaItem<?>.MetaValueItem CIRC_POSITRONIC_UV;
    public static MetaItem<?>.MetaValueItem CIRC_POSITRONIC_UHV;
    public static MetaItem<?>.MetaValueItem CIRC_POSITRONIC_UEV;
    public static MetaItem<?>.MetaValueItem POSITRONIC_CHIP;
    public static MetaItem<?>.MetaValueItem ENGRAVED_POSITRONIC_CHIP;

    public static MetaItem<?>.MetaValueItem PLANETOID_SCANNING_DRONE_MK_2;
    // EMPTY ID
    public static MetaItem<?>.MetaValueItem TIBERIUM_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem EXOTIC_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem XENOTIME_PLANETOID_DATA;

    // EMPTY ID
    public static MetaItem<?>.MetaValueItem PETRI_DISH_STERILIZED;
    public static MetaItem<?>.MetaValueItem CULTURE_E_COLI;
    public static MetaItem<?>.MetaValueItem CULTURE_YEAST;
    public static MetaItem<?>.MetaValueItem CULTURE_RED_ALGAE;
    public static MetaItem<?>.MetaValueItem CULTURE_STEM_CELL;
    public static MetaItem<?>.MetaValueItem CULTURE_YEAST_RUPTURED;
    public static MetaItem<?>.MetaValueItem CULTURE_RED_ALGAE_BOILED;
    public static MetaItem<?>.MetaValueItem CULTURE_STEM_CELL_WIRED;
    public static MetaItem<?>.MetaValueItem CULTURE_XENOXENE;

    public static MetaItem<?>.MetaValueItem POWER_UNIT_UHV;
    // public static MetaItem<?>.MetaValueItem TRISHULA;

    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_ULV;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_LV;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_MV;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_HV;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_EV;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_IV;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_LuV;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_ZPM;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_UV;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_UHV;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_UEV;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_UIV;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_UXV;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_OpV;
    public static MetaItem<?>.MetaValueItem CIRCUIT_ANY_MAX;

    public static MetaItem<?>.MetaValueItem STELLAR_ESSENCE_BLANK;
    public static MetaItem<?>.MetaValueItem STELLAR_ESSENCE_OVERWORLD;
    public static MetaItem<?>.MetaValueItem STELLAR_ESSENCE_NETHER;
    public static MetaItem<?>.MetaValueItem STELLAR_ESSENCE_END;
    public static MetaItem<?>.MetaValueItem STELLAR_ESSENCE_BEYOND;

    public static MetaItem<?>.MetaValueItem CIRC_ENTROPIC_UV;
    public static MetaItem<?>.MetaValueItem CIRC_ENTROPIC_UHV;
    public static MetaItem<?>.MetaValueItem CIRC_ENTROPIC_UEV;
    public static MetaItem<?>.MetaValueItem CIRC_ENTROPIC_UIV;
    public static MetaItem<?>.MetaValueItem ENTROPIC_CIRCUIT_BOARD;

    public static MetaItem<?>.MetaValueItem DEEP_DARK_SCANNING_DRONE;
    public static MetaItem<?>.MetaValueItem DEEP_DARK_HARVESTING_DRONE;
    public static MetaItem<?>.MetaValueItem DEEP_DARK_PLANETOID_DATA;

    public static MetaItem<?>.MetaValueItem HKSP_DD;
    public static MetaItem<?>.MetaValueItem HKSP_C;
    public static MetaItem<?>.MetaValueItem HKSP_BC;
    public static MetaItem<?>.MetaValueItem HKSP_F;

    public static void preInit() {
        ITEMS = new StandardMetaItem();
        // todo ???
        ((Item) ITEMS).setRegistryName("serendustry_item");
    }

    public static void registerItems() {
        WASTE_FLUID_EXTRACTOR = ITEMS.addItem(0, "waste_fluid_extractor").addComponents(new WasteExtractorBehavior())
                .setMaxStackSize(1);
        WASTE_FLUID_EXTRACTOR_FILLED = ITEMS.addItem(1, "waste_fluid_extractor_filled").setMaxStackSize(1);
        ERROR_INGOT = ITEMS.addItem(2, "error_ingot");
        MAGNETO_RESONATIC_ULV = ITEMS.addItem(3, "magneto_resonatic_ulv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.ULV);
        MAGNETO_RESONATIC_LV = ITEMS.addItem(4, "magneto_resonatic_lv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.LV);
        MAGNETO_RESONATIC_MV = ITEMS.addItem(5, "magneto_resonatic_mv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.MV);
        MAGNETO_RESONATIC_HV = ITEMS.addItem(6, "magneto_resonatic_hv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.HV);
        MAGNETO_RESONATIC_EV = ITEMS.addItem(7, "magneto_resonatic_ev").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.EV);
        MAGNETO_RESONATIC_IV = ITEMS.addItem(8, "magneto_resonatic_iv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.IV);
        MAGNETO_RESONATIC_LuV = ITEMS.addItem(9, "magneto_resonatic_luv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.LuV);
        MAGNETO_RESONATIC_ZPM = ITEMS.addItem(10, "magneto_resonatic_zpm").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.ZPM);
        MAGNETO_RESONATIC_UV = ITEMS.addItem(11, "magneto_resonatic_uv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UV);
        MAGNETO_RESONATIC_UHV = ITEMS.addItem(12, "magneto_resonatic_uhv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UHV);
        MAGNETO_RESONATIC_UEV = ITEMS.addItem(13, "magneto_resonatic_uev").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UEV);
        MAGNETO_RESONATIC_UIV = ITEMS.addItem(14, "magneto_resonatic_uiv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UIV);
        MAGNETO_RESONATIC_UXV = ITEMS.addItem(15, "magneto_resonatic_uxv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UXV);
        MAGNETO_RESONATIC_OpV = ITEMS.addItem(16, "magneto_resonatic_opv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.OpV);
        MAGNETO_RESONATIC_MAX = ITEMS.addItem(17, "magneto_resonatic_max").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.MAX);
        MAGNETO_RESONATIC_BOULE = ITEMS.addItem(18, "magneto_resonatic_boule");
        MAGNETO_RESONATIC_WAFER = ITEMS.addItem(19, "magneto_resonatic_wafer");
        RESONANCE_WAFER = ITEMS.addItem(20, "resonance_wafer");
        RESONANCE_CHIP = ITEMS.addItem(21, "resonance_chip");
        COSMIC_CIRCUIT_BOARD = ITEMS.addItem(22, "cosmic_circuit_board");
        SUPREME_SMD_RESISTOR = ITEMS.addItem(23, "supreme_smd_resistor");
        SUPREME_SMD_TRANSISTOR = ITEMS.addItem(24, "supreme_smd_transistor");
        SUPREME_SMD_CAPACITOR = ITEMS.addItem(25, "supreme_smd_capacitor");
        SUPREME_SMD_DIODE = ITEMS.addItem(26, "supreme_smd_diode");
        SUPREME_SMD_INDUCTOR = ITEMS.addItem(27, "supreme_smd_inductor");
        QUANTUM_ANOMALY = ITEMS.addItem(28, "quantum_anomaly");
        QUANTIUM_STAR = ITEMS.addItem(29, "quantium_star");
        ELECTRIC_MOTOR_MAX = ITEMS.addItem(30, "electric_motor_max");
        CONVEYOR_MODULE_MAX = ITEMS.addItem(31, "conveyor_module_max");
        ELECTRIC_PUMP_MAX = ITEMS.addItem(32, "electric_pump_max");
        ELECTRIC_PISTON_MAX = ITEMS.addItem(33, "electric_piston_max");
        ROBOT_ARM_MAX = ITEMS.addItem(34, "robot_arm_max");
        FIELD_GENERATOR_MAX = ITEMS.addItem(35, "field_generator_max");
        SENSOR_MAX = ITEMS.addItem(36, "sensor_max");
        EMITTER_MAX = ITEMS.addItem(37, "emitter_max");
        MYSTERIOUS_BLOB_ARGON = ITEMS.addItem(38, "mysterious_blob_argon");
        MYSTERIOUS_BLOB_HELIUM = ITEMS.addItem(39, "mysterious_blob_helium");
        MYSTERIOUS_BLOB_HYDROGEN = ITEMS.addItem(40, "mysterious_blob_hydrogen");
        MYSTERIOUS_BLOB_KRYPTON = ITEMS.addItem(41, "mysterious_blob_krypton");
        MYSTERIOUS_BLOB_NEON = ITEMS.addItem(42, "mysterious_blob_neon");
        MYSTERIOUS_BLOB_NITROGEN = ITEMS.addItem(43, "mysterious_blob_nitrogen");
        MYSTERIOUS_BLOB_OXYGEN = ITEMS.addItem(44, "mysterious_blob_oxygen");
        HOT_WOOD_INGOT = ITEMS.addItem(45, "hot_wood_ingot");
        PLANETOID_SCANNING_DRONE = ITEMS.addItem(46, "planetoid_scanning_drone");
        PLANETOID_HARVESTING_DRONE = ITEMS.addItem(47, "planetoid_harvesting_drone");
        STONE_PLANETOID_DATA = ITEMS.addItem(48, "stone_planetoid_data");
        OBSIDIAN_PLANETOID_DATA = ITEMS.addItem(49, "obsidian_planetoid_data");
        MAGNETITE_PLANETOID_DATA = ITEMS.addItem(50, "magnetite_planetoid_data");
        CHALCOPYRITE_PLANETOID_DATA = ITEMS.addItem(51, "chalcopyrite_planetoid_data");
        PYROLUSITE_PLANETOID_DATA = ITEMS.addItem(52, "pyrolusite_planetoid_data");
        COAL_PLANETOID_DATA = ITEMS.addItem(53, "coal_planetoid_data");
        GRAPHITE_PLANETOID_DATA = ITEMS.addItem(54, "graphite_planetoid_data");
        CASSITERITE_PLANETOID_DATA = ITEMS.addItem(55, "cassiterite_planetoid_data");
        APATITE_PLANETOID_DATA = ITEMS.addItem(56, "apatite_planetoid_data");
        NICKEL_PLANETOID_DATA = ITEMS.addItem(57, "nickel_planetoid_data");
        COOPERITE_PLANETOID_DATA = ITEMS.addItem(58, "cooperite_planetoid_data");
        MONAZITE_PLANETOID_DATA = ITEMS.addItem(59, "monazite_planetoid_data");
        NAQUADAH_PLANETOID_DATA = ITEMS.addItem(60, "naquadah_planetoid_data");
        GALENA_PLANETOID_DATA = ITEMS.addItem(61, "galena_planetoid_data");
        TENGAM_PLANETOID_DATA = ITEMS.addItem(62, "tengam_planetoid_data");
        CHEESE_PLANETOID_DATA = ITEMS.addItem(63, "cheese_planetoid_data");
        GEM_PLANETOID_DATA = ITEMS.addItem(64, "gem_planetoid_data");
        SALT_PLANETOID_DATA = ITEMS.addItem(65, "salt_planetoid_data");
        LAPIS_PLANETOID_DATA = ITEMS.addItem(66, "lapis_planetoid_data");
        YELLOW_DWARF_STAR_DATA = ITEMS.addItem(67, "yellow_dwarf_star_data");
        RED_DWARF_STAR_DATA = ITEMS.addItem(68, "red_dwarf_star_data");
        RED_GIANT_STAR_DATA = ITEMS.addItem(69, "red_giant_star_data");
        RED_SUPERGIANT_STAR_DATA = ITEMS.addItem(70, "red_supergiant_star_data");
        BLUE_GIANT_STAR_DATA = ITEMS.addItem(71, "blue_giant_star_data");
        WHITE_DWARF_STAR_DATA = ITEMS.addItem(72, "white_dwarf_star_data");
        BROWN_DWARF_STAR_DATA = ITEMS.addItem(73, "brown_dwarf_star_data");
        BLACK_DWARF_STAR_DATA = ITEMS.addItem(74, "black_dwarf_star_data");
        NEUTRON_STAR_DATA = ITEMS.addItem(75, "neutron_star_data");
        PULSAR_STAR_DATA = ITEMS.addItem(76, "pulsar_star_data");
        STAR_SCANNING_DRONE = ITEMS.addItem(77, "star_scanning_drone");
        NETHERRACK_PLANETOID_DATA = ITEMS.addItem(78, "netherrack_planetoid_data");
        PITCHBLENDE_PLANETOID_DATA = ITEMS.addItem(79, "pitchblende_planetoid_data");
        QUARTZ_PLANETOID_DATA = ITEMS.addItem(80, "quartz_planetoid_data");
        STAR_HARVESTING_DRONE = ITEMS.addItem(81, "star_harvesting_drone");
        SPACEWEED = ITEMS.addItem(82, "spaceweed");
        CRUSHED_SPACEWEED = ITEMS.addItem(83, "crushed_spaceweed");
        CATALYST_STEELS = ITEMS.addItem(84, "catalyst_steels").setMaxStackSize(1);
        CATALYST_COPPER_ALLOYS = ITEMS.addItem(85, "catalyst_copper_alloys").setMaxStackSize(1);
        CATALYST_TIN_ALLOYS = ITEMS.addItem(86, "catalyst_tin_alloys").setMaxStackSize(1);
        CATALYST_GOLD_ALLOYS = ITEMS.addItem(87, "catalyst_gold_alloys").setMaxStackSize(1);
        CATALYST_BATTERY_ALLOY = ITEMS.addItem(88, "catalyst_battery_alloy").setMaxStackSize(1);
        CATALYST_SOLDERING_ALLOYS = ITEMS.addItem(89, "catalyst_soldering_alloys").setMaxStackSize(1);
        CATALYST_PLATINUM_GROUP_ALLOYS = ITEMS.addItem(90, "catalyst_platinum_group_alloys").setMaxStackSize(1);
        CATALYST_NAQUADAH_ALLOYS = ITEMS.addItem(91, "catalyst_naquadah_alloys").setMaxStackSize(1);
        CATALYST_SUPERCONDUCTORS = ITEMS.addItem(92, "catalyst_superconductors").setMaxStackSize(1);
        CATALYST_HAM_ALLOY = ITEMS.addItem(93, "catalyst_ham_alloy").setMaxStackSize(1);
        CATALYST_ARCANITE = ITEMS.addItem(94, "catalyst_arcanite").setMaxStackSize(1);
        COIL_UHV = ITEMS.addItem(95, "coil_uhv");
        ORUNDUM_SEED_CRYSTAL = ITEMS.addItem(96, "orundum_seed_crystal");
        ORUNDUM_BOULE = ITEMS.addItem(97, "orundum_boule");
        RAW_ORUNDUM_WAFER = ITEMS.addItem(98, "raw_orundum_wafer");
        WRAPPED_ORUNDUM_WAFER = ITEMS.addItem(99, "wrapped_orundum_wafer");
        INACTIVE_APU_WAFER = ITEMS.addItem(100, "inactive_apu_wafer");
        ACTIVATED_APU_WAFER = ITEMS.addItem(101, "activated_apu_wafer");
        ACTIVATED_APU_CHIP = ITEMS.addItem(102, "activated_apu_chip");
        MASK_ILC = ITEMS.addItem(103, "mask_ilc").setMaxStackSize(1);
        MASK_RAM = ITEMS.addItem(104, "mask_ram").setMaxStackSize(1);
        MASK_CPU = ITEMS.addItem(105, "mask_cpu").setMaxStackSize(1);
        MASK_NAND = ITEMS.addItem(106, "mask_nand").setMaxStackSize(1);
        MASK_NOR = ITEMS.addItem(107, "mask_nor").setMaxStackSize(1);
        MASK_SSOC = ITEMS.addItem(108, "mask_ssoc").setMaxStackSize(1);
        MASK_SOC = ITEMS.addItem(109, "mask_soc").setMaxStackSize(1);
        MASK_ASOC = ITEMS.addItem(110, "mask_asoc").setMaxStackSize(1);
        MASK_HASOC = ITEMS.addItem(111, "mask_hasoc").setMaxStackSize(1);
        MASK_ULPIC = ITEMS.addItem(112, "mask_ulpic").setMaxStackSize(1);
        MASK_LPIC = ITEMS.addItem(113, "mask_lpic").setMaxStackSize(1);
        MASK_PIC = ITEMS.addItem(114, "mask_pic").setMaxStackSize(1);
        MASK_HPIC = ITEMS.addItem(115, "mask_hpic").setMaxStackSize(1);
        MASK_UHPIC = ITEMS.addItem(116, "mask_uhpic").setMaxStackSize(1);
        MASK_NCPU = ITEMS.addItem(117, "mask_ncpu").setMaxStackSize(1);
        MASK_QCPU = ITEMS.addItem(118, "mask_qcpu").setMaxStackSize(1);
        MASK_BLANK = ITEMS.addItem(119, "mask_blank");
        WAFER_OPIC = ITEMS.addItem(120, "wafer_opic");
        CHIP_OPIC = ITEMS.addItem(121, "chip_opic");
        CATALYST_ABYSSAL_ALLOY = ITEMS.addItem(122, "catalyst_abyssal_alloy").setMaxStackSize(1);
        LENS_ARRAY_HYPERAMPLIFYING = ITEMS.addItem(123, "lens_array_hyperamplifying");
        LENS_ARRAY_HYPERPRECISE = ITEMS.addItem(124, "lens_array_hyperprecise");
        MASK_APU = ITEMS.addItem(125, "mask_apu");
        CIRC_POSITRONIC_ZPM = ITEMS.addItem(126, "circ_positronic_zpm").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.ZPM);
        CIRC_POSITRONIC_UV = ITEMS.addItem(127, "circ_positronic_uv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UV);
        CIRC_POSITRONIC_UHV = ITEMS.addItem(128, "circ_positronic_uhv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UHV);
        CIRC_POSITRONIC_UEV = ITEMS.addItem(129, "circ_positronic_uev").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UEV);
        POSITRONIC_CHIP = ITEMS.addItem(130, "positronic_chip");
        ENGRAVED_POSITRONIC_CHIP = ITEMS.addItem(131, "engraved_positronic_chip");
        PLANETOID_SCANNING_DRONE_MK_2 = ITEMS.addItem(132, "planetoid_scanning_drone_mk_2");
        // EMPTY ID
        TIBERIUM_PLANETOID_DATA = ITEMS.addItem(134, "tiberium_planetoid_data");
        EXOTIC_PLANETOID_DATA = ITEMS.addItem(135, "exotic_planetoid_data");
        XENOTIME_PLANETOID_DATA = ITEMS.addItem(136, "xenotime_planetoid_data");
        // EMPTY ID
        PETRI_DISH_STERILIZED = ITEMS.addItem(138, "petri_dish_sterilized");
        CULTURE_E_COLI = ITEMS.addItem(139, "culture_e_coli");
        CULTURE_YEAST = ITEMS.addItem(140, "culture_yeast");
        CULTURE_RED_ALGAE = ITEMS.addItem(141, "culture_red_algae");
        CULTURE_STEM_CELL = ITEMS.addItem(142, "culture_stem_cell");
        CULTURE_YEAST_RUPTURED = ITEMS.addItem(143, "culture_yeast_ruptured");
        CULTURE_RED_ALGAE_BOILED = ITEMS.addItem(144, "culture_red_algae_boiled");
        CULTURE_STEM_CELL_WIRED = ITEMS.addItem(145, "culture_stem_cell_wired");
        AZBANTIUM_PLANETOID_DATA = ITEMS.addItem(146, "azbantium_planetoid_data");
        VIBRANITE_PLANETOID_DATA = ITEMS.addItem(147, "vibranite_planetoid_data");
        CATALYST_VIBRANIUM_ALLOY = ITEMS.addItem(148, "catalyst_vibranium_alloy").setMaxStackSize(1);
        NETHERITE_PLANETOID_DATA = ITEMS.addItem(149, "netherite_planetoid_data");
        POWER_UNIT_UHV = ITEMS.addItem(150, "power_unit_uhv")
                .addComponents(ElectricStats.createElectricItem(Long.MAX_VALUE, GTValues.UHV)).setMaxStackSize(8);
        // TRISHULA = ITEMS.addItem(151, "trishula");
        CATALYST_HALKONITE = ITEMS.addItem(151, "catalyst_halkonite").setMaxStackSize(1);
        CULTURE_XENOXENE = ITEMS.addItem(152, "culture_xenoxene");
        CATALYST_OGANESSON_TETRATENNESSIDE = ITEMS.addItem(153, "catalyst_oganesson_tetratennesside")
                .setMaxStackSize(1);
        COIL_UEV = ITEMS.addItem(154, "coil_uev");
        COIL_UIV = ITEMS.addItem(155, "coil_uiv");
        COIL_UXV = ITEMS.addItem(156, "coil_uxv");
        COIL_OpV = ITEMS.addItem(157, "coil_opv");
        COIL_MAX = ITEMS.addItem(158, "coil_max");
        CIRCUIT_ANY_ULV = ITEMS.addItem(159, "circuit_any_ulv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.ULV);
        CIRCUIT_ANY_LV = ITEMS.addItem(160, "circuit_any_lv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.LV);
        CIRCUIT_ANY_MV = ITEMS.addItem(161, "circuit_any_mv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.MV);
        CIRCUIT_ANY_HV = ITEMS.addItem(162, "circuit_any_hv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.HV);
        CIRCUIT_ANY_EV = ITEMS.addItem(163, "circuit_any_ev").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.EV);
        CIRCUIT_ANY_IV = ITEMS.addItem(164, "circuit_any_iv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.IV);
        CIRCUIT_ANY_LuV = ITEMS.addItem(165, "circuit_any_luv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.LuV);
        CIRCUIT_ANY_ZPM = ITEMS.addItem(166, "circuit_any_zpm").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.ZPM);
        CIRCUIT_ANY_UV = ITEMS.addItem(167, "circuit_any_uv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UV);
        CIRCUIT_ANY_UHV = ITEMS.addItem(168, "circuit_any_uhv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UHV);
        CIRCUIT_ANY_UEV = ITEMS.addItem(169, "circuit_any_uev").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UEV);
        CIRCUIT_ANY_UIV = ITEMS.addItem(170, "circuit_any_uiv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UIV);
        CIRCUIT_ANY_UXV = ITEMS.addItem(171, "circuit_any_uxv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UXV);
        CIRCUIT_ANY_OpV = ITEMS.addItem(172, "circuit_any_opv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.OpV);
        CIRCUIT_ANY_MAX = ITEMS.addItem(173, "circuit_any_max").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.MAX);
        STELLAR_ESSENCE_BLANK = ITEMS.addItem(174, "stellar_essence_blank");
        STELLAR_ESSENCE_OVERWORLD = ITEMS.addItem(175, "stellar_essence_overworld");
        STELLAR_ESSENCE_NETHER = ITEMS.addItem(176, "stellar_essence_nether");
        STELLAR_ESSENCE_END = ITEMS.addItem(177, "stellar_essence_end");
        CIRC_ENTROPIC_UV = ITEMS.addItem(178, "circ_entropic_uv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UV);
        CIRC_ENTROPIC_UHV = ITEMS.addItem(179, "circ_entropic_uhv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UHV);
        CIRC_ENTROPIC_UEV = ITEMS.addItem(180, "circ_entropic_uev").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UEV);
        CIRC_ENTROPIC_UIV = ITEMS.addItem(181, "circ_entropic_uiv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UIV);
        ENTROPIC_CIRCUIT_BOARD = ITEMS.addItem(182, "entropic_circuit_board");
        DRACONIUM_PLANETOID_DATA = ITEMS.addItem(183, "draconium_planetoid_data");
        CATALYST_AWAKENED_DRACONIUM = ITEMS.addItem(184, "catalyst_awakened_draconium").setMaxStackSize(1);
        REDSTONE_PLANETOID_DATA = ITEMS.addItem(185, "redstone_planetoid_data");
        DEEP_DARK_SCANNING_DRONE = ITEMS.addItem(186, "deep_dark_scanning_drone");
        DEEP_DARK_HARVESTING_DRONE = ITEMS.addItem(187, "deep_dark_harvesting_drone");
        DEEP_DARK_PLANETOID_DATA = ITEMS.addItem(188, "deep_dark_planetoid_data");
        END_STONE_PLANETOID_DATA = ITEMS.addItem(189, "end_stone_planetoid_data");
        HKSP_DD = ITEMS.addItem(190, "hksp_dd");
        HKSP_C = ITEMS.addItem(191, "hksp_c");
        HKSP_BC = ITEMS.addItem(192, "hksp_bc");
        HKSP_F = ITEMS.addItem(193, "hksp_f");
        CATALYST_EXO_HALKONITE = ITEMS.addItem(194, "catalyst_exo_halkonite").setMaxStackSize(1);
        CATALYST_TITANIUM_ALLOYS = ITEMS.addItem(195, "catalyst_titanium_alloys").setMaxStackSize(1);
        CATALYST_VANADIUM_ALLOYS = ITEMS.addItem(196, "catalyst_vanadium_alloys").setMaxStackSize(1);
        STELLAR_ESSENCE_BEYOND = ITEMS.addItem(197, "stellar_essence_beyond");
    }
}
