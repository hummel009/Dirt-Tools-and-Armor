package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.init.Materials;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemSword;

public class ItemDirtSword extends ItemSword {
	public ItemDirtSword(int id) {
		super(id, Materials.DIRT_TOOL);
		setCreativeTab(CreativeTabs.tabTools);
	}
}