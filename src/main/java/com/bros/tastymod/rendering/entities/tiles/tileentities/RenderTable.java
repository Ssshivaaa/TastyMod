package com.bros.tastymod.rendering.entities.tiles.tileentities;

import com.bros.tastymod.model.BaseEntityMeat;
import com.bros.tastymod.model.EntityMeat;
import com.bros.tastymod.model.ModelMeat;
import com.bros.tastymod.rendering.entities.tiles.TieleEntityTable;
import cpw.mods.fml.common.Mod;
import jdk.nashorn.internal.runtime.regexp.joni.constants.EncloseType;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import javax.rmi.CORBA.Tie;

public class RenderTable extends TileEntitySpecialRenderer{

    private ModelMeat model;
    private ResourceLocation texture = new ResourceLocation("tastymod:textures/blocks/Meat.png");
    public ModelMeat baseEntityMeat;

    public RenderTable()
    {
        model = new ModelMeat();
        baseEntityMeat = new ModelMeat();
    }

    @Override
    public void renderTileEntityAt(final TileEntity tile, double x, double y, double z, float scale) {
       // if(!(tile instanceof EntityMeat)) return;
      /*  final EntityMeat entityMeat = (EntityMeat)tile;
        ((ModelMeat)this.baseEntityMeat).setTileEntity(entityMeat);
        entityMeat.getAnimationHandler().animationsUpdate();*/
        GL11.glPushMatrix();
        GL11.glTranslated(x-0.3, y+ 0.5,z+0.3);
        GL11.glRotated(0,0,0,1);
        this.bindTexture(texture);
        this.model.render((Entity)null,0,-0.1f,0,0,0,0.0625f);
        GL11.glPopMatrix();
    }
}
