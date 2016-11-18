package p000;

final class ekf implements jex, lhp {
    onc<lfd> f11744a = new lhr(this.f11746c);
    final /* synthetic */ eke f11745b;
    private final lhq f11746c;

    public /* synthetic */ Object mo1913a(lhx lhx) {
        return m14088b(lhx);
    }

    ekf(eke eke, lhq lhq) {
        this.f11745b = eke;
        this.f11746c = (lhq) bn.m6214a(lhq);
    }

    public jfl mo1914a() {
        return (jfl) this.f11745b.f11729a.mo1297a();
    }

    public jer mo1915b() {
        return (jer) this.f11745b.f11730b.mo1297a();
    }

    private env m14088b(lhx lhx) {
        return new env(this, lhx);
    }
}
