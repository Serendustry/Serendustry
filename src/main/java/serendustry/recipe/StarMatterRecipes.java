package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ELECTROLYZER_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.EMITTER_UV;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.NEBULAIC_NEXUS;
import static serendustry.machine.SerendustryRecipeMaps.NEBULAIC_NEXUS_RECIPES;

import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Material;

public class StarMatterRecipes {

    public static void init() {
        float[] amount = { 1F, 1.2F, 1.4F, 1.4F, 1.4F, 1.8F };
        Material[] matter = { YellowStarMatter, RedStarMatter, BlueStarMatter, WhiteStarMatter, BrownStarMatter,
                BlackStarMatter };

        for (int i = 0; i < amount.length; i++) {
            ELECTROLYZER_RECIPES.recipeBuilder()
                    .fluidInputs(matter[i].getFluid(10000))
                    .fluidOutputs(Iron.getFluid((int) (144 * 64 * amount[i])))
                    .fluidOutputs(Copper.getFluid((int) (144 * 64 * amount[i])))
                    .fluidOutputs(Chrome.getFluid((int) (144 * 64 * amount[i])))
                    .fluidOutputs(CarbonMonoxide.getFluid((int) (50000 * amount[i])))
                    .fluidOutputs(CarbonDioxide.getFluid((int) (50000 * amount[i])))
                    .fluidOutputs(Methane.getFluid((int) (100000 * amount[i])))
                    .duration(12000).EUt(VA[UHV]).buildAndRegister();
        }

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(PulsarStarMatter.getFluid(10000))
                .fluidOutputs(TengamRaw.getFluid(144 * 16))
                .fluidOutputs(Neutronium.getFluid(144 * 32))
                .duration(12000).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(circuit, MarkerMaterials.Tier.UHV, 1)
                .input(circuit, MarkerMaterials.Tier.UV, 4)
                .input(EMITTER_UV, 2)
                .input(stick, HighDurabilityCompoundSteel, 48)
                .input(plate, WroughtNeutronium, 8)
                .input(bolt, Pikyonium, 64)
                .input(screw, Cinobite, 64)
                .input(foil, HighDurabilityCompoundSteel, 64)
                .input(foil, EnrichedNaquadahAlloy, 64)
                .input(wireGtSingle, EnrichedNaquadahTriniumEuropiumDuranide, 32)
                .fluidInputs(MutatedLivingSolder.getFluid(144 * 12))
                .fluidInputs(Neutronium.getFluid(144 * 4))
                .fluidInputs(Darmstadtium.getFluid(144 * 12))
                .fluidInputs(FluxedElectrum.getFluid(144 * 16))
                .output(NEBULAIC_NEXUS)
                .duration(2800).EUt(VA[UHV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .fluidInputs(Neutronium.getFluid(16),
                        Oxygen.getFluid(FluidStorageKeys.LIQUID, 10000),
                        Helium.getFluid(FluidStorageKeys.LIQUID,1000))
                .fluidOutputs(StellarBaptismSolution.getFluid(1000))
                .duration(20).EUt(VA[UEV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .fluidInputs(StellarBaptismSolution.getFluid(10000),
                        YellowStarMatter.getFluid(5000),
                        RedStarMatter.getFluid(5000),
                        BlueStarMatter.getFluid(2500),
                        WhiteStarMatter.getFluid(2500),
                        BrownStarMatter.getFluid(2500),
                        BlackStarMatter.getFluid(1000))
                .fluidOutputs(CondensedStarMatter.getFluid(144))
                .duration(200).EUt(VA[UEV]).buildAndRegister();
    }
}
