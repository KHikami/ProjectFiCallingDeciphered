package p000;

public final class ndz extends nyx<ndz> {
    public Boolean f29587a;

    public /* synthetic */ nzf m34500a(nyt nyt) {
        return m34498b(nyt);
    }

    public ndz() {
        m34499d();
    }

    private ndz m34499d() {
        this.f29587a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34501a(nyu nyu) {
        if (this.f29587a != null) {
            nyu.m37172a(1, this.f29587a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34502b() {
        int b = super.b();
        if (this.f29587a == null) {
            return b;
        }
        this.f29587a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ndz m34498b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29587a = Boolean.valueOf(nyt.m37116i());
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
