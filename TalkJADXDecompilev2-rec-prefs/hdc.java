package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class hdc implements gtm {
    public static final hdn f16674a = new hdn();
    private static final Object f16675b = new Object();
    private static ScheduledExecutorService f16676c;
    private static final long f16677d = TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES);
    private final gxs f16678e;
    private final hdi f16679f;
    private final Object f16680g;
    private long f16681h;
    private final long f16682i;
    private ScheduledFuture<?> f16683j;
    private gui f16684k;
    private final Runnable f16685l;

    public hdc() {
        this(new gxu(), f16677d, new hdi());
    }

    private hdc(gxs gxs, long j, hdi hdi) {
        this.f16680g = new Object();
        this.f16681h = 0;
        this.f16683j = null;
        this.f16684k = null;
        this.f16685l = new hdd(this);
        this.f16678e = gxs;
        this.f16682i = j;
        this.f16679f = hdi;
    }

    private gum<Status> m19401a(gui gui, heb heb) {
        m19404a().execute(new hdg(this, gui, heb));
        return heb;
    }

    private ScheduledExecutorService m19404a() {
        synchronized (f16675b) {
            if (f16676c == null) {
                f16676c = Executors.newSingleThreadScheduledExecutor(new hde(this));
            }
        }
        return f16676c;
    }

    private static void m19407b(LogEventParcelable logEventParcelable) {
        if (logEventParcelable.f7254f != null && logEventParcelable.f7253e.f16652j.length == 0) {
            logEventParcelable.f7253e.f16652j = logEventParcelable.f7254f.m8e();
        }
        if (logEventParcelable.f7255g != null && logEventParcelable.f7253e.f16659s.length == 0) {
            logEventParcelable.f7253e.f16659s = logEventParcelable.f7255g.m8e();
        }
        logEventParcelable.f7251c = hcq.m19203a(logEventParcelable.f7253e);
    }

    private hdl m19409c(gui gui, LogEventParcelable logEventParcelable) {
        f16674a.m19426a();
        heg hdl = new hdl(logEventParcelable, gui);
        gun gun = new gun(this);
        gwb.m1886a(!hdl.f16397m, (Object) "Result has already been consumed.");
        gwb.m2048b(true, (Object) "Callback cannot be null.");
        synchronized (hdl.f16392h) {
            if (hdl.m18981e()) {
                hdl.f16396l.mo1279k();
                gun.m18649a();
            } else {
                hdl.f16395k.add(gun);
            }
        }
        return hdl;
    }

    public gum<Status> mo2459a(Context context, LogEventParcelable logEventParcelable) {
        gum<Status> b;
        synchronized (this.f16680g) {
            if (this.f16684k == null) {
                this.f16684k = this.f16679f.m19417a(context);
                this.f16684k.mo2518b();
            }
            this.f16681h = this.f16678e.mo2413b() + this.f16682i;
            if (this.f16683j != null) {
                this.f16683j.cancel(false);
            }
            this.f16683j = m19404a().schedule(this.f16685l, this.f16682i, TimeUnit.MILLISECONDS);
            b = mo2463b(this.f16684k, logEventParcelable);
        }
        return b;
    }

    public gum<Status> mo2460a(gui gui, LogEventParcelable logEventParcelable) {
        hdc.m19407b(logEventParcelable);
        return gui.mo2510a(m19409c(gui, logEventParcelable));
    }

    public void mo2461a(gui gui) {
        heb hdj = new hdj(this, gui);
        synchronized (f16675b) {
            if (f16676c == null) {
                gui.mo2510a(hdj);
            } else {
                f16676c.execute(new hdh(this, gui, hdj));
            }
        }
    }

    public boolean mo2462a(long j, TimeUnit timeUnit) {
        try {
            return f16674a.m19427a(j, timeUnit);
        } catch (InterruptedException e) {
            Log.e("ClearcutLoggerApiImpl", "flush interrupted");
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public gum<Status> mo2463b(gui gui, LogEventParcelable logEventParcelable) {
        return m19401a(gui, m19409c(gui, logEventParcelable));
    }
}
