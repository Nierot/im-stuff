package com.nierot.mc.tools;

import com.nierot.mc.ImStuff;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {

    public AxeBase(ToolMaterial material) {
        super(material, 3, -3f, new Item.Settings().group(ImStuff.ITEM_GROUP));
    }
    
}
