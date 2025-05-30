package serendustry.recipe;

import static gregtech.api.GTValues.EV;
import static gregtech.api.GTValues.IV;
import static gregtech.api.GTValues.L;
import static gregtech.api.GTValues.LuV;
import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.ALLOY_SMELTER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.BREWING_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CENTRIFUGE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.DISTILLERY_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ELECTROLYZER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.FURNACE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.MIXER_RECIPES;
import static gregtech.api.unification.material.Materials.Antimony;
import static gregtech.api.unification.material.Materials.Benzene;
import static gregtech.api.unification.material.Materials.Butadiene;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.Chlorine;
import static gregtech.api.unification.material.Materials.Chrome;
import static gregtech.api.unification.material.Materials.Copper;
import static gregtech.api.unification.material.Materials.Ethylene;
import static gregtech.api.unification.material.Materials.Fluorine;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.Iridium;
import static gregtech.api.unification.material.Materials.Lubricant;
import static gregtech.api.unification.material.Materials.Magnesium;
import static gregtech.api.unification.material.Materials.Naquadah;
import static gregtech.api.unification.material.Materials.NaquadahEnriched;
import static gregtech.api.unification.material.Materials.Naquadria;
import static gregtech.api.unification.material.Materials.Nitrogen;
import static gregtech.api.unification.material.Materials.Oil;
import static gregtech.api.unification.material.Materials.Osmiridium;
import static gregtech.api.unification.material.Materials.Osmium;
import static gregtech.api.unification.material.Materials.Oxygen;
import static gregtech.api.unification.material.Materials.PCBCoolant;
import static gregtech.api.unification.material.Materials.Palladium;
import static gregtech.api.unification.material.Materials.Platinum;
import static gregtech.api.unification.material.Materials.PlatinumGroupSludge;
import static gregtech.api.unification.material.Materials.Polybenzimidazole;
import static gregtech.api.unification.material.Materials.Polycaprolactam;
import static gregtech.api.unification.material.Materials.Polyethylene;
import static gregtech.api.unification.material.Materials.PolyphenyleneSulfide;
import static gregtech.api.unification.material.Materials.Polytetrafluoroethylene;
import static gregtech.api.unification.material.Materials.PolyvinylButyral;
import static gregtech.api.unification.material.Materials.PolyvinylChloride;
import static gregtech.api.unification.material.Materials.Potassium;
import static gregtech.api.unification.material.Materials.Propene;
import static gregtech.api.unification.material.Materials.Rhodium;
import static gregtech.api.unification.material.Materials.Rubber;
import static gregtech.api.unification.material.Materials.Ruthenium;
import static gregtech.api.unification.material.Materials.Silicon;
import static gregtech.api.unification.material.Materials.SiliconeRubber;
import static gregtech.api.unification.material.Materials.Sodium;
import static gregtech.api.unification.material.Materials.StyreneButadieneRubber;
import static gregtech.api.unification.material.Materials.Sulfur;
import static gregtech.api.unification.material.Materials.Talc;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.gear;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.wireFine;
import static gregtech.common.metatileentities.MetaTileEntities.HULL;
import static serendustry.item.material.SerendustryMaterials.CarbonNanotubes;
import static serendustry.item.material.SerendustryMaterials.HighGradeSolderingAlloy;
import static serendustry.item.material.SerendustryMaterials.Rhopalthenit;
import static serendustry.item.material.SerendustryMaterials.SemiconductorGradeSilicon;
import static serendustry.item.material.SerendustryMaterials.Teflon;
import static serendustry.machine.SerendustryMetaTileEntities.INDUSTRIAL_LABORATORY;
import static serendustry.machine.SerendustryRecipeMaps.LABORATORY_RECIPES;

import gregtech.api.unification.material.MarkerMaterials;

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

        // todo: bopet, bets, ferrofluid, monaline, bastline, xenoline, germanium, selenium, netherite, cnts, gadonts,
        // radox, taranium
    }
}
