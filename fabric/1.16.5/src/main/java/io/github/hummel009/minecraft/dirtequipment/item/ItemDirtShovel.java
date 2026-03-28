package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.material.ToolMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ShovelItem;

public class ItemDirtShovel extends ShovelItem {
	public ItemDirtShovel() {
		super(ToolMaterials.DIRT, 1.5f, -3.0f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}