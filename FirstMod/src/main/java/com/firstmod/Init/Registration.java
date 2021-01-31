package com.firstmod.Init;

import com.firstmod.smilemod.SmileMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
        public static final DeferredRegister<Block> BLOCKREG = DeferredRegister.create(ForgeRegistries.BLOCKS,
                SmileMod.MOD_ID);
        public static final DeferredRegister<Item> ITEMREG = DeferredRegister.create(ForgeRegistries.ITEMS,
                SmileMod.MOD_ID);
        public static final DeferredRegister<EntityType<?>> ENTITYREG = DeferredRegister.create(ForgeRegistries.ENTITIES,
                 SmileMod.MOD_ID);

        public static void register() {
                IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
                BLOCKREG.register(eventBus);
                ITEMREG.register(eventBus);
                ENTITYREG.register(eventBus);

                ItemInit.register();
                BlockInit.register();
                EntityInit.register();
        }
}
