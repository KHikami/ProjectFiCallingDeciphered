package p000;

public final class nfh extends nyx<nfh> {
    public Boolean f29675a;

    public /* synthetic */ nzf m34673a(nyt nyt) {
        return m34671b(nyt);
    }

    public nfh() {
        m34672d();
    }

    private nfh m34672d() {
        this.f29675a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34674a(nyu nyu) {
        if (this.f29675a != null) {
            nyu.m37172a(1, this.f29675a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34675b() {
        int b = super.b();
        if (this.f29675a == null) {
            return b;
        }
        this.f29675a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nfh m34671b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29675a = Boolean.valueOf(nyt.m37116i());
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
