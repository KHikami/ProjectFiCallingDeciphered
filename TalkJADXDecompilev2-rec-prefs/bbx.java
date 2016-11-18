package p000;

import android.animation.TimeInterpolator;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public final class bbx implements Interpolator {
    private TimeInterpolator f2912a;

    public bbx(int i) {
        TimeInterpolator timeInterpolator = null;
        if (VERSION.SDK_INT < 21) {
            switch (bca.f2971a[i - 1]) {
                case 1:
                    timeInterpolator = new bby(this);
                    break;
                case 2:
                    timeInterpolator = new bbz(this);
                    break;
                default:
                    break;
            }
        }
        switch (bca.f2971a[i - 1]) {
            case 1:
                timeInterpolator = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
                break;
            case 2:
                timeInterpolator = new PathInterpolator(0.8f, 0.0f, 0.6f, 1.0f);
                break;
        }
        this.f2912a = timeInterpolator;
    }

    public float getInterpolation(float f) {
        return this.f2912a.getInterpolation(f);
    }
}
