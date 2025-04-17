package serendustry;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.loaders.recipe.CraftingComponent.*;
import static serendustry.item.SerendustryMetaItems.CHIP_OPIC;
import static serendustry.item.SerendustryMetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.event.HighTierEvent;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.loaders.recipe.CraftingComponent;
import serendustry.entity.FriendlyCreeperEntity;

public class SerendustryEventHandler {

    private static int serverTickTimer = 0;

    @SubscribeEvent
    public void enableHighTier(HighTierEvent event) {
        event.enableHighTier();
    }

    @SubscribeEvent
    public void appendCraftingComponent(GregTechAPI.RegisterEvent<CraftingComponent> event) {
        // Wires / Cables
        appendToComponent(WIRE_ELECTRIC, wireGtSingle, Hihiirokane, Quantium40, Signalium, Bedrockium, Quantium);
        appendToComponent(WIRE_QUAD, wireGtQuadruple, Hihiirokane, Quantium40, Signalium, Bedrockium, Quantium);
        appendToComponent(WIRE_OCT, wireGtOctal, Hihiirokane, Quantium40, Signalium, Bedrockium, Quantium);
        appendToComponent(WIRE_HEX, wireGtHex, Hihiirokane, Quantium40, Signalium, Bedrockium, Quantium);
        appendToComponent(GTValues.UEV, CABLE, cableGtSingle, Quantium40, Signalium, Bedrockium, Quantium);
        appendToComponent(GTValues.UEV, CABLE_QUAD, cableGtQuadruple, Quantium40, Signalium, Bedrockium, Quantium);
        appendToComponent(GTValues.UEV, CABLE_OCT, cableGtOctal, Quantium40, Signalium, Bedrockium, Quantium);
        appendToComponent(GTValues.UEV, CABLE_HEX, cableGtHex, Quantium40, Signalium, Bedrockium, Quantium);
        appendToComponent(CABLE_TIER_UP, wireGtSingle, Hihiirokane, Quantium40, Signalium, Bedrockium, Quantium);

        // Pipes
        appendToComponent(PIPE_NORMAL, pipeNormalFluid, VibraniumAlloy, AbyssalAlloy, DeepDarkSteel, ChargedDraconium, CallistoIce);
        appendToComponent(PIPE_LARGE, pipeLargeFluid, VibraniumAlloy, AbyssalAlloy, DeepDarkSteel, ChargedDraconium, CallistoIce);

        // Glass
        appendToComponent(GLASS, block, ChromaticGlass, ChromaticGlass, ChromaticGlass, ChromaticGlass, ChromaticGlass);

        // Plates
        appendToComponent(GTValues.UEV, PLATE, plate, HalkoniteSteel, Infinity, AwakenedDraconium, Quantum);
        appendToComponent(GTValues.UEV, DOUBLE_PLATE, plateDouble, HalkoniteSteel, Infinity, AwakenedDraconium,
                Quantum);
        appendToComponent(HULL_PLATE, plate, RadoxPolymer, RadoxPolymer, RadoxPolymer, RadoxPolymer, RadoxPolymer);

        // Rotor
        appendToComponent(ROTOR, rotor, VibraniumAlloy, HalkoniteSteel, Infinity, InfinityCatalyst,
                Quantium);

        // Grinder
        // TODO: More Grinding Head tiers?

        // Sawblade
        appendToComponent(SAWBLADE, toolHeadBuzzSaw, Neutronium, AbyssalAlloy, Infinity, AwakenedDraconium,
                Quantum);

        // Coils
        appendToComponent(COIL_HEATING, wireGtDouble, Hihiirokane, Quantium40, Signalium, Bedrockium, Quantium);
        appendToComponent(COIL_HEATING_DOUBLE, wireGtQuadruple, Hihiirokane, Quantium40, Signalium, Bedrockium, Quantium);
        appendToComponent(COIL_ELECTRIC, wireGtOctal, Hihiirokane, Quantium40, Signalium, Bedrockium, Quantium);

        // Sticks
        appendToComponent(STICK_MAGNETIC, stickLong, MagneticHolmium, TengamAttuned, TengamAttuned, KerrBlackHole,
                KerrBlackHole);
        appendToComponent(GTValues.IV, STICK_ELECTROMAGNETIC, stickLong, VanadiumGallium, VanadiumGallium,
                VanadiumGallium, MagneticHolmium, MagneticHolmium, TengamAttuned, TengamAttuned, KerrBlackHole,
                KerrBlackHole);
        appendToComponent(GTValues.UEV, STICK_DISTILLATION, spring, Quantium40, Infinity, Bedrockium, Quantium);

        // Not used by base CEu
        appendToComponent(GTValues.UV, STICK_RADIOACTIVE, stickLong, Tritanium, EnrichedNaquadahAlloy, Actinoids,
                PartialSuperheavies, Superheavies, Periodicium);

        // Reactor Pipe
        appendToComponent(GTValues.UHV, PIPE_REACTOR, pipeTinyFluid, RadoxPolymer);
        appendToComponent(GTValues.UEV, PIPE_REACTOR, pipeSmallFluid, RadoxPolymer);
        appendToComponent(GTValues.UIV, PIPE_REACTOR, pipeNormalFluid, RadoxPolymer);
        appendToComponent(GTValues.UXV, PIPE_REACTOR, pipeLargeFluid, RadoxPolymer);
        appendToComponent(GTValues.OpV, PIPE_REACTOR, pipeHugeFluid, RadoxPolymer);

        // Power Component
        Map<Integer, Object> map = new HashMap<>();
        map.put(GTValues.UHV, CHIP_OPIC.getStackForm());
        POWER_COMPONENT.appendIngredients(map);

        // Voltage Coil
        Map<Integer, Object> map2 = new HashMap<>();
        map2.put(GTValues.UHV, COIL_UHV.getStackForm());
        map2.put(GTValues.UEV, COIL_UEV.getStackForm());
        map2.put(GTValues.UIV, COIL_UIV.getStackForm());
        map2.put(GTValues.UXV, COIL_UXV.getStackForm());
        map2.put(GTValues.OpV, COIL_OpV.getStackForm());
        map2.put(GTValues.MAX, COIL_MAX.getStackForm());
        VOLTAGE_COIL.appendIngredients(map2);

        // Spring
        appendToComponent(GTValues.UEV, SPRING, spring, Hihiirokane, Quantium40, Infinity, Bedrockium, Quantium);
    }

