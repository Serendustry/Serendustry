package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gregtech.common.metatileentities.MetaTileEntities.HULL;
import static net.minecraft.init.Blocks.*;
import static serendustry.item.SerendustryMetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.*;
import static serendustry.machine.SerendustryRecipeMaps.LABORATORY_RECIPES;

import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.chance.output.ChancedOutputLogic;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.init.Items;

public class HalkoniteSteelRecipes {

    public static void init() {

        OrePrefix[] parts = { plate, stick, stickLong, bolt, screw, gear, gearSmall, rotor, plateDense, ring };
        float[] cost = { 1.0f, 0.5f, 1.0f, 0.125f, 0.125f, 4.0f, 1.0f,  5.0f, 9.0f, 0.25F};

        for (int i = 0; i < parts.length; i++) {
            CHEMICAL_BATH_RECIPES.recipeBuilder()
                    .input(parts[i], Neutronium)
                    .fluidInputs(HalkonitePreparationBase.getFluid((int) (144.0f * cost[i])))
                    .output(parts[i], HalkoniteSteel)
                    .duration((int) (600 * cost[i])).EUt(VA[UV]).buildAndRegister();
        }
    }
}
