package serendustry.blocks;

import org.jetbrains.annotations.NotNull;

public interface IACRComponentBlockStats {

    @NotNull
    String getName();

    int getTemperatureMod();

    int getPressureMod();
}
