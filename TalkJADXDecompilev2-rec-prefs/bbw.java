package p000;

import android.animation.TimeInterpolator;

public final class bbw implements TimeInterpolator {
    private final float f2910a = 0.85f;
    private final float f2911b = 0.6f;

    public bbw(float f, float f2) {
    }

    public float getInterpolation(float f) {
        float f2 = this.f2910a;
        float f3 = this.f2911b;
        float f4 = (f * 2.0f) - 1.0f;
        if (f4 < 0.0f) {
            return (((float) (-Math.pow((double) (-f4), (double) f2))) + 1.0f) / 2.0f;
        }
        return (((float) Math.pow((double) f4, (double) f3)) + 1.0f) / 2.0f;
    }
}
