package p000;

public final class nmx extends nyx<nmx> {
    public Boolean f30262a;
    public nmy f30263b;

    public /* synthetic */ nzf m35710a(nyt nyt) {
        return m35708b(nyt);
    }

    public nmx() {
        m35709d();
    }

    private nmx m35709d() {
        this.f30262a = null;
        this.f30263b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35711a(nyu nyu) {
        if (this.f30262a != null) {
            nyu.m37172a(1, this.f30262a.booleanValue());
        }
        if (this.f30263b != null) {
            nyu.m37182b(2, this.f30263b);
        }
        super.a(nyu);
    }

    protected int m35712b() {
        int b = super.b();
        if (this.f30262a != null) {
            this.f30262a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30263b != null) {
            return b + nyu.m37145d(2, this.f30263b);
        }
        return b;
    }

    private nmx m35708b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30262a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30263b == null) {
                        this.f30263b = new nmy();
                    }
                    nyt.m37101a(this.f30263b);
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
