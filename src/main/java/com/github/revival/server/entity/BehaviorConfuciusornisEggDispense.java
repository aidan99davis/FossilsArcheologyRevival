package com.github.revival.server.entity;

import com.github.revival.server.entity.mob.EntityConfuciusornisEgg;
import net.minecraft.dispenser.BehaviorProjectileDispense;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.IProjectile;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class BehaviorConfuciusornisEggDispense extends BehaviorProjectileDispense {
    /**
     * Reference to the MinecraftServer object.
     */
    final MinecraftServer mcServer;
    int javelin;

    public BehaviorConfuciusornisEggDispense(MinecraftServer par1, int jav0) {
        this.mcServer = par1;
        this.javelin = jav0;
    }

    /**
     * Return the projectile entity spawned by this dispense behavior.
     */
    @Override
    protected IProjectile getProjectileEntity(World par1World, IPosition par2IPosition) {
        if (this.javelin < 0) {
            return new EntityConfuciusornisEgg(par1World, par2IPosition.getX(), par2IPosition.getY(), par2IPosition.getZ());
        }

        return new EntityConfuciusornisEgg(par1World, par2IPosition.getX(), par2IPosition.getY(), par2IPosition.getZ());
    }
}