package com.bros.tastymod.items;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by IceColdMintFresh on 22.06.2017.
 */
public class Sausage extends net.minecraft.item.ItemFood {
    public Sausage(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setTextureName("tastymod:sausage");
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setUnlocalizedName("Sausage");
        this.setPotionEffect(19,10,0,1f);
    }
}
