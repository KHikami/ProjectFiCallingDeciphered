package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;

public final class bbv implements TimeInterpolator {
    private DecelerateInterpolator a;

    public bbv(float f) {
        this.a = new DecelerateInterpolator(f);
    }

    public float getInterpolation(float f) {
        return this.a.getInterpolation(f);
    }
}
