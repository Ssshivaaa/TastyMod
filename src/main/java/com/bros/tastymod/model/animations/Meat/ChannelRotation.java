package com.bros.tastymod.model.animations.Meat;

import com.bros.tastymod.model.MCACommonLibrary.animation.*;
import com.bros.tastymod.model.MCACommonLibrary.math.*;

public class ChannelRotation extends Channel {
	public ChannelRotation(String _name, float _fps, int _totalFrames, byte _mode) {
		super(_name, _fps, _totalFrames, _mode);
	}

	@Override
	protected void initializeAllFrames() {
KeyFrame frame0 = new KeyFrame();
frame0.modelRenderersRotations.put("Shape5", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
frame0.modelRenderersTranslations.put("Shape5", new Vector3f(7.0F, -2.0F, 1.0F));
keyFrames.put(0, frame0);

KeyFrame frame35 = new KeyFrame();
frame35.modelRenderersRotations.put("Shape5", new Quaternion(-0.9659258F, 0.0F, 0.0F, 0.25881907F));
frame35.modelRenderersTranslations.put("Shape5", new Vector3f(7.0F, -0.5F, 3.0F));
keyFrames.put(35, frame35);

KeyFrame frame5 = new KeyFrame();
frame5.modelRenderersRotations.put("Shape5", new Quaternion(0.25881904F, 0.0F, 0.0F, 0.9659258F));
frame5.modelRenderersTranslations.put("Shape5", new Vector3f(7.0F, -1.5F, 1.0F));
keyFrames.put(5, frame5);

KeyFrame frame40 = new KeyFrame();
frame40.modelRenderersRotations.put("Shape5", new Quaternion(-0.86602545F, 0.0F, 0.0F, 0.49999997F));
frame40.modelRenderersTranslations.put("Shape5", new Vector3f(7.0F, -1.0F, 3.0F));
keyFrames.put(40, frame40);

KeyFrame frame10 = new KeyFrame();
frame10.modelRenderersRotations.put("Shape5", new Quaternion(0.5F, 0.0F, 0.0F, 0.8660254F));
frame10.modelRenderersTranslations.put("Shape5", new Vector3f(7.0F, -1.0F, 1.0F));
keyFrames.put(10, frame10);

KeyFrame frame45 = new KeyFrame();
frame45.modelRenderersRotations.put("Shape5", new Quaternion(-0.70710677F, 0.0F, 0.0F, 0.70710677F));
frame45.modelRenderersTranslations.put("Shape5", new Vector3f(7.0F, -1.5F, 3.0F));
keyFrames.put(45, frame45);

KeyFrame frame15 = new KeyFrame();
frame15.modelRenderersRotations.put("Shape5", new Quaternion(0.70710677F, 0.0F, 0.0F, 0.70710677F));
frame15.modelRenderersTranslations.put("Shape5", new Vector3f(7.0F, -0.5F, 1.0F));
keyFrames.put(15, frame15);

KeyFrame frame50 = new KeyFrame();
frame50.modelRenderersRotations.put("Shape5", new Quaternion(-0.5F, 0.0F, 0.0F, 0.8660254F));
frame50.modelRenderersTranslations.put("Shape5", new Vector3f(7.0F, -2.0F, 2.0F));
keyFrames.put(50, frame50);

KeyFrame frame20 = new KeyFrame();
frame20.modelRenderersRotations.put("Shape5", new Quaternion(0.86602545F, 0.0F, 0.0F, 0.49999997F));
frame20.modelRenderersTranslations.put("Shape5", new Vector3f(7.0F, 0.0F, 2.0F));
keyFrames.put(20, frame20);

KeyFrame frame55 = new KeyFrame();
frame55.modelRenderersRotations.put("Shape5", new Quaternion(-0.25881904F, 0.0F, 0.0F, 0.9659258F));
frame55.modelRenderersTranslations.put("Shape5", new Vector3f(7.0F, -2.0F, 1.0F));
keyFrames.put(55, frame55);

KeyFrame frame25 = new KeyFrame();
frame25.modelRenderersRotations.put("Shape5", new Quaternion(0.9659258F, 0.0F, 0.0F, 0.25881907F));
frame25.modelRenderersTranslations.put("Shape5", new Vector3f(7.0F, 0.0F, 2.0F));
keyFrames.put(25, frame25);

KeyFrame frame59 = new KeyFrame();
frame59.modelRenderersRotations.put("Shape5", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
frame59.modelRenderersTranslations.put("Shape5", new Vector3f(7.0F, -2.0F, 1.0F));
keyFrames.put(59, frame59);

KeyFrame frame30 = new KeyFrame();
frame30.modelRenderersRotations.put("Shape5", new Quaternion(1.0F, 0.0F, 0.0F, -4.371139E-8F));
frame30.modelRenderersTranslations.put("Shape5", new Vector3f(7.0F, 0.0F, 3.0F));
keyFrames.put(30, frame30);

}
}