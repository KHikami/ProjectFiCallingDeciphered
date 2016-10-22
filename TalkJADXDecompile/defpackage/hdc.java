package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: hdc */
public final class hdc implements gtm {
    public static final hdn a;
    private static final Object b;
    private static ScheduledExecutorService c;
    private static final long d;
    private final gxs e;
    private final hdi f;
    private final Object g;
    private long h;
    private final long i;
    private ScheduledFuture<?> j;
    private gui k;
    private final Runnable l;

    static {
        b = new Object();
        a = new hdn();
        d = TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES);
    }

    public hdc() {
        this(new gxu(), d, new hdi());
    }

    private hdc(gxs gxs, long j, hdi hdi) {
        this.g = new Object();
        this.h = 0;
        this.j = null;
        this.k = null;
        this.l = new hdd(this);
        this.e = gxs;
        this.i = j;
        this.f = hdi;
    }

    private gum<Status> a(gui gui, heb heb) {
        a().execute(new hdg(this, gui, heb));
        return heb;
    }

    private ScheduledExecutorService a() {
        synchronized (b) {
            if (c == null) {
                c = Executors.newSingleThreadScheduledExecutor(new hde(this));
            }
        }
        return c;
    }

    private static void b(LogEventParcelable logEventParcelable) {
        if (logEventParcelable.f != null && logEventParcelable.e.j.length == 0) {
            logEventParcelable.e.j = logEventParcelable.f.e();
        }
        if (logEventParcelable.g != null && logEventParcelable.e.s.length == 0) {
            logEventParcelable.e.s = logEventParcelable.g.e();
        }
        logEventParcelable.c = hcq.a(logEventParcelable.e);
    }

    private hdl c(gui gui, LogEventParcelable logEventParcelable) {
        a.a();
        heg hdl = new hdl(logEventParcelable, gui);
        gun gun = new gun(this);
        gwb.a(!hdl.m, (Object) "Result has already been consumed.");
        gwb.b(true, (Object) "Callback cannot be null.");
        synchronized (hdl.h) {
            if (hdl.e()) {
                hdl.l.k();
                gun.a();
            } else {
                hdl.k.add(gun);
            }
        }
        return hdl;
    }

    public gum<Status> a(Context context, LogEventParcelable logEventParcelable) {
        gum<Status> b;
        synchronized (this.g) {
            if (this.k == null) {
                this.k = this.f.a(context);
                this.k.b();
            }
            this.h = this.e.b() + this.i;
            if (this.j != null) {
                this.j.cancel(false);
            }
            this.j = a().schedule(this.l, this.i, TimeUnit.MILLISECONDS);
            b = b(this.k, logEventParcelable);
        }
        return b;
    }

    public gum<Status> a(gui gui, LogEventParcelable logEventParcelable) {
        hdc.b(logEventParcelable);
        return gui.a(c(gui, logEventParcelable));
    }

    public void a(gui gui) {
        heb hdj = new hdj(this, gui);
        synchronized (b) {
            if (c == null) {
                gui.a(hdj);
            } else {
                c.execute(new hdh(this, gui, hdj));
            }
        }
    }

    public boolean a(long j, TimeUnit timeUnit) {
        try {
            return a.a(j, timeUnit);
        } catch (InterruptedException e) {
            Log.e("ClearcutLoggerApiImpl", "flush interrupted");
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public gum<Status> b(gui gui, LogEventParcelable logEventParcelable) {
        return a(gui, c(gui, logEventParcelable));
    }
}
