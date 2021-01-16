package com.nierot.mc.items;

import java.util.List;

import com.nierot.mc.ImStuff;

import net.minecraft.item.Item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class StuffiumIngot extends Item {

    public StuffiumIngot() {
        super(new FabricItemSettings()
            .group(ImStuff.ITEM_GROUP)
        );
    };

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("item.imstuff.stuffium_ingot.tooltip"));
    }
}
