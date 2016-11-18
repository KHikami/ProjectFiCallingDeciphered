package p000;

public final class nfd extends nyx<nfd> {
    public Boolean f29656a;

    public /* synthetic */ nzf m34653a(nyt nyt) {
        return m34651b(nyt);
    }

    public nfd() {
        m34652d();
    }

    private nfd m34652d() {
        this.f29656a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34654a(nyu nyu) {
        if (this.f29656a != null) {
            nyu.m37172a(1, this.f29656a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34655b() {
        int b = super.b();
        if (this.f29656a == null) {
            return b;
        }
        this.f29656a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nfd m34651b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29656a = Boolean.valueOf(nyt.m37116i());
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
