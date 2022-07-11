package net.Tec_BoyJ.shulker.item;

import net.Tec_BoyJ.shulker.shulker;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

           public static final Item RAW_SHULKER = registerItem("raw_shulker",
                   new Item(new FabricItemSettings().group(ItemGroup.MISC)));
           public static final Item SHULKER = registerItem("shulker",
                   new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(shulker.MOD_ID, name), item);
    }

    public static void registerModItems(){
        shulker.LOGGER.debug("Registering Mod Items for" + shulker.MOD_ID);
    }
}
