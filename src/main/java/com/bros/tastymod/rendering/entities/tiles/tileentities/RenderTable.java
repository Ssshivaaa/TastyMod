package com.bros.tastymod.rendering.entities.tiles.tileentities;

import com.bros.tastymod.model.ModelMeat;
import jdk.nashorn.internal.runtime.regexp.joni.constants.EncloseType;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderTable extends TileEntitySpecialRenderer{

    private ModelMeat model;
    private ResourceLocation texture = new ResourceLocation("tastymod:textures/blocks/Meat.png");

    public RenderTable()
    {
        model = new ModelMeat();
    }

    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float scale) {

        GL11.glPushMatrix();
        GL11.glTranslated(x+0.5, y-1.5,z+0.5);
        GL11.glRotated(180,0,0,1);
        this.bindTexture(texture);
        this.model.render((Entity)null,0,-0.1f,0,0,0,0.0625f);
        GL11.glPopMatrix();
    }
}
