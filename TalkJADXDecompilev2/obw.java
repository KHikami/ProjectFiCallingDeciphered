package defpackage;

public final class obw extends nyx<obw> {
    public static final nyy<nzs, obw> a = nyy.a(11, obw.class, 218917186);
    private static final obw[] h = new obw[0];
    public Double b;
    public Double c;
    public String d;
    public String e;
    public String f;
    public nzs g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public obw() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b.doubleValue());
        }
        if (this.c != null) {
            nyu.a(2, this.c.doubleValue());
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.f != null) {
            nyu.a(5, this.f);
        }
        if (this.g != null) {
            nyu.b(6, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            this.b.doubleValue();
            b += nyu.h(1) + 8;
        }
        if (this.c != null) {
            this.c.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.f != null) {
            b += nyu.b(5, this.f);
        }
        if (this.g != null) {
            return b + nyu.d(6, this.g);
        }
        return b;
    }

    private obw b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.b = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.c = Double.valueOf(nyt.b());
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 34:
                    this.e = nyt.j();
                    continue;
                case 42:
                    this.f = nyt.j();
                    continue;
                case 50:
                    if (this.g == null) {
                        this.g = new nzs();
                    }
                    nyt.a(this.g);
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
