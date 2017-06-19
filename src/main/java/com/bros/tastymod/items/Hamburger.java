package com.bros.tastymod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by IceColdMintFresh on 19.06.2017.
 */
public class Hamburger extends ItemFood {
    public Hamburger(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setUnlocalizedName("Hamburger");
        this.setTextureName("tastymod:hamburger");
        this.setCreativeTab(CreativeTabs.tabFood);
    }
}
