package net.Tec_BoyJ.shulker;

import net.Tec_BoyJ.shulker.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class shulker implements ModInitializer {

	public static final String MOD_ID = "shulker";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
