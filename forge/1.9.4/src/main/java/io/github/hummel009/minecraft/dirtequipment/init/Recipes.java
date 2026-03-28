package io.github.hummel009.minecraft.dirtequipment.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static io.github.hummel009.minecraft.dirtequipment.init.Items.*;

@SuppressWarnings("WeakerAccess")
public class Recipes {
	private Recipes() {
	}

	public static void preInit() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtSword), "D", "D", "/", 'D', Blocks.DIRT, '/', Items.STICK));

		GameRegistry.addRecipe(new ItemStack(dirtHelmet), "DDD", "D D", 'D', Blocks.DIRT);
		GameRegistry.addRecipe(new ItemStack(dirtChestplate), "D D", "DDD", "DDD", 'D', Blocks.DIRT);
		GameRegistry.addRecipe(new ItemStack(dirtLeggings), "DDD", "D D", "D D", 'D', Blocks.DIRT);
		GameRegistry.addRecipe(new ItemStack(dirtBoots), "D D", "D D", 'D', Blocks.DIRT);

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtShovel), "D", "/", "/", 'D', Blocks.DIRT, '/', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtPickaxe), "DDD", " / ", " / ", 'D', Blocks.DIRT, '/', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtAxe), "DD", "D/", " /", 'D', Blocks.DIRT, '/', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dirtHoe), "DD", " /", " /", 'D', Blocks.DIRT, '/', Items.STICK));
	}
}
