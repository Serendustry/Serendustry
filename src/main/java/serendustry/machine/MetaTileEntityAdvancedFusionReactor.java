package serendustry.machine;

import gregtech.api.GTValues;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.ParallelLogicType;
import gregtech.api.recipes.RecipeMaps;
import gregtech.common.blocks.*;
import gregtech.common.metatileentities.MetaTileEntities;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;

import java.util.Arrays;

import static gregtech.api.util.RelativeDirection.*;

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
                        "          A   A          "
                ).aisle(
                        "                         ",
                        "          A   A          ",
                        "          A   A          ",
                        "                         ",
                        "          A   A          ",
                        "          A   A          ",
                        "                         "
                ).aisle(
                        "      A           A      ",
                        "                         ",
                        "                         ",
                        "          AACAA          ",
                        "                         ",
                        "                         ",
                        "      A           A      "
                ).aisle(
                        "                         ",
                        "      A           A      ",
                        "      A   AAAAA   A      ",
                        "       AAABBBBBAAA       ",
                        "      A   AAAAA   A      ",
                        "      A           A      ",
                        "                         "
                ).aisle(
                        "                         ",
                        "                         ",
                        "       AAA  A  AAA       ",
                        "      ABBBAABAABBBA      ",
                        "       AAA  A  AAA       ",
                        "                         ",
                        "                         "
                ).aisle(
                        "                         ",
                        "                         ",
                        "      A     A     A      ",
                        "     ABAAA ABA AAABA     ",
                        "      A     A     A      ",
                        "                         ",
                        "                         "
                ).aisle(
                        "  A                   A  ",
                        "   A                 A   ",
                        "   A A      A      A A   ",
                        "    ABA   AABAA   ABA    ",
                        "   A A      A      A A   ",
                        "   A                 A   ",
                        "  A                   A  "
                ).aisle(
                        "                         ",
                        "                         ",
                        "    A     AAAAA     A    ",
                        "   ABA   ABBBBBA   ABA   ",
                        "    A     AAAAA     A    ",
                        "                         ",
                        "                         "
                ).aisle(
                        "                         ",
                        "                         ",
                        "    A    A  A  A    A    ",
                        "   ABA  ABAABAABA  ABA   ",
                        "    A    A  A  A    A    ",
                        "                         ",
                        "                         "
                ).aisle(
                        "                         ",
                        "                         ",
                        "    A   A   A   A   A    ",
                        "   ABA ABA ABA ABA ABA   ",
                        "    A   A   A   A   A    ",
                        "                         ",
                        "                         "
                ).aisle(
                        "A                       A",
                        " A                     A ",
                        " A A   A    A    A   A A ",
                        "  ABA ABA  ABA  ABA ABA  ",
                        " A A   A    A    A   A A ",
                        " A                     A ",
                        "A                       A"
                ).aisle(
                        "                         ",
                        "                         ",
                        "   A   A   A A   A   A   ",
                        "  ABAAABAAABABAAABAAABA  ",
                        "   A   A   A A   A   A   ",
                        "                         ",
                        "                         "
                ).aisle(
                        "                         ",
                        "                         ",
                        "   AAAAAAAA   AAAAAAAA   ",
                        "  ABBBBBBBBA ABBBBBBBBA  ",
                        "   AAAAAAAA   AAAAAAAA   ",
                        "                         ",
                        "                         "
                ).aisle(
                        "                         ",
                        "                         ",
                        "   A   A   A A   A   A   ",
                        "  ABAAABAAABABAAABAAABA  ",
                        "   A   A   A A   A   A   ",
                        "                         ",
                        "                         "
                ).aisle(
                        "A                       A",
                        " A                     A ",
                        " A A   A    A    A   A A ",
                        "  ABA ABA  ABA  ABA ABA  ",
                        " A A   A    A    A   A A ",
                        " A                     A ",
                        "A                       A"
                ).aisle(
                        "                         ",
                        "                         ",
                        "    A   A   A   A   A    ",
                        "   ABA ABA ABA ABA ABA   ",
                        "    A   A   A   A   A    ",
                        "                         ",
                        "                         "
                ).aisle(
                        "                         ",
                        "                         ",
                        "    A    A  A  A    A    ",
                        "   ABA  ABAABAABA  ABA   ",
                        "    A    A  A  A    A    ",
                        "                         ",
                        "                         "
                ).aisle(
                        "                         ",
                        "                         ",
                        "    A     AAAAA     A    ",
                        "   ABA   ABBBBBA   ABA   ",
                        "    A     AAAAA     A    ",
                        "                         ",
                        "                         "
                ).aisle(
                        "  A                   A  ",
                        "   A                 A   ",
                        "   A A      A      A A   ",
                        "    ABA   AABAA   ABA    ",
                        "   A A      A      A A   ",
                        "   A                 A   ",
                        "  A                   A  "
                ).aisle(
                        "                         ",
                        "                         ",
                        "      A     A     A      ",
                        "     ABAAA ABA AAABA     ",
                        "      A     A     A      ",
                        "                         ",
                        "                         "
                ).aisle(
                        "                         ",
                        "                         ",
                        "       AAA  A  AAA       ",
                        "      ABBBAABAABBBA      ",
                        "       AAA  A  AAA       ",
                        "                         ",
                        "                         "
                ).aisle(
                        "                         ",
                        "      A           A      ",
                        "      A   AAAAA   A      ",
                        "       AAABBBBBAAA       ",
                        "      A   AAAAA   A      ",
                        "      A           A      ",
                        "                         "
                ).aisle(
                        "      A           A      ",
                        "                         ",
                        "                         ",
                        "          AAAAA          ",
                        "                         ",
                        "                         ",
                        "      A           A      "
                ).aisle(
                        "                         ",
                        "          A   A          ",
                        "          A   A          ",
                        "                         ",
                        "          A   A          ",
                        "          A   A          ",
                        "                         "
                ).aisle(
                        "          A   A          ",
                        "                         ",
                        "                         ",
                        "                         ",
                        "                         ",
                        "                         ",
                        "          A   A          "
                )
                .where('C', selfPredicate())
                .where('A', states(getCasingState()).setMinGlobalLimited(464).or(metaTileEntities(Arrays
                        .stream(MetaTileEntities.ENERGY_INPUT_HATCH)
                        .filter(mte -> mte != null && mte.getTier() >= GTValues.UEV)
                        .toArray(MetaTileEntity[]::new))
                        .setPreviewCount(2).setMinGlobalLimited(1))
                        .or(abilities(MultiblockAbility.EXPORT_FLUIDS).setPreviewCount(1).setMinGlobalLimited(1))
                        .or(abilities(MultiblockAbility.IMPORT_FLUIDS).setPreviewCount(2).setMinGlobalLimited(2)))
                .where('B', states(getCoilState()))
                .where(' ', any())
                .build();
    }

    // todo: adv fusion casing
    private IBlockState getCasingState() {
        return MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_CASING_MK3);
    }

    // todo: adv fusion coil
    private IBlockState getCoilState() {
        return MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_COIL);
    }

    // todo: adv fusion texture (turns partially transparent when active)
    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        if (this.recipeMapWorkable.isActive()) {
            return Textures.ACTIVE_FUSION_TEXTURE;
        } else {
            return Textures.FUSION_TEXTURE;
        }
    }

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
