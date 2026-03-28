package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.material.ToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemSword;

public class ItemDirtSword extends ItemSword {
	public ItemDirtSword() {
		super(ToolMaterials.DIRT, 3, -2.4f, new Properties().group(ItemGroup.COMBAT));
	}
}