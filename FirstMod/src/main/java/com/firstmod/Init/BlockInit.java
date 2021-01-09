package com.firstmod.Init;

import java.util.function.Supplier;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockInit {

    static void register() {
    };

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKREG.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMREG.register(name,
                () -> new BlockItem(ret.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return ret;
    }

    public static final RegistryObject<Block> SMILEBLOCK = register("smileblock",
            () -> new Block(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.PLANT)
                    .jumpFactor(1.0F).hardnessAndResistance(1f, 2f).harvestLevel(1).harvestTool(ToolType.SHOVEL)));
}
