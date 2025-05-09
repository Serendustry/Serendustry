package serendustry.recipe;

import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Material;
import gregtech.common.items.MetaItems;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CENTRIFUGE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ELECTROLYZER_RECIPES;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.CarbonDioxide;
import static gregtech.api.unification.material.Materials.CarbonMonoxide;
import static gregtech.api.unification.material.Materials.Darmstadtium;
import static gregtech.api.unification.material.Materials.EnrichedNaquadahTriniumEuropiumDuranide;
import static gregtech.api.unification.material.Materials.Helium;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.Methane;
import static gregtech.api.unification.material.Materials.NaquadahAlloy;
import static gregtech.api.unification.material.Materials.Naquadria;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Osmium;
import static gregtech.api.unification.material.Materials.Oxygen;
import static gregtech.api.unification.material.Materials.Tritanium;
import static gregtech.api.unification.ore.OrePrefix.cableGtDouble;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.foil;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.gemExquisite;
import static gregtech.api.unification.ore.OrePrefix.ingot;
import static gregtech.api.unification.ore.OrePrefix.ingotHot;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.api.unification.ore.OrePrefix.screw;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.api.unification.ore.OrePrefix.wireGtDouble;
import static gregtech.common.items.MetaItems.EMITTER_ZPM;
import static gregtech.common.items.MetaItems.ROBOT_ARM_ZPM;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_BLANK;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_OVERWORLD;
import static serendustry.item.material.SerendustryMaterials.Adamantium;
import static serendustry.item.material.SerendustryMaterials.BlackStarMatter;
import static serendustry.item.material.SerendustryMaterials.BlueStarMatter;
import static serendustry.item.material.SerendustryMaterials.BrownStarMatter;
import static serendustry.item.material.SerendustryMaterials.CondensedStarMatter;
import static serendustry.item.material.SerendustryMaterials.Hihiirokane;
import static serendustry.item.material.SerendustryMaterials.NeutronStarMatter;
import static serendustry.item.material.SerendustryMaterials.Orundum;
import static serendustry.item.material.SerendustryMaterials.PulsarStarMatter;
import static serendustry.item.material.SerendustryMaterials.RedStarMatter;
import static serendustry.item.material.SerendustryMaterials.SelfRepairingNanobots;
import static serendustry.item.material.SerendustryMaterials.StellarBaptismSolution;
import static serendustry.item.material.SerendustryMaterials.StellarContainmentBase;
import static serendustry.item.material.SerendustryMaterials.TengamRaw;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;
import static serendustry.item.material.SerendustryMaterials.WhiteStarMatter;
import static serendustry.item.material.SerendustryMaterials.YellowStarMatter;
import static serendustry.machine.SerendustryMetaTileEntities.NEBULAIC_NEXUS;
import static serendustry.machine.SerendustryRecipeMaps.NEBULAIC_NEXUS_RECIPES;

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
