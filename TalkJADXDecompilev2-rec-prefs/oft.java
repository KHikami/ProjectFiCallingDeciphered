package p000;

public final class oft extends nyx<oft> {
    public String f32672a;
    public String f32673b;
    public ofm f32674c;
    public String f32675d;
    public Integer f32676e;

    public /* synthetic */ nzf m38111a(nyt nyt) {
        return m38109b(nyt);
    }

    public oft() {
        m38110d();
    }

    private oft m38110d() {
        this.f32672a = null;
        this.f32673b = null;
        this.f32674c = null;
        this.f32675d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38112a(nyu nyu) {
        if (this.f32672a != null) {
            nyu.m37170a(1, this.f32672a);
        }
        if (this.f32673b != null) {
            nyu.m37170a(2, this.f32673b);
        }
        if (this.f32674c != null) {
            nyu.m37182b(3, this.f32674c);
        }
        if (this.f32675d != null) {
            nyu.m37170a(4, this.f32675d);
        }
        if (this.f32676e != null) {
            nyu.m37168a(5, this.f32676e.intValue());
        }
        super.a(nyu);
    }

    protected int m38113b() {
        int b = super.b();
        if (this.f32672a != null) {
            b += nyu.m37137b(1, this.f32672a);
        }
        if (this.f32673b != null) {
            b += nyu.m37137b(2, this.f32673b);
        }
        if (this.f32674c != null) {
            b += nyu.m37145d(3, this.f32674c);
        }
        if (this.f32675d != null) {
            b += nyu.m37137b(4, this.f32675d);
        }
        if (this.f32676e != null) {
            return b + nyu.m37147f(5, this.f32676e.intValue());
        }
        return b;
    }

    private oft m38109b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32672a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32673b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f32674c == null) {
                        this.f32674c = new ofm();
                    }
                    nyt.m37101a(this.f32674c);
                    continue;
                case 34:
                    this.f32675d = nyt.m37117j();
                    continue;
                case 40:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f32676e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
