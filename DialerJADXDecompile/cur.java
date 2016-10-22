import android.app.Application;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
final class cur {
    ScheduledFuture a;
    ScheduledFuture b;
    final ScheduledExecutorService c;
    final cug d;
    final cue e;
    final cuf f;
    private final AtomicBoolean g;
    private final cuz h;

    private cur(cuz cuz, ScheduledExecutorService scheduledExecutorService, cug cug) {
        this.g = new AtomicBoolean(false);
        this.e = new cus(this);
        this.f = new cuf(this);
        this.h = cuz;
        this.c = scheduledExecutorService;
        this.d = cug;
    }

    public final void a() {
        if (this.g.getAndSet(true)) {
            Log.w("MemoryMetricMonitor", "Memory Monitor has already started. This MemoryMetricMonitor.start() is ignored.");
            return;
        }
        this.d.a(this.e);
        this.d.a(this.f);
    }

    public final void a(Integer num) {
        this.h.a(num);
    }

    cur(cuz cuz, Application application) {
        cvu cvu = cvu.c;
        this(cuz, cvu.a(), cug.a(application));
    }
}
