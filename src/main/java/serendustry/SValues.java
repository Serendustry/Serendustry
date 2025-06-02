package serendustry;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Material;
import gregtech.client.utils.TooltipHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.TextFormatting;
import serendustry.client.utils.STooltipHelper;

import static gregtech.api.unification.material.Materials.Aluminium;
import static gregtech.api.unification.material.Materials.Copper;
import static gregtech.api.unification.material.Materials.Darmstadtium;
import static gregtech.api.unification.material.Materials.EnrichedNaquadahTriniumEuropiumDuranide;
import static gregtech.api.unification.material.Materials.Europium;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.IndiumTinBariumTitaniumCuprate;
import static gregtech.api.unification.material.Materials.IronMagnetic;
import static gregtech.api.unification.material.Materials.Lubricant;
import static gregtech.api.unification.material.Materials.MagnesiumDiboride;
import static gregtech.api.unification.material.Materials.ManganesePhosphide;
import static gregtech.api.unification.material.Materials.MercuryBariumCalciumCuprate;
import static gregtech.api.unification.material.Materials.NaquadahAlloy;
import static gregtech.api.unification.material.Materials.NeodymiumMagnetic;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.NiobiumTitanium;
import static gregtech.api.unification.material.Materials.Platinum;
import static gregtech.api.unification.material.Materials.RedAlloy;
import static gregtech.api.unification.material.Materials.RhodiumPlatedPalladium;
import static gregtech.api.unification.material.Materials.RutheniumTriniumAmericiumNeutronate;
import static gregtech.api.unification.material.Materials.SamariumIronArsenicOxide;
import static gregtech.api.unification.material.Materials.SamariumMagnetic;
import static gregtech.api.unification.material.Materials.StainlessSteel;
import static gregtech.api.unification.material.Materials.Steel;
import static gregtech.api.unification.material.Materials.SteelMagnetic;
import static gregtech.api.unification.material.Materials.Tin;
import static gregtech.api.unification.material.Materials.Titanium;
import static gregtech.api.unification.material.Materials.TungstenSteel;
import static gregtech.api.unification.material.Materials.UraniumRhodiumDinaquadide;
import static gregtech.api.unification.material.Materials.UraniumTriplatinum;
import static gregtech.api.unification.material.Materials.VanadiumGallium;
import static gregtech.api.unification.material.Materials.WroughtIron;
import static gregtech.api.unification.material.Materials.YttriumBariumCuprate;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_EV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_HV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_IV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_LV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_LuV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_MV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_OpV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UEV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UHV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UIV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UXV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_ZPM;
import static gregtech.common.items.MetaItems.EMITTER_EV;
import static gregtech.common.items.MetaItems.EMITTER_HV;
import static gregtech.common.items.MetaItems.EMITTER_IV;
import static gregtech.common.items.MetaItems.EMITTER_LV;
import static gregtech.common.items.MetaItems.EMITTER_LuV;
import static gregtech.common.items.MetaItems.EMITTER_MV;
import static gregtech.common.items.MetaItems.EMITTER_OpV;
import static gregtech.common.items.MetaItems.EMITTER_UEV;
import static gregtech.common.items.MetaItems.EMITTER_UHV;
import static gregtech.common.items.MetaItems.EMITTER_UIV;
import static gregtech.common.items.MetaItems.EMITTER_UV;
import static gregtech.common.items.MetaItems.EMITTER_UXV;
import static gregtech.common.items.MetaItems.EMITTER_ZPM;
import static gregtech.common.items.MetaItems.HIGH_POWER_INTEGRATED_CIRCUIT;
import static gregtech.common.items.MetaItems.LOW_POWER_INTEGRATED_CIRCUIT;
import static gregtech.common.items.MetaItems.POWER_INTEGRATED_CIRCUIT;
import static gregtech.common.items.MetaItems.SENSOR_EV;
import static gregtech.common.items.MetaItems.SENSOR_HV;
import static gregtech.common.items.MetaItems.SENSOR_IV;
import static gregtech.common.items.MetaItems.SENSOR_LV;
import static gregtech.common.items.MetaItems.SENSOR_LuV;
import static gregtech.common.items.MetaItems.SENSOR_MV;
import static gregtech.common.items.MetaItems.SENSOR_OpV;
import static gregtech.common.items.MetaItems.SENSOR_UEV;
import static gregtech.common.items.MetaItems.SENSOR_UHV;
import static gregtech.common.items.MetaItems.SENSOR_UIV;
import static gregtech.common.items.MetaItems.SENSOR_UV;
import static gregtech.common.items.MetaItems.SENSOR_UXV;
import static gregtech.common.items.MetaItems.SENSOR_ZPM;
import static gregtech.common.items.MetaItems.ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT;
import static gregtech.common.items.MetaItems.ULTRA_LOW_POWER_INTEGRATED_CIRCUIT;
import static gregtech.common.items.MetaItems.VOLTAGE_COIL_EV;
import static gregtech.common.items.MetaItems.VOLTAGE_COIL_HV;
import static gregtech.common.items.MetaItems.VOLTAGE_COIL_IV;
import static gregtech.common.items.MetaItems.VOLTAGE_COIL_LuV;
import static gregtech.common.items.MetaItems.VOLTAGE_COIL_MV;
import static gregtech.common.items.MetaItems.VOLTAGE_COIL_UV;
import static gregtech.common.items.MetaItems.VOLTAGE_COIL_ZPM;
import static net.minecraft.util.text.TextFormatting.AQUA;
import static net.minecraft.util.text.TextFormatting.DARK_GRAY;
import static net.minecraft.util.text.TextFormatting.GRAY;
import static net.minecraft.util.text.TextFormatting.LIGHT_PURPLE;
import static net.minecraft.util.text.TextFormatting.OBFUSCATED;
import static net.minecraft.util.text.TextFormatting.RESET;
import static net.minecraft.util.text.TextFormatting.WHITE;
import static serendustry.item.SerendustryMetaItems.CHIP_OPIC;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_EV;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_HV;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_IV;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_LV;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_LuV;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_MAX;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_MV;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_OpV;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_UEV;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_UHV;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_UIV;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_ULV;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_UV;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_UXV;
import static serendustry.item.SerendustryMetaItems.CIRCUIT_ANY_ZPM;
import static serendustry.item.SerendustryMetaItems.COIL_MAX;
import static serendustry.item.SerendustryMetaItems.COIL_OpV;
import static serendustry.item.SerendustryMetaItems.COIL_UEV;
import static serendustry.item.SerendustryMetaItems.COIL_UHV;
import static serendustry.item.SerendustryMetaItems.COIL_UIV;
import static serendustry.item.SerendustryMetaItems.COIL_UXV;
import static serendustry.item.SerendustryMetaItems.ELECTRIC_PUMP_MAX;
import static serendustry.item.SerendustryMetaItems.EMITTER_MAX;
import static serendustry.item.SerendustryMetaItems.ERROR_INGOT;
import static serendustry.item.SerendustryMetaItems.SENSOR_MAX;
import static serendustry.item.material.SerendustryMaterials.AbyssalAlloy;
import static serendustry.item.material.SerendustryMaterials.ExoHalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.Ferrofluid;
import static serendustry.item.material.SerendustryMaterials.Floppa;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.KerrBlackHole;
import static serendustry.item.material.SerendustryMaterials.MagneticHolmium;
import static serendustry.item.material.SerendustryMaterials.MolybdeniteLubricant;
import static serendustry.item.material.SerendustryMaterials.OmniversalLubricant;
import static serendustry.item.material.SerendustryMaterials.Quantium;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.Quantum;
import static serendustry.item.material.SerendustryMaterials.ScOpv;
import static serendustry.item.material.SerendustryMaterials.ScUevSane;
import static serendustry.item.material.SerendustryMaterials.ScUxvSane;
import static serendustry.item.material.SerendustryMaterials.TengamAttuned;

