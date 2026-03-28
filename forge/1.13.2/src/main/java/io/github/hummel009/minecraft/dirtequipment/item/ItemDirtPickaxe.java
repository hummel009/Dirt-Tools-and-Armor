package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.material.ToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemPickaxe;

public class ItemDirtPickaxe extends ItemPickaxe {
	public ItemDirtPickaxe() {
		super(ToolMaterials.DIRT, 1, -2.8f, new Properties().group(ItemGroup.TOOLS));
	}
}