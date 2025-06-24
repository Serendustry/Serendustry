package serendustry.recipe;

import static gregtech.api.GTValues.IV;
import static gregtech.api.GTValues.LuV;
import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.FUSION_RECIPES;
import static gregtech.api.unification.material.Materials.Actinium;
import static gregtech.api.unification.material.Materials.Aluminium;
import static gregtech.api.unification.material.Materials.Americium;
import static gregtech.api.unification.material.Materials.Astatine;
import static gregtech.api.unification.material.Materials.Barium;
import static gregtech.api.unification.material.Materials.Berkelium;
import static gregtech.api.unification.material.Materials.Beryllium;
import static gregtech.api.unification.material.Materials.Bohrium;
import static gregtech.api.unification.material.Materials.Bromine;
import static gregtech.api.unification.material.Materials.Cadmium;
import static gregtech.api.unification.material.Materials.Calcium;
import static gregtech.api.unification.material.Materials.Californium;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.Cobalt;
import static gregtech.api.unification.material.Materials.Copernicium;
import static gregtech.api.unification.material.Materials.Copper;
import static gregtech.api.unification.material.Materials.Curium;
import static gregtech.api.unification.material.Materials.Dubnium;
import static gregtech.api.unification.material.Materials.Dysprosium;
import static gregtech.api.unification.material.Materials.Einsteinium;
import static gregtech.api.unification.material.Materials.Europium;
import static gregtech.api.unification.material.Materials.Fermium;
import static gregtech.api.unification.material.Materials.Flerovium;
import static gregtech.api.unification.material.Materials.Francium;
import static gregtech.api.unification.material.Materials.Gadolinium;
import static gregtech.api.unification.material.Materials.Gallium;
import static gregtech.api.unification.material.Materials.Germanium;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.Hassium;
import static gregtech.api.unification.material.Materials.Indium;
import static gregtech.api.unification.material.Materials.Iodine;
import static gregtech.api.unification.material.Materials.Iron;
import static gregtech.api.unification.material.Materials.Lawrencium;
import static gregtech.api.unification.material.Materials.Lithium;
import static gregtech.api.unification.material.Materials.Livermorium;
import static gregtech.api.unification.material.Materials.Magnesium;
import static gregtech.api.unification.material.Materials.Meitnerium;
import static gregtech.api.unification.material.Materials.Mendelevium;
import static gregtech.api.unification.material.Materials.Moscovium;
import static gregtech.api.unification.material.Materials.Neodymium;
import static gregtech.api.unification.material.Materials.Neptunium;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Nihonium;
import static gregtech.api.unification.material.Materials.Niobium;
import static gregtech.api.unification.material.Materials.Nitrogen;
import static gregtech.api.unification.material.Materials.Nobelium;
import static gregtech.api.unification.material.Materials.Oganesson;
import static gregtech.api.unification.material.Materials.Osmium;
import static gregtech.api.unification.material.Materials.Palladium;
import static gregtech.api.unification.material.Materials.Platinum;
import static gregtech.api.unification.material.Materials.Polonium;
import static gregtech.api.unification.material.Materials.Promethium;
import static gregtech.api.unification.material.Materials.Radium;
import static gregtech.api.unification.material.Materials.Rhodium;
import static gregtech.api.unification.material.Materials.Roentgenium;
import static gregtech.api.unification.material.Materials.Rubidium;
import static gregtech.api.unification.material.Materials.Ruthenium;
import static gregtech.api.unification.material.Materials.Rutherfordium;
import static gregtech.api.unification.material.Materials.Samarium;
import static gregtech.api.unification.material.Materials.Seaborgium;
import static gregtech.api.unification.material.Materials.Selenium;
import static gregtech.api.unification.material.Materials.Silicon;
import static gregtech.api.unification.material.Materials.Silver;
import static gregtech.api.unification.material.Materials.Strontium;
import static gregtech.api.unification.material.Materials.Technetium;
import static gregtech.api.unification.material.Materials.Tellurium;
import static gregtech.api.unification.material.Materials.Tennessine;
import static gregtech.api.unification.material.Materials.Thallium;
import static gregtech.api.unification.material.Materials.Tin;
import static gregtech.api.unification.material.Materials.TinAlloy;
import static gregtech.api.unification.material.Materials.Titanium;
import static gregtech.api.unification.material.Materials.Tungsten;
import static gregtech.api.unification.material.Materials.Uranium238;
import static gregtech.api.unification.material.Materials.Vanadium;
import static gregtech.api.unification.material.Materials.Water;
import static gregtech.api.unification.material.Materials.Yttrium;
import static gregtech.api.unification.material.Materials.Zinc;
import static gregtech.api.unification.material.Materials.Zirconium;
import static gregtech.api.unification.ore.OrePrefix.cableGtDouble;
import static gregtech.api.unification.ore.OrePrefix.gear;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.api.unification.ore.OrePrefix.screw;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.api.unification.ore.OrePrefix.wireGtDouble;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UEV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UIV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UEV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UIV;
import static gregtech.common.metatileentities.MetaTileEntities.FUSION_REACTOR;
import static serendustry.item.SerendustryMetaItems.CHIP_OPIC;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_END;
import static serendustry.item.material.SerendustryMaterials.AbyssalAlloy;
import static serendustry.item.material.SerendustryMaterials.Adamantium;
import static serendustry.item.material.SerendustryMaterials.Aluminum;
import static serendustry.item.material.SerendustryMaterials.AwakenedDraconium;
import static serendustry.item.material.SerendustryMaterials.DeepDarkIron;
import static serendustry.item.material.SerendustryMaterials.DeepDarkSteel;
import static serendustry.item.material.SerendustryMaterials.Dragonblood;
import static serendustry.item.material.SerendustryMaterials.ExoHalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.HalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.Hihiirokane;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.InfinityCatalyst;
import static serendustry.item.material.SerendustryMaterials.InfusedGold;
import static serendustry.item.material.SerendustryMaterials.Platinium;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.Rhugnor;
import static serendustry.item.material.SerendustryMaterials.ScUevSane;
import static serendustry.item.material.SerendustryMaterials.SelfRepairingNanobots;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.item.material.SerendustryMaterials.TastyNeutronium;
import static serendustry.item.material.SerendustryMaterials.Technetium22;
import static serendustry.item.material.SerendustryMaterials.Thaumium;
import static serendustry.machine.SerendustryMetaTileEntities.ADVANCED_FUSION_REACTOR;
import static serendustry.machine.SerendustryMetaTileEntities.MEGA_FUSION_REACTOR;

