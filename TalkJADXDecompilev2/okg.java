package defpackage;

import java.util.concurrent.TimeUnit;

public final class okg implements Comparable<okg> {
    private static final okh a = new okh();
    private static final long b;
    private static final long c;
    private final okh d;
    private final long e;
    private volatile boolean f;

    public /* synthetic */ int compareTo(Object obj) {
        return c((okg) obj);
    }

    static {
        long toNanos = TimeUnit.DAYS.toNanos(36500);
        b = toNanos;
        c = -toNanos;
    }

    public static okg a(long j, TimeUnit timeUnit) {
        okh okh = a;
        bm.a(timeUnit, "units");
        return new okg(okh, timeUnit.toNanos(j), true);
    }

    private okg(okh okh, long j, boolean z) {
        this(okh, okh.a(), j, true);
    }

    private okg(okh okh, long j, long j2, boolean z) {
        this.d = okh;
        long min = Math.min(b, Math.max(c, j2));
        this.e = j + min;
        boolean z2 = z && min <= 0;
        this.f = z2;
    }

    public boolean a() {
        if (this.f) {
            return true;
        }
        if (this.e - this.d.a() > 0) {
            return false;
        }
        this.f = true;
        return true;
    }

    private boolean b(okg okg) {
        return this.e - okg.e < 0;
    }

    public okg a(okg okg) {
        return b(okg) ? this : okg;
    }

    public long a(TimeUnit timeUnit) {
        long a = this.d.a();
        if (!this.f && this.e - a <= 0) {
            this.f = true;
        }
        return timeUnit.convert(this.e - a, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        return a(TimeUnit.NANOSECONDS) + " ns from now";
    }

    private int c(okg okg) {
        long j = this.e - okg.e;
        if (j < 0) {
            return -1;
        }
        if (j > 0) {
            return 1;
        }
        return 0;
    }
}
