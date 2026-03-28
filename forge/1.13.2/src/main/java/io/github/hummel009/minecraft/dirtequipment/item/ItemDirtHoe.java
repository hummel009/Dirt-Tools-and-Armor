package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.material.ToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemHoe;

public class ItemDirtHoe extends ItemHoe {
	public ItemDirtHoe() {
		super(ToolMaterials.DIRT, 0.0f, new Properties().group(ItemGroup.TOOLS));
	}
}