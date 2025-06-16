package serendustry.recipe;

import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ARC_FURNACE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.BLAST_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CENTRIFUGE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_BATH_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.DISTILLERY_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES;
import static gregtech.api.recipes.RecipeMaps.LASER_ENGRAVER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.VACUUM_RECIPES;
import static gregtech.api.unification.material.Materials.Americium;
import static gregtech.api.unification.material.Materials.Darmstadtium;
import static gregtech.api.unification.material.Materials.Moscovium;
import static gregtech.api.unification.material.Materials.NaquadahAlloy;
import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Osmiridium;
import static gregtech.api.unification.material.Materials.RutheniumTriniumAmericiumNeutronate;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.gearSmall;
import static gregtech.api.unification.ore.OrePrefix.ingot;
import static gregtech.api.unification.ore.OrePrefix.ingotHot;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.stick;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.api.unification.ore.OrePrefix.wireFine;
import static gregtech.api.unification.ore.OrePrefix.wireGtHex;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_END;
import static serendustry.item.material.SerendustryMaterials.AbyssalAlloy;
import static serendustry.item.material.SerendustryMaterials.Azbantium;
import static serendustry.item.material.SerendustryMaterials.DeepDarkSteel;
import static serendustry.item.material.SerendustryMaterials.Hihiirokane;
import static serendustry.item.material.SerendustryMaterials.HotHalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.InfinityBright;
import static serendustry.item.material.SerendustryMaterials.InfinityCatalyst;
import static serendustry.item.material.SerendustryMaterials.InfinityCharged;
import static serendustry.item.material.SerendustryMaterials.InfinityEmpowered;
import static serendustry.item.material.SerendustryMaterials.InfinityEternal;
import static serendustry.item.material.SerendustryMaterials.InfinityEthereal;
import static serendustry.item.material.SerendustryMaterials.InfinityFleeting;
import static serendustry.item.material.SerendustryMaterials.InfinityFractured;
import static serendustry.item.material.SerendustryMaterials.InfinityGlowing;
import static serendustry.item.material.SerendustryMaterials.InfinityInordinate;
import static serendustry.item.material.SerendustryMaterials.InfinityPale;
import static serendustry.item.material.SerendustryMaterials.InfinityPulsating;
import static serendustry.item.material.SerendustryMaterials.InfinityRadiant;
import static serendustry.item.material.SerendustryMaterials.InfinityShattered;
import static serendustry.item.material.SerendustryMaterials.InfinityShining;
import static serendustry.item.material.SerendustryMaterials.InfinityStabilized;
import static serendustry.item.material.SerendustryMaterials.InfinityTranscendent;
import static serendustry.item.material.SerendustryMaterials.InfinityVibrant;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;
import static serendustry.machine.SerendustryRecipeMaps.CVD_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.HP_LASER_ARRAY_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.NEBULAIC_NEXUS_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.SONICATOR_RECIPES;

import gregtech.api.GTValues;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;

public class InfinityChain {

    public static void init() {
        Material[] Tier1 = { InfinityPale, InfinityFleeting, InfinityShattered, InfinityInordinate, InfinityFractured };
        RecipeMap[] Tier1R = { CHEMICAL_RECIPES, CHEMICAL_BATH_RECIPES, CIRCUIT_ASSEMBLER_RECIPES, VACUUM_RECIPES,
                LASER_ENGRAVER_RECIPES };
        Material[] Tier1M = { Osmiridium, NaquadahAlloy, Americium, Darmstadtium, Moscovium };
        OrePrefix[] Tier1P = { stickLong, gearSmall, wireFine, plate, ingot };
        int[] Tier1Q = { 2, 2, 32, 2, 2 };

        Material[] Tier2 = { InfinityEmpowered, InfinityCharged, InfinityStabilized, InfinityGlowing,
                InfinityPulsating };
        RecipeMap[] Tier2R = { ELECTROMAGNETIC_SEPARATOR_RECIPES, BLAST_RECIPES, CVD_RECIPES, ARC_FURNACE_RECIPES,
                DISTILLERY_RECIPES };
        Material[] Tier2M = { VibraniumAlloy, Neutronium, RutheniumTriniumAmericiumNeutronate, Hihiirokane, Azbantium };
        OrePrefix[] Tier2P = { plate, gearSmall, wireGtHex, wireFine, stickLong };
        int[] Tier2Q = { 2, 2, 1, 32, 2 };

        Material[] Tier3 = { InfinityEternal, InfinityTranscendent, InfinityVibrant, InfinityEthereal,
                InfinityRadiant };
        RecipeMap[] Tier3R = { ASSEMBLER_RECIPES, NEBULAIC_NEXUS_RECIPES, ASSEMBLY_LINE_RECIPES, SONICATOR_RECIPES,
                HP_LASER_ARRAY_RECIPES };
        Material[] Tier3M = { AbyssalAlloy, HotHalkoniteSteel, DeepDarkSteel, InfinityCatalyst, Hypogen };
        OrePrefix[] Tier3P = { frameGt, stickLong, stick, plate, ingotHot };
        int[] Tier3Q = { 2, 2, 4, 2, 1 };

        // ~2.048 Infinity per InfCat
        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(InfinityCatalyst.getFluid(144),
                        Neutronium.getFluid(144 * 2))
                .chancedOutput(dust, InfinityPale, 8000, 0)
                .chancedOutput(dust, InfinityFleeting, 8000, 0)
                .chancedOutput(dust, InfinityShattered, 8000, 0)
                .chancedOutput(dust, InfinityInordinate, 8000, 0)
                .chancedOutput(dust, InfinityFractured, 8000, 0)
                .duration(600).EUt(VA[GTValues.UIV]).buildAndRegister();

        // ~2.56 Infinity per InfCat
        CENTRIFUGE_RECIPES.recipeBuilder()
                .notConsumable(STELLAR_ESSENCE_END)
                .fluidInputs(InfinityCatalyst.getFluid(144))
                .output(dust, InfinityPale)
                .output(dust, InfinityFleeting)
                .output(dust, InfinityShattered)
                .output(dust, InfinityInordinate)
                .output(dust, InfinityFractured)
                .duration(200).EUt(VA[GTValues.UXV]).buildAndRegister();

        for (int i = 0; i < Tier1.length; i++) {
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

        for (int i = 0; i < Tier2.length; i++) {
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

        for (int i = 0; i < Tier3.length; i++) {
            Tier3R[i].recipeBuilder()
                    .fluidInputs(Tier3[i].getFluid(144))
                    .input(Tier3P[i], Tier3M[i], Tier3Q[i])
                    .chancedOutput(dust, Infinity, 8000, 0)
                    .duration(1600).EUt(VA[GTValues.UIV]).buildAndRegister();
        }
    }
}
