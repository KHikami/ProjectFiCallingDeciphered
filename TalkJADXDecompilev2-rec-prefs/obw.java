package p000;

public final class obw extends nyx<obw> {
    public static final nyy<nzs, obw> f32102a = nyy.m37203a(11, obw.class, 218917186);
    private static final obw[] f32103h = new obw[0];
    public Double f32104b;
    public Double f32105c;
    public String f32106d;
    public String f32107e;
    public String f32108f;
    public nzs f32109g;

    public /* synthetic */ nzf m37682a(nyt nyt) {
        return m37681b(nyt);
    }

    public obw() {
        this.f32104b = null;
        this.f32105c = null;
        this.f32106d = null;
        this.f32107e = null;
        this.f32108f = null;
        this.cachedSize = -1;
    }

    public void m37683a(nyu nyu) {
        if (this.f32104b != null) {
            nyu.m37166a(1, this.f32104b.doubleValue());
        }
        if (this.f32105c != null) {
            nyu.m37166a(2, this.f32105c.doubleValue());
        }
        if (this.f32106d != null) {
            nyu.m37170a(3, this.f32106d);
        }
        if (this.f32107e != null) {
            nyu.m37170a(4, this.f32107e);
        }
        if (this.f32108f != null) {
            nyu.m37170a(5, this.f32108f);
        }
        if (this.f32109g != null) {
            nyu.m37182b(6, this.f32109g);
        }
        super.a(nyu);
    }

    protected int m37684b() {
        int b = super.b();
        if (this.f32104b != null) {
            this.f32104b.doubleValue();
            b += nyu.m37154h(1) + 8;
        }
        if (this.f32105c != null) {
            this.f32105c.doubleValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f32106d != null) {
            b += nyu.m37137b(3, this.f32106d);
        }
        if (this.f32107e != null) {
            b += nyu.m37137b(4, this.f32107e);
        }
        if (this.f32108f != null) {
            b += nyu.m37137b(5, this.f32108f);
        }
        if (this.f32109g != null) {
            return b + nyu.m37145d(6, this.f32109g);
        }
        return b;
    }

    private obw m37681b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f32104b = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dK /*17*/:
                    this.f32105c = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dx /*26*/:
                    this.f32106d = nyt.m37117j();
                    continue;
                case 34:
                    this.f32107e = nyt.m37117j();
                    continue;
                case 42:
                    this.f32108f = nyt.m37117j();
                    continue;
                case 50:
                    if (this.f32109g == null) {
                        this.f32109g = new nzs();
                    }
                    nyt.m37101a(this.f32109g);
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
