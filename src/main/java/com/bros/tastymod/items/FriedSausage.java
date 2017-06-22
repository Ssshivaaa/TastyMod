package com.bros.tastymod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by IceColdMintFresh on 23.06.2017.
 */
public class FriedSausage extends ItemFood {
    public FriedSausage(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setTextureName("tastymod:fried_sausage");
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setUnlocalizedName("FriedSausage");
        this.setPotionEffect(1,5,1,1f);
    }
}
