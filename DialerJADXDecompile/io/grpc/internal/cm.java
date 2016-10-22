package io.grpc.internal;

import cob;
import dgj;
import dgm;
import dhn;
import java.net.SocketAddress;
import java.util.logging.Level;

/* compiled from: PG */
final class cm extends ck {
    private final SocketAddress b;
    private final z c;
    private /* synthetic */ ci d;

    public cm(ci ciVar, bg bgVar, z zVar, SocketAddress socketAddress) {
        this.d = ciVar;
        super(ciVar, bgVar);
        this.b = socketAddress;
        this.c = zVar;
    }

    public final void a(dhn dhn) {
        int i = 1;
        int i2 = 0;
        if (ci.a.isLoggable(Level.FINE)) {
            ci.a.log(Level.FINE, "[{0}] {1} for {2} is being shutdown with status {3}", new Object[]{ar.a(this.d), this.a.b(), this.b, dhn});
        }
        super.a(dhn);
        synchronized (this.d.b) {
            if (this.d.m == this.a) {
                this.d.m = null;
                ci ciVar = this.d;
            } else {
                if (this.d.m == this.c) {
                    if (this.d.g == 0) {
                        this.c.a(new ap(dhn));
                        this.c.a();
                        this.d.m = null;
                        i2 = 1;
                        i = 0;
                    } else {
                        this.d.a(this.c);
                    }
                }
                i = 0;
            }
        }
        dgm dgm = this.d.l;
        dgj dgj = this.d.c;
        if (i2 != 0) {
            this.d.e.b();
        }
        if (i != 0) {
            this.d.e.c();
        }
    }

    public final void b() {
        if (ci.a.isLoggable(Level.FINE)) {
            ci.a.log(Level.FINE, "[{0}] {1} for {2} is ready", new Object[]{ar.a(this.d), this.a.b(), this.b});
        }
        super.b();
        synchronized (this.d.b) {
            ci ciVar = this.d;
            this.d.h = true;
            ciVar = this.d;
            if (this.d.m == this.c) {
                this.d.m = this.a;
            }
        }
        this.c.a(this.a);
        this.c.a();
        dgm dgm = this.d.l;
        dgj dgj = this.d.c;
    }

    public final void a() {
        boolean z = true;
        if (ci.a.isLoggable(Level.FINE)) {
            ci.a.log(Level.FINE, "[{0}] {1} for {2} is terminated", new Object[]{ar.a(this.d), this.a.b(), this.b});
        }
        super.a();
        if (this.d.m == this.a) {
            z = false;
        }
        cob.b(z, (Object) "activeTransport still points to the delayedTransport. Seems transportShutdown() was not called.");
    }
}
