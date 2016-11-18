package p000;

public final class osl extends nyx<osl> {
    public Boolean f34155a;
    public String f34156b;

    public /* synthetic */ nzf m39579a(nyt nyt) {
        return m39577b(nyt);
    }

    public osl() {
        m39578d();
    }

    private osl m39578d() {
        this.f34155a = null;
        this.f34156b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39580a(nyu nyu) {
        if (this.f34155a != null) {
            nyu.m37172a(1, this.f34155a.booleanValue());
        }
        if (this.f34156b != null) {
            nyu.m37170a(2, this.f34156b);
        }
        super.a(nyu);
    }

    protected int m39581b() {
        int b = super.b();
        if (this.f34155a != null) {
            this.f34155a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f34156b != null) {
            return b + nyu.m37137b(2, this.f34156b);
        }
        return b;
    }

    private osl m39577b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34155a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    this.f34156b = nyt.m37117j();
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
