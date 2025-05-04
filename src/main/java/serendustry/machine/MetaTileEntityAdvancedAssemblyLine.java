package serendustry.machine;

import static gregtech.api.util.RelativeDirection.*;
//import static serendustry.Serendustry.logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import gregtech.api.pattern.PatternStringError;
import gregtech.api.util.BlockInfo;
import gregtech.api.util.GTUtility;
import gregtech.common.metatileentities.multi.multiblockpart.MetaTileEntityItemBus;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.IFluidTank;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.IItemHandlerModifiable;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gregtech.api.GTValues;
import gregtech.api.capability.IDataAccessHatch;
import gregtech.api.capability.IEnergyContainer;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.ingredients.GTRecipeInput;
import gregtech.api.recipes.recipeproperties.ResearchProperty;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.ConfigHolder;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.MetaTileEntities;
import gregtech.common.metatileentities.multi.multiblockpart.MetaTileEntityMultiFluidHatch;
import gregtech.core.sound.GTSoundEvents;
import serendustry.api.SerendustryAPI;
import serendustry.api.capability.IAALCore;
import serendustry.api.capability.impl.AALRecipeLogic;
import serendustry.blocks.BlockAALCoreCasing;
import serendustry.blocks.BlockSerendustryMetalCasing;
import serendustry.blocks.IAALCoreBlockStats;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;

public class MetaTileEntityAdvancedAssemblyLine extends RecipeMapMultiblockController implements IAALCore {

    private int tier;

    public MetaTileEntityAdvancedAssemblyLine(ResourceLocation rl) {
        super(rl, RecipeMaps.ASSEMBLY_LINE_RECIPES);
        this.recipeMapWorkable = new AALRecipeLogic(this);
    }

    @Override
    public MetaTileEntityAdvancedAssemblyLine createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityAdvancedAssemblyLine(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);

        Object type = context.get("AALCoreTier");
        if (type instanceof IAALCoreBlockStats) {
            this.tier = ((IAALCoreBlockStats) type).getCoreTier();
        } else
            this.tier = -1;

