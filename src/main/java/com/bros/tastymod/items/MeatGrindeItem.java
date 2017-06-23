package com.bros.tastymod.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemReed;

/**
 * Created by IceColdMintFresh on 24.06.2017.
 */
public class MeatGrindeItem extends ItemReed {
    public MeatGrindeItem(Block p_i45329_1_) {
        super(p_i45329_1_);
        this.setUnlocalizedName("MeatGrinder");
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setMaxStackSize(1);
        this.setTextureName("tastymod:meat_grinder_item");
    }
}
