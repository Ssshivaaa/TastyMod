package com.bros.tastymod.items;

import com.bros.tastymod.core.TastyModCore;
import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCake;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.world.World;

/**
 * Created by IceColdMintFresh on 19.06.2017.
 */
public class MeatPieItem extends ItemReed {

    public MeatPieItem(Block p_i45329_1_) {
        super(p_i45329_1_);
        this.setTextureName("tastymod:cake_icon");
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setUnlocalizedName("MeatPie");
    }

    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10){
        if(par7 != 1){
            return false;
        }else{
            if(player.canPlayerEdit(x, y + 1, z, par7, stack) && player.canPlayerEdit(x, y + 1, z, par7, stack)){
                world.setBlock(x, y + 1, z, TastyModCore.meatPie);
                world.setBlock(x, y + 1, z, TastyModCore.meatPie);
                world.notifyBlockOfNeighborChange(x, y + 1, z, TastyModCore.meatPie);
                world.notifyBlockOfNeighborChange(x, y + 1, z, TastyModCore.meatPie);
                --stack.stackSize;
                return true;
            }else{
                return false;
            }
        }
    }
}
