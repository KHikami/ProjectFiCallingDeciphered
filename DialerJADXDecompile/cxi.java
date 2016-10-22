import android.content.Context;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
public final class cxi extends cxk {
    private final Object a;
    private final Context b;
    private final csu c;
    private final ctc d;
    private final csr e;
    private final String f;
    private final cwm g;
    private final AtomicReference h;
    private ctb i;
    private cta j;
    private volatile cst k;
    private Runnable l;
    private cte m;
    private ctd n;
    private cth o;

    @Deprecated
    public cxi(Context context, csu csu, ctb ctb, csr csr, String str) {
        this(context, csu, new ctc((byte) 0), csr, str, cvu.c);
    }

    private cxi(Context context, csu csu, ctc ctc, csr csr, String str, cwm cwm) {
        this.a = new Object();
        this.h = new AtomicReference();
        this.l = new cxj(this);
        this.m = new cte(this);
        this.n = new ctd(this);
        this.o = new cth(this);
        this.b = context.getApplicationContext();
        this.c = (csu) buf.B((Object) csu);
        this.d = (ctc) buf.B((Object) ctc);
        this.e = (csr) buf.B((Object) csr);
        this.f = (String) buf.B((Object) str);
        this.g = (cwm) buf.B((Object) cwm);
    }

    protected final void b(dln dln) {
        if (Log.isLoggable("ClearcutTransmitter", 2)) {
            dln.toString();
        }
        b().a(dem.a((dem) dln)).a(c()).a(this.o);
    }

    private final cst b() {
        if (this.k == null) {
            synchronized (this.a) {
                if (this.k == null) {
                    this.k = this.c.a(this.b, this.f, null);
                }
            }
        }
        return this.k;
    }

    private final cta c() {
        cta cta;
        synchronized (this.a) {
            if (this.j == null) {
                if (this.i == null) {
                    this.i = this.d.a();
                }
                this.j = this.i.a(this.e.a()).a();
                this.j.a(this.m);
                this.j.a(this.n);
                this.j.a();
            }
            ScheduledFuture scheduledFuture = (ScheduledFuture) this.h.getAndSet(null);
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            cta = this.j;
        }
        return cta;
    }

    final void a() {
        synchronized (this.a) {
            if (Thread.interrupted()) {
                return;
            }
            if (this.j != null) {
                this.j.b();
                this.j.b(this.n);
                this.j.b(this.m);
                this.j = null;
            }
        }
    }

    public static void a(int i) {
        if (Log.isLoggable("ClearcutTransmitter", 3)) {
            new StringBuilder(41).append("onConnectionSuspended, cause: ").append(i);
        }
    }

    public static /* synthetic */ void a(cxi cxi, fr frVar) {
        if (Log.isLoggable("ClearcutTransmitter", 3)) {
            String valueOf = String.valueOf(frVar);
            new StringBuilder(String.valueOf(valueOf).length() + 28).append("onConnectionFailed, result: ").append(valueOf);
        }
        synchronized (cxi.a) {
            if (cxi.j != null) {
                cxi.j.b(cxi.m);
                cxi.j.b(cxi.n);
                cxi.j = null;
            }
        }
    }

    public static /* synthetic */ void a(cxi cxi, ctg ctg) {
        if (Log.isLoggable("ClearcutTransmitter", 3)) {
            new StringBuilder(24).append("onResult, success: ").append(ctg.a());
        }
        ScheduledFuture scheduledFuture = (ScheduledFuture) cxi.h.getAndSet(((ScheduledExecutorService) cxi.g.b()).schedule(cxi.l, 15000, TimeUnit.MILLISECONDS));
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
