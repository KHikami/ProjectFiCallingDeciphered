package p000;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public final class C0258r {
    static final Interpolator f35040a = new LinearInterpolator();
    public static final Interpolator f35041b = new rk();
    static final Interpolator f35042c = new rj();
    static final Interpolator f35043d = new rl();
    static final Interpolator f35044e = new DecelerateInterpolator();

    static int m40516a(int i, int i2, float f) {
        return Math.round(((float) (i2 - i)) * f) + i;
    }
}
