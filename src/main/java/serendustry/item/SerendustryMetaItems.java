package serendustry.item;

import net.minecraft.item.Item;

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

    // todo: data should have x durability and lose 1 per craft, also dont use a separate metaitem for each one, or at least autogenerate them
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

    // this is messy but i didn't want to move IDs around
    public static MetaItem<?>.MetaValueItem STAR_SCANNING_DRONE;
    public static MetaItem<?>.MetaValueItem NETHERRACK_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem PITCHBLENDE_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem QUARTZ_PLANETOID_DATA;
    public static MetaItem<?>.MetaValueItem STAR_HARVESTING_DRONE;

    public static MetaItem<?>.MetaValueItem SPACEWEED;
    public static MetaItem<?>.MetaValueItem CRUSHED_SPACEWEED;

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
    }
}
