package serendustry.recipe;

import gregtech.api.unification.material.MarkerMaterials;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.FUSION_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.api.unification.ore.OrePrefix.cableGtDouble;
import static gregtech.common.items.MetaItems.*;
import static gregtech.common.metatileentities.MetaTileEntities.FUSION_REACTOR;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.ADVANCED_FUSION_REACTOR;
import static serendustry.machine.SerendustryMetaTileEntities.NEBULAIC_NEXUS;

public class LargeAlloySmelterRecipes {

    public static void init() {
        //. Todo: remove and replace ALL fusion recipes
        // Add recipe for Oganesson
        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Dysprosium.getFluid(16)).fluidInputs(Indium.getFluid(16))
                .fluidOutputs(Moscovium.getFluid(16))
                .duration(32).EUt(VA[ZPM]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(Erbium.getFluid(16)).fluidInputs(Palladium.getFluid(16))
                .fluidOutputs(Flerovium.getFluid(16))
                .duration(32).EUt(VA[ZPM]).EUToStart(200_000_000).buildAndRegister();

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
                .fluidInputs(ChargedDraconium.getFluid(64)).fluidInputs(TastyNeutronium.getFluid(32))
                .fluidOutputs(AwakenedDraconium.getFluid(32))
                .duration(260).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(InfinityCatalyst.getFluid(256)).fluidInputs(TastyNeutronium.getFluid(256))
                .fluidOutputs(Infinity.getFluid(8))
                .duration(4000).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
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
                .fluidInputs(Americium.getPlasma(144 * 64))
                .output(ADVANCED_FUSION_REACTOR)
                .stationResearch(b -> b
                        .researchStack(FUSION_REACTOR[2].getStackForm())
                        .CWUt(128)
                        .EUt(VA[UHV]))
                .duration(6400).EUt(VA[UEV]).buildAndRegister();
    }
}
