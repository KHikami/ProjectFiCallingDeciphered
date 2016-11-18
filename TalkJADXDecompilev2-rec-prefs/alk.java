package p000;

final class alk implements Runnable {
    final /* synthetic */ alv f1199a;
    private final alo f1200b;
    private final als f1201c;
    private final Runnable f1202d;

    public alk(alv alv, alo alo, als als, Runnable runnable) {
        this.f1199a = alv;
        this.f1200b = alo;
        this.f1201c = als;
        this.f1202d = runnable;
    }

    public void run() {
        if (this.f1200b.m2850f()) {
            this.f1200b.m2846b("canceled-at-delivery");
            return;
        }
        if (this.f1201c.m2871a()) {
            this.f1200b.mo461a(this.f1201c.f1245a);
        } else {
            this.f1200b.m2845b(this.f1201c.f1247c);
        }
        if (this.f1201c.f1248d) {
            this.f1200b.m2843a("intermediate-response");
        } else {
            this.f1200b.m2846b("done");
        }
        if (this.f1202d != null) {
            this.f1202d.run();
        }
    }
}
