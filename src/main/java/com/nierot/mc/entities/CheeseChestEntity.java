package com.nierot.mc.entities;

import com.nierot.mc.gui.CheeseChestScreenHandler;
import com.nierot.mc.ImStuff;
import com.nierot.mc.inventories.ImplementedInventory;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;

public class CheeseChestEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {

    private DefaultedList<ItemStack> inventory;
    private static final int INVENTORY_SIZE = 9;

    public CheeseChestEntity() {
        super(ImStuff.CHEESE_CHEST_ENTITY);
        this.inventory = DefaultedList.ofSize(INVENTORY_SIZE, ItemStack.EMPTY);
    }

    @Override
    public int size() { return INVENTORY_SIZE; }

    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) { return new CheeseChestScreenHandler(syncId, inv, this);}

    @Override
    public DefaultedList<ItemStack> getItems() { return this.inventory; }

    @Override
    public Text getDisplayName() { return new TranslatableText(getCachedState().getBlock().getTranslationKey()); }
    
    @Override
    public void fromTag(BlockState state, CompoundTag tag) {
        super.fromTag(state, tag);
        Inventories.fromTag(tag, this.inventory);
    }

    @Override
    public CompoundTag toTag(CompoundTag tag) {
        super.toTag(tag);
        Inventories.toTag(tag, this.inventory);
        return tag;
    }
}
