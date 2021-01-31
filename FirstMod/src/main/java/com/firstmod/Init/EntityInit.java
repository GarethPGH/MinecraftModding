package com.firstmod.Init;

import com.firstmod.smilemod.SmileMod;
import java.util.function.Supplier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityType.Builder;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import java.util.function.Supplier;

//Need to do the JSON thing for the MODDEDCREEPER
public class EntityInit{
    public static final RegistryObject<EntityType<? extends CreeperEntity>> MODDEDCREEPER = Registration.ENTITYREG.register("moddedcreeper",
      
    () -> EntityType.Builder.create(ModdedCreeper::new, EntityClassification.MONSTER)
                .setShouldReceiveVelocityUpdates(false)
                //.disableSummoning()
                .build(new ResourceLocation(SmileMod.MOD_ID, "moddedcreeper").toString()));

    public static void register() {};
}