package serendustry.recipe;

import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.unification.material.Materials.RocketFuel;
import static gregtech.api.unification.ore.OrePrefix.ore;
import static serendustry.item.SerendustryMetaItems.DEEP_DARK_HARVESTING_DRONE;
import static serendustry.item.SerendustryMetaItems.DEEP_DARK_PLANETOID_DATA;
import static serendustry.item.SerendustryMetaItems.SPACEWEED;
import static serendustry.machine.SerendustryRecipeMaps.SPACE_ELEVATOR_RECIPES;

import net.minecraft.init.Blocks;

import gregtech.api.GregTechAPI;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.PropertyKey;

public class DeepDarkPlanetoid {

    static Material[] materials = GregTechAPI.materialManager.getRegisteredMaterials().toArray(new Material[0]);

    public static void init() {
        SimpleRecipeBuilder builder = SPACE_ELEVATOR_RECIPES.recipeBuilder();

        builder.input(DEEP_DARK_HARVESTING_DRONE)
                .input(DEEP_DARK_PLANETOID_DATA)
                .fluidInputs(RocketFuel.getFluid(120000));

        for (Material material : materials) {
            if (material.hasProperty(PropertyKey.ORE)) {
                builder.output(ore, material, 64);
            }
        }

        builder.output(Blocks.COBBLESTONE, 64 * 4096)
                .output(Blocks.STONE, 64 * 4096)
                .output(Blocks.NETHERRACK, 64 * 8192)
                .output(Blocks.END_STONE, 64 * 8192)
                .output(Blocks.OBSIDIAN, 64 * 1024)
                .output(SPACEWEED, 480)
                .duration(96000).EUt(VA[UV]).buildAndRegister();
    }
}
