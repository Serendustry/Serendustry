package serendustry.recipe;

import gregtech.api.GTValues;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;

import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_END;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryRecipeMaps.*;

public class InfinityChain {
    public static void init() {
        Material[] Tier1 = {InfinityPale, InfinityFleeting, InfinityShattered, InfinityInordinate, InfinityFractured};
        RecipeMap[] Tier1R = {CHEMICAL_RECIPES, CHEMICAL_BATH_RECIPES, CIRCUIT_ASSEMBLER_RECIPES, VACUUM_RECIPES, LASER_ENGRAVER_RECIPES};
        Material[] Tier1M = {Osmiridium, NaquadahAlloy, Americium, Darmstadtium, Moscovium};
        OrePrefix[] Tier1P = {stickLong, gearSmall, wireFine, plate, ingot};
        int[] Tier1Q = {2, 2, 32, 2, 2};

        Material[] Tier2 = {InfinityEmpowered, InfinityCharged, InfinityStabilized, InfinityGlowing, InfinityPulsating};
        RecipeMap[] Tier2R = {ELECTROMAGNETIC_SEPARATOR_RECIPES, BLAST_RECIPES, CVD_RECIPES, ARC_FURNACE_RECIPES, DISTILLERY_RECIPES};
        Material[] Tier2M = {VibraniumAlloy, Neutronium, RutheniumTriniumAmericiumNeutronate, Hihiirokane, Azbantium};
        OrePrefix[] Tier2P = {plate, gearSmall, wireGtHex, wireFine, stickLong};
        int[] Tier2Q = {2, 2, 1, 32, 2};

        Material[] Tier3 = {InfinityEternal, InfinityTranscendent, InfinityVibrant, InfinityEthereal, InfinityRadiant};
        RecipeMap[] Tier3R = {ASSEMBLER_RECIPES, NEBULAIC_NEXUS_RECIPES, ASSEMBLY_LINE_RECIPES, SONICATOR_RECIPES, HP_LASER_ARRAY_RECIPES};
        Material[] Tier3M = {AbyssalAlloy, HotHalkoniteSteel, DeepDarkSteel, InfinityCatalyst, Hypogen};
        OrePrefix[] Tier3P = {frameGt, stickLong, stick, plate, ingotHot};
        int[] Tier3Q = {2, 2, 4, 2, 1};

        CENTRIFUGE_RECIPES.recipeBuilder()
                .circuitMeta(6)
                .fluidInputs(InfinityCatalyst.getFluid(144)) // ~2.048 Infinity per InfCat
                .chancedOutput(dust, InfinityPale, 8000, 0)
                .chancedOutput(dust, InfinityFleeting, 8000, 0)
                .chancedOutput(dust, InfinityShattered, 8000, 0)
                .chancedOutput(dust, InfinityInordinate, 8000, 0)
                .chancedOutput(dust, InfinityFractured, 8000, 0)
                .duration(600).EUt(VA[GTValues.UIV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .notConsumable(STELLAR_ESSENCE_END)
                .fluidInputs(InfinityCatalyst.getFluid(144)) // ~2.56 Infinity per InfCat
                .output(dust, InfinityPale)
                .output(dust, InfinityFleeting)
                .output(dust, InfinityShattered)
                .output(dust, InfinityInordinate)
                .output(dust, InfinityFractured)
                .duration(400).EUt(VA[GTValues.UIV]).buildAndRegister();

        for(int i = 0; i < Tier1.length; i++) {
            Tier1R[i].recipeBuilder()
                    .fluidInputs(Tier1[i].getFluid(144))
                    .input(Tier1P[i], Tier1M[i], Tier1Q[i])
                    .chancedOutput(dust, InfinityBright, 8000, 0)
                    .duration(800).EUt(VA[GTValues.UIV]).buildAndRegister();
        }

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(InfinityBright.getFluid(144))
                .chancedOutput(dust, InfinityEmpowered, 2000, 0)
                .chancedOutput(dust, InfinityCharged, 2000, 0)
                .chancedOutput(dust, InfinityStabilized, 2000, 0)
                .chancedOutput(dust, InfinityGlowing, 2000, 0)
                .chancedOutput(dust, InfinityPulsating, 2000, 0)
                .duration(900).EUt(VA[GTValues.UIV]).buildAndRegister();

        for(int i = 0; i < Tier2.length; i++) {
            Tier2R[i].recipeBuilder()
                    .fluidInputs(Tier2[i].getFluid(144))
                    .input(Tier2P[i], Tier2M[i], Tier2Q[i])
                    .chancedOutput(dust, InfinityShining, 8000, 0)
                    .duration(1200).EUt(VA[GTValues.UIV]).buildAndRegister();
        }

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(InfinityShining.getFluid(144))
                .chancedOutput(dust, InfinityEternal, 2000, 0)
                .chancedOutput(dust, InfinityTranscendent, 2000, 0)
                .chancedOutput(dust, InfinityVibrant, 2000, 0)
                .chancedOutput(dust, InfinityEthereal, 2000, 0)
                .chancedOutput(dust, InfinityRadiant, 2000, 0)
                .duration(1200).EUt(VA[GTValues.UIV]).buildAndRegister();

        for(int i = 0; i < Tier3.length; i++) {
            Tier3R[i].recipeBuilder()
                    .fluidInputs(Tier3[i].getFluid(144))
                    .input(Tier3P[i], Tier3M[i], Tier3Q[i])
                    .chancedOutput(dust, Infinity, 8000, 0)
                    .duration(1600).EUt(VA[GTValues.UIV]).buildAndRegister();
        }
    }
}
