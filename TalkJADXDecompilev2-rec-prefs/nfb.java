package p000;

public final class nfb extends nyx<nfb> {
    public Boolean f29652a;
    public nfg f29653b;
    public nfg f29654c;

    public /* synthetic */ nzf m34643a(nyt nyt) {
        return m34641b(nyt);
    }

    public nfb() {
        m34642d();
    }

    private nfb m34642d() {
        this.f29652a = null;
        this.f29653b = null;
        this.f29654c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34644a(nyu nyu) {
        if (this.f29652a != null) {
            nyu.m37172a(1, this.f29652a.booleanValue());
        }
        if (this.f29653b != null) {
            nyu.m37182b(2, this.f29653b);
        }
        if (this.f29654c != null) {
            nyu.m37182b(3, this.f29654c);
        }
        super.a(nyu);
    }

    protected int m34645b() {
        int b = super.b();
        if (this.f29652a != null) {
            this.f29652a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f29653b != null) {
            b += nyu.m37145d(2, this.f29653b);
        }
        if (this.f29654c != null) {
            return b + nyu.m37145d(3, this.f29654c);
        }
        return b;
    }

    private nfb m34641b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29652a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f29653b == null) {
                        this.f29653b = new nfg();
                    }
                    nyt.m37101a(this.f29653b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29654c == null) {
                        this.f29654c = new nfg();
                    }
                    nyt.m37101a(this.f29654c);
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
