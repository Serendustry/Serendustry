package serendustry.machine;

import static gregtech.api.util.RelativeDirection.*;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.recipes.RecipeMaps;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.*;
import serendustry.blocks.BlockSerendustryMultiCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;

public class MetaTileEntityAdvancedFusionReactor extends RecipeMapMultiblockController {

    public MetaTileEntityAdvancedFusionReactor(ResourceLocation rl) {
        super(rl, RecipeMaps.FUSION_RECIPES);
        this.recipeMapWorkable = new AdvancedFusionReactorWorkable(this);
    }

    @Override
    public MetaTileEntityAdvancedFusionReactor createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityAdvancedFusionReactor(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(LEFT, DOWN, FRONT)
                .aisle(
                        "          A   A          ",
                        "                         ",
                        "                         ",
                        "                         ",
                        "                         ",
                        "                         ",
                        "          A   A          ")
                .aisle(
                        "                         ",
                        "          A   A          ",
                        "          A   A          ",
                        "                         ",
                        "          A   A          ",
                        "          A   A          ",
                        "                         ")
                .aisle(
                        "      A           A      ",
                        "                         ",
                        "                         ",
                        "          AACAA          ",
                        "                         ",
                        "                         ",
                        "      A           A      ")
                .aisle(
                        "                         ",
                        "      A           A      ",
                        "      A   DDDDD   A      ",
                        "       AAABBBBBAAA       ",
                        "      A   AAAAA   A      ",
                        "      A           A      ",
                        "                         ")
                .aisle(
                        "                         ",
                        "                         ",
                        "       DDD  D  DDD       ",
                        "      ABBBAABAABBBA      ",
                        "       AAA  A  AAA       ",
                        "                         ",
                        "                         ")
                .aisle(
                        "                         ",
                        "                         ",
                        "      D     D     D      ",
                        "     ABAAA ABA AAABA     ",
                        "      A     A     A      ",
                        "                         ",
                        "                         ")
                .aisle(
                        "  A                   A  ",
                        "   A                 A   ",
                        "   A D      D      D A   ",
                        "    ABA   AABAA   ABA    ",
                        "   A A      A      A A   ",
                        "   A                 A   ",
                        "  A                   A  ")
                .aisle(
                        "                         ",
                        "                         ",
                        "    D     DDDDD     D    ",
                        "   ABA   ABBBBBA   ABA   ",
                        "    A     AAAAA     A    ",
                        "                         ",
                        "                         ")
                .aisle(
                        "                         ",
                        "                         ",
                        "    D    D  D  D    D    ",
                        "   ABA  ABAABAABA  ABA   ",
                        "    A    A  A  A    A    ",
                        "                         ",
                        "                         ")
                .aisle(
                        "                         ",
                        "                         ",
                        "    D   D   D   D   D    ",
                        "   ABA ABA ABA ABA ABA   ",
                        "    A   A   A   A   A    ",
                        "                         ",
                        "                         ")
                .aisle(
                        "A                       A",
                        " A                     A ",
                        " A D   D    D    D   D A ",
                        "  ABA ABA  ABA  ABA ABA  ",
                        " A A   A    A    A   A A ",
                        " A                     A ",
                        "A                       A")
                .aisle(
                        "                         ",
                        "                         ",
                        "   D   D   D D   D   D   ",
                        "  ABAAABAAABABAAABAAABA  ",
                        "   A   A   A A   A   A   ",
                        "                         ",
                        "                         ")
                .aisle(
                        "                         ",
                        "                         ",
                        "   DDDDDDDD   DDDDDDDD   ",
                        "  ABBBBBBBBA ABBBBBBBBA  ",
                        "   AAAAAAAA   AAAAAAAA   ",
                        "                         ",
                        "                         ")
                .aisle(
                        "                         ",
                        "                         ",
                        "   D   D   D D   D   D   ",
                        "  ABAAABAAABABAAABAAABA  ",
                        "   A   A   A A   A   A   ",
                        "                         ",
                        "                         ")
                .aisle(
                        "A                       A",
                        " A                     A ",
                        " A D   D    D    D   D A ",
                        "  ABA ABA  ABA  ABA ABA  ",
                        " A A   A    A    A   A A ",
                        " A                     A ",
                        "A                       A")
                .aisle(
                        "                         ",
                        "                         ",
                        "    D   D   D   D   D    ",
                        "   ABA ABA ABA ABA ABA   ",
                        "    A   A   A   A   A    ",
                        "                         ",
                        "                         ")
                .aisle(
                        "                         ",
                        "                         ",
                        "    D    D  D  D    D    ",
                        "   ABA  ABAABAABA  ABA   ",
                        "    A    A  A  A    A    ",
                        "                         ",
                        "                         ")
                .aisle(
                        "                         ",
                        "                         ",
                        "    D     DDDDD     D    ",
                        "   ABA   ABBBBBA   ABA   ",
                        "    A     AAAAA     A    ",
                        "                         ",
                        "                         ")
                .aisle(
                        "  A                   A  ",
                        "   A                 A   ",
                        "   A D      D      D A   ",
                        "    ABA   AABAA   ABA    ",
                        "   A A      A      A A   ",
                        "   A                 A   ",
                        "  A                   A  ")
                .aisle(
                        "                         ",
                        "                         ",
                        "      D     D     D      ",
                        "     ABAAA ABA AAABA     ",
                        "      A     A     A      ",
                        "                         ",
                        "                         ")
                .aisle(
                        "                         ",
                        "                         ",
                        "       DDD  D  DDD       ",
                        "      ABBBAABAABBBA      ",
                        "       AAA  A  AAA       ",
                        "                         ",
                        "                         ")
                .aisle(
                        "                         ",
                        "      A           A      ",
                        "      A   DDDDD   A      ",
                        "       AAABBBBBAAA       ",
                        "      A   AAAAA   A      ",
                        "      A           A      ",
                        "                         ")
                .aisle(
                        "      A           A      ",
                        "                         ",
                        "                         ",
                        "          AAAAA          ",
                        "                         ",
                        "                         ",
                        "      A           A      ")
                .aisle(
                        "                         ",
                        "          A   A          ",
                        "          A   A          ",
                        "                         ",
                        "          A   A          ",
                        "          A   A          ",
                        "                         ")
                .aisle(
                        "          A   A          ",
                        "                         ",
                        "                         ",
                        "                         ",
                        "                         ",
                        "                         ",
                        "          A   A          ")
                .where('C', selfPredicate())
                .where('A',
                        states(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                                .getState(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION))
                                        .setMinGlobalLimited(365).or(autoAbilities()))
                /*
                 * .or(metaTileEntities(Arrays
                 * .stream(MetaTileEntities.ENERGY_INPUT_HATCH)
                 * .filter(mte -> mte != null && mte.getTier() >= GTValues.UEV)
                 * .toArray(MetaTileEntity[]::new))
                 * .setPreviewCount(2).setMinGlobalLimited(1))
                 */
                .where('B',
                        states(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                                .getState(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ADV_FUSION_COIL)))
                .where('D', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)))
                .where(' ', any())
                .build();
    }

    // todo: adv fusion texture (turns partially transparent when active)
    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        if (this.recipeMapWorkable.isActive()) {
            return SerendustryTextures.CASING_ADV_FUSION_ACTIVE;
        } else {
            return SerendustryTextures.CASING_ADV_FUSION;
        }
    }

    // todo: big laser rendering

    protected class AdvancedFusionReactorWorkable extends MultiblockRecipeLogic {

        public AdvancedFusionReactorWorkable(RecipeMapMultiblockController tileEntity) {
            super(tileEntity);
        }

        @Override
        public int getParallelLimit() {
            return 32;
        }
    }
}