        List<IEnergyContainer> energyInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
        List<IEnergyContainer> substationInput = new ArrayList<>(
                getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));

        if (!energyInput.isEmpty() && !substationInput.isEmpty()) {
            invalidateStructure();
        }

        // todo: give error message to multiblock builder and make JEI not show mixed hatches

        /*
         * List<IEnergyContainer> powerInput = new ArrayList<>(getAbilities(MultiblockAbility.INPUT_ENERGY));
         * powerInput.addAll(getAbilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY));
         * 
         * this.powerInput = new EnergyContainerList(powerInput);
         */  // todo: update ceu so this works and check if this even needed
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
        this.tier = 0;
    }

    @Override
    public int getCurrentTier() {
        return this.tier;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RIGHT, UP, FRONT)
        //return FactoryBlockPattern.start(FRONT, UP, RIGHT)
                //.aisle("FIF", "RTR", "SAG", " Y ")
                //.aisle("FIF", "RTR", "DAG", " Y ").setRepeatable(3, 15)
                //.aisle("FOF", "RTR", "DAG", " Y ")
                .aisle(" G G ",
                        "G   G",
                        "G T G",
                        "G   G",
                        " DSG ")
                .aisle(" G G ",
                        "G   G",
                        "R T R",
                        "F   F",
                        " YIY ")
                        .setRepeatable(3, 16)
                .aisle(" G G ",
                        "G   G",
                        "G T G",
                        "G   G",
                        " GOG ")
                .where('S', selfPredicate())
                .where('F', states(getCasingState()).or(fluidInputPredicate().setPreviewCount(4)))
                .where('O',
                        abilities(MultiblockAbility.EXPORT_ITEMS)
                                .addTooltips("gregtech.multiblock.pattern.location_end"))
                .where('Y', states(getCasingState())
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(0).setMinGlobalLimited(0)
                                .setMaxGlobalLimited(2))
                        .or(abilities(MultiblockAbility.SUBSTATION_INPUT_ENERGY).setPreviewCount(1)
                                .setMaxGlobalLimited(1)))
                .where('I', metaTileEntities(MetaTileEntities.ITEM_IMPORT_BUS[GTValues.ULV]))
                .where('G', states(getGrateState()))
                .where('A', states(getCasingState()))
                .where('R', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)))
                .where('T', AALCoreCasings())
                .where('D', dataHatchPredicate())
                .where(' ', any())
                .build();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        if (sourcePart != null) {
            // part rendering
            if (sourcePart instanceof IDataAccessHatch || sourcePart instanceof MetaTileEntityItemBus) {
                return SerendustryTextures.CASING_CARBON;
            } else {
                return SerendustryTextures.CASING_ADAMANTIUM;
            }
        } else {
            // controller rendering
            if (isStructureFormed()) {
                return SerendustryTextures.CASING_CARBON;
            } else {
                return SerendustryTextures.CASING_ADAMANTIUM;
            }
        }
    }

    @NotNull
    protected static IBlockState getCasingState() {
        return SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING.getState(BlockSerendustryMetalCasing.SerendustryMetalCasingType.ADAMANTIUM);
    }

    @NotNull
    protected static IBlockState getGrateState() {
        return SerendustryMetaBlocks.SERENDUSTRY_METAL_CASING.getState(BlockSerendustryMetalCasing.SerendustryMetalCasingType.CARBON); // todo
    }

    @NotNull
    protected static TraceabilityPredicate dataHatchPredicate() {
        // if research is enabled, require the data hatch, otherwise use a grate instead
        if (ConfigHolder.machines.enableResearch) {
            return abilities(MultiblockAbility.DATA_ACCESS_HATCH, MultiblockAbility.OPTICAL_DATA_RECEPTION)
                    .setExactLimit(1)
                    .or(states(getGrateState()));
        }
        return states(getGrateState());
    }

    @NotNull
    protected static TraceabilityPredicate fluidInputPredicate() {
        // block multi-fluid hatches if ordered fluids is enabled
        if (ConfigHolder.machines.orderedFluidAssembly) {
            return metaTileEntities(MultiblockAbility.REGISTRY.get(MultiblockAbility.IMPORT_FLUIDS).stream()
                    .filter(mte -> !(mte instanceof MetaTileEntityMultiFluidHatch))
                    .toArray(MetaTileEntity[]::new))
                            .setMaxGlobalLimited(4);
        }
        return abilities(MultiblockAbility.IMPORT_FLUIDS);
    }

    // Ensures inputs are read in the correct order
    @Override
    protected Function<BlockPos, Integer> multiblockPartSorter() {
        // Starts searching from behind the controller
        return BACK.getSorter(getFrontFacing(), getUpwardsFacing(), isFlipped());
    }

    @Override
    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
        getFrontOverlay().renderOrientedState(renderState, translation, pipeline, getFrontFacing(),
                recipeMapWorkable.isActive(), recipeMapWorkable.isWorkingEnabled());
    }

    @Override
    public SoundEvent getBreakdownSound() {
        return GTSoundEvents.BREAKDOWN_MECHANICAL;
    }

    private static final Supplier<TraceabilityPredicate> AAL_PREDICATE = () -> new TraceabilityPredicate(
            blockWorldState -> {
                IBlockState blockState = blockWorldState.getBlockState();
                if (SerendustryAPI.AAL_CORE_CASINGS.containsKey(blockState)) {
                    BlockAALCoreCasing.AALCoreCasingType tier = SerendustryAPI.AAL_CORE_CASINGS.get(blockState);
                    Object casing = blockWorldState.getMatchContext().getOrPut("AALCoreTier", tier);

                    if (!casing.equals(tier)) {
                        blockWorldState.setError(
                                new PatternStringError("serendustry.machine.advanced_assembly_line.tier")); // todo fix
                        return false;
                    }

                    blockWorldState.getMatchContext().getOrPut("VBlock", new LinkedList<>())
                            .add(blockWorldState.getPos());

                    return true;
                }

                return false;
            }, () -> SerendustryAPI.AAL_CORE_CASINGS.entrySet().stream()
            .sorted(Comparator.comparingInt(entry -> entry.getValue().ordinal()))
            .map(entry -> new BlockInfo(entry.getKey(), null))
            .toArray(BlockInfo[]::new))
            .addTooltips("serendustry.machine.advanced_assembly_line.tier");

    public static TraceabilityPredicate AALCoreCasings() {
        return AAL_PREDICATE.get();
    }

    /* todo
     * @Override
     * public void update() {
     * super.update();
     * if (ConfigHolder.client.shader.assemblyLineParticles) {
     * if (getRecipeMapWorkable().isWorking()) {
     * int maxBeams = getAbilities(MultiblockAbility.IMPORT_ITEMS).size() + 1;
     * int maxProgress = getRecipeMapWorkable().getMaxProgress();
     * 
     * // Each beam should be visible for an equal amount of time, which is derived from the maximum number of
     * // beams and the maximum progress in the recipe.
     * int beamTime = Math.max(1, maxProgress / maxBeams);
     * 
     * int beamCount = Math.min(maxBeams, getRecipeMapWorkable().getProgress() / beamTime + 1);
     * 
     * if (beamCount != this.beamCount) {
     * if (beamCount < this.beamCount) {
     * // if beam count decreases, the last beam in the queue needs to be removed for the sake of fade
     * // time.
     * this.beamCount = Math.max(0, beamCount - 1);
     * writeCustomData(GregtechDataCodes.UPDATE_PARTICLE, this::writeParticles);
     * }
     * this.beamTime = beamTime;
     * this.beamCount = beamCount;
     * writeCustomData(GregtechDataCodes.UPDATE_PARTICLE, this::writeParticles);
     * }
     * } else if (beamCount != 0) {
     * this.beamTime = 0;
     * this.beamCount = 0;
     * writeCustomData(GregtechDataCodes.UPDATE_PARTICLE, this::writeParticles);
     * }
     * }
     * }
     * 
     * @Override
     * public void writeInitialSyncData(PacketBuffer buf) {
     * super.writeInitialSyncData(buf);
     * writeParticles(buf);
     * }
     * 
     * @Override
     * public void receiveInitialSyncData(PacketBuffer buf) {
     * super.receiveInitialSyncData(buf);
     * readParticles(buf);
     * }
     * 
     * @Override
     * public void receiveCustomData(int dataId, PacketBuffer buf) {
     * if (dataId == GregtechDataCodes.UPDATE_PARTICLE) {
     * readParticles(buf);
     * } else {
     * super.receiveCustomData(dataId, buf);
     * }
     * }
     * 
     * @Override
     * public void onRemoval() {
     * super.onRemoval();
     * if (getWorld().isRemote && beamParticles != null) {
     * for (GTLaserBeamParticle[] particle : beamParticles) {
     * if (particle[0] != null) {
     * particle[0].setExpired();
     * particle[1].setExpired();
     * }
     * }
     * beamParticles = null;
     * }
     * }
     * 
     * private void writeParticles(@NotNull PacketBuffer buf) {
     * buf.writeVarInt(beamCount);
     * buf.writeVarInt(beamTime);
     * }
     * 
     * @SideOnly(Side.CLIENT)
     * private void readParticles(@NotNull PacketBuffer buf) {
     * beamCount = buf.readVarInt();
     * beamTime = buf.readVarInt();
     * if (beamParticles == null) {
     * beamParticles = new GTLaserBeamParticle[17][2];
     * }
     * BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos(getPos());
     * 
     * EnumFacing relativeUp = RelativeDirection.UP.getRelativeFacing(getFrontFacing(), getUpwardsFacing(),
     * isFlipped());
     * EnumFacing relativeLeft = RelativeDirection.LEFT.getRelativeFacing(getFrontFacing(), getUpwardsFacing(),
     * isFlipped());
     * boolean negativeUp = relativeUp.getAxisDirection() == EnumFacing.AxisDirection.NEGATIVE;
     * 
     * for (int i = 0; i < beamParticles.length; i++) {
     * GTLaserBeamParticle particle = beamParticles[i][0];
     * if (i < beamCount && particle == null) {
     * pos.setPos(getPos());
     * if (negativeUp) {
     * // correct for the position of the block corresponding to its negative side
     * pos.move(relativeUp.getOpposite());
     * }
     * Vector3 startPos = new Vector3()
     * .add(pos.move(relativeLeft, i))
     * .add( // offset by 0.5 in both non-"upwards" directions
     * relativeUp.getAxis() == EnumFacing.Axis.X ? 0 : 0.5,
     * relativeUp.getAxis() == EnumFacing.Axis.Y ? 0 : 0.5,
     * relativeUp.getAxis() == EnumFacing.Axis.Z ? 0 : 0.5);
     * Vector3 endPos = startPos.copy()
     * .subtract(relativeUp.getXOffset(), relativeUp.getYOffset(), relativeUp.getZOffset());
     * 
     * beamParticles[i][0] = createALParticles(startPos, endPos);
     * 
     * pos.setPos(getPos());
     * if (negativeUp) {
     * pos.move(relativeUp.getOpposite());
     * }
     * startPos = new Vector3()
     * .add(pos.move(relativeLeft, i)
     * .move(getFrontFacing().getOpposite(), 2))
     * .add( // offset by 0.5 in both non-"upwards" directions
     * relativeUp.getAxis() == EnumFacing.Axis.X ? 0 : 0.5,
     * relativeUp.getAxis() == EnumFacing.Axis.Y ? 0 : 0.5,
     * relativeUp.getAxis() == EnumFacing.Axis.Z ? 0 : 0.5);
     * endPos = startPos.copy()
     * .subtract(relativeUp.getXOffset(), relativeUp.getYOffset(), relativeUp.getZOffset());
     * 
     * beamParticles[i][1] = createALParticles(startPos, endPos);
     * 
     * // Don't forget to add particles
     * GTParticleManager.INSTANCE.addEffect(beamParticles[i][0]);
     * GTParticleManager.INSTANCE.addEffect(beamParticles[i][1]);
     * 
     * } else if (i >= beamCount && particle != null) {
     * particle.setExpired();
     * beamParticles[i][0] = null;
     * beamParticles[i][1].setExpired();
     * beamParticles[i][1] = null;
     * }
     * }
     * }
     * 
     * @NotNull
     * 
     * @SideOnly(Side.CLIENT)
     * private GTLaserBeamParticle createALParticles(Vector3 startPos, Vector3 endPos) {
     * return new GTLaserBeamParticle(this, startPos, endPos, beamTime)
     * .setBody(LASER_LOCATION)
     * .setBeamHeight(0.125f)
     * // Try commenting or adjusting on the next four lines to see what happens
     * .setDoubleVertical(true)
     * .setHead(LASER_HEAD_LOCATION)
     * .setHeadWidth(0.1f)
     * .setEmit(0.2f);
     * }
     */

    @Override
    public boolean checkRecipe(@NotNull Recipe recipe, boolean consumeIfSuccess) {
        if (consumeIfSuccess) return true; // don't check twice

        // check tier
        int recipeTier = GTUtility.getTierByVoltage(recipe.getEUt());
        if(recipeTier > tier) {
            //logger.info("AALD fail state: recipetier " + recipeTier + " > tier " + tier);
            return false;
        }

        // check ordered items
        if (ConfigHolder.machines.orderedAssembly) {
            List<GTRecipeInput> inputs = recipe.getInputs();
            List<IItemHandlerModifiable> itemInputInventory = getAbilities(MultiblockAbility.IMPORT_ITEMS);

            // slot count is not enough, so don't try to match it
            if (itemInputInventory.size() < inputs.size()) {
                //logger.info("AALD fail state: itemInputInventory.size() " + itemInputInventory.size() + " < inputs.size " + inputs.size());
                return false;
            }

            for (int i = 0; i < inputs.size(); i++) {
                if (!inputs.get(i).acceptsStack(itemInputInventory.get(i).getStackInSlot(0))) {
                    /*logger.info("-----------------------------------");
                    logger.info("AALD fail state: !inputs.get(i).acceptsStack(itemInputInventory.get(i).getStackInSlot(0)) with i of " + i);
                    logger.info("inputs.get(i) " + inputs.get(i));
                    logger.info("itemInputInventory.get(i).getStackInSlot(0) " + itemInputInventory.get(i).getStackInSlot(0));
                    logger.info("expected recipe inputs: " + inputs);
                    logger.info("machine inputs: " + itemInputInventory);
                    logger.info("-----------------------------------");*/
                    return false;
                }
            }

            // check ordered fluids
            if (ConfigHolder.machines.orderedFluidAssembly) {
                inputs = recipe.getFluidInputs();
                List<IFluidTank> fluidInputInventory = getAbilities(MultiblockAbility.IMPORT_FLUIDS);

                // slot count is not enough, so don't try to match it
                if (fluidInputInventory.size() < inputs.size()) {
                    //logger.info("AALD fail state: fluidInputInventory.size() " + fluidInputInventory.size() + " < inputs.size " + inputs.size());
                    return false;
                }

                for (int i = 0; i < inputs.size(); i++) {
                    if (!inputs.get(i).acceptsFluid(fluidInputInventory.get(i).getFluid())) {
                        //logger.info("AALD fail state: !inputs.get(i).acceptsFluid(fluidInputInventory.get(i).getFluid()) with i of " + i);
                        return false;
                    }
                }
            }
        }

        // if (!ConfigHolder.machines.enableResearch || !recipe.hasProperty(ResearchProperty.getInstance())) {
        if (!ConfigHolder.machines.enableResearch || !recipe.hasProperty(ResearchProperty.getInstance())) {
            return super.checkRecipe(recipe, consumeIfSuccess);
        }

        return isRecipeAvailable(getAbilities(MultiblockAbility.DATA_ACCESS_HATCH), recipe) ||
                isRecipeAvailable(getAbilities(MultiblockAbility.OPTICAL_DATA_RECEPTION), recipe);
    }

    private static boolean isRecipeAvailable(@NotNull Iterable<? extends IDataAccessHatch> hatches,
                                             @NotNull Recipe recipe) {
        for (IDataAccessHatch hatch : hatches) {
            // creative hatches do not need to check, they always have the recipe
            if (hatch.isCreative()) return true;

            // hatches need to have the recipe available
            if (hatch.isRecipeAvailable(recipe)) return true;
        }
        return false;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World world, @NotNull List<String> tooltip,
                               boolean advanced) {
        if (ConfigHolder.machines.orderedAssembly && ConfigHolder.machines.orderedFluidAssembly) {
            tooltip.add(I18n.format("gregtech.machine.assembly_line.tooltip_ordered_both"));
        } else if (ConfigHolder.machines.orderedAssembly) {
            tooltip.add(I18n.format("gregtech.machine.assembly_line.tooltip_ordered_items"));
        } else if (ConfigHolder.machines.orderedFluidAssembly) {
            tooltip.add(I18n.format("gregtech.machine.assembly_line.tooltip_ordered_fluids"));
        }
    }
}
