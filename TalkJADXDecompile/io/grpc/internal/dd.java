package io.grpc.internal;

import bm;
import iyr;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import mft;
import okm;
import okr;
import olv;

final class dd implements dl {
    static final Logger a;
    private static final y q;
    final Object b;
    final okm c;
    final k d;
    final dj e;
    final ScheduledExecutorService f;
    int g;
    j h;
    final mft i;
    ScheduledFuture<?> j;
    final Collection<ca> k;
    final bp<ca> l;
    ae m;
    final okr<y> n;
    boolean o;
    volatile ca p;
    private final String r;
    private final String s;
    private final z t;
    private final Executor u;

    static {
        a = Logger.getLogger(dd.class.getName());
        q = new bf(olv.q.a("TransportSet is shutdown"));
    }

    dd(okm okm, String str, String str2, okr<y> okr_io_grpc_internal_y, k kVar, z zVar, ScheduledExecutorService scheduledExecutorService, iyr iyr, Executor executor, dj djVar) {
        this.b = new Object();
        this.k = new ArrayList();
        this.l = new de(this);
        this.c = (okm) bm.a((Object) okm, (Object) "addressGroup");
        this.r = str;
        this.s = str2;
        this.n = okr_io_grpc_internal_y;
        this.d = kVar;
        this.t = zVar;
        this.f = scheduledExecutorService;
        this.i = (mft) iyr.a();
        this.u = executor;
        this.e = djVar;
    }

    final y a() {
        y yVar = this.p;
        if (yVar == null) {
            synchronized (this.b) {
                yVar = this.p;
                if (yVar != null) {
                } else if (this.o) {
                    yVar = q;
                } else {
                    yVar = new ag(this.u);
                    this.k.add(yVar);
                    yVar.a(new di(this, yVar));
                    this.p = yVar;
                    Runnable a = a(yVar);
                    if (a != null) {
                        a.run();
                    }
                }
            }
        }
        return yVar;
    }

    Runnable a(ag agVar) {
        bm.b(this.j == null, (Object) "Should have no reconnectTask scheduled");
        if (this.g == 0) {
            this.i.b().a();
        }
        List a = this.c.a();
        int i = this.g;
        this.g = i + 1;
        SocketAddress socketAddress = (SocketAddress) a.get(i);
        if (this.g >= a.size()) {
            this.g = 0;
        }
        Object a2 = this.t.a(socketAddress, this.r, this.s);
        if (a.isLoggable(Level.FINE)) {
            a.log(Level.FINE, "[{0}] Created {1} for {2}", new Object[]{c(), a2.c(), socketAddress});
        }
        this.m = a2;
        this.k.add(a2);
        return a2.a(new dk(this, a2, agVar, socketAddress));
    }

    public String c() {
        return bi.a((dl) this);
    }
}
