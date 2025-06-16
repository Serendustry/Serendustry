package serendustry.machine;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

import gregtech.api.GTValues;
import gregtech.common.metatileentities.multi.multiblockpart.MetaTileEntityLaserHatch;
import serendustry.Serendustry;

// lateinit var DISSOLUTION_TANK: MetaTileEntityDissolutionTank
// lateinit var INDUSTRIAL_DECANTER: MetaTileEntityIndustrialDecanter
// lateinit var INDUSTRIAL_OXYLATOR: MetaTileEntityIndustrialOxylator
// lateinit var ROTARY_FILTER: MetaTileEntityRotaryFilter
// lateinit var DIGESTER: MetaTileEntityDigester

public class SerendustryMetaTileEntities {

    public static MetaTileEntityIndustrialLaboratory INDUSTRIAL_LABORATORY;
    public static MetaTileEntityTranscendentPlasmaMixer TRANSCENDENT_PLASMA_MIXER;
    public static MetaTileEntitySpaceElevator SPACE_ELEVATOR;
    public static MetaTileEntityNebulaicNexus NEBULAIC_NEXUS;
    public static MetaTileEntityPlasmaFoundry PLASMA_FOUNDRY;
    public static MetaTileEntityGiantFractionatingColumn GIANT_FRACTIONATING_COLUMN;
    public static MetaTileEntityCVDChamber CVD_CHAMBER;
    public static MetaTileEntitySonicator SONICATOR;
    public static MetaTileEntityHPLaserArray HP_LASER_ARRAY;
    public static MetaTileEntityBiolab BIOLAB;
    public static MetaTileEntityAdvancedFusionReactor ADVANCED_FUSION_REACTOR;
    public static MetaTileEntityYggdrasil YGGDRASIL;
    public static MetaTileEntityStellarIncubator STELLAR_INCUBATOR;
    public static MetaTileEntityMegaChemicalReactor MEGA_CHEMICAL_REACTOR;
    public static MetaTileEntityDehydrator DEHYDRATOR;
    public static MetaTileEntityStellarEngine STELLAR_ENGINE;
    public static MetaTileEntityPlasmaCondenser PLASMA_CONDENSER;
    public static MetaTileEntityElectricImplosionCompressor ELECTRIC_IMPLOSION_COMPRESSOR;
    public static MetaTileEntityAdvancedAssemblyLine ADVANCED_ASSEMBLY_LINE;
    public static MetaTileEntityCrystallizer CRYSTALLIZER;
    public static MetaTileEntityMegaFusionReactor MEGA_FUSION_REACTOR;
    public static MetaTileEntityAdvancedChemicalReactor ADVANCED_CHEMICAL_REACTOR;
    public static MetaTileEntityEmpyrean EMPYREAN;
    public static MetaTileEntityDistortionEngine DISTORTION_ENGINE;
    public static MetaTileEntityAntimatterGenerator ANTIMATTER_GENERATOR;

    public static MetaTileEntityLaserHatch[] LASER_INPUT_HATCH_16384 = new MetaTileEntityLaserHatch[GTValues.V.length -
            1];
    public static MetaTileEntityLaserHatch[] LASER_OUTPUT_HATCH_16384 = new MetaTileEntityLaserHatch[GTValues.V.length -
            1];

