package serendustry.machine;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.block.IHeatingCoilBlockStats;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockDisplayText;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.unification.material.Materials;
import gregtech.api.util.GTUtility;
import gregtech.api.util.TextComponentUtil;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.SValues;
import serendustry.blocks.BlockMetalCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.client.utils.STooltipHelper;
import serendustry.machine.structure.StructureDefinition;

public class MetaTileEntityCrystallizer extends RecipeMapMultiblockController {

    private int coilTier = 0;
    private int recipeTime = 100;

    public MetaTileEntityCrystallizer(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.CRYSTALLIZER_RECIPES);
    }

    @Override
    public MetaTileEntityCrystallizer createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityCrystallizer(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);
        Object type = context.get("CoilType");
        if (type instanceof IHeatingCoilBlockStats) {
            // Only count coils Naq+
            this.coilTier = Math.max(0, ((IHeatingCoilBlockStats) type).getTier() - 4);
        } else {
            this.coilTier = 0;
        }

        // 20% faster for each tier past HSS-G (so 40% recipe duration with Tritanium)
        recipeTime = 100 - (coilTier * 20);
        recipeMapWorkable.setSpeedBonus((double) Math.max(20, recipeTime) / 100);
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
        this.coilTier = 0;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        for (String[] aisle : StructureDefinition.CRYSTALLIZER) {
            pattern.aisle(aisle);
        }

        pattern.where('E', selfPredicate())
                .where('A', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)))
                .where('B', heatingCoils())
                .where('C', states(SerendustryMetaBlocks.METAL_CASING
                        .getState(BlockMetalCasing.SerendustryMetalCasingType.CARBON))
                                .setMinGlobalLimited(180).or(autoAbilities()))
                .where('D', frames(Materials.Scandium));

        return pattern.build();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return SerendustryTextures.CASING_CARBON;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_REGULAR, false);
    }

    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        MultiblockDisplayText.Builder builder = MultiblockDisplayText.builder(textList, isStructureFormed())
                .setWorkingStatus(recipeMapWorkable.isWorkingEnabled(), recipeMapWorkable.isActive())
                .addEnergyUsageLine(getEnergyContainer())
                .addEnergyTierLine(GTUtility.getTierByVoltage(recipeMapWorkable.getMaxVoltage()))

                // Recipe duration line
                .addCustom(tl -> {
                    if (isStructureFormed()) {
                        ITextComponent recipeTimeText = TextComponentUtil.stringWithColor(TextFormatting.YELLOW,
                                recipeTime + "%");

                        tl.add(TextComponentUtil.translationWithColor(TextFormatting.GRAY,
                                "serendustry.machine.crystallizer.recipe_duration", recipeTimeText));
                    }
                });

        builder.addWorkingStatusLine()
                .addProgressLine(recipeMapWorkable.getProgressPercent());
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return SerendustryTextures.OVERLAY_CRYSTALLIZER;
    }
}
