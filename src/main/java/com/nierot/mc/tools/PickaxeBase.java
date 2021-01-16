package com.nierot.mc.tools;

import com.nierot.mc.ImStuff;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {

    public PickaxeBase(ToolMaterial material) {
        super(material, -1, -2.8f, new Item.Settings().group(ImStuff.ITEM_GROUP));
    }
    
}
