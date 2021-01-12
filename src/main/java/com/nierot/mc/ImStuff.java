package com.nierot.mc;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import com.nierot.mc.blocks.FabricBlock;
import com.nierot.mc.items.FabricItem;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ImStuff implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "imstuff";
    public static final String MOD_NAME = "I'm Stuff!";

    // Items
    private void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fabric_item"), new FabricItem());
    }

    // Blocks
    private void registerBlocks() {
        FabricBlock FABRIC_BLOCK = new FabricBlock();
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fabric_block"), FABRIC_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fabric_block"), FABRIC_BLOCK.getBlockItem());
    }


    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        this.registerItems();
        this.registerBlocks();
    }



    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}