    public static void preInit() {
        // todo claim an id range
        INDUSTRIAL_LABORATORY = registerMetaTileEntity(4000,
                new MetaTileEntityIndustrialLaboratory(Serendustry.ID("industrial_laboratory")));
        TRANSCENDENT_PLASMA_MIXER = registerMetaTileEntity(4001,
                new MetaTileEntityTranscendentPlasmaMixer(Serendustry.ID("transcendent_plasma_mixer")));
        SPACE_ELEVATOR = registerMetaTileEntity(4002,
                new MetaTileEntitySpaceElevator(Serendustry.ID("space_elevator")));
        NEBULAIC_NEXUS = registerMetaTileEntity(4003,
                new MetaTileEntityNebulaicNexus(Serendustry.ID("nebulaic_nexus")));
        PLASMA_FOUNDRY = registerMetaTileEntity(4004,
                new MetaTileEntityPlasmaFoundry(Serendustry.ID("plasma_foundry")));
        GIANT_FRACTIONATING_COLUMN = registerMetaTileEntity(4005,
                new MetaTileEntityGiantFractionatingColumn(Serendustry.ID("giant_fractionating_column")));
        CVD_CHAMBER = registerMetaTileEntity(4006, new MetaTileEntityCVDChamber(Serendustry.ID("cvd_chamber")));
        SONICATOR = registerMetaTileEntity(4007, new MetaTileEntitySonicator(Serendustry.ID("sonicator")));
        HP_LASER_ARRAY = registerMetaTileEntity(4008, new MetaTileEntityHPLaserArray(Serendustry.ID("hp_laser_array")));
        BIOLAB = registerMetaTileEntity(4009, new MetaTileEntityBiolab(Serendustry.ID("biolab")));
        ADVANCED_FUSION_REACTOR = registerMetaTileEntity(4010,
                new MetaTileEntityAdvancedFusionReactor(Serendustry.ID("advanced_fusion_reactor")));
        YGGDRASIL = registerMetaTileEntity(4011, new MetaTileEntityYggdrasil(Serendustry.ID("yggdrasil")));
        STELLAR_INCUBATOR = registerMetaTileEntity(4012,
                new MetaTileEntityStellarIncubator(Serendustry.ID("stellar_incubator")));
        MEGA_CHEMICAL_REACTOR = registerMetaTileEntity(4013,
                new MetaTileEntityMegaChemicalReactor(Serendustry.ID("mega_chemical_reactor")));
        DEHYDRATOR = registerMetaTileEntity(4014, new MetaTileEntityDehydrator(Serendustry.ID("dehydrator")));
        STELLAR_ENGINE = registerMetaTileEntity(4015,
                new MetaTileEntityStellarEngine(Serendustry.ID("stellar_engine")));
        PLASMA_CONDENSER = registerMetaTileEntity(4016,
                new MetaTileEntityPlasmaCondenser(Serendustry.ID("plasma_condenser")));
        ELECTRIC_IMPLOSION_COMPRESSOR = registerMetaTileEntity(4017,
                new MetaTileEntityElectricImplosionCompressor(Serendustry.ID("electric_implosion_compressor")));
        ADVANCED_ASSEMBLY_LINE = registerMetaTileEntity(4018,
                new MetaTileEntityAdvancedAssemblyLine(Serendustry.ID("advanced_assembly_line")));
        CRYSTALLIZER = registerMetaTileEntity(4019,
                new MetaTileEntityCrystallizer(Serendustry.ID("crystallizer")));
        MEGA_FUSION_REACTOR = registerMetaTileEntity(4020,
                new MetaTileEntityMegaFusionReactor(Serendustry.ID("mega_fusion_reactor")));
        ADVANCED_CHEMICAL_REACTOR = registerMetaTileEntity(4021,
                new MetaTileEntityAdvancedChemicalReactor(Serendustry.ID("advanced_chemical_reactor")));
        EMPYREAN = registerMetaTileEntity(4022,
                new MetaTileEntityEmpyrean(Serendustry.ID("empyrean")));
        DISTORTION_ENGINE = registerMetaTileEntity(4023,
                new MetaTileEntityDistortionEngine(Serendustry.ID("distortion_engine")));
        ANTIMATTER_GENERATOR = registerMetaTileEntity(4024,
                new MetaTileEntityAntimatterGenerator(Serendustry.ID("antimatter_generator")));

        for (int i = GTValues.UXV; i <= GTValues.OpV; i++) {
            String voltageName = GTValues.VN[i].toLowerCase();
            LASER_INPUT_HATCH_16384[i] = registerMetaTileEntity(4025 + i,
                    new MetaTileEntityLaserHatch(
                            Serendustry.ID("laser_hatch.target_16384a." + voltageName), false, i, 16384));
            LASER_OUTPUT_HATCH_16384[i] = registerMetaTileEntity(4027 + i,
                    new MetaTileEntityLaserHatch(Serendustry.ID("laser_hatch.source_16384a." + voltageName), true, i,
                            16384));
        }
    }
}
