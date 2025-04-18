package serendustry.item.material;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialFlags.DISABLE_DECOMPOSITION;
import static gregtech.api.unification.material.info.MaterialFlags.EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES;
import static gregtech.api.unification.material.info.MaterialFlags.FLAMMABLE;
import static gregtech.api.unification.material.info.MaterialFlags.MORTAR_GRINDABLE;
import static gregtech.api.unification.material.info.MaterialFlags.NO_SMASHING;
import static gregtech.api.unification.material.info.MaterialFlags.NO_SMELTING;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialIconSet.LIGNITE;

import gregtech.api.fluids.store.FluidStorageKey;
import gregtech.api.unification.material.info.MaterialIconSet;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.*;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import gregtech.api.unification.ore.OrePrefix;
import serendustry.Serendustry;

public class SerendustryMaterials {

    public static Material AnimalWaste;
    public static Material InfusedGold;
    public static Material FluxedElectrum;
    public static Material Amogus;
    public static Material HastelloyX78;
    public static Material HastelloyK243;
    public static Material Technetium22;
    public static Material Zeron100;
    public static Material Cinobite;
    public static Material Inconel792;
    public static Material EglinSteel;
    public static Material Platinium;
    public static Material SiliconCarbide;
    public static Material Onionium;
    public static Material Pikyonium;
    public static Material HastelloyN;
    public static Material Aluminum;
    public static Material Lafium;
    public static Material EnrichedNaquadahAlloy;
    public static Material BismuthTellurite;
    public static Material Prasiolite;
    public static Material CubicZirconia;
    public static Material MagnetoResonatic;
    public static Material HighDurabilityCompoundSteel;
    public static Material ScUev;
    public static Material TastyNeutronium;
    public static Material Luminessence;
    public static Material Lumiium;
    public static Material Signalium;
    public static Material EnderiiumBase;
    public static Material Enderiiium;
    public static Material PulsatingIron;
    public static Material EnergeticAlloy;
    public static Material VibrantAlloy;
    public static Material StellarAlloy;
    public static Material ScUiv;
    public static Material CrystalMatrix;
    public static Material InfinityCatalyst;
    public static Material Infinity;
    public static Material Draconium;
    public static Material ChargedDraconium;
    public static Material AwakenedDraconium;
    public static Material Bedrockium;
    public static Material ScUxv;
    public static Material Jasper;
    public static Material ArceusAlloy2B;
    public static Material AssemblyLine;
    public static Material Quantum;
    public static Material Quantium;
    public static Material CallistoIce;
    public static Material Ledox;
    public static Material NaquadriaticTaranium;
    public static Material ScOpv;

    // EMPTY ID
    public static Material MutatedLivingSolder;
    public static Material Thaumium;
    public static Material GalliumYttrium;
    public static Material Magic2;
    public static Material RealCupronickel;
    public static Material Xenoxene;
    public static Material RawRadox;
    public static Material LightRadox;
    public static Material HeavyRadox;
    public static Material CrackedLightRadox;
    public static Material CrackedHeavyRadox;
    public static Material PurifiedRadox;
    public static Material RadoxPolymer;
    public static Material Floppa;
    public static Material KerrBlackHole;
    public static Material DestabilizedMatter;
    public static Material ExoticMatter;
    public static Material DarkMatter;
    public static Material RedMatter;
    public static Material AtomicResonanceCatalyst;
    public static Material ChromaticGlass;
    public static Material Shirabon;
    public static Material Teflon;
    public static Material EnrichedHolmium;
    public static Material EnrichedTeflon;
    public static Material OmniversalRedstone;
    public static Material OmniversalLubricant;
    public static Material PartialAlkalis;
    public static Material Alkalis;
    public static Material RefractoryMetals;
    public static Material LightTransitionMetals;
    public static Material PreciousMetals;
    public static Material PartialPostTransitionMetals;
    public static Material PostTransitionMetals;
    public static Material PartialLanthanoids;
    public static Material Lanthanoids;
    public static Material PartialActinoids;
    public static Material Actinoids;
    public static Material Gases;
    public static Material NonMetals;

    public static Material PartialNobleGases;
    public static Material NobleGases;
    public static Material PartialSuperheavies;
    public static Material Superheavies;
    public static Material Periodicium;
    public static Material MultiversalAlloy;
    public static Material TransCataCrude;
    public static Material TransCataExcited;
    public static Material TransCataResplendent;
    public static Material TransResidue;
    public static Material TengamRaw;
    public static Material TengamPurified;
    public static Material TengamAttuned;

    // lanthanides stuff
    public static Material DissolutionWater;
    public static Material MonaziteSludge;
    public static Material MonaziteSulfate;
    public static Material InsolubleMonaziteSludge;
    public static Material SodiumOxalate;
    public static Material AmmoniumHydroxide;
    public static Material OxalicAcid;
    public static Material OxylatedMonazite;
    public static Material AlkalineOxalateMixture;
    public static Material UraniumSulfate;
    public static Material PhosphateFiltrate;
    public static Material ThoriumHydroxide;
    public static Material LanthanumHydroxide;
    public static Material CeriumHydroxide; // todo cerium is special

    public static Material PraseodymiumHydroxide;
    public static Material NeodymiumHydroxide;
    public static Material PromethiumHydroxide;
    public static Material SamariumHydroxide;
    public static Material EuropiumHydroxide;
    public static Material GadoliniumHydroxide;
    public static Material TerbiumHydroxide;
    public static Material DysprosiumHydroxide;
    public static Material HolmiumHydroxide;
    public static Material ErbiumHydroxide;
    public static Material ThuliumHydroxide;
    public static Material YtterbiumHydroxide;
    public static Material LutetiumHydroxide;
    public static Material ScandiumHydroxide;
    public static Material YttriumHydroxide;

    // animal waste stuff
    public static Material DriedEarth;
    public static Material ManureByproduct;
    public static Material ManureSlurry;
    public static Material FertileManureSlurry;
    public static Material Blood;
    public static Material OrganicFertilizer;
    public static Material Peat;
    public static Material SulfuricApatiteMix;
    public static Material ISSulfuricAcid;
    public static Material ISHydrochloricAcid;
    public static Material ISHydrofluoricAcid;

    public static Material ErrorSerenibyss;
    public static Material ErrorEnvoidia;

    public static Material PrimedAir;
    public static Material ArgonPrime;
    public static Material HeliumPrime;
    public static Material HydrogenPrime;
    public static Material KryptonPrime;
    public static Material NeonPrime;
    public static Material NitrogenPrime;
    public static Material OxygenPrime;

    public static Material Rhopalthenit;
    public static Material CheeseCheddar;
    public static Material WroughtNeutronium;
    public static Material AmmoniumNitrate;
    public static Material SulfurousAcid;

    public static Material YellowStarMatter;
    public static Material RedStarMatter;
    public static Material BlueStarMatter;
    public static Material WhiteStarMatter;
    public static Material BrownStarMatter;
    public static Material BlackStarMatter;
    public static Material PulsarStarMatter;
    public static Material CondensedStarMatter;

    public static Material LigniteCoal;
    public static Material AnthraciteCoal;
    public static Material BituminousCoal;
    public static Material SubBituminousCoal;
    public static Material PeatCoal;

    public static Material CheeseAmerican;
    public static Material CheeseMozzarella;
    public static Material CheeseSwiss;

    public static Material StellarBaptismSolution;
    public static Material StellarContainmentBase;

    public static Material Hihiirokane;
    public static Material HalkoniteSteel;
    public static Material HAMAlloy;
    public static Material MagneticHAMAlloy;

    public static Material HighGradeSolderingAlloy;
    public static Material SuperheavySolderingAlloy;

    public static Material MolybdeniteLubricant;

    public static Material Ferrofluid;
    public static Material ALMST;
    public static Material HalkonitePreparationBase;

    public static Material Iron2Chloride;
    // EMPTY ID
    public static Material StearicAcid;
    public static Material OleicAcid;
    public static Material AmmoniumOleate;
    public static Material MagneticNanoparticleMixture;

    public static Material Kerosene;
    public static Material Cyclopentadiene;
    public static Material ButeneMixture;
    // EMPTY ID
    public static Material Butene1;
    public static Material Butene2;

    public static Material IgnisCrystal;
    public static Material AquaCrystal;
    public static Material TerraCrystal;
    public static Material AerCrystal;
    public static Material OrdoCrystal;
    public static Material PerditioCrystal;
    public static Material EnergyCrystal;
    public static Material Arcanite;

    public static Material ChromiumDopedMolybdenite;

    public static Material MagnesiumSilicide;
    public static Material MagnesiumDichloride;
    public static Material Silane;
    public static Material SemiconductorGradeSilicon;

    public static Material Acetylene;
    public static Material RawCarbonNanotubesMixture;
    public static Material CarbonNanotubes;
    public static Material GadoliniumTrichloride;
    public static Material Gadonanotubes;

    public static Material MagneticHolmium;

    public static Material NeutronStarMatter;

    public static Material TiberiumRiparius;
    public static Material TiberiumVinifera;
    public static Material TiberiumCruentus;
    public static Material TiberiumAboreus;
    public static Material Originite;
    public static Material Originium;
    public static Material Orundum;

    public static Material RawAncientDebris;
    public static Material NetheriteRichAncientDebris;
    public static Material NetheritePoorAncientDebris;
    public static Material Netherite;

    public static Material Tairitsu;
    public static Material Taranium;
    public static Material AbyssalAlloy;

    public static Material CondensedCoal;
    public static Material ExtremelyUnstableTiberium;
    public static Material BoneSteel;
    public static Material TungstenHexachloride;
    public static Material SelfRepairingNanobots;

    public static Material EthyleneOxide;
    public static Material EthyleneGlycol;
    public static Material paraXylene;
    public static Material HydrogenBromide;
    public static Material TerephtalicAcid;
    public static Material PolyethyleneTerephtalate;
    public static Material MoPET;
    public static Material BoPET;
    public static Material HeatSetBoPET;
    public static Material AluminizedBoPET;
    public static Material LaminatedBoPET;

    public static Material PositroniumHydride;
    public static Material IrradiatedDiamond;
    public static Material NVCDiamond;

    public static Material ScUevSane;
    public static Material cis12Dichloroethene;
    public static Material SodiumZ12ethenedithiolate;
    public static Material EthyleneDibromide;
    public static Material Dihydro14Dithiine;
    public static Material SodiumBromide;
    public static Material Bromobutane;
    public static Material Propylene;
    public static Material Butanol;
    public static Material nButyllithium;
    public static Material LithiumBromide;
    public static Material LithiumDiisopropylamide;
    public static Material Dihydro14dithiine23bislithiumSelenolate;
    public static Material Diisopropylamine;
    public static Material PhosphorusTrichloride;
    public static Material TriethylPhosphite;
    public static Material Phosgene;
    public static Material BETS;
    public static Material DiethylPhosphate;
    public static Material Formaldehyde;
    public static Material RheniumVIIOxide;
    public static Material AmmoniumPerrhenate;
    public static Material BETSPerrhenate;

    public static Material Bromargyrite;

    public static Material Olsacherite;
    public static Material SeleniumLeadSludge;
    public static Material SelenousAcid;

    public static Material Renierite;
    public static Material GermaniumDisulfide;
    public static Material GermaniumDioxide;

    public static Material Potassium40;
    public static Material Quantium40;

    public static Material NetherizedDiamond;
    public static Material HotHalkoniteSteel;

    public static Material Xenotime;
    public static Material Pinkium;
    public static Material DeepDarkIron;

    public static Material BiologicalWaste;
    public static Material Glucose;
    public static Material PotatoDextroseBroth;
    public static Material YeastRichMixture;
    public static Material YeastExtract;

    public static Material RawAdamantium;
    public static Material Adamantium;
    public static Material Vibranite;
    public static Material Vibranium;
    public static Material Azbantium;
    public static Material VibraniumAlloy;

    public static Material DeepDarkSteel;

    public static Material Manasteel;
    public static Material Terrasteel;
    public static Material ElvenElementium;
    public static Material GaiaSpirit;

    public static Material OganessonTetratennesside;
    public static Material Crookesite;
    public static Material SeleniumThalliumSludge;

    public static Material XenomagneticSeparationCatalyst;
    public static Material TengamResidue;
    public static Material TengamSludge;
    public static Material AntimonyTengamide;
    public static Material PlutoniumHydride;
    public static Material Plutonium3Phosphide;
    public static Material Phosphine;
    public static Material XenomagneticAttunementCatalyst;
    public static Material SodiumHypophosphite;
    public static Material PotassiumHydroxide;
    public static Material PotassiumHypophosphite;
    public static Material PotassiumChloride;

    public static Material ExoHalkoniteSteel;
    public static Material HotExoHalkoniteSteel;

    // Custom iconsets
    public static final MaterialIconSet INFINITY = new MaterialIconSet("infinity");
    public static final MaterialIconSet HALKONITE_STEEL = new MaterialIconSet("halkonite_steel");
    public static final MaterialIconSet HOT_HALKONITE_STEEL = new MaterialIconSet("hot_halkonite_steel");
    public static final MaterialIconSet EXO_HALKONITE_STEEL = new MaterialIconSet("exo_halkonite_steel");
    public static final MaterialIconSet HOT_EXO_HALKONITE_STEEL = new MaterialIconSet("hot_exo_halkonite_steel");

