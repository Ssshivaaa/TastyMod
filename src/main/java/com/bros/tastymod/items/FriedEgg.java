package com.bros.tastymod.items;

import com.bros.tastymod.core.TastyModCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by IceNice on 18.06.2017.
 */
public class FriedEgg extends ItemFood {
    public FriedEgg(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setUnlocalizedName("FriedEgg");
        this.setTextureName(TastyModCore.MODID+":friedegg");
    }
}