package p000;

public final class ngz extends nyx<ngz> {
    public Boolean f29814a;

    public /* synthetic */ nzf m34901a(nyt nyt) {
        return m34899b(nyt);
    }

    public ngz() {
        m34900d();
    }

    private ngz m34900d() {
        this.f29814a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34902a(nyu nyu) {
        if (this.f29814a != null) {
            nyu.m37172a(1, this.f29814a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34903b() {
        int b = super.b();
        if (this.f29814a == null) {
            return b;
        }
        this.f29814a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngz m34899b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29814a = Boolean.valueOf(nyt.m37116i());
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
