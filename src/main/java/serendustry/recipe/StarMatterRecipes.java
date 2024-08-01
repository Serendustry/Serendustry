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
                    .fluidOutputs(Iron.getFluid((int) (4 * 144 * 64 * amount[i])))
                    .fluidOutputs(Copper.getFluid((int) (4 * 144 * 64 * amount[i])))
                    .fluidOutputs(Chrome.getFluid((int) (4 * 144 * 64 * amount[i])))
                    .fluidOutputs(CarbonMonoxide.getFluid((int) (4 * 50000 * amount[i])))
                    .fluidOutputs(CarbonDioxide.getFluid((int) (4 * 50000 * amount[i])))
                    .fluidOutputs(Methane.getFluid((int) (4 * 100000 * amount[i])))
                    .duration(12000).EUt(VA[UHV]).buildAndRegister();
        }

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(PulsarStarMatter.getFluid(10000))
                .fluidOutputs(TengamRaw.getFluid(144 * 64))
                .fluidOutputs(Neutronium.getFluid(144 * 64))
                .duration(12000).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(circuit, MarkerMaterials.Tier.UHV, 4)
                .input(circuit, MarkerMaterials.Tier.UV, 16)
                .input(EMITTER_UV, 8)
                .input(stickLong, HighDurabilityCompoundSteel, 64)
                .input(plate, WroughtNeutronium, 32)
                .input(bolt, Pikyonium, 64)
                .input(screw, Cinobite, 64)
                .input(foil, HighDurabilityCompoundSteel, 64)
                .input(foil, EnrichedNaquadahAlloy, 64)
                .input(wireGtDouble, EnrichedNaquadahTriniumEuropiumDuranide, 64)
                .fluidInputs(MutatedLivingSolder.getFluid(144 * 32))
                .fluidInputs(Neutronium.getFluid(144 * 16))
                .fluidInputs(Darmstadtium.getFluid(144 * 32))
                .fluidInputs(FluxedElectrum.getFluid(144 * 64))
                .output(NEBULAIC_NEXUS)
                .duration(4800).EUt(VA[UHV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .input(ingot, Neutronium)
                .fluidInputs(Tritanium.getFluid(144),
                        Darmstadtium.getFluid(144),
                        Americium.getFluid(144),
                        Helium.getFluid(FluidStorageKeys.PLASMA,1000))
                .output(ingotHot, StellarContainmentBase)
                .duration(250).EUt(VA[UHV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .fluidInputs(Neutronium.getFluid(144),
                        Oxygen.getFluid(FluidStorageKeys.LIQUID, 5000),
                        Helium.getFluid(FluidStorageKeys.LIQUID,500))
                .fluidOutputs(StellarBaptismSolution.getFluid(500))
                .duration(120).EUt(VA[UHV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .input(ingot, StellarContainmentBase)
                .fluidInputs(StellarBaptismSolution.getFluid(500),
                        YellowStarMatter.getFluid(400),
                        RedStarMatter.getFluid(400),
                        BlueStarMatter.getFluid(200),
                        WhiteStarMatter.getFluid(200),
                        BrownStarMatter.getFluid(200),
                        BlackStarMatter.getFluid(100))
                .output(ingotHot, CondensedStarMatter)
                .duration(400).EUt(VA[UHV]).buildAndRegister();
    }
}
