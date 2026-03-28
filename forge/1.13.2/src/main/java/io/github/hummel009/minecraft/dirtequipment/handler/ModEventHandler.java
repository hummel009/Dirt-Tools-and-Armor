package io.github.hummel009.minecraft.dirtequipment.handler;

import io.github.hummel009.minecraft.dirtequipment.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEventHandler {
	@SubscribeEvent
	@SuppressWarnings("MethodMayBeStatic")
	public void onItemRegistry(RegistryEvent.Register<Item> event) {
		Items.register();
	}
}