    public static void init() {
        Material[] addDustIngot = {Rhenium, Gadolinium, Polonium, Strontium, Promethium, Technetium, Ytterbium, Rubidium, Tellurium, Zirconium, Germanium, Scandium, Protactinium, Holmium, Radium, Francium, Terbium,
                Thulium, Erbium, Dysprosium, Praseodymium, Actinium, Curium, Berkelium, Neptunium, Californium, Iodine, Hafnium, Thallium, Selenium, Astatine, Einsteinium, Fermium, Mendelevium, Nobelium, Lawrencium,
                Rutherfordium, Dubnium, Seaborgium, Bohrium, Hassium, Meitnerium, Roentgenium, Copernicium, Nihonium, Flerovium, Moscovium, Livermorium, Tennessine, Oganesson};

        for (Material material : addDustIngot) {
            if (!material.hasProperty(PropertyKey.DUST)) {material.setProperty(PropertyKey.DUST, new DustProperty());}
            if (!material.hasProperty(PropertyKey.INGOT)) {material.setProperty(PropertyKey.INGOT, new IngotProperty());}
        }

        Material[] addLiquid = { Holmium, Thulium, Dysprosium, Scandium, Promethium, Electrotine, Cadmium, Boron, Barium, Calcium, Sodium, Bromine, Erbium, Moscovium, Diamond, Germanium, Selenium, Rubidium, Thallium, Tennessine, Oganesson };
        for(Material material : addLiquid) {
            FluidProperty prop = material.getProperty(PropertyKey.FLUID);
            boolean newProp = false;

            if (prop == null) { // No fluids registered, register a FluidProperty
                prop = new FluidProperty();
                newProp = true;
            }

            FluidStorageKey key = FluidStorageKeys.LIQUID;
            if (prop.get(key) == null && prop.getQueuedBuilder(key) == null) // If no registered fluid, and no enqueued fluid to be registered
                prop.enqueueRegistration(key, new FluidBuilder()); // Register Fluid

            if (newProp)
                material.setProperty(PropertyKey.FLUID, prop);
        }

        Material[] addPlasma = { Water, Redstone, Glass, Lead };
        for(Material material : addPlasma) {
            FluidProperty prop = material.getProperty(PropertyKey.FLUID);
            boolean newProp = false;

            if (prop == null) {
                prop = new FluidProperty();
                newProp = true;
            }

            FluidStorageKey key = FluidStorageKeys.PLASMA;
            if (prop.get(key) == null && prop.getQueuedBuilder(key) == null)
                prop.enqueueRegistration(key, new FluidBuilder());

            if (newProp)
                material.setProperty(PropertyKey.FLUID, prop);
        }

        Material[] addLiquidPlasma = { Flerovium, Phosphorus, Protactinium };
        for(Material material : addLiquidPlasma) {
            FluidProperty prop = material.getProperty(PropertyKey.FLUID);
            boolean newProp = false;

            if (prop == null) {
                prop = new FluidProperty();
                newProp = true;
            }
            for (FluidStorageKey key : new FluidStorageKey[] { FluidStorageKeys.LIQUID, FluidStorageKeys.PLASMA }) {
                if (prop.get(key) == null && prop.getQueuedBuilder(key) == null)
                    prop.enqueueRegistration(key, new FluidBuilder());
            }

            if (newProp)
                material.setProperty(PropertyKey.FLUID, prop);
        }

        Lutetium.setProperty(PropertyKey.INGOT, new IngotProperty());

        if (!Samarium.hasProperty(PropertyKey.ORE)) {Samarium.setProperty(PropertyKey.ORE, new OreProperty());}
        OreProperty oreProp = Samarium.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Bastnasite, Monazite, Neodymium, Samarium);
        oreProp.setWashedIn(Mercury);

        SolderingAlloy.addFlags(GENERATE_PLATE);
        TinAlloy.addFlags(GENERATE_FINE_WIRE, GENERATE_FOIL);
        Oxygen.addFlags(GENERATE_FOIL, NO_SMASHING, NO_WORKING, NO_SMELTING);
        RutheniumTriniumAmericiumNeutronate.addFlags(GENERATE_FINE_WIRE);
        Europium.addFlags(GENERATE_SPRING_SMALL);
        Holmium.addFlags(GENERATE_LONG_ROD);
        PolyvinylChloride.addFlags(GENERATE_LENS);
        Neutronium.addFlags(GENERATE_SMALL_GEAR, GENERATE_ROUND, GENERATE_RING, GENERATE_DENSE, GENERATE_ROTOR, GENERATE_LONG_ROD);
        Oganesson.addFlags(GENERATE_DENSE);
        Tennessine.addFlags(GENERATE_DENSE);

