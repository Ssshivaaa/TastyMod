package com.bros.tastymod.items;

import com.bros.tastymod.core.TastyModCore;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

/**
 * Created by IceColdMintFresh on 23.06.2017.
 */
public class addEntityDrop {
    @SubscribeEvent
    public void addEntityDrop(LivingDropsEvent event) {
        if (event.entity instanceof EntitySheep) {
            if (event.source != null && event.source.getEntity() instanceof EntityPlayer) {
                EntityPlayer player = ((EntityPlayer) event.source.getEntity());
                if (player != null) {
                    ItemStack holding =  player.inventory.getStackInSlot(player.inventory.currentItem);
                    if (holding != null && holding.getItem() instanceof GutKnife) {
                        ItemStack itemstack = new ItemStack(TastyModCore.guts, 1);
                        event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, itemstack));
                    }
                }
            }
        }
    }
}
