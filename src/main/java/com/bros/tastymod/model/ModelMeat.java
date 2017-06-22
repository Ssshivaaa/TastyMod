package com.bros.tastymod.model;

import java.util.HashMap;

import com.bros.tastymod.model.MCACommonLibrary.animation.AnimationHandler;
import com.bros.tastymod.model.MCACommonLibrary.math.Matrix4f;
import com.bros.tastymod.model.MCACommonLibrary.math.Quaternion;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import com.bros.tastymod.model.MCAClientLibrary.*;
import com.bros.tastymod.model.MCACommonLibrary.*;

public class ModelMeat extends ModelBase {
public final int MCA_MIN_REQUESTED_VERSION = 5;
public HashMap<String, MCAModelRenderer> parts = new HashMap<String, MCAModelRenderer>();

MCAModelRenderer shape1;
MCAModelRenderer shape2;
MCAModelRenderer shape4;
MCAModelRenderer shape5;
MCAModelRenderer shape3;
MCAModelRenderer shape6;
MCAModelRenderer shape7;

public ModelMeat()
{
MCAVersionChecker.checkForLibraryVersion(getClass(), MCA_MIN_REQUESTED_VERSION);

textureWidth = 32;
textureHeight = 32;

shape1 = new MCAModelRenderer(this, "Shape1", 8, 14);
shape1.mirror = false;
shape1.addBox(0.0F, 0.0F, 0.0F, 6, 12, 6);
shape1.setInitialRotationPoint(11.0F, -8.0F, -1.0F);
shape1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
shape1.setTextureSize(32, 32);
parts.put(shape1.boxName, shape1);

shape2 = new MCAModelRenderer(this, "Shape2", 16, 0);
shape2.mirror = false;
shape2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4);
shape2.setInitialRotationPoint(17.0F, -3.0F, 0.0F);
shape2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
shape2.setTextureSize(32, 32);
parts.put(shape2.boxName, shape2);

shape4 = new MCAModelRenderer(this, "Shape4", 16, 8);
shape4.mirror = false;
shape4.addBox(2.0F, 2.0F, -1.0F, 4, 1, 4);
shape4.setInitialRotationPoint(10.0F, 5.0F, 1.0F);
shape4.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
shape4.setTextureSize(32, 32);
parts.put(shape4.boxName, shape4);

shape5 = new MCAModelRenderer(this, "Shape5", 7, 4);
shape5.mirror = false;
shape5.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2);
shape5.setInitialRotationPoint(7.0F, -2.0F, 1.0F);
shape5.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
shape5.setTextureSize(32, 32);
parts.put(shape5.boxName, shape5);

shape3 = new MCAModelRenderer(this, "Shape3", 0, 0);
shape3.mirror = false;
shape3.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2);
shape3.setInitialRotationPoint(13.0F, 4.0F, 1.0F);
shape3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
shape3.setTextureSize(32, 32);
parts.put(shape3.boxName, shape3);

shape6 = new MCAModelRenderer(this, "Shape6", 0, 15);
shape6.mirror = false;
shape6.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
shape6.setInitialRotationPoint(-2.0F, 4.0F, 0.0F);
shape6.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
shape6.setTextureSize(32, 32);
parts.put(shape6.boxName, shape6);
shape5.addChild(shape6);

shape7 = new MCAModelRenderer(this, "Shape7", 0, 11);
shape7.mirror = false;
shape7.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
shape7.setInitialRotationPoint(2.0F, 0.0F, 0.0F);
shape7.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
shape7.setTextureSize(32, 32);
parts.put(shape7.boxName, shape7);
shape5.addChild(shape7);

}

@Override
public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) 
{
//EntityMeat entity = (EntityMeat)par1Entity;

//AnimationHandler.performAnimationInModel(parts, entity);

//Render every non-child part
shape1.render(par7);
shape2.render(par7);
shape4.render(par7);
shape5.render(par7);
shape3.render(par7);
}
@Override
public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {}

public MCAModelRenderer getModelRendererFromName(String name)
{
return parts.get(name);
}
}