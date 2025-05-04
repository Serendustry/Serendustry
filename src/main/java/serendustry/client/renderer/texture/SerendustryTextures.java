package serendustry.client.renderer.texture;

import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;
import serendustry.Serendustry;

public class SerendustryTextures {

    public static SimpleOverlayRenderer CASING_AMERICIUM;
    public static SimpleOverlayRenderer CASING_CARBON;
    public static SimpleOverlayRenderer CASING_ADAMANTIUM;

    public static SimpleOverlayRenderer CASING_SPACE_ELEVATOR;
    public static SimpleOverlayRenderer CASING_ADV_FUSION;
    public static SimpleOverlayRenderer CASING_ADV_FUSION_ACTIVE;

    public static void preInit() {
        //Serendustry.logger.info("SerendustryTextures.preInit()");
        CASING_AMERICIUM = new SimpleOverlayRenderer("casing/solid/americium");
        CASING_CARBON = new SimpleOverlayRenderer("casing/solid/carbon");
        CASING_ADAMANTIUM = new SimpleOverlayRenderer("casing/solid/adamantium");
        CASING_SPACE_ELEVATOR = new SimpleOverlayRenderer("casing/solid/space_elevator");
        CASING_ADV_FUSION = new SimpleOverlayRenderer("casing/solid/adv_fusion");
        CASING_ADV_FUSION_ACTIVE = new SimpleOverlayRenderer("casing/solid/adv_fusion_active");
    }
}
