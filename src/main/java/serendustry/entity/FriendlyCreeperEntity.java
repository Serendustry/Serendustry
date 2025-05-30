package serendustry.entity;

import java.util.Random;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import org.jetbrains.annotations.NotNull;

import com.google.common.collect.ImmutableList;

public class FriendlyCreeperEntity extends EntityCreeper {

    public FriendlyCreeperEntity(World world) {
        super(world);
        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0);
    }

    @Override
    public int getCreeperState() {
        return -1;
    }

    @Override
    public boolean canBeLeashedTo(@NotNull EntityPlayer player) {
        return true;
    }

    private static final ImmutableList<String> NAMES = ImmutableList.<String>builder()
            .add("Amogus")
            .add("John Cena")
            .add("Floppa")
            .add("idk, Goku")
            .add("Gregory Samsa")
            .add("\"your mother\"")
            .add("ceaseless discharge")
            .add("Robert'); DROP TABLE Users;--")
            .add("Gregory Samsa Buck")
            .add("`.add( )`")
            .add("https://www.youtube.com/watch?v=dQw4w9WgXcQ")
            .add("GEI (Greg Enough Items)")
            .add("Serendustry available today!")
            .add("amognla")
            .add("amorb")
            .add("mongu")
            .add("amgogus")
            .add("flopper")
            .add("horizontal....")
            .add("vertical....")
            .add("GregTech New Horizons")
            .add("GregBlock")
            .add("Samsung Galaxy Note 7")
            .add("MinecraftForge")
            .add("Whos steve jobs")
            .add("epicgamerjamer")
            .add("spunchbop")
            .build();

    public static String getName(Random random) {
        return NAMES.get(random.nextInt(NAMES.size()));
    }
}
