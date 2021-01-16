package com.nierot.mc.armor;

import com.nierot.mc.ImStuff;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ArmorMaterialStuffium implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[] {2, 5, 6, 3};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 25;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_AMOUNT[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() { return 30; }

    @Override
    public SoundEvent getEquipSound() { 
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ImStuff.STUFFIUM_INGOT);
    }

    @Override
    public String getName() {
        return "stuffium";
    }

    @Override
    public float getToughness() { return 2f; }

    @Override
    public float getKnockbackResistance() { return 0f; }
    
}
