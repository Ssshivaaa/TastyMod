package com.bros.tastymod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by IceColdMintFresh on 26.06.2017.
 */
public class FriedSmallSausages extends ItemFood {
    public FriedSmallSausages(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setUnlocalizedName("FriedSmallSausages");
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setMaxStackSize(16);
        this.setTextureName("tastymod:fried_small_sausages");
    }
}
