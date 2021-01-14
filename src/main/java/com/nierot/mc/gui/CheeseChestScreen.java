package com.nierot.mc.gui;

import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CheeseChestScreen extends HandledScreen<CheeseChestScreenHandler> {

    // Texture for the inventory
    private static final Identifier TEXTURE = new Identifier("minecraft", "textures/gui/container/dispenser.png");

    public CheeseChestScreen(CheeseChestScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        // this.backgroundHeight = 114 + 6 * 18;
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.client.getTextureManager().bindTexture(TEXTURE);
        int x = (this.width - this.backgroundWidth) / 2;
        int y = (this.height - this.backgroundHeight) / 2;
        this.drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
        // this.drawTexture(matrices, x, y, 0, 0, this.backgroundWidth, 6 * 18 + 17);
        // this.drawTexture(matrices, x, y + 6 * 18 + 17, 0, 126, this.backgroundWidth, 96);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        // drawMouseoverTooltip(matrices, mouseX, mouseY);
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

}
