package com.nierot.mc;

import com.nierot.mc.gui.CheeseChestScreen;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class ImStuffClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ImStuff.CHEESE_CHEST_HANDLER, CheeseChestScreen::new);
    }
    
}
