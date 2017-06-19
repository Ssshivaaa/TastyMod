package com.bros.tastymod.items;

import com.bros.tastymod.core.TastyModCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by IceColdMintFresh on 19.06.2017.
 */
public class ApplePie extends ItemFood {
    public ApplePie(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setTextureName("tastymod:applepie");
        this.setUnlocalizedName("ApplePie");
        this.setCreativeTab(CreativeTabs.tabFood);
    }
}
