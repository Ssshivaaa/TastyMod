package com.bros.tastymod.items;

import com.bros.tastymod.core.TastyModCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by IceNice on 19.06.2017.
 */
public class Omelet extends ItemFood {
    public Omelet(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setUnlocalizedName("Omelet");
        this.setTextureName(TastyModCore.MODID+":omelet");
    }
}
