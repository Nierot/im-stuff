package com.nierot.mc.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FabricBlock extends BaseBlock {

    public FabricBlock() {
        super(FabricBlockSettings
            .of(Material.WOOL)
            .breakByHand(false)
            .breakByTool(FabricToolTags.HOES)
            .sounds(BlockSoundGroup.WOOL)
            .strength(2f, 0.2f),
             new Item
            .Settings()
            .group(ItemGroup.MISC)
        );
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            player.sendMessage(new LiteralText("Oof"), false);
        }

        return ActionResult.SUCCESS;
    }
}
