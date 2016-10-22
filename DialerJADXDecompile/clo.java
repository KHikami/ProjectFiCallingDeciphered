import android.content.Context;
import com.google.android.gms.clearcut.LogEventParcelable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class clo implements bql {
    public static final clw a;
    private static final Object b;
    private static ScheduledExecutorService c;
    private static final long d;
    private final bwa e;
    private final clt f;
    private final Object g;
    private long h;
    private final long i;
    private ScheduledFuture j;
    private brc k;
    private final Runnable l;

    static {
        b = new Object();
        a = new clw();
        d = TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES);
    }

    public clo() {
        this(new bwb(), d, new clt());
    }

    private clo(bwa bwa, long j, clt clt) {
        this.g = new Object();
        this.h = 0;
        this.j = null;
        this.k = null;
        this.l = new clp(this);
        this.e = bwa;
        this.i = j;
        this.f = clt;
    }

    private final ScheduledExecutorService a() {
        synchronized (b) {
            if (c == null) {
                c = Executors.newSingleThreadScheduledExecutor(new clq(this));
            }
        }
        return c;
    }

    private final clu b(brc brc, LogEventParcelable logEventParcelable) {
        a.a();
        brw clu = new clu(this, logEventParcelable, brc);
        brj brj = new brj(this);
        buf.a(!clu.e, (Object) "Result has already been consumed.");
        buf.b(true, (Object) "Callback cannot be null.");
        synchronized (clu.b) {
            if (clu.e()) {
                clu.d.a();
                brj.a();
            } else {
                clu.c.add(brj);
            }
        }
        return clu;
    }

    private static void b(LogEventParcelable logEventParcelable) {
        if (logEventParcelable.f != null && logEventParcelable.e.f.length == 0) {
            logEventParcelable.e.f = logEventParcelable.f.a();
        }
        if (logEventParcelable.g != null && logEventParcelable.e.h.length == 0) {
            logEventParcelable.e.h = logEventParcelable.g.a();
        }
        logEventParcelable.c = cla.a(logEventParcelable.e);
    }

    public final bri a(Context context, LogEventParcelable logEventParcelable) {
        bri b;
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
            brc brc = this.k;
            b = b(brc, logEventParcelable);
            a().execute(new cls(this, brc, b));
        }
        return b;
    }

    public final bri a(brc brc, LogEventParcelable logEventParcelable) {
        b(logEventParcelable);
        return brc.a(b(brc, logEventParcelable));
    }
}
