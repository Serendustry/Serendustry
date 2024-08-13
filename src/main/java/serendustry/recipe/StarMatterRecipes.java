package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ELECTROLYZER_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.EMITTER_ZPM;
import static gregtech.common.items.MetaItems.ROBOT_ARM_ZPM;
import static gregtech.common.metatileentities.MetaTileEntities.ADVANCED_LARGE_MINER;
import static gregtech.common.metatileentities.MetaTileEntities.FUSION_REACTOR;
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
                .fluidOutputs(NeutronStarMatter.getFluid(10000))
                .duration(12000).EUt(VA[UEV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(circuit, MarkerMaterials.Tier.UHV, 4)
                .input(circuit, MarkerMaterials.Tier.UV, 16)
                .input(EMITTER_ZPM, 8)
                .input(ROBOT_ARM_ZPM, 8)
                .input(plate, HalkoniteSteel, 32)
                .input(plate, Naquadria, 32)
                .input(stickLong, Tritanium, 32)
                .input(foil, Tritanium, 64)
                .input(screw, HalkoniteSteel, 64)
                .input(screw, HalkoniteSteel, 64)
                .input(wireGtDouble, EnrichedNaquadahTriniumEuropiumDuranide, 64)
                .input(cableGtDouble, Hihiirokane, 64)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 16))
                .fluidInputs(Osmium.getFluid(144 * 16))
                .fluidInputs(NaquadahAlloy.getFluid(144 * 16))
                .fluidInputs(Hihiirokane.getFluid(144 * 16))
                .output(NEBULAIC_NEXUS)
                .stationResearch(b -> b
                        .researchStack(FUSION_REACTOR[2].getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(6400).EUt(VA[UV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .input(ingot, Tritanium)
                .fluidInputs(Helium.getFluid(FluidStorageKeys.PLASMA,1000))
                .output(ingotHot, StellarContainmentBase)
                .duration(250).EUt(VA[UHV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .fluidInputs(Naquadria.getFluid(144),
                        Oxygen.getFluid(FluidStorageKeys.LIQUID, 1000),
                        Helium.getFluid(FluidStorageKeys.LIQUID,500))
                .fluidOutputs(StellarBaptismSolution.getFluid(1000))
                .duration(120).EUt(VA[UHV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .input(ingot, StellarContainmentBase)
                .fluidInputs(StellarBaptismSolution.getFluid(1000),
                        NeutronStarMatter.getFluid(500))
                .output(ingot, Neutronium) // todo: change to ingotHot and remove fusion Nt recipe
                .duration(200).EUt(VA[UHV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .fluidInputs(YellowStarMatter.getFluid(500),
                        RedStarMatter.getFluid(500),
                        BlueStarMatter.getFluid(500),
                        WhiteStarMatter.getFluid(500),
                        BrownStarMatter.getFluid(500),
                        BlackStarMatter.getFluid(500))
                .fluidOutputs(CondensedStarMatter.getFluid(1000))
                .duration(600).EUt(VA[UHV]).buildAndRegister();
    }
}
