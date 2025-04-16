package serendustry.recipe;

import gregtech.api.unification.material.MarkerMaterials;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CENTRIFUGE_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.Materials.Benzene;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.metatileentities.MetaTileEntities.DISTILLATION_TOWER;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.GIANT_FRACTIONATING_COLUMN;
import static serendustry.machine.SerendustryRecipeMaps.GIANT_FRACTIONATING_COLUMN_RECIPES;

public class GiantFractionatingColumnRecipes {
    public static void init() {

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(circuit, MarkerMaterials.Tier.ZPM, 4)
                .input(circuit, MarkerMaterials.Tier.LuV, 32)
                .input(plate, RhodiumPlatedPalladium, 32)
                .input(plate, Ruridit, 32)
                .input(stickLong, Osmiridium, 32)
                .input(gear, NaquadahAlloy, 16)
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
                .duration(860).EUt(VA[LuV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(ButeneMixture.getFluid(1000))
                .fluidOutputs(Butene1.getFluid(500), Butene2.getFluid(500))
                .duration(860).EUt(VA[LuV]).buildAndRegister();
    }
}
