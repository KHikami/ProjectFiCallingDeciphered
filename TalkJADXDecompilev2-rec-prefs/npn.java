package p000;

public final class npn extends nyx<npn> {
    public npp f30440a;
    public nhd f30441b;

    public /* synthetic */ nzf m36048a(nyt nyt) {
        return m36046b(nyt);
    }

    public npn() {
        m36047d();
    }

    private npn m36047d() {
        this.f30440a = null;
        this.f30441b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36049a(nyu nyu) {
        if (this.f30440a != null) {
            nyu.m37182b(1, this.f30440a);
        }
        if (this.f30441b != null) {
            nyu.m37182b(3, this.f30441b);
        }
        super.a(nyu);
    }

    protected int m36050b() {
        int b = super.b();
        if (this.f30440a != null) {
            b += nyu.m37145d(1, this.f30440a);
        }
        if (this.f30441b != null) {
            return b + nyu.m37145d(3, this.f30441b);
        }
        return b;
    }

    private npn m36046b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30440a == null) {
                        this.f30440a = new npp();
                    }
                    nyt.m37101a(this.f30440a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30441b == null) {
                        this.f30441b = new nhd();
                    }
                    nyt.m37101a(this.f30441b);
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
