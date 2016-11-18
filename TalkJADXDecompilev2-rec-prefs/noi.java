package p000;

public final class noi extends nyx<noi> {
    public String f30361a;
    public String f30362b;
    public String f30363c;
    public Double f30364d;
    public Double f30365e;

    public /* synthetic */ nzf m35899a(nyt nyt) {
        return m35897b(nyt);
    }

    public noi() {
        m35898d();
    }

    private noi m35898d() {
        this.f30361a = null;
        this.f30362b = null;
        this.f30363c = null;
        this.f30364d = null;
        this.f30365e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35900a(nyu nyu) {
        if (this.f30361a != null) {
            nyu.m37170a(1, this.f30361a);
        }
        if (this.f30362b != null) {
            nyu.m37170a(2, this.f30362b);
        }
        if (this.f30363c != null) {
            nyu.m37170a(3, this.f30363c);
        }
        if (this.f30364d != null) {
            nyu.m37166a(4, this.f30364d.doubleValue());
        }
        if (this.f30365e != null) {
            nyu.m37166a(5, this.f30365e.doubleValue());
        }
        super.a(nyu);
    }

    protected int m35901b() {
        int b = super.b();
        if (this.f30361a != null) {
            b += nyu.m37137b(1, this.f30361a);
        }
        if (this.f30362b != null) {
            b += nyu.m37137b(2, this.f30362b);
        }
        if (this.f30363c != null) {
            b += nyu.m37137b(3, this.f30363c);
        }
        if (this.f30364d != null) {
            this.f30364d.doubleValue();
            b += nyu.m37154h(4) + 8;
        }
        if (this.f30365e == null) {
            return b;
        }
        this.f30365e.doubleValue();
        return b + (nyu.m37154h(5) + 8);
    }

    private noi m35897b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30361a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f30362b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f30363c = nyt.m37117j();
                    continue;
                case 33:
                    this.f30364d = Double.valueOf(nyt.m37104b());
                    continue;
                case 41:
                    this.f30365e = Double.valueOf(nyt.m37104b());
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
