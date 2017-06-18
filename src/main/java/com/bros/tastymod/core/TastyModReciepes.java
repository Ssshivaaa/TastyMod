package com.bros.tastymod.core;

/**
 * Created by Arty on 18.06.2017.
 */

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import growthcraft.core.GrowthCraftCore;
import growthcraft.core.common.item.ItemSalt;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import static com.bros.tastymod.core.TastyModCore.*;

public class TastyModReciepes {

    TastyModReciepes(){
        GameRegistry.addShapelessRecipe(new ItemStack(breadSlice,3), new Object[]{Items.bread});
        GameRegistry.addShapelessRecipe(new ItemStack(chocolate,1), new Object[]{new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3)});
        GameRegistry.addShapelessRecipe(new ItemStack(flour,6),new Object[]{Items.wheat,Items.wheat,Items.wheat,Items.wheat});
        GameRegistry.addRecipe(new ItemStack(cereal,1),new Object[]{" W ", "WCW", " W ",('W'), Items.wheat, ('C'),chocolate});
        GameRegistry.addRecipe(new ItemStack(spaghetti,3),new Object[]{"W  "," W "," BW",('W'),flour,('B'),Items.water_bucket.setContainerItem(Items.bucket)});
        GameRegistry.addRecipe(new ItemStack(spaghetti,3),new Object[]{"  W"," W ","WB ",('W'),flour,('B'),Items.water_bucket.setContainerItem(Items.bucket)});
    }
}
