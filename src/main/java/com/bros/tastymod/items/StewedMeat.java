package com.bros.tastymod.items;

import com.bros.tastymod.core.TastyModCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by IceColdMintFresh on 18.06.2017.
 */
public class StewedMeat extends ItemFood {
    public StewedMeat(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setUnlocalizedName("StewedMeat");
        this.setTextureName("tastymod:stewedmeat");
        this.setCreativeTab(CreativeTabs.tabFood);
    }
}
