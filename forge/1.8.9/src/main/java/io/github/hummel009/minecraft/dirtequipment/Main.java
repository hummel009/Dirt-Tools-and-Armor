package io.github.hummel009.minecraft.dirtequipment;

import io.github.hummel009.minecraft.dirtequipment.init.Items;
import io.github.hummel009.minecraft.dirtequipment.init.Recipes;
import io.github.hummel009.minecraft.dirtequipment.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "dirtequipment", useMetadata = true)
public class Main {
	@SuppressWarnings("unused")
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	@SidedProxy(clientSide = "io.github.hummel009.minecraft.dirtequipment.proxy.ClientProxy", serverSide = "io.github.hummel009.minecraft.dirtequipment.proxy.ServerProxy")
	@SuppressWarnings({"PublicField", "WeakerAccess"})
	public static CommonProxy proxy;

	@Mod.EventHandler
	@SuppressWarnings("MethodMayBeStatic")
	public void preInit(FMLPreInitializationEvent event) {
		Items.preInit();
		Recipes.preInit();
	}

	@Mod.EventHandler
	@SuppressWarnings("MethodMayBeStatic")
	public void onInit(FMLInitializationEvent event) {
		proxy.onInit();
	}
}