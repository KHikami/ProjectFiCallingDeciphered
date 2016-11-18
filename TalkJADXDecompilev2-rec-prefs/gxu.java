package p000;

import android.os.SystemClock;

public final class gxu implements gxs {
    private static gxu f16360a;

    public static synchronized gxs m18926c() {
        gxs gxs;
        synchronized (gxu.class) {
            if (f16360a == null) {
                f16360a = new gxu();
            }
            gxs = f16360a;
        }
        return gxs;
    }

    public long mo2412a() {
        return System.currentTimeMillis();
    }

    public long mo2413b() {
        return SystemClock.elapsedRealtime();
    }
}
