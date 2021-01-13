package com.nierot.mc.blocks;

import java.util.List;

import com.nierot.mc.ImStuff;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class XrayCheeseSlab extends BaseSlab {

    public XrayCheeseSlab() {
        super(
        FabricBlockSettings
            .of(Material.WOOL)
            .breakByHand(true)
            .breakByTool(FabricToolTags.SHEARS)
            .sounds(BlockSoundGroup.WOOL)
            .strength(2.0f, 0.2f),
        new Item
            .Settings()
            .group(ImStuff.ITEM_GROUP)
        );
        this.setDefaultState(this.stateManager.getDefaultState());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(0f, 0f, 0f, 1.0f, 0.5f, 1.0f);
    }

    @Override
    public void appendTooltip(ItemStack stack, BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(new TranslatableText("item.imstuff.xray_cheese_slab.tooltip"));
    }
}
