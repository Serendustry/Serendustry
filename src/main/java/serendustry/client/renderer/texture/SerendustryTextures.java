package serendustry.client.renderer.texture;

import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;

public class SerendustryTextures {

    public static SimpleOverlayRenderer CASING_AMERICIUM;
    public static SimpleOverlayRenderer CASING_CARBON;
    public static SimpleOverlayRenderer CASING_ADAMANTIUM;
    public static SimpleOverlayRenderer CASING_NEUTRONIUM;

    public static SimpleOverlayRenderer CASING_SPACE_ELEVATOR;
    public static SimpleOverlayRenderer CASING_ADV_FUSION;
    public static SimpleOverlayRenderer CASING_ADV_FUSION_ACTIVE;

    public static void preInit() {
        CASING_AMERICIUM = new SimpleOverlayRenderer("casing/serendustry_metal/americium");
        CASING_CARBON = new SimpleOverlayRenderer("casing/serendustry_metal/carbon");
        CASING_ADAMANTIUM = new SimpleOverlayRenderer("casing/serendustry_metal/adamantium");
        CASING_NEUTRONIUM = new SimpleOverlayRenderer("casing/serendustry_metal/neutronium");

        CASING_SPACE_ELEVATOR = new SimpleOverlayRenderer("casing/serendustry_multi/space_elevator");
        CASING_ADV_FUSION = new SimpleOverlayRenderer("casing/serendustry_multi/adv_fusion");
        CASING_ADV_FUSION_ACTIVE = new SimpleOverlayRenderer("casing/serendustry_multi/adv_fusion_active");
    }
}
