package com.nierot.mc;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import com.nierot.mc.blocks.BaseBlock;
import com.nierot.mc.blocks.BaseBlockWithEntity;
import com.nierot.mc.blocks.BaseSlab;
import com.nierot.mc.blocks.CheeseBlock;
import com.nierot.mc.blocks.CheeseChest;
import com.nierot.mc.blocks.FabricBlock;
import com.nierot.mc.blocks.FabricSlab;
import com.nierot.mc.blocks.XrayCheeseSlab;
import com.nierot.mc.entities.CheeseChestEntity;
import com.nierot.mc.gui.CheeseChestScreenHandler;
import com.nierot.mc.items.FabricItem;
import com.nierot.mc.ores.InitializeOres;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ImStuff implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "imstuff";
    public static final String MOD_NAME = "I'm Stuff!";

    // ItemGroup
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
		new Identifier(MOD_ID, "general"),
		() -> new ItemStack(Blocks.BARREL));

    // Items
    private void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fabric_item"), new FabricItem());
    }

    // Chests
    public static final Identifier CHEESE_CHEST_ID = new Identifier(MOD_ID, "cheese_chest");
    private static final CheeseChest CHEESE_CHEST_INSTANCE = new CheeseChest(); 
    public static final BaseBlockWithEntity CHEESE_CHEST = Registry.register(Registry.BLOCK, CHEESE_CHEST_ID, CHEESE_CHEST_INSTANCE);
    public static final BlockItem CHEESE_CHEST_ITEM = Registry.register(Registry.ITEM, CHEESE_CHEST_ID, CHEESE_CHEST_INSTANCE.getBlockItem());
    public static final BlockEntityType<CheeseChestEntity> CHEESE_CHEST_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, CHEESE_CHEST_ID, BlockEntityType.Builder.create(CheeseChestEntity::new, CHEESE_CHEST).build(null));
    public static final ScreenHandlerType<CheeseChestScreenHandler> CHEESE_CHEST_HANDLER = ScreenHandlerRegistry.registerSimple(CHEESE_CHEST_ID, CheeseChestScreenHandler::new);

    // Blocks
    private void registerBlocks() {
        // Register blocks/slabs and their corresponding item
        this.registerBlock("fabric_block", new FabricBlock());
        this.registerSlab("fabric_slab", new FabricSlab());
        this.registerSlab("xray_cheese_slab", new XrayCheeseSlab());
        this.registerBlock("cheese_block", new CheeseBlock());
    }


    private void registerBlock(String name, BaseBlock block) {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), block.getBlockItem());
    }

    private void registerSlab(String name, BaseSlab slab) {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), slab);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), slab.getBlockItem());
    }

    @Override
    public void onInitialize() {
        log(Level.INFO, "looks like someone made the poor choice of allowing me into their game xd");
        this.registerItems();
        this.registerBlocks();
        InitializeOres.run();
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}