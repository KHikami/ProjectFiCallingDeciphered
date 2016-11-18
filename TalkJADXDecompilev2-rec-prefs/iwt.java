package p000;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

final class iwt {
    final iwx f19292a;
    ScheduledFuture<?> f19293b;
    ScheduledFuture<?> f19294c;
    final ScheduledExecutorService f19295d;
    private final AtomicBoolean f19296e;
    private final iwj f19297f;
    private final iwh f19298g;
    private final iwi f19299h;

    private iwt(iwx iwx, ScheduledExecutorService scheduledExecutorService, iwj iwj) {
        this.f19296e = new AtomicBoolean(false);
        this.f19298g = new iwu(this);
        this.f19299h = new iwi(this);
        this.f19292a = iwx;
        this.f19295d = scheduledExecutorService;
        this.f19297f = iwj;
    }

    void m23412a() {
        if (!this.f19296e.getAndSet(true)) {
            this.f19297f.m23389a(this.f19298g);
            this.f19297f.m23389a(this.f19299h);
        }
    }

    void m23413b() {
        this.f19297f.m23390b(this.f19298g);
        this.f19297f.m23390b(this.f19299h);
    }

    iwt(iwx iwx, Application application) {
        ixx ixx = ixx.f19383c;
        this(iwx, ixx.m23473b(), iwj.m23388a(application));
    }
}
