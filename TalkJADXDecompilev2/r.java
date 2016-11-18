package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public final class r {
    static final Interpolator a = new LinearInterpolator();
    public static final Interpolator b = new rk();
    static final Interpolator c = new rj();
    static final Interpolator d = new rl();
    static final Interpolator e = new DecelerateInterpolator();

    static int a(int i, int i2, float f) {
        return Math.round(((float) (i2 - i)) * f) + i;
    }
}
