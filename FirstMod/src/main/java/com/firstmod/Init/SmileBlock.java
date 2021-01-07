package com.firstmod.Init;

import com.firstmod.smilemod.SmileMod;
import com.firstmod.Init.ItemInit;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class SmileBlock extends Block {
    public SmileBlock(Material mater) {
        super(mater);
        this.setHardness(2);
        this.setHarvestLevel("shovel", 0);
        this.setSoundType(SoundType.PLANT);
        this.setLightLevel(1.0F);
    }
}
