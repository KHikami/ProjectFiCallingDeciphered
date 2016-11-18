package p000;

import android.animation.Keyframe;

final class jfu extends jfp implements jfv {
    private float f19981i;
    private float f19982j;

    public jfu(float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
    }

    public void mo3492a(Keyframe keyframe, Keyframe keyframe2) {
        this.f19981i = keyframe.getFraction();
        this.f19982j = keyframe2.getFraction() - this.f19981i;
    }

    public float getInterpolation(float f) {
        return this.f19981i + (this.f19982j * super.getInterpolation((f - this.f19981i) / this.f19982j));
    }
}
