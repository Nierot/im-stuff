package com.nierot.mc.blocks;

import com.nierot.mc.ImStuff;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

public class CheeseBlock extends BaseBlock {

    public CheeseBlock() {
        super(
            FabricBlockSettings
                .of(Material.WOOL)
                .breakByHand(true)
                .breakByTool(FabricToolTags.SHEARS)
                .sounds(BlockSoundGroup.WOOL)
                .strength(0.2f, 0.2f),
            new Item
                .Settings()
                .group(ImStuff.ITEM_GROUP)
        );
    }
}
