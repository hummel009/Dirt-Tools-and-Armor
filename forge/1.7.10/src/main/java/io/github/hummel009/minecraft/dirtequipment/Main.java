package io.github.hummel009.minecraft.dirtequipment;

import io.github.hummel009.minecraft.dirtequipment.init.Items;
import io.github.hummel009.minecraft.dirtequipment.init.Recipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "dirtequipment", useMetadata = true)
public class Main {
	@SuppressWarnings("unused")
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	@Mod.EventHandler
	@SuppressWarnings("MethodMayBeStatic")
	public void preInit(FMLPreInitializationEvent event) {
		Items.preInit();
		Recipes.preInit();
	}
}