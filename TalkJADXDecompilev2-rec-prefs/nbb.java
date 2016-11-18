package p000;

public final class nbb extends nyx<nbb> {
    public String f29414a;
    public String f29415b;

    public /* synthetic */ nzf m34146a(nyt nyt) {
        return m34144b(nyt);
    }

    public nbb() {
        m34145d();
    }

    private nbb m34145d() {
        this.f29414a = null;
        this.f29415b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34147a(nyu nyu) {
        if (this.f29414a != null) {
            nyu.m37170a(1, this.f29414a);
        }
        if (this.f29415b != null) {
            nyu.m37170a(2, this.f29415b);
        }
        super.a(nyu);
    }

    protected int m34148b() {
        int b = super.b();
        if (this.f29414a != null) {
            b += nyu.m37137b(1, this.f29414a);
        }
        if (this.f29415b != null) {
            return b + nyu.m37137b(2, this.f29415b);
        }
        return b;
    }

    private nbb m34144b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29414a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f29415b = nyt.m37117j();
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
