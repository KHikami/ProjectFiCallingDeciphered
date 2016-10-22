package io.grpc.internal;

import dgr;
import dhn;

final class b implements Runnable {
    private /* synthetic */ dhn a;
    private /* synthetic */ dgr b;
    private /* synthetic */ a c;

    b(a aVar, dhn dhn, dgr dgr) {
        this.c = aVar;
        this.a = dhn;
        this.b = dgr;
    }

    public final void run() {
        this.c.b(this.a, this.b);
    }
}
