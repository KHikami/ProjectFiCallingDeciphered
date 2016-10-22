package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: yr */
public final class yr implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
    }
}
