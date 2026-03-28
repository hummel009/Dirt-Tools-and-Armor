package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.material.ToolMaterials;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;

public class ItemDirtAxe extends AxeItem {
	public ItemDirtAxe() {
		super(ToolMaterials.DIRT, 5.0f, -3.0f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}