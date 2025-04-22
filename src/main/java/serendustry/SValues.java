package serendustry;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Material;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.common.items.MetaItems.*;
import static serendustry.item.SerendustryMetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;

public class SValues {
    public static final Material[] Tier_Plate = {WroughtIron, Steel, Aluminium, StainlessSteel, Titanium, TungstenSteel, RhodiumPlatedPalladium, NaquadahAlloy, Darmstadtium, Neutronium, AbyssalAlloy, Infinity, AwakenedDraconium, Quantum, Floppa};
    public static final Material[] Tier_Cable = {RedAlloy, Tin, Copper, Gold, Aluminium, Platinum, NiobiumTitanium, VanadiumGallium, YttriumBariumCuprate, Europium, Quantium40, Hypogen, Bedrockium, Quantium, Floppa};
    public static final Material[] Tier_Magnet = {Floppa, IronMagnetic, SteelMagnetic, SteelMagnetic, NeodymiumMagnetic, NeodymiumMagnetic, SamariumMagnetic, SamariumMagnetic, MagneticHolmium, MagneticHolmium, TengamAttuned,
            TengamAttuned, KerrBlackHole, KerrBlackHole, KerrBlackHole};
    public static final Material[] Tier_Superconductor = { Floppa, ManganesePhosphide, MagnesiumDiboride, MercuryBariumCalciumCuprate, UraniumTriplatinum, SamariumIronArsenicOxide, IndiumTinBariumTitaniumCuprate,
            UraniumRhodiumDinaquadide, EnrichedNaquadahTriniumEuropiumDuranide, RutheniumTriniumAmericiumNeutronate, ScUevSane, ScUiv, ScUxv, ScOpv, Floppa};
    public static final MetaItem.MetaValueItem[] Tier_Coil = {ERROR_INGOT, ERROR_INGOT, VOLTAGE_COIL_MV, VOLTAGE_COIL_HV, VOLTAGE_COIL_EV, VOLTAGE_COIL_IV, VOLTAGE_COIL_LuV, VOLTAGE_COIL_ZPM, VOLTAGE_COIL_UV, COIL_UHV,
            COIL_UEV, COIL_UIV, COIL_UXV, COIL_OpV, COIL_MAX};
    public static final MetaItem.MetaValueItem[] Tier_PowerIC = {ERROR_INGOT, ERROR_INGOT, ULTRA_LOW_POWER_INTEGRATED_CIRCUIT, LOW_POWER_INTEGRATED_CIRCUIT, POWER_INTEGRATED_CIRCUIT, HIGH_POWER_INTEGRATED_CIRCUIT,
            HIGH_POWER_INTEGRATED_CIRCUIT, ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, CHIP_OPIC, CHIP_OPIC, CHIP_OPIC, CHIP_OPIC, CHIP_OPIC };
    public static final MetaItem.MetaValueItem[] Tier_Pump = {ERROR_INGOT, ELECTRIC_PUMP_LV, ELECTRIC_PUMP_MV, ELECTRIC_PUMP_HV, ELECTRIC_PUMP_EV, ELECTRIC_PUMP_IV, ELECTRIC_PUMP_LuV, ELECTRIC_PUMP_ZPM, ELECTRIC_PUMP_UV,
            ELECTRIC_PUMP_UHV, ELECTRIC_PUMP_UEV, ELECTRIC_PUMP_UIV, ELECTRIC_PUMP_UXV, ELECTRIC_PUMP_OpV, ELECTRIC_PUMP_MAX};
    public static final MetaItem.MetaValueItem[] Tier_Sensor = {ERROR_INGOT, SENSOR_LV, SENSOR_MV, SENSOR_HV, SENSOR_EV, SENSOR_IV, SENSOR_LuV, SENSOR_ZPM, SENSOR_UV,
            SENSOR_UHV, SENSOR_UEV, SENSOR_UIV, SENSOR_UXV, SENSOR_OpV, SENSOR_MAX};
    public static final MetaItem.MetaValueItem[] Tier_Emitter = {ERROR_INGOT, EMITTER_LV, EMITTER_MV, EMITTER_HV, EMITTER_EV, EMITTER_IV, EMITTER_LuV, EMITTER_ZPM, EMITTER_UV,
            EMITTER_UHV, EMITTER_UEV, EMITTER_UIV, EMITTER_UXV, EMITTER_OpV, EMITTER_MAX};
    public static final Material[] Tier_Lube = {Lubricant, Lubricant, Lubricant, Lubricant, Lubricant, Lubricant, MolybdeniteLubricant, MolybdeniteLubricant, Ferrofluid, Ferrofluid, Ferrofluid, OmniversalLubricant,
            OmniversalLubricant, OmniversalLubricant, OmniversalLubricant};
    public static final Material[] Tier_MarkerMaterial = {MarkerMaterials.Tier.ULV, MarkerMaterials.Tier.LV, MarkerMaterials.Tier.MV, MarkerMaterials.Tier.HV, MarkerMaterials.Tier.EV, MarkerMaterials.Tier.IV, MarkerMaterials.Tier.LuV,
            MarkerMaterials.Tier.ZPM, MarkerMaterials.Tier.UV, MarkerMaterials.Tier.UHV, MarkerMaterials.Tier.UEV, MarkerMaterials.Tier.UIV, MarkerMaterials.Tier.UXV, MarkerMaterials.Tier.OpV, MarkerMaterials.Tier.MAX};
    public static final MetaItem.MetaValueItem[] Tier_AnyCircuit = {CIRCUIT_ANY_ULV, CIRCUIT_ANY_LV, CIRCUIT_ANY_MV, CIRCUIT_ANY_HV, CIRCUIT_ANY_EV, CIRCUIT_ANY_IV, CIRCUIT_ANY_LuV, CIRCUIT_ANY_ZPM, CIRCUIT_ANY_UV, CIRCUIT_ANY_UHV,
            CIRCUIT_ANY_UEV, CIRCUIT_ANY_UIV, CIRCUIT_ANY_UXV, CIRCUIT_ANY_OpV, CIRCUIT_ANY_MAX};
}
