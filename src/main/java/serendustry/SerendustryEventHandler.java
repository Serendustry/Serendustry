package serendustry;

import static gregtech.api.unification.material.Materials.Neutronium;
import static gregtech.api.unification.material.Materials.Tritanium;
import static gregtech.api.unification.material.Materials.VanadiumGallium;
import static gregtech.api.unification.ore.OrePrefix.block;
import static gregtech.api.unification.ore.OrePrefix.cableGtHex;
import static gregtech.api.unification.ore.OrePrefix.cableGtOctal;
import static gregtech.api.unification.ore.OrePrefix.cableGtQuadruple;
import static gregtech.api.unification.ore.OrePrefix.cableGtSingle;
import static gregtech.api.unification.ore.OrePrefix.pipeHugeFluid;
import static gregtech.api.unification.ore.OrePrefix.pipeLargeFluid;
import static gregtech.api.unification.ore.OrePrefix.pipeNormalFluid;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.plateDouble;
import static gregtech.api.unification.ore.OrePrefix.rotor;
import static gregtech.api.unification.ore.OrePrefix.spring;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.api.unification.ore.OrePrefix.toolHeadBuzzSaw;
import static gregtech.api.unification.ore.OrePrefix.wireGtDouble;
import static gregtech.api.unification.ore.OrePrefix.wireGtHex;
import static gregtech.api.unification.ore.OrePrefix.wireGtOctal;
import static gregtech.api.unification.ore.OrePrefix.wireGtQuadruple;
import static gregtech.api.unification.ore.OrePrefix.wireGtSingle;
import static gregtech.loaders.recipe.CraftingComponent.CABLE;
import static gregtech.loaders.recipe.CraftingComponent.CABLE_HEX;
import static gregtech.loaders.recipe.CraftingComponent.CABLE_OCT;
import static gregtech.loaders.recipe.CraftingComponent.CABLE_QUAD;
import static gregtech.loaders.recipe.CraftingComponent.CABLE_TIER_UP;
import static gregtech.loaders.recipe.CraftingComponent.COIL_ELECTRIC;
import static gregtech.loaders.recipe.CraftingComponent.COIL_HEATING;
import static gregtech.loaders.recipe.CraftingComponent.COIL_HEATING_DOUBLE;
import static gregtech.loaders.recipe.CraftingComponent.Component;
import static gregtech.loaders.recipe.CraftingComponent.DOUBLE_PLATE;
import static gregtech.loaders.recipe.CraftingComponent.GLASS;
import static gregtech.loaders.recipe.CraftingComponent.HULL_PLATE;
import static gregtech.loaders.recipe.CraftingComponent.PIPE_LARGE;
import static gregtech.loaders.recipe.CraftingComponent.PIPE_NORMAL;
import static gregtech.loaders.recipe.CraftingComponent.PIPE_REACTOR;
import static gregtech.loaders.recipe.CraftingComponent.PLATE;
import static gregtech.loaders.recipe.CraftingComponent.POWER_COMPONENT;
import static gregtech.loaders.recipe.CraftingComponent.ROTOR;
import static gregtech.loaders.recipe.CraftingComponent.SAWBLADE;
import static gregtech.loaders.recipe.CraftingComponent.SPRING;
import static gregtech.loaders.recipe.CraftingComponent.STICK_DISTILLATION;
import static gregtech.loaders.recipe.CraftingComponent.STICK_ELECTROMAGNETIC;
import static gregtech.loaders.recipe.CraftingComponent.STICK_MAGNETIC;
import static gregtech.loaders.recipe.CraftingComponent.STICK_RADIOACTIVE;
import static gregtech.loaders.recipe.CraftingComponent.VOLTAGE_COIL;
import static gregtech.loaders.recipe.CraftingComponent.WIRE_ELECTRIC;
import static gregtech.loaders.recipe.CraftingComponent.WIRE_HEX;
import static gregtech.loaders.recipe.CraftingComponent.WIRE_OCT;
import static gregtech.loaders.recipe.CraftingComponent.WIRE_QUAD;
import static serendustry.item.SerendustryMetaItems.CHIP_OPIC;
import static serendustry.item.SerendustryMetaItems.COIL_MAX;
import static serendustry.item.SerendustryMetaItems.COIL_OpV;
import static serendustry.item.SerendustryMetaItems.COIL_UEV;
import static serendustry.item.SerendustryMetaItems.COIL_UHV;
import static serendustry.item.SerendustryMetaItems.COIL_UIV;
import static serendustry.item.SerendustryMetaItems.COIL_UXV;
import static serendustry.item.material.SerendustryMaterials.AbyssalAlloy;
import static serendustry.item.material.SerendustryMaterials.Actinoids;
import static serendustry.item.material.SerendustryMaterials.ChromaticGlass;
import static serendustry.item.material.SerendustryMaterials.DeepDarkSteel;
import static serendustry.item.material.SerendustryMaterials.EnrichedNaquadahAlloy;
import static serendustry.item.material.SerendustryMaterials.Envoite;
import static serendustry.item.material.SerendustryMaterials.ExoHalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.FullerenePolymerMatrix;
import static serendustry.item.material.SerendustryMaterials.HalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.Hihiirokane;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.MagneticHolmium;
import static serendustry.item.material.SerendustryMaterials.PartialSuperheavies;
import static serendustry.item.material.SerendustryMaterials.Periodicium;
import static serendustry.item.material.SerendustryMaterials.Quantium;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.Quantum;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;
import static serendustry.item.material.SerendustryMaterials.ScUxvSane;
import static serendustry.item.material.SerendustryMaterials.Signalium;
import static serendustry.item.material.SerendustryMaterials.Superheavies;
import static serendustry.item.material.SerendustryMaterials.TengamAttuned;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;

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
        appendToComponent(WIRE_ELECTRIC, wireGtSingle, Hihiirokane, Quantium40, Hypogen, ScUxvSane, Quantium);
        appendToComponent(WIRE_QUAD, wireGtQuadruple, Hihiirokane, Quantium40, Hypogen, ScUxvSane, Quantium);
        appendToComponent(WIRE_OCT, wireGtOctal, Hihiirokane, Quantium40, Hypogen, ScUxvSane, Quantium);
        appendToComponent(WIRE_HEX, wireGtHex, Hihiirokane, Quantium40, Hypogen, ScUxvSane, Quantium);
        appendToComponent(GTValues.UEV, CABLE, cableGtSingle, Quantium40, Quantium40, Quantium40, Quantium40);
        appendToComponent(GTValues.UEV, CABLE_QUAD, cableGtQuadruple, Quantium40, Quantium40, Quantium40, Quantium40);
        appendToComponent(GTValues.UEV, CABLE_OCT, cableGtOctal, Quantium40, Signalium, Quantium40, Quantium40);
        appendToComponent(GTValues.UEV, CABLE_HEX, cableGtHex, Quantium40, Quantium40, Quantium40, Quantium40);
        appendToComponent(CABLE_TIER_UP, wireGtSingle, Hihiirokane, Quantium40, Hypogen, ScUxvSane, Periodicium);

        // Pipes
        appendToComponent(PIPE_NORMAL, pipeNormalFluid, VibraniumAlloy, AbyssalAlloy, DeepDarkSteel, Envoite,
                Envoite);
        appendToComponent(PIPE_LARGE, pipeLargeFluid, VibraniumAlloy, AbyssalAlloy, DeepDarkSteel, Envoite,
                Envoite);

        // Glass
        appendToComponent(GLASS, block, ChromaticGlass, ChromaticGlass, ChromaticGlass, ChromaticGlass, ChromaticGlass);

        // Plates
        appendToComponent(GTValues.UEV, PLATE, plate, HalkoniteSteel, Infinity, ExoHalkoniteSteel, Quantum);
        appendToComponent(GTValues.UEV, DOUBLE_PLATE, plateDouble, AbyssalAlloy, DeepDarkSteel, Envoite,
                Envoite);
        appendToComponent(HULL_PLATE, plate, RadoxPolymer, RadoxPolymer, RadoxPolymer, FullerenePolymerMatrix,
                FullerenePolymerMatrix);

        // Rotor
        appendToComponent(ROTOR, rotor, VibraniumAlloy, HalkoniteSteel, Infinity, ExoHalkoniteSteel,
                ExoHalkoniteSteel);

        // Grinder
        // TODO: More Grinding Head tiers?

        // Sawblade
        appendToComponent(SAWBLADE, toolHeadBuzzSaw, Neutronium, AbyssalAlloy, Infinity, Infinity, Infinity);

        // Coils
        appendToComponent(COIL_HEATING, wireGtDouble, Hihiirokane, Quantium40, Hypogen, ScUxvSane, ScUxvSane);
        appendToComponent(COIL_HEATING_DOUBLE, wireGtQuadruple, Hihiirokane, Quantium40, Hypogen, ScUxvSane,
                ScUxvSane);
        appendToComponent(COIL_ELECTRIC, wireGtOctal, Hihiirokane, Quantium40, Hypogen, ScUxvSane, ScUxvSane);

        // Sticks
        appendToComponent(STICK_MAGNETIC, stickLong, MagneticHolmium, TengamAttuned, TengamAttuned, TengamAttuned,
                TengamAttuned);
        appendToComponent(GTValues.IV, STICK_ELECTROMAGNETIC, stickLong, VanadiumGallium, VanadiumGallium,
                VanadiumGallium, MagneticHolmium, MagneticHolmium, TengamAttuned, TengamAttuned, TengamAttuned,
                TengamAttuned);
        appendToComponent(GTValues.UEV, STICK_DISTILLATION, spring, Quantium40, Hypogen, ScUxvSane, ScUxvSane);

        // Not used by base CEu
        appendToComponent(GTValues.UV, STICK_RADIOACTIVE, stickLong, Tritanium, EnrichedNaquadahAlloy, Actinoids,
                PartialSuperheavies, Superheavies, Periodicium);

        // Reactor Pipe
        appendToComponent(GTValues.UHV, PIPE_REACTOR, pipeNormalFluid, RadoxPolymer);
        appendToComponent(GTValues.UEV, PIPE_REACTOR, pipeLargeFluid, RadoxPolymer);
        appendToComponent(GTValues.UIV, PIPE_REACTOR, pipeHugeFluid, RadoxPolymer);
        appendToComponent(GTValues.UXV, PIPE_REACTOR, pipeLargeFluid, FullerenePolymerMatrix);
        appendToComponent(GTValues.OpV, PIPE_REACTOR, pipeHugeFluid, FullerenePolymerMatrix);

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
        appendToComponent(GTValues.UEV, SPRING, spring, Hihiirokane, Quantium40, Hypogen, ScUxvSane, ScUxvSane);
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
