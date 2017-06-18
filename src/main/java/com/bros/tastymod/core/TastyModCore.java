package com.bros.tastymod.core;

import com.bros.tastymod.items.*;
import cpw.mods.fml.common.registry.GameRegistry;
import growthcraft.apples.GrowthCraftApples;
import growthcraft.core.GrowthCraftCore;
import growthcraft.core.common.GrcModuleBase;
import growthcraft.core.common.definition.FluidDefinition;
import growthcraft.core.common.definition.ItemDefinition;
import growthcraft.core.common.item.GrcItemBase;
import growthcraft.core.common.item.GrcItemBucketBase;
import growthcraft.core.common.item.GrcItemFoodBase;
import growthcraft.core.common.item.ItemSalt;
import growthcraft.core.init.GrcCoreItems;
import growthcraft.core.util.FluidFactory;
import growthcraft.milk.GrowthCraftMilk;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.rmi.registry.Registry;

@Mod(modid = TastyModCore.MODID, version = TastyModCore.VERSION)
public class TastyModCore
{
    public static final String MODID = "TastyMod";
    public static final String VERSION = "1.0";
    public static Item caramel;
    public static Item sugarBucket;
    public static Item friedEgg;
    public static Item chips;
    public static Item friedChips;
    public static Item rawOmelet;
    public static Item omelet;
    
    @EventHandler
    public void preLoad (FMLInitializationEvent event)
    {
        caramel = new Caramel(1,1f,false);
        sugarBucket = new SugarBucket(1,1f,false);
        friedEgg = new FriedEgg(1,1f,false);
        chips = new Chips(1,1f,false);
        friedChips = new FriedChips(1,1f,false);
        rawOmelet = new RawOmelet(1,1f,false);
        omelet = new Omelet(1,1f,false);
        new TastyModRegister();
        new TastyModReciepes();
    }
}
