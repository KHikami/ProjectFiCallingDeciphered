package p000;

import java.util.concurrent.TimeUnit;

public final class okg implements Comparable<okg> {
    private static final okh f33125a = new okh();
    private static final long f33126b;
    private static final long f33127c;
    private final okh f33128d;
    private final long f33129e;
    private volatile boolean f33130f;

    public /* synthetic */ int compareTo(Object obj) {
        return m38628c((okg) obj);
    }

    static {
        long toNanos = TimeUnit.DAYS.toNanos(36500);
        f33126b = toNanos;
        f33127c = -toNanos;
    }

    public static okg m38626a(long j, TimeUnit timeUnit) {
        okh okh = f33125a;
        bm.a(timeUnit, "units");
        return new okg(okh, timeUnit.toNanos(j), true);
    }

    private okg(okh okh, long j, boolean z) {
        this(okh, okh.m38632a(), j, true);
    }

    private okg(okh okh, long j, long j2, boolean z) {
        this.f33128d = okh;
        long min = Math.min(f33126b, Math.max(f33127c, j2));
        this.f33129e = j + min;
        boolean z2 = z && min <= 0;
        this.f33130f = z2;
    }

    public boolean m38631a() {
        if (this.f33130f) {
            return true;
        }
        if (this.f33129e - this.f33128d.m38632a() > 0) {
            return false;
        }
        this.f33130f = true;
        return true;
    }

    private boolean m38627b(okg okg) {
        return this.f33129e - okg.f33129e < 0;
    }

    public okg m38630a(okg okg) {
        return m38627b(okg) ? this : okg;
    }

    public long m38629a(TimeUnit timeUnit) {
        long a = this.f33128d.m38632a();
        if (!this.f33130f && this.f33129e - a <= 0) {
            this.f33130f = true;
        }
        return timeUnit.convert(this.f33129e - a, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        return m38629a(TimeUnit.NANOSECONDS) + " ns from now";
    }

    private int m38628c(okg okg) {
        long j = this.f33129e - okg.f33129e;
        if (j < 0) {
            return -1;
        }
        if (j > 0) {
            return 1;
        }
        return 0;
    }
}
