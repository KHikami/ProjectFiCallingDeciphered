package p000;

import android.os.Build.VERSION;
import android.os.SystemClock;

public final class bam {
    private static final double f2735a;

    static {
        double d = 1.0d;
        if (17 <= VERSION.SDK_INT) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f2735a = d;
    }

    public static long m4675a() {
        if (17 <= VERSION.SDK_INT) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return System.currentTimeMillis();
    }

    public static double m4674a(long j) {
        return ((double) (bam.m4675a() - j)) * f2735a;
    }
}
