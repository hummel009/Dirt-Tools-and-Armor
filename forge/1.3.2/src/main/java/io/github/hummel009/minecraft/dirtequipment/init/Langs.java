package io.github.hummel009.minecraft.dirtequipment.init;

import io.github.hummel009.minecraft.dirtequipment.util.UnicodeHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Langs {
	private Langs() {
	}

	public static void preInit() {
		LanguageRegistry instance = LanguageRegistry.instance();

		UnicodeHelper.loadLocalization(instance, "/assets/dirtequipment/lang/en_US.lang", "en_US");
		UnicodeHelper.loadLocalization(instance, "/assets/dirtequipment/lang/ru_RU.lang", "ru_RU");
		UnicodeHelper.loadLocalization(instance, "/assets/dirtequipment/lang/uk_UA.lang", "uk_UA");
		UnicodeHelper.loadLocalization(instance, "/assets/dirtequipment/lang/zh_CN.lang", "zh_CN");
	}
}