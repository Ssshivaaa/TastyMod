package com.bros.tastymod.model;

import com.bros.tastymod.model.MCACommonLibrary.IMCAnimatedEntity;
import com.bros.tastymod.model.MCACommonLibrary.animation.AnimationHandler;
import com.bros.tastymod.model.animations.Meat.AnimationHandlerMeat;
import com.bros.tastymod.model.animations.Meat.ChannelRotation;
import net.minecraft.server.gui.IUpdatePlayerListBox;

import java.lang.ref.Reference;

/**
 * Created by IceNice on 23.06.2017.
 */
public class EntityMeat extends BaseEntityMeat implements IMCAnimatedEntity,IUpdatePlayerListBox {

    protected AnimationHandler animationHandler = new AnimationHandlerMeat(this);

    @Override
    public AnimationHandler getAnimationHandler() {
        return animationHandler;
    }

    @Override
    public void update() {
        if(!this.animationHandler.isAnimationActive("Rotation"))
        {
            this.animationHandler.activateAnimation("Rotation",0);
        }

    }
}
