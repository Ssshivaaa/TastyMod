package com.bros.tastymod.core;

import com.bros.tastymod.rendering.entities.tiles.TieleEntityTable;
import com.bros.tastymod.rendering.entities.tiles.items.GenereticBlockItemRenderer;
import com.bros.tastymod.rendering.entities.tiles.tileentities.RenderTable;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

/**
 * Created by Arty on 22.06.2017.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

    public void registerRenderers()
    {
        ClientRegistry.bindTileEntitySpecialRenderer(TieleEntityTable.class, new RenderTable());
        registerItemRenderer();
    }

    public void registerItemRenderer()
    {
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(TastyModCore.myasorubka), new GenereticBlockItemRenderer(new TieleEntityTable(), new RenderTable()));
    }
}
