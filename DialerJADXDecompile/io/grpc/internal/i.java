package io.grpc.internal;

import buf;
import cob;
import dff;
import dfh;
import dfi;
import dfo;
import dfp;
import dfq;
import dfr;
import dft;
import dfv;
import dfz;
import dgc;
import dgr;
import dhc;
import dhe;
import dhn;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

final class i extends dfh implements dfv {
    private static final Logger i;
    final dhc a;
    final Executor b;
    volatile dfr c;
    r d;
    volatile boolean e;
    String f;
    dgc g;
    dfq h;
    private final dfr j;
    private final boolean k;
    private final dff l;
    private boolean m;
    private boolean n;
    private final q o;
    private ScheduledExecutorService p;

    static {
        i = Logger.getLogger(i.class.getName());
    }

    i(dhc dhc, Executor executor, dff dff, q qVar, ScheduledExecutorService scheduledExecutorService) {
        Executor bwVar;
        this.g = dgc.a;
        this.h = dfq.a;
        this.a = dhc;
        if (executor == buf.I()) {
            bwVar = new bw();
        } else {
            bwVar = new bx(executor);
        }
        this.b = bwVar;
        this.j = dfr.a();
        boolean z = dhc.a == dhe.UNARY || dhc.a == dhe.SERVER_STREAMING;
        this.k = z;
        this.l = dff;
        this.o = qVar;
        this.p = scheduledExecutorService;
    }

    public final void a(dfr dfr) {
        this.d.a(buf.a(dfr));
    }

    public final void a(dfi dfi, dgr dgr) {
        dfz dfz = null;
        cob.b(this.d == null, (Object) "Already started");
        cob.b((Object) dfi, (Object) "observer");
        cob.b((Object) dgr, (Object) "headers");
        dff dff = this.l;
        dfz e = this.j.e();
        dfz dfz2 = dfz == null ? e : e == null ? dfz : dfz.a(e) ? dfz : e;
        if (dfz2 != this.j.e()) {
            dfr dfr = this.j;
            Object obj = this.p;
            cob.b((Object) dfz2, (Object) "deadline");
            cob.b(obj, (Object) "scheduler");
            this.c = new dft(dfr, dfz2, obj);
        } else {
            this.c = new dft(this.j);
        }
        if (this.c.c()) {
            this.d = br.a;
            this.b.execute(new j(this, this.c, dfi));
            return;
        }
        dfp dfp;
        dff = this.l;
        if (dfz != null) {
            dfp = (dfp) this.h.b.get(dfz);
            if (dfp == null) {
                this.d = br.a;
                this.b.execute(new k(this, this.c, dfi, dfz));
                return;
            }
        }
        dfp = dfo.a;
        obj = this.f;
        dgc dgc = this.g;
        dgr.b(ar.e);
        if (obj != null) {
            dgr.a(ar.e, obj);
        }
        dgr.b(ar.b);
        if (dfp != dfo.a) {
            dgr.a(ar.b, dfp.a());
        }
        dgr.b(ar.c);
        if (!dgc.a().isEmpty()) {
            dgr.a(ar.c, ar.f.a(new StringBuilder(), dgc.a().iterator()).toString());
        }
        boolean z = dfz2 != null && dfz2.a();
        if (z) {
            this.d = new ao(dhn.e);
        } else {
            dff dff2 = this.l;
            dfz e2 = this.j.e();
            dgr.b(ar.a);
            if (dfz2 != null) {
                dgr.a(ar.a, Long.valueOf(Math.max(0, dfz2.a(TimeUnit.NANOSECONDS))));
                if (i.isLoggable(Level.INFO) && e2 == dfz2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(String.format("Call timeout set to '%d' ns, due to context deadline.", new Object[]{Long.valueOf(r6)}));
                    if (dfz == null) {
                        stringBuilder.append(" Explicit call timeout was not set.");
                    } else {
                        stringBuilder.append(String.format(" Explicit call timeout was '%d' ns.", new Object[]{Long.valueOf(dfz.a(TimeUnit.NANOSECONDS))}));
                    }
                    i.info(stringBuilder.toString());
                }
            }
            this.d = this.o.a(this.l).a(this.a, dgr);
        }
        dff dff3 = this.l;
        this.d.a(dfp);
        this.d.a(new l(this, dfi));
        if (dfp != dfo.a) {
            this.d.a(true);
        }
        this.c.a(this, buf.I());
        if (this.e) {
            this.c.a((dfv) this);
        }
    }

    public final void a(int i) {
        boolean z;
        boolean z2 = true;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        cob.b(z, (Object) "Not started");
        if (i < 0) {
            z2 = false;
        }
        cob.a(z2, (Object) "Number requested must be non-negative");
        this.d.a(i);
    }

    public final void a(String str, Throwable th) {
        if (!this.m) {
            this.m = true;
            try {
                if (this.d != null) {
                    dhn dhn = dhn.c;
                    if (str != null) {
                        dhn = dhn.a(str);
                    }
                    if (th != null) {
                        dhn = dhn.b(th);
                    }
                    if (str == null && th == null) {
                        dhn = dhn.b(new CancellationException("Client called cancel() without any detail"));
                    }
                    this.d.a(dhn);
                }
                if (this.c != null) {
                    this.c.a((dfv) this);
                }
            } catch (Throwable th2) {
                if (this.c != null) {
                    this.c.a((dfv) this);
                }
            }
        }
    }

    public final void a() {
        boolean z;
        boolean z2 = false;
        cob.b(this.d != null, (Object) "Not started");
        if (this.m) {
            z = false;
        } else {
            z = true;
        }
        cob.b(z, (Object) "call was cancelled");
        if (!this.n) {
            z2 = true;
        }
        cob.b(z2, (Object) "call already half-closed");
        this.n = true;
        this.d.c();
    }

    public final void a(Object obj) {
        boolean z;
        boolean z2 = true;
        cob.b(this.d != null, (Object) "Not started");
        if (this.m) {
            z = false;
        } else {
            z = true;
        }
        cob.b(z, (Object) "call was cancelled");
        if (this.n) {
            z2 = false;
        }
        cob.b(z2, (Object) "call was half-closed");
        try {
            this.d.b(this.a.c.a(obj));
            if (!this.k) {
                this.d.h();
            }
        } catch (Throwable th) {
            this.d.a(dhn.c.b(th).a("Failed to stream message"));
        }
    }
}
