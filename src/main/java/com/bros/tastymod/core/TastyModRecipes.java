package com.bros.tastymod.core;

import com.bros.tastymod.*;
import com.bros.tastymod.items.StewedMeat;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by IceColdMintFresh on 18.06.2017.
 */
public class TastyModRecipes {
    TastyModRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(TastyModCore.stewedMeat, 1),new Object[]{"@#*","   ","   ",('@'), Items.potato,('#'),Items.bowl,('*'),Items.chicken});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.stewedMeat, 1),new Object[]{"   ","@#*","   ",('@'), Items.potato,('#'),Items.bowl,('*'),Items.chicken});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.stewedMeat, 1),new Object[]{"   ","   ","@#*",('@'), Items.potato,('#'),Items.bowl,('*'),Items.chicken});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.applePie, 1), new Object[]{"MMM","SAE","WWW",('M'), Items.milk_bucket,('S'),Items.sugar,('A'),Items.apple,('E'),Items.egg,('W'),Items.wheat});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.applePie, 1), new Object[]{"MMM","EAS","WWW",('M'), Items.milk_bucket,('S'),Items.sugar,('A'),Items.apple,('E'),Items.egg,('W'),Items.wheat});
    }
}
