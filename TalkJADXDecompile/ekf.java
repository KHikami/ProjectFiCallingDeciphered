final class ekf implements jex, lhp {
    onc<lfd> a;
    final /* synthetic */ eke b;
    private final lhq c;

    public /* synthetic */ Object a(lhx lhx) {
        return b(lhx);
    }

    ekf(eke eke, lhq lhq) {
        this.b = eke;
        this.c = (lhq) bn.a(lhq);
        this.a = new lhr(this.c);
    }

    public jfl a() {
        return (jfl) this.b.a.a();
    }

    public jer b() {
        return (jer) this.b.b.a();
    }

    private env b(lhx lhx) {
        return new env(lhx, (byte) 0);
    }
}
