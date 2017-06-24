package com.bros.tastymod.model;

import net.minecraft.tileentity.TileEntity;

import javax.swing.plaf.PanelUI;

public abstract class BaseEntityMeat extends TileEntity {
    private String owner = "Meat";


    public String getOwner()
    {
        return this.owner;
    }
}
