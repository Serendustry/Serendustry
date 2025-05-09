package serendustry.client.utils;

import gregtech.client.utils.TooltipHelper;
import gregtech.common.ConfigHolder;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import serendustry.SValues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static gregtech.api.GTValues.CLIENT_TIME;

public class STooltipHelper extends TooltipHelper {

    private static final List<SFormatCode> CODES = new ArrayList<>();

    public static SFormatCode createNewCode(int rate, TextFormatting[]... codes) {
        SFormatCode code = new SFormatCode(rate, codes);
        CODES.add(code);
        return code;
    }

    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            CODES.forEach(SFormatCode::updateIndex);
        }
    }

    public static class SFormatCode {

        private final int rate;
        private final TextFormatting[][] codes;
        private int index = 0;

        private SFormatCode(int rate, TextFormatting[]... codes) {
            this.rate = rate;
            this.codes = codes;
        }

        private void updateIndex() {
            if (CLIENT_TIME % rate == 0 && !ConfigHolder.client.preventBlinkingTooltips) {
                if (index + 1 >= codes.length) index = 0;
                else index++;
            }
        }

        @Override
        public String toString() {
            return Arrays.toString(codes[index]);
        }
    }

    // Generic multiblock tooltips
    public static void addSerendustryInformation (List<String> tooltip, String hatchType, boolean hasPerfectOC) {
        tooltip.add("");
        tooltip.add(hatchType);
        if(hasPerfectOC) tooltip.add(TooltipHelper.RAINBOW_SLOW + I18n.format("gregtech.machine.perfect_oc"));
        tooltip.add("");
        tooltip.add(I18n.format("serendustry.machine.author") + " " + SValues.FORMAT_ENVOIDIA + I18n.format("serendustry.machine.author.envoidia"));

    }

    public static void addSerendustryInformation (List<String> tooltip, String hatchType, boolean hasPerfectOC, String author) {
        tooltip.add("");
        tooltip.add(hatchType);
        if(hasPerfectOC) tooltip.add(TooltipHelper.RAINBOW_SLOW + I18n.format("gregtech.machine.perfect_oc"));
        tooltip.add("");
        tooltip.add(I18n.format("serendustry.machine.author") + " " + I18n.format(author));

    }
}
