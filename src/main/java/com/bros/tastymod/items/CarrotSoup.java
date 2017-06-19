package com.bros.tastymod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by IceColdMintFresh on 19.06.2017.
 */
public class CarrotSoup extends ItemFood {
    public CarrotSoup(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setUnlocalizedName("CarrotSoup");
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setTextureName("tastymod:carrot_soup");
        this.setMaxStackSize(1);
    }
}
