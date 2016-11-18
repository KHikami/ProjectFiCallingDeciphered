package p000;

public final class ktm extends nyx<ktm> {
    public String f23231a;
    public String f23232b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27465b(nyt);
    }

    public ktm() {
        m27466d();
    }

    private ktm m27466d() {
        this.f23231a = null;
        this.f23232b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23231a != null) {
            nyu.a(1, this.f23231a);
        }
        if (this.f23232b != null) {
            nyu.a(2, this.f23232b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23231a != null) {
            b += nyu.b(1, this.f23231a);
        }
        if (this.f23232b != null) {
            return b + nyu.b(2, this.f23232b);
        }
        return b;
    }

    private ktm m27465b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23231a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23232b = nyt.j();
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
