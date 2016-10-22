package io.grpc.internal;

import dgr;
import dhc;
import dhn;

/* compiled from: PG */
final class ae extends af {
    final dhc a;
    final dgr b;
    private /* synthetic */ z d;

    ae(z zVar, dhc dhc, dgr dgr) {
        this.d = zVar;
        this.a = dhc;
        this.b = dgr;
    }

    public final void a(dhn dhn) {
        super.a(dhn);
        synchronized (this.d.a) {
            if (this.d.c != null) {
                this.d.c.remove(this);
                if (this.d.d && this.d.c.isEmpty()) {
                    this.d.c = null;
                    this.d.b.a();
                }
            }
        }
    }
}
