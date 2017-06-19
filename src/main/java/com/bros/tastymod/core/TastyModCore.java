package com.bros.tastymod.core;

import com.bros.tastymod.blocks.MeatPie;
import com.bros.tastymod.items.ApplePie;
import com.bros.tastymod.items.MeatPieItem;
import com.bros.tastymod.items.StewedMeat;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

@Mod(modid = TastyModCore.MODID, version = TastyModCore.VERSION)
public class TastyModCore
{
    public static final String MODID = "TastyMod";
    public static final String VERSION = "1.0";
    public static ItemFood stewedMeat;
    public static MeatPie meatPie;
    public static Item meatPieItem;
    public static ItemFood applePie;

    @EventHandler
    public void preLoad(FMLInitializationEvent event)
    {
        TastyModCore.stewedMeat = new StewedMeat(10,1,false);
        TastyModCore.meatPie = new MeatPie();
        TastyModCore.meatPieItem = new MeatPieItem(meatPie);
        TastyModCore.applePie = new ApplePie(8,1,false);

        new TastyModRegister();
        new TastyModRecipes();
    }
}