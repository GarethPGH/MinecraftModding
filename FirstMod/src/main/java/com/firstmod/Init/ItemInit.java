package com.firstmod.Init;

import com.firstmod.smilemod.SmileMod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SmileMod.MOD_ID);

    public static final RegistryObject<Item> SMILE = ITEMS.register("smile",
            () -> new Item(new Item.Properties().group(ModItemGroup.DECORATIONS)));

    public static void registerItem() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static class ModItemGroup extends ItemGroup {
        public static final ModItemGroup instance = new ModItemGroup(ItemGroup.GROUPS.length, "label:smile");

        private ModItemGroup(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(SMILE.get());
        }
    }
}
