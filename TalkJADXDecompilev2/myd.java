package defpackage;

public final class myd extends nyx<myd> {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public myd() {
        d();
    }

    private myd d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.doubleValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.doubleValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.doubleValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.doubleValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.doubleValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.doubleValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.doubleValue();
            b += nyu.h(1) + 8;
        }
        if (this.b != null) {
            this.b.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.c != null) {
            this.c.doubleValue();
            b += nyu.h(3) + 8;
        }
        if (this.d != null) {
            this.d.doubleValue();
            b += nyu.h(4) + 8;
        }
        if (this.e != null) {
            this.e.doubleValue();
            b += nyu.h(5) + 8;
        }
        if (this.f == null) {
            return b;
        }
        this.f.doubleValue();
        return b + (nyu.h(6) + 8);
    }

    private myd b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.a = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.b = Double.valueOf(nyt.b());
                    continue;
                case wi.dz /*25*/:
                    this.c = Double.valueOf(nyt.b());
                    continue;
                case 33:
                    this.d = Double.valueOf(nyt.b());
                    continue;
                case 41:
                    this.e = Double.valueOf(nyt.b());
                    continue;
                case 49:
                    this.f = Double.valueOf(nyt.b());
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
