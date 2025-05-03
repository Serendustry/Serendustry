package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.SONICATOR;
import static serendustry.machine.SerendustryRecipeMaps.CVD_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.SONICATOR_RECIPES;

import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;

public class NanotubesChain {

    public static void init() {
        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(Methane.getFluid(1000))
                .fluidOutputs(Acetylene.getFluid(1000))
                .duration(600).EUt(VA[EV]).buildAndRegister();

        CVD_RECIPES.recipeBuilder()
                .input(dust, Iron)
                .fluidInputs(Acetylene.getFluid(500),
                        Argon.getFluid(100))
                .output(dust, RawCarbonNanotubesMixture)
                .duration(300).EUt(VA[IV]).buildAndRegister();

        ELECTROMAGNETIC_SEPARATOR_RECIPES.recipeBuilder()
                .input(dust, RawCarbonNanotubesMixture, 2)
                .output(dust, Iron)
                .output(dust, CarbonNanotubes)
                .duration(600).EUt(VA[IV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(dust, CarbonNanotubes)
                .notConsumable(craftingLens, MarkerMaterials.Color.Black)
                .output(foil, CarbonNanotubes, 4)
                .duration(100).EUt(VA[IV]).buildAndRegister();

        WIREMILL_RECIPES.recipeBuilder()
                .input(foil, CarbonNanotubes)
                .output(wireFine, CarbonNanotubes, 2)
                .duration(25).EUt(VA[IV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Gadolinium)
                .fluidInputs(HydrochloricAcid.getFluid(3000))
                .output(dust, GadoliniumTrichloride, 4)
                .fluidOutputs(Hydrogen.getFluid(3000))
                .duration(900).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(FIELD_GENERATOR_UHV)
                .input(EMITTER_UHV, 4)
                .input(plate, Neutronium, 16)
                .input(stick, VibraniumAlloy, 64)
                .input(foil, Naquadria, 64)
                .input(cableGtDouble, Hihiirokane, 32)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 16))
                .fluidInputs(Duranium.getFluid(144 * 32))
                .fluidInputs(MolybdeniteLubricant.getFluid(32000))
                .output(SONICATOR)
                .stationResearch(b -> b
                        .researchStack(OreDictUnifier.get(plate, CarbonNanotubes))
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(12000).EUt(VA[UHV]).buildAndRegister();

        SONICATOR_RECIPES.recipeBuilder()
                .input(dust, GadoliniumTrichloride, 4)
                .input(dust, CarbonNanotubes)
                .output(dust, Gadonanotubes)
                .fluidOutputs(Chlorine.getFluid(3000))
                .duration(900).EUt(VA[UHV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(dust, Gadonanotubes)
                .notConsumable(craftingLens, MarkerMaterials.Color.Green)
                .output(foil, Gadonanotubes, 4)
                .duration(300).EUt(VA[UHV]).buildAndRegister();

        WIREMILL_RECIPES.recipeBuilder()
                .input(foil, Gadonanotubes)
                .output(wireFine, Gadonanotubes, 2)
                .duration(75).EUt(VA[UHV]).buildAndRegister();
    }
}
