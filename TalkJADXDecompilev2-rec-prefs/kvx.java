package p000;

public final class kvx extends nyx<kvx> {
    public String f23683a;
    public String f23684b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27748b(nyt);
    }

    public kvx() {
        this.f23683a = null;
        this.f23684b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23683a != null) {
            nyu.a(1, this.f23683a);
        }
        if (this.f23684b != null) {
            nyu.a(2, this.f23684b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23683a != null) {
            b += nyu.b(1, this.f23683a);
        }
        if (this.f23684b != null) {
            return b + nyu.b(2, this.f23684b);
        }
        return b;
    }

    private kvx m27748b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23683a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23684b = nyt.j();
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
