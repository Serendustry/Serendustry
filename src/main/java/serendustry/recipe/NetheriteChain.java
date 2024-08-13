package serendustry.recipe;

import static gregtech.api.GTValues.HV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static serendustry.item.material.SerendustryMaterials.*;

public class NetheriteChain {
    public static void init() {
        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, RawAncientDebris, 3)
                .output(dust, NetheriteRichAncientDebris)
                .output(dust, NetheritePoorAncientDebris, 2)
                .duration(60).EUt(VA[HV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, NetheritePoorAncientDebris, 9)
                .output(dust, Netherrack, 3)
                .output(dust, RawAncientDebris, 2)
                .output(dust, Bone)
                .output(dust, Meat)
                .output(dust, DarkAsh)
                .output(dust, NetheriteRichAncientDebris)
                .duration(270).EUt(VA[HV]).buildAndRegister();

        // todo: remove normal EBF recipe
        BLAST_RECIPES.recipeBuilder()
                .input(dust, NetheriteRichAncientDebris)
                .fluidInputs(Lava.getFluid(50))
                .output(ingotHot, NetheriteRichAncientDebris)
                .blastFurnaceTemp(3600)
                .duration(500).EUt(VA[HV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(ingot, NetheriteRichAncientDebris)
                .fluidInputs(Gold.getFluid(576))
                .output(ingot, Netherite)
                .duration(500).EUt(VA[HV]).buildAndRegister();
    }
}
