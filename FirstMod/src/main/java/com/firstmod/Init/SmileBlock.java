package com.firstmod.Init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

//I should be able to create a SmileBlock and register it in BlockInit, and I should get a block
//That can be harvested easily with shovel, make plant sounds, be classed as a plant, and glows
public class SmileBlock extends Block {
    public int hardnessAndResistance = 0;
    public int harvestLevel = 0;
    public SoundType soundType = null;
    public float lightLevel = 0f;
    public String harvestTool = "";

    public SmileBlock(Material mater) {
        super(Block.Properties.create(mater));
        this.setHardness(2);
        this.setHarvestLevel("shovel", 0);
        this.setSoundType(SoundType.PLANT);
        this.setLightLevel(1.0F);
    }

    public void setHardness(int level) {
        this.hardnessAndResistance = level;
    }

    public void setHarvestLevel(String tool, int level) {
        this.harvestLevel = level;
        this.harvestTool = tool;
    }

    public void setSoundType(SoundType sound) {
        this.soundType = sound;
    }

    public void setLightLevel(float level) {
        this.lightLevel = level;
    }
}
