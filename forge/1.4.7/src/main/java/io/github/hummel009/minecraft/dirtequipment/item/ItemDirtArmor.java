package io.github.hummel009.minecraft.dirtequipment.item;

import io.github.hummel009.minecraft.dirtequipment.init.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemDirtArmor extends ItemArmor implements IArmorTextureProvider {
	public ItemDirtArmor(int id, int slot) {
		super(id, Materials.DIRT_ARMOR, slot == 2 ? 2 : 1, slot);
		setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public String getArmorTextureFile(ItemStack itemStack) {
		return "/assets/dirtequipment/textures/models/armor/dirt_layer_" + (armorType == 2 ? 2 : 1) + ".png";
	}
}