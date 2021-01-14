package com.nierot.mc.blocks;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public abstract class BaseBlockWithEntity extends BlockWithEntity {

    private BlockItem blockItem;

    protected BaseBlockWithEntity(Settings settings, Item.Settings item) {
        super(settings);
        this.blockItem = new BlockItem(this, item);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public BlockItem getBlockItem() { return this.blockItem; };
    
}
