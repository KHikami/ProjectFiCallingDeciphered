package p000;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class nw {
    static final nz f31160a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f31160a = new ny();
        } else {
            f31160a = new nx();
        }
    }

    public static float m36912a(VelocityTracker velocityTracker, int i) {
        return f31160a.mo4067a(velocityTracker, i);
    }

    public static float m36913b(VelocityTracker velocityTracker, int i) {
        return f31160a.mo4068b(velocityTracker, i);
    }
}
