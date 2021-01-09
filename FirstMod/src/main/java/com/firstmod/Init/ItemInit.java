package com.firstmod.Init;

import net.minecraftforge.fml.RegistryObject;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemInit {

    public static final RegistryObject<Item> SMILE = Registration.ITEMREG.register("smile",
            () -> new Item(new Item.Properties().group(ItemGroup.DECORATIONS)));

    public static void register() {
    };
}
