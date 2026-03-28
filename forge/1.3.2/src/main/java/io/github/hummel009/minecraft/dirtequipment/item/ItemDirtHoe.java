package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.init.Materials;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemHoe;

public class ItemDirtHoe extends ItemHoe {
	public ItemDirtHoe(int id) {
		super(id, Materials.DIRT_TOOL);
		setCreativeTab(CreativeTabs.tabTools);
	}
}