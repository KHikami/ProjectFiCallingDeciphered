package io.grpc.internal;

import cob;
import cyx;
import dgj;
import dgm;
import dhn;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
final class ci implements cn {
    static final Logger a;
    private static final s n;
    final Object b;
    final dgj c;
    final String d;
    final cl e;
    final t f;
    int g;
    boolean h;
    final cyx i;
    ScheduledFuture j;
    final Collection k;
    final dgm l;
    volatile bg m;
    private final h o;
    private final ScheduledExecutorService p;
    private final Executor q;
    private g r;

    static {
        a = Logger.getLogger(ci.class.getName());
        n = new ap(dhn.j.a("TransportSet is shutdown"));
    }

    private ci(dgj dgj, String str, dgm dgm, h hVar, t tVar, ScheduledExecutorService scheduledExecutorService, Executor executor, cl clVar, cyx cyx) {
        this.b = new Object();
        this.h = true;
        this.k = new ArrayList();
        this.c = (dgj) cob.b((Object) dgj, (Object) "addressGroup");
        this.d = str;
        this.l = dgm;
        this.o = hVar;
        this.f = tVar;
        this.p = scheduledExecutorService;
        this.q = executor;
        this.e = clVar;
        this.i = cyx;
    }

    final s a() {
        s sVar = this.m;
        if (sVar == null) {
            synchronized (this.b) {
                if (this.m == null) {
                    Object zVar = new z(this.q);
                    this.k.add(zVar);
                    zVar.a(new ck(this, zVar));
                    this.m = zVar;
                    a(zVar);
                }
                sVar = this.m;
            }
        }
        return sVar;
    }

    final void a(z zVar) {
        long j;
        boolean z = this.j == null || this.j.isDone();
        cob.b(z, (Object) "previous reconnectTask is not done");
        if (this.h) {
            this.g = 0;
        }
        int i = this.g;
        List list = this.c.a;
        SocketAddress socketAddress = (SocketAddress) list.get(i);
        this.g++;
        if (this.g >= list.size()) {
            this.g = 0;
        }
        Runnable cjVar = new cj(this, i, socketAddress, zVar);
        if (i != 0) {
            j = 0;
        } else if (this.h) {
            this.r = this.o.a();
            j = 0;
        } else {
            j = this.r.a() - this.i.a(TimeUnit.MILLISECONDS);
        }
        this.h = false;
        if (a.isLoggable(Level.FINE)) {
            a.log(Level.FINE, "[{0}] Scheduling connection after {1} ms for {2}", new Object[]{ar.a((cn) this), Long.valueOf(j), socketAddress});
        }
        if (j <= 0) {
            this.j = null;
            cjVar.run();
            return;
        }
        this.j = this.p.schedule(cjVar, j, TimeUnit.MILLISECONDS);
    }

    public final String b() {
        return ar.a((cn) this);
    }

    ci(dgj dgj, String str, dgm dgm, h hVar, t tVar, ScheduledExecutorService scheduledExecutorService, Executor executor, cl clVar) {
        this(dgj, str, dgm, hVar, tVar, scheduledExecutorService, executor, clVar, new cyx());
    }
}