        // To make Skookum Choochers generate
        Diamond.addFlags(GENERATE_LONG_ROD);
        RedSteel.addFlags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW);
        BlueSteel.addFlags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW);
        DamascusSteel.addFlags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW);

        Holmium.setMaterialRGB(0x130793);
        Holmium.setMaterialIconSet(SHINY);

        OrePrefix.gemFlawless.maxStackSize = 64;
        OrePrefix.gemExquisite.maxStackSize = 64;
        OrePrefix.plateDouble.maxStackSize = 64;
        OrePrefix.plateDense.maxStackSize = 64;
        OrePrefix.rotor.maxStackSize = 64;
        OrePrefix.gear.maxStackSize = 64;

        // Serendustry materials
        AnimalWaste = new Material.Builder(1, Serendustry.ID("animal_waste"))
                .gem().fluid().color(0x7B5C00)
                .flags(STD_METAL, NO_SMASHING, NO_SMELTING, GENERATE_LENS)
                .build();

        InfusedGold = new Material.Builder(2, Serendustry.ID("infused_gold"))
                .ingot().fluid()
                .color(0xA59030).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Gold, 4)
                .build()
                .setFormula("Au4Ma", true);

        FluxedElectrum = new Material.Builder(3, Serendustry.ID("fluxed_electrum"))
                .ingot(3).liquid(new FluidBuilder().temperature(8000))
                .color(0xFFE049).iconSet(SHINY)
                .flags(EXT2_METAL, DISABLE_DECOMPOSITION, GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW,
                        GENERATE_FINE_WIRE)
                .components(RoseGold, 1, SterlingSilver, 1, Electrum, 2, InfusedGold, 2, Naquadria, 4, SolderingAlloy,
                        10)
                .blast(b -> b
                        .temp(8000, GasTier.HIGHEST)
                        .blastStats(VA[UV], 8000))
                .cableProperties(VA[UEV], 1, 1536, false, 3)
                .build();

        Amogus = new Material.Builder(4, Serendustry.ID("amogus"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x15703F).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(Americium, 1, Oganesson, 1, Uranium238, 1, Sulfur, 1)
                .blast(b -> b
                        .temp(7000, GasTier.HIGHEST)
                        .blastStats(VA[UV], 5000))
                .build();

        HastelloyX78 = new Material.Builder(5, Serendustry.ID("hastelloyx_78"))
                .ingot(3).liquid(new FluidBuilder().temperature(7500))
                .color(0x5F90C9).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(NaquadahAlloy, 10, Rhenium, 5, Naquadria, 4, Polonium, 3, Rutherfordium, 2, Fermium, 1)
                .blast(b -> b
                        .temp(8500, GasTier.HIGHEST)
                        .blastStats(VA[UV], 10000))
                .build();

        HastelloyK243 = new Material.Builder(6, Serendustry.ID("hastelloyk_243"))
                .ingot(3).liquid(new FluidBuilder().temperature(8500))
                .color(0x9FEC60).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FRAME, GENERATE_RING, GENERATE_FINE_WIRE,
                        GENERATE_LONG_ROD, GENERATE_BOLT_SCREW)
                .components(HastelloyX78, 5, Tritanium, 4, TungstenCarbide, 4, Promethium, 4, NiobiumNitride, 2,
                        Mendelevium, 1)
                .blast(b -> b
                        .temp(9000, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 12000))
                .build();

        Technetium22 = new Material.Builder(7, Serendustry.ID("technetium_22"))
                .ingot(3).liquid(new FluidBuilder().temperature(10000))
                .color(0xC6AA14).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Technetium, 22)
                .blast(b -> b
                        .temp(9000, GasTier.HIGH)
                        .blastStats(VA[ULV], 120000))
                .build()
                .setFormula("Tc-22", false);

        Zeron100 = new Material.Builder(8, Serendustry.ID("zeron_100")) // GCYM duplicates this
                .ingot(3).liquid(new FluidBuilder().temperature(5000))
                .color(0xA8A813).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Steel, 20, Chrome, 13, Copper, 10, Nickel, 3, Molybdenum, 2, Tungsten, 2)
                .blast(b -> b
                        .temp(3000, GasTier.HIGH)
                        .blastStats(VA[IV], 1000))
                .build();

        Cinobite = new Material.Builder(9, Serendustry.ID("cinobite"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x010101).iconSet(SHINY)
                .flags(EXT2_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .components(Zeron100, 8, Titanium, 6, Naquadria, 4, Gadolinium, 3, Osmiridium, 1, Mercury, 1)
                .blast(b -> b
                        .temp(2500, GasTier.HIGHEST)
                        .blastStats(VA[UV], 2000))
                .build();

        Inconel792 = new Material.Builder(10, Serendustry.ID("inconel_792"))
                .ingot(3).liquid(new FluidBuilder().temperature(4000))
                .color(0x66E370).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_BOLT_SCREW)
                .components(Nickel, 2, Aluminium, 2, Niobium, 1, Nichrome, 1)
                .blast(b -> b
                        .temp(1500, GasTier.MID)
                        .blastStats(VA[EV], 800))
                .build();

        EglinSteel = new Material.Builder(11, Serendustry.ID("eglin_steel"))
                .ingot(3).liquid(new FluidBuilder().temperature(4500))
                .color(0x733910).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Invar, 5, Iron, 4, Kanthal, 1, Sulfur, 1, Silicon, 1, Carbon, 1)
                .blast(b -> b
                        .temp(1200, GasTier.MID)
                        .blastStats(VA[EV], 800))
                .build();

        Platinium = new Material.Builder(12, Serendustry.ID("platinium"))
                .ingot(3).liquid(new FluidBuilder().temperature(3500))
                .color(0xDDEECD).iconSet(SHINY)
                .flags(STD_METAL)
                .components(Platinum, 3, Aluminium, 1)
                .blast(b -> b
                        .temp(1100, GasTier.MID)
                        .blastStats(VA[EV], 600))
                .build();

        SiliconCarbide = new Material.Builder(13, Serendustry.ID("silicon_carbide"))
                .dust(0)
                .color(0x606060).iconSet(SHINY)
                .components(Silicon, 1, Carbon, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .toolStats(ToolProperty.Builder.of(20.0f, 3.0f, 512, 2)
                        .attackSpeed(1f).enchantability(6).build())
                .build();

        Onionium = new Material.Builder(14, Serendustry.ID("onionium"))
                .ingot(3).liquid(new FluidBuilder().temperature(3000))
                .color(0xFE82A3).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Antimony, 2, Platinium, 2, Ytterbium, 1, Nichrome, 1, SiliconCarbide, 1)
                .blast(b -> b
                        .temp(3500, GasTier.HIGHER)
                        .blastStats(VA[ZPM], 2000))
                .build();

        Pikyonium = new Material.Builder(15, Serendustry.ID("pikyonium"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x3160AE).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Inconel792, 8, EglinSteel, 5, NaquadahEnriched, 4, TungstenSteel, 4, Cerium, 3, Onionium, 7)
                .blast(b -> b
                        .temp(9000, GasTier.HIGHEST)
                        .blastStats(VA[UV], 2000))
                .build();

        HastelloyN = new Material.Builder(16, Serendustry.ID("hastelloyn"))
                .ingot(3).liquid(new FluidBuilder().temperature(3000))
                .color(0xB3B3B3).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Nickel, 15, Molybdenum, 4, Yttrium, 2, Chrome, 2, Titanium, 2)
                .blast(b -> b
                        .temp(1200, GasTier.MID)
                        .blastStats(VA[EV], 600))
                .build();

        Aluminum = new Material.Builder(17, Serendustry.ID("aluminum"))
                .ingot().fluid()
                .color(0x80C8F0).iconSet(DULL)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_LONG_ROD)
                .components(Aluminium, 1)
                .build();

        Lafium = new Material.Builder(18, Serendustry.ID("lafium"))
                .ingot(3).liquid(new FluidBuilder().temperature(3450))
                .color(0x0D0D60).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FRAME, GENERATE_RING, GENERATE_ROUND, GENERATE_SPRING,
                        GENERATE_SPRING_SMALL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR,
                        GENERATE_BOLT_SCREW)
                .components(HastelloyN, 8, Nickel, 8, Aluminum, 6, Naquadah, 4, Tungsten, 4, Samarium, 2, Carbon, 2,
                        Argon, 2)
                .blast(b -> b
                        .temp(1800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 900))
                .build();

        EnrichedNaquadahAlloy = new Material.Builder(19, Serendustry.ID("enriched_naquadah_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(8000))
                .color(0x3C3C3A).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_GEAR,
                        GENERATE_LONG_ROD)
                .components(NaquadahEnriched, 4, Rhodium, 2, Ruthenium, 2, Rubidium, 2, Dubnium, 1, Einsteinium, 1)
                .blast(b -> b
                        .temp(6000, GasTier.HIGHEST)
                        .blastStats(VA[UV], 1800))
                .build();

        BismuthTellurite = new Material.Builder(20, Serendustry.ID("bismuth_tellurite"))
                .dust(0)
                .color(0x00512A).iconSet(SHINY)
                .components(Bismuth, 2, Tellurium, 3)
                .build();

        Prasiolite = new Material.Builder(21, Serendustry.ID("prasiolite"))
                .dust(0)
                .color(0x768836).iconSet(SHINY)
                .components(Silicon, 5, Oxygen, 10, Iron, 1)
                .build();

        CubicZirconia = new Material.Builder(22, Serendustry.ID("cubic_zirconia"))
                .dust(0)
                .color(0xF1D3D6).iconSet(SHINY)
                .components(Zirconium, 1, Oxygen, 2)
                .build();

        MagnetoResonatic = new Material.Builder(23, Serendustry.ID("magneto_resonatic"))
                .gem().liquid(new FluidBuilder().temperature(500))
                .color(0xD37DD3).iconSet(MAGNETIC)
                .flags(STD_METAL, NO_SMASHING, NO_SMELTING, GENERATE_LENS)
                .components(BismuthTellurite, 4, Prasiolite, 3, CubicZirconia, 1, SamariumMagnetic, 1)
                .build();

        HighDurabilityCompoundSteel = new Material.Builder(24, Serendustry.ID("high_durability_compound_steel"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x304030).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FRAME, GENERATE_RING, GENERATE_LONG_ROD,
                        GENERATE_BOLT_SCREW, GENERATE_ROUND, GENERATE_ROTOR, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_SMALL_GEAR)
                .components(TungstenSteel, 12, HSSS, 9, HSSG, 6, Ruridit, 3, MagnetoResonatic, 2, Plutonium239, 1)
                .blast(b -> b
                        .temp(5000, GasTier.HIGHEST)
                        .blastStats(VA[ZPM], 1200))
                .build();

        ScUev = new Material.Builder(25, Serendustry.ID("sc_uev"))
                .ingot().liquid(new FluidBuilder().temperature(26000))
                .color(0x9B46BA).iconSet(BRIGHT)
                .flags(DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(MagnetoResonatic, 3, Cinobite, 1, Pikyonium, 1, Aluminum, 1)
                .cableProperties(VA[UEV], 1, 0, true, 3)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 2000))
                .build();

        TastyNeutronium = new Material.Builder(26, Serendustry.ID("tasty_neutronium"))
                .ingot().liquid(new FluidBuilder().temperature(50000))
                .color(0x3E1446).iconSet(BRIGHT)
                .components(Neutronium, 1)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_LONG_ROD,
                        GENERATE_ROTOR)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 8000))
                .build()
                .setFormula("Nt:tooth:", true);

        Luminessence = new Material.Builder(27, Serendustry.ID("luminessence"))
                .dust(0)
                .color(0xFFE568).iconSet(BRIGHT)
                .components(Aluminum, 1, Phosphate, 1)
                .build();

        Lumiium = new Material.Builder(28, Serendustry.ID("lumiium"))
                .ingot(3).liquid(new FluidBuilder().temperature(30000))
                .color(0xFFE100).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_LONG_ROD)
                .components(Luminessence, 2, TinAlloy, 1, RoseGold, 1, Phosphate, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 3000))
                .build();

        Signalium = new Material.Builder(29, Serendustry.ID("signalium"))
                .ingot(3).liquid(new FluidBuilder().temperature(35000))
                .color(0xFF9300).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_LONG_ROD,
                        GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .components(Lumiium, 3, Aluminum, 2, FluxedElectrum, 1, Phosphate, 1)
                .cableProperties(VA[UIV], 1, 819200)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 3500))
                .build();

        EnderiiumBase = new Material.Builder(30, Serendustry.ID("enderiium_base"))
                .ingot(3).liquid(new FluidBuilder().temperature(40000))
                .color(0x3B7A9F).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_ROTOR)
                .components(Signalium, 4, EnderPearl, 2, TastyNeutronium, 2, Phosphate, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 3800))
                .build();

        Enderiiium = new Material.Builder(31, Serendustry.ID("enderiiium"))
                .ingot(3).liquid(new FluidBuilder().temperature(50000))
                .color(0x408587).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_LONG_ROD, GENERATE_RING, GENERATE_FRAME,
                        GENERATE_BOLT_SCREW)
                .components(EnderiiumBase, 4, InfusedGold, 1, Phosphate, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 4200))
                .build();

        PulsatingIron = new Material.Builder(32, Serendustry.ID("pulsating_iron"))
                .ingot(3).liquid(new FluidBuilder().temperature(5000))
                .color(0x5ACE92).iconSet(BRIGHT)
                .flags(STD_METAL)
                .components(Iron, 1, EnderPearl, 1, Uraninite, 1)
                .blast(b -> b
                        .temp(6000, GasTier.HIGHER)
                        .blastStats(VA[IV], 2500))
                .build();

        EnergeticAlloy = new Material.Builder(33, Serendustry.ID("energetic_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(5500))
                .color(0xFF8752).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(PulsatingIron, 4, Zeolite, 1, GarnetSand, 1, HSSS, 1, Mercury, 1)
                .blast(b -> b
                        .temp(6500, GasTier.HIGHER)
                        .blastStats(VA[LuV], 2800))
                .build();

        VibrantAlloy = new Material.Builder(34, Serendustry.ID("vibrant_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(5850))
                .color(0x75FF66).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR)
                .components(EnergeticAlloy, 5, Zeolite, 1, BasalticMineralSand, 1, GraniticMineralSand, 1)
                .blast(b -> b
                        .temp(7000, GasTier.HIGHEST)
                        .blastStats(VA[UV], 3000))
                .build();

        StellarAlloy = new Material.Builder(35, Serendustry.ID("stellar_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(12000))
                .color(0xFFFFFF).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_RING, GENERATE_ROUND, GENERATE_FINE_WIRE,
                        GENERATE_BOLT_SCREW)
                .components(VibrantAlloy, 8, TastyNeutronium, 2, Aluminum, 2, AluminiumSulfite, 1)
                .fluidPipeProperties(8000, 750, true, true, true, true)
                .blast(b -> b
                        .temp(8000, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 4000))
                .toolStats(ToolProperty.Builder.of(200.0f, 120.0f, 65535, 8)
                        .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .build();

        ScUiv = new Material.Builder(36, Serendustry.ID("sc_uiv"))
                .ingot(3).liquid(new FluidBuilder().temperature(50000))
                .color(0xFF66A3).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(VibrantAlloy, 3, Naquadria, 2, FluxedElectrum, 2, EnderiiumBase, 2)
                .cableProperties(VA[UIV], 1, 0, true)
                .blast(b -> b
                        .temp(8500, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 6000))
                .build();

        CrystalMatrix = new Material.Builder(37, Serendustry.ID("crystal_matrix"))
                .ingot(3).liquid(new FluidBuilder().temperature(45000))
                .color(0x8EFFE6).iconSet(NETHERSTAR)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_LONG_ROD,
                        GENERATE_FOIL, GENERATE_DOUBLE_PLATE)
                .components(Diamond, 1, NetherStar, 1)
                .blast(b -> b
                        .temp(8800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 8000))
                .build();

        InfinityCatalyst = new Material.Builder(38, Serendustry.ID("infinity_catalyst"))
                .ingot(3).liquid(new FluidBuilder().temperature(75000))
                .color(0xFFFFFF).iconSet(NETHERSTAR)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_ROTOR, GENERATE_FRAME)
                .components(CrystalMatrix, 8, Neutronium, 8)
                .blast(b -> b
                        .temp(8800, GasTier.HIGHEST)
                        .blastStats(VA[UEV], 8000))
                .build()
                .setFormula("If");

        Infinity = new Material.Builder(39, Serendustry.ID("infinity")) // todo: fix block not having custom texture
                .ingot(3).liquid(new FluidBuilder().temperature(20000)).plasma()
                .color(0xFFFFFF).iconSet(INFINITY)
                .flags(STD_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_LONG_ROD,
                        GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_FRAME)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UXV], 12000))
                .toolStats(ToolProperty.Builder.of(250.0f, 200.0f, 65535, 8)
                        .attackSpeed(1f).enchantability(33).magnetic().unbreakable().build())
                .build()
                .setFormula("*If*", true);

        Draconium = new Material.Builder(40, Serendustry.ID("draconium"))
                .ingot(3).liquid(new FluidBuilder().temperature(30000))
                .color(0x8E52E6).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_SMALL_GEAR)
                .components(TinAlloy, 8)
                .blast(b -> b
                        .temp(8800, GasTier.HIGHEST)
                        .blastStats(VA[UEV], 7000))
                .build()
                .setFormula("Dc", true);

        ChargedDraconium = new Material.Builder(41, Serendustry.ID("charged_draconium"))
                .ingot(3).liquid(new FluidBuilder().temperature(35000))
                .color(0xCD52E6).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_ROUND,
                        GENERATE_BOLT_SCREW, GENERATE_FOIL)
                .components(Draconium, 1)
                .fluidPipeProperties(9500, 900, true, true, true, true)
                .blast(b -> b
                        .temp(8850, GasTier.HIGHEST)
                        .blastStats(VA[UEV], 7500))
                .build()
                .setFormula("Dc+", true);

        AwakenedDraconium = new Material.Builder(42, Serendustry.ID("awakened_draconium"))
                .ingot(3).liquid(new FluidBuilder().temperature(65000))
                .color(0xDD520C).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_RING,
                        GENERATE_BOLT_SCREW, GENERATE_DENSE)
                .components(Draconium, 1)
                .blast(b -> b
                        .temp(8950, GasTier.HIGHEST)
                        .blastStats(VA[UIV], 8500))
                .build()
                .setFormula("*Dc*", true);

        Bedrockium = new Material.Builder(43, Serendustry.ID("bedrockium"))
                .ingot(3).liquid(new FluidBuilder().temperature(45000))
                .color(0x262626).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_SPRING,
                        GENERATE_SPRING_SMALL)
                .components(SiliconDioxide, 384)
                .cableProperties(VA[UXV], 1, 3276800)
                .blast(b -> b
                        .temp(9000, GasTier.HIGHEST)
                        .blastStats(VA[UIV], 6000))
                .build();

        ScUxv = new Material.Builder(44, Serendustry.ID("sc_uxv"))
                .ingot(3).liquid(new FluidBuilder().temperature(48000))
                .color(0xFF4F4F).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(ChargedDraconium, 4, StellarAlloy, 4, Luminessence, 3, InfinityCatalyst, 2)
                .cableProperties(VA[UXV], 1, 0, true)
                .blast(b -> b
                        .temp(10000, GasTier.HIGHEST)
                        .blastStats(VA[UIV], 7000))
                .build();

        Jasper = new Material.Builder(45, Serendustry.ID("jasper"))
                .dust(0).fluid()
                .color(0xFF1484).iconSet(SHINY)
                .components(SiliconDioxide, 1)
                .build()
                .setFormula("?");

        ArceusAlloy2B = new Material.Builder(46, Serendustry.ID("arceus_alloy_2_b"))
                .ingot(3).liquid(new FluidBuilder().temperature(41000))
                .color(0xC4A415).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Trinium, 3, HSSS, 4, TungstenCarbide, 2, Osmiridium, 1, Strontium, 1)
                .blast(b -> b
                        .temp(10200, GasTier.HIGHER)
                        .blastStats(VA[LuV], 7000))
                .build();

        AssemblyLine = new Material.Builder(47, Serendustry.ID("assembly_line"))
                .dust().liquid(new FluidBuilder().temperature(32768)).plasma()
                .color(0x6C6D7A).iconSet(DULL)
                .flags(EXT2_METAL, DISABLE_DECOMPOSITION)
                .components(Iron, 1)
                .toolStats(ToolProperty.Builder.of(40.0f, 10.0f, 1000, 5)
                        .attackSpeed(0.5f).enchantability(1).build())
                .rotorStats(9.5f, 4.0f, 4800)
                .build()
                .setFormula("Assembly Line");

        Quantium = new Material.Builder(49, Serendustry.ID("quantium"))
                .ingot(3).liquid(new FluidBuilder().temperature(70000))
                .color(0x006600).iconSet(DULL)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_GEAR,
                        GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UXV], 9500))
                .cableProperties(VA[OpV], 1, 13107200)
                .build()
                .setFormula("Qt");

        CallistoIce = new Material.Builder(50, Serendustry.ID("callisto_ice"))
                .ingot(3).liquid(new FluidBuilder().temperature(1))
                .color(0x00D1FF).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_ROUND, GENERATE_RING, GENERATE_BOLT_SCREW, GENERATE_FINE_WIRE)
                .components(Water, 1)
                .fluidPipeProperties(80000, 1500, true, true, true, true)
                .blast(b -> b
                        .temp(273, GasTier.HIGHEST)
                        .blastStats(VA[UXV], 2000))
                .build()
                .setFormula("SpH2O", true);

        Ledox = new Material.Builder(51, Serendustry.ID("ledox"))
                .ingot(3).liquid(new FluidBuilder().temperature(50000))
                .color(0x1B2FE2).iconSet(DULL)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR, GENERATE_LONG_ROD)
                .components(Lead, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UXV], 7000))
                .build()
                .setFormula("SpPb", true);

        NaquadriaticTaranium = new Material.Builder(52, Serendustry.ID("naquadriatic_taranium"))
                .ingot(3).liquid(new FluidBuilder().temperature(55000))
                .color(0x000000).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Naquadria, 4, CoalTar, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UXV], 8000))
                .build();

        MutatedLivingSolder = new Material.Builder(54, Serendustry.ID("mutated_living_solder"))
                .ingot(3).liquid(new FluidBuilder().temperature(25000))
                .color(0x785B7E).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(SolderingAlloy, 1)
                .blast(b -> b
                        .temp(6000, GasTier.HIGHEST)
                        .blastStats(VA[UV], 5000))
                .build()
                .setFormula("?");

        Thaumium = new Material.Builder(55, Serendustry.ID("thaumium"))
                .ingot(3).liquid(new FluidBuilder().temperature(25000))
                .color(0x802BA8).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE)
                .components(SolderingAlloy, 1)
                .build()
                .setFormula("FeMa");

        GalliumYttrium = new Material.Builder(56, Serendustry.ID("gallium_yttrium"))
                .ingot(3).liquid(new FluidBuilder().temperature(12000))
                .color(0x6D0054).iconSet(DULL)
                .flags(STD_METAL, GENERATE_RING)
                .components(Gallium, 1, Yttrium, 1)
                .blast(b -> b
                        .temp(4000, GasTier.MID)
                        .blastStats(VA[HV], 1000))
                .build();

        Magic2 = new Material.Builder(57, Serendustry.ID("magic_2"))
                .liquid(new FluidBuilder().temperature(1))
                .color(0x6D0054).iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION)
                .components(Iron, 1)
                .build()
                .setFormula("Ma");

        RealCupronickel = new Material.Builder(58, Serendustry.ID("real_cupronickel"))
                .ingot(3).liquid(new FluidBuilder().temperature(1100))
                .color(0xDCDCFF).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Copper, 40, Nickel, 22, Iron, 1, Manganese, 1)
                .build()
                .setFormula("Cu40Ni22Fe1Mn1", true);

        Xenoxene = new Material.Builder(59, Serendustry.ID("xenoxene"))
                .fluid()
                .color(0x828282)
                .build();

        RawRadox = new Material.Builder(60, Serendustry.ID("raw_radox"))
                .fluid()
                .color(0x8914AD)
                .build();

        LightRadox = new Material.Builder(61, Serendustry.ID("light_radox"))
                .fluid()
                .color(0xA42CE0)
                .build();

        HeavyRadox = new Material.Builder(62, Serendustry.ID("heavy_radox"))
                .fluid()
                .color(0x631B87)
                .build();

        CrackedLightRadox = new Material.Builder(63, Serendustry.ID("cracked_light_radox"))
                .fluid()
                .color(0xA464C4)
                .build();

        CrackedHeavyRadox = new Material.Builder(64, Serendustry.ID("cracked_heavy_radox"))
                .fluid()
                .color(0x663F7A)
                .build();

        PurifiedRadox = new Material.Builder(65, Serendustry.ID("purified_radox"))
                .fluid()
                .color(0xBB71E0)
                .build();

        RadoxPolymer = new Material.Builder(66, Serendustry.ID("radox_polymer"))
                .polymer(3).fluid()
                .color(0xBB2BE0)
                .flags(GENERATE_FOIL, GENERATE_RING, GENERATE_DENSE)
                .fluidPipeProperties(1200, 5500, true, true, true, false)
                .build();

        // Todo: stop GCYM from autogenerating a recipe for this that's very cheap
        Floppa = new Material.Builder(67, Serendustry.ID("floppa"))
                .ingot(3).liquid(new FluidBuilder().temperature(800000))
                .color(0x9E5625).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_DENSE, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_SPRING)
                .components(Flerovium, 1, Oxygen, 1, Phosphorus, 1, Protactinium, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[OpV], 50000))
                .cableProperties(V[MAX], 1024, 0, true)
                .build();

        KerrBlackHole = new Material.Builder(68, Serendustry.ID("kerr_black_hole"))
                .ingot(3).liquid(new FluidBuilder().temperature(1))
                .color(0x000000).iconSet(MAGNETIC)
                .flags(STD_METAL, GENERATE_LONG_ROD)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UIV], 10000))
                .build();

        DestabilizedMatter = new Material.Builder(69, Serendustry.ID("destabilized_matter"))
                .fluid().plasma()
                .color(0x5E609B)
                .build();

        ExoticMatter = new Material.Builder(70, Serendustry.ID("exotic_matter"))
                .fluid().plasma()
                .color(0x5E2B9B)
                .build();

        DarkMatter = new Material.Builder(71, Serendustry.ID("dark_matter"))
                .fluid().plasma()
                .color(0x180B28)
                .build();

        RedMatter = new Material.Builder(72, Serendustry.ID("red_matter"))
                .fluid().plasma()
                .color(0xFF0000)
                .build();

        AtomicResonanceCatalyst = new Material.Builder(73, Serendustry.ID("atomic_resonance_catalyst"))
                .dust().fluid()
                .color(0xEC4E42)
                .build();

        ChromaticGlass = new Material.Builder(74, Serendustry.ID("chromatic_glass"))
                .gem(3).liquid(new FluidBuilder().temperature(35000))
                .color(0xFFFFFF).iconSet(GLASS) // TODO: Give it animated rainbow colors
                .flags(NO_SMASHING, NO_SMELTING, NO_WORKING, GENERATE_LENS, GENERATE_FOIL)
                .build();

        Shirabon = new Material.Builder(75, Serendustry.ID("shirabon"))
                .ingot(3).liquid(new FluidBuilder().temperature(600000)).plasma()
                .color(0xE0156D).iconSet(BRIGHT)
                .flags(STD_METAL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_ROTOR, GENERATE_ROUND,
                        GENERATE_BOLT_SCREW, GENERATE_GEAR, GENERATE_FRAME, GENERATE_FOIL, GENERATE_LONG_ROD)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[OpV], 30000))
                .fluidPipeProperties(320, 400, true, true, true, true)
                .build()
                .setFormula("Sh");

        Teflon = new Material.Builder(76, Serendustry.ID("teflon"))
                .polymer(3).fluid()
                .color(0x222222)
                .flags(DISABLE_DECOMPOSITION, GENERATE_DENSE, GENERATE_RING, GENERATE_FOIL)
                .components(Polytetrafluoroethylene, 15, Polyethylene, 3, Carbon, 1, Sodium, 1)
                .build();

        EnrichedHolmium = new Material.Builder(77, Serendustry.ID("enriched_holmium"))
                .ingot(3).liquid(new FluidBuilder().temperature(4200))
                .color(0x5D15EE).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_FOIL, GENERATE_GEAR)
                .components(NaquadahEnriched, 8, Holmium, 1)
                .blast(b -> b
                        .temp(6000, GasTier.HIGHER)
                        .blastStats(VA[LuV], 2000))
                .build();

        EnrichedTeflon = new Material.Builder(78, Serendustry.ID("enriched_teflon"))
                .polymer(3)
                .color(0xE34500)
                .flags(DISABLE_DECOMPOSITION, GENERATE_FOIL, GENERATE_RING)
                .components(NaquadahEnriched, 1, Teflon, 1, EnrichedHolmium, 1, EnrichedNaquadahAlloy, 1, EglinSteel, 1,
                        Zeron100, 1, HastelloyN, 1, MagnetoResonatic, 1, TungstenSteel, 1)
                .build();

        OmniversalRedstone = new Material.Builder(79, Serendustry.ID("omniversal_redstone"))
                .dust().fluid()
                .color(0xD13830)
                .build();

        OmniversalLubricant = new Material.Builder(80, Serendustry.ID("omniversal_lubricant"))
                .fluid().plasma()
                .color(0x97D344)
                .build();

        PartialAlkalis = new Material.Builder(81, Serendustry.ID("partial_alkalis"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x643ECD).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Lithium, 1, Sodium, 1, Potassium, 1, Rubidium, 1, Caesium, 1, Francium, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        Alkalis = new Material.Builder(82, Serendustry.ID("alkalis"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x75CE6D).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialAlkalis, 1, Beryllium, 1, Magnesium, 1, Calcium, 1, Strontium, 1, Barium, 1, Radium,
                        1, Scandium, 1, Yttrium, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        RefractoryMetals = new Material.Builder(83, Serendustry.ID("refractory_metals"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x4141CC).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Zirconium, 1, Hafnium, 1, Niobium, 1, Tantalum, 1, Molybdenum, 1, Tungsten, 1, Technetium,
                        1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        LightTransitionMetals = new Material.Builder(84, Serendustry.ID("light_transition_metals"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xCC9A3D).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Titanium, 1, Vanadium, 1, Manganese, 1, Chrome, 1, Iron, 1, Nickel, 1, Cobalt, 1, Copper, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        PreciousMetals = new Material.Builder(85, Serendustry.ID("precious_metals"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xCAC9CC).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Ruthenium, 1, Rhodium, 1, Palladium, 1, Silver, 1, Rhenium, 1, Osmium, 1, Iridium, 1,
                        Platinum, 1, Gold, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        PartialPostTransitionMetals = new Material.Builder(86, Serendustry.ID("partial_post_transition_metals"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xBB6E1A).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Mercury, 1, Tin, 1, Gallium, 1, Indium, 1, Bismuth, 1, Polonium, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        PostTransitionMetals = new Material.Builder(87, Serendustry.ID("post_transition_metals"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xCC8F9F).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialPostTransitionMetals, 1, Zinc, 1, Cadmium, 1, Aluminum, 1, Silicon, 1, Germanium, 1,
                        Antimony, 1, Thallium, 1, Lead, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        PartialLanthanoids = new Material.Builder(88, Serendustry.ID("partial_lanthanoids"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x2A82E4).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Dysprosium, 1, Lanthanum, 1, Cerium, 1, Praseodymium, 1, Neodymium, 1, Europium, 1,
                        Ytterbium, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        Lanthanoids = new Material.Builder(89, Serendustry.ID("lanthanoids"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x5DCCA3).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialLanthanoids, 1, Samarium, 1, Gadolinium, 1, Terbium, 1, Thulium, 1, Holmium, 1,
                        Lutetium, 1, Promethium, 1, Erbium, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        PartialActinoids = new Material.Builder(90, Serendustry.ID("partial_actinoids"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x02B3F2).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Californium, 1, Neptunium, 1, Plutonium241, 1, Mendelevium, 1, Einsteinium, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        Actinoids = new Material.Builder(91, Serendustry.ID("actinoids"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xC9CC7A).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialActinoids, 1, Actinium, 1, Thorium, 1, Protactinium, 1, Uranium235, 1, Americium, 1,
                        Curium, 1, Berkelium, 1, Fermium, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        Gases = new Material.Builder(92, Serendustry.ID("gases"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x25CBA8).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Oxygen, 1, Nitrogen, 1, Hydrogen, 1, Fluorine, 1, Chlorine, 1, Bromine, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        NonMetals = new Material.Builder(93, Serendustry.ID("non_metals"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xCC2AB9).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Boron, 1, Carbon, 1, Phosphorus, 1, Sulfur, 1, Arsenic, 1, Selenium, 1, Tellurium, 1,
                        Iodine, 1, Astatine, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        PartialNobleGases = new Material.Builder(94, Serendustry.ID("partial_noble_gases"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xBB420F).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Helium, 1, Neon, 1, Argon, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        NobleGases = new Material.Builder(95, Serendustry.ID("noble_gases"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x70CC2E).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialNobleGases, 1, Krypton, 1, Xenon, 1, Radon, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        PartialSuperheavies = new Material.Builder(96, Serendustry.ID("partial_superheavies"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xCC0A00).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Nobelium, 1, Lawrencium, 1, Rutherfordium, 1, Dubnium, 1, Seaborgium, 1, Bohrium, 1,
                        Hassium, 1, Meitnerium, 1, Darmstadtium, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        Superheavies = new Material.Builder(97, Serendustry.ID("superheavies"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xCC0A00).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialSuperheavies, 1, Roentgenium, 1, Copernicium, 1, Nihonium, 1, Flerovium, 1,
                        Moscovium, 1, Livermorium, 1, Tennessine, 1, Oganesson, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build();

        Periodicium = new Material.Builder(98, Serendustry.ID("periodicium"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000)).plasma()
                .color(0x1111FF).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Alkalis, 1, RefractoryMetals, 1, LightTransitionMetals, 1, PreciousMetals, 1,
                        PostTransitionMetals, 1, Lanthanoids, 1, Actinoids, 1, Superheavies, 1, Gases, 1, NonMetals, 1,
                        NobleGases, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 5000))
                .build()
                .setFormula("HHeLiBeBCNOFNeNaMgAlSiPSClArKCaScTiVCrMnFeCoNiCuZnGaGeAsSeBrKrRbSrYZrNbMoTcRuRhPdAgCdInSnSbTeIXeCsBaLaCePrNdPmSmEuGdTbDyHoErTmYbLuHfTaWReOsIrPtAuHgTlPbBiPoAtRnFrRaAcThPaUNpPuAmCmBkCfEsFmMdNoLrRfDbSgBhHsMtDsRgCnNhFlMcLvTsOg");

        TransCataCrude = new Material.Builder(100, Serendustry.ID("trans_cata_crude"))
                .liquid(new FluidBuilder().temperature(800000))
                .color(0x631B45)
                .build();

        TransCataExcited = new Material.Builder(101, Serendustry.ID("trans_cata_excited"))
                .liquid(new FluidBuilder().temperature(2400000))
                .color(0xD88842)
                .build();

        TransCataResplendent = new Material.Builder(102, Serendustry.ID("trans_cata_resplendent"))
                .liquid(new FluidBuilder().temperature(3200000))
                .color(0x4CFF71)
                .build();

        TransResidue = new Material.Builder(103, Serendustry.ID("trans_residue"))
                .liquid(new FluidBuilder().temperature(2800000))
                .color(0x4944AF)
                .build();

        TengamRaw = new Material.Builder(104, Serendustry.ID("tengam_raw"))
                .dust(3).ore(1, 1).fluid()
                .color(0xA0BF60).iconSet(METALLIC)
                .build()
                .setFormula("M");

        oreProp = TengamRaw.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(IronMagnetic, SteelMagnetic, NeodymiumMagnetic, SamariumMagnetic);
        oreProp.setWashedIn(Steel);
        oreProp.setDirectSmeltResult(NeodymiumMagnetic);

        TengamPurified = new Material.Builder(105, Serendustry.ID("tengam_purified"))
                .ingot(3).liquid(new FluidBuilder().temperature(5000))
                .color(0xD5FF80).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_LONG_ROD)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UV], 5000))
                .build()
                .setFormula("M");

        TengamAttuned = new Material.Builder(106, Serendustry.ID("tengam_attuned"))
                .ingot(3)
                .color(0xD5FF80).iconSet(MAGNETIC)
                .flags(STD_METAL, GENERATE_LONG_ROD, NO_WORKING, NO_UNIFICATION)
                .components(TengamPurified, 1)
                .ingotSmeltInto(TengamPurified)
                .arcSmeltInto(TengamPurified)
                .macerateInto(TengamPurified)
                .build();

        DissolutionWater = new Material.Builder(107, Serendustry.ID("dissolution_water"))
                .fluid().build();

        MonaziteSludge = new Material.Builder(108, Serendustry.ID("monazite_sludge"))
                .fluid().build().setFormula("??????");

        MonaziteSulfate = new Material.Builder(109, Serendustry.ID("monazite_sulfate"))
                .fluid().build().setFormula("??????SO4", true);

        InsolubleMonaziteSludge = new Material.Builder(110, Serendustry.ID("insoluble_monazite_sludge"))
                .dust().build().setFormula("??????");

        SodiumOxalate = new Material.Builder(111, Serendustry.ID("sodium_oxalate"))
                .dust()
                .components(Sodium, 2, Carbon, 2, Oxygen, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build();

        AmmoniumHydroxide = new Material.Builder(112, Serendustry.ID("ammonium_hydroxide"))
                .fluid()
                .components(Nitrogen, 1, Hydrogen, 5, Oxygen, 1)
                .build()
                .setFormula("NH4OH", true);

        OxalicAcid = new Material.Builder(113, Serendustry.ID("oxalic_acid"))
                .dust()
                .components(Carbon, 2, Hydrogen, 2, Oxygen, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build();

        OxylatedMonazite = new Material.Builder(114, Serendustry.ID("oxylated_monazite"))
                .fluid().build().setFormula("??????O4", true);

        AlkalineOxalateMixture = new Material.Builder(115, Serendustry.ID("alkaline_oxalate_mixture"))
                .fluid().build().setFormula("?????O4", true);

        ErrorSerenibyss = new Material.Builder(116, Serendustry.ID("error_serenibyss"))
                .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_SPRING,
                        GENERATE_SPRING_SMALL, GENERATE_FRAME, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_GEAR,
                        GENERATE_DOUBLE_PLATE, GENERATE_DENSE)
                .fluid().color(0xc565f6)
                .toolStats(ToolProperty.Builder.of(480.0f, 320.0f, 65535, 9)
                        .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .rotorStats(100.0f, 100.0f, 65535)
                .build().setFormula("REPORT ERROR TO SERENIBYSS");

        ErrorEnvoidia = new Material.Builder(117, Serendustry.ID("error_envoidia"))
                .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_SPRING,
                        GENERATE_SPRING_SMALL, GENERATE_FRAME, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_GEAR,
                        GENERATE_DOUBLE_PLATE, GENERATE_DENSE)
                .fluid().color(0xe9aae4)
                .toolStats(ToolProperty.Builder.of(480.0f, 320.0f, 65535, 9)
                        .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .rotorStats(100.0f, 100.0f, 65535)
                .build().setFormula("REPORT ERROR TO ENVOIDIA");

        PrimedAir = new Material.Builder(118, Serendustry.ID("primed_air"))
                .fluid().color(0xbb9898).build().setFormula("SiO2", true);

        ArgonPrime = new Material.Builder(119, Serendustry.ID("argon_prime"))
                .fluid().color(0x1eff00).build().setFormula("ArΨ");

        HeliumPrime = new Material.Builder(120, Serendustry.ID("helium_prime"))
                .fluid().color(0xefff59).build().setFormula("HeΨ");

        HydrogenPrime = new Material.Builder(121, Serendustry.ID("hydrogen_prime"))
                .fluid().color(0x037cff).build().setFormula("HΨ");

        KryptonPrime = new Material.Builder(122, Serendustry.ID("krypton_prime"))
                .fluid().color(0x06ff03).build().setFormula("KrΨ");

        NeonPrime = new Material.Builder(123, Serendustry.ID("neon_prime"))
                .fluid().color(0xe15ee6).build().setFormula("NeΨ");

        NitrogenPrime = new Material.Builder(124, Serendustry.ID("nitrogen_prime"))
                .fluid().color(0x5ee2e6).build().setFormula("NΨ");

        OxygenPrime = new Material.Builder(125, Serendustry.ID("oxygen_prime"))
                .fluid().color(0x03a1c0).build().setFormula("OΨ");

        Rhopalthenit = new Material.Builder(126, Serendustry.ID("rhopalthenit"))
                .ingot(3).liquid(new FluidBuilder().temperature(8500))
                .color(0x03c073).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_BOLT_SCREW)
                .components(Rhodium, 1, Palladium, 1, Ruthenium, 1)
                .blast(b -> b
                        .temp(3500, GasTier.MID)
                        .blastStats(VA[IV]))
                .rotorStats(7.5f, 3.0f, 2500)
                .build();

        CheeseCheddar = new Material.Builder(127, Serendustry.ID("cheese_cheddar"))
                .fluid().ingot(0).ore(2, 1)
                .color(0xfffb00).iconSet(DULL)
                .flags(EXT2_METAL, GENERATE_FINE_WIRE, GENERATE_LONG_ROD)
                .toolStats(ToolProperty.Builder.of(5.0f, 1.0f, 360, 2)
                        .attackSpeed(0.5f).enchantability(666).build())
                .rotorStats(1.0f, 500.0f, 250)
                .build()
                .setFormula("Ch");

        WroughtNeutronium = new Material.Builder(128, Serendustry.ID("wrought_neutronium"))
                .ingot(3).liquid(new FluidBuilder().temperature(200000))
                .color(0xffffff).iconSet(SHINY)
                .flags(EXT2_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_FOIL,
                        GENERATE_SMALL_GEAR)
                .components(Neutronium, 1)
                .blast(b -> b
                        .temp(10800, GasTier.HIGHEST)
                        .blastStats(VA[UHV], 10000))
                .build()
                .setFormula("*Nt*");

        AmmoniumNitrate = new Material.Builder(129, Serendustry.ID("ammonium_nitrate"))
                .dust().color(0xa147c3).iconSet(DULL)
                .components(Ammonia, 1, Hydrogen, 1, Nitrogen, 1, Oxygen, 3)
                .build()
                .setFormula("NH4NO3", true);

        SulfurousAcid = new Material.Builder(130, Serendustry.ID("sulfurous_acid"))
                .fluid().color(0xebb33c)
                .components(Hydrogen, 2, Sulfur, 1, Oxygen, 3)
                .build();

        DriedEarth = new Material.Builder(131, Serendustry.ID("dried_earth"))
                .dust().color(0x5a2e01).iconSet(DULL)
                .build();

        SulfuricApatiteMix = new Material.Builder(132, Serendustry.ID("sulfuric_apatite_mix"))
                .fluid().color(0x006a99)
                .build()
                .setFormula("(Ca5(PO4)3(F,Cl,OH))S?", true);

        ISSulfuricAcid = new Material.Builder(133, Serendustry.ID("is_sulfuric_acid"))
                .fluid().color(0xffb15d)
                .components(SulfuricAcid, 1).flags(DISABLE_DECOMPOSITION)
                .build();

        ISHydrochloricAcid = new Material.Builder(134, Serendustry.ID("is_hydrochloric_acid"))
                .fluid().color(0x8bfc7c)
                .components(HydrochloricAcid, 1).flags(DISABLE_DECOMPOSITION)
                .build();

        ISHydrofluoricAcid = new Material.Builder(135, Serendustry.ID("is_hydrofluoric_acid"))
                .fluid().color(0x7cfcc8)
                .components(HydrofluoricAcid, 1).flags(DISABLE_DECOMPOSITION)
                .build();

        // todo: custom star matter textures
        YellowStarMatter = new Material.Builder(136, Serendustry.ID("yellow_star_matter"))
                .color(0xffff00).liquid(new FluidBuilder().temperature(6000))
                .build();

        RedStarMatter = new Material.Builder(137, Serendustry.ID("red_star_matter"))
                .color(0xff0000).liquid(new FluidBuilder().temperature(3600))
                .build();

        BlueStarMatter = new Material.Builder(138, Serendustry.ID("blue_star_matter"))
                .color(0x0000ff).liquid(new FluidBuilder().temperature(28000))
                .build();

        WhiteStarMatter = new Material.Builder(139, Serendustry.ID("white_star_matter"))
                .color(0xffffff).liquid(new FluidBuilder().temperature(11000))
                .build();

        BrownStarMatter = new Material.Builder(140, Serendustry.ID("brown_star_matter"))
                .color(0x842f00).liquid(new FluidBuilder().temperature(950))
                .build();

        BlackStarMatter = new Material.Builder(141, Serendustry.ID("black_star_matter"))
                .color(0x000000).liquid(new FluidBuilder().temperature(5))
                .build();

        PulsarStarMatter = new Material.Builder(142, Serendustry.ID("pulsar_star_matter"))
                .color(0x878787).liquid(new FluidBuilder().temperature(950))
                .build();

        CondensedStarMatter = new Material.Builder(143, Serendustry.ID("condensed_star_matter"))
                .liquid(new FluidBuilder().temperature(35000))
                .color(0x00ffd8)
                .build();

        LigniteCoal = new Material.Builder(144, Serendustry.ID("lignite_coal"))
                .gem(1, 1200)
                .ore(2, 1)
                .color(0x452200).iconSet(LIGNITE)
                .flags(
                        FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_PLATE)
                /*.toolStats(ToolProperty.Builder.of(0.0F, 0.5F, 48, 1)
                        .enchantability(2).ignoreCraftingTools()
                        .enchantment(Enchantments.FIRE_ASPECT, 1).build()) todo: fix */
                .components(Carbon, 1)
                .build();

        AnthraciteCoal = new Material.Builder(145, Serendustry.ID("anthracite_coal"))
                .gem(1, 1200)
                .ore(2, 1)
                .color(0x535f77).iconSet(LIGNITE)
                .flags(
                        FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_PLATE)
                /*.toolStats(ToolProperty.Builder.of(0.0F, 0.5F, 48, 1)
                        .enchantability(2).ignoreCraftingTools()
                        .enchantment(Enchantments.FIRE_ASPECT, 1).build()) todo: fix */
                .components(Carbon, 1)
                .build();

        BituminousCoal = new Material.Builder(146, Serendustry.ID("bituminous_coal"))
                .gem(1, 1200)
                .ore(2, 1)
                .color(0x451C90).iconSet(LIGNITE)
                .flags(
                        FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_PLATE)
                /*.toolStats(ToolProperty.Builder.of(0.0F, 0.5F, 48, 1)
                        .enchantability(2).ignoreCraftingTools()
                        .enchantment(Enchantments.FIRE_ASPECT, 1).build()) todo: fix */
                .components(Carbon, 1)
                .build();

        SubBituminousCoal = new Material.Builder(147, Serendustry.ID("sub_bituminous_coal"))
                .gem(1, 1200)
                .ore(2, 1)
                .color(0x451C3F).iconSet(LIGNITE)
                .flags(
                        FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_PLATE)
                /*.toolStats(ToolProperty.Builder.of(0.0F, 0.5F, 48, 1)
                        .enchantability(2).ignoreCraftingTools()
                        .enchantment(Enchantments.FIRE_ASPECT, 1).build()) todo: fix */
                .components(Carbon, 1)
                .build();

        PeatCoal = new Material.Builder(148, Serendustry.ID("peat_coal"))
                .gem(1, 1200)
                .ore(2, 1)
                .color(0x454800).iconSet(LIGNITE)
                .flags(
                        FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_PLATE)
                /*.toolStats(ToolProperty.Builder.of(0.0F, 0.5F, 48, 1)
                        .enchantability(2).ignoreCraftingTools()
                        .enchantment(Enchantments.FIRE_ASPECT, 1).build()) todo: fix */
                .components(Carbon, 1)
                .build();

        oreProp = AnthraciteCoal.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(AnthraciteCoal, LigniteCoal, BituminousCoal, SubBituminousCoal);
        oreProp.setWashedIn(Water);

        oreProp = LigniteCoal.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(LigniteCoal, AnthraciteCoal, BituminousCoal, SubBituminousCoal);
        oreProp.setWashedIn(Water);

        oreProp = BituminousCoal.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(BituminousCoal, PeatCoal, LigniteCoal, SubBituminousCoal);
        oreProp.setWashedIn(Water);

        oreProp = SubBituminousCoal.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(SubBituminousCoal, PeatCoal, AnthraciteCoal, BituminousCoal);
        oreProp.setWashedIn(Water);

        oreProp = PeatCoal.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(PeatCoal, LigniteCoal, AnthraciteCoal, SubBituminousCoal);
        oreProp.setWashedIn(Water);

        CheeseAmerican = new Material.Builder(149, Serendustry.ID("cheese_american"))
                .fluid().ingot(0).ore(2, 1)
                .color(0xffe500).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_FINE_WIRE, GENERATE_LONG_ROD)
                .toolStats(ToolProperty.Builder.of(5.0f, 1.0f, 360, 2)
                        .attackSpeed(0.5f).enchantability(666).build())
                .rotorStats(1.0f, 500.0f, 250)
                .build()
                .setFormula("Ch");

        CheeseSwiss = new Material.Builder(150, Serendustry.ID("cheese_swiss"))
                .fluid().ingot(0).ore(2, 1)
                .color(0xffff9f).iconSet(DULL)
                .flags(EXT2_METAL, GENERATE_FINE_WIRE, GENERATE_LONG_ROD)
                .toolStats(ToolProperty.Builder.of(5.0f, 1.0f, 360, 2)
                        .attackSpeed(0.5f).enchantability(666).build())
                .rotorStats(1.0f, 500.0f, 250)
                .build()
                .setFormula("Ch");

        CheeseMozzarella = new Material.Builder(151, Serendustry.ID("cheese_mozzarella"))
                .fluid().ingot(0).ore(2, 1)
                .color(0xffffda).iconSet(DULL)
                .flags(EXT2_METAL, GENERATE_FINE_WIRE, GENERATE_LONG_ROD)
                .toolStats(ToolProperty.Builder.of(5.0f, 1.0f, 360, 2)
                        .attackSpeed(0.5f).enchantability(666).build())
                .rotorStats(1.0f, 500.0f, 250)
                .build()
                .setFormula("Ch");

        oreProp = CheeseAmerican.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(CheeseAmerican, Polyethylene, CheeseSwiss, CheeseMozzarella);
        oreProp.setWashedIn(Water);

        oreProp = CheeseSwiss.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(CheeseSwiss, CheeseCheddar, CheeseAmerican, CheeseMozzarella);
        oreProp.setWashedIn(Water);

        oreProp = CheeseCheddar.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(CheeseCheddar, CheeseAmerican, CheeseSwiss, CheeseMozzarella);
        oreProp.setWashedIn(Water);

        oreProp = CheeseMozzarella.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(CheeseMozzarella, CheeseCheddar, CheeseSwiss, CheeseAmerican);
        oreProp.setWashedIn(Water);

        // todo: make cheeses edible

        StellarBaptismSolution = new Material.Builder(152, Serendustry.ID("stellar_baptism_solution"))
                .liquid(new FluidBuilder().temperature(30000)).color(0x676767)
                .build();

        StellarContainmentBase = new Material.Builder(153, Serendustry.ID("stellar_containment_base"))
                .ingot(3).liquid(new FluidBuilder().temperature(1000))
                .color(0x001171).iconSet(SHINY)
                .flags(STD_METAL)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 900)
                .build();

        Hihiirokane = new Material.Builder(154, Serendustry.ID("hihiirokane"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xff2500).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_LONG_ROD)
                .components(RoseGold, 3, Promethium, 2, Naquadria, 2, Thulium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 1200)
                .cableProperties(V[UHV], 4, 8, false, 3)
                .build();

        HalkoniteSteel = new Material.Builder(155, Serendustry.ID("halkonite_steel"))
                .color(0xFFFFFF).iconSet(HALKONITE_STEEL)
                .flags(NO_UNIFICATION, NO_WORKING, NO_SMASHING, NO_SMELTING, GENERATE_PLATE, GENERATE_ROD, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR,
                        GENERATE_BOLT_SCREW, GENERATE_ROTOR, GENERATE_DENSE, GENERATE_RING, GENERATE_ROUND, GENERATE_FRAME)
                .build()
                .setFormula("Nt(Tr3Ds2(Al2Li2MgSc2Ti3)2(((FeW)CrMo2V)6Ir2Os))", true);

        HAMAlloy = new Material.Builder(156, Serendustry.ID("ham_alloy"))
                .color(0xCA8BEC).iconSet(DULL).liquid(new FluidBuilder().temperature(1500))
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_LONG_ROD)
                .components(Holmium, 2, Americium, 1, Moscovium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 1600)
                .build();

        MagneticHAMAlloy = new Material.Builder(157, Serendustry.ID("magnetic_ham_alloy"))
                .ingot(3)
                .color(0xCA8BEC).iconSet(MAGNETIC)
                .flags(STD_METAL, GENERATE_LONG_ROD, IS_MAGNETIC)
                .components(HAMAlloy, 1)
                .ingotSmeltInto(HAMAlloy)
                .arcSmeltInto(HAMAlloy)
                .macerateInto(HAMAlloy)
                .build();
        HAMAlloy.getProperty(PropertyKey.INGOT).setMagneticMaterial(MagneticHAMAlloy);

        HighGradeSolderingAlloy = new Material.Builder(158, Serendustry.ID("high_grade_soldering_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(1500))
                .color(0x5C009A).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Cadmium, 4, Antimony, 3, Indium, 1)
                .blastTemp(5000, GasTier.HIGH, VA[EV], 900)
                .build(); // todo: change LuV-UV recipes to use this

        SuperheavySolderingAlloy = new Material.Builder(159, Serendustry.ID("superheavy_soldering_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(1500))
                .color(0xE4FF27).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Flerovium, 4, HighGradeSolderingAlloy, 3, Darmstadtium, 1)
                .blastTemp(9000, GasTier.HIGHEST, VA[UV], 1100)
                .build();

        MolybdeniteLubricant = new Material.Builder(160, Serendustry.ID("molybdenite_lubricant"))
                .color(0xB7A5F9).liquid(new FluidBuilder())
                .build(); // todo: change IV-UV recipes to use this

        Ferrofluid = new Material.Builder(161, Serendustry.ID("ferrofluid"))
                .color(0x000000).liquid(new FluidBuilder())
                .build();

        ALMST = new Material.Builder(162, Serendustry.ID("almst"))
                .ingot(3).liquid(new FluidBuilder().temperature(8000))
                .color(0x82A4CA).iconSet(BRIGHT)
                .flags(STD_METAL, GENERATE_FOIL)
                .components(Aluminium, 2, Lithium, 2, Magnesium, 1, Scandium, 2, Titanium, 3)
                .blastTemp(6000, GasTier.HIGH, VA[IV], 900)
                .build();

        Iron2Chloride = new Material.Builder(164, Serendustry.ID("iron_2_chloride"))
                .color(0x606D70).liquid(new FluidBuilder())
                .components(Iron, 1, Chlorine, 2)
                .build();

        OleicAcid = new Material.Builder(166, Serendustry.ID("oleic_acid"))
                .color(0xB3B99A).liquid(new FluidBuilder())
                .build();

        StearicAcid = new Material.Builder(167, Serendustry.ID("stearic_acid"))
                .dust().color(0xEFD49C)
                .build();

        AmmoniumOleate = new Material.Builder(168, Serendustry.ID("ammonium_oleate"))
                .dust().color(0xFFA800)
                .build();

        MagneticNanoparticleMixture = new Material.Builder(169, Serendustry.ID("magnetic_nanoparticle_mixture"))
                .dust().color(0x363636)
                .build();

        Kerosene = new Material.Builder(170, Serendustry.ID("kerosene"))
                .color(0x5B4600).liquid(new FluidBuilder())
                .build()
                .setFormula("C12H26", true);

        Cyclopentadiene = new Material.Builder(171, Serendustry.ID("cyclopentadiene"))
                .color(0xEFC76F).liquid(new FluidBuilder())
                .build()
                .setFormula("C5H6", true);

        ButeneMixture = new Material.Builder(172, Serendustry.ID("butene_mixture"))
                .color(0x62512A).liquid(new FluidBuilder())
                .build()
                .setFormula("C4H8", true);

        Butene1 = new Material.Builder(174, Serendustry.ID("butene_1"))
                .color(0xA58640).liquid(new FluidBuilder())
                .build()
                .setFormula("C4H8", true);

        Butene2 = new Material.Builder(175, Serendustry.ID("butene_2"))
                .color(0x3D321B).liquid(new FluidBuilder())
                .build()
                .setFormula("C4H8", true);

        IgnisCrystal = new Material.Builder(176, Serendustry.ID("ignis_crystal"))
                .gem().fluid().color(0xFF0000).iconSet(SHINY)
                .flags(STD_METAL, NO_SMASHING, NO_SMELTING, GENERATE_LENS)
                .build();

        AquaCrystal = new Material.Builder(177, Serendustry.ID("aqua_crystal"))
                .gem().fluid().color(0x0000FF).iconSet(SHINY)
                .flags(STD_METAL, NO_SMASHING, NO_SMELTING, GENERATE_LENS)
                .build();

        TerraCrystal = new Material.Builder(178, Serendustry.ID("terra_crystal"))
                .gem().fluid().color(0x00FF00).iconSet(SHINY)
                .flags(STD_METAL, NO_SMASHING, NO_SMELTING, GENERATE_LENS)
                .build();

        AerCrystal = new Material.Builder(179, Serendustry.ID("aer_crystal"))
                .gem().fluid().color(0xFFFF00).iconSet(SHINY)
                .flags(STD_METAL, NO_SMASHING, NO_SMELTING, GENERATE_LENS)
                .build();

        OrdoCrystal = new Material.Builder(180, Serendustry.ID("ordo_crystal"))
                .gem().fluid().color(0xFFFFFF).iconSet(SHINY)
                .flags(STD_METAL, NO_SMASHING, NO_SMELTING, GENERATE_LENS)
                .build();

        PerditioCrystal = new Material.Builder(181, Serendustry.ID("perditio_crystal"))
                .gem().fluid().color(0x000000).iconSet(SHINY)
                .flags(STD_METAL, NO_SMASHING, NO_SMELTING, GENERATE_LENS)
                .build();

        EnergyCrystal = new Material.Builder(182, Serendustry.ID("energy_crystal"))
                .ingot().fluid().color(0xF3FF00).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_LENS)
                .blastTemp(4000, GasTier.MID, VA[HV], 600)
                .build().setFormula("⬟⬢⬣");

        Quantum = new Material.Builder(48, Serendustry.ID("quantum"))
                .ingot(3).liquid(new FluidBuilder().temperature(48000))
                .color(0x353535).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_RING, GENERATE_BOLT_SCREW,
                        GENERATE_FRAME)
                .components(StellarAlloy, 15, ArceusAlloy2B, 10, Lafium, 10, Jasper, 5, Americium, 5, EnergyCrystal, 5,
                        Germanium, 5, SiliconCarbide, 5, AssemblyLine, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 8000)
                .build();

        ScOpv = new Material.Builder(53, Serendustry.ID("sc_opv"))
                .ingot(3).liquid(new FluidBuilder().temperature(90000))
                .color(0x597C8C).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE)
                .components(Quantum, 5, AwakenedDraconium, 3, Ledox, 3, Enderiiium, 3, Infinity, 3,
                        NaquadriaticTaranium, 3, Amogus, 2)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 11000)
                .cableProperties(VA[OpV], 1, 0, true)
                .build();

        MultiversalAlloy = new Material.Builder(99, Serendustry.ID("multiversal_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(130000))
                .color(0xE04A2C).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FRAME)
                .components(Infinity, 5, Shirabon, 3, ScOpv, 2, StellarAlloy, 2, ScUxv, 1, Quantum, 1, Actinoids, 1,
                        Lanthanoids, 1, Periodicium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[OpV], 16000)
                .build();

        Arcanite = new Material.Builder(183, Serendustry.ID("arcanite"))
                .ingot().fluid()
                .color(0x7B825B).iconSet(DULL)
                .flags(STD_METAL, NO_UNIFICATION, DISABLE_DECOMPOSITION, NO_WORKING, GENERATE_ROUND)
                .components(Thorium, 4, EnergyCrystal, 4, OrdoCrystal, 1, PerditioCrystal, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UEV], 8000)
                .build().setFormula("Th4(⬟⬢⬣)4????", true);

        ChromiumDopedMolybdenite = new Material.Builder(184, Serendustry.ID("chromium_doped_molybdenite"))
                .dust().color(0x9C5fB5)
                .components(Chrome, 1, Molybdenite, 1)
                .build();

        MagnesiumSilicide = new Material.Builder(185, Serendustry.ID("magensium_silicide"))
                .dust().color(0x5f4b5f)
                .components(Magnesium, 2, Silicon, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        MagnesiumDichloride = new Material.Builder(186, Serendustry.ID("magensium_dichloride"))
                .dust().color(0x89b293)
                .components(Magnesium, 1, Chlorine, 2)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        Silane = new Material.Builder(187, Serendustry.ID("silane"))
                .color(0x909090).liquid(new FluidBuilder())
                .components(Silicon, 1, Hydrogen, 4)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        SemiconductorGradeSilicon = new Material.Builder(188, Serendustry.ID("semiconductor_grade_silicon"))
                .ingot(1).color(0x3a395a).iconSet(SHINY).liquid(new FluidBuilder().temperature(1200))
                .components(Silicon, 1)
                .flags(STD_METAL)
                .blastTemp(2273, GasTier.LOW, VA[MV], 240)
                .build()
                .setFormula("SGSi");

        Acetylene = new Material.Builder(189, Serendustry.ID("acetylene"))
                .color(0x675e5e).liquid(new FluidBuilder())
                .components(Carbon, 2, Hydrogen, 2)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        RawCarbonNanotubesMixture = new Material.Builder(195, Serendustry.ID("raw_carbon_nanotubes_mixture"))
                .dust().color(0x424240)
                .components(Carbon, 1, Iron, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();

        // todo: find a way to not have a plate or plate recipe for Nanotubes?
        CarbonNanotubes = new Material.Builder(190, Serendustry.ID("carbon_nanotubes"))
                .dust().color(0x000000)
                .components(Carbon, 1)
                .flags(DISABLE_DECOMPOSITION, NO_WORKING, NO_SMELTING, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .build();

        GadoliniumTrichloride = new Material.Builder(191, Serendustry.ID("gadolinium_trichloride"))
                .dust().color(0xb4e87c)
                .components(Gadolinium, 1, Chlorine, 3)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        Gadonanotubes = new Material.Builder(192, Serendustry.ID("gadonanotubes"))
                .dust().color(0x509a00)
                .components(Gadolinium, 1, Carbon, 1)
                .flags(DISABLE_DECOMPOSITION, NO_WORKING, NO_SMELTING, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .build();

        MagneticHolmium = new Material.Builder(193, Serendustry.ID("magnetic_holmium"))
                .ingot(3)
                .color(0x130793).iconSet(MAGNETIC)
                .flags(STD_METAL, GENERATE_LONG_ROD, IS_MAGNETIC)
                .components(Holmium, 1)
                .ingotSmeltInto(Holmium)
                .arcSmeltInto(Holmium)
                .macerateInto(Holmium)
                .build();
        Holmium.getProperty(PropertyKey.INGOT).setMagneticMaterial(MagneticHolmium);

        NeutronStarMatter = new Material.Builder(194, Serendustry.ID("neutron_star_matter"))
                .color(0xCCCCCC).liquid(new FluidBuilder().temperature(15000))
                .build();

        Originium = new Material.Builder(200, Serendustry.ID("originium"))
                .ingot(1).color(0xFF0000).iconSet(SHINY).liquid(new FluidBuilder().temperature(2500))
                .flags(STD_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 1400)
                .build()
                .setFormula("Or");

        Originite = new Material.Builder(199, Serendustry.ID("originite"))
                .dust(3).ore(1, 1)
                .color(0xFF2222).iconSet(METALLIC)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(SiliconDioxide, 3, Originium, 1)
                .build();

        oreProp = Originite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Originite, Originite, Silicon, Originium);
        oreProp.setWashedIn(Xenoxene);

        TiberiumRiparius = new Material.Builder(202, Serendustry.ID("tiberium_riparius"))
                .gem(3).ore(1, 1).fluid()
                .color(0x23FF16).iconSet(METALLIC)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Iron, 8, Oxygen, 30, Copper, 2, Calcium, 2, Phosphorus, 4, Originite, 10)
                .build();

        oreProp = TiberiumRiparius.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(TiberiumVinifera, TiberiumCruentus, TiberiumAboreus, Originite);
        oreProp.setWashedIn(Xenoxene);

        TiberiumVinifera = new Material.Builder(196, Serendustry.ID("tiberium_vinifera"))
                .gem(3).ore(1, 1).fluid()
                .color(0x2316FF).iconSet(METALLIC)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Iron, 12, Oxygen, 24, Copper, 2, Phosphorus, 8, Originite, 10)
                .build();

        oreProp = TiberiumVinifera.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(TiberiumRiparius, TiberiumCruentus, TiberiumAboreus, Originite);
        oreProp.setWashedIn(Xenoxene);

        TiberiumCruentus = new Material.Builder(197, Serendustry.ID("tiberium_cruentus"))
                .gem(3).ore(1, 1).fluid()
                .color(0xFF2316).iconSet(METALLIC)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Iron, 10, Oxygen, 32, Copper, 4, Originite, 10)
                .build();

        oreProp = TiberiumCruentus.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(TiberiumVinifera, TiberiumRiparius, TiberiumAboreus, Originite);
        oreProp.setWashedIn(Xenoxene);

        TiberiumAboreus = new Material.Builder(198, Serendustry.ID("tiberium_aboreus"))
                .gem(3).ore(1, 1).fluid()
                .color(0xAB31FE).iconSet(METALLIC)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Oxygen, 30, Copper, 2, Calcium, 2, Phosphorus, 12, Originite, 10)
                .build();

        oreProp = TiberiumAboreus.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(TiberiumVinifera, TiberiumCruentus, TiberiumRiparius, Originite);
        oreProp.setWashedIn(Xenoxene);

        Orundum = new Material.Builder(201, Serendustry.ID("orundum"))
                .gem(3).fluid().color(0xAA0000)
                .flags(STD_METAL, NO_SMASHING, NO_SMELTING, DECOMPOSITION_BY_ELECTROLYZING, GENERATE_FINE_WIRE, GENERATE_LENS) // todo: check recipes, is NO_WORKING needed?
                .components(Originium, 4, SemiconductorGradeSilicon, 2, Naquadria, 1, Cerium, 1)
                .build();

        RawAncientDebris = new Material.Builder(203, Serendustry.ID("raw_ancient_debris")) // todo: add planetoid and ore vein for this
                .dust(3).ore(1, 1)
                .color(0x4c3e23).iconSet(METALLIC)
                .build()
                .setFormula("??Nr??");

        oreProp = RawAncientDebris.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Netherrack, Gold, Gold, RawAncientDebris);
        oreProp.setWashedIn(Lava);

        NetheriteRichAncientDebris = new Material.Builder(204, Serendustry.ID("netherite_rich_ancient_debris"))
                .ingot(3).ore(1, 1)
                .color(0x3b311e).iconSet(SHINY)
                .flags(NO_SMELTING)
                .blastTemp(3600, GasTier.HIGHEST, VA[UXV], 12000) // exists purely to generate a hot ingot
                .build()
                .setFormula("??Nr??");

        oreProp = NetheriteRichAncientDebris.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Netherrack, Gold, NetheritePoorAncientDebris, NetheriteRichAncientDebris);
        oreProp.setWashedIn(Lava);

        NetheritePoorAncientDebris = new Material.Builder(205, Serendustry.ID("netherite_poor_ancient_debris"))
                .dust(3).ore(1, 1)
                .color(0x5d4a26).iconSet(DULL)
                .build()
                .setFormula("??Nr??");

        oreProp = NetheritePoorAncientDebris.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Netherrack, Gold, NetheritePoorAncientDebris, NetheriteRichAncientDebris);
        oreProp.setWashedIn(Lava);

        Netherite = new Material.Builder(206, Serendustry.ID("netherite"))
                .ingot().liquid(new FluidBuilder().temperature(6000)).ore(1, 1)
                .color(0x4C4143).iconSet(METALLIC)
                .cableProperties(V[EV], 4, 0, true, 4500)
                .blastTemp(3600, GasTier.MID, VA[HV], 600)
                .build()
                .setFormula("NrAu4", true);

        oreProp = Netherite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(RawAncientDebris, NetheritePoorAncientDebris, NetheritePoorAncientDebris, NetheriteRichAncientDebris);
        oreProp.setWashedIn(Lava);

        Taranium = new Material.Builder(207, Serendustry.ID("taranium"))
                .ingot(3).liquid(new FluidBuilder().temperature(12000))
                .color(0x000000).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 3200)
                .build()
                .setFormula("Tn");

        Tairitsu = new Material.Builder(208, Serendustry.ID("tairitsu"))
                .ingot(3).liquid(new FluidBuilder().temperature(12000))
                .color(0x333333).iconSet(DULL)
                .flags(STD_METAL)
                .components(Tungsten, 9, Naquadria, 8, Bedrockium, 6, Vanadium, 5, BlackSteel, 2, Taranium, 1, SiliconCarbide, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 1400)
                .build();

        CondensedCoal = new Material.Builder(210, Serendustry.ID("condensed_coal"))
                .ingot(3).liquid(new FluidBuilder().temperature(16000))
                .color(0x4c3e23).iconSet(DULL)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Coal, 1, LigniteCoal, 1, BituminousCoal, 1, SubBituminousCoal, 1, PeatCoal, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[MAX], 2400)
                .build();

        ExtremelyUnstableTiberium = new Material.Builder(211, Serendustry.ID("extremely_unstable_tiberium"))
                .ingot(3).liquid(new FluidBuilder().temperature(16000))
                .color(0xfe0254).iconSet(DULL)
                .flags(STD_METAL)
                .components(TiberiumRiparius, 1, TiberiumVinifera, 1, TiberiumCruentus, 1, TiberiumAboreus, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[MAX], 2400)
                .build();

        BoneSteel = new Material.Builder(212, Serendustry.ID("bone_steel"))
                .ingot(1).liquid(new FluidBuilder().temperature(2000))
                .color(0xFFEEDD).iconSet(DULL)
                .flags(STD_METAL, GENERATE_FOIL)
                .components(Steel, 1, Bone, 1)
                .build();

        TungstenHexachloride = new Material.Builder(213, Serendustry.ID("tungsten_hexachloride"))
                .dust(3).color(0x331133)
                .components(Tungsten, 1, Chlorine, 6)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        SelfRepairingNanobots = new Material.Builder(214, Serendustry.ID("self_repairing_nanobots"))
                .dust().liquid(new FluidBuilder())
                .color(0xa8abcb).iconSet(BRIGHT)
                .flags(GENERATE_PLATE, GENERATE_FOIL, NO_WORKING, NO_SMASHING, NO_SMELTING, NO_UNIFICATION)
                .build();

        EthyleneOxide = new Material.Builder(215, Serendustry.ID("ethylene_oxide"))
                .color(0x557678).liquid(new FluidBuilder())
                .components(Ethylene, 1, Oxygen, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        EthyleneGlycol = new Material.Builder(216, Serendustry.ID("ethylene_glycol"))
                .color(0x8db8ba).liquid(new FluidBuilder())
                .components(Carbon, 2, Hydrogen, 6, Oxygen, 2)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        paraXylene = new Material.Builder(217, Serendustry.ID("para_xylene"))
                .color(0x6b6457).liquid(new FluidBuilder())
                .components(Carbon, 8, Hydrogen, 10)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        HydrogenBromide = new Material.Builder(218, Serendustry.ID("hydrogen_bromide"))
                .color(0xca9592).liquid(new FluidBuilder())
                .components(Hydrogen, 1, Bromine, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        TerephtalicAcid = new Material.Builder(219, Serendustry.ID("terephtalic_acid"))
                .dust().color(0xa0b29b)
                .components(Carbon, 8, Hydrogen, 6, Oxygen, 4)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        PolyethyleneTerephtalate = new Material.Builder(220, Serendustry.ID("polyethylene_terephtalate"))
                .polymer(3).color(0x5ed95e).liquid(new FluidBuilder().temperature(600))
                .components(Carbon, 10, Hydrogen, 8, Oxygen, 4)
                .flags(DECOMPOSITION_BY_ELECTROLYZING, GENERATE_FOIL)
                .build();

        MoPET = new Material.Builder(224, Serendustry.ID("mopet"))
                .color(0x47b037)
                .components(Carbon, 10, Hydrogen, 8, Oxygen, 4)
                .flags(GENERATE_FOIL, DISABLE_DECOMPOSITION)
                .build();

        BoPET = new Material.Builder(221, Serendustry.ID("bopet"))
                .color(0x37c037)
                .components(Carbon, 10, Hydrogen, 8, Oxygen, 4)
                .flags(GENERATE_FOIL, DISABLE_DECOMPOSITION)
                .build();

        HeatSetBoPET = new Material.Builder(225, Serendustry.ID("heat_set_bopet"))
                .color(0x48c232)
                .components(Carbon, 10, Hydrogen, 8, Oxygen, 4)
                .flags(GENERATE_FOIL, DISABLE_DECOMPOSITION)
                .build();

        AluminizedBoPET = new Material.Builder(222, Serendustry.ID("aluminized_bopet"))
                .color(0x37c064)
                .components(Carbon, 10, Hydrogen, 8, Oxygen, 4)
                .flags(GENERATE_FOIL, DISABLE_DECOMPOSITION)
                .build();

        LaminatedBoPET = new Material.Builder(223, Serendustry.ID("laminated_bopet"))
                .color(0x1aec20)
                .components(Carbon, 10, Hydrogen, 8, Oxygen, 4)
                .flags(GENERATE_FOIL, DISABLE_DECOMPOSITION)
                .build();

        PositroniumHydride = new Material.Builder(226, Serendustry.ID("positronium_hydride"))
                .color(0xDD23FF).liquid(new FluidBuilder())
                .build();

        IrradiatedDiamond = new Material.Builder(227, Serendustry.ID("irradiated_diamond"))
                .gem(3)
                .color(0x0bff9d).iconSet(DIAMOND)
                .build();

        NVCDiamond = new Material.Builder(228, Serendustry.ID("nvc_diamond"))
                .gem(3)
                .color(0x00e1ff).iconSet(DIAMOND)
                .build();

        cis12Dichloroethene = new Material.Builder(230, Serendustry.ID("cis_12_dichloroethene"))
                .color(0x609247).liquid(new FluidBuilder())
                .components(Carbon, 2, Hydrogen, 2, Chlorine, 2)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        SodiumZ12ethenedithiolate = new Material.Builder(231, Serendustry.ID("sodium_z_12_ethene_dithiolate"))
                .dust().color(0xa0b2EE)
                .components(Carbon, 2, Hydrogen, 2, Sodium, 2, Sulfur, 2)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        EthyleneDibromide = new Material.Builder(232, Serendustry.ID("ethylene_dibromide"))
                .color(0xBB6247).liquid(new FluidBuilder())
                .components(Ethylene, 1, Bromine, 2)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        Dihydro14Dithiine = new Material.Builder(233, Serendustry.ID("dihydro_14_dithiine"))
                .color(0x809240).liquid(new FluidBuilder())
                .components(Carbon, 4, Hydrogen, 6, Sulfur, 2)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        SodiumBromide = new Material.Builder(237, Serendustry.ID("sodium_bromide"))
                .dust().color(0xF0b2AA)
                .components(Sodium, 1, Bromine, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        Butanol = new Material.Builder(234, Serendustry.ID("butanol"))
                .color(0x902247).liquid(new FluidBuilder())
                .components(Carbon, 4, Hydrogen, 9, Oxygen, 1, Hydrogen, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        Bromobutane = new Material.Builder(235, Serendustry.ID("bromobutane"))
                .color(0xAA3247).liquid(new FluidBuilder())
                .components(Carbon, 4, Hydrogen, 9, Bromine, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        nButyllithium = new Material.Builder(236, Serendustry.ID("n_butyllithium"))
                .color(0x609247).liquid(new FluidBuilder())
                .components(Carbon, 4, Hydrogen, 9, Lithium, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        LithiumBromide = new Material.Builder(238, Serendustry.ID("lithium_bromide"))
                .dust().color(0xFFC2CA)
                .components(Lithium, 1, Bromine, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        LithiumDiisopropylamide = new Material.Builder(239, Serendustry.ID("lithium_diisopropylamide"))
                .dust().color(0xAAb2AA)
                .components(Lithium, 1, Nitrogen, 1, Carbon, 6, Hydrogen, 14)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        Dihydro14dithiine23bislithiumSelenolate = new Material.Builder(240, Serendustry.ID("dihydro_14_dithiine_23_bis_lithium_selenolate"))
                .color(0x6092AA).liquid(new FluidBuilder())
                .components(Carbon, 4, Hydrogen, 4, Sulfur, 2, Selenium, 2, Lithium, 2)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        Diisopropylamine = new Material.Builder(241, Serendustry.ID("diisopropylamine"))
                .color(0x506297).liquid(new FluidBuilder())
                .components(Carbon, 6, Hydrogen, 15, Nitrogen, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        PhosphorusTrichloride = new Material.Builder(242, Serendustry.ID("phosphorus_trichloride"))
                .color(0xAACC27).liquid(new FluidBuilder())
                .components(Phosphorus, 1, Chlorine, 3)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        TriethylPhosphite = new Material.Builder(243, Serendustry.ID("triethyl_phosphite"))
                .color(0xAAFF37).liquid(new FluidBuilder())
                .components(Phosphorus, 1, Oxygen, 3, Carbon, 6, Hydrogen, 15)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        Phosgene = new Material.Builder(244, Serendustry.ID("phosgene"))
                .color(0x77FF67).liquid(new FluidBuilder())
                .components(Carbon, 1, Oxygen, 1, Chlorine, 2)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        BETS = new Material.Builder(245, Serendustry.ID("bets"))
                .dust().color(0x77DD22)
                .components(Carbon, 10, Hydrogen, 8, Sulfur, 4, Selenium, 4)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        DiethylPhosphate = new Material.Builder(246, Serendustry.ID("diethyl_phosphate"))
                .color(0x36BB87).liquid(new FluidBuilder())
                .components(Carbon, 4, Hydrogen, 11, Oxygen, 3, Phosphorus, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        Formaldehyde = new Material.Builder(247, Serendustry.ID("formaldehyde"))
                .color(0x772277).liquid(new FluidBuilder())
                .components(Carbon, 1, Water, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        RheniumVIIOxide = new Material.Builder(248, Serendustry.ID("rhenium_vii_oxide"))
                .dust().color(0x3333FF)
                .components(Rhenium, 2, Oxygen, 7)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        AmmoniumPerrhenate = new Material.Builder(249, Serendustry.ID("ammonium_perrhenate"))
                .dust().color(0x2255CC)
                .components(Ammonia, 1, Rhenium, 1, Oxygen, 4)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        BETSPerrhenate = new Material.Builder(250, Serendustry.ID("bets_perrhenate"))
                .dust().color(0x1177FF).liquid(new FluidBuilder())
                .components(BETS, 1, Rhenium, 1, Oxygen, 4)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        ScUevSane = new Material.Builder(229, Serendustry.ID("sc_uev_sane"))
                .ingot().liquid(new FluidBuilder().temperature(16000))
                .color(0x00ffff).iconSet(BRIGHT)
                .flags(DECOMPOSITION_BY_ELECTROLYZING, GENERATE_FINE_WIRE)
                .components(Taranium, 1, Hihiirokane, 1, BETSPerrhenate, 1, Originium, 1, Bromine, 1)
                .cableProperties(V[UEV], 24, 0, true, 3)
                .blastTemp(10800, GasTier.HIGHEST, VA[UEV], 20 * 60)
                .build();

        Propylene = new Material.Builder(251, Serendustry.ID("propylene"))
                .color(0x4433BB).liquid(new FluidBuilder())
                .components(Carbon, 3, Hydrogen, 3, Nitrogen, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        Bromargyrite = new Material.Builder(252, Serendustry.ID("bromargyrite"))
                .dust(3).ore(1, 1)
                .color(0x82604F).iconSet(METALLIC)
                .components(Silver, 1, Bromine, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();

        oreProp = Bromargyrite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Silver, Silver, Silver, Bromargyrite);
        oreProp.setWashedIn(Mercury);

        Olsacherite = new Material.Builder(253, Serendustry.ID("olsacherite"))
                .dust(3).ore(1, 1)
                .color(0x4270EE).iconSet(METALLIC)
                .build()
                .setFormula("Pb2(SeO4)(SO4)", true);

        oreProp = Olsacherite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Lead, Sulfur, Crookesite, Olsacherite);
        oreProp.setWashedIn(Mercury);

        SeleniumLeadSludge = new Material.Builder(254, Serendustry.ID("selenium_lead_sludge"))
                .dust().color(0x34DD41)
                .build()
                .setFormula("??Se,Pb??");

        SelenousAcid = new Material.Builder(255, Serendustry.ID("selenous_acid"))
                .color(0x48FF62).liquid(new FluidBuilder())
                .components(Hydrogen, 2, Selenium, 1, Oxygen, 3)
                .flags(DISABLE_DECOMPOSITION)
                .build();

        Renierite = new Material.Builder(256, Serendustry.ID("renierite"))
                .dust(3).ore(1, 1)
                .color(0x42EE62).iconSet(METALLIC)
                .components(Copper, 11, Zinc, 11, Germanium, 2, Arsenic, 2, Iron, 4, Sulfur, 16)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("(Cu,Zn)11(Ge,As)2Fe4S16", true);

        oreProp = Renierite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Copper, Arsenic, Renierite, Renierite);
        oreProp.setWashedIn(Mercury);

        GermaniumDisulfide = new Material.Builder(257, Serendustry.ID("germanium_disulfide"))
                .dust().color(0x88DD31)
                .components(Germanium, 1, Sulfur, 2)
                .flags(DISABLE_DECOMPOSITION)
                .build();

        GermaniumDioxide = new Material.Builder(258, Serendustry.ID("germanium_dioxide"))
                .dust().color(0x44EE55)
                .components(Germanium, 1, Oxygen, 2)
                .flags(DISABLE_DECOMPOSITION)
                .build();

        Potassium40 = new Material.Builder(259, Serendustry.ID("potassium_40"))
                .dust().color(0xEEAA45)
                .components(Potassium, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("K-40", false);

        Quantium40 = new Material.Builder(260, Serendustry.ID("quantium_40"))
                .ingot(3).liquid(new FluidBuilder().temperature(7000))
                .color(0x00D100).iconSet(BRIGHT)
                .flags(STD_METAL, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_SPRING)
                .itemPipeProperties(32, 128f)
                .blastTemp(10800, GasTier.HIGHEST, VA[UEV], 800)
                .cableProperties(V[UEV], 4, 8)
                .build()
                .setFormula("Qt-40", false);

        NetherizedDiamond = new Material.Builder(261, Serendustry.ID("netherized_diamond"))
                .gem().liquid(new FluidBuilder().temperature(11000))
                .color(0x4C4143).iconSet(DIAMOND)
                .flags(STD_METAL, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, DISABLE_DECOMPOSITION)
                .toolStats(ToolProperty.Builder.of(15.0f, 8.0f, 2560, 4)
                        .attackSpeed(1f).enchantability(33).build())
                .components(Diamond, 1, Netherite, 1)
                .build()
                .setFormula("C(NrAu4)", true);

        HotHalkoniteSteel = new Material.Builder(262, Serendustry.ID("hot_halkonite_steel"))
                .color(0xffffff).iconSet(HOT_HALKONITE_STEEL)
                .flags(NO_UNIFICATION, NO_WORKING, NO_SMASHING, NO_SMELTING, GENERATE_PLATE, GENERATE_ROD, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR,
                        GENERATE_BOLT_SCREW, GENERATE_ROTOR, GENERATE_DENSE, GENERATE_RING, GENERATE_ROUND, GENERATE_FRAME)
                .build()
                .setFormula("Nt(Tr3Ds2(Al2Li2MgSc2Ti3)2(((FeW)CrMo2V)6Ir2Os))", true);

        Xenotime = new Material.Builder(263, Serendustry.ID("xenotime")) // todo: add xenoline
                .dust(3).ore(1, 1).fluid()
                .color(0x706040).iconSet(METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Yttrium, 1, Phosphate, 1)
                .build();

        oreProp = Xenotime.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Xenotime, Bastnasite, Monazite, Xenotime);
        oreProp.setWashedIn(Mercury);
        oreProp.setDirectSmeltResult(Yttrium);

        AbyssalAlloy = new Material.Builder(209, Serendustry.ID("abyssal_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(14500))
                .color(0xAD94A4).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FOIL, GENERATE_LONG_ROD, GENERATE_ROTOR, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_FRAME)
                .components(Naquadria, 3, Taranium, 1, TungstenCarbide, 1, NetherizedDiamond, 1, Germanium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 1600)
                .toolStats(ToolProperty.Builder.of(200.0f, 190.0f, 65535, 7)
                        .attackSpeed(1f).enchantability(33).build())
                .fluidPipeProperties(14000, 5500, true, true, true, true) // todo compare to nt
                .build()
                .setFormula("W2(C(NrAu4))2TnGe(SiC)???", true);

        Pinkium = new Material.Builder(264, Serendustry.ID("pinkium"))
                .ingot(3).liquid(new FluidBuilder().temperature(14500))
                .color(0xa9aee4).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(PostTransitionMetals, 1, Chrome, 1, Rhodium, 1, Europium, 1, Rutile, 1, Onionium, 1, ScUiv, 1, Jasper, 1, Shirabon, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[MAX], 1600)
                .build();

        DeepDarkIron = new Material.Builder(265, Serendustry.ID("deep_dark_iron")) // todo: add deep dark planetoid that has every ore in the game, including this one, and make this an endgame material
                .ore().ingot(3).liquid(new FluidBuilder().temperature(19000))
                .color(0x45374A).iconSet(METALLIC)
                .flags(STD_METAL)
                .blastTemp(10800, GasTier.HIGHEST, VA[MAX], 1600)
                .build();

        oreProp = DeepDarkIron.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(DeepDarkIron, DeepDarkIron, DeepDarkIron, DeepDarkIron);
        oreProp.setWashedIn(BlackStarMatter);
        oreProp.setDirectSmeltResult(Iron);

        BiologicalWaste = new Material.Builder(266, Serendustry.ID("biological_waste"))
                .color(0x114411).liquid(new FluidBuilder())
                .build();

        Glucose = new Material.Builder(267, Serendustry.ID("glucose"))
                .dust().color(0xEEEEBB)
                .build();

        PotatoDextroseBroth = new Material.Builder(268, Serendustry.ID("potato_dextrose_broth"))
                .color(0xAA7755).liquid(new FluidBuilder())
                .build();

        YeastRichMixture = new Material.Builder(269, Serendustry.ID("yeast_rich_mixture"))
                .color(0x22577).liquid(new FluidBuilder())
                .build();

        YeastExtract = new Material.Builder(270, Serendustry.ID("yeast_extract"))
                .dust().color(0x22577)
                .build();

        RawAdamantium = new Material.Builder(271, Serendustry.ID("raw_adamantium"))
                .color(0xc52f2f).liquid(new FluidBuilder())
                .components(Tritanium, 3, Darmstadtium, 2, ALMST, 2, HSSS, 1)
                .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .build();

        Adamantium = new Material.Builder(272, Serendustry.ID("adamantium"))
                .ingot(3).liquid(new FluidBuilder().temperature(10000))
                .color(0xc90000).iconSet(SHINY)
                .components(Tritanium, 3, Darmstadtium, 2, ALMST, 2, HSSS, 1)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_DENSE, GENERATE_FRAME)
                .blastTemp(10800, GasTier.HIGHEST, VA[UV], 1100)
                .build();

        Vibranium = new Material.Builder(274, Serendustry.ID("vibranium"))
                .ingot(3).liquid(new FluidBuilder().temperature(11000))
                .color(0x7f00c9).iconSet(DULL)
                .flags(STD_METAL)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 1100)
                .build()
                .setFormula("Vb");

        Vibranite = new Material.Builder(273, Serendustry.ID("vibranite")) // todo: vibranium line?
                .dust(3).ore(1, 1)
                .color(0x7033b9).iconSet(METALLIC)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Calcium, 2, Vibranium, 1, SodiumHydroxide, 3, Phosphate, 2)
                .build();

        oreProp = Vibranite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Vibranite, Vibranite, Vibranite, Vibranite);
        oreProp.setWashedIn(Mercury);
        oreProp.setDirectSmeltResult(Calcium);

        Azbantium = new Material.Builder(275, Serendustry.ID("azbantium"))
                .gem(3).ore(1, 1).liquid(new FluidBuilder().temperature(18000))
                .color(0x470d69).iconSet(DIAMOND)
                .flags(GENERATE_LONG_ROD)
                .build()
                .setFormula("Az");

        oreProp = Azbantium.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Azbantium, Azbantium, Azbantium, Azbantium);
        oreProp.setWashedIn(Diamond);

        OganessonTetratennesside = new Material.Builder(282, Serendustry.ID("oganesson_tetratennesside"))
                .ingot(3).liquid(new FluidBuilder().temperature(11500))
                .color(0x7c00ad).iconSet(METALLIC)
                .components(Oganesson, 1, Tennessine, 4)
                .flags(STD_METAL)
                .blastTemp(10800, GasTier.HIGHEST, VA[UV], 1500)
                .build();

        HalkonitePreparationBase = new Material.Builder(163, Serendustry.ID("halkonite_preparation_base"))
                .liquid(new FluidBuilder().temperature(8000))
                .color(0x11B95A).iconSet(BRIGHT)
                .components(OganessonTetratennesside, 2, Azbantium, 2, HSSS, 2, Carbon, 1, CondensedStarMatter, 1)
                .build();

        VibraniumAlloy = new Material.Builder(276, Serendustry.ID("vibranium_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(11500))
                .color(0xce79ff).iconSet(BRIGHT)
                .components(Vibranium, 4, Adamantium, 2, Duranium, 1, Azbantium, 1)
                .flags(GENERATE_PLATE, GENERATE_ROD, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR,
                        GENERATE_BOLT_SCREW, GENERATE_ROTOR, GENERATE_DENSE, GENERATE_RING)
                .blastTemp(10800, GasTier.HIGHEST, VA[UV], 1100)
                .fluidPipeProperties(10000, 4500, true, true, true, true) // todo: compare to Nt
                .build();

        DeepDarkSteel = new Material.Builder(277, Serendustry.ID("deep_dark_steel")) // todo: add recipe
                .ingot(3).liquid(new FluidBuilder().temperature(24000))
                .color(0x35273A).iconSet(DULL)
                .flags(STD_METAL)
                .blastTemp(10800, GasTier.HIGHEST, VA[MAX], 1900)
                .fluidPipeProperties(18000, 6000, true, true, true, true) // todo compare to nt
                .build();

        Manasteel = new Material.Builder(278, Serendustry.ID("manasteel"))
                .ingot(3).liquid(new FluidBuilder().temperature(1700))
                .color(0x3389FF).iconSet(BRIGHT)
                .flags(STD_METAL)
                .toolStats(ToolProperty.Builder.of(5.0f, 3.0f, 1536, 3)
                        .attackSpeed(1f).enchantability(33).build())
                .build();

        Terrasteel = new Material.Builder(279, Serendustry.ID("terrasteel"))
                .ingot(3).liquid(new FluidBuilder().temperature(2200))
                .color(0x5CFF12).iconSet(BRIGHT)
                .flags(STD_METAL)
                .toolStats(ToolProperty.Builder.of(15.0f, 8.0f, 3072, 4)
                        .attackSpeed(1f).enchantability(33).build())
                .blastTemp(4500, GasTier.MID, VA[EV], 900)
                .build();

        ElvenElementium = new Material.Builder(280, Serendustry.ID("elven_elementium"))
                .ingot(3).liquid(new FluidBuilder().temperature(1900))
                .color(0xE90081).iconSet(BRIGHT)
                .flags(STD_METAL)
                .toolStats(ToolProperty.Builder.of(18.0f, 7.0f, 1024, 3)
                        .attackSpeed(1f).enchantability(33).build())
                .blastTemp(4500, GasTier.MID, VA[EV], 600)
                .build();

        GaiaSpirit = new Material.Builder(281, Serendustry.ID("gaia_spirit"))
                .ingot(3).liquid(new FluidBuilder().temperature(2800))
                .color(0xFFFFFF).iconSet(BRIGHT) // todo: custom texture
                .flags(STD_METAL)
                .toolStats(ToolProperty.Builder.of(30.0f, 12.0f, 16384, 3)
                        .attackSpeed(1f).enchantability(33).build())
                .blastTemp(7200, GasTier.HIGH, VA[IV], 1000)
                .build();

        Crookesite = new Material.Builder(283, Serendustry.ID("crookesite"))
                .dust(3).ore(1, 1)
                .color(0x4FE35E).iconSet(METALLIC)
                .build()
                .setFormula("(Cu,Tl,Ag)2Se", true);

        oreProp = Crookesite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Copper, Silver, Crookesite, Olsacherite);
        oreProp.setWashedIn(Mercury);

        SeleniumThalliumSludge = new Material.Builder(284, Serendustry.ID("selenium_thallium_sludge"))
                .dust().color(0x3455AA)
                .build()
                .setFormula("??Se,Tl??");

        XenomagneticSeparationCatalyst = new Material.Builder(285, Serendustry.ID("xenomagnetic_separation_catalyst"))
                .dust(3).fluid()
                .color(0xfa3fff).iconSet(SHINY)
                .build();

        TengamResidue = new Material.Builder(286, Serendustry.ID("tengam_residue"))
                .dust(3)
                .color(0x1b960a).iconSet(MAGNETIC)
                .build()
                .setFormula("??M??");

        TengamSludge = new Material.Builder(287, Serendustry.ID("tengam_sludge"))
                .fluid()
                .color(0x439537)
                .build()
                .setFormula("??M??");

        AntimonyTengamide = new Material.Builder(288, Serendustry.ID("antimony_tengamide"))
                .dust(3)
                .color(0x5ceba7).iconSet(MAGNETIC)
                .build()
                .setFormula("SbM");

        PlutoniumHydride = new Material.Builder(289, Serendustry.ID("plutonium_hydride"))
                .dust(3)
                .color(0x823ec5).iconSet(METALLIC)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Plutonium241, 1, Hydrogen, 2)
                .build();

        Plutonium3Phosphide = new Material.Builder(290, Serendustry.ID("plutonium_3_phosphide"))
                .dust(3)
                .color(0xdf8933).iconSet(MAGNETIC)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Plutonium241, 1, Phosphorus, 1)
                .build();

        Phosphine = new Material.Builder(291, Serendustry.ID("phosphine"))
                .fluid()
                .color(0xdddf33)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Phosphorus, 1, Hydrogen, 3)
                .build();

        XenomagneticAttunementCatalyst = new Material.Builder(292, Serendustry.ID("xenomagnetic_attunement_catalyst"))
                .dust(3).fluid()
                .color(0xb33fff).iconSet(SHINY)
                .build();

        PotassiumHydroxide = new Material.Builder(293, Serendustry.ID("potassium_hydroxide"))
                .dust(3)
                .color(0xefff3f).iconSet(DULL)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Potassium, 1, Oxygen, 1, Hydrogen, 1)
                .build();

        SodiumHypophosphite = new Material.Builder(294, Serendustry.ID("sodium_hypophosphite"))
                .dust(3)
                .color(0x3fb2ff).iconSet(SHINY)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Sodium, 1, Hydrogen, 2, Phosphorus, 1, Oxygen, 2)
                .build();

        PotassiumHypophosphite = new Material.Builder(295, Serendustry.ID("potassium_hypophosphite"))
                .dust(3)
                .color(0x5dee47).iconSet(SHINY)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Potassium, 1, Hydrogen, 2, Phosphorus, 1, Oxygen, 2)
                .build();

        PotassiumChloride = new Material.Builder(296, Serendustry.ID("potassium_chloride"))
                .fluid()
                .color(0x40be16)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Potassium, 1, Chlorine, 1)
                .build();

        ExoHalkoniteSteel = new Material.Builder(297, Serendustry.ID("exo_halkonite_steel"))
                .color(0xFFFFFF).iconSet(EXO_HALKONITE_STEEL)
                .flags(NO_UNIFICATION, NO_WORKING, NO_SMASHING, NO_SMELTING, GENERATE_PLATE, GENERATE_ROD, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR,
                        GENERATE_BOLT_SCREW, GENERATE_ROTOR, GENERATE_DENSE, GENERATE_RING, GENERATE_ROUND, GENERATE_FRAME)
                .build()
                .setFormula("???", true);

        HotExoHalkoniteSteel = new Material.Builder(298, Serendustry.ID("hot_exo_halkonite_steel"))
                .color(0xffffff).iconSet(HOT_EXO_HALKONITE_STEEL)
                .flags(NO_UNIFICATION, NO_WORKING, NO_SMASHING, NO_SMELTING, GENERATE_PLATE, GENERATE_ROD, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR,
                        GENERATE_BOLT_SCREW, GENERATE_ROTOR, GENERATE_DENSE, GENERATE_RING, GENERATE_ROUND, GENERATE_FRAME)
                .build()
                .setFormula("???", true);
    }
}
