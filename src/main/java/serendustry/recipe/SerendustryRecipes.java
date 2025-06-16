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
        CasingRecipes.init();
        CircuitRecipes.init();
        DestabilizedMatterChain.init();
        DragonEggRecipes.init();
        FerrofluidChain.init();
        FPMChain.init();
        GeneratorFuels.init();
        GermaniumChain.init();
        GiantFractionatingColumnRecipes.init();
        HalkoniteSteelRecipes.init();
        HoeRecipes.init();
        HTComponentRecipes.init();
        HTMachineRecipes.init();
        InfinityChain.init();
        LaboratoryRecipes.init();
        LargeAlloySmelterRecipes.init();
        LCNSChain.init();
        MagnetoResonaticRecipes.init();
        MiscRecipes.init();
        MysteriousBlobRecipes.init();
        NanotubesChain.init();
        NetheriteChain.init();
        PeriodiciumChain.init();
        PlasmaFoundryRecipes.init();
        PlasmaMixerRecipes.init();
        QCDMRecipes.init();
        Quantium40Chain.init();
        RadoxChain.init();
        SeleniumChain.init();
        SelfRepairingNanobotsRecipes.init();
        SemiconductorGradeSiliconChain.init();
        SmallFusionReactorRecipes.init();
        SpaceElevatorRecipes.init();
        StarMatterRecipes.init();
        StellarEngineRecipes.init();
        StellarIncubatorRecipes.init();
        TaraniumChain.init();
        TengamChain.init();
        ToolPrefixHandlers.init();
        WasteFluidRecipes.init();
    }

    public static void removeRecipesLate() {
        RemoveRecipes.initLate();
    }

    public static void registerRecipesLate() {
        CrystallizerRecipes.init();
        DeepDarkPlanetoid.init();
        DensePlateRecipes.init();
        ElectricImplosionCompressorRecipes.buildElectricImplosionRecipes();
        PlasmaArcRecipes.init();
        PlasmaCondenserRecipes.init();
    }
}
