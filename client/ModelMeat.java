package yourModPackage.client.models;

import java.util.HashMap;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import yourModPackage.client.MCAClientLibrary.MCAModelRenderer;
import yourModPackage.common.MCACommonLibrary.MCAVersionChecker;
import yourModPackage.common.MCACommonLibrary.animation.AnimationHandler;
import yourModPackage.common.MCACommonLibrary.math.Matrix4f;
import yourModPackage.common.MCACommonLibrary.math.Quaternion;
import yourModPackage.common.entities.mobs.EntityMeat;

public class ModelMeat extends ModelBase {
public final int MCA_MIN_REQUESTED_VERSION = 5;
public HashMap<String, MCAModelRenderer> parts = new HashMap<String, MCAModelRenderer>();

MCAModelRenderer noName;
MCAModelRenderer noName;
MCAModelRenderer noName;
MCAModelRenderer noName;
MCAModelRenderer noName;
MCAModelRenderer noName;
MCAModelRenderer noName;

public ModelMeat()
{
MCAVersionChecker.checkForLibraryVersion(getClass(), MCA_MIN_REQUESTED_VERSION);

textureWidth = 16;
textureHeight = 16;

noName = new MCAModelRenderer(this, "noName", 0, 0);
noName.mirror = false;
noName.addBox(0.0F, 0.0F, 0.0F, 6, 12, 6);
noName.setInitialRotationPoint(11.0F, -8.0F, -1.0F);
noName.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
noName.setTextureSize(16, 16);
parts.put(noName.boxName, noName);

noName = new MCAModelRenderer(this, "noName", 0, 0);
noName.mirror = false;
noName.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4);
noName.setInitialRotationPoint(17.0F, -3.0F, 0.0F);
noName.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
noName.setTextureSize(16, 16);
parts.put(noName.boxName, noName);

noName = new MCAModelRenderer(this, "noName", 0, 0);
noName.mirror = false;
noName.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2);
noName.setInitialRotationPoint(13.0F, 4.0F, 1.0F);
noName.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
noName.setTextureSize(16, 16);
parts.put(noName.boxName, noName);

noName = new MCAModelRenderer(this, "noName", 0, 0);
noName.mirror = false;
noName.addBox(2.0F, 2.0F, -1.0F, 4, 1, 4);
noName.setInitialRotationPoint(10.0F, 5.0F, 1.0F);
noName.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
noName.setTextureSize(16, 16);
parts.put(noName.boxName, noName);

noName = new MCAModelRenderer(this, "noName", 0, 0);
noName.mirror = false;
noName.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2);
noName.setInitialRotationPoint(7.0F, -2.0F, 1.0F);
noName.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
noName.setTextureSize(16, 16);
parts.put(noName.boxName, noName);

noName = new MCAModelRenderer(this, "noName", 0, 0);
noName.mirror = false;
noName.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
noName.setInitialRotationPoint(-2.0F, 4.0F, 0.0F);
noName.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
noName.setTextureSize(16, 16);
parts.put(noName.boxName, noName);
noName.addChild(noName);

noName = new MCAModelRenderer(this, "noName", 0, 0);
noName.mirror = false;
noName.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
noName.setInitialRotationPoint(2.0F, 0.0F, 0.0F);
noName.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
noName.setTextureSize(16, 16);
parts.put(noName.boxName, noName);
noName.addChild(noName);

}

@Override
public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) 
{
EntityMeat entity = (EntityMeat)par1Entity;

AnimationHandler.performAnimationInModel(parts, entity);

//Render every non-child part
noName.render(par7);
noName.render(par7);
noName.render(par7);
noName.render(par7);
noName.render(par7);
}
@Override
public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {}

public MCAModelRenderer getModelRendererFromName(String name)
{
return parts.get(name);
}
}