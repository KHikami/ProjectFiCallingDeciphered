import java.util.concurrent.TimeUnit;

public final class mft {
    private final mfx a;
    private boolean b;
    private long c;
    private long d;

    public mft() {
        this.a = mfx.a;
    }

    public mft a() {
        bm.b(!this.b, (Object) "This stopwatch is already running.");
        this.b = true;
        this.d = this.a.a();
        return this;
    }

    public mft b() {
        this.c = 0;
        this.b = false;
        return this;
    }

    private long c() {
        return this.b ? (this.a.a() - this.d) + this.c : this.c;
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(c(), TimeUnit.NANOSECONDS);
    }

    public String toString() {
        TimeUnit timeUnit;
        Object obj;
        long c = c();
        if (TimeUnit.DAYS.convert(c, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(c, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(c, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(c, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(c, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(c, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        String valueOf = String.valueOf(mfd.a(((double) c) / ((double) TimeUnit.NANOSECONDS.convert(1, timeUnit))));
        switch (mfu.a[timeUnit.ordinal()]) {
            case wi.j /*1*/:
                obj = "ns";
                break;
            case wi.l /*2*/:
                obj = "\u03bcs";
                break;
            case wi.z /*3*/:
                obj = "ms";
                break;
            case wi.h /*4*/:
                obj = "s";
                break;
            case wi.p /*5*/:
                obj = "min";
                break;
            case wi.s /*6*/:
                obj = "h";
                break;
            case wi.q /*7*/:
                obj = "d";
                break;
            default:
                throw new AssertionError();
        }
        String valueOf2 = String.valueOf(obj);
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(" ").append(valueOf2).toString();
    }
}
