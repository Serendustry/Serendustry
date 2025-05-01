package serendustry.client.renderer.texture;

import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;

public class Textures {
    public static SimpleOverlayRenderer ADAMANTIUM;

    public static void preInit() {
        ADAMANTIUM = new SimpleOverlayRenderer("casing/solid/adamantium");
    }
}
