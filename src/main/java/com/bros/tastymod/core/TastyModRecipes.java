package com.bros.tastymod.core;

import com.bros.tastymod.*;
import com.bros.tastymod.items.StewedMeat;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import growthcraft.core.GrowthCraftCore;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static com.bros.tastymod.core.TastyModCore.*;
import static com.bros.tastymod.core.TastyModCore.flour;
import static com.bros.tastymod.core.TastyModCore.spaghetti;

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
        GameRegistry.addRecipe(new ItemStack(TastyModCore.sugarBucket,1),new Object[]{"###","###"," 2 ",('#'),Items.sugar,('2'),Items.bucket});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.rawOmelet,1),new Object[]{" S ","###"," M ",('S'), GrowthCraftCore.items.salt.asStack(1),('#'),Items.egg,('M'),Items.milk_bucket.setContainerItem(Items.bucket)});

        GameRegistry.addShapelessRecipe(new ItemStack(TastyModCore.chips,1),new Object[]{Items.potato,Items.potato,Items.potato});
        GameRegistry.addShapelessRecipe(new ItemStack(breadSlice,3), new Object[]{Items.bread});
        GameRegistry.addShapelessRecipe(new ItemStack(chocolate,1), new Object[]{new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3),new ItemStack(Items.dye, 1, 3)});
        GameRegistry.addShapelessRecipe(new ItemStack(flour,6),new Object[]{Items.wheat,Items.wheat,Items.wheat,Items.wheat});

        GameRegistry.addSmelting(TastyModCore.sugarBucket, new ItemStack(TastyModCore.caramel,1),500f);
        GameRegistry.addSmelting(TastyModCore.chips, new ItemStack(TastyModCore.friedChips,1),500f);
        GameRegistry.addSmelting(Items.egg, new ItemStack(TastyModCore.friedEgg,1),500f);
        GameRegistry.addSmelting(TastyModCore.rawOmelet, new ItemStack(TastyModCore.omelet,1),500f);

        GameRegistry.addRecipe(new ItemStack(cereal,1),new Object[]{" W ", "WCW", " W ",('W'), Items.wheat, ('C'),chocolate});
        GameRegistry.addRecipe(new ItemStack(spaghetti,3),new Object[]{"W  "," W "," BW",('W'),flour,('B'),Items.water_bucket.setContainerItem(Items.bucket)});
        GameRegistry.addRecipe(new ItemStack(spaghetti,3),new Object[]{"  W"," W ","WB ",('W'),flour,('B'),Items.water_bucket.setContainerItem(Items.bucket)});
    }
}
