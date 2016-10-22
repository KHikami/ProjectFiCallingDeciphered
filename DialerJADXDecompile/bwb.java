import android.os.SystemClock;

public final class bwb implements bwa {
    private static bwb a;

    public static synchronized bwa c() {
        bwa bwa;
        synchronized (bwb.class) {
            if (a == null) {
                a = new bwb();
            }
            bwa = a;
        }
        return bwa;
    }

    public final long a() {
        return System.currentTimeMillis();
    }

    public final long b() {
        return SystemClock.elapsedRealtime();
    }
}
