package p000;

public final class ngm extends nyx<ngm> {
    public Boolean f29794a;

    public /* synthetic */ nzf m34836a(nyt nyt) {
        return m34834b(nyt);
    }

    public ngm() {
        m34835d();
    }

    private ngm m34835d() {
        this.f29794a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34837a(nyu nyu) {
        if (this.f29794a != null) {
            nyu.m37172a(1, this.f29794a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34838b() {
        int b = super.b();
        if (this.f29794a == null) {
            return b;
        }
        this.f29794a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngm m34834b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29794a = Boolean.valueOf(nyt.m37116i());
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
