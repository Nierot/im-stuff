package com.nierot.mc.tools;

import com.nierot.mc.ImStuff;

import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {

    public ShovelBase(ToolMaterial material) {
        super(material, -1, -3f, new Item.Settings().group(ImStuff.ITEM_GROUP));
    }
    
}
