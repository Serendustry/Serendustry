package serendustry.machine;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.capability.IEnergyContainer;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.SValues;
import serendustry.blocks.SBlockActiveMultiCasing;
import serendustry.blocks.SBlockGlassCasing;
import serendustry.blocks.SBlockMetalCasing;
import serendustry.blocks.SBlockMultiCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.client.utils.STooltipHelper;
import serendustry.machine.structure.StructureEmpyrean1;
import serendustry.machine.structure.StructureEmpyrean2;

public class MetaTileEntityEmpyrean extends RecipeMapMultiblockController {

    public MetaTileEntityEmpyrean(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, SerendustryRecipeMaps.EMPYREAN_RECIPES);
        this.recipeMapWorkable = new MultiblockRecipeLogic(this, true);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityEmpyrean(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);

        List<IEnergyContainer> energyInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
        List<IEnergyContainer> substationInput = new ArrayList<>(
                getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));
        List<IEnergyContainer> laserInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_LASER));

        // Allow only 1 type of energy input at a time
        if ((!energyInput.isEmpty() && !substationInput.isEmpty()) ||
                (!energyInput.isEmpty() && !laserInput.isEmpty()) ||
                (!substationInput.isEmpty() && !laserInput.isEmpty())) {
            invalidateStructure();
        }

        // todo: give error message to multiblock builder

        /*
         * List<IEnergyContainer> powerInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
         * powerInput.addAll(getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));
         * powerInput.addAll(getAbilities(MultiblockAbility.INPUT_LASER));
         *
         * this.powerInput = new EnergyContainerList(powerInput);
         */  // todo: update ceu so this works and check if this even needed
    }

    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        // Split into 2 parts so it doesn't throw code too large
        for (String[] aisle : StructureEmpyrean1.EMPYREAN_1) {
            pattern.aisle(aisle);
        }
        for (String[] aisle : StructureEmpyrean2.EMPYREAN_2) {
            pattern.aisle(aisle);
        }

        pattern.where('D', selfPredicate())
                .where('A', states(SerendustryMetaBlocks.S_ACTIVE_MULTI_CASING.getState(SBlockActiveMultiCasing.SActiveMultiCasingType.EMPYREAN_CORE)))
                .where('B',
                        states(SerendustryMetaBlocks.S_METAL_CASING
                                .getState(SBlockMetalCasing.SMetalCasingType.NEUTRONIUM)).setMinGlobalLimited(20135)
                                .or(autoAbilities(false, false, true, true, true, true, false))
                                .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0).setMinGlobalLimited(0)
                                        .setMaxGlobalLimited(1))
                                .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(0)
                                        .setMaxGlobalLimited(1))
                                .or(abilities(MultiblockAbility.INPUT_LASER).setPreviewCount(1)
                                        .setMaxGlobalLimited(1)))
                .where('C', states(SerendustryMetaBlocks.S_GLASS_CASING.getState(SBlockGlassCasing.SGlassCasingType.EMPYREAN_GLASS)));

        return pattern.build();
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return SerendustryTextures.CASING_NEUTRONIUM;
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_LASER, true);
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return SerendustryTextures.OVERLAY_EMPYREAN;
    }
}
