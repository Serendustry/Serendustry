package serendustry.recipe;

import static gregtech.api.GTValues.LuV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CENTRIFUGE_RECIPES;
import static gregtech.api.unification.material.Materials.Benzene;
import static gregtech.api.unification.material.Materials.Butadiene;
import static gregtech.api.unification.material.Materials.CoalTar;
import static gregtech.api.unification.material.Materials.Creosote;
import static gregtech.api.unification.material.Materials.Cumene;
import static gregtech.api.unification.material.Materials.Ethylene;
import static gregtech.api.unification.material.Materials.HydrogenSulfide;
import static gregtech.api.unification.material.Materials.Naphthalene;
import static gregtech.api.unification.material.Materials.NaquadahAlloy;
import static gregtech.api.unification.material.Materials.Osmiridium;
import static gregtech.api.unification.material.Materials.Osmium;
import static gregtech.api.unification.material.Materials.Phenol;
import static gregtech.api.unification.material.Materials.Propene;
import static gregtech.api.unification.material.Materials.RhodiumPlatedPalladium;
import static gregtech.api.unification.material.Materials.Ruridit;
import static gregtech.api.unification.material.Materials.SeverelyHydroCrackedNaphtha;
import static gregtech.api.unification.material.Materials.Toluene;
import static gregtech.api.unification.material.Materials.VanadiumGallium;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.gear;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.api.unification.ore.OrePrefix.wireGtQuadruple;
import static gregtech.common.metatileentities.MetaTileEntities.DISTILLATION_TOWER;
import static serendustry.item.material.SerendustryMaterials.Butene1;
import static serendustry.item.material.SerendustryMaterials.Butene2;
import static serendustry.item.material.SerendustryMaterials.ButeneMixture;
import static serendustry.item.material.SerendustryMaterials.Cyclopentadiene;
import static serendustry.item.material.SerendustryMaterials.HighGradeSolderingAlloy;
import static serendustry.item.material.SerendustryMaterials.Kerosene;
import static serendustry.item.material.SerendustryMaterials.MolybdeniteLubricant;
import static serendustry.item.material.SerendustryMaterials.Propylene;
import static serendustry.item.material.SerendustryMaterials.Pyridine;
import static serendustry.item.material.SerendustryMaterials.paraXylene;
import static serendustry.machine.SerendustryMetaTileEntities.GIANT_FRACTIONATING_COLUMN;
import static serendustry.machine.SerendustryRecipeMaps.GIANT_FRACTIONATING_COLUMN_RECIPES;

import gregtech.api.unification.material.MarkerMaterials;

public class GiantFractionatingColumnRecipes {

    public static void init() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, NaquadahAlloy, 8)
                .input(circuit, MarkerMaterials.Tier.ZPM, 4)
                .input(circuit, MarkerMaterials.Tier.LuV, 32)
                .input(plateDense, RhodiumPlatedPalladium, 8)
                .input(plate, Ruridit, 16)
                .input(stickLong, Osmiridium, 16)
                .input(gear, NaquadahAlloy, 8)
                .input(wireGtQuadruple, VanadiumGallium, 32)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 16),
                        MolybdeniteLubricant.getFluid(4000),
                        Osmium.getFluid(144 * 8))
                .output(GIANT_FRACTIONATING_COLUMN)
                .scannerResearch(DISTILLATION_TOWER.getStackForm())
                .duration(1400).EUt(VA[LuV]).buildAndRegister();

        GIANT_FRACTIONATING_COLUMN_RECIPES.recipeBuilder()
                .fluidInputs(SeverelyHydroCrackedNaphtha.getFluid(10000))
                .fluidOutputs(Kerosene.getFluid(1000),
                        Cyclopentadiene.getFluid(1000),
                        ButeneMixture.getFluid(1000),
                        Propylene.getFluid(1000),
                        Propene.getFluid(1000),
                        Ethylene.getFluid(1000),
                        Butadiene.getFluid(1000),
                        Toluene.getFluid(1000),
                        Benzene.getFluid(1000))
                .duration(20 * 60).EUt(VA[LuV]).buildAndRegister();

        GIANT_FRACTIONATING_COLUMN_RECIPES.recipeBuilder()
                .fluidInputs(CoalTar.getFluid(10000))
                .fluidOutputs(Benzene.getFluid(1000),
                        Toluene.getFluid(1000),
                        paraXylene.getFluid(1000),
                        Cumene.getFluid(1000),
                        Phenol.getFluid(1000),
                        Naphthalene.getFluid(1000),
                        Creosote.getFluid(1000),
                        HydrogenSulfide.getFluid(1000),
                        Pyridine.getFluid(10))
                .duration(20 * 60).EUt(VA[LuV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(ButeneMixture.getFluid(1000))
                .fluidOutputs(Butene1.getFluid(500), Butene2.getFluid(500))
                .duration(860).EUt(VA[LuV]).buildAndRegister();
    }
}
