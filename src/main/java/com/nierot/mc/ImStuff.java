package com.nierot.mc;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import com.nierot.mc.blocks.BaseBlock;
import com.nierot.mc.blocks.BaseSlab;
import com.nierot.mc.blocks.CheeseBlock;
import com.nierot.mc.blocks.FabricBlock;
import com.nierot.mc.blocks.FabricSlab;
import com.nierot.mc.blocks.XrayCheeseSlab;
import com.nierot.mc.items.FabricItem;

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
    }


    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}