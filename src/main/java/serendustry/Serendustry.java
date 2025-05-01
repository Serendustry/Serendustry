package serendustry;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.Logger;

import gregtech.GTInternalTags;
import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.event.MaterialEvent;
import gregtech.api.unification.material.event.MaterialRegistryEvent;
import gregtech.api.block.VariantItemBlock;
import serendustry.blocks.SerendustryMetaBlocks;
import serendustry.entity.FriendlyCreeperEntity;
import serendustry.item.SerendustryMetaItems;
import serendustry.item.SerendustryToolItems;
import serendustry.item.material.SerendustryMaterials;
import serendustry.item.material.VazkiiWhatAreYouDoing;
import serendustry.machine.SerendustryMetaTileEntities;
import serendustry.machine.SerendustryRecipeMaps;
import serendustry.recipe.SerendustryRecipes;

import java.util.Objects;
import java.util.function.Function;

@Mod(modid = Tags.MODID,
     name = Tags.MODNAME,
     version = Tags.VERSION,
     dependencies = GTInternalTags.DEP_VERSION_STRING)
public class Serendustry {

    public static final String MODID = Tags.MODID;
    public static Logger logger = null;

    public static ResourceLocation ID(String path) {
        return new ResourceLocation(MODID, path);
    }

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new SerendustryEventHandler());
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("Serendustry PreInitialization");
        SerendustryRecipeMaps.preInit();
        SerendustryMetaItems.preInit();
        SerendustryMetaTileEntities.preInit();
        SerendustryToolItems.init();
        if (event.getSide() == Side.CLIENT) {
            RenderingRegistry.registerEntityRenderingHandler(FriendlyCreeperEntity.class, RenderCreeper::new);
        }
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        SerendustryMetaBlocks.ALL_CASINGS.forEach(registry::register);
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        SerendustryMetaItems.registerItems();

        IForgeRegistry<Item> registry = event.getRegistry();
        SerendustryMetaBlocks.ALL_CASINGS.forEach(casing -> registry.register(createItemBlock(casing, VariantItemBlock::new)));
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        SerendustryRecipes.removeRecipes();
        SerendustryRecipes.registerRecipes();
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void registerRecipesLate(RegistryEvent.Register<IRecipe> event) {
        SerendustryRecipes.removeRecipesLate();
        SerendustryRecipes.registerRecipesLate();
    }

    @SubscribeEvent
    public void registerMaterialRegistry(MaterialRegistryEvent event) {
        GregTechAPI.materialManager.createRegistry(MODID);
    }

    @SubscribeEvent
    public void registerMaterials(MaterialEvent event) {
        SerendustryMaterials.init();

        // For some reason, Botania's Gaia Spirit Ingot is OreDicted as "gaiaIngot", so we need to add a normal OreDict to it for us to use
        if (Loader.isModLoaded("botania")) {
            VazkiiWhatAreYouDoing.init();
        }
    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        itemBlock.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        return itemBlock;
    }

    @SubscribeEvent
    public void registerEntities(RegistryEvent.Register<EntityEntry> event) {
        event.getRegistry().register(EntityEntryBuilder.<Entity>create()
                .entity(FriendlyCreeperEntity.class)
                .id(ID("friendly_creeper"), 0)
                .name("$MODID.friendly_creeper")
                .tracker(64, 1, true)
                .build());
    }
}
