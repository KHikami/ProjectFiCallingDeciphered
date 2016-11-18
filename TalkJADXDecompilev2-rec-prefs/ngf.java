package p000;

public final class ngf extends nyx<ngf> {
    public Boolean f29783a;

    public /* synthetic */ nzf m34801a(nyt nyt) {
        return m34799b(nyt);
    }

    public ngf() {
        m34800d();
    }

    private ngf m34800d() {
        this.f29783a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34802a(nyu nyu) {
        if (this.f29783a != null) {
            nyu.m37172a(1, this.f29783a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34803b() {
        int b = super.b();
        if (this.f29783a == null) {
            return b;
        }
        this.f29783a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngf m34799b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29783a = Boolean.valueOf(nyt.m37116i());
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
