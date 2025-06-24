package serendustry.client.renderer.texture;

import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;

public class SerendustryTextures {

    public static SimpleOverlayRenderer CASING_AMERICIUM;
    public static SimpleOverlayRenderer CASING_CARBON;
    public static SimpleOverlayRenderer CASING_ADAMANTIUM;
    public static SimpleOverlayRenderer CASING_NEUTRONIUM;

    public static SimpleOverlayRenderer CASING_ACR;
    public static SimpleOverlayRenderer CASING_SPACE_ELEVATOR;

    public static SimpleOverlayRenderer TEXTURE_ADV_FUSION;
    public static SimpleOverlayRenderer TEXTURE_ADV_FUSION_ACTIVE;

    public static OrientedOverlayRenderer OVERLAY_ADVANCED_CHEMICAL_REACTOR;
    public static OrientedOverlayRenderer OVERLAY_ADVANCED_FUSION_REACTOR;
    public static OrientedOverlayRenderer OVERLAY_BIOLAB;
    public static OrientedOverlayRenderer OVERLAY_CRYSTALLIZER;
    public static OrientedOverlayRenderer OVERLAY_ELECTRIC_IMPLOSION_COMPRESSOR;
    public static OrientedOverlayRenderer OVERLAY_EMPYREAN;
    public static OrientedOverlayRenderer OVERLAY_FLAMEL_CRUCIBLE;
    public static OrientedOverlayRenderer OVERLAY_PLASMA_CONDENSER;
    public static OrientedOverlayRenderer OVERLAY_SONICATOR;
    public static OrientedOverlayRenderer OVERLAY_STELLAR_ENGINE;

    public static void preInit() {
        CASING_AMERICIUM = new SimpleOverlayRenderer("casing/s_metal/americium");
        CASING_CARBON = new SimpleOverlayRenderer("casing/s_metal/carbon");
        CASING_ADAMANTIUM = new SimpleOverlayRenderer("casing/s_metal/adamantium");
        CASING_NEUTRONIUM = new SimpleOverlayRenderer("casing/s_metal/neutronium");

        CASING_ACR = new SimpleOverlayRenderer("casing/s_multi/acr");
        CASING_SPACE_ELEVATOR = new SimpleOverlayRenderer("casing/s_multi/space_elevator");

        TEXTURE_ADV_FUSION = new SimpleOverlayRenderer("casing/s_multi/adv_fusion");
        TEXTURE_ADV_FUSION_ACTIVE = new SimpleOverlayRenderer("casing/s_multi/adv_fusion_active");

        OVERLAY_ADVANCED_CHEMICAL_REACTOR = new OrientedOverlayRenderer("multiblock/advanced_chemical_reactor");
        OVERLAY_ADVANCED_FUSION_REACTOR = new OrientedOverlayRenderer("multiblock/advanced_fusion_reactor");
        OVERLAY_BIOLAB = new OrientedOverlayRenderer("multiblock/biolab");
        OVERLAY_CRYSTALLIZER = new OrientedOverlayRenderer("multiblock/crystallizer");
        OVERLAY_ELECTRIC_IMPLOSION_COMPRESSOR = new OrientedOverlayRenderer("multiblock/electric_implosion_compressor");
        OVERLAY_EMPYREAN = new OrientedOverlayRenderer("multiblock/empyrean");
        OVERLAY_FLAMEL_CRUCIBLE = new OrientedOverlayRenderer("multiblock/flamel_crucible");
        OVERLAY_PLASMA_CONDENSER = new OrientedOverlayRenderer("multiblock/plasma_condenser");
        OVERLAY_SONICATOR = new OrientedOverlayRenderer("multiblock/sonicator");
        OVERLAY_STELLAR_ENGINE = new OrientedOverlayRenderer("multiblock/stellar_engine");
    }
}
