package serendustry;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.loaders.recipe.CraftingComponent.*;
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
        appendToComponent(WIRE_ELECTRIC, wireGtSingle, Hihiirokane, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(WIRE_QUAD, wireGtQuadruple, Hihiirokane, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(WIRE_OCT, wireGtOctal, Hihiirokane, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(WIRE_HEX, wireGtHex, Hihiirokane, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(GTValues.UEV, CABLE, cableGtSingle, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(GTValues.UEV, CABLE_QUAD, cableGtQuadruple, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(GTValues.UEV, CABLE_OCT, cableGtOctal, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(GTValues.UEV, CABLE_HEX, cableGtHex, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(CABLE_TIER_UP, wireGtSingle, Hihiirokane, Lafium, Signalium, Bedrockium, Quantium);

        // Pipes
        appendToComponent(PIPE_NORMAL, pipeNormalFluid, HalkoniteSteel, Lafium, StellarAlloy, ChargedDraconium, CallistoIce);
        appendToComponent(PIPE_LARGE, pipeLargeFluid, HalkoniteSteel, Lafium, StellarAlloy, ChargedDraconium, CallistoIce);

        // Glass
        appendToComponent(GLASS, block, ChromaticGlass, ChromaticGlass, ChromaticGlass, ChromaticGlass, ChromaticGlass);

        // Plates
        appendToComponent(GTValues.UEV, PLATE, plate, HastelloyK243, Enderiiium, AwakenedDraconium, Quantum);
        appendToComponent(GTValues.UEV, DOUBLE_PLATE, plateDouble, HastelloyK243, Enderiiium, AwakenedDraconium,
                Quantum);
        appendToComponent(HULL_PLATE, plate, RadoxPolymer, RadoxPolymer, RadoxPolymer, RadoxPolymer, RadoxPolymer);

        // Rotor
        appendToComponent(ROTOR, rotor, HalkoniteSteel, TastyNeutronium, EnderiiumBase, InfinityCatalyst,
                Quantium);

        // Grinder
        // TODO: More Grinding Head tiers?

        // Sawblade
        appendToComponent(SAWBLADE, toolHeadBuzzSaw, Neutronium, HastelloyK243, StellarAlloy, AwakenedDraconium,
                Quantum);

        // Coils
        appendToComponent(COIL_HEATING, wireGtDouble, Hihiirokane, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(COIL_HEATING_DOUBLE, wireGtQuadruple, Hihiirokane, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(COIL_ELECTRIC, wireGtOctal, Hihiirokane, Lafium, Signalium, Bedrockium, Quantium);

        // Sticks
        appendToComponent(STICK_MAGNETIC, stickLong, MagneticHAMAlloy, TengamAttuned, TengamAttuned, KerrBlackHole,
                KerrBlackHole);
        appendToComponent(GTValues.IV, STICK_ELECTROMAGNETIC, stickLong, VanadiumGallium, VanadiumGallium,
                VanadiumGallium, VanadiumGallium, MagneticHAMAlloy, TengamAttuned, TengamAttuned, KerrBlackHole,
                KerrBlackHole);
        appendToComponent(GTValues.UEV, STICK_DISTILLATION, spring, Lafium, Signalium, Bedrockium, Quantium);

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
        // TODO: Add something past UHPIC?

        // Voltage Coil
        // TODO

        // Spring
        appendToComponent(GTValues.UEV, SPRING, spring, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
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
