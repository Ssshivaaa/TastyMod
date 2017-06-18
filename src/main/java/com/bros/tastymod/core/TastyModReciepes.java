package com.bros.tastymod.core;

import cpw.mods.fml.common.registry.GameRegistry;
import growthcraft.core.GrowthCraftCore;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
/**
 * Created by IceNice on 18.06.2017.
 */
public class TastyModReciepes {
    TastyModReciepes()
    {
        GameRegistry.addRecipe(new ItemStack(TastyModCore.sugarBucket,1),new Object[]{"###","###"," 2 ",('#'),Items.sugar,('2'),Items.bucket});
        GameRegistry.addRecipe(new ItemStack(TastyModCore.rawOmelet,1),new Object[]{" S ","###"," M ",('S'), GrowthCraftCore.items.salt.asStack(1),('#'),Items.egg,('M'),Items.milk_bucket.setContainerItem(Items.bucket)});

        GameRegistry.addShapelessRecipe(new ItemStack(TastyModCore.chips,1),new Object[]{Items.potato,Items.potato,Items.potato});

        GameRegistry.addSmelting(TastyModCore.sugarBucket, new ItemStack(TastyModCore.caramel,1),500f);
        GameRegistry.addSmelting(TastyModCore.chips, new ItemStack(TastyModCore.friedChips,1),500f);
        GameRegistry.addSmelting(Items.egg, new ItemStack(TastyModCore.friedEgg,1),500f);
        GameRegistry.addSmelting(TastyModCore.rawOmelet, new ItemStack(TastyModCore.omelet,1),500f);
    }
}
