import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
public final class dft extends dfr {
    private boolean e;
    private Throwable f;
    private final dfr g;
    private ScheduledFuture h;

    public dft(dfr dfr, dfz dfz, ScheduledExecutorService scheduledExecutorService) {
        Object[][] objArr;
        dfz dfz2 = (dfz) dfr.c.a(dfr);
        if (dfz2 == null || dfz.a(dfz2)) {
            objArr = new Object[1][];
            objArr[0] = new Object[]{dfr.c, dfz};
        } else {
            objArr = dfr.b;
        }
        super(dfr, objArr, true);
        if (dfr.c.a(this) == dfz) {
            Throwable timeoutException = new TimeoutException("context timed out");
            if (dfz.a()) {
                a(timeoutException);
            } else {
                Object dfu = new dfu(this, timeoutException);
                cob.b(dfu, (Object) "task");
                cob.b((Object) scheduledExecutorService, (Object) "scheduler");
                dga dga = null;
                this.h = scheduledExecutorService.schedule(dfu, 0 - dga.a(), TimeUnit.NANOSECONDS);
            }
        }
        this.g = new dfr(this, dfr.b);
    }

    public final dfr b() {
        return this.g.b();
    }

    public final void a(dfr dfr) {
        this.g.a(dfr);
    }

    public final boolean a(Throwable th) {
        boolean z = true;
        synchronized (this) {
            if (this.e) {
                z = false;
            } else {
                this.e = true;
                if (this.h != null) {
                    this.h.cancel(false);
                    this.h = null;
                }
                this.f = th;
            }
        }
        if (z) {
            f();
        }
        return z;
    }

    public final boolean c() {
        synchronized (this) {
            if (this.e) {
                return true;
            }
            if (!super.c()) {
                return false;
            }
            a(super.d());
            return true;
        }
    }

    public final Throwable d() {
        if (c()) {
            return this.f;
        }
        return null;
    }

    public dft(dfr dfr) {
        super(dfr, dfr.b, true);
        this.g = new dfr(this, dfr.b);
    }
}
