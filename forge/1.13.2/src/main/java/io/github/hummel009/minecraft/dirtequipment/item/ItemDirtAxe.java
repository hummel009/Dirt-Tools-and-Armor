package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.material.ToolMaterials;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemGroup;

public class ItemDirtAxe extends ItemAxe {
	public ItemDirtAxe() {
		super(ToolMaterials.DIRT, 5.0f, -3.0f, new Properties().group(ItemGroup.TOOLS));
	}
}