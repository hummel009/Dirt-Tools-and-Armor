package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.init.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemDirtShovel extends ItemSpade {
	public ItemDirtShovel() {
		super(Materials.DIRT_TOOL);
		setCreativeTab(CreativeTabs.tabTools);
	}
}