public class SValues {

    // Arrays of materials and items sorted by tier
    public static final Material[] TIER_PLATE = { WroughtIron, Steel, Aluminium, StainlessSteel, Titanium,
            TungstenSteel, RhodiumPlatedPalladium, NaquadahAlloy, Darmstadtium, Neutronium, AbyssalAlloy, Infinity,
            ExoHalkoniteSteel, Quantum, Floppa };
    public static final Material[] TIER_CABLE = { RedAlloy, Tin, Copper, Gold, Aluminium, Platinum, NiobiumTitanium,
            VanadiumGallium, YttriumBariumCuprate, Europium, Quantium40, Hypogen, ScUxvSane, Quantium, Floppa };
    public static final Material[] TIER_MAGNET = { Floppa, IronMagnetic, SteelMagnetic, SteelMagnetic,
            NeodymiumMagnetic, NeodymiumMagnetic, SamariumMagnetic, SamariumMagnetic, MagneticHolmium, MagneticHolmium,
            TengamAttuned, TengamAttuned, TengamAttuned, TengamAttuned, KerrBlackHole };
    public static final Material[] TIER_SUPERCONDUCTOR = { Floppa, ManganesePhosphide, MagnesiumDiboride,
            MercuryBariumCalciumCuprate, UraniumTriplatinum, SamariumIronArsenicOxide, IndiumTinBariumTitaniumCuprate,
            UraniumRhodiumDinaquadide, EnrichedNaquadahTriniumEuropiumDuranide, RutheniumTriniumAmericiumNeutronate,
            ScUevSane, Hypogen, ScUxvSane, ScOpv, Floppa };
    public static final MetaItem.MetaValueItem[] TIER_COIL = { ERROR_INGOT, ERROR_INGOT, VOLTAGE_COIL_MV,
            VOLTAGE_COIL_HV, VOLTAGE_COIL_EV, VOLTAGE_COIL_IV, VOLTAGE_COIL_LuV, VOLTAGE_COIL_ZPM, VOLTAGE_COIL_UV,
            COIL_UHV, COIL_UEV, COIL_UIV, COIL_UXV, COIL_OpV, COIL_MAX };
    public static final MetaItem.MetaValueItem[] TIER_POWER_IC = { ERROR_INGOT, ERROR_INGOT,
            ULTRA_LOW_POWER_INTEGRATED_CIRCUIT, LOW_POWER_INTEGRATED_CIRCUIT, POWER_INTEGRATED_CIRCUIT,
            HIGH_POWER_INTEGRATED_CIRCUIT, HIGH_POWER_INTEGRATED_CIRCUIT, ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT,
            ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, CHIP_OPIC, CHIP_OPIC, CHIP_OPIC,
            CHIP_OPIC, CHIP_OPIC };
    public static final MetaItem.MetaValueItem[] TIER_PUMP = { ERROR_INGOT, ELECTRIC_PUMP_LV, ELECTRIC_PUMP_MV,
            ELECTRIC_PUMP_HV, ELECTRIC_PUMP_EV, ELECTRIC_PUMP_IV, ELECTRIC_PUMP_LuV, ELECTRIC_PUMP_ZPM,
            ELECTRIC_PUMP_UV, ELECTRIC_PUMP_UHV, ELECTRIC_PUMP_UEV, ELECTRIC_PUMP_UIV, ELECTRIC_PUMP_UXV,
            ELECTRIC_PUMP_OpV, ELECTRIC_PUMP_MAX };
    public static final MetaItem.MetaValueItem[] TIER_SENSOR = { ERROR_INGOT, SENSOR_LV, SENSOR_MV, SENSOR_HV,
            SENSOR_EV, SENSOR_IV, SENSOR_LuV, SENSOR_ZPM, SENSOR_UV, SENSOR_UHV, SENSOR_UEV, SENSOR_UIV, SENSOR_UXV,
            SENSOR_OpV, SENSOR_MAX };
    public static final MetaItem.MetaValueItem[] TIER_EMITTER = { ERROR_INGOT, EMITTER_LV, EMITTER_MV, EMITTER_HV,
            EMITTER_EV, EMITTER_IV, EMITTER_LuV, EMITTER_ZPM, EMITTER_UV, EMITTER_UHV, EMITTER_UEV, EMITTER_UIV,
            EMITTER_UXV, EMITTER_OpV, EMITTER_MAX };
    public static final Material[] TIER_LUBRICANT = { Lubricant, Lubricant, Lubricant, Lubricant, Lubricant, Lubricant,
            MolybdeniteLubricant, MolybdeniteLubricant, Ferrofluid, Ferrofluid, Ferrofluid, Ferrofluid, Ferrofluid,
            Ferrofluid, OmniversalLubricant };
    public static final Material[] TIER_MARKER_MATERIAL = { MarkerMaterials.Tier.ULV, MarkerMaterials.Tier.LV,
            MarkerMaterials.Tier.MV, MarkerMaterials.Tier.HV, MarkerMaterials.Tier.EV, MarkerMaterials.Tier.IV,
            MarkerMaterials.Tier.LuV, MarkerMaterials.Tier.ZPM, MarkerMaterials.Tier.UV, MarkerMaterials.Tier.UHV,
            MarkerMaterials.Tier.UEV, MarkerMaterials.Tier.UIV, MarkerMaterials.Tier.UXV, MarkerMaterials.Tier.OpV,
            MarkerMaterials.Tier.MAX };
    public static final MetaItem.MetaValueItem[] TIER_ANY_CIRCUIT = { CIRCUIT_ANY_ULV, CIRCUIT_ANY_LV, CIRCUIT_ANY_MV,
            CIRCUIT_ANY_HV, CIRCUIT_ANY_EV, CIRCUIT_ANY_IV, CIRCUIT_ANY_LuV, CIRCUIT_ANY_ZPM, CIRCUIT_ANY_UV,
            CIRCUIT_ANY_UHV, CIRCUIT_ANY_UEV, CIRCUIT_ANY_UIV, CIRCUIT_ANY_UXV, CIRCUIT_ANY_OpV, CIRCUIT_ANY_MAX };

    // Lang keys
    public static final String ENERGY_REGULAR = I18n.format("serendustry.machine.energy.regular");
    public static final String ENERGY_SUBSTATION = I18n.format("serendustry.machine.energy.substation");
    public static final String ENERGY_LASER = I18n.format("serendustry.machine.energy.laser");

    // String formatting codes
    public static final STooltipHelper.SFormatCode FORMAT_ENVOIDIA = STooltipHelper.createNewCode(8,
            new TextFormatting[] { LIGHT_PURPLE }, new TextFormatting[] { AQUA },
            new TextFormatting[] { WHITE, OBFUSCATED }, new TextFormatting[] { RESET, AQUA },
            new TextFormatting[] { LIGHT_PURPLE });

    public static final TooltipHelper.GTFormatCode FORMAT_IRIS_1 = TooltipHelper.createNewCode(16, WHITE, GRAY,
            DARK_GRAY);
    public static final TooltipHelper.GTFormatCode FORMAT_IRIS_2 = TooltipHelper.createNewCode(16, DARK_GRAY, WHITE,
            GRAY);
    public static final TooltipHelper.GTFormatCode FORMAT_IRIS_3 = TooltipHelper.createNewCode(16, GRAY, DARK_GRAY,
            WHITE);
}
