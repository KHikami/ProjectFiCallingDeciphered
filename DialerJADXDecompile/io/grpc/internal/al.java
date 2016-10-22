package io.grpc.internal;

/* compiled from: PG */
final class al implements Runnable {
    private /* synthetic */ int a;
    private /* synthetic */ af b;

    al(af afVar, int i) {
        this.b = afVar;
        this.a = i;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
