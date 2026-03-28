package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.material.ToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemSpade;

public class ItemDirtShovel extends ItemSpade {
	public ItemDirtShovel() {
		super(ToolMaterials.DIRT, 1.5f, -3.0f, new Properties().group(ItemGroup.TOOLS));
	}
}