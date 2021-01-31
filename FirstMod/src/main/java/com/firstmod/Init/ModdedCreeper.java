package com.firstmod.Init;

import java.util.function.Supplier;
import net.minecraftforge.fml.RegistryObject;
import javax.annotation.Nullable;
//import net.minecraftforge.event.entity.player;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.network.IPacket;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.common.registry.EntityRegistry;
//Contains methods for spawning eggs and such

//Fix this code. ModdedCreeper exists now, but it can't be summoned
//Also create egg assets for spawning

public class ModdedCreeper extends CreeperEntity{
    //Create a class such that if player has the smile item, they can ride the creepe
    public ModdedCreeper(EntityType<? extends ModdedCreeper> entityTypeIn, World worldIn){
        super(entityTypeIn, worldIn);
    }
  //  @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
        
  //  @Override
    protected boolean canBeRidden(){
        return true;
    }

  //  @Override
    public boolean startRiding(Entity entityIn){
        return true;
    }

 //   @Override
    public boolean startRiding(Entity entityIn, boolean force){
        force = true;
        return force;
    }

  //  @Override
    public double getMountedYOffset(){
        return 10.0;
    }

  //  @Override
    public void removePassengers(){

    }

 //   @Override
    public void dismountRidingEntity(){

    }

 //   @Override
    protected void addPassenger(Entity passenger){

    }

 //   @Override
    protected void removePassenger(Entity passenger){
     
    }

 //   @Override
    protected boolean canFitPassenger(Entity passenger){
        return true;
    }
    
   // @Override
    public boolean isBeingRidden(){
        return true;
    }
    
  //  @Override
    public boolean shouldRiderSit(){
        return true;
    }

  //  @Override'
  //This must return an entity, and cant have a placeholder value cast to entity.
    //  @Nullable
    //  public Entity getControllingPassenger(){
    //        String placeholder = "placeholder";
    //      Entity entityIn;
    //      if(this.isBeingRidden()){
    //         // entityIn = getEntityPlayer();
    //         entityIn = (Entity)placeholder;
    //      }
    //      return entityIn;
    //  }

  //  @Override
    public boolean canRiderInteract(){
        return true;
    }

   /// @Override
    public boolean canPassengerSteer(){
        return true;
    }

}