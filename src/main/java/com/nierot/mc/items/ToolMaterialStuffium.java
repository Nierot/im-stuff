package com.nierot.mc.items;

import com.nierot.mc.ImStuff;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialStuffium implements ToolMaterial {

    @Override
    public int getDurability() { return 750; }

    @Override
    public float getMiningSpeedMultiplier() { return 7.0f; }

    @Override
    public float getAttackDamage() { return 5.0f; }

    @Override
    public int getMiningLevel() { return 2; }

    @Override
    public int getEnchantability() { return 30; }

    @Override
    public Ingredient getRepairIngredient() { return Ingredient.ofItems(ImStuff.STUFFIUM_INGOT); }
    
}