package defpackage;

import android.view.animation.Interpolator;

/* renamed from: adx */
public final class adx implements Interpolator {
    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
    }
}
