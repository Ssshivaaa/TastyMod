package com.bros.tastymod.core;

import com.bros.tastymod.*;
import com.bros.tastymod.items.StewedMeat;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import growthcraft.core.GrowthCraftCore;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
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
        GameRegistry.addRecipe(new ItemStack(TastyModCore.carrotSoup,1), new Object[]{"CCC"," W "," B ",('C'), Items.carrot,('W'),Items.water_bucket.setContainerItem(Items.bucket),('B'),Items.bowl});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.meatPieItem,1), new Object[]{" S ","MEM","WWW",('S'),GrowthCraftCore.items.salt.asStack(1),('M'),Items.cooked_beef,('E'),Items.egg,('W'),Items.wheat});
        GameRegistry.addShapelessRecipe(new ItemStack(TastyModCore.chips,1),new Object[]{Items.potato,Items.potato,Items.potato});
        GameRegistry.addShapelessRecipe(new ItemStack(breadSlice,3), new Object[]{Items.bread});
        GameRegistry.addRecipe(new ItemStack(chocolate,1), new Object[]{"CCC","CCC","CCC",('C'),new ItemStack(Items.dye, 1, 3)});
        GameRegistry.addShapelessRecipe(new ItemStack(flour,6),new Object[]{Items.wheat,Items.wheat,Items.wheat,Items.wheat});
        GameRegistry.addSmelting(TastyModCore.sugarBucket, new ItemStack(TastyModCore.caramel,1),500f);
        GameRegistry.addSmelting(TastyModCore.chips, new ItemStack(TastyModCore.friedChips,1),500f);
        GameRegistry.addSmelting(Items.egg, new ItemStack(TastyModCore.friedEgg,1),500f);
        GameRegistry.addSmelting(TastyModCore.rawOmelet, new ItemStack(TastyModCore.omelet,1),500f);
        GameRegistry.addRecipe(new ItemStack(cereal,1),new Object[]{" W ", "WCW", " W ",('W'), Items.wheat, ('C'),chocolate});
        GameRegistry.addRecipe(new ItemStack(spaghetti,3),new Object[]{"W  "," W "," BW",('W'),flour,('B'),Items.water_bucket.setContainerItem(Items.bucket)});
        GameRegistry.addRecipe(new ItemStack(spaghetti,3),new Object[]{"  W"," W ","WB ",('W'),flour,('B'),Items.water_bucket.setContainerItem(Items.bucket)});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.hamburger,1), new Object[]{"S  ","B  ","S  ",('S'), TastyModCore.breadSlice,('B'),Items.cooked_beef});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.hamburger,1), new Object[]{" S "," B "," S ",('S'), TastyModCore.breadSlice,('B'),Items.cooked_beef});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.hamburger,1), new Object[]{"  S","  B","  S",('S'), TastyModCore.breadSlice,('B'),Items.cooked_beef});
        GameRegistry.addShapelessRecipe(new ItemStack(TastyModCore.mince),new Object[]{Items.rotten_flesh,Items.rotten_flesh,Items.rotten_flesh});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.sausage, 1), new Object[]{"SMS","MGM","SMS",('S'),GrowthCraftCore.items.salt.asStack(1),('M'),TastyModCore.mince,('G'),TastyModCore.guts});
        GameRegistry.addSmelting(TastyModCore.sausage,new ItemStack(TastyModCore.friedSausage),500f);
    }
}
