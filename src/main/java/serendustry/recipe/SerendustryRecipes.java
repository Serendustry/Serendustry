package serendustry.recipe;

public class SerendustryRecipes {

    public static void registerRecipes() {
        // registerPrefixHandlers() todo
        AlloyRecipes.init();
        AnimalWasteRecipes.init();
        DestabilizedMatterChain.init();
        DragonEggRecipes.init();
        FerrofluidChain.init();
        GiantFractionatingColumnRecipes.init();
        HalkoniteSteelRecipes.init();
        HTComponentRecipes.init();
        HTMachineRecipes.init();
        LargeAlloySmelterRecipes.init();
        MagnetoResonaticRecipes.init();
        MiscRecipes.init();
        MysteriousBlobRecipes.init();
        PeriodiciumChain.init();
        PlasmaFoundryRecipes.init();
        PlasmaFuels.init();
        PlasmaMixerRecipes.init();
        RadoxChain.init();
        ToolPrefixHandlers.registerToolPrefixHandler();
        SmallFusionReactorRecipes.init();
        SpaceElevatorRecipes.init();
        StarMatterRecipes.init();
        WasteFluidRecipes.init();
    }
}
