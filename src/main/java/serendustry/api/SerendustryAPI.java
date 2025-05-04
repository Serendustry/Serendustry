package serendustry.api;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.block.state.IBlockState;
import serendustry.blocks.BlockAALCoreCasing;
import serendustry.blocks.BlockEICHammerCasing;

public class SerendustryAPI {
    public static final Object2ObjectMap<IBlockState, BlockAALCoreCasing.AALCoreCasingType> AAL_CORE_CASINGS = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectMap<IBlockState, BlockEICHammerCasing.EICHammerCasingType> EIC_HAMMER_CASINGS = new Object2ObjectOpenHashMap<>();
}
