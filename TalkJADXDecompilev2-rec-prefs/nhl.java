package p000;

public final class nhl extends nyx<nhl> {
    public Boolean f29836a;
    public nht f29837b;

    public /* synthetic */ nzf m34967a(nyt nyt) {
        return m34965b(nyt);
    }

    public nhl() {
        m34966d();
    }

    private nhl m34966d() {
        this.f29836a = null;
        this.f29837b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34968a(nyu nyu) {
        if (this.f29836a != null) {
            nyu.m37172a(1, this.f29836a.booleanValue());
        }
        if (this.f29837b != null) {
            nyu.m37182b(2, this.f29837b);
        }
        super.a(nyu);
    }

    protected int m34969b() {
        int b = super.b();
        if (this.f29836a != null) {
            this.f29836a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f29837b != null) {
            return b + nyu.m37145d(2, this.f29837b);
        }
        return b;
    }

    private nhl m34965b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29836a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f29837b == null) {
                        this.f29837b = new nht();
                    }
                    nyt.m37101a(this.f29837b);
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
