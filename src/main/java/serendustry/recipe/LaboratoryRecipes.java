package serendustry.recipe;

import gregtech.api.unification.material.MarkerMaterials;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.api.unification.ore.OrePrefix.wireFine;
import static gregtech.common.metatileentities.MetaTileEntities.HULL;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.INDUSTRIAL_LABORATORY;
import static serendustry.machine.SerendustryRecipeMaps.LABORATORY_RECIPES;

public class LaboratoryRecipes {
   public static void init() {
       ASSEMBLER_RECIPES.recipeBuilder()
               .input(HULL[LuV])
               .input(circuit, MarkerMaterials.Tier.ZPM, 4)
               .input(circuit, MarkerMaterials.Tier.LuV, 8)
               .input(gear, Osmiridium, 8)
               .input(plate, Rhopalthenit, 32)
               .input(plate, Polybenzimidazole, 64)
               .input(wireFine, CarbonNanotubes, 64)
               .input(wireFine, CarbonNanotubes, 64)
               .fluidInputs(HighGradeSolderingAlloy.getFluid(16 * L))
               .output(INDUSTRIAL_LABORATORY)
               .duration(2400).EUt(VA[LuV]).buildAndRegister();

       LABORATORY_RECIPES.recipeBuilder()
               .input(dust, Talc, 50)
               .fluidInputs(Oil.getFluid(350000),
               Hydrogen.getFluid(200000))
               .output(dust, Carbon, 64)
               .fluidOutputs(Ethylene.getFluid(50000),
                       Propene.getFluid(50000),
                       Benzene.getFluid(50000),
                       Butadiene.getFluid(50000),
                       Lubricant.getFluid(100000))
               .requireInside(DISTILLERY_RECIPES, ZPM, 5)
               .requireInside(BREWING_RECIPES, ZPM, 1)
               .duration(20 * 20).EUt(VA[ZPM]).buildAndRegister();

       LABORATORY_RECIPES.recipeBuilder()
               .input(dust, Sulfur, 6).input(dust, Carbon, 36).input(dust, Sodium, 12)
               .fluidInputs(Oxygen.getFluid(120000),
                       Hydrogen.getFluid(40000),
                       Chlorine.getFluid(36000),
                       Ethylene.getFluid(26000),
                       Benzene.getFluid(6000),
                       Propene.getFluid(36000))
               .fluidOutputs(Polyethylene.getFluid(144 * 128),
                       PolyvinylChloride.getFluid(144 * 128),
                       PolyphenyleneSulfide.getFluid(144 * 128),
                       PolyvinylButyral.getFluid(144 * 128))
               .requireInside(CHEMICAL_RECIPES, ZPM, 4)
               .duration(20 * 20).EUt(VA[ZPM]).buildAndRegister();

       LABORATORY_RECIPES.recipeBuilder()
               .input(dust, Sulfur, 32).input(dust, Carbon, 40).input(dust, Silicon, 18)
               .fluidInputs(Oxygen.getFluid(80000),
                       Hydrogen.getFluid(100000),
                       Butadiene.getFluid(9000),
                       Ethylene.getFluid(3000),
                       Benzene.getFluid(3000),
                       Propene.getFluid(12000))
               .fluidOutputs(Rubber.getFluid(144 * 128),
                       StyreneButadieneRubber.getFluid(144 * 128),
                       SiliconeRubber.getFluid(144 * 128))
               .requireInside(CHEMICAL_RECIPES, ZPM, 3)
               .duration(20 * 20).EUt(VA[ZPM]).buildAndRegister();

       LABORATORY_RECIPES.recipeBuilder()
               .input(dust, Sulfur, 13).input(dust, Carbon, 64).input(dust, Copper)
               .input(dust, Potassium).input(dust, Chrome)
               .fluidInputs(Oxygen.getFluid(200000),
                       Hydrogen.getFluid(300000),
                       Chlorine.getFluid(250000),
                       Nitrogen.getFluid(80000),
                       Fluorine.getFluid(26000),
                       Benzene.getFluid(164000))
               .fluidOutputs(Polytetrafluoroethylene.getFluid(144 * 128),
                       Polybenzimidazole.getFluid(144 * 128),
                       Polycaprolactam.getFluid(144 * 128),
                       PCBCoolant.getFluid(100000))
               .requireInside(CHEMICAL_RECIPES, UHV, 4)
               .requireInside(MIXER_RECIPES, UHV, 1)
               .duration(20 * 20).EUt(VA[UHV]).buildAndRegister();

       LABORATORY_RECIPES.recipeBuilder()
               .input(dust, PlatinumGroupSludge, 640).input(dust, Magnesium, 8)
               .fluidInputs(Oxygen.getFluid(60000),
                       Hydrogen.getFluid(60000),
                       Chlorine.getFluid(40000),
                       Nitrogen.getFluid(20000))
               .output(dust, Platinum, 196)
               .output(dust, Palladium, 96)
               .output(dust, Ruthenium, 96)
               .output(dust, Rhodium, 96)
               .output(dust, Iridium, 48)
               .output(dust, Osmium, 28)
               .fluidOutputs(SemiconductorGradeSilicon.getFluid(144 * 64),
                       Gold.getFluid(144 * 196))
               .requireInside(CHEMICAL_RECIPES, UHV, 4)
               .requireInside(MIXER_RECIPES, UHV, 1)
               .requireInside(CENTRIFUGE_RECIPES, UHV, 1)
               .requireInside(ELECTROLYZER_RECIPES, UHV, 1)
               .duration(20 * 20).EUt(VA[UHV]).buildAndRegister();

       LABORATORY_RECIPES.recipeBuilder()
               .input(dust, Naquadah, 448).input(dust, Sulfur, 128).input(dust, Antimony, 32)
               .fluidInputs(
                       Hydrogen.getFluid(80000),
                       Fluorine.getFluid(40000))
               .output(dust, NaquadahEnriched, 128)
               .output(dust, Naquadria, 128)
               .requireInside(CHEMICAL_RECIPES, UEV, 2)
               .requireInside(CENTRIFUGE_RECIPES, UEV, 1)
               .requireInside(MIXER_RECIPES, UEV, 1)
               .requireInside(DISTILLERY_RECIPES, UEV, 1)
               .requireInside(FURNACE_RECIPES, UEV, 1)
               .duration(20 * 20).EUt(VA[UEV]).buildAndRegister();

       LABORATORY_RECIPES.recipeBuilder()
               .input(dust, Polytetrafluoroethylene, 15).input(dust, Polyethylene, 3).input(dust, Carbon)
               .fluidInputs(Sodium.getFluid(1000))
               .fluidOutputs(Teflon.getFluid(2880))
               .requireInside(ALLOY_SMELTER_RECIPES, EV, 1)
               .requireInside(CHEMICAL_RECIPES, EV, 1)
               .duration(600).EUt(VA[IV]).buildAndRegister();

       // todo: bopet, bets, ferrofluid, monaline, bastline, xenoline, germanium, selenium, netherite, cnts, gadonts, radox, taranium

   }
}
