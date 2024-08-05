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

import net.minecraft.init.Enchantments;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.*;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
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


    public static void init() {
        // This should probably be a loop, but I never intended for it to get this big; it just kind of slowly grew over
        // time, and now it's too late for me to want to change it
        Rhenium.setProperty(PropertyKey.DUST, new DustProperty());
        Gadolinium.setProperty(PropertyKey.DUST, new DustProperty());
        Polonium.setProperty(PropertyKey.DUST, new DustProperty());
        Strontium.setProperty(PropertyKey.DUST, new DustProperty());
        Promethium.setProperty(PropertyKey.DUST, new DustProperty());
        Technetium.setProperty(PropertyKey.DUST, new DustProperty());
        Ytterbium.setProperty(PropertyKey.DUST, new DustProperty());
        Rubidium.setProperty(PropertyKey.DUST, new DustProperty());
        Tellurium.setProperty(PropertyKey.DUST, new DustProperty());
        Zirconium.setProperty(PropertyKey.DUST, new DustProperty());
        Germanium.setProperty(PropertyKey.DUST, new DustProperty());
        Scandium.setProperty(PropertyKey.DUST, new DustProperty());
        Protactinium.setProperty(PropertyKey.DUST, new DustProperty());
        Holmium.setProperty(PropertyKey.DUST, new DustProperty());
        Radium.setProperty(PropertyKey.DUST, new DustProperty());
        Francium.setProperty(PropertyKey.DUST, new DustProperty());
        Terbium.setProperty(PropertyKey.DUST, new DustProperty());
        Thulium.setProperty(PropertyKey.DUST, new DustProperty());
        Erbium.setProperty(PropertyKey.DUST, new DustProperty());
        Dysprosium.setProperty(PropertyKey.DUST, new DustProperty());
        Praseodymium.setProperty(PropertyKey.DUST, new DustProperty());
        Actinium.setProperty(PropertyKey.DUST, new DustProperty());
        Curium.setProperty(PropertyKey.DUST, new DustProperty());
        Berkelium.setProperty(PropertyKey.DUST, new DustProperty());
        Neptunium.setProperty(PropertyKey.DUST, new DustProperty());
        Californium.setProperty(PropertyKey.DUST, new DustProperty());
        Iodine.setProperty(PropertyKey.DUST, new DustProperty());
        Hafnium.setProperty(PropertyKey.DUST, new DustProperty());
        Thallium.setProperty(PropertyKey.DUST, new DustProperty());
        Selenium.setProperty(PropertyKey.DUST, new DustProperty());
        Astatine.setProperty(PropertyKey.DUST, new DustProperty());

        Einsteinium.setProperty(PropertyKey.DUST, new DustProperty());
        Fermium.setProperty(PropertyKey.DUST, new DustProperty());
        Mendelevium.setProperty(PropertyKey.DUST, new DustProperty());
        Nobelium.setProperty(PropertyKey.DUST, new DustProperty());
        Lawrencium.setProperty(PropertyKey.DUST, new DustProperty());
        Rutherfordium.setProperty(PropertyKey.DUST, new DustProperty());
        Dubnium.setProperty(PropertyKey.DUST, new DustProperty());
        Seaborgium.setProperty(PropertyKey.DUST, new DustProperty());
        Bohrium.setProperty(PropertyKey.DUST, new DustProperty());
        Hassium.setProperty(PropertyKey.DUST, new DustProperty());
        Meitnerium.setProperty(PropertyKey.DUST, new DustProperty());
        Roentgenium.setProperty(PropertyKey.DUST, new DustProperty());
        Copernicium.setProperty(PropertyKey.DUST, new DustProperty());
        Nihonium.setProperty(PropertyKey.DUST, new DustProperty());
        Flerovium.setProperty(PropertyKey.DUST, new DustProperty());
        Moscovium.setProperty(PropertyKey.DUST, new DustProperty());
        Livermorium.setProperty(PropertyKey.DUST, new DustProperty());
        Tennessine.setProperty(PropertyKey.DUST, new DustProperty());
        Oganesson.setProperty(PropertyKey.DUST, new DustProperty());

        Rhenium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Gadolinium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Polonium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Strontium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Promethium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Technetium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Ytterbium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Rubidium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Tellurium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Zirconium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Germanium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Scandium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Protactinium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Holmium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Radium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Francium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Terbium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Thulium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Erbium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Dysprosium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Praseodymium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Actinium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Curium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Berkelium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Neptunium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Californium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Iodine.setProperty(PropertyKey.INGOT, new IngotProperty());
        Hafnium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Thallium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Selenium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Astatine.setProperty(PropertyKey.INGOT, new IngotProperty());

        Einsteinium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Fermium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Mendelevium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Nobelium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Lawrencium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Rutherfordium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Dubnium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Seaborgium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Bohrium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Hassium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Meitnerium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Roentgenium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Copernicium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Nihonium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Flerovium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Moscovium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Livermorium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Tennessine.setProperty(PropertyKey.INGOT, new IngotProperty());
        Oganesson.setProperty(PropertyKey.INGOT, new IngotProperty());
        Lutetium.setProperty(PropertyKey.INGOT, new IngotProperty());

        Holmium.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
        Thulium.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
        Dysprosium.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
        Scandium.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
        Promethium.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
        Electrotine.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
        Cadmium.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
        Boron.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
        Barium.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
        Calcium.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
        Sodium.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
        Bromine.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
        Erbium.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));
        Moscovium.setProperty(PropertyKey.FLUID, new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));

        Water.getProperty(PropertyKey.FLUID).getStorage().enqueueRegistration(FluidStorageKeys.PLASMA,
                new FluidBuilder());
        Redstone.getProperty(PropertyKey.FLUID).getStorage().enqueueRegistration(FluidStorageKeys.PLASMA,
                new FluidBuilder());
        Glass.getProperty(PropertyKey.FLUID).getStorage().enqueueRegistration(FluidStorageKeys.PLASMA,
                new FluidBuilder());
        Lead.getProperty(PropertyKey.FLUID).getStorage().enqueueRegistration(FluidStorageKeys.PLASMA,
                new FluidBuilder());

        FluidProperty fp = new FluidProperty();
        fp.getStorage().enqueueRegistration(FluidStorageKeys.LIQUID, new FluidBuilder());
        fp.getStorage().enqueueRegistration(FluidStorageKeys.PLASMA, new FluidBuilder());
        Flerovium.setProperty(PropertyKey.FLUID, fp);

        fp = new FluidProperty();
        fp.getStorage().enqueueRegistration(FluidStorageKeys.LIQUID, new FluidBuilder());
        fp.getStorage().enqueueRegistration(FluidStorageKeys.PLASMA, new FluidBuilder());
        Phosphorus.setProperty(PropertyKey.FLUID, fp);

        fp = new FluidProperty();
        fp.getStorage().enqueueRegistration(FluidStorageKeys.LIQUID, new FluidBuilder());
        fp.getStorage().enqueueRegistration(FluidStorageKeys.PLASMA, new FluidBuilder());
        Protactinium.setProperty(PropertyKey.FLUID, fp);

        TinAlloy.addFlags(GENERATE_FINE_WIRE, GENERATE_FOIL);
        Oxygen.addFlags(GENERATE_FOIL, NO_SMASHING, NO_WORKING, NO_SMELTING);
        RutheniumTriniumAmericiumNeutronate.addFlags(GENERATE_FINE_WIRE);
        Europium.addFlags(GENERATE_SPRING_SMALL);
        PolyvinylChloride.addFlags(GENERATE_LENS);
        Neutronium.addFlags(GENERATE_SMALL_GEAR, GENERATE_DENSE, GENERATE_ROTOR, GENERATE_FINE_WIRE, GENERATE_FOIL);

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
                .setFormula("(Au4Ma)", true);

        FluxedElectrum = new Material.Builder(3, Serendustry.ID("fluxed_electrum"))
                .ingot(3).liquid(new FluidBuilder().temperature(8000))
                .color(0xFFE049).iconSet(SHINY)
                .flags(EXT2_METAL, DISABLE_DECOMPOSITION, GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW,
                        GENERATE_FINE_WIRE)
                .components(RoseGold, 1, SterlingSilver, 1, Electrum, 2, InfusedGold, 2, Naquadria, 4, SolderingAlloy,
                        10)
                .blastTemp(8000, GasTier.HIGHEST, VA[UV], 8000)
                .cableProperties(VA[UEV], 1, 1536, false, 3)
                .build();

        Amogus = new Material.Builder(4, Serendustry.ID("amogus"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x15703F).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(Americium, 1, Oganesson, 1, Uranium238, 1, Sulfur, 1)
                .blastTemp(7000, GasTier.HIGHEST, VA[UV], 5000)
                .build();

        HastelloyX78 = new Material.Builder(5, Serendustry.ID("hastelloyx_78"))
                .ingot(3).liquid(new FluidBuilder().temperature(7500))
                .color(0x5F90C9).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(NaquadahAlloy, 10, Rhenium, 5, Naquadria, 4, Polonium, 3, Rutherfordium, 2, Fermium, 1)
                .blastTemp(8500, GasTier.HIGHEST, VA[UV], 10000)
                .build();

        HastelloyK243 = new Material.Builder(6, Serendustry.ID("hastelloyk_243"))
                .ingot(3).liquid(new FluidBuilder().temperature(8500))
                .color(0x9FEC60).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FRAME, GENERATE_RING, GENERATE_FINE_WIRE,
                        GENERATE_LONG_ROD, GENERATE_BOLT_SCREW)
                .components(HastelloyX78, 5, Tritanium, 4, TungstenCarbide, 4, Promethium, 4, NiobiumNitride, 2,
                        Mendelevium, 1)
                .blastTemp(9000, GasTier.HIGHEST, VA[UHV], 12000)
                .toolStats(ToolProperty.Builder.of(160.0f, 110.0f, 65535, 7)
                        .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .build();

        Technetium22 = new Material.Builder(7, Serendustry.ID("technetium_22"))
                .ingot(3).liquid(new FluidBuilder().temperature(10000))
                .color(0xC6AA14).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Technetium, 22)
                .blast(
                        b -> {
                            return b.temp(9000, GasTier.HIGH)
                                    .blastStats(VA[ULV], 120000);

                        })
                .build()
                .setFormula("Tc-22", false);

        Zeron100 = new Material.Builder(8, Serendustry.ID("zeron_100")) // GCYM duplicates this
                .ingot(3).liquid(new FluidBuilder().temperature(5000))
                .color(0xA8A813).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Steel, 20, Chrome, 13, Copper, 10, Nickel, 3, Molybdenum, 2, Tungsten, 2)
                .blastTemp(3000, GasTier.HIGH, VA[IV], 1000)
                .build();

        Cinobite = new Material.Builder(9, Serendustry.ID("cinobite"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x010101).iconSet(SHINY)
                .flags(EXT2_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .components(Zeron100, 8, Titanium, 6, Naquadria, 4, Gadolinium, 3, Osmiridium, 1, Mercury, 1)
                .blastTemp(2500, GasTier.HIGHEST, VA[UV], 2000)
                .fluidPipeProperties(30000, 3500, true, true, true, true)
                .build();

        Inconel792 = new Material.Builder(10, Serendustry.ID("inconel_792"))
                .ingot(3).liquid(new FluidBuilder().temperature(4000))
                .color(0x66E370).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_BOLT_SCREW)
                .components(Nickel, 2, Aluminium, 2, Niobium, 1, Nichrome, 1)
                .blastTemp(1500, GasTier.MID, VA[EV], 800)
                .build();

        EglinSteel = new Material.Builder(11, Serendustry.ID("eglin_steel"))
                .ingot(3).liquid(new FluidBuilder().temperature(4500))
                .color(0x733910).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Invar, 5, Iron, 4, Kanthal, 1, Sulfur, 1, Silicon, 1, Carbon, 1)
                .blastTemp(1200, GasTier.MID, VA[EV], 800)
                .build();

        Platinium = new Material.Builder(12, Serendustry.ID("platinium"))
                .ingot(3).liquid(new FluidBuilder().temperature(3500))
                .color(0xDDEECD).iconSet(SHINY)
                .flags(STD_METAL)
                .components(Platinum, 3, Aluminium, 1)
                .blastTemp(1100, GasTier.MID, VA[EV], 600)
                .build();

        SiliconCarbide = new Material.Builder(13, Serendustry.ID("silicon_carbide"))
                .dust(0)
                .color(0x606060).iconSet(SHINY)
                .components(Silicon, 1, Carbon, 1)
                .build();

        Onionium = new Material.Builder(14, Serendustry.ID("onionium"))
                .ingot(3).liquid(new FluidBuilder().temperature(3000))
                .color(0xFE82A3).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Antimony, 2, Platinium, 2, Ytterbium, 1, Nichrome, 1, SiliconCarbide, 1)
                .blastTemp(3500, GasTier.HIGHER, VA[ZPM], 2000)
                .build();

        Pikyonium = new Material.Builder(15, Serendustry.ID("pikyonium"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x3160AE).iconSet(SHINY)
                .flags(EXT2_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_SMALL_GEAR, GENERATE_FINE_WIRE)
                .components(Inconel792, 8, EglinSteel, 5, NaquadahEnriched, 4, TungstenSteel, 4, Cerium, 3, Onionium, 7)
                .blastTemp(9000, GasTier.HIGHEST, VA[UV], 2000)
                .cableProperties(V[UHV], 2, 512)
                .build();

        HastelloyN = new Material.Builder(16, Serendustry.ID("hastelloyn"))
                .ingot(3).liquid(new FluidBuilder().temperature(3000))
                .color(0xB3B3B3).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Nickel, 15, Molybdenum, 4, Yttrium, 2, Chrome, 2, Titanium, 2)
                .blastTemp(1200, GasTier.MID, VA[EV], 600)
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
                .cableProperties(V[UEV], 2, 2048)
                .fluidPipeProperties(65000, 5000, true, true, true, true)
                .blastTemp(1800, GasTier.HIGHEST, VA[UHV], 900)
                .build();

        EnrichedNaquadahAlloy = new Material.Builder(19, Serendustry.ID("enriched_naquadah_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(8000))
                .color(0x3C3C3A).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_GEAR,
                        GENERATE_LONG_ROD)
                .components(NaquadahEnriched, 4, Rhodium, 2, Ruthenium, 2, Rubidium, 2, Dubnium, 1, Einsteinium, 1)
                .blastTemp(6000, GasTier.HIGHEST, VA[UV], 1800)
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
                .toolStats(ToolProperty.Builder.of(100.0f, 70.0f, 65535, 6)
                        .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .blastTemp(5000, GasTier.HIGHEST, VA[ZPM], 1200)
                .build();

        ScUev = new Material.Builder(25, Serendustry.ID("sc_uev"))
                .ingot().liquid(new FluidBuilder().temperature(26000))
                .color(0x9B46BA).iconSet(BRIGHT)
                .flags(DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(MagnetoResonatic, 3, Cinobite, 1, Pikyonium, 1, Aluminum, 1)
                .cableProperties(V[UEV], 24, 0, true, 3)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 2000)
                .build();

        TastyNeutronium = new Material.Builder(26, Serendustry.ID("tasty_neutronium"))
                .ingot().liquid(new FluidBuilder().temperature(50000))
                .color(0x3E1446).iconSet(BRIGHT)
                .components(Neutronium, 1)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_LONG_ROD,
                        GENERATE_ROTOR)
                .blastTemp(14000, GasTier.HIGHEST, VA[UHV], 8000)
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
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 3000)
                .build();

        Signalium = new Material.Builder(29, Serendustry.ID("signalium"))
                .ingot(3).liquid(new FluidBuilder().temperature(35000))
                .color(0xFF9300).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_LONG_ROD,
                        GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .components(Lumiium, 3, Aluminum, 2, FluxedElectrum, 1, Phosphate, 1)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 3500)
                .cableProperties(V[UIV], 2, 8192)
                .build();

        EnderiiumBase = new Material.Builder(30, Serendustry.ID("enderiium_base"))
                .ingot(3).liquid(new FluidBuilder().temperature(40000))
                .color(0x3B7A9F).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_ROTOR)
                .components(Signalium, 4, EnderPearl, 2, TastyNeutronium, 2, Phosphate, 1)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 3800)
                .build();

        Enderiiium = new Material.Builder(31, Serendustry.ID("enderiiium"))
                .ingot(3).liquid(new FluidBuilder().temperature(50000))
                .color(0x408587).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_LONG_ROD, GENERATE_RING, GENERATE_FRAME,
                        GENERATE_BOLT_SCREW)
                .components(EnderiiumBase, 4, InfusedGold, 1, Phosphate, 1)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 4200)
                .build();

        PulsatingIron = new Material.Builder(32, Serendustry.ID("pulsating_iron"))
                .ingot(3).liquid(new FluidBuilder().temperature(5000))
                .color(0x5ACE92).iconSet(BRIGHT)
                .flags(STD_METAL)
                .components(Iron, 1, EnderPearl, 1, Uraninite, 1)
                .blastTemp(6000, GasTier.HIGHER, VA[IV], 2500)
                .build();

        EnergeticAlloy = new Material.Builder(33, Serendustry.ID("energetic_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(5500))
                .color(0xFF8752).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(PulsatingIron, 4, Zeolite, 1, GarnetSand, 1, HSSS, 1, Mercury, 1)
                .blastTemp(6500, GasTier.HIGHER, VA[LuV], 2800)
                .build();

        VibrantAlloy = new Material.Builder(34, Serendustry.ID("vibrant_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(5850))
                .color(0x75FF66).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR)
                .components(EnergeticAlloy, 5, Zeolite, 1, BasalticMineralSand, 1, GraniticMineralSand, 1)
                .blastTemp(7000, GasTier.HIGHEST, VA[UV], 3000)
                .build();

        StellarAlloy = new Material.Builder(35, Serendustry.ID("stellar_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(12000))
                .color(0xFFFFFF).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_RING, GENERATE_ROUND, GENERATE_FINE_WIRE,
                        GENERATE_BOLT_SCREW)
                .components(VibrantAlloy, 8, TastyNeutronium, 2, Aluminum, 2, AluminiumSulfite, 1)
                .fluidPipeProperties(80000, 7500, true, true, true, true)
                .blastTemp(8000, GasTier.HIGHEST, VA[UHV], 4000)
                .toolStats(ToolProperty.Builder.of(200.0f, 120.0f, 65535, 8)
                        .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .build();

        ScUiv = new Material.Builder(36, Serendustry.ID("sc_uiv"))
                .ingot(3).liquid(new FluidBuilder().temperature(50000))
                .color(0xFF66A3).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(VibrantAlloy, 3, Naquadria, 2, FluxedElectrum, 2, EnderiiumBase, 2)
                .cableProperties(V[UIV], 24, 0, true)
                .blastTemp(8500, GasTier.HIGHEST, VA[UHV], 6000)
                .build();

        CrystalMatrix = new Material.Builder(37, Serendustry.ID("crystal_matrix"))
                .ingot(3).liquid(new FluidBuilder().temperature(45000))
                .color(0x8EFFE6).iconSet(NETHERSTAR)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_LONG_ROD,
                        GENERATE_FOIL, GENERATE_DOUBLE_PLATE)
                .components(Diamond, 1, NetherStar, 1)
                .blastTemp(8800, GasTier.HIGHEST, VA[UHV], 8000)
                .build();

        InfinityCatalyst = new Material.Builder(38, Serendustry.ID("infinity_catalyst"))
                .ingot(3).liquid(new FluidBuilder().temperature(75000))
                .color(0xFFFFFF).iconSet(NETHERSTAR)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_ROTOR, GENERATE_FRAME)
                .components(CrystalMatrix, 8, Neutronium, 8)
                .blastTemp(8800, GasTier.HIGHEST, VA[UEV], 8000)
                .build()
                .setFormula("If");

        Infinity = new Material.Builder(39, Serendustry.ID("infinity"))
                .ingot(3).liquid(new FluidBuilder().temperature(500000)).plasma()
                .color(0xFFFFFF).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .components(InfinityCatalyst, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 12000)
                .build()
                .setFormula("If*", true);

        Draconium = new Material.Builder(40, Serendustry.ID("draconium"))
                .ingot(3).liquid(new FluidBuilder().temperature(30000))
                .color(0x8E52E6).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_SMALL_GEAR)
                .components(TinAlloy, 8)
                .blastTemp(8800, GasTier.HIGHEST, VA[UEV], 7000)
                .build()
                .setFormula("Dc", true);

        ChargedDraconium = new Material.Builder(41, Serendustry.ID("charged_draconium"))
                .ingot(3).liquid(new FluidBuilder().temperature(35000))
                .color(0xCD52E6).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_ROUND,
                        GENERATE_BOLT_SCREW, GENERATE_FOIL)
                .components(Draconium, 1)
                .fluidPipeProperties(95000, 9000, true, true, true, true)
                .blastTemp(8850, GasTier.HIGHEST, VA[UEV], 7500)
                .build()
                .setFormula("Dc+", true);

        AwakenedDraconium = new Material.Builder(42, Serendustry.ID("awakened_draconium"))
                .ingot(3).liquid(new FluidBuilder().temperature(65000))
                .color(0xDD520C).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_RING,
                        GENERATE_BOLT_SCREW, GENERATE_DENSE)
                .components(Draconium, 1)
                .blastTemp(8950, GasTier.HIGHEST, VA[UIV], 8500)
                .toolStats(ToolProperty.Builder.of(240.0f, 160.0f, 65535, 9)
                        .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .build()
                .setFormula("Dc*", true);

        Bedrockium = new Material.Builder(43, Serendustry.ID("bedrockium"))
                .ingot(3).liquid(new FluidBuilder().temperature(45000))
                .color(0x262626).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_SPRING,
                        GENERATE_SPRING_SMALL)
                .components(SiliconDioxide, 384)
                .cableProperties(V[UXV], 2, 32768)
                .blastTemp(9000, GasTier.HIGHEST, VA[UIV], 6000)
                .build();

        ScUxv = new Material.Builder(44, Serendustry.ID("sc_uxv"))
                .ingot(3).liquid(new FluidBuilder().temperature(48000))
                .color(0xFF4F4F).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(ChargedDraconium, 4, StellarAlloy, 4, Luminessence, 3, InfinityCatalyst, 2)
                .cableProperties(V[UXV], 24, 0, true)
                .blastTemp(10000, GasTier.HIGHEST, VA[UIV], 7000)
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
                .blastTemp(10200, GasTier.HIGHER, VA[LuV], 7000)
                .build();

        AssemblyLine = new Material.Builder(47, Serendustry.ID("assembly_line"))
                .dust().liquid(new FluidBuilder().temperature(32768)).plasma()
                .color(0x6C6D7A).iconSet(DULL)
                .flags(EXT2_METAL, DISABLE_DECOMPOSITION)
                .components(Iron, 1)
                .toolStats(ToolProperty.Builder.of(80.0f, 15.0f, 6400, 5)
                        .attackSpeed(0.5f).enchantability(1).build())
                .rotorStats(9.5f, 4.0f, 4800)
                .build()
                .setFormula("Assembly Line");

        Quantum = new Material.Builder(48, Serendustry.ID("quantum"))
                .ingot(3).liquid(new FluidBuilder().temperature(48000))
                .color(0x353535).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_RING, GENERATE_BOLT_SCREW,
                        GENERATE_FRAME)
                .components(StellarAlloy, 15, ArceusAlloy2B, 10, Lafium, 10, Jasper, 5, Americium, 5, Pikyonium, 5,
                        Germanium, 5, SiliconCarbide, 5, AssemblyLine, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 8000)
                .toolStats(ToolProperty.Builder.of(220.0f, 125.0f, 65535, 9)
                        .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .build();

        Quantium = new Material.Builder(49, Serendustry.ID("quantium"))
                .ingot(3).liquid(new FluidBuilder().temperature(70000))
                .color(0x00D100).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_GEAR,
                        GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL)
                .components(Quantum, 1)
                .itemPipeProperties(16, 256f)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 9500)
                .cableProperties(V[OpV], 2, 131072)
                .build()
                .setFormula("Qt");

        CallistoIce = new Material.Builder(50, Serendustry.ID("callisto_ice"))
                .ingot(3).liquid(new FluidBuilder().temperature(1))
                .color(0x00D1FF).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_ROUND, GENERATE_RING, GENERATE_BOLT_SCREW)
                .components(Water, 1)
                .fluidPipeProperties(800000, 15000, true, true, true, true)
                .blastTemp(273, GasTier.HIGHEST, VA[UXV], 2000)
                .build()
                .setFormula("(SpH2O)", true);

        Ledox = new Material.Builder(51, Serendustry.ID("ledox"))
                .ingot(3).liquid(new FluidBuilder().temperature(50000))
                .color(0x1B2FE2).iconSet(DULL)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR, GENERATE_LONG_ROD)
                .components(Lead, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 7000)
                .build()
                .setFormula("(SpPb)", true);

        NaquadriaticTaranium = new Material.Builder(52, Serendustry.ID("naquadriatic_taranium"))
                .ingot(3).liquid(new FluidBuilder().temperature(55000))
                .color(0x000000).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Naquadria, 4, CoalTar, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 8000)
                .build();

        ScOpv = new Material.Builder(53, Serendustry.ID("sc_opv"))
                .ingot(3).liquid(new FluidBuilder().temperature(90000))
                .color(0x597C8C).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE)
                .components(Quantum, 5, AwakenedDraconium, 3, Ledox, 3, Enderiiium, 3, Infinity, 3,
                        NaquadriaticTaranium, 3, Amogus, 2)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 11000)
                .cableProperties(V[OpV], 24, 0, true)
                .build();

        MutatedLivingSolder = new Material.Builder(54, Serendustry.ID("mutated_living_solder"))
                .ingot(3).liquid(new FluidBuilder().temperature(25000))
                .color(0x785B7E).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(SolderingAlloy, 1)
                .blastTemp(6000, GasTier.HIGHEST, VA[UV], 5000)
                .build()
                .setFormula("?");

        Thaumium = new Material.Builder(55, Serendustry.ID("thaumium"))
                .ingot(3).liquid(new FluidBuilder().temperature(25000))
                .color(0x802BA8).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(SolderingAlloy, 1)
                .build()
                .setFormula("FeMa");

        GalliumYttrium = new Material.Builder(56, Serendustry.ID("gallium_yttrium"))
                .ingot(3).liquid(new FluidBuilder().temperature(12000))
                .color(0x6D0054).iconSet(DULL)
                .flags(STD_METAL, GENERATE_RING)
                .components(Gallium, 1, Yttrium, 1)
                .blastTemp(3000, GasTier.MID, VA[HV], 1000)
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
                .setFormula("(Cu40Ni22Fe1Mn1)", true);

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
                .fluidPipeProperties(8000, 5000, true, true, true, false)
                .build();

        // Todo: stop GCYM from autogenerating a recipe for this that's very cheap
        Floppa = new Material.Builder(67, Serendustry.ID("floppa"))
                .ingot(3).liquid(new FluidBuilder().temperature(800000))
                .color(0x9E5625).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_DENSE, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR,
                        GENERATE_FOIL)
                .components(Flerovium, 1, Oxygen, 1, Phosphorus, 1, Protactinium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[OpV], 50000)
                .cableProperties(V[MAX], 24, 0, true)
                .build();

        KerrBlackHole = new Material.Builder(68, Serendustry.ID("kerr_black_hole"))
                .ingot(3).liquid(new FluidBuilder().temperature(1))
                .color(0x000000).iconSet(MAGNETIC)
                .flags(STD_METAL, GENERATE_LONG_ROD)
                .blastTemp(10800, GasTier.HIGHEST, VA[UIV], 10000)
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
                .ingot(3).liquid(new FluidBuilder().temperature(35000))
                .color(0xFFFFFF).iconSet(GLASS) // TODO: Give it animated rainbow colors
                .flags(STD_METAL, GENERATE_FOIL)
                .blastTemp(10800, GasTier.HIGHEST, VA[UV], 6000)
                .build();

        Shirabon = new Material.Builder(75, Serendustry.ID("shirabon"))
                .ingot(3).liquid(new FluidBuilder().temperature(600000)).plasma()
                .color(0xE0156D).iconSet(BRIGHT)
                .flags(STD_METAL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_ROTOR, GENERATE_ROUND,
                        GENERATE_BOLT_SCREW, GENERATE_GEAR, GENERATE_FRAME, GENERATE_FOIL, GENERATE_LONG_ROD)
                .blastTemp(10800, GasTier.HIGHEST, VA[OpV], 30000)
                .fluidPipeProperties(3200000, 40000, true, true, true, true)
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
                .blastTemp(6000, GasTier.HIGHER, VA[LuV], 2000)
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
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        Alkalis = new Material.Builder(82, Serendustry.ID("alkalis"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x75CE6D).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialAlkalis, 1, Beryllium, 1, Magnesium, 1, Calcium, 1, Strontium, 1, Barium, 1, Radium,
                        1, Scandium, 1, Yttrium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        RefractoryMetals = new Material.Builder(83, Serendustry.ID("refractory_metals"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x4141CC).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Zirconium, 1, Hafnium, 1, Niobium, 1, Tantalum, 1, Molybdenum, 1, Tungsten, 1, Technetium,
                        1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        LightTransitionMetals = new Material.Builder(84, Serendustry.ID("light_transition_metals"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xCC9A3D).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Titanium, 1, Vanadium, 1, Manganese, 1, Chrome, 1, Iron, 1, Nickel, 1, Cobalt, 1, Copper, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        PreciousMetals = new Material.Builder(85, Serendustry.ID("precious_metals"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xCAC9CC).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Ruthenium, 1, Rhodium, 1, Palladium, 1, Silver, 1, Rhenium, 1, Osmium, 1, Iridium, 1,
                        Platinum, 1, Gold, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        PartialPostTransitionMetals = new Material.Builder(86, Serendustry.ID("partial_post_transition_metals"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xBB6E1A).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Mercury, 1, Tin, 1, Gallium, 1, Indium, 1, Bismuth, 1, Polonium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        PostTransitionMetals = new Material.Builder(87, Serendustry.ID("post_transition_metals"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xCC8F9F).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialPostTransitionMetals, 1, Zinc, 1, Cadmium, 1, Aluminum, 1, Silicon, 1, Germanium, 1,
                        Antimony, 1, Thallium, 1, Lead, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        PartialLanthanoids = new Material.Builder(88, Serendustry.ID("partial_lanthanoids"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x2A82E4).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Dysprosium, 1, Lanthanum, 1, Cerium, 1, Praseodymium, 1, Neodymium, 1, Europium, 1,
                        Ytterbium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        Lanthanoids = new Material.Builder(89, Serendustry.ID("lanthanoids"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x5DCCA3).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialLanthanoids, 1, Samarium, 1, Gadolinium, 1, Terbium, 1, Thulium, 1, Holmium, 1,
                        Lutetium, 1, Promethium, 1, Erbium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        PartialActinoids = new Material.Builder(90, Serendustry.ID("partial_actinoids"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x02B3F2).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Californium, 1, Neptunium, 1, Plutonium241, 1, Mendelevium, 1, Einsteinium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        Actinoids = new Material.Builder(91, Serendustry.ID("actinoids"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xC9CC7A).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialActinoids, 1, Actinium, 1, Thorium, 1, Protactinium, 1, Uranium235, 1, Americium, 1,
                        Curium, 1, Berkelium, 1, Fermium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        Gases = new Material.Builder(92, Serendustry.ID("gases"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x25CBA8).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Oxygen, 1, Nitrogen, 1, Hydrogen, 1, Fluorine, 1, Chlorine, 1, Bromine, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        NonMetals = new Material.Builder(93, Serendustry.ID("non_metals"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xCC2AB9).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Boron, 1, Carbon, 1, Phosphorus, 1, Sulfur, 1, Arsenic, 1, Selenium, 1, Tellurium, 1,
                        Iodine, 1, Astatine, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        PartialNobleGases = new Material.Builder(94, Serendustry.ID("partial_noble_gases"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xBB420F).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Helium, 1, Neon, 1, Argon, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        NobleGases = new Material.Builder(95, Serendustry.ID("noble_gases"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0x70CC2E).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialNobleGases, 1, Krypton, 1, Xenon, 1, Radon, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        PartialSuperheavies = new Material.Builder(96, Serendustry.ID("partial_superheavies"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xCC0A00).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Nobelium, 1, Lawrencium, 1, Rutherfordium, 1, Dubnium, 1, Seaborgium, 1, Bohrium, 1,
                        Hassium, 1, Meitnerium, 1, Darmstadtium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        Superheavies = new Material.Builder(97, Serendustry.ID("superheavies"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xCC0A00).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialSuperheavies, 1, Roentgenium, 1, Copernicium, 1, Nihonium, 1, Flerovium, 1,
                        Moscovium, 1, Livermorium, 1, Tennessine, 1, Oganesson, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        Periodicium = new Material.Builder(98, Serendustry.ID("periodicium"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000)).plasma()
                .color(0x1111FF).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Alkalis, 1, RefractoryMetals, 1, LightTransitionMetals, 1, PreciousMetals, 1,
                        PostTransitionMetals, 1, Lanthanoids, 1, Actinoids, 1, Superheavies, 1, Gases, 1, NonMetals, 1,
                        NobleGases, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build();

        MultiversalAlloy = new Material.Builder(99, Serendustry.ID("multiversal_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(130000))
                .color(0xE04A2C).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FRAME)
                .components(Infinity, 5, Shirabon, 3, ScOpv, 2, StellarAlloy, 2, ScUxv, 1, Quantum, 1, Actinoids, 1,
                        Lanthanoids, 1, Periodicium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[OpV], 16000)
                .build();

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

        OreProperty oreProp = TengamRaw.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(IronMagnetic, SteelMagnetic, NeodymiumMagnetic, SamariumMagnetic);
        oreProp.setWashedIn(Steel);
        oreProp.setDirectSmeltResult(NeodymiumMagnetic);

        TengamPurified = new Material.Builder(105, Serendustry.ID("tengam_purified"))
                .ingot(3).liquid(new FluidBuilder().temperature(5000))
                .color(0xD5FF80).iconSet(SHINY)
                .flags(STD_METAL)
                .blastTemp(10800, GasTier.HIGHEST, VA[UV], 5000)
                .build()
                .setFormula("M");

        TengamAttuned = new Material.Builder(106, Serendustry.ID("tengam_attuned"))
                .ingot(3)
                .color(0xD5FF80).iconSet(MAGNETIC)
                .flags(STD_METAL, GENERATE_LONG_ROD, IS_MAGNETIC)
                .components(TengamPurified, 1)
                .ingotSmeltInto(TengamPurified)
                .arcSmeltInto(TengamPurified)
                .macerateInto(TengamPurified)
                .build();
        TengamPurified.getProperty(PropertyKey.INGOT).setMagneticMaterial(TengamAttuned);

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
                .fluid().build().setFormula("??????O4");

        AlkalineOxalateMixture = new Material.Builder(115, Serendustry.ID("alkaline_oxalate_mixture"))
                .fluid().build().setFormula("?????O4");

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
                .fluid().color(0xbb9898).build().setFormula("SiO2");

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
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FRAME, GENERATE_RING, GENERATE_FINE_WIRE,
                        GENERATE_LONG_ROD, GENERATE_BOLT_SCREW)
                .components(Rhodium, 1, Palladium, 1, Ruthenium, 1)
                .blastTemp(3500, GasTier.MID, VA[IV])
                .toolStats(ToolProperty.Builder.of(50.0f, 10.0f, 3600, 4)
                        .attackSpeed(0.5f).enchantability(29).build())
                .rotorStats(7.5f, 3.0f, 2500)
                .build();

        CheeseCheddar = new Material.Builder(127, Serendustry.ID("cheese_cheddar"))
                .fluid().ingot(0).ore(2, 1)
                .color(0xfffb00).iconSet(DULL)
                .flags(EXT2_METAL, GENERATE_FINE_WIRE)
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
                .blastTemp(19800, GasTier.HIGHEST, VA[UHV], 10000)
                .build()
                .setFormula("Nt*");

        AmmoniumNitrate = new Material.Builder(129, Serendustry.ID("ammonium_nitrate"))
                .dust().color(0xa147c3).iconSet(DULL)
                .components(Ammonia, 1, Hydrogen, 1, Nitrogen, 1, Oxygen, 3)
                .build()
                .setFormula("(NH4NO3)");

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
                .setFormula("(Ca5(PO4)3(F,Cl,OH))S?");

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
                .ingot(3).liquid(new FluidBuilder().temperature(35000))
                .color(0x00ffd8).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_FRAME, GENERATE_RING, GENERATE_ROUND, GENERATE_GEAR, GENERATE_SMALL_GEAR)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 1600)
                .toolStats(ToolProperty.Builder.of(120.0f, 140.0f, 10000, 7)
                        .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .build();

        LigniteCoal = new Material.Builder(144, Serendustry.ID("lignite_coal"))
                .gem(1, 1200)
                .ore(2, 1)
                .color(0x452200).iconSet(LIGNITE)
                .flags(
                        FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        DISABLE_DECOMPOSITION)
                .toolStats(ToolProperty.Builder.of(0.0F, 0.5F, 48, 1)
                        .enchantability(2).ignoreCraftingTools()
                        .enchantment(Enchantments.FIRE_ASPECT, 1).build())
                .components(Carbon, 1)
                .build();

        AnthraciteCoal = new Material.Builder(145, Serendustry.ID("anthracite_coal"))
                .gem(1, 1200)
                .ore(2, 1)
                .color(0x535f77).iconSet(LIGNITE)
                .flags(
                        FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        DISABLE_DECOMPOSITION)
                .toolStats(ToolProperty.Builder.of(0.0F, 0.5F, 48, 1)
                        .enchantability(2).ignoreCraftingTools()
                        .enchantment(Enchantments.FIRE_ASPECT, 1).build())
                .components(Carbon, 1)
                .build();

        BituminousCoal = new Material.Builder(146, Serendustry.ID("bituminous_coal"))
                .gem(1, 1200)
                .ore(2, 1)
                .color(0x451C90).iconSet(LIGNITE)
                .flags(
                        FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        DISABLE_DECOMPOSITION)
                .toolStats(ToolProperty.Builder.of(0.0F, 0.5F, 48, 1)
                        .enchantability(2).ignoreCraftingTools()
                        .enchantment(Enchantments.FIRE_ASPECT, 1).build())
                .components(Carbon, 1)
                .build();

        SubBituminousCoal = new Material.Builder(147, Serendustry.ID("sub_bituminous_coal"))
                .gem(1, 1200)
                .ore(2, 1)
                .color(0x451C3F).iconSet(LIGNITE)
                .flags(
                        FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        DISABLE_DECOMPOSITION)
                .toolStats(ToolProperty.Builder.of(0.0F, 0.5F, 48, 1)
                        .enchantability(2).ignoreCraftingTools()
                        .enchantment(Enchantments.FIRE_ASPECT, 1).build())
                .components(Carbon, 1)
                .build();

        PeatCoal = new Material.Builder(148, Serendustry.ID("peat_coal"))
                .gem(1, 1200)
                .ore(2, 1)
                .color(0x454800).iconSet(LIGNITE)
                .flags(
                        FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        DISABLE_DECOMPOSITION)
                .toolStats(ToolProperty.Builder.of(0.0F, 0.5F, 48, 1)
                        .enchantability(2).ignoreCraftingTools()
                        .enchantment(Enchantments.FIRE_ASPECT, 1).build())
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
                .flags(EXT2_METAL, GENERATE_FINE_WIRE)
                .toolStats(ToolProperty.Builder.of(5.0f, 1.0f, 360, 2)
                        .attackSpeed(0.5f).enchantability(666).build())
                .rotorStats(1.0f, 500.0f, 250)
                .build()
                .setFormula("Ch");

        CheeseSwiss = new Material.Builder(150, Serendustry.ID("cheese_swiss"))
                .fluid().ingot(0).ore(2, 1)
                .color(0xffff9f).iconSet(DULL)
                .flags(EXT2_METAL, GENERATE_FINE_WIRE)
                .toolStats(ToolProperty.Builder.of(5.0f, 1.0f, 360, 2)
                        .attackSpeed(0.5f).enchantability(666).build())
                .rotorStats(1.0f, 500.0f, 250)
                .build()
                .setFormula("Ch");

        CheeseMozzarella = new Material.Builder(151, Serendustry.ID("cheese_mozzarella"))
                .fluid().ingot(0).ore(2, 1)
                .color(0xffffda).iconSet(DULL)
                .flags(EXT2_METAL, GENERATE_FINE_WIRE)
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
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 1600)
                .toolStats(ToolProperty.Builder.of(60.0f, 70.0f, 5000, 6)
                        .attackSpeed(0.4f).enchantability(30).build())
                .build();

        Hihiirokane = new Material.Builder(154, Serendustry.ID("hihiirokane"))
                .ingot(3).liquid(new FluidBuilder().temperature(6000))
                .color(0xFE5330).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_LONG_ROD)
                .components(RoseGold, 3, Promethium, 2, Naquadria, 2, Thulium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 1600)
                .cableProperties(V[UHV], 4, 8, false, 3)
                .build();

        HalkoniteSteel = new Material.Builder(155, Serendustry.ID("halkonite_steel"))
                .color(0x4BCD83).iconSet(BRIGHT)
                .flags(STD_METAL, NO_WORKING, NO_SMASHING, NO_SMELTING, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_BOLT_SCREW, GENERATE_ROTOR, GENERATE_DENSE)
                .build()
                .setFormula("Nt(Tr3Ds2(Al2Li2MgSc2Ti3)2(((FeW)CrMo2V)6Ir2Os))");

        HAMAlloy = new Material.Builder(156, Serendustry.ID("ham_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(10000))
                .color(0xCA8BEC).iconSet(DULL)
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
                .blastTemp(5000, GasTier.HIGH, VA[EV], 1500)
                .build(); // todo: change LuV-UV recipes to use this

        SuperheavySolderingAlloy = new Material.Builder(159, Serendustry.ID("superheavy_soldering_alloy"))
                .ingot(3).liquid(new FluidBuilder().temperature(1500))
                .color(0xE4FF27).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Flerovium, 4, HighGradeSolderingAlloy, 3, Darmstadtium, 1)
                .blastTemp(9000, GasTier.HIGHEST, VA[UV], 1300)
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
                .flags(STD_METAL)
                .components(Aluminium, 2, Lithium, 2, Magnesium, 1, Scandium, 2, Titanium, 3)
                .blastTemp(6000, GasTier.HIGH, VA[IV], 900)
                .build();

        HalkonitePreparationBase = new Material.Builder(163, Serendustry.ID("halkonite_preparation_base"))
                .liquid(new FluidBuilder().temperature(8000))
                .color(0x11B95A).iconSet(BRIGHT)
                .components(Tritanium, 3, Darmstadtium, 2, ALMST, 2, HSSS, 1)
                .build();

        Iron2Chloride = new Material.Builder(164, Serendustry.ID("iron_2_chloride"))
                .color(0x606D70).liquid(new FluidBuilder())
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
                .setFormula("C12H26");

        Cyclopentadiene = new Material.Builder(171, Serendustry.ID("cyclopentadiene"))
                .color(0xEFC76F).liquid(new FluidBuilder())
                .build()
                .setFormula("C5H6");

        ButeneMixture = new Material.Builder(172, Serendustry.ID("butene_mixture"))
                .color(0x62512A).liquid(new FluidBuilder())
                .build()
                .setFormula("C4H8");

        Butene1 = new Material.Builder(174, Serendustry.ID("butene_1"))
                .color(0xA58640).liquid(new FluidBuilder())
                .build()
                .setFormula("C4H8");

        Butene2 = new Material.Builder(175, Serendustry.ID("butene_2"))
                .color(0x3D321B).liquid(new FluidBuilder())
                .build()
                .setFormula("C4H8");

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

        Arcanite = new Material.Builder(183, Serendustry.ID("arcanite"))
                .ingot().fluid()
                .color(0x7B825B).iconSet(DULL)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, NO_WORKING, GENERATE_ROUND)
                .components(Thorium, 4, EnergyCrystal, 4, OrdoCrystal, 1, PerditioCrystal, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UEV], 8000)
                .build().setFormula("Th4(⬟⬢⬣)4????");

        ChromiumDopedMolybdenite = new Material.Builder(184, Serendustry.ID("chromium_doped_molybdenite"))
                .dust().color(0x9C5fB5)
                .components(Chrome, 1, Molybdenite, 1)
                .build();
    }
}
