import android.os.SystemClock;

public final class gxu implements gxs {
    private static gxu a;

    public static synchronized gxs c() {
        gxs gxs;
        synchronized (gxu.class) {
            if (a == null) {
                a = new gxu();
            }
            gxs = a;
        }
        return gxs;
    }

    public long a() {
        return System.currentTimeMillis();
    }

    public long b() {
        return SystemClock.elapsedRealtime();
    }
}
