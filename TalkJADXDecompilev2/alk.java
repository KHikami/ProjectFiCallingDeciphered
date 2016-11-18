package defpackage;

final class alk implements Runnable {
    final /* synthetic */ alv a;
    private final alo b;
    private final als c;
    private final Runnable d;

    public alk(alv alv, alo alo, als als, Runnable runnable) {
        this.a = alv;
        this.b = alo;
        this.c = als;
        this.d = runnable;
    }

    public void run() {
        if (this.b.f()) {
            this.b.b("canceled-at-delivery");
            return;
        }
        if (this.c.a()) {
            this.b.a(this.c.a);
        } else {
            this.b.b(this.c.c);
        }
        if (this.c.d) {
            this.b.a("intermediate-response");
        } else {
            this.b.b("done");
        }
        if (this.d != null) {
            this.d.run();
        }
    }
}
