package com.bros.tastymod.core;

import com.bros.tastymod.*;
import com.bros.tastymod.items.StewedMeat;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by IceColdMintFresh on 18.06.2017.
 */
public class TastyModRecipes {
    TastyModRecipes()
    {
        //stewedMeat recipe types
        GameRegistry.addRecipe(new ItemStack(TastyModCore.stewedMeat, 1),new Object[]{"@#*","   ","   ",('@'), Items.potato,('#'), Items.bowl,('*'), Items.chicken});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.stewedMeat, 1),new Object[]{"   ","@#*","   ",('@'), Items.potato,('#'), Items.bowl,('*'), Items.chicken});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.stewedMeat, 1),new Object[]{"   ","   ","@#*",('@'), Items.potato,('#'), Items.bowl,('*'), Items.chicken});
        //applePie recipe types
        GameRegistry.addRecipe(new ItemStack(TastyModCore.applePie,1), new Object[]{"***","123","###",('*'), Items.milk_bucket,('1'), Items.egg,('2'), Items.apple,('3'), Items.sugar,('#'),Items.wheat});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.applePie,1), new Object[]{"***","321","###",('*'), Items.milk_bucket,('1'), Items.egg,('2'), Items.apple,('3'), Items.sugar,('#'),Items.wheat});

    }
}
