package io.grpc.internal;

/* compiled from: PG */
final class ag implements Runnable {
    private /* synthetic */ cg a;
    private /* synthetic */ af b;

    ag(af afVar, cg cgVar) {
        this.b = afVar;
        this.a = cgVar;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
