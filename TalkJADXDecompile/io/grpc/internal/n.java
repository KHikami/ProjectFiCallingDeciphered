package io.grpc.internal;

import bm;
import gwb;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import ojm;
import ojo;
import ojp;
import ojw;
import ojx;
import ojy;
import ojz;
import okc;
import okg;
import okj;
import okw;
import olh;
import olj;
import olv;

final class n<ReqT, RespT> extends ojo<ReqT, RespT> implements okc {
    private static final Logger g;
    final olh<ReqT, RespT> a;
    final Executor b;
    final ojz c;
    x d;
    volatile boolean e;
    okj f;
    private volatile ScheduledFuture<?> h;
    private final boolean i;
    private final ojm j;
    private boolean k;
    private boolean l;
    private final v m;
    private ScheduledExecutorService n;
    private ojy o;

    static {
        g = Logger.getLogger(n.class.getName());
    }

    n(olh<ReqT, RespT> olh_ReqT__RespT, Executor executor, ojm ojm, v vVar, ScheduledExecutorService scheduledExecutorService) {
        Executor crVar;
        this.f = okj.b;
        this.o = ojy.a;
        this.a = olh_ReqT__RespT;
        if (executor == gwb.aT()) {
            crVar = new cr();
        } else {
            crVar = new cs(executor);
        }
        this.b = crVar;
        this.c = ojz.a();
        boolean z = olh_ReqT__RespT.a() == olj.a || olh_ReqT__RespT.a() == olj.c;
        this.i = z;
        this.j = ojm;
        this.m = vVar;
        this.n = scheduledExecutorService;
    }

    public void a(ojz ojz) {
        this.d.b(gwb.a(ojz));
    }

    n<ReqT, RespT> a(okj okj) {
        this.f = okj;
        return this;
    }

    n<ReqT, RespT> a(ojy ojy) {
        this.o = ojy;
        return this;
    }

    public void a(ojp<RespT> ojp_RespT, okw okw) {
        bm.b(this.d == null, (Object) "Already started");
        bm.a((Object) ojp_RespT, (Object) "observer");
        bm.a((Object) okw, (Object) "headers");
        if (this.c.c()) {
            this.d = cl.a;
            this.b.execute(new o(this, ojp_RespT));
            return;
        }
        ojx a;
        String c = this.j.c();
        if (c != null) {
            a = this.o.a(c);
            if (a == null) {
                this.d = cl.a;
                this.b.execute(new p(this, ojp_RespT, c));
                return;
            }
        }
        a = ojw.a;
        okj okj = this.f;
        okw.c(bi.c);
        if (a != ojw.a) {
            okw.a(bi.c, a.a());
        }
        okw.c(bi.d);
        Object a2 = okj.a();
        if (!a2.isEmpty()) {
            okw.a(bi.d, a2);
        }
        okg c2 = c();
        int i = (c2 == null || !c2.a()) ? 0 : 1;
        if (i == 0) {
            okg a3 = this.j.a();
            okg e = this.c.e();
            okw.c(bi.b);
            if (c2 != null) {
                okw.a(bi.b, Long.valueOf(Math.max(0, c2.a(TimeUnit.NANOSECONDS))));
                if (g.isLoggable(Level.INFO) && e == c2) {
                    long a4;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(String.format("Call timeout set to '%d' ns, due to context deadline.", new Object[]{Long.valueOf(a4)}));
                    if (a3 == null) {
                        stringBuilder.append(" Explicit call timeout was not set.");
                    } else {
                        a4 = a3.a(TimeUnit.NANOSECONDS);
                        stringBuilder.append(String.format(" Explicit call timeout was '%d' ns.", new Object[]{Long.valueOf(a4)}));
                    }
                    g.info(stringBuilder.toString());
                }
            }
            y a5 = this.m.a(this.j);
            ojz b = this.c.b();
            try {
                this.d = a5.a(this.a, okw, this.j);
            } finally {
                this.c.a(b);
            }
        } else {
            this.d = new be(olv.f);
        }
        if (this.j.d() != null) {
            this.d.a(this.j.d());
        }
        this.d.a(a);
        this.d.a(new q(this, ojp_RespT));
        this.c.a(this, gwb.aT());
        if (!(c2 == null || this.c.e() == c2)) {
            this.h = this.n.schedule(new bq(new w(this)), c2.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
        }
        if (this.e) {
            b();
        }
    }

    void b() {
        this.c.a((okc) this);
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    okg c() {
        okg a = this.j.a();
        okg e = this.c.e();
        if (a == null) {
            return e;
        }
        if (e == null) {
            return a;
        }
        return a.a(e);
    }

    public void a(int i) {
        boolean z;
        boolean z2 = true;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        bm.b(z, (Object) "Not started");
        if (i < 0) {
            z2 = false;
        }
        bm.a(z2, (Object) "Number requested must be non-negative");
        this.d.a(i);
    }

    public void a(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            g.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (!this.k) {
            this.k = true;
            try {
                if (this.d != null) {
                    olv olv = olv.c;
                    if (str != null) {
                        olv = olv.a(str);
                    }
                    if (th != null) {
                        olv = olv.b(th);
                    }
                    this.d.b(olv);
                }
                b();
            } catch (Throwable th2) {
                b();
            }
        }
    }

    public void a() {
        boolean z;
        boolean z2 = false;
        bm.b(this.d != null, (Object) "Not started");
        if (this.k) {
            z = false;
        } else {
            z = true;
        }
        bm.b(z, (Object) "call was cancelled");
        if (!this.l) {
            z2 = true;
        }
        bm.b(z2, (Object) "call already half-closed");
        this.l = true;
        this.d.d();
    }

    public void a(ReqT reqT) {
        boolean z;
        boolean z2 = true;
        bm.b(this.d != null, (Object) "Not started");
        if (this.k) {
            z = false;
        } else {
            z = true;
        }
        bm.b(z, (Object) "call was cancelled");
        if (this.l) {
            z2 = false;
        }
        bm.b(z2, (Object) "call was half-closed");
        try {
            this.d.b(this.a.a(reqT));
            if (!this.i) {
                this.d.h();
            }
        } catch (Throwable th) {
            this.d.b(olv.c.b(th).a("Failed to stream message"));
        }
    }
}
