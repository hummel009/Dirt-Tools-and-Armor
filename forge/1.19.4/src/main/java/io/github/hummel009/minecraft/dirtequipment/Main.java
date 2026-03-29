package io.github.hummel009.minecraft.dirtequipment;

import io.github.hummel009.minecraft.dirtequipment.handler.ModEventHandler;
import io.github.hummel009.minecraft.dirtequipment.init.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("dirtequipment")
@SuppressWarnings("UtilityClassWithPublicConstructor")
public class Main {
	@SuppressWarnings("unused")
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	@SuppressWarnings("removal")
	public Main() {
		var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		var modEventHandler = new ModEventHandler();
		modEventBus.register(modEventHandler);

		Items.register(modEventBus);
	}
}