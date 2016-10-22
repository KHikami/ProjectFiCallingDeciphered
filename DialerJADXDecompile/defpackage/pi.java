package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: pi */
final class pi implements Interpolator {
    pi() {
    }

    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
    }
}
