package p000;

public final class ngu extends nyx<ngu> {
    public ngg f29802a;
    public ngs f29803b;
    public nds f29804c;

    public /* synthetic */ nzf m34876a(nyt nyt) {
        return m34874b(nyt);
    }

    public ngu() {
        m34875d();
    }

    private ngu m34875d() {
        this.f29802a = null;
        this.f29803b = null;
        this.f29804c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34877a(nyu nyu) {
        if (this.f29802a != null) {
            nyu.m37182b(1, this.f29802a);
        }
        if (this.f29803b != null) {
            nyu.m37182b(2, this.f29803b);
        }
        if (this.f29804c != null) {
            nyu.m37182b(3, this.f29804c);
        }
        super.a(nyu);
    }

    protected int m34878b() {
        int b = super.b();
        if (this.f29802a != null) {
            b += nyu.m37145d(1, this.f29802a);
        }
        if (this.f29803b != null) {
            b += nyu.m37145d(2, this.f29803b);
        }
        if (this.f29804c != null) {
            return b + nyu.m37145d(3, this.f29804c);
        }
        return b;
    }

    private ngu m34874b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29802a == null) {
                        this.f29802a = new ngg();
                    }
                    nyt.m37101a(this.f29802a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29803b == null) {
                        this.f29803b = new ngs();
                    }
                    nyt.m37101a(this.f29803b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29804c == null) {
                        this.f29804c = new nds();
                    }
                    nyt.m37101a(this.f29804c);
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
