package serendustry.recipe;

public class SerendustryRecipes {

    public static void removeRecipes() {
        RemoveRecipes.init();
    }

    public static void registerRecipes() {
        // registerPrefixHandlers() todo
        AlloyRecipes.init();
        AnimalWasteRecipes.init();
        BETSPerrhenateChain.init();
        BiolabRecipes.init();
        BoPETCHain.init();
        CircuitRecipes.init();
        DestabilizedMatterChain.init();
        DragonEggRecipes.init();
        FerrofluidChain.init();
        GermaniumChain.init();
        GiantFractionatingColumnRecipes.init();
        HalkoniteSteelRecipes.init();
        HTComponentRecipes.init();
        HTMachineRecipes.init();
        LaboratoryRecipes.init();
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
        SeleniumChain.init();
        SelfRepairingNanobotsRecipes.init();
        SemiconductorGradeSiliconChain.init();
        SmallFusionReactorRecipes.init();
        SpaceElevatorRecipes.init();
        StarMatterRecipes.init();
        TaraniumChain.init();
        ToolPrefixHandlers.init();
        WasteFluidRecipes.init();
    }

    public static void registerRecipesLate() {
        PlasmaArcRecipes.init();
    }
}
