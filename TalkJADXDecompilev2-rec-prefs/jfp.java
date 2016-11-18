package p000;

import android.animation.TimeInterpolator;

public class jfp extends jfo implements TimeInterpolator {
    public jfp(float f, float f2, float f3, float f4) {
        this.b = 0.0f;
        this.a = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.h = 1.0f;
        this.g = 1.0f;
    }

    public float getInterpolation(float f) {
        return m24097b(m24098c(f));
    }
}
