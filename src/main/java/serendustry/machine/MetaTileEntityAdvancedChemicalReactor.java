package serendustry.machine;

import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockDisplayText;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.recipes.Recipe;
import gregtech.api.util.BlockInfo;
import gregtech.api.util.GTUtility;
import gregtech.api.util.TextComponentUtil;
import gregtech.api.util.TextFormattingUtil;
import gregtech.client.renderer.ICubeRenderer;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEnd;
import net.minecraft.world.biome.BiomeHell;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import serendustry.SValues;
import serendustry.api.SerendustryAPI;
import serendustry.api.capability.IACRComponent;
import serendustry.api.capability.impl.ACRRecipeLogic;
import serendustry.blocks.BlockACRComponent;
import serendustry.blocks.BlockSerendustryMultiCasing;
import serendustry.blocks.IACRComponentBlockStats;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.client.renderer.texture.SerendustryTextures;
import serendustry.client.utils.IntegerRange;
import serendustry.client.utils.STooltipHelper;
import serendustry.machine.structure.StructureDefinition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;

public class MetaTileEntityAdvancedChemicalReactor extends RecipeMapMultiblockController implements IACRComponent {

    private double temperature;
    private double pressure;

    private double EUtMod = 0;
    private List<FluidStack> addedFluids = new ArrayList<>();
    Reference2IntMap<Fluid> fluidMap = new Reference2IntOpenHashMap<>();
    private List<FluidStack> addedFluidsFormatted = new ArrayList<>();

    boolean errTemp = false;
    boolean errPres = false;

    int errTemp1 = 0;
    int errTemp2 = 0;
    int errPres1 = 0;
    int errPres2 = 0;

