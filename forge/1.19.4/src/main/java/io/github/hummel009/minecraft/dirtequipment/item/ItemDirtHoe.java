package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.material.ToolMaterials;
import net.minecraft.world.item.HoeItem;

public class ItemDirtHoe extends HoeItem {
	public ItemDirtHoe() {
		super(ToolMaterials.DIRT, -3, 0.0f, new Properties());
	}
}