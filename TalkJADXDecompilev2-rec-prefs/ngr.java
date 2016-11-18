package p000;

public final class ngr extends nyx<ngr> {
    public Boolean f29799a;

    public /* synthetic */ nzf m34861a(nyt nyt) {
        return m34859b(nyt);
    }

    public ngr() {
        m34860d();
    }

    private ngr m34860d() {
        this.f29799a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34862a(nyu nyu) {
        if (this.f29799a != null) {
            nyu.m37172a(1, this.f29799a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34863b() {
        int b = super.b();
        if (this.f29799a == null) {
            return b;
        }
        this.f29799a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngr m34859b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29799a = Boolean.valueOf(nyt.m37116i());
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
