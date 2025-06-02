package serendustry.api;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.block.state.IBlockState;
import serendustry.blocks.BlockAALCoreCasing;
import serendustry.blocks.BlockACRComponent;
import serendustry.blocks.BlockEICHammerCasing;
import serendustry.blocks.BlockPCCoilCooling;
import serendustry.blocks.BlockPCCoilHeating;

public class SerendustryAPI {

    public static final Object2ObjectMap<IBlockState, BlockAALCoreCasing.AALCoreCasingType> AAL_CORE_CASINGS = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectMap<IBlockState, BlockEICHammerCasing.EICHammerCasingType> EIC_HAMMER_CASINGS = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectMap<IBlockState, BlockPCCoilHeating.PCCoilHeatingType> PC_COILS_HEATING = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectMap<IBlockState, BlockPCCoilCooling.PCCoilCoolingType> PC_COILS_COOLING = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectMap<IBlockState, BlockACRComponent.ACRComponentType> ACR_COMPONENTS = new Object2ObjectOpenHashMap<>();
}
