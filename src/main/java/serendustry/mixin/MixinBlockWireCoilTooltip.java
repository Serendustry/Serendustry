package serendustry.mixin;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.llamalad7.mixinextras.sugar.Local;

import gregtech.client.utils.TooltipHelper;
import gregtech.common.blocks.BlockWireCoil;

@Mixin(value = BlockWireCoil.class, remap = false)
public class MixinBlockWireCoilTooltip {

    @Inject(method = "addInformation", at = @At("RETURN"))
    public void tooltipAddition(@NotNull ItemStack itemStack, @Nullable World worldIn, @NotNull List<String> lines,
                                @NotNull ITooltipFlag tooltipFlag, CallbackInfo ci,
                                @Local BlockWireCoil.CoilType coilType) {
        if (TooltipHelper.isShiftDown()) {
            int coilTier = coilType.ordinal();
            lines.add(I18n.format("tile.wire_coil.tooltip_crystallizer"));
            lines.add(I18n.format("tile.wire_coil.tooltip_duration_crystallizer", 100 - ((coilTier - 4) * 20)));
            if (coilTier >= 7) {
                lines.add(I18n.format("tile.wire_coil.tooltip_nebulaic_nexus"));
                lines.add(I18n.format("tile.wire_coil.tooltip_parallel_nebulaic_nexus",
                        (coilTier >= 8) ? coilTier * 2 : 1));
            }
        }
    }
}
