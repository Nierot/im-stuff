package com.nierot.mc.blocks;

import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public abstract class BaseSlab extends SlabBlock {

    private BlockItem blockItem;

    public BaseSlab(Settings settings, Item.Settings item) {
        super(settings);
        this.blockItem = new BlockItem(this, item);
    }

    public BlockItem getBlockItem() { return this.blockItem; };

}
