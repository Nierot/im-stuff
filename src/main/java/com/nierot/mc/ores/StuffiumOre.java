package com.nierot.mc.ores;

import java.util.List;

import com.nierot.mc.ImStuff;
import com.nierot.mc.blocks.BaseBlock;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.BlockView;
import net.minecraft.text.Text;


public class StuffiumOre extends BaseBlock {

    public StuffiumOre() {
        super(
        FabricBlockSettings
            .of(Material.STONE)
            .breakByHand(false)
            .requiresTool()
            .breakByTool(FabricToolTags.PICKAXES)
            .sounds(BlockSoundGroup.STONE)
            .strength(2.0f, 2.0f),
        new Item
            .Settings()
            .group(ImStuff.ITEM_GROUP)
        );
    }
    
    @Override
    public void appendTooltip(ItemStack stack, BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(new TranslatableText("item.imstuff.stuffium_ore.tooltip"));
    }
}
