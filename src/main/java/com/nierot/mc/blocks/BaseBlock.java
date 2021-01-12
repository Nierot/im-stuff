package com.nierot.mc.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BaseBlock extends Block {

    private BlockItem blockItem;

    public BaseBlock(Settings block, Item.Settings item) {
        super(block);
        this.blockItem = new BlockItem(this, item);
    }

    public BlockItem getBlockItem() { return this.blockItem; };

}
