package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_BLANK;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_OVERWORLD;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.NEBULAIC_NEXUS;
import static serendustry.machine.SerendustryRecipeMaps.NEBULAIC_NEXUS_RECIPES;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Material;
import gregtech.common.items.MetaItems;

public class StarMatterRecipes {

    public static void init() {
        float[] amount = { 1F, 1.2F, 1.4F, 1.4F, 1.4F, 1.8F };
        Material[] matter = { YellowStarMatter, RedStarMatter, BlueStarMatter, WhiteStarMatter, BrownStarMatter,
                BlackStarMatter };

        for (int i = 0; i < amount.length; i++) {
            CENTRIFUGE_RECIPES.recipeBuilder()
                    .fluidInputs(matter[i].getFluid(15_000))
                    .fluidOutputs(Hydrogen.getFluid((int) (4 * 15_000_000 * amount[i])))
                    .fluidOutputs(Helium.getFluid((int) (4 * 1_500_000 * amount[i])))
                    .fluidOutputs(CarbonMonoxide.getFluid((int) (4 * 50_000 * amount[i])))
                    .fluidOutputs(CarbonDioxide.getFluid((int) (4 * 50_000 * amount[i])))
                    .fluidOutputs(Methane.getFluid((int) (4 * 100_000 * amount[i])))
                    .duration(12000).EUt(VA[UHV]).buildAndRegister();
        }

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(PulsarStarMatter.getFluid(10000))
                .fluidOutputs(TengamRaw.getFluid(144 * 64))
                .fluidOutputs(NeutronStarMatter.getFluid(10000))
                .fluidOutputs(Hydrogen.getFluid(1_000_000))
                .fluidOutputs(Helium.getFluid(100_000))
                .duration(12000).EUt(VA[UEV]).buildAndRegister();

        ItemStack itemStack = MetaItems.FLUID_CELL.getStackForm();
        NBTTagCompound fluidTag = new NBTTagCompound();
        fluidTag.setTag("Fluid", YellowStarMatter.getFluid(1000).writeToNBT(new NBTTagCompound()));
        itemStack.setTagCompound(fluidTag); // todo: fix (this is just an empty cell)

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Adamantium, 8)
                .input(circuit, MarkerMaterials.Tier.UHV, 4)
                .input(circuit, MarkerMaterials.Tier.UV, 16)
                .input(EMITTER_ZPM, 8)
                .input(ROBOT_ARM_ZPM, 8)
                .input(plateDense, VibraniumAlloy, 4)
                .input(plate, Naquadria, 16)
                .input(stickLong, Tritanium, 16)
                .input(foil, Adamantium, 64)
                .input(screw, VibraniumAlloy, 64)
                .input(wireGtDouble, EnrichedNaquadahTriniumEuropiumDuranide, 64)
                .input(cableGtDouble, Hihiirokane, 64)
                .fluidInputs(SelfRepairingNanobots.getFluid(144 * 16))
                .fluidInputs(Osmium.getFluid(144 * 16))
                .fluidInputs(NaquadahAlloy.getFluid(144 * 16))
                .fluidInputs(Hihiirokane.getFluid(144 * 16))
                .output(NEBULAIC_NEXUS)
                .stationResearch(b -> b
                        .researchStack(itemStack)
                        .CWUt(64)
                        .EUt(VA[UV]))
                .duration(6400).EUt(VA[UV]).buildAndRegister();

        // Because you can't OC with only 1 energy hatch, you need 2 regular UV energy hatches at first, and then can
        // switch to 64A UHV
        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .input(ingot, Darmstadtium)
                .fluidInputs(Helium.getFluid(FluidStorageKeys.PLASMA, 1000))
                .output(ingotHot, StellarContainmentBase)
                .duration(200).EUt(VA[UHV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .fluidInputs(Naquadria.getFluid(144 * 4),
                        Oxygen.getFluid(FluidStorageKeys.LIQUID, 1000),
                        Helium.getFluid(FluidStorageKeys.LIQUID, 500))
                .fluidOutputs(StellarBaptismSolution.getFluid(1000))
                .duration(400).EUt(VA[UHV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .input(ingot, StellarContainmentBase)
                .fluidInputs(StellarBaptismSolution.getFluid(1000),
                        NeutronStarMatter.getFluid(500))
                .output(ingotHot, Neutronium)
                .duration(640).EUt(VA[UHV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .notConsumable(STELLAR_ESSENCE_OVERWORLD)
                .input(ingot, Carbon)
                .fluidInputs(StellarBaptismSolution.getFluid(800),
                        NeutronStarMatter.getFluid(400))
                .output(ingotHot, Neutronium)
                .duration(480).EUt(VA[UHV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .fluidInputs(YellowStarMatter.getFluid(500),
                        RedStarMatter.getFluid(500),
                        BlueStarMatter.getFluid(500),
                        WhiteStarMatter.getFluid(500),
                        BrownStarMatter.getFluid(500),
                        BlackStarMatter.getFluid(500))
                .fluidOutputs(CondensedStarMatter.getFluid(1000))
                .duration(1600).EUt(VA[UHV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .input(gemExquisite, Orundum, 8)
                .fluidInputs(CondensedStarMatter.getFluid(32000),
                        Neutronium.getFluid(144 * 64))
                .output(STELLAR_ESSENCE_BLANK)
                .duration(20 * 60 * 60).EUt(VA[UHV]).buildAndRegister();
    }
}
