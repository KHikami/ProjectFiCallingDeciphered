package p000;

import java.util.concurrent.TimeUnit;

public final class mft {
    private final mfx f27626a = mfx.f27635a;
    private boolean f27627b;
    private long f27628c;
    private long f27629d;

    public mft m32006a() {
        bm.m6151b(!this.f27627b, (Object) "This stopwatch is already running.");
        this.f27627b = true;
        this.f27629d = this.f27626a.mo3744a();
        return this;
    }

    public mft m32007b() {
        this.f27628c = 0;
        this.f27627b = false;
        return this;
    }

    private long m32004c() {
        return this.f27627b ? (this.f27626a.mo3744a() - this.f27629d) + this.f27628c : this.f27628c;
    }

    public long m32005a(TimeUnit timeUnit) {
        return timeUnit.convert(m32004c(), TimeUnit.NANOSECONDS);
    }

    public String toString() {
        TimeUnit timeUnit;
        Object obj;
        long c = m32004c();
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
        String valueOf = String.valueOf(mfd.m31982a(((double) c) / ((double) TimeUnit.NANOSECONDS.convert(1, timeUnit))));
        switch (mfu.f27630a[timeUnit.ordinal()]) {
            case 1:
                obj = "ns";
                break;
            case 2:
                obj = "μs";
                break;
            case 3:
                obj = "ms";
                break;
            case 4:
                obj = "s";
                break;
            case 5:
                obj = "min";
                break;
            case 6:
                obj = "h";
                break;
            case 7:
                obj = "d";
                break;
            default:
                throw new AssertionError();
        }
        String valueOf2 = String.valueOf(obj);
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(" ").append(valueOf2).toString();
    }
}
