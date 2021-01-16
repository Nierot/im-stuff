package com.nierot.mc.tools;

import com.nierot.mc.ImStuff;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {

    public HoeBase(ToolMaterial material) {
        super(material, -4, 0f, new Item.Settings().group(ImStuff.ITEM_GROUP));
    }
    
}
