package defpackage;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class nw {
    static final nz a;

    static {
        if (VERSION.SDK_INT >= 11) {
            a = new ny();
        } else {
            a = new nx();
        }
    }

    public static float a(VelocityTracker velocityTracker, int i) {
        return a.a(velocityTracker, i);
    }

    public static float b(VelocityTracker velocityTracker, int i) {
        return a.b(velocityTracker, i);
    }
}
