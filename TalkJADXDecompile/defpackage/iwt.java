package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: iwt */
final class iwt {
    final iwx a;
    ScheduledFuture<?> b;
    ScheduledFuture<?> c;
    final ScheduledExecutorService d;
    private final AtomicBoolean e;
    private final iwj f;
    private final iwh g;
    private final iwi h;

    private iwt(iwx iwx, ScheduledExecutorService scheduledExecutorService, iwj iwj) {
        this.e = new AtomicBoolean(false);
        this.g = new iwu(this);
        this.h = new iwi(this);
        this.a = iwx;
        this.d = scheduledExecutorService;
        this.f = iwj;
    }

    void a() {
        if (!this.e.getAndSet(true)) {
            this.f.a(this.g);
            this.f.a(this.h);
        }
    }

    void b() {
        this.f.b(this.g);
        this.f.b(this.h);
    }

    iwt(iwx iwx, Application application) {
        ixx ixx = ixx.c;
        this(iwx, ixx.b(), iwj.a(application));
    }
}
