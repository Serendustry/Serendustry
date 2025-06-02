package serendustry.recipe;

import gregtech.api.unification.material.MarkerMaterials;

import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.Americium;
import static gregtech.api.unification.material.Materials.Flerovium;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.gemExquisite;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.common.items.MetaItems.CONVEYOR_MODULE_UHV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UHV;
import static gregtech.common.items.MetaItems.SENSOR_UHV;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_BEYOND;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_BLANK;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_END;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_NETHER;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_OVERWORLD;
import static serendustry.item.material.SerendustryMaterials.Adamantium;
import static serendustry.item.material.SerendustryMaterials.Azbantium;
import static serendustry.item.material.SerendustryMaterials.CondensedStarMatter;
import static serendustry.item.material.SerendustryMaterials.FullerenePolymerMatrix;
import static serendustry.item.material.SerendustryMaterials.Orundum;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;
import static serendustry.item.material.SerendustryMaterials.Realitium;
import static serendustry.item.material.SerendustryMaterials.SelfRepairingNanobots;
import static serendustry.item.material.SerendustryMaterials.TiberiumAboreus;
import static serendustry.item.material.SerendustryMaterials.Trilithium;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;
import static serendustry.machine.SerendustryMetaTileEntities.STELLAR_INCUBATOR;
import static serendustry.machine.SerendustryRecipeMaps.STELLAR_INCUBATOR_RECIPES;

public class StellarIncubatorRecipes {

    public static void init() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Neutronium, 32)
                .input(FIELD_GENERATOR_UHV, 8)
                .input(SENSOR_UHV, 16)
                .input(CONVEYOR_MODULE_UHV, 16)
                .input(circuit, MarkerMaterials.Tier.UHV, 32)
                .input(plateDense, VibraniumAlloy, 8)
                .input(plateDense, Neutronium, 8)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 16),
                        Neutronium.getFluid(144 * 32),
                        Adamantium.getFluid(144 * 64))
                .output(STELLAR_INCUBATOR)
                .stationResearch(b -> b
                        .researchStack(STELLAR_ESSENCE_BLANK.getStackForm())
                        .CWUt(144)
                        .EUt(VA[UHV]))
                .duration(12800).EUt(VA[UHV]).buildAndRegister();

        STELLAR_INCUBATOR_RECIPES.recipeBuilder()
                .input(gemExquisite, Orundum)
                .fluidInputs(CondensedStarMatter.getFluid(4000),
                        Neutronium.getFluid(144 * 8))
                .output(STELLAR_ESSENCE_BLANK)
                .duration(2500 * 32).EUt(VA[UHV]).buildAndRegister();

        STELLAR_INCUBATOR_RECIPES.recipeBuilder()
                .input(STELLAR_ESSENCE_BLANK)
                .input(circuit, MarkerMaterials.Tier.UHV, 64)
                .input(gemExquisite, TiberiumAboreus, 64)
                .fluidInputs(RadoxPolymer.getFluid(144 * 32),
                        Neutronium.getFluid(144 * 32),
                        Americium.getPlasma(144 * 32))
                .output(STELLAR_ESSENCE_OVERWORLD)
                .duration(10000 * 32).EUt(VA[UHV]).buildAndRegister();

        STELLAR_INCUBATOR_RECIPES.recipeBuilder()
                .input(STELLAR_ESSENCE_BLANK, 4)
                .input(circuit, MarkerMaterials.Tier.UEV, 64)
                .input(gemExquisite, Azbantium, 32)
                .fluidInputs(RadoxPolymer.getFluid(144 * 64),
                        Neutronium.getFluid(144 * 64),
                        Flerovium.getPlasma(144 * 64))
                .output(STELLAR_ESSENCE_NETHER)
                .duration(25000 * 32).EUt(VA[UHV]).buildAndRegister();

        STELLAR_INCUBATOR_RECIPES.recipeBuilder()
                .input(STELLAR_ESSENCE_BLANK)
                .input(circuit, MarkerMaterials.Tier.UHV, 48)
                .input(gemExquisite, TiberiumAboreus, 32)
                .fluidInputs(RadoxPolymer.getFluid(144 * 16),
                        Neutronium.getFluid(144 * 16),
                        Realitium.getFluid(50))
                .output(STELLAR_ESSENCE_OVERWORLD)
                .duration(5000 * 32).EUt(VA[UHV]).buildAndRegister();

        STELLAR_INCUBATOR_RECIPES.recipeBuilder()
                .input(STELLAR_ESSENCE_BLANK, 4)
                .input(circuit, MarkerMaterials.Tier.UEV, 48)
                .input(gemExquisite, Azbantium, 16)
                .fluidInputs(RadoxPolymer.getFluid(144 * 32),
                        Neutronium.getFluid(144 * 32),
                        Realitium.getFluid(200))
                .output(STELLAR_ESSENCE_NETHER)
                .duration(12500 * 32).EUt(VA[UHV]).buildAndRegister();

        STELLAR_INCUBATOR_RECIPES.recipeBuilder()
                .input(STELLAR_ESSENCE_BLANK, 16)
                .input(circuit, MarkerMaterials.Tier.UIV, 64)
                .input(gemExquisite, Orundum, 32)
                .fluidInputs(RadoxPolymer.getFluid(144 * 128),
                        Neutronium.getFluid(144 * 128),
                        Realitium.getFluid(800))
                .output(STELLAR_ESSENCE_END)
                .duration(67500 * 32).EUt(VA[UHV]).buildAndRegister();

        STELLAR_INCUBATOR_RECIPES.recipeBuilder()
                .input(STELLAR_ESSENCE_BLANK, 32)
                .input(circuit, MarkerMaterials.Tier.UXV, 64)
                .input(gemExquisite, Trilithium, 64)
                .fluidInputs(FullerenePolymerMatrix.getFluid(144 * 128),
                        Neutronium.getFluid(144 * 1024),
                        Realitium.getFluid(3200))
                .output(STELLAR_ESSENCE_BEYOND)
                .duration(364500 * 32).EUt(VA[UHV]).buildAndRegister();
    }
}
