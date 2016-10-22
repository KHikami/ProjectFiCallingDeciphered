package io.grpc.internal;

import java.util.logging.Level;
import olv;

class di implements cb {
    public final ca a;
    final /* synthetic */ dd b;

    public di(dd ddVar, ca caVar) {
        this.b = ddVar;
        this.a = caVar;
    }

    public void b() {
    }

    public void a(boolean z) {
        this.b.l.a(this.a, z);
    }

    public void a(olv olv) {
    }

    public void a() {
        boolean z = false;
        this.b.l.a(this.a, false);
        synchronized (this.b.b) {
            this.b.k.remove(this.a);
            if (this.b.o && this.b.k.isEmpty()) {
                if (dd.a.isLoggable(Level.FINE)) {
                    dd.a.log(Level.FINE, "[{0}] Terminated", this.b.c());
                }
                z = true;
                dd ddVar = this.b;
                if (ddVar.j != null) {
                    ddVar.j.cancel(false);
                    ddVar.j = null;
                }
            }
        }
        if (z) {
            this.b.e.a(this.b);
        }
    }
}
