package com.bros.tastymod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by IceColdMintFresh on 26.06.2017.
 */
public class SmallSausages extends ItemFood {
    public SmallSausages(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setMaxStackSize(16);
        this.setUnlocalizedName("SmallSausages");
        this.setTextureName("tastymod:small_sausages");
        this.setPotionEffect(17,10,0,1f);
        this.setCreativeTab(CreativeTabs.tabFood);
    }
}
