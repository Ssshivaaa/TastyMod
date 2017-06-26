package com.bros.tastymod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by IceColdMintFresh on 26.06.2017.
 */
public class Rissole extends ItemFood {
    public Rissole(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setUnlocalizedName("Rissole");
        this.setMaxStackSize(32);
        this.setPotionEffect(3,10,1,1f);
        this.setTextureName("tastymod:rissole");
    }
}
