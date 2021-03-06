package com.bros.tastymod.core;

import com.bros.tastymod.blocks.BlockTable;
import com.bros.tastymod.blocks.MeatPie;
import com.bros.tastymod.items.ApplePie;
import com.bros.tastymod.items.MeatPieItem;
import com.bros.tastymod.items.StewedMeat;
import com.bros.tastymod.items.*;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.*;
import growthcraft.core.bucket.SaltBucketEntry;
import growthcraft.core.eventhandler.EventHandlerSpecialBucketFill;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = TastyModCore.MODID, version = TastyModCore.VERSION)


public class TastyModCore {
    public static final String MODID = "TastyMod";
    public static final String VERSION = "1.0";
    public static ItemFood stewedMeat;
    public static MeatPie meatPie;
    public static Item meatPieItem;
    public static Item meatGrinderItem;
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
    public static Item guts;
    public static ItemFood sausage;
    public static ItemFood smallSausages;
    public static ItemFood friedSmallSausages;
    public static ItemFood mince;
    public static ItemSword gutKnife;
    public static ItemFood friedSausage;
    public static ItemFood carrotSoup;
    public static ItemFood hamburger;
    public static Block myasorubka;
    public static ItemFood rissole;

    public static ClientProxy proxyy;

    @SidedProxy(clientSide = "com.bros.tastymod.core.ClientProxy", serverSide = "com.bros.tastymod.core.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preLoad(FMLInitializationEvent e) {
        EventHandlerSpecialBucketFill.instance().addEntry(new SaltBucketEntry()); //Enabling salt water in ocean biomes
        stewedMeat = new StewedMeat(10, 1, false);
        meatPie = new MeatPie();
        meatPieItem = new MeatPieItem(meatPie);
        applePie = new ApplePie(8, 1, false);
        breadSlice = new BreadSlice(3, 1, false);
        chocolate = new Chocolate(4, 1, false);
        flour = new Flour(1, 0.2f, false);
        cereal = new Cereal(6, 1, false);
        spaghetti = new Spaghetti(1, 0.2f, false);
        caramel = new Caramel(1, 1f, false);
        sugarBucket = new SugarBucket(1, 1f, false);
        friedEgg = new FriedEgg(1, 1f, false);
        chips = new Chips(1, 1f, false);
        friedChips = new FriedChips(1, 1f, false);
        rawOmelet = new RawOmelet(1, 1f, false);
        omelet = new Omelet(1, 1f, false);
        carrotSoup = new CarrotSoup(6, 1f, false);
        hamburger = new Hamburger(6, 1f, false);
        guts = new Guts();
        sausage = new Sausage(4,1f,true);
        mince = new Mince(1,1f,true);
        friedSausage = new FriedSausage(10,1f,false);
        gutKnife = new GutKnife(Item.ToolMaterial.IRON);
        myasorubka = new BlockTable().setCreativeTab(CreativeTabs.tabFood);
        meatGrinderItem = new MeatGrindeItem(myasorubka);
        smallSausages = new SmallSausages(3,1f,true);
        friedSmallSausages = new FriedSmallSausages(4,1f,false);
        rissole = new Rissole(3,1f,false);

        new TastyModRegister();
        new TastyModRecipes();
        ClientProxy.registerRenderers();
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    @EventHandler
    public void PreInitialization(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new addEntityDrop());
    }
}
