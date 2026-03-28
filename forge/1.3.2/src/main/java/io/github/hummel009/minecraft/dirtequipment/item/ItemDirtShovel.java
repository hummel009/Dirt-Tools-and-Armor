package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.init.Materials;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemSpade;

public class ItemDirtShovel extends ItemSpade {
	public ItemDirtShovel(int id) {
		super(id, Materials.DIRT_TOOL);
		setCreativeTab(CreativeTabs.tabTools);
	}
}