import gregtech.api.GTValues;
import serendustry.blocks.SBlockActiveMultiCasing;
import serendustry.blocks.SerendustryMetaBlocks;

public class LargeAlloySmelterRecipes {

    public static void init() {
        // Todo: remove and replace ALL fusion recipes
        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Beryllium.getFluid(16)).fluidInputs(Lithium.getFluid(16))
                .fluidOutputs(Nitrogen.getPlasma(100))
                .duration(40).EUt(VA[IV]).EUToStart(60_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Dysprosium.getFluid(16)).fluidInputs(Indium.getFluid(16))
                .fluidOutputs(Moscovium.getFluid(16))
                .duration(16).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Osmium.getFluid(16)).fluidInputs(Niobium.getFluid(16))
                .fluidOutputs(Tennessine.getFluid(16))
                .duration(16).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Selenium.getFluid(16)).fluidInputs(Lithium.getFluid(16))
                .fluidOutputs(Rubidium.getFluid(16))
                .duration(16).EUt(VA[LuV]).EUToStart(200_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Thallium.getFluid(16)).fluidInputs(Rubidium.getFluid(16))
                .fluidOutputs(Oganesson.getFluid(16))
                .duration(64).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Gold.getFluid(128)).fluidInputs(Thaumium.getFluid(128))
                .fluidOutputs(InfusedGold.getFluid(64))
                .duration(50).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(128)).fluidInputs(TinAlloy.getFluid(64))
                .fluidOutputs(Water.getPlasma(64))
                .duration(100).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Aluminium.getFluid(512)).fluidInputs(Americium.getFluid(196))
                .fluidOutputs(Aluminum.getFluid(64))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Aluminum.getFluid(16)).fluidInputs(Europium.getFluid(16))
                .fluidOutputs(Aluminium.getFluid(1024))
                .duration(50).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Platinum.getFluid(144)).fluidInputs(Europium.getFluid(4))
                .fluidOutputs(Platinium.getFluid(144))
                .duration(50).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Platinium.getFluid(144)).fluidInputs(Americium.getFluid(4))
                .fluidOutputs(Platinum.getFluid(144))
                .duration(50).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Uranium238.getFluid(128)).fluidInputs(Neutronium.getFluid(64))
                .fluidOutputs(TastyNeutronium.getFluid(32))
                .duration(260).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(InfinityCatalyst.getFluid(2560)).fluidInputs(TastyNeutronium.getFluid(2560))
                .fluidOutputs(Infinity.getFluid(4))
                .duration(80000).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Vanadium.getFluid(144)).fluidInputs(Carbon.getFluid(144))
                .fluidOutputs(Copper.getPlasma(144))
                .duration(64).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Titanium.getFluid(144)).fluidInputs(Germanium.getFluid(144))
                .fluidOutputs(Polonium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Zinc.getFluid(144)).fluidInputs(Aluminium.getFluid(144))
                .fluidOutputs(Technetium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Magnesium.getFluid(144)).fluidInputs(Zirconium.getFluid(144))
                .fluidOutputs(Tellurium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Iron.getFluid(144)).fluidInputs(Silicon.getFluid(144))
                .fluidOutputs(Zirconium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Niobium.getFluid(144)).fluidInputs(Silver.getFluid(144))
                .fluidOutputs(Radium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Technetium22.getFluid(144)).fluidInputs(Ruthenium.getFluid(144))
                .fluidOutputs(Francium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Osmium.getFluid(144)).fluidInputs(Calcium.getFluid(144))
                .fluidOutputs(Curium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Tungsten.getFluid(144)).fluidInputs(Vanadium.getFluid(144))
                .fluidOutputs(Berkelium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Cadmium.getFluid(144)).fluidInputs(Tin.getFluid(144))
                .fluidOutputs(Californium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Titanium.getFluid(144)).fluidInputs(Gallium.getFluid(144))
                .fluidOutputs(Iodine.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Gold.getFluid(144)).fluidInputs(Carbon.getFluid(144))
                .fluidOutputs(Astatine.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Yttrium.getFluid(144)).fluidInputs(Neodymium.getFluid(144))
                .fluidOutputs(Einsteinium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Samarium.getFluid(144)).fluidInputs(Strontium.getFluid(144))
                .fluidOutputs(Fermium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Tungsten.getFluid(144)).fluidInputs(Cobalt.getFluid(144))
                .fluidOutputs(Mendelevium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Palladium.getFluid(144)).fluidInputs(Barium.getFluid(144))
                .fluidOutputs(Nobelium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Niobium.getFluid(144)).fluidInputs(Samarium.getFluid(144))
                .fluidOutputs(Lawrencium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Yttrium.getFluid(144)).fluidInputs(Dysprosium.getFluid(144))
                .fluidOutputs(Dubnium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Tungsten.getFluid(144)).fluidInputs(Germanium.getFluid(144))
                .fluidOutputs(Seaborgium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Technetium.getFluid(144)).fluidInputs(Gadolinium.getFluid(144))
                .fluidOutputs(Bohrium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Osmium.getFluid(144)).fluidInputs(Germanium.getFluid(144))
                .fluidOutputs(Hassium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Rhodium.getFluid(144)).fluidInputs(Gadolinium.getFluid(144))
                .fluidOutputs(Meitnerium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Actinium.getFluid(144)).fluidInputs(Titanium.getFluid(144))
                .fluidOutputs(Roentgenium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Indium.getFluid(144)).fluidInputs(Europium.getFluid(144))
                .fluidOutputs(Copernicium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Silver.getFluid(144)).fluidInputs(Dysprosium.getFluid(144))
                .fluidOutputs(Nihonium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Gold.getFluid(144)).fluidInputs(Rubidium.getFluid(144))
                .fluidOutputs(Livermorium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Promethium.getFluid(144)).fluidInputs(Technetium.getFluid(144))
                .fluidOutputs(Rutherfordium.getFluid(144))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.S_ACTIVE_MULTI_CASING
                        .getItemVariant(SBlockActiveMultiCasing.SActiveMultiCasingType.ADV_FUSION_COIL))
                .input(FIELD_GENERATOR_UEV, 8)
                .input(ROBOT_ARM_UEV, 8)
                .input(gear, HalkoniteSteel, 4)
                .input(plate, HalkoniteSteel, 64)
                .input(stickLong, AbyssalAlloy, 32)
                .input(screw, HalkoniteSteel, 64)
                .input(wireGtDouble, ScUevSane, 64)
                .input(cableGtDouble, Quantium40, 64)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 32))
                .fluidInputs(Adamantium.getFluid(144 * 64))
                .fluidInputs(Hihiirokane.getFluid(144 * 64))
                .fluidInputs(Copper.getPlasma(144 * 64))
                .output(ADVANCED_FUSION_REACTOR)
                .stationResearch(b -> b
                        .researchStack(FUSION_REACTOR[2].getStackForm())
                        .CWUt(144)
                        .EUt(VA[UEV]))
                .duration(6400).EUt(VA[UEV]).buildAndRegister();

        // adv fusion only
        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Bromine.getFluid(1000)).fluidInputs(Gold.getFluid(144 * 4))
                .fluidOutputs(Flerovium.getPlasma(144))
                .duration(20 * 180).EUt(VA[UIV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Germanium.getFluid(144)).fluidInputs(Promethium.getFluid(144))
                .fluidOutputs(Neptunium.getPlasma(144))
                .duration(20 * 180).EUt(VA[UIV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(AwakenedDraconium.getFluid(144 * 4)).fluidInputs(Flerovium.getPlasma(144 * 4))
                .fluidOutputs(Rhugnor.getFluid(144))
                .duration(20 * 100).EUt(VA[UIV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Infinity.getFluid(144)).fluidInputs(DeepDarkIron.getFluid(288))
                .fluidOutputs(Rhugnor.getFluid(144))
                .duration(20 * 20).EUt(VA[UIV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Dragonblood.getFluid(144 * 4), Rhugnor.getFluid(144 * 8))
                .fluidOutputs(Hypogen.getFluid(144))
                .duration(20 * 360).EUt(VA[UIV]).EUToStart(640_000_000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(STELLAR_ESSENCE_END)
                .input(ADVANCED_FUSION_REACTOR, 64)
                .input(FIELD_GENERATOR_UIV, 32)
                .input(ROBOT_ARM_UIV, 32)
                .inputs(SerendustryMetaBlocks.S_ACTIVE_MULTI_CASING
                        .getItemVariant(SBlockActiveMultiCasing.SActiveMultiCasingType.ADV_FUSION_COIL, 64),
                        SerendustryMetaBlocks.S_ACTIVE_MULTI_CASING.getItemVariant(
                                SBlockActiveMultiCasing.SActiveMultiCasingType.ADV_FUSION_COIL, 64),
                        SerendustryMetaBlocks.S_ACTIVE_MULTI_CASING.getItemVariant(
                                SBlockActiveMultiCasing.SActiveMultiCasingType.ADV_FUSION_COIL, 64),
                        SerendustryMetaBlocks.S_ACTIVE_MULTI_CASING.getItemVariant(
                                SBlockActiveMultiCasing.SActiveMultiCasingType.ADV_FUSION_COIL, 64))
                .input(plateDense, ExoHalkoniteSteel, 4)
                .input(plateDense, HalkoniteSteel, 8)
                .input(plate, DeepDarkSteel, 32)
                .input(plate, Infinity, 32)
                .input(gear, ExoHalkoniteSteel, 16)
                .input(gear, Infinity, 16)
                .input(stickLong, ExoHalkoniteSteel, 32)
                .input(CHIP_OPIC, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 32),
                        Hypogen.getFluid(144 * 16),
                        Flerovium.getFluid(144 * 64),
                        Neptunium.getFluid(144 * 64))
                .output(MEGA_FUSION_REACTOR)
                .stationResearch(b -> b
                        .researchStack(ADVANCED_FUSION_REACTOR.getStackForm())
                        .CWUt(144)
                        .EUt(VA[GTValues.UEV]))
                .duration(20 * 60 * 20).EUt(VA[GTValues.UEV]).buildAndRegister();
    }
}
