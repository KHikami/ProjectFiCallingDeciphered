import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class cyx {
    public boolean a;
    public long b;
    private final czb c;
    private long d;

    public cyx() {
        this.c = czb.a;
    }

    public cyx(czb czb) {
        this.c = (czb) cob.b((Object) czb, (Object) "ticker");
    }

    public final cyx a() {
        cob.b(!this.a, (Object) "This stopwatch is already running.");
        this.a = true;
        this.d = this.c.a();
        return this;
    }

    private final long b() {
        return this.a ? this.c.a() - this.d : 0;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(b(), TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        TimeUnit timeUnit;
        Object obj;
        long b = b();
        if (TimeUnit.DAYS.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        String valueOf = String.valueOf(buf.a(((double) b) / ((double) TimeUnit.NANOSECONDS.convert(1, timeUnit))));
        switch (cyy.a[timeUnit.ordinal()]) {
            case rq.b /*1*/:
                obj = "ns";
                break;
            case rq.c /*2*/:
                obj = "\u03bcs";
                break;
            case rl.e /*3*/:
                obj = "ms";
                break;
            case rl.f /*4*/:
                obj = "s";
                break;
            case rl.g /*5*/:
                obj = "min";
                break;
            case rl.i /*6*/:
                obj = "h";
                break;
            case rl.h /*7*/:
                obj = "d";
                break;
            default:
                throw new AssertionError();
        }
        String valueOf2 = String.valueOf(obj);
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(" ").append(valueOf2).toString();
    }
}
