package com.nierot.mc.blocks;

import com.nierot.mc.ImStuff;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FabricSlab extends BaseSlab {

    public static final DirectionProperty SLAB_DIR = DirectionProperty.of("type");

    public FabricSlab() {
        super(
        FabricBlockSettings
            .of(Material.WOOL)
            .breakByHand(true)
            .breakByTool(FabricToolTags.SHEARS)
            .sounds(BlockSoundGroup.WOOL)
            .strength(0.5f, 0.2f),
        new Item
            .Settings()
            .group(ImStuff.ITEM_GROUP)
        );
        this.setDefaultState(this.stateManager.getDefaultState());
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return ActionResult.PASS;
    }

}
