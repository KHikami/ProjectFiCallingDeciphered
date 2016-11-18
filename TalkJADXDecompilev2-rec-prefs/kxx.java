package p000;

public final class kxx extends nyx<kxx> {
    public String f23967a;
    public String f23968b;
    public String f23969c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27993b(nyt);
    }

    public kxx() {
        m27994d();
    }

    private kxx m27994d() {
        this.f23967a = null;
        this.f23968b = null;
        this.f23969c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23967a);
        if (this.f23968b != null) {
            nyu.a(2, this.f23968b);
        }
        if (this.f23969c != null) {
            nyu.a(3, this.f23969c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.b(1, this.f23967a);
        if (this.f23968b != null) {
            b += nyu.b(2, this.f23968b);
        }
        if (this.f23969c != null) {
            return b + nyu.b(3, this.f23969c);
        }
        return b;
    }

    private kxx m27993b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23967a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23968b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23969c = nyt.j();
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