    private void appendToComponent(Component component, OrePrefix prefix, Material... materials) {
        appendToComponent(GTValues.UHV, component, prefix, materials);
    }

    private void appendToComponent(int startTier, Component component, OrePrefix prefix, Material... materials) {
        if (startTier > GTValues.MAX) {
            return;
        }
        Map<Integer, Object> map = new HashMap<>();
        for (int i = 0; i < materials.length; i++) {
            Material material = materials[i];
            int tier = (i + startTier);
            if (tier > GTValues.MAX) {
                return;
            }
            map.put(tier, new UnificationEntry(prefix, material));
        }

        component.appendIngredients(map);
    }

    @SubscribeEvent
    public void onTick(TickEvent.WorldTickEvent event) {
        if (event.phase != TickEvent.Phase.END || event.side != Side.SERVER) {
            return;
        }
        if (++serverTickTimer % 10000 == 0) {
            for (EntityPlayer player : event.world.playerEntities) {
                if (event.world.rand.nextInt(200) == 0) {
                    for (int i = 0; i <= 5; i++) {
                        int targetX = (int) player.posX + event.world.rand.nextInt(4) - event.world.rand.nextInt(4);
                        int targetY = (int) player.posY + event.world.rand.nextInt(4) - event.world.rand.nextInt(4);
                        int targetZ = (int) player.posZ + event.world.rand.nextInt(4) - event.world.rand.nextInt(4);
                        if (event.world.isAirBlock(new BlockPos(targetX, targetY, targetZ)) &&
                                event.world.isAirBlock(new BlockPos(targetX, targetY + 1, targetZ))) {
                            FriendlyCreeperEntity creeper = new FriendlyCreeperEntity(event.world);
                            try {
                                creeper.setCustomNameTag(FriendlyCreeperEntity.getName(event.world.rand));
                            } catch (Exception ignored) {}
                            creeper.playLivingSound();
                            creeper.setLocationAndAngles(
                                    targetX + event.world.rand.nextDouble(),
                                    targetY + event.world.rand.nextDouble(),
                                    targetZ + event.world.rand.nextDouble(),
                                    event.world.rand.nextFloat(),
                                    event.world.rand.nextFloat());
                            event.world.spawnEntity(creeper);
                            break;
                        }
                    }
                }
            }
        }
    }
}