    public MetaTileEntityAdvancedChemicalReactor(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.ACR_RECIPES);
        this.recipeMapWorkable = new ACRRecipeLogic(this);
    }

    @Override
    public MetaTileEntityAdvancedChemicalReactor createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityAdvancedChemicalReactor(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);

        // Determine default temperature and pressure based on the biome
        Biome biome = getWorld().getBiome(getPos());
        if (biome instanceof BiomeHell) {
            this.temperature = 350;
            this.pressure = 180;
        } else if (biome instanceof BiomeEnd) {
            this.temperature = 240;
            this.pressure = 50;
        } else {
            // Biome temps vary between 2.0 and -0.5, so temps will vary between 262 and 325 (11.93F and 125.33F)
            // Plains temp is 0.8 = 295
            this.temperature = 275 + (biome.getTemperature(getPos()) * 25);
            this.pressure = 101;
        }

        // Modify parameters based on structure
        Object casings = context.get("ACRComponents");
        if (casings instanceof List<?>) {
            for (Object casing : (List<?>) casings) {
                if (casing instanceof IACRComponentBlockStats) {
                    IACRComponentBlockStats component = (IACRComponentBlockStats) casing;

                    // Multiply temperature and pressure
                    this.temperature *= component.getTemperatureMod();
                    this.pressure *= component.getPressureMod();

                    // Figure out how much to multiply EUt of recipes by
                    this.EUtMod += component.getEUtMod();

                    // Figure out which extra fluids to add to recipes
                    FluidStack fluidInput = component.getAddedFluidInput();

                    if (fluidInput.amount != 0) {
                        this.addedFluids.add(fluidInput);
                    }

                }
            }
        }

        if (!addedFluids.isEmpty()) {
            // Condenses fluids down (EG, 40 Air + 10 Propane + 40 Air -> 80 Air + 10 Propane)
            for (FluidStack fluidStack : addedFluids)
                fluidMap.merge(fluidStack.getFluid(), fluidStack.amount, Integer::sum);

            for (Map.Entry<Fluid, Integer> entry : fluidMap.entrySet()) {
                addedFluidsFormatted.add(new FluidStack(entry.getKey(), entry.getValue()));
            }
        }

        recipeMapWorkable.setEUDiscount(1 + EUtMod);
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();

        this.temperature = -1;
        this.pressure = -1;

        this.EUtMod = 0;

        this.addedFluids = new ArrayList<>();
        this.fluidMap = new Reference2IntOpenHashMap<>();
        this.addedFluidsFormatted = new ArrayList<>();

        this.errTemp = false;
        this.errPres = false;
    }

    @Override
    public List<FluidStack> getCurrentAddedFluids() {
        return this.addedFluidsFormatted;
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start(LEFT, DOWN, FRONT);

        for (String[] aisle : StructureDefinition.ADVANCED_CHEMICAL_REACTOR) {
            pattern.aisle(aisle);
        }

        pattern.where('S', selfPredicate())
                .where('X',
                        states(SerendustryMetaBlocks.SERENDUSTRY_MULTI_CASING
                                .getState(BlockSerendustryMultiCasing.SerendustryMultiCasingType.ACR))
                                        .setMinGlobalLimited(1)
                                        .or(autoAbilities(true, false, true, true, true, true, false)))
                .where('A', ACRComponents())
                .where('G', air());// states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS)));

        return pattern.build();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return SerendustryTextures.CASING_ACR;
    }

    private static final Supplier<TraceabilityPredicate> ACR_COMPONENT_PREDICATE = () -> new TraceabilityPredicate(
            blockWorldState -> {
                IBlockState blockState = blockWorldState.getBlockState();
                if (SerendustryAPI.ACR_COMPONENTS.containsKey(blockState)) {
                    BlockACRComponent.ACRComponentType block = SerendustryAPI.ACR_COMPONENTS.get(blockState);

                    blockWorldState.getMatchContext().getOrPut("ACRComponents", new ArrayList())
                            .add(block);

                    return true;
                }
                return false;
            }, () -> SerendustryAPI.ACR_COMPONENTS.entrySet().stream()
                    .sorted(Comparator.comparingInt(entry -> entry.getValue().ordinal()))
                    .map(entry -> new BlockInfo(entry.getKey(), null))
                    .toArray(BlockInfo[]::new));

    public static TraceabilityPredicate ACRComponents() {
        return ACR_COMPONENT_PREDICATE.get();
    }

    @Override
    public boolean checkRecipe(@NotNull Recipe recipe, boolean consumeIfSuccess) {
        IntegerRange recipeTemperature = recipe.getProperty(ACRTemperatureProperty.getInstance(),
                new IntegerRange(0, 0));
        IntegerRange recipePressure = recipe.getProperty(ACRPressureProperty.getInstance(), new IntegerRange(0, 0));

        boolean result = true;

        int temp1 = recipeTemperature.getStart();
        int temp2 = recipeTemperature.getEnd();
        int pres1 = recipePressure.getStart();
        int pres2 = recipePressure.getEnd();

        if ((int) temperature < temp1 || (int) temperature > temp2) {
            errTemp = true;
            errTemp1 = temp1;
            errTemp2 = temp2;
            result = false;
        }
        if ((int) pressure < pres1 || (int) pressure > pres2) {
            errPres = true;
            errPres1 = pres1;
            errPres2 = pres2;
            result = false;
        }

        return result;
    }

    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        MultiblockDisplayText.Builder builder = MultiblockDisplayText.builder(textList, isStructureFormed())
                .setWorkingStatus(recipeMapWorkable.isWorkingEnabled(), recipeMapWorkable.isActive())
                .addEnergyUsageLine(getEnergyContainer())
                .addEnergyTierLine(GTUtility.getTierByVoltage(recipeMapWorkable.getMaxVoltage()))

                // Temperature line
                .addCustom(tl -> {
                    if (isStructureFormed()) {
                        ITextComponent temperatureText = TextComponentUtil.stringWithColor(TextFormatting.YELLOW,
                                TextFormattingUtil.formatNumbers((int) temperature) + "K");

                        tl.add(TextComponentUtil.translationWithColor(TextFormatting.GRAY,
                                "serendustry.machine.advanced_chemical_reactor.property.temperature", temperatureText));
                    }
                })

                // Pressure line
                .addCustom(tl -> {
                    if (isStructureFormed()) {
                        ITextComponent pressureText = TextComponentUtil.stringWithColor(TextFormatting.YELLOW,
                                TextFormattingUtil.formatNumbers((int) pressure) + "kPa");

                        tl.add(TextComponentUtil.translationWithColor(TextFormatting.GRAY,
                                "serendustry.machine.advanced_chemical_reactor.property.pressure", pressureText));
                    }
                })

                // EU "discount" line
                .addCustom(tl -> {
                    if (isStructureFormed()) {
                        ITextComponent EUDiscountText = TextComponentUtil.stringWithColor(TextFormatting.YELLOW,
                                TextFormattingUtil.formatNumbers((1 + EUtMod) * 100) + "%");

                        tl.add(TextComponentUtil.translationWithColor(TextFormatting.GRAY,
                                "serendustry.machine.advanced_chemical_reactor.eu_modifier", EUDiscountText));
                    }
                });

        // Fluid usage lines
        if (!addedFluids.isEmpty()) {
            if (isStructureFormed()) {
                builder.addCustom(tl -> {
                    tl.add(TextComponentUtil.translationWithColor(
                            TextFormatting.GRAY,
                            "serendustry.machine.advanced_chemical_reactor.needed_fluids"));
                });
                for (FluidStack stack : addedFluidsFormatted) {
                    builder.addCustom(tl -> {
                        tl.add(TextComponentUtil.stringWithColor(TextFormatting.WHITE,
                                TextFormattingUtil.formatNumbers(stack.amount) + "L " + stack.getLocalizedName()));
                    });
                }
            }
        }

        // Temperature error line
        if (errTemp) {
            builder.addCustom(tl -> {
                if (isStructureFormed()) {
                    ITextComponent errTempText = TextComponentUtil.stringWithColor(TextFormatting.YELLOW,
                            errTemp1 + "-" + errTemp2 + "K");

                    tl.add(TextComponentUtil.translationWithColor(TextFormatting.RED,
                            "serendustry.machine.advanced_chemical_reactor.error.temperature", errTempText));
                }
            });
        }

        // Pressure error line
        if (errPres) {
            builder.addCustom(tl -> {
                if (isStructureFormed()) {
                    ITextComponent errPresText = TextComponentUtil.stringWithColor(TextFormatting.YELLOW,
                            errPres1 + "-" + errPres2 + "kPa");

                    tl.add(TextComponentUtil.translationWithColor(TextFormatting.RED,
                            "serendustry.machine.advanced_chemical_reactor.error.pressure", errPresText));
                }
            });
        }

        builder.addWorkingStatusLine()
                .addProgressLine(recipeMapWorkable.getProgressPercent());
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_REGULAR, true);
        tooltip.add(I18n.format("serendustry.machine.textures") + " " +
                SValues.FORMAT_IRIS_1 + I18n.format("serendustry.machine.author.iris.1") +
                SValues.FORMAT_IRIS_2 + I18n.format("serendustry.machine.author.iris.2") +
                SValues.FORMAT_IRIS_3 + I18n.format("serendustry.machine.author.iris.3"));
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return SerendustryTextures.OVERLAY_ADVANCED_CHEMICAL_REACTOR;
    }
}
