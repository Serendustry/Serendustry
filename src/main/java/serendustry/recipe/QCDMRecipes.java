package serendustry.recipe;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;

import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.AUTOCLAVE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CENTRIFUGE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.Neptunium;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.foil;
import static gregtech.api.unification.ore.OrePrefix.lens;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static java.lang.Math.max;
import static serendustry.item.material.SerendustryMaterials.AntiverseLinkedQuarkoniumPlasma;
import static serendustry.item.material.SerendustryMaterials.ChromaticGlass;
import static serendustry.item.material.SerendustryMaterials.GluonatedNeutronium;
import static serendustry.item.material.SerendustryMaterials.Gluons;
import static serendustry.item.material.SerendustryMaterials.HNIW;
import static serendustry.item.material.SerendustryMaterials.Orundum;
import static serendustry.item.material.SerendustryMaterials.PositroniumHydride;
import static serendustry.item.material.SerendustryMaterials.QCDM;
import static serendustry.item.material.SerendustryMaterials.QuarkGluonPlasma;
import static serendustry.item.material.SerendustryMaterials.QuarkMatterAntiblue;
import static serendustry.item.material.SerendustryMaterials.QuarkMatterAntigreen;
import static serendustry.item.material.SerendustryMaterials.QuarkMatterAntired;
import static serendustry.item.material.SerendustryMaterials.QuarkMatterBlue;
import static serendustry.item.material.SerendustryMaterials.QuarkMatterGreen;
import static serendustry.item.material.SerendustryMaterials.QuarkMatterRed;
import static serendustry.item.material.SerendustryMaterials.QuarksAntiblue;
import static serendustry.item.material.SerendustryMaterials.QuarksAntigreen;
import static serendustry.item.material.SerendustryMaterials.QuarksAntired;
import static serendustry.item.material.SerendustryMaterials.QuarksBlue;
import static serendustry.item.material.SerendustryMaterials.QuarksGreen;
import static serendustry.item.material.SerendustryMaterials.QuarksRed;
import static serendustry.item.material.SerendustryMaterials.TiberiumAboreus;
import static serendustry.item.material.SerendustryMaterials.TiberiumCruentus;
import static serendustry.item.material.SerendustryMaterials.TiberiumRiparius;
import static serendustry.item.material.SerendustryMaterials.TiberiumVinifera;
import static serendustry.machine.SerendustryRecipeMaps.ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.HP_LASER_ARRAY_RECIPES;

public class QCDMRecipes {
    public static void init() {
        ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES.recipeBuilder()
                .input(dust, HNIW, 4)
                .fluidInputs(Neptunium.getPlasma(72))
                .fluidOutputs(QuarkGluonPlasma.getFluid(1000))
                .duration(20 * 4).EUt(VA[UEV]).buildAndRegister();

        // todo antimatter reactor?
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(QuarkGluonPlasma.getFluid(1000),
                        PositroniumHydride.getFluid(50000))
                .fluidOutputs(AntiverseLinkedQuarkoniumPlasma.getFluid(1000),
                        Gluons.getFluid(600))
                .duration(20 * 4).EUt(VA[UEV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(AntiverseLinkedQuarkoniumPlasma.getFluid(1000))
                .fluidOutputs(QuarksRed.getFluid(1000),
                        QuarksGreen.getFluid(1000),
                        QuarksBlue.getFluid(1000),
                        QuarksAntired.getFluid(1000),
                        QuarksAntigreen.getFluid(1000),
                        QuarksAntiblue.getFluid(1000))
                .duration(20 * 4).EUt(VA[UEV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(dust, Neutronium)
                .fluidInputs(Gluons.getFluid(100))
                .output(dust, GluonatedNeutronium)
                .duration(20).EUt(VA[UEV]).buildAndRegister();

        Material[] quarks = {QuarksRed, QuarksGreen, QuarksBlue, QuarksAntired, QuarksAntigreen, QuarksAntiblue};
        Material[] quarkMatter = {QuarkMatterRed, QuarkMatterGreen, QuarkMatterBlue, QuarkMatterAntired, QuarkMatterAntigreen, QuarkMatterAntiblue};

        for(int i = 0; i < quarks.length; i++) {
            AUTOCLAVE_RECIPES.recipeBuilder()
                    .input(dust, GluonatedNeutronium)
                    .fluidInputs(quarks[i].getFluid(1000))
                    .output(dust, quarkMatter[i])
                    .duration(20).EUt(VA[UEV]).buildAndRegister();
        }

        ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES.recipeBuilder()
                .input(dust, QuarkMatterRed)
                .input(dust, QuarkMatterGreen)
                .input(dust, QuarkMatterBlue)
                .input(dust, QuarkMatterAntired)
                .input(dust, QuarkMatterAntigreen)
                .input(dust, QuarkMatterAntiblue)
                .fluidInputs(Gold.getFluid(144 * 64))
                .output(dust, QCDM)
                .duration(20 * 8).EUt(VA[UEV]).buildAndRegister();

        Material[] lenses = {ChromaticGlass, Orundum, TiberiumRiparius, TiberiumVinifera, TiberiumCruentus, TiberiumAboreus};
        OrePrefix[] parts = { dust, plate, foil };
        float[] cost = { 1.0F, 1.0f, 0.25F };

        for (int i = 0; i < parts.length; i++) {
            for (int j = 0; j < parts.length; j++) {

                if (i == j) continue;

                HP_LASER_ARRAY_RECIPES.recipeBuilder()
                        .notConsumable(lens, lenses[j])
                        .input(parts[i], QCDM, (int) (max(cost[j] / cost[i], 1)))
                        .output(parts[j], QCDM, (int) (max(cost[i] / cost[j], 1)))
                        .duration(80).EUt(VA[UEV]).buildAndRegister();
            }
        }
    }
}
