package io.grpc.internal;

import cyx;
import java.net.SocketAddress;
import java.util.logging.Level;

/* compiled from: PG */
final class cj implements Runnable {
    private /* synthetic */ int a;
    private /* synthetic */ SocketAddress b;
    private /* synthetic */ z c;
    private /* synthetic */ ci d;

    cj(ci ciVar, int i, SocketAddress socketAddress, z zVar) {
        this.d = ciVar;
        this.a = i;
        this.b = socketAddress;
        this.c = zVar;
    }

    public final void run() {
        synchronized (this.d.b) {
            this.d.j = null;
            if (this.a == 0) {
                cyx cyx = this.d.i;
                cyx.b = 0;
                cyx.a = false;
                cyx.a();
            }
            bg a = this.d.f.a(this.b, this.d.d);
            if (ci.a.isLoggable(Level.FINE)) {
                ci.a.log(Level.FINE, "[{0}] Created {1} for {2}", new Object[]{ar.a(this.d), a.b(), this.b});
            }
            this.d.k.add(a);
            a.a(new cm(this.d, a, this.c, this.b));
        }
    }
}
