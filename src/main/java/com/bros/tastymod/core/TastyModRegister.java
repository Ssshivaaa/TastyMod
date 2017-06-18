package com.bros.tastymod.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import static com.bros.tastymod.core.TastyModCore.*;

/**
 * Created by Arty on 18.06.2017.
 */
public class TastyModRegister {

    TastyModRegister(){
        GameRegistry.registerItem(breadSlice,"BreadSlice");
        GameRegistry.registerItem(chocolate,"Chocolate");
        GameRegistry.registerItem(flour,"Flour");
        GameRegistry.registerItem(cereal,"Cereal");
        GameRegistry.registerItem(spaghetti,"Spaghetti");
    }
}
