package com.bros.tastymod.core;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by IceColdMintFresh on 18.06.2017.
 */
public class TastyModRegister {
    TastyModRegister()
    {
        GameRegistry.registerItem(TastyModCore.stewedMeat,"StewedMeat");
        GameRegistry.registerBlock(TastyModCore.meatPie,"MeatPie");
        GameRegistry.registerItem(TastyModCore.meatPieItem,"MeatPieItem");
        GameRegistry.registerItem(TastyModCore.applePie,"ApplePie");
    }
}
