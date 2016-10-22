package io.grpc.internal;

/* compiled from: PG */
final class an implements Runnable {
    private /* synthetic */ boolean a;
    private /* synthetic */ af b;

    an(af afVar, boolean z) {
        this.b = afVar;
        this.a = z;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
