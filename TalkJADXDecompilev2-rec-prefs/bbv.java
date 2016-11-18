package p000;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;

public final class bbv implements TimeInterpolator {
    private DecelerateInterpolator f2909a;

    public bbv(float f) {
        this.f2909a = new DecelerateInterpolator(f);
    }

    public float getInterpolation(float f) {
        return this.f2909a.getInterpolation(f);
    }
}
