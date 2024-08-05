package serendustry.machine;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.Widget;
import gregtech.api.gui.widgets.SlotWidget;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.metatileentity.multiblock.MultiblockDisplayText;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.recipeproperties.TemperatureProperty;
import gregtech.api.util.GTUtility;
import gregtech.api.util.TextComponentUtil;
import gregtech.api.util.TextFormattingUtil;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.MetaBlocks;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Objects;

import static gregtech.api.util.GTUtility.getMetaTileEntity;
import static serendustry.item.SerendustryMetaItems.*;

public class MetaTileEntityPlasmaFoundry extends RecipeMapMultiblockController {

    private ItemStackHandler controllerSlot;

    String catalyst = "gregtech.chance_logic.none";
    MetaItem.MetaValueItem[] Catalysts = { CATALYST_STEELS, CATALYST_COPPER_ALLOYS, CATALYST_TIN_ALLOYS, CATALYST_GOLD_ALLOYS, CATALYST_BATTERY_ALLOY, CATALYST_SOLDERING_ALLOYS, CATALYST_PLATINUM_GROUP_ALLOYS, CATALYST_NAQUADAH_ALLOYS, CATALYST_SUPERCONDUCTORS, CATALYST_HAM_ALLOY, CATALYST_ARCANITE };
    String[] CatalystKeys = { "metaitem.catalyst_steels.name", "metaitem.catalyst_copper_alloys.name", "metaitem.catalyst_tin_alloys.name", "metaitem.catalyst_gold_alloys.name", "metaitem.catalyst_battery_alloy.name", "metaitem.catalyst_soldering_alloys.name", "metaitem.catalyst_platinum_group_alloys.name", "metaitem.catalyst_naquadah_alloys.name", "metaitem.catalyst_superconductors.name", "metaitem.catalyst_ham_alloy.name", "metaitem.catalyst_arcanite.name"};
    int CATALYST = 32842846;

    public MetaTileEntityPlasmaFoundry(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.PLASMA_FOUNDRY_RECIPES);
        controllerSlot = new ItemStackHandler(1);
    }

    @Override
    public boolean checkRecipe(@NotNull Recipe recipe, boolean consumeIfSuccess) {
        return this.blastFurnaceTemperature >= recipe.getProperty(PlasmaFoundryCatalystProperty.getInstance(), 0);
    }
    
    @Override
    public @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX")
                .aisle("XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX")
                .aisle("XXX", "XXX", "XXX", "XXX", "XSX", "XXX", "XXX", "XXX", "XXX")
                .where('S', selfPredicate())
                .where('X', states(getCasingState()).setMinGlobalLimited(40).or(autoAbilities()))
                .build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return Textures.INERT_PTFE_CASING; // todo
    }

    // todo: add custom ??? Casing
    private IBlockState getCasingState() {
        return MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.UV);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, @NotNull List<String> tooltip,
                               boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        tooltip.add(I18n.format("serendustry.machine.plasma_foundry.flavor"));
        tooltip.add(I18n.format("serendustry.machine.plasma_foundry.description"));
        String catalyst = "gregtech.chance_logic.none";
        NBTTagCompound tag = stack.getTagCompound();
        if (tag != null) {
            catalyst = tag.getString("Catalyst");
        }
        tooltip.add(I18n.format("serendustry.machine.plasma_foundry.catalyst") + " " + "§e" + I18n.format(catalyst) + "§7");
    }

    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        MultiblockDisplayText.builder(textList, isStructureFormed())
                .setWorkingStatus(recipeMapWorkable.isWorkingEnabled(), recipeMapWorkable.isActive())
                .addEnergyUsageLine(getEnergyContainer())
                .addEnergyTierLine(GTUtility.getTierByVoltage(recipeMapWorkable.getMaxVoltage()))
                .addCustom(tl -> {
                    // Catalyst line
                        tl.add(TextComponentUtil.translationWithColor(
                                TextFormatting.GRAY,
                                "serendustry.machine.plasma_foundry.catalyst"));

                    tl.add(TextComponentUtil.translationWithColor(
                            TextFormatting.GRAY,
                            catalyst));
                })
                .addWorkingStatusLine()
                .addProgressLine(recipeMapWorkable.getProgressPercent());
    }

    @Override
    protected Widget getFlexButton(int x, int y, int width, int height) {
        return new SlotWidget(controllerSlot, 0, x, y, true, true).setBackgroundTexture(GuiTextures.SLOT);
    }
    protected ItemStack getStackInSlot() {
        return controllerSlot.getStackInSlot(0);
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound data) {
        super.writeToNBT(data);
        GTUtility.writeItems(controllerSlot, "ControllerSlot", data);
        data.setString("Catalyst", this.catalyst);
        return data;
    }

    @Override
    public void readFromNBT(NBTTagCompound data) {
        super.readFromNBT(data);
        GTUtility.readItems(controllerSlot, "ControllerSlot", data);
        this.catalyst = data.getString("Catalyst");
    }

    @Override
    public void initFromItemStackData(NBTTagCompound data) {
        super.initFromItemStackData(data);
        this.catalyst = data.getString("Catalyst");
    }

    @Override
    public void writeItemStackData(NBTTagCompound data) {
        super.writeItemStackData(data);
        data.setString("Catalyst", this.catalyst);
    }

    @Override
    public void onRemoval() {
        Block.spawnAsEntity(getWorld(), getPos(), getStackInSlot());
    }

    @Override
    public void update() {
        super.update();
        if(getWorld().isRemote) return;
        if(Objects.equals(catalyst, "gregtech.chance_logic.none")) {
            for (int i = 0; i < Catalysts.length; i++) {
                if (ItemStack.areItemsEqual(getStackInSlot(), Catalysts[i].getStackForm())) {
                    ItemStack stack = controllerSlot.getStackInSlot(0);
                    stack = stack.copy();
                    stack.setCount(stack.getCount() - 1);
                    controllerSlot.setStackInSlot(0, stack);

                    catalyst = CatalystKeys[i];
                    writeCustomData(CATALYST, w -> w.writeString(catalyst));
                    return;
                }
            }
        }
    }

    @Override
    public void receiveCustomData(int dataId, PacketBuffer buf) {
        super.receiveCustomData(dataId, buf);
        if (dataId == CATALYST) {
            catalyst = buf.readString(35); // Arbitrary number that's big enough
        }
    }
}
