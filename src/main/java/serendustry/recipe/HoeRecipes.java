package serendustry.recipe;

import gregtech.api.unification.material.MarkerMaterials;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.UXV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.Flerovium;
import static gregtech.api.unification.material.Materials.Neptunium;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.foil;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.gear;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.api.unification.ore.OrePrefix.screw;
import static gregtech.api.unification.ore.OrePrefix.wireGtSingle;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UXV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UXV;
import static serendustry.item.SerendustryMetaItems.HOE_BINDING;
import static serendustry.item.SerendustryMetaItems.HOE_CORE;
import static serendustry.item.SerendustryMetaItems.HOE_CRYSTAL;
import static serendustry.item.SerendustryMetaItems.HOE_HANDLE;
import static serendustry.item.SerendustryMetaItems.HOE_HEAD;
import static serendustry.item.SerendustryMetaItems.HOE_STABILIZER;
import static serendustry.item.SerendustryToolItems.GENESIS_HOE;
import static serendustry.item.material.SerendustryMaterials.AbyssalAlloy;
import static serendustry.item.material.SerendustryMaterials.DeepDarkSteel;
import static serendustry.item.material.SerendustryMaterials.ExoHalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.FullerenePolymerMatrix;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.Periodicium;
import static serendustry.item.material.SerendustryMaterials.QCDM;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.machine.SerendustryMetaTileEntities.EMPYREAN;
import static serendustry.machine.SerendustryRecipeMaps.EMPYREAN_RECIPES;

public class HoeRecipes {
    public static void init() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Periodicium, 32)
                .input(ROBOT_ARM_UXV, 16)
                .input(FIELD_GENERATOR_UXV, 16)
                .input(circuit, MarkerMaterials.Tier.UXV, 16)
                .input(plateDense, ExoHalkoniteSteel, 32)
                .input(plateDense, DeepDarkSteel, 32)
                .input(plateDense, Infinity, 32)
                .input(plateDense, FullerenePolymerMatrix, 32)
                .input(gear, ExoHalkoniteSteel, 32)
                .input(gear, DeepDarkSteel, 32)
                .input(gear, Infinity, 32)
                .input(gear, AbyssalAlloy, 32)
                .input(foil, QCDM, 64)
                .input(screw, ExoHalkoniteSteel, 64)
                .input(wireGtSingle, Hypogen, 64)
                .input(wireGtSingle, Periodicium, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 128),
                        Hypogen.getPlasma(144 * 64),
                        Flerovium.getFluid(144 * 128),
                        Neptunium.getFluid(144 * 128))
                .output(EMPYREAN)
                .stationResearch(b -> b
                        .researchStack(new ItemStack(Items.NETHER_STAR))
                        .CWUt(144)
                        .EUt(VA[UIV]))
                .duration(20 * 60 * 45).EUt(VA[UIV]).buildAndRegister();

        // todo hoe parts recipes (very long full AAL recipes)

        EMPYREAN_RECIPES.recipeBuilder()
                .input(HOE_HEAD)
                .input(HOE_BINDING)
                .input(HOE_CRYSTAL)
                .input(HOE_CORE)
                .input(HOE_STABILIZER)
                .input(HOE_HANDLE)
                .output(GENESIS_HOE)
                .duration(20 * 60 * 60 * 1000).EUt(VA[UXV]).buildAndRegister();
    }
}
