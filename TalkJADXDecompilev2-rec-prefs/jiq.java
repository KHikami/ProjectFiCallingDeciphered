package p000;

final class jiq implements ggn, Runnable {
    final Runnable f20137a;
    final /* synthetic */ jio f20138b;
    private final long f20139c;
    private lka f20140d;

    jiq(jio jio, Runnable runnable, long j) {
        this.f20138b = jio;
        this.f20137a = runnable;
        this.f20139c = j;
    }

    public void run() {
        lka.m29199a(this.f20140d, new jir(this)).run();
    }

    void m24324a() {
        this.f20140d = lka.m29200a();
        gwb.m1864a((Runnable) this, this.f20139c);
    }

    void m24325b() {
        gwb.m2042b((Runnable) this);
    }

    public void mo2263d() {
        m24325b();
        this.f20138b.m24320b(this);
    }
}
