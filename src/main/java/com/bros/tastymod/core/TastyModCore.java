package com.bros.tastymod.core;

import com.bros.tastymod.items.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import growthcraft.core.bucket.SaltBucketEntry;
import growthcraft.core.eventhandler.EventHandlerSpecialBucketFill;
import net.minecraft.item.Item;

@Mod(modid = TastyModCore.MODID, version = TastyModCore.VERSION)
public class TastyModCore
{
    public static final String MODID = "TastyMod";
    public static final String VERSION = "1.0";

    public static Item breadSlice;
    public static Item chocolate;
    public static Item flour;
    public static Item cereal;
    public static Item spaghetti;

    @EventHandler
    public void preLoad(FMLInitializationEvent event)
    {
        EventHandlerSpecialBucketFill.instance().addEntry(new SaltBucketEntry()); //Enabling salt water in ocean biomes

        breadSlice = new BreadSlice(3,1,false);
        chocolate = new Chocolate(4,1,false);
        flour  = new Flour(1,0.2f,false);
        cereal  = new Cereal(6,1,false);
        spaghetti = new Spaghetti(1,0.2f,false);

        new TastyModRegister();
        new TastyModReciepes();
    }
}
