package io.grpc.internal;

import bm;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import okm;
import okr;
import olv;

final class dk extends di {
    final /* synthetic */ dd c;
    private final SocketAddress d;
    private final ag e;

    public dk(dd ddVar, ca caVar, ag agVar, SocketAddress socketAddress) {
        this.c = ddVar;
        super(ddVar, caVar);
        this.d = socketAddress;
        this.e = agVar;
    }

    public void b() {
        boolean z = true;
        if (dd.a.isLoggable(Level.FINE)) {
            dd.a.log(Level.FINE, "[{0}] {1} for {2} is ready", new Object[]{this.c.c(), this.a.c(), this.d});
        }
        super.b();
        synchronized (this.c.b) {
            boolean z2 = this.c.o;
            this.c.h = null;
            this.c.g = 0;
            if (this.c.o) {
                if (this.c.p != null) {
                    z = false;
                }
                bm.b(z, (Object) "Unexpected non-null activeTransport");
            } else if (this.c.p == this.e) {
                if (this.c.m != this.a) {
                    z = false;
                }
                bm.b(z, (Object) "transport mismatch");
                this.c.p = this.a;
                this.c.m = null;
            }
        }
        this.e.a(this.a);
        this.e.a();
        if (z2) {
            this.a.a();
        }
        okr okr = this.c.n;
        okm okm = this.c.c;
    }

    public void a(olv olv) {
        int i;
        Runnable runnable;
        int i2 = 1;
        int i3 = 0;
        if (dd.a.isLoggable(Level.FINE)) {
            dd.a.log(Level.FINE, "[{0}] {1} for {2} is being shutdown with status {3}", new Object[]{this.c.c(), this.a.c(), this.d, olv});
        }
        super.a(olv);
        synchronized (this.c.b) {
            if (this.c.p == this.a) {
                this.c.p = null;
                if (this.c.o) {
                    i2 = 0;
                }
                i = 0;
                i3 = i2;
                runnable = null;
            } else if (this.c.p != this.e) {
                runnable = null;
                i = 0;
            } else if (this.c.g == 0) {
                dd ddVar = this.c;
                ag agVar = this.e;
                bm.b(ddVar.j == null, (Object) "previous reconnectTask is not done");
                if (ddVar.h == null) {
                    ddVar.h = ddVar.d.a();
                }
                long a = ddVar.h.a() - ddVar.i.a(TimeUnit.MILLISECONDS);
                if (dd.a.isLoggable(Level.FINE)) {
                    dd.a.log(Level.FINE, "[{0}] Scheduling backoff for {1} ms", new Object[]{ddVar.c(), Long.valueOf(a)});
                }
                ddVar.j = ddVar.f.schedule(new bq(new df(ddVar, agVar)), a, TimeUnit.MILLISECONDS);
                dh dhVar = new dh(ddVar, agVar, olv);
                i = 1;
                Object obj = dhVar;
            } else {
                runnable = this.c.a(this.e);
                i = 0;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        okr okr = this.c.n;
        okm okm = this.c.c;
        if (i != 0) {
            this.c.e.a();
        }
        if (i3 != 0) {
            this.c.e.b();
        }
    }

    public void a() {
        boolean z = true;
        if (dd.a.isLoggable(Level.FINE)) {
            dd.a.log(Level.FINE, "[{0}] {1} for {2} is terminated", new Object[]{this.c.c(), this.a.c(), this.d});
        }
        super.a();
        if (this.c.p == this.a) {
            z = false;
        }
        bm.b(z, (Object) "activeTransport still points to the delayedTransport. Seems transportShutdown() was not called.");
    }
}
