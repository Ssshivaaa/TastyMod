package com.bros.tastymod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by IceColdMintFresh on 23.06.2017.
 */
public class GutKnife extends ItemSword {
    public GutKnife(ToolMaterial p_i45356_1_) {
        super(p_i45356_1_);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setTextureName("tastymod:gut_sword");
        this.setUnlocalizedName("GutKnife");
    }
}
