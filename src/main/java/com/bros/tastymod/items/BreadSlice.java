package com.bros.tastymod.items;

import com.bros.tastymod.core.TastyModCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by Arty on 18.06.2017.
 */

public class BreadSlice extends ItemFood {
    public BreadSlice(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setUnlocalizedName("BreadSlice");
        this.setTextureName(TastyModCore.MODID+":breadslice");
        this.setCreativeTab(CreativeTabs.tabFood);
    }

}
