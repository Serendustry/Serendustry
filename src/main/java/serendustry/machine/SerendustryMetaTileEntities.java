package serendustry.machine;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

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
    }
}
