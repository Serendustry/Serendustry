package serendustry.recipe;

public class SerendustryRecipes {

    public static void registerRecipes() {
        // registerPrefixHandlers() todo
        AlloyRecipes.init();
        AnimalWasteRecipes.init();
        BETSPerrhenateChain.init();
        BoPETCHain.init();
        CircuitRecipes.init();
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
        NanotubesChain.init();
        NetheriteChain.init();
        PeriodiciumChain.init();
        PlasmaFoundryRecipes.init();
        PlasmaFuels.init();
        PlasmaMixerRecipes.init();
        RadoxChain.init();
        SelfRepairingNanobotsRecipes.init();
        SemiconductorGradeSiliconChain.init();
        SmallFusionReactorRecipes.init();
        SpaceElevatorRecipes.init();
        StarMatterRecipes.init();
        TaraniumChain.init();
        ToolPrefixHandlers.registerToolPrefixHandler();
        WasteFluidRecipes.init();
    }
}
