package serendustry.machine;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

import java.io.IOException;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentBase;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemStackHandler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.Widget;
import gregtech.api.gui.widgets.SlotWidget;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockDisplayText;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.recipes.Recipe;
import gregtech.api.unification.material.Materials;
import gregtech.api.util.GTUtility;
import gregtech.api.util.TextComponentUtil;
import gregtech.client.renderer.ICubeRenderer;
import serendustry.SValues;
import serendustry.blocks.BlockMetalCasing;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.machine.structure.StructureDefinition;

public class MetaTileEntityPlasmaFoundry extends RecipeMapMultiblockController {

    private static final String NO_CATALYST = "serendustry.machine.plasma_foundry.no_catalyst";
    private final int CATALYST = 32842846;

    private ItemStackHandler controllerSlot;

    @NotNull
    private ItemStack catalyst = ItemStack.EMPTY;

    public MetaTileEntityPlasmaFoundry(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.PLASMA_FOUNDRY_RECIPES);
        itemInventory = controllerSlot = new ItemStackHandler(1);
    }

    @Override
    public MetaTileEntityPlasmaFoundry createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityPlasmaFoundry(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public boolean checkRecipe(@NotNull Recipe recipe, boolean consumeIfSuccess) {
        ItemStack[] expectedCatalysts = recipe.getProperty(PlasmaFoundryCatalystProperty.getInstance(),
                new ItemStack[0]);
        if (expectedCatalysts.length != 0) {
            for (ItemStack expectedCatalyst : expectedCatalysts) {
                if (ItemStack.areItemsEqual(expectedCatalyst, this.catalyst)) {
                    if (consumeIfSuccess) {
                        this.catalyst.setCount(this.catalyst.getCount() - 1);
                        syncCatalyst();
                    }
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        for (String[] aisle : StructureDefinition.PLASMA_FOUNDRY) {
            pattern.aisle(aisle);
        }

        pattern.where('D', selfPredicate())
                .where('A',
                        states(SerendustryMetaBlocks.METAL_CASING
                                .getState(BlockMetalCasing.SerendustryMetalCasingType.CARBON))
                                        .setMinGlobalLimited(158).or(autoAbilities()))
                .where('B', frames(Materials.Osmiridium))
                .where('C', states(Blocks.LAVA.getBlockState().getBaseState()));

        return pattern.build();
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return SerendustryTextures.CASING_CARBON;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, @NotNull List<String> tooltip,
                               boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        tooltip.add("");
        String catalyst = I18n.format(NO_CATALYST);
        NBTTagCompound tag = stack.getTagCompound();
        if (tag != null) {
            ItemStack catalystStack = new ItemStack(tag.getCompoundTag("Catalyst"));
            if (!catalystStack.isEmpty()) {
                catalyst = catalystStack.getDisplayName();
            }
        }

        tooltip.add(
                I18n.format("serendustry.machine.plasma_foundry.catalyst.contained") + " " + "§e" + catalyst + "§7");
        tooltip.add("");
        tooltip.add(I18n.format("serendustry.machine.plasma_foundry.lava"));
        tooltip.add("");
        tooltip.add(I18n.format("serendustry.machine.energy.regular"));
        tooltip.add("");
        tooltip.add(I18n.format("serendustry.machine.authors") + " " + SValues.FORMAT_ENVOIDIA +
                I18n.format("serendustry.machine.author.envoidia") + "§r§7 " + I18n.format("serendustry.text.and") +
                " " + I18n.format("serendustry.machine.author.twilight"));
    }

    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        TextComponentBase catalystText;
        if (catalyst.isEmpty()) {
            catalystText = TextComponentUtil.translationWithColor(TextFormatting.GRAY, NO_CATALYST);
        } else {
            catalystText = TextComponentUtil.stringWithColor(TextFormatting.GRAY, catalyst.getDisplayName());
        }

        MultiblockDisplayText.builder(textList, isStructureFormed())
                .setWorkingStatus(recipeMapWorkable.isWorkingEnabled(), recipeMapWorkable.isActive())
                .addEnergyUsageLine(getEnergyContainer())
                .addEnergyTierLine(GTUtility.getTierByVoltage(recipeMapWorkable.getMaxVoltage()))
                .addCustom(tl -> {
                    // Catalyst line
                    tl.add(TextComponentUtil.translationWithColor(
                            TextFormatting.YELLOW,
                            "serendustry.machine.plasma_foundry.catalyst.contained"));

                    tl.add(catalystText);
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
        data.setTag("Catalyst", this.catalyst.writeToNBT(new NBTTagCompound()));
        return data;
    }

    @Override
    public void readFromNBT(NBTTagCompound data) {
        super.readFromNBT(data);
        GTUtility.readItems(controllerSlot, "ControllerSlot", data);
        this.catalyst = new ItemStack(data.getCompoundTag("Catalyst"));
    }

    @Override
    public void initFromItemStackData(NBTTagCompound data) {
        super.initFromItemStackData(data);
        this.catalyst = new ItemStack(data.getCompoundTag("Catalyst"));
    }

    @Override
    public void writeItemStackData(NBTTagCompound data) {
        super.writeItemStackData(data);
        data.setTag("Catalyst", this.catalyst.writeToNBT(new NBTTagCompound()));
    }

    @Override
    public void onRemoval() {
        Block.spawnAsEntity(getWorld(), getPos(), getStackInSlot());
    }

    @Override
    public void update() {
        super.update();
        if (getWorld().isRemote) return;
        if (this.catalyst.isEmpty()) {
            ItemStack stack = this.controllerSlot.getStackInSlot(0);
            if (SerendustryRecipeMaps.PLASMA_FOUNDRY_RECIPES.isValidCatalyst(stack)) {
                this.catalyst = stack.copy();
                this.catalyst.setCount(SerendustryRecipeMaps.PLASMA_FOUNDRY_RECIPES.getCatalystUses(stack));

                stack = stack.copy();
                stack.setCount(stack.getCount() - 1);
                this.controllerSlot.setStackInSlot(0, stack);

                syncCatalyst();
            }
        }
    }

    private void syncCatalyst() {
        writeCustomData(CATALYST, w -> w.writeItemStack(this.catalyst));
    }

    @Override
    public void receiveCustomData(int dataId, PacketBuffer buf) {
        super.receiveCustomData(dataId, buf);
        if (dataId == CATALYST) {
            try {
                catalyst = buf.readItemStack();
            } catch (IOException e) {
                throw new RuntimeException(e); // java...
            }
        }
    }
}
