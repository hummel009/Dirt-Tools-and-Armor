package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.material.ToolMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;

public class ItemDirtSword extends SwordItem {
	public ItemDirtSword() {
		super(ToolMaterials.DIRT, 3, -2.4f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}