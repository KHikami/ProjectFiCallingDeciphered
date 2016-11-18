package defpackage;

final class aqp<Z> implements aqr<Z>, bay {
    private static final ll<aqp<?>> a = bas.b(20, new aqq());
    private final bba b = bba.a();
    private aqr<Z> c;
    private boolean d;
    private boolean e;

    static <Z> aqp<Z> a(aqr<Z> aqr_Z) {
        aqp<Z> aqp_Z = (aqp) a.a();
        aqp_Z.e = false;
        aqp_Z.d = true;
        aqp_Z.c = aqr_Z;
        return aqp_Z;
    }

    aqp() {
    }

    public synchronized void a() {
        this.b.b();
        if (this.d) {
            this.d = false;
            if (this.e) {
                e();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public Class<Z> b() {
        return this.c.b();
    }

    public Z c() {
        return this.c.c();
    }

    public int d() {
        return this.c.d();
    }

    public synchronized void e() {
        this.b.b();
        this.e = true;
        if (!this.d) {
            this.c.e();
            this.c = null;
            a.a(this);
        }
    }

    public bba j_() {
        return this.b;
    }
}
