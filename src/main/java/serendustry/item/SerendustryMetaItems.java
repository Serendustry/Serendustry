package serendustry.item;

import gregtech.api.GTValues;
import gregtech.api.items.metaitem.ElectricStats;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.item.Item;
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
    public static MetaItem<?>.MetaValueItem CATALYST_ADAMANTIUM;

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

    public static MetaItem<?>.MetaValueItem TIME_CRYSTAL;

    public static MetaItem<?>.MetaValueItem POSITRONIC_SOC_WAFER;
    public static MetaItem<?>.MetaValueItem POSITRONIC_SOC_CHIP;
    public static MetaItem<?>.MetaValueItem ENTROPIC_SOC_WAFER;
    public static MetaItem<?>.MetaValueItem ENTROPIC_SOC_CHIP;

    public static MetaItem<?>.MetaValueItem FEMTOSCALE_SINGULARITY;

    public static MetaItem<?>.MetaValueItem HOE_HEAD;
    public static MetaItem<?>.MetaValueItem HOE_BINDING;
    public static MetaItem<?>.MetaValueItem HOE_CRYSTAL;
    public static MetaItem<?>.MetaValueItem HOE_CORE;
    public static MetaItem<?>.MetaValueItem HOE_STABILIZER;
    public static MetaItem<?>.MetaValueItem HOE_HANDLE;

    public static void preInit() {
        ITEMS = new StandardMetaItem();
        // todo ???
        ((Item) ITEMS).setRegistryName("serendustry_item");
    }

    public static void registerItems() {

        final int MASK = 10;
        final int CIRC_PART = MASK + 20;
        final int CIRC = CIRC_PART + 50;
        final int CATALYST = CIRC + 50;
        final int DATA = CATALYST + 30;
        final int CULTURE = DATA + 50;
        final int COIL = CULTURE + 10;
        final int STELLAR = COIL + 10;
        final int ETC = STELLAR + 10;
        final int TOOL = ETC + 30;
        final int END = TOOL + 5;

        ERROR_INGOT = ITEMS.addItem(0, "error_ingot");
        HOT_WOOD_INGOT = ITEMS.addItem(1, "hot_wood_ingot");

        WASTE_FLUID_EXTRACTOR = ITEMS.addItem(2, "waste_fluid_extractor").addComponents(new WasteExtractorBehavior())
                .setMaxStackSize(1);
        WASTE_FLUID_EXTRACTOR_FILLED = ITEMS.addItem(3, "waste_fluid_extractor_filled").setMaxStackSize(1);

        MASK_ILC = ITEMS.addItem(MASK + 0, "mask_ilc");
        MASK_RAM = ITEMS.addItem(MASK + 1, "mask_ram");
        MASK_CPU = ITEMS.addItem(MASK + 2, "mask_cpu");
        MASK_NAND = ITEMS.addItem(MASK + 3, "mask_nand");
        MASK_NOR = ITEMS.addItem(MASK + 4, "mask_nor");
        MASK_SSOC = ITEMS.addItem(MASK + 5, "mask_ssoc");
        MASK_SOC = ITEMS.addItem(MASK + 6, "mask_soc");
        MASK_ASOC = ITEMS.addItem(MASK + 7, "mask_asoc");
        MASK_HASOC = ITEMS.addItem(MASK + 8, "mask_hasoc");
        MASK_ULPIC = ITEMS.addItem(MASK + 9, "mask_ulpic");
        MASK_LPIC = ITEMS.addItem(MASK + 10, "mask_lpic");
        MASK_PIC = ITEMS.addItem(MASK + 11, "mask_pic");
        MASK_HPIC = ITEMS.addItem(MASK + 12, "mask_hpic");
        MASK_UHPIC = ITEMS.addItem(MASK + 13, "mask_uhpic");
        MASK_NCPU = ITEMS.addItem(MASK + 14, "mask_ncpu");
        MASK_QCPU = ITEMS.addItem(MASK + 15, "mask_qcpu");
        MASK_BLANK = ITEMS.addItem(MASK + 16, "mask_blank");
        MASK_APU = ITEMS.addItem(MASK + 17, "mask_apu");

        MAGNETO_RESONATIC_BOULE = ITEMS.addItem(CIRC_PART + 0, "magneto_resonatic_boule");
        MAGNETO_RESONATIC_WAFER = ITEMS.addItem(CIRC_PART + 1, "magneto_resonatic_wafer");
        RESONANCE_WAFER = ITEMS.addItem(CIRC_PART + 2, "resonance_wafer");
        RESONANCE_CHIP = ITEMS.addItem(CIRC_PART + 3, "resonance_chip");
        ORUNDUM_SEED_CRYSTAL = ITEMS.addItem(CIRC_PART + 4, "orundum_seed_crystal");
        ORUNDUM_BOULE = ITEMS.addItem(CIRC_PART + 5, "orundum_boule");
        RAW_ORUNDUM_WAFER = ITEMS.addItem(CIRC_PART + 6, "raw_orundum_wafer");
        WRAPPED_ORUNDUM_WAFER = ITEMS.addItem(CIRC_PART + 7, "wrapped_orundum_wafer");
        INACTIVE_APU_WAFER = ITEMS.addItem(CIRC_PART + 8, "inactive_apu_wafer");
        ACTIVATED_APU_WAFER = ITEMS.addItem(CIRC_PART + 9, "activated_apu_wafer");
        ACTIVATED_APU_CHIP = ITEMS.addItem(CIRC_PART + 10, "activated_apu_chip");
        WAFER_OPIC = ITEMS.addItem(CIRC_PART + 11, "wafer_opic");
        CHIP_OPIC = ITEMS.addItem(CIRC_PART + 12, "chip_opic");
        POSITRONIC_SOC_WAFER = ITEMS.addItem(CIRC_PART + 13, "positronic_soc_wafer");
        POSITRONIC_SOC_CHIP = ITEMS.addItem(CIRC_PART + 14, "positronic_soc_chip");
        ENTROPIC_SOC_WAFER = ITEMS.addItem(CIRC_PART + 15, "entropic_soc_wafer");
        ENTROPIC_SOC_CHIP = ITEMS.addItem(CIRC_PART + 16, "entropic_soc_chip");
        POSITRONIC_CHIP = ITEMS.addItem(CIRC_PART + 17, "positronic_chip");
        ENGRAVED_POSITRONIC_CHIP = ITEMS.addItem(CIRC_PART + 18, "engraved_positronic_chip");
        TIME_CRYSTAL = ITEMS.addItem(CIRC_PART + 19, "time_crystal");
        SUPREME_SMD_RESISTOR = ITEMS.addItem(CIRC_PART + 20, "supreme_smd_resistor");
        SUPREME_SMD_TRANSISTOR = ITEMS.addItem(CIRC_PART + 21, "supreme_smd_transistor");
        SUPREME_SMD_CAPACITOR = ITEMS.addItem(CIRC_PART + 22, "supreme_smd_capacitor");
        SUPREME_SMD_DIODE = ITEMS.addItem(CIRC_PART + 23, "supreme_smd_diode");
        SUPREME_SMD_INDUCTOR = ITEMS.addItem(CIRC_PART + 24, "supreme_smd_inductor");
        // todo new sets of smds
        COSMIC_CIRCUIT_BOARD = ITEMS.addItem(CIRC_PART + 30, "cosmic_circuit_board");
        ENTROPIC_CIRCUIT_BOARD = ITEMS.addItem(CIRC_PART + 31, "entropic_circuit_board");
        // todo new cb
        
        MAGNETO_RESONATIC_ULV = ITEMS.addItem(CIRC + 0, "magneto_resonatic_ulv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.ULV);
        MAGNETO_RESONATIC_LV = ITEMS.addItem(CIRC + 1, "magneto_resonatic_lv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.LV);
        MAGNETO_RESONATIC_MV = ITEMS.addItem(CIRC + 2, "magneto_resonatic_mv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.MV);
        MAGNETO_RESONATIC_HV = ITEMS.addItem(CIRC + 3, "magneto_resonatic_hv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.HV);
        MAGNETO_RESONATIC_EV = ITEMS.addItem(CIRC + 4, "magneto_resonatic_ev").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.EV);
        MAGNETO_RESONATIC_IV = ITEMS.addItem(CIRC + 5, "magneto_resonatic_iv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.IV);
        MAGNETO_RESONATIC_LuV = ITEMS.addItem(CIRC + 6, "magneto_resonatic_luv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.LuV);
        MAGNETO_RESONATIC_ZPM = ITEMS.addItem(CIRC + 7, "magneto_resonatic_zpm").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.ZPM);
        MAGNETO_RESONATIC_UV = ITEMS.addItem(CIRC + 8, "magneto_resonatic_uv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UV);
        MAGNETO_RESONATIC_UHV = ITEMS.addItem(CIRC + 9, "magneto_resonatic_uhv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UHV);
        MAGNETO_RESONATIC_UEV = ITEMS.addItem(CIRC + 10, "magneto_resonatic_uev").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UEV);
        MAGNETO_RESONATIC_UIV = ITEMS.addItem(CIRC + 11, "magneto_resonatic_uiv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UIV);
        MAGNETO_RESONATIC_UXV = ITEMS.addItem(CIRC + 12, "magneto_resonatic_uxv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UXV);
        MAGNETO_RESONATIC_OpV = ITEMS.addItem(CIRC + 13, "magneto_resonatic_opv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.OpV);
        MAGNETO_RESONATIC_MAX = ITEMS.addItem(CIRC + 14, "magneto_resonatic_max").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.MAX);
        CIRCUIT_ANY_ULV = ITEMS.addItem(CIRC + 15, "circuit_any_ulv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.ULV);
        CIRCUIT_ANY_LV = ITEMS.addItem(CIRC + 16, "circuit_any_lv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.LV);
        CIRCUIT_ANY_MV = ITEMS.addItem(CIRC + 17, "circuit_any_mv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.MV);
        CIRCUIT_ANY_HV = ITEMS.addItem(CIRC + 18, "circuit_any_hv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.HV);
        CIRCUIT_ANY_EV = ITEMS.addItem(CIRC + 19, "circuit_any_ev").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.EV);
        CIRCUIT_ANY_IV = ITEMS.addItem(CIRC + 20, "circuit_any_iv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.IV);
        CIRCUIT_ANY_LuV = ITEMS.addItem(CIRC + 21, "circuit_any_luv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.LuV);
        CIRCUIT_ANY_ZPM = ITEMS.addItem(CIRC + 22, "circuit_any_zpm").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.ZPM);
        CIRCUIT_ANY_UV = ITEMS.addItem(CIRC + 23, "circuit_any_uv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UV);
        CIRCUIT_ANY_UHV = ITEMS.addItem(CIRC + 24, "circuit_any_uhv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UHV);
        CIRCUIT_ANY_UEV = ITEMS.addItem(CIRC + 25, "circuit_any_uev").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UEV);
        CIRCUIT_ANY_UIV = ITEMS.addItem(CIRC + 26, "circuit_any_uiv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UIV);
        CIRCUIT_ANY_UXV = ITEMS.addItem(CIRC + 27, "circuit_any_uxv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UXV);
        CIRCUIT_ANY_OpV = ITEMS.addItem(CIRC + 28, "circuit_any_opv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.OpV);
        CIRCUIT_ANY_MAX = ITEMS.addItem(CIRC + 29, "circuit_any_max").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.MAX);
        CIRC_POSITRONIC_ZPM = ITEMS.addItem(CIRC + 30, "circ_positronic_zpm").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.ZPM);
        CIRC_POSITRONIC_UV = ITEMS.addItem(CIRC + 31, "circ_positronic_uv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UV);
        CIRC_POSITRONIC_UHV = ITEMS.addItem(CIRC + 32, "circ_positronic_uhv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UHV);
        CIRC_POSITRONIC_UEV = ITEMS.addItem(CIRC + 33, "circ_positronic_uev").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UEV);
        CIRC_ENTROPIC_UV = ITEMS.addItem(CIRC + 34, "circ_entropic_uv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UV);
        CIRC_ENTROPIC_UHV = ITEMS.addItem(CIRC + 35, "circ_entropic_uhv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UHV);
        CIRC_ENTROPIC_UEV = ITEMS.addItem(CIRC + 36, "circ_entropic_uev").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UEV);
        CIRC_ENTROPIC_UIV = ITEMS.addItem(CIRC + 37, "circ_entropic_uiv").setUnificationData(OrePrefix.circuit,
                MarkerMaterials.Tier.UIV);
        // todo new circuit themes

        CATALYST_STEELS = ITEMS.addItem(CATALYST + 0, "catalyst_steels").setMaxStackSize(1);
        CATALYST_COPPER_ALLOYS = ITEMS.addItem(CATALYST + 1, "catalyst_copper_alloys").setMaxStackSize(1);
        CATALYST_TIN_ALLOYS = ITEMS.addItem(CATALYST + 2, "catalyst_tin_alloys").setMaxStackSize(1);
        CATALYST_GOLD_ALLOYS = ITEMS.addItem(CATALYST + 3, "catalyst_gold_alloys").setMaxStackSize(1);
        CATALYST_BATTERY_ALLOY = ITEMS.addItem(CATALYST + 4, "catalyst_battery_alloy").setMaxStackSize(1);
        CATALYST_SOLDERING_ALLOYS = ITEMS.addItem(CATALYST + 5, "catalyst_soldering_alloys").setMaxStackSize(1);
        CATALYST_VANADIUM_ALLOYS = ITEMS.addItem(CATALYST + 6, "catalyst_vanadium_alloys").setMaxStackSize(1);
        CATALYST_TITANIUM_ALLOYS = ITEMS.addItem(CATALYST + 7, "catalyst_titanium_alloys").setMaxStackSize(1);
        CATALYST_PLATINUM_GROUP_ALLOYS = ITEMS.addItem(CATALYST + 8, "catalyst_platinum_group_alloys").setMaxStackSize(1);
        CATALYST_NAQUADAH_ALLOYS = ITEMS.addItem(CATALYST + 9, "catalyst_naquadah_alloys").setMaxStackSize(1);
        CATALYST_SUPERCONDUCTORS = ITEMS.addItem(CATALYST + 10, "catalyst_superconductors").setMaxStackSize(1);
        CATALYST_ADAMANTIUM = ITEMS.addItem(CATALYST + 11, "catalyst_adamantium").setMaxStackSize(1);
        CATALYST_VIBRANIUM_ALLOY = ITEMS.addItem(CATALYST + 12, "catalyst_vibranium_alloy").setMaxStackSize(1);
        CATALYST_ABYSSAL_ALLOY = ITEMS.addItem(CATALYST + 13, "catalyst_abyssal_alloy").setMaxStackSize(1);
        CATALYST_OGANESSON_TETRATENNESSIDE = ITEMS.addItem(CATALYST + 14, "catalyst_oganesson_tetratennesside").setMaxStackSize(1);
        CATALYST_HALKONITE = ITEMS.addItem(CATALYST + 15, "catalyst_halkonite").setMaxStackSize(1);
        CATALYST_AWAKENED_DRACONIUM = ITEMS.addItem(CATALYST + 16, "catalyst_awakened_draconium").setMaxStackSize(1);
        CATALYST_EXO_HALKONITE = ITEMS.addItem(CATALYST + 17, "catalyst_exo_halkonite").setMaxStackSize(1);
        CATALYST_HAM_ALLOY = ITEMS.addItem(CATALYST + 18, "catalyst_ham_alloy").setMaxStackSize(1);
        CATALYST_ARCANITE = ITEMS.addItem(CATALYST + 19, "catalyst_arcanite").setMaxStackSize(1);

        PLANETOID_SCANNING_DRONE = ITEMS.addItem(DATA + 0, "planetoid_scanning_drone");
        PLANETOID_HARVESTING_DRONE = ITEMS.addItem(DATA + 1, "planetoid_harvesting_drone");

        STONE_PLANETOID_DATA = ITEMS.addItem(DATA + 2, "stone_planetoid_data");
        NETHERRACK_PLANETOID_DATA = ITEMS.addItem(DATA + 3, "netherrack_planetoid_data");
        END_STONE_PLANETOID_DATA = ITEMS.addItem(DATA + 4, "end_stone_planetoid_data");
        OBSIDIAN_PLANETOID_DATA = ITEMS.addItem(DATA + 5, "obsidian_planetoid_data");
        MAGNETITE_PLANETOID_DATA = ITEMS.addItem(DATA + 6, "magnetite_planetoid_data");
        CHALCOPYRITE_PLANETOID_DATA = ITEMS.addItem(DATA + 7, "chalcopyrite_planetoid_data");
        REDSTONE_PLANETOID_DATA = ITEMS.addItem(DATA + 8, "redstone_planetoid_data");
        PYROLUSITE_PLANETOID_DATA = ITEMS.addItem(DATA + 9, "pyrolusite_planetoid_data");
        COAL_PLANETOID_DATA = ITEMS.addItem(DATA + 10, "coal_planetoid_data");
        GRAPHITE_PLANETOID_DATA = ITEMS.addItem(DATA + 11, "graphite_planetoid_data");
        CASSITERITE_PLANETOID_DATA = ITEMS.addItem(DATA + 12, "cassiterite_planetoid_data");
        APATITE_PLANETOID_DATA = ITEMS.addItem(DATA + 13, "apatite_planetoid_data");
        NICKEL_PLANETOID_DATA = ITEMS.addItem(DATA + 14, "nickel_planetoid_data");
        GALENA_PLANETOID_DATA = ITEMS.addItem(DATA + 15, "galena_planetoid_data");
        CHEESE_PLANETOID_DATA = ITEMS.addItem(DATA + 16, "cheese_planetoid_data");
        GEM_PLANETOID_DATA = ITEMS.addItem(DATA + 17, "gem_planetoid_data");
        SALT_PLANETOID_DATA = ITEMS.addItem(DATA + 18, "salt_planetoid_data");
        LAPIS_PLANETOID_DATA = ITEMS.addItem(DATA + 19, "lapis_planetoid_data");
        QUARTZ_PLANETOID_DATA = ITEMS.addItem(DATA + 20, "quartz_planetoid_data");
        NETHERITE_PLANETOID_DATA = ITEMS.addItem(DATA + 21, "netherite_planetoid_data");
        MONAZITE_PLANETOID_DATA = ITEMS.addItem(DATA + 22, "monazite_planetoid_data");
        PITCHBLENDE_PLANETOID_DATA = ITEMS.addItem(DATA + 23, "pitchblende_planetoid_data");
        COOPERITE_PLANETOID_DATA = ITEMS.addItem(DATA + 24, "cooperite_planetoid_data");
        XENOTIME_PLANETOID_DATA = ITEMS.addItem(DATA + 25, "xenotime_planetoid_data");
        NAQUADAH_PLANETOID_DATA = ITEMS.addItem(DATA + 26, "naquadah_planetoid_data");
        AZBANTIUM_PLANETOID_DATA = ITEMS.addItem(DATA + 27, "azbantium_planetoid_data");
        VIBRANITE_PLANETOID_DATA = ITEMS.addItem(DATA + 28, "vibranite_planetoid_data");

        PLANETOID_SCANNING_DRONE_MK_2 = ITEMS.addItem(DATA + 29, "planetoid_scanning_drone_mk_2");

        EXOTIC_PLANETOID_DATA = ITEMS.addItem(DATA + 30, "exotic_planetoid_data");
        TIBERIUM_PLANETOID_DATA = ITEMS.addItem(DATA + 31, "tiberium_planetoid_data");
        TENGAM_PLANETOID_DATA = ITEMS.addItem(DATA + 32, "tengam_planetoid_data");
        DRACONIUM_PLANETOID_DATA = ITEMS.addItem(DATA + 33, "draconium_planetoid_data");

        DEEP_DARK_SCANNING_DRONE = ITEMS.addItem(DATA + 34, "deep_dark_scanning_drone");
        DEEP_DARK_HARVESTING_DRONE = ITEMS.addItem(DATA + 35, "deep_dark_harvesting_drone");
        DEEP_DARK_PLANETOID_DATA = ITEMS.addItem(DATA + 36, "deep_dark_planetoid_data");

        STAR_SCANNING_DRONE = ITEMS.addItem(DATA + 37, "star_scanning_drone");
        STAR_HARVESTING_DRONE = ITEMS.addItem(DATA + 38, "star_harvesting_drone");

        YELLOW_DWARF_STAR_DATA = ITEMS.addItem(DATA + 39, "yellow_dwarf_star_data");
        RED_DWARF_STAR_DATA = ITEMS.addItem(DATA + 40, "red_dwarf_star_data");
        RED_GIANT_STAR_DATA = ITEMS.addItem(DATA + 41, "red_giant_star_data");
        RED_SUPERGIANT_STAR_DATA = ITEMS.addItem(DATA + 42, "red_supergiant_star_data");
        BLUE_GIANT_STAR_DATA = ITEMS.addItem(DATA + 43, "blue_giant_star_data");
        WHITE_DWARF_STAR_DATA = ITEMS.addItem(DATA + 44, "white_dwarf_star_data");
        BROWN_DWARF_STAR_DATA = ITEMS.addItem(DATA + 45, "brown_dwarf_star_data");
        BLACK_DWARF_STAR_DATA = ITEMS.addItem(DATA + 46, "black_dwarf_star_data");
        NEUTRON_STAR_DATA = ITEMS.addItem(DATA + 47, "neutron_star_data");
        PULSAR_STAR_DATA = ITEMS.addItem(DATA + 48, "pulsar_star_data");

        PETRI_DISH_STERILIZED = ITEMS.addItem(CULTURE + 0, "petri_dish_sterilized");
        CULTURE_E_COLI = ITEMS.addItem(CULTURE + 1, "culture_e_coli");
        CULTURE_YEAST = ITEMS.addItem(CULTURE + 2, "culture_yeast");
        CULTURE_RED_ALGAE = ITEMS.addItem(CULTURE + 3, "culture_red_algae");
        CULTURE_STEM_CELL = ITEMS.addItem(CULTURE + 4, "culture_stem_cell");
        CULTURE_YEAST_RUPTURED = ITEMS.addItem(CULTURE + 5, "culture_yeast_ruptured");
        CULTURE_RED_ALGAE_BOILED = ITEMS.addItem(CULTURE + 6, "culture_red_algae_boiled");
        CULTURE_STEM_CELL_WIRED = ITEMS.addItem(CULTURE + 7, "culture_stem_cell_wired");
        CULTURE_XENOXENE = ITEMS.addItem(CULTURE + 8, "culture_xenoxene");

        COIL_UHV = ITEMS.addItem(COIL + 0, "coil_uhv");
        COIL_UEV = ITEMS.addItem(COIL + 1, "coil_uev");
        COIL_UIV = ITEMS.addItem(COIL + 2, "coil_uiv");
        COIL_UXV = ITEMS.addItem(COIL + 3, "coil_uxv");
        COIL_OpV = ITEMS.addItem(COIL + 4, "coil_opv");
        COIL_MAX = ITEMS.addItem(COIL + 5, "coil_max");

        STELLAR_ESSENCE_BLANK = ITEMS.addItem(STELLAR + 0, "stellar_essence_blank");
        STELLAR_ESSENCE_OVERWORLD = ITEMS.addItem(STELLAR + 1, "stellar_essence_overworld");
        STELLAR_ESSENCE_NETHER = ITEMS.addItem(STELLAR + 2, "stellar_essence_nether");
        STELLAR_ESSENCE_END = ITEMS.addItem(STELLAR + 3, "stellar_essence_end");
        STELLAR_ESSENCE_BEYOND = ITEMS.addItem(STELLAR + 4, "stellar_essence_beyond");

        SPACEWEED = ITEMS.addItem(ETC + 0, "spaceweed");
        CRUSHED_SPACEWEED = ITEMS.addItem(ETC + 1, "crushed_spaceweed");
        LENS_ARRAY_HYPERAMPLIFYING = ITEMS.addItem(ETC + 2, "lens_array_hyperamplifying");
        LENS_ARRAY_HYPERPRECISE = ITEMS.addItem(ETC + 3, "lens_array_hyperprecise");
        QUANTUM_ANOMALY = ITEMS.addItem(ETC + 4, "quantum_anomaly");
        QUANTIUM_STAR = ITEMS.addItem(ETC + 5, "quantium_star");
        ELECTRIC_MOTOR_MAX = ITEMS.addItem(ETC + 6, "electric_motor_max");
        CONVEYOR_MODULE_MAX = ITEMS.addItem(ETC + 7, "conveyor_module_max");
        ELECTRIC_PUMP_MAX = ITEMS.addItem(ETC + 8, "electric_pump_max");
        ELECTRIC_PISTON_MAX = ITEMS.addItem(ETC + 9, "electric_piston_max");
        ROBOT_ARM_MAX = ITEMS.addItem(ETC + 10, "robot_arm_max");
        FIELD_GENERATOR_MAX = ITEMS.addItem(ETC + 11, "field_generator_max");
        SENSOR_MAX = ITEMS.addItem(ETC + 12, "sensor_max");
        EMITTER_MAX = ITEMS.addItem(ETC + 13, "emitter_max");
        MYSTERIOUS_BLOB_ARGON = ITEMS.addItem(ETC + 14, "mysterious_blob_argon");
        MYSTERIOUS_BLOB_HELIUM = ITEMS.addItem(ETC + 15, "mysterious_blob_helium");
        MYSTERIOUS_BLOB_HYDROGEN = ITEMS.addItem(ETC + 16, "mysterious_blob_hydrogen");
        MYSTERIOUS_BLOB_KRYPTON = ITEMS.addItem(ETC + 17, "mysterious_blob_krypton");
        MYSTERIOUS_BLOB_NEON = ITEMS.addItem(ETC + 18, "mysterious_blob_neon");
        MYSTERIOUS_BLOB_NITROGEN = ITEMS.addItem(ETC + 19, "mysterious_blob_nitrogen");
        MYSTERIOUS_BLOB_OXYGEN = ITEMS.addItem(ETC + 20, "mysterious_blob_oxygen");
        HKSP_DD = ITEMS.addItem(ETC + 21, "hksp_dd");
        HKSP_C = ITEMS.addItem(ETC + 22, "hksp_c");
        HKSP_BC = ITEMS.addItem(ETC + 23, "hksp_bc");
        HKSP_F = ITEMS.addItem(ETC + 24, "hksp_f");
        FEMTOSCALE_SINGULARITY = ITEMS.addItem(ETC + 25, "femtoscale_singularity");

        POWER_UNIT_UHV = ITEMS.addItem(TOOL + 0, "power_unit_uhv")
                .addComponents(ElectricStats.createElectricItem(Long.MAX_VALUE, GTValues.UHV)).setMaxStackSize(8);

        HOE_HEAD = ITEMS.addItem(END + 0, "hoe_head");
        HOE_BINDING = ITEMS.addItem(END + 1, "hoe_binding");
        HOE_CRYSTAL = ITEMS.addItem(END + 2, "hoe_crystal");
        HOE_CORE = ITEMS.addItem(END + 3, "hoe_core");
        HOE_STABILIZER = ITEMS.addItem(END + 4, "hoe_stabilizer");
        HOE_HANDLE = ITEMS.addItem(END + 5, "hoe_handle");
    }
}
