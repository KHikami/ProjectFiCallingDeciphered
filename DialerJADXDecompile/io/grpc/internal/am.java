package io.grpc.internal;

import dfp;

/* compiled from: PG */
final class am implements Runnable {
    private /* synthetic */ dfp a;
    private /* synthetic */ af b;

    am(af afVar, dfp dfp) {
        this.b = afVar;
        this.a = dfp;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
