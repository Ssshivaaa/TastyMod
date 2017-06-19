package com.bros.tastymod.core;

import com.bros.tastymod.blocks.MeatPie;
import com.bros.tastymod.items.ApplePie;
import com.bros.tastymod.items.MeatPieItem;
import com.bros.tastymod.items.StewedMeat;
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
import com.bros.tastymod.items.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import growthcraft.core.bucket.SaltBucketEntry;
import growthcraft.core.eventhandler.EventHandlerSpecialBucketFill;
import net.minecraft.item.Item;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.rmi.registry.Registry;

@Mod(modid = TastyModCore.MODID, version = TastyModCore.VERSION)
public class TastyModCore
{
    public static final String MODID = "TastyMod";
    public static final String VERSION = "1.0";
    public static ItemFood stewedMeat;
    public static MeatPie meatPie;
    public static Item meatPieItem;
    public static ItemFood applePie;


    public static Item breadSlice;
    public static Item chocolate;
    public static Item flour;
    public static Item cereal;
    public static Item spaghetti;
    public static Item caramel;
    public static Item sugarBucket;
    public static Item friedEgg;
    public static Item chips;
    public static Item friedChips;
    public static Item rawOmelet;
    public static Item omelet;

    @EventHandler
    public void preLoad(FMLInitializationEvent event)
    {
        TastyModCore.stewedMeat = new StewedMeat(10,1,false);
        TastyModCore.meatPie = new MeatPie();
        TastyModCore.meatPieItem = new MeatPieItem(meatPie);
        TastyModCore.applePie = new ApplePie(8,1,false);

        new TastyModRegister();
        new TastyModRecipes();
        EventHandlerSpecialBucketFill.instance().addEntry(new SaltBucketEntry()); //Enabling salt water in ocean biomes

        breadSlice = new BreadSlice(3,1,false);
        chocolate = new Chocolate(4,1,false);
        flour  = new Flour(1,0.2f,false);
        cereal  = new Cereal(6,1,false);
        spaghetti = new Spaghetti(1,0.2f,false);
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
