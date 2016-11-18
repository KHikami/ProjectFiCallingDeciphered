package p000;

public final class nlu extends nyx<nlu> {
    public String f30182a;
    public String f30183b;

    public /* synthetic */ nzf m35558a(nyt nyt) {
        return m35556b(nyt);
    }

    public nlu() {
        m35557d();
    }

    private nlu m35557d() {
        this.f30182a = null;
        this.f30183b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35559a(nyu nyu) {
        if (this.f30182a != null) {
            nyu.m37170a(1, this.f30182a);
        }
        if (this.f30183b != null) {
            nyu.m37170a(2, this.f30183b);
        }
        super.a(nyu);
    }

    protected int m35560b() {
        int b = super.b();
        if (this.f30182a != null) {
            b += nyu.m37137b(1, this.f30182a);
        }
        if (this.f30183b != null) {
            return b + nyu.m37137b(2, this.f30183b);
        }
        return b;
    }

    private nlu m35556b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30182a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f30183b = nyt.m37117j();
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
