package p000;

public final class obx extends nyx<obx> {
    public static final nyy<nzr, obx> f32110a = nyy.m37203a(11, obx.class, 218917186);
    private static final obx[] f32111h = new obx[0];
    public Double f32112b;
    public Double f32113c;
    public String f32114d;
    public String f32115e;
    public String f32116f;
    public nzr f32117g;

    public /* synthetic */ nzf m37687a(nyt nyt) {
        return m37685b(nyt);
    }

    public obx() {
        m37686d();
    }

    private obx m37686d() {
        this.f32112b = null;
        this.f32113c = null;
        this.f32114d = null;
        this.f32115e = null;
        this.f32116f = null;
        this.f32117g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37688a(nyu nyu) {
        if (this.f32112b != null) {
            nyu.m37166a(1, this.f32112b.doubleValue());
        }
        if (this.f32113c != null) {
            nyu.m37166a(2, this.f32113c.doubleValue());
        }
        if (this.f32114d != null) {
            nyu.m37170a(3, this.f32114d);
        }
        if (this.f32115e != null) {
            nyu.m37170a(4, this.f32115e);
        }
        if (this.f32116f != null) {
            nyu.m37170a(5, this.f32116f);
        }
        if (this.f32117g != null) {
            nyu.m37182b(6, this.f32117g);
        }
        super.a(nyu);
    }

    protected int m37689b() {
        int b = super.b();
        if (this.f32112b != null) {
            this.f32112b.doubleValue();
            b += nyu.m37154h(1) + 8;
        }
        if (this.f32113c != null) {
            this.f32113c.doubleValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f32114d != null) {
            b += nyu.m37137b(3, this.f32114d);
        }
        if (this.f32115e != null) {
            b += nyu.m37137b(4, this.f32115e);
        }
        if (this.f32116f != null) {
            b += nyu.m37137b(5, this.f32116f);
        }
        if (this.f32117g != null) {
            return b + nyu.m37145d(6, this.f32117g);
        }
        return b;
    }

    private obx m37685b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f32112b = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dK /*17*/:
                    this.f32113c = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dx /*26*/:
                    this.f32114d = nyt.m37117j();
                    continue;
                case 34:
                    this.f32115e = nyt.m37117j();
                    continue;
                case 42:
                    this.f32116f = nyt.m37117j();
                    continue;
                case 50:
                    if (this.f32117g == null) {
                        this.f32117g = new nzr();
                    }
                    nyt.m37101a(this.f32117g);
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
