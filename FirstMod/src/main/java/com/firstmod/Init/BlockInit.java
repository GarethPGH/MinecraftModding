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
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            SmileMod.MOD_ID);
    /// Abstractblock. properties,setlightlevel not applicable to argument, even
    /// though it supposed to work
    // Figure out how to use block.properties.create Cause these aren't likely
    /// "properties" in a traditional sense.
    // Which is why they can't be accessed using dot notation.
    Block placeholderblock = new Smile_Block();

    public static final RegistryObject<Block> SMILE_BLOCK = BLOCKS.register("smile_block",
            () -> new Block(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1f, 2f).harvestLevel(1)
                    .harvestTool(ToolType.SHOVEL).lightLevel(Integer.valueOf(1))));

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event){
        final IForgeRegistry<Item> registry = event.getRegistry();
//Cant make static reference to nonstatic method
        BLOCKS.getEntries().stream().map(RegistryObject<Block>::get).forEach((block) -> {
            final Item.Properties properties = Item.Properties().group(ItemInit.ModItemGroup.instance);
            final BlockItem blockitm = new BlockItem(block, properties);
            blockitm.setRegistryName(block.getRegistryName());
            registry.register(blockitm);
        }))

 
    }

    // Trying to get Luminance of 10.
    public class Smile_Block extends Block {
        public float lightLevel = 0;
        Material material = null;

        public Smile_Block() {
            super(Properties.create(Material.PLANTS).hardnessAndResistance(1f, 2f).harvestLevel(1));
        }

        @Override
        public void setLightLevel(float f) {
            lightLevel = f;
        }
    }
    // public static void registerItem() {
    // BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    // }

    // public static class ModItemGroup extends ItemGroup {
    // public static final ModItemGroup instance = new
    // ModItemGroup(ItemGroup.GROUPS.length, "label:smile");

    // private ModItemGroup(int index, String label) {
    // super(index, label);
    // }

    // @Override
    // public ItemStack createIcon() {
    // return new ItemStack(SMILE_BLOCK.get());
    // }
    // }
}
