package defpackage;

/* renamed from: apj */
final class apj<Z> {
    private anv a;
    private aob<Z> b;
    private aqp<Z> c;

    apj() {
    }

    <X> void a(anv anv, aob<X> aob_X, aqp<X> aqp_X) {
        this.a = anv;
        this.b = aob_X;
        this.c = aqp_X;
    }

    void a(apk apk, anz anz) {
        try {
            apk.a().a(this.a, new arv(this.b, this.c, anz));
        } finally {
            this.c.a();
        }
    }

    boolean a() {
        return this.c != null;
    }

    void b() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
