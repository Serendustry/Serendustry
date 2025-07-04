package serendustry.recipe;

import static gregtech.api.GTValues.HV;
import static gregtech.api.GTValues.MV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.BLAST_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CENTRIFUGE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_BATH_RECIPES;
import static gregtech.api.recipes.RecipeMaps.VACUUM_RECIPES;
import static gregtech.api.unification.material.Materials.Bone;
import static gregtech.api.unification.material.Materials.DarkAsh;
import static gregtech.api.unification.material.Materials.Diamond;
import static gregtech.api.unification.material.Materials.Gold;
import static gregtech.api.unification.material.Materials.Lava;
import static gregtech.api.unification.material.Materials.Meat;
import static gregtech.api.unification.material.Materials.Netherrack;
import static gregtech.api.unification.ore.OrePrefix.block;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.gem;
import static gregtech.api.unification.ore.OrePrefix.gemExquisite;
import static gregtech.api.unification.ore.OrePrefix.gemFlawless;
import static gregtech.api.unification.ore.OrePrefix.ingot;
import static gregtech.api.unification.ore.OrePrefix.ingotHot;
import static gregtech.api.unification.ore.OrePrefix.nugget;
import static serendustry.item.material.SerendustryMaterials.Netherite;
import static serendustry.item.material.SerendustryMaterials.NetheritePoorAncientDebris;
import static serendustry.item.material.SerendustryMaterials.NetheriteRichAncientDebris;
import static serendustry.item.material.SerendustryMaterials.NetherizedDiamond;
import static serendustry.item.material.SerendustryMaterials.RawAncientDebris;

import gregtech.api.unification.ore.OrePrefix;

public class NetheriteChain {

    public static void init() {
        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, RawAncientDebris)
                .chancedOutput(dust, Netherrack, 6000, 0)
                .chancedOutput(dust, NetheritePoorAncientDebris, 4000, 0)
                .chancedOutput(dust, NetheriteRichAncientDebris, 2000, 0)
                .duration(20).EUt(VA[HV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, NetheritePoorAncientDebris)
                .chancedOutput(dust, Netherrack, 3500, 0)
                .chancedOutput(dust, RawAncientDebris, 2000, 0)
                .chancedOutput(dust, Bone, 1500, 0)
                .chancedOutput(dust, Meat, 1500, 0)
                .chancedOutput(dust, DarkAsh, 1500, 0)
                .chancedOutput(dust, NetheriteRichAncientDebris, 1000, 0)
                .duration(30).EUt(VA[HV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, NetheriteRichAncientDebris)
                .fluidInputs(Lava.getFluid(50))
                .output(ingotHot, NetheriteRichAncientDebris)
                .blastFurnaceTemp(3600)
                .duration(500).EUt(VA[HV]).buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .input(ingotHot, NetheriteRichAncientDebris)
                .output(ingot, NetheriteRichAncientDebris)
                .duration(282).EUt(VA[MV]).buildAndRegister();

        OrePrefix[] parts = { nugget, ingot, block };
        float[] cost = { 0.112f, 1.0f, 9.0F };

        for (int i = 0; i < parts.length; i++) {
            CHEMICAL_BATH_RECIPES.recipeBuilder()
                    .input(parts[i], NetheriteRichAncientDebris)
                    .fluidInputs(Gold.getFluid((int) (144 * 4 * cost[i])))
                    .output(parts[i], Netherite)
                    .duration((int) (500 * cost[i])).EUt(VA[HV]).buildAndRegister();
        }

        OrePrefix[] gems = { gem, gemFlawless, gemExquisite };
        int[] value = { 1, 2, 4 };

        for (int i = 0; i < gems.length; i++) {
            CHEMICAL_BATH_RECIPES.recipeBuilder()
                    .input(gems[i], Diamond)
                    .fluidInputs(Netherite.getFluid(144 * value[i]))
                    .output(gems[i], NetherizedDiamond)
                    .duration(20 * 4 * value[i]).EUt(VA[HV]).buildAndRegister();
        }
    }
}
