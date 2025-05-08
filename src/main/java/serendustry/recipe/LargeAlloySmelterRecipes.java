package serendustry.recipe;

import static gregtech.api.GTValues.IV;
import static gregtech.api.GTValues.LuV;
import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.UXV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.FUSION_RECIPES;
import static gregtech.api.unification.material.Materials.Aluminium;
import static gregtech.api.unification.material.Materials.Americium;
import static gregtech.api.unification.material.Materials.Beryllium;
import static gregtech.api.unification.material.Materials.Bromine;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.Copper;
import static gregtech.api.unification.material.Materials.Dysprosium;
import static gregtech.api.unification.material.Materials.Europium;
import static gregtech.api.unification.material.Materials.Flerovium;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.Indium;
import static gregtech.api.unification.material.Materials.Lithium;
import static gregtech.api.unification.material.Materials.Moscovium;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Niobium;
import static gregtech.api.unification.material.Materials.Nitrogen;
import static gregtech.api.unification.material.Materials.Oganesson;
import static gregtech.api.unification.material.Materials.Osmium;
import static gregtech.api.unification.material.Materials.Rubidium;
import static gregtech.api.unification.material.Materials.Selenium;
import static gregtech.api.unification.material.Materials.Tennessine;
import static gregtech.api.unification.material.Materials.Thallium;
import static gregtech.api.unification.material.Materials.TinAlloy;
import static gregtech.api.unification.material.Materials.Uranium238;
import static gregtech.api.unification.material.Materials.Vanadium;
import static gregtech.api.unification.material.Materials.Water;
import static gregtech.api.unification.ore.OrePrefix.cableGtDouble;
import static gregtech.api.unification.ore.OrePrefix.circuit;
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
import static serendustry.item.material.SerendustryMaterials.NaquadriaticTaranium;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.Rhugnor;
import static serendustry.item.material.SerendustryMaterials.ScUevSane;
import static serendustry.item.material.SerendustryMaterials.SelfRepairingNanobots;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.item.material.SerendustryMaterials.TastyNeutronium;
import static serendustry.item.material.SerendustryMaterials.Thaumium;
import static serendustry.machine.SerendustryMetaTileEntities.ADVANCED_FUSION_REACTOR;
import static serendustry.machine.SerendustryMetaTileEntities.MEGA_FUSION_REACTOR;

import gregtech.api.GTValues;
import gregtech.api.unification.material.MarkerMaterials;
import serendustry.blocks.BlockSerendustryMultiCasing;
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
                .duration(16).EUt(VA[LuV]).EUToStart(200_000_000).buildAndRegister();

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

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                        .getItemVariant(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION_COIL))
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
                .duration(4000).EUt(VA[UIV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(AwakenedDraconium.getFluid(144 * 4)).fluidInputs(Flerovium.getPlasma(144 * 4))
                .fluidOutputs(Rhugnor.getFluid(144))
                .duration(20 * 50).EUt(VA[UXV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Infinity.getFluid(144)).fluidInputs(DeepDarkIron.getFluid(288))
                .fluidOutputs(Rhugnor.getFluid(144))
                .duration(20 * 10).EUt(VA[UXV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Dragonblood.getFluid(144 * 4), Rhugnor.getFluid(144 * 8))
                .fluidOutputs(Hypogen.getFluid(144))
                .duration(20 * 180).EUt(VA[UXV]).EUToStart(640_000_000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(STELLAR_ESSENCE_END)
                .input(ADVANCED_FUSION_REACTOR, 8)
                .input(FIELD_GENERATOR_UIV, 8)
                .input(ROBOT_ARM_UIV, 16)
                .inputs(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                        .getItemVariant(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION_COIL, 64),
                        SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING.getItemVariant(
                                BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION_COIL, 64),
                        SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING.getItemVariant(
                                BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION_COIL, 64),
                        SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING.getItemVariant(
                                BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION_COIL, 64))
                .input(circuit, MarkerMaterials.Tier.UIV, 32)
                .input(plateDense, ExoHalkoniteSteel, 16)
                .input(gear, ExoHalkoniteSteel, 32)
                .input(gear, Infinity, 32)
                .input(plate, DeepDarkSteel, 32)
                .input(stickLong, ExoHalkoniteSteel, 32)
                .input(stickLong, Infinity, 64)
                .input(CHIP_OPIC, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 16),
                        Hypogen.getFluid(144 * 16),
                        Rhugnor.getFluid(144 * 32),
                        NaquadriaticTaranium.getFluid(144 * 64))
                .output(MEGA_FUSION_REACTOR)
                .stationResearch(b -> b
                        .researchStack(ADVANCED_FUSION_REACTOR.getStackForm())
                        .CWUt(144)
                        .EUt(VA[GTValues.UEV]))
                .duration(16000).EUt(VA[GTValues.UEV]).buildAndRegister();
    }
}
