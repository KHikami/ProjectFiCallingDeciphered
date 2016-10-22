package defpackage;

/* renamed from: jiq */
final class jiq implements ggn, Runnable {
    final Runnable a;
    final /* synthetic */ jio b;
    private final long c;
    private lka d;

    jiq(jio jio, Runnable runnable, long j) {
        this.b = jio;
        this.a = runnable;
        this.c = j;
    }

    public void run() {
        lka.a(this.d, new jir(this)).run();
    }

    void a() {
        this.d = lka.a();
        gwb.a((Runnable) this, this.c);
    }

    void b() {
        gwb.b((Runnable) this);
    }

    public void d() {
        b();
        this.b.b(this);
    }
}
