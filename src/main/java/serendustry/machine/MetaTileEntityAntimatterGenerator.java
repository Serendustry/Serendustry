package serendustry.machine;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.GTValues;
import gregtech.api.capability.IEnergyContainer;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.FuelMultiblockController;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.MultiblockDisplayText;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.SValues;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.client.utils.STooltipHelper;

public class MetaTileEntityAntimatterGenerator extends FuelMultiblockController {

    private final int tier;

    public static final String[][] TEMP = { {
            "XXX", "XXX", "XXX" },
            {
                    "XXX", "XXX", "XXX" },
            {
                    "XXX", "XSO", "XXX" } };

    public MetaTileEntityAntimatterGenerator(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.ANTIMATTER_GENERATOR_FUELS, GTValues.UHV); // todo balance and stuff
        this.tier = GTValues.UHV;
        this.recipeMapWorkable.setMaximumOverclockVoltage(GTValues.V[tier]);
    }

    @Override
    public MetaTileEntityAntimatterGenerator createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityAntimatterGenerator(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);

        List<IEnergyContainer> energyOutput = new ArrayList<>(getAbilities(MultiblockAbility.OUTPUT_ENERGY));
        List<IEnergyContainer> substationOutput = new ArrayList<>(
                getAbilities(MultiblockAbility.SUBSTATION_OUTPUT_ENERGY));
        List<IEnergyContainer> laserOutput = new ArrayList<>(getAbilities(MultiblockAbility.OUTPUT_LASER));

        // Allow only 1 type of energy input at a time
        if ((!energyOutput.isEmpty() && !substationOutput.isEmpty()) ||
                (!energyOutput.isEmpty() && !laserOutput.isEmpty()) ||
                (!substationOutput.isEmpty() && !laserOutput.isEmpty())) {
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

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(/* LEFT, DOWN, FRONT */);

        for (String[] aisle : TEMP) {
            pattern.aisle(aisle);
        }

        pattern.where('S', selfPredicate())
                .where('X', states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.PTFE_INERT_CASING))
                        .setMinGlobalLimited(1).or(autoAbilities(false, false, false, false, true, false, false)))
                .where('O', abilities(MultiblockAbility.OUTPUT_ENERGY).setPreviewCount(0).setMinGlobalLimited(0)
                        .setMaxGlobalLimited(1).or(abilities(MultiblockAbility.SUBSTATION_OUTPUT_ENERGY)
                                .setPreviewCount(0).setMinGlobalLimited(0).setMaxGlobalLimited(1)
                                .or(abilities(MultiblockAbility.OUTPUT_LASER).setPreviewCount(1).setMinGlobalLimited(0)
                                        .setMaxGlobalLimited(1)))); // todo ceu update so this works

        return pattern.build();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return SerendustryTextures.CASING_NEUTRONIUM;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        tooltip.add(I18n.format("gregtech.universal.tooltip.base_production_eut", GTValues.V[tier]));
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_LASER, false); // todo
    }

    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        MultiblockDisplayText.builder(textList, isStructureFormed())
                .setWorkingStatus(recipeMapWorkable.isWorkingEnabled(), recipeMapWorkable.isActive())
                .addEnergyProductionAmpsLine(GTValues.V[tier], 1);
    }

    @Override
    protected boolean shouldShowVoidingModeButton() {
        return false;
    }

    @Override
    public long getMaxVoltage() {
        return GTValues.V[tier];
    }
}
