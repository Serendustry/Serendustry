package serendustry.api;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.block.state.IBlockState;
import serendustry.blocks.BlockAALCoreCasing;

public class SerendustryAPI {
    public static final Object2ObjectMap<IBlockState, BlockAALCoreCasing.AALCoreCasingType> AAL_CORE_CASINGS = new Object2ObjectOpenHashMap<>();
}
