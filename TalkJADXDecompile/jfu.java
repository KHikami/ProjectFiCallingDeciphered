import android.animation.Keyframe;

final class jfu extends jfp implements jfv {
    private float i;
    private float j;

    public jfu(float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
    }

    public void a(Keyframe keyframe, Keyframe keyframe2) {
        this.i = keyframe.getFraction();
        this.j = keyframe2.getFraction() - this.i;
    }

    public float getInterpolation(float f) {
        return this.i + (this.j * super.getInterpolation((f - this.i) / this.j));
    }
}
