package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static serendustry.item.SerendustryMetaItems.HKSP_BC;
import static serendustry.item.SerendustryMetaItems.HKSP_C;
import static serendustry.item.SerendustryMetaItems.HKSP_DD;
import static serendustry.item.SerendustryMetaItems.HKSP_F;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_BEYOND;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_NETHER;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryRecipeMaps.ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.NEBULAIC_NEXUS_RECIPES;

import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.ore.OrePrefix;

public class HalkoniteSteelRecipes {

    public static void init() {
        OrePrefix[] parts = { plate, stick, stickLong, bolt, screw, gear, gearSmall, rotor, plateDense, ring, round };
        float[] cost = { 1.0f, 0.5f, 1.0f, 0.125f, 0.125f, 4.0f, 1.0f, 5.0f, 9.0f, 0.25f, 0.112f };

        for (int i = 0; i < parts.length; i++) {
            CHEMICAL_BATH_RECIPES.recipeBuilder()
                    .input(parts[i], Neutronium)
                    .fluidInputs(HalkonitePreparationBase.getFluid((int) (144 * cost[i])),
                            Tritanium.getFluid((int) (144 * cost[i] * 2)))
                    .output(parts[i], HotHalkoniteSteel)
                    .duration((int) (800 * cost[i])).EUt(VA[UV]).buildAndRegister();

            CHEMICAL_BATH_RECIPES.recipeBuilder()
                    .notConsumable(STELLAR_ESSENCE_NETHER)
                    .input(parts[i], Neutronium)
                    .fluidInputs(HalkonitePreparationBase.getFluid((int) (144 * cost[i])))
                    .output(parts[i], HotHalkoniteSteel)
                    .duration((int) (600 * cost[i])).EUt(VA[UV]).buildAndRegister();

            VACUUM_RECIPES.recipeBuilder()
                    .input(parts[i], HotHalkoniteSteel)
                    .fluidInputs(Helium.getFluid(FluidStorageKeys.LIQUID, (int) (1000 * cost[i])))
                    .output(parts[i], HalkoniteSteel)
                    .fluidOutputs(Helium.getFluid((int) (500 * cost[i])))
                    .duration((int) (600 * cost[i])).EUt(VA[UV]).buildAndRegister();

            CHEMICAL_BATH_RECIPES.recipeBuilder()
                    .input(parts[i], DeepDarkSteel)
                    .fluidInputs(ExoHalkoniteBase.getFluid((int) (144 * cost[i])),
                            Taranium.getFluid((int) (144 * cost[i] * 2)))
                    .output(parts[i], HotExoHalkoniteSteel)
                    .duration((int) (1200 * cost[i])).EUt(VA[UXV]).buildAndRegister();

            CHEMICAL_BATH_RECIPES.recipeBuilder()
                    .notConsumable(STELLAR_ESSENCE_BEYOND)
                    .input(parts[i], DeepDarkSteel)
                    .fluidInputs(ExoHalkoniteBase.getFluid((int) (144 * cost[i])))
                    .output(parts[i], HotExoHalkoniteSteel)
                    .duration((int) (900 * cost[i])).EUt(VA[UXV]).buildAndRegister();

            VACUUM_RECIPES.recipeBuilder()
                    .input(parts[i], HotExoHalkoniteSteel)
                    .fluidInputs(BlackStarMatter.getFluid((int) (1000 * cost[i])))
                    .output(parts[i], ExoHalkoniteSteel)
                    .duration((int) (900 * cost[i])).EUt(VA[UXV]).buildAndRegister();
        }

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .input(plate, HalkoniteSteel)
                .fluidInputs(ChromaticGlass.getPlasma(144 * 64),
                        Neutronium.getPlasma(144 * 64),
                        Realitium.getFluid(100))
                .output(HKSP_DD)
                .duration(20 * 60 * 10 * 4).EUt(VA[UXV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(HKSP_DD)
                .fluidInputs(Dragonblood.getPlasma(144 * 64),
                        Draconium.getPlasma(144 * 64))
                .output(HKSP_C)
                .blastFurnaceTemp(10800)
                .duration(20 * 60 * 10).EUt(VA[UXV]).buildAndRegister();

        ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES.recipeBuilder()
                .input(HKSP_C)
                .output(HKSP_BC)
                .duration(20 * 60 * 10 * 4).EUt(VA[UXV]).buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .input(HKSP_BC)
                .output(HKSP_F, 4)
                .duration(20 * 60 * 10).EUt(VA[UXV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .input(HKSP_F)
                .fluidInputs(Infinity.getPlasma(144 * 16),
                        AwakenedDraconium.getPlasma(144 * 16))
                .output(dust, DarkAsh)
                .fluidOutputs(UnrealGoop.getFluid(250))
                .duration(20 * 60 * 10).EUt(VA[UXV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .notConsumable(lens, Dilithium)
                .fluidInputs(UnrealGoop.getFluid(1000),
                        Hypogen.getPlasma(144 * 16),
                        Realitium.getFluid(100))
                .fluidOutputs(ExoticUnreality.getFluid(1000))
                .duration(20 * 60 * 10 * 4).EUt(VA[UXV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .input(gemExquisite, Dilithium)
                .fluidInputs(ExoticUnreality.getFluid(1000),
                        Realitium.getFluid(100))
                .output(dust, Trilithium)
                .duration(20 * 60 * 2).EUt(VA[UXV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .input(gemExquisite, Trilithium)
                .fluidInputs(Rhugnor.getPlasma(144 * 4),
                        Realitium.getFluid(25))
                .fluidOutputs(ExoticUnreality.getFluid(1000),
                        TrilithiumResin.getFluid(1500))
                .duration(20 * 60 * 4).EUt(VA[UXV]).buildAndRegister();

        NEBULAIC_NEXUS_RECIPES.recipeBuilder()
                .notConsumable(lens, Trilithium)
                .input(gemExquisite, Dilithium)
                .fluidInputs(ExoticUnreality.getFluid(50),
                        TrilithiumResin.getFluid(50))
                .output(dust, Trilithium)
                .duration(20 * 60).EUt(VA[UXV]).buildAndRegister();

        /*
         * 1kL ExU needs 25 Realitium + ~5.25 Trilithium
         * 5.25 Trilithium needs 262.5 ExU
         * 1kL ExU needs 262.5 ExU
         * 1kL ExU is really 737.5 ExU, a >25% tax
         * 1kL ExU (1,355.9L ExU) makes 16 EHK
         * 1,355.9 / 16 = 84.74L ExU makes 1 EHK
         * 84.74L ExU (1 EHK) needs 2.1185 Realitium
         */
    }
}
