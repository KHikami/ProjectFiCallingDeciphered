package io.grpc.internal;

import java.io.InputStream;

/* compiled from: PG */
final class ah implements Runnable {
    private /* synthetic */ InputStream a;
    private /* synthetic */ af b;

    ah(af afVar, InputStream inputStream) {
        this.b = afVar;
        this.a = inputStream;
    }

    public final void run() {
        this.b.c.b(this.a);
    }
}
