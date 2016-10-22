import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class dfz implements Comparable {
    private static final long a;
    private volatile boolean b;

    public final /* synthetic */ int compareTo(Object obj) {
        dfz dfz = (dfz) obj;
        if (0 < 0) {
            return -1;
        }
        if (0 > 0) {
            return 1;
        }
        return 0;
    }

    static {
        dga dga = new dga();
        a = TimeUnit.DAYS.toNanos(36500);
    }

    public final boolean a() {
        if (this.b) {
            return true;
        }
        dga dga = null;
        if (0 - dga.a() > 0) {
            return false;
        }
        this.b = true;
        return true;
    }

    public final boolean a(dfz dfz) {
        return 0 < 0;
    }

    public final long a(TimeUnit timeUnit) {
        dga dga = null;
        long a = dga.a();
        if (!this.b && 0 - a <= 0) {
            this.b = true;
        }
        return timeUnit.convert(0 - a, TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        return a(TimeUnit.NANOSECONDS) + " ns from now";
    }
}
