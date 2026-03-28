package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.material.ToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;

public class ItemDirtPickaxe extends PickaxeItem {
	public ItemDirtPickaxe() {
		super(ToolMaterials.DIRT, 1, -2.8f, new Properties().tab(ItemGroup.TAB_TOOLS));
	}
}