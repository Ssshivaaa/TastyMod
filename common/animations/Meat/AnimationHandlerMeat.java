package yourModPackage.common.animations.Meat;

import java.util.HashMap;

import yourModPackage.common.MCACommonLibrary.IMCAnimatedEntity;
import yourModPackage.common.MCACommonLibrary.animation.AnimationHandler;
import yourModPackage.common.MCACommonLibrary.animation.Channel;

public class AnimationHandlerMeat extends AnimationHandler {
	/** Map with all the animations. */
	public static HashMap<String, Channel> animChannels = new HashMap<String, Channel>();
static
{
animChannels.put("Rotation", new ChannelRotation("Rotation", 480.0F, 60, Channel.LOOP));
}
	public AnimationHandlerMeat(IMCAnimatedEntity entity) {
		super(entity);
	}

	@Override
	public void activateAnimation(String name, float startingFrame) {
		super.activateAnimation(animChannels, name, startingFrame);
	}

	@Override
	public void stopAnimation(String name) {
		super.stopAnimation(animChannels, name);
	}

	@Override
	public void fireAnimationEventClientSide(Channel anim, float prevFrame, float frame) {
	}

	@Override
	public void fireAnimationEventServerSide(Channel anim, float prevFrame, float frame) {
	}}