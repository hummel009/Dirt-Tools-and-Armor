package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.init.ArmorMaterials;
import net.minecraft.world.item.ArmorItem;

public class ItemDirtArmor extends ArmorItem {
	public ItemDirtArmor(Type type) {
		super(ArmorMaterials.DIRT, type, new Properties().durability(type.getDurability(33)));
	}
}