package io.grpc.internal;

import dhn;

/* compiled from: PG */
final class aj implements Runnable {
    private /* synthetic */ dhn a;
    private /* synthetic */ af b;

    aj(af afVar, dhn dhn) {
        this.b = afVar;
        this.a = dhn;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
