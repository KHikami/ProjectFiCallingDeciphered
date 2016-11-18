package p000;

public final class ndx extends nyx<ndx> {
    public Boolean f29585a;

    public /* synthetic */ nzf m34490a(nyt nyt) {
        return m34488b(nyt);
    }

    public ndx() {
        m34489d();
    }

    private ndx m34489d() {
        this.f29585a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34491a(nyu nyu) {
        if (this.f29585a != null) {
            nyu.m37172a(1, this.f29585a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34492b() {
        int b = super.b();
        if (this.f29585a == null) {
            return b;
        }
        this.f29585a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ndx m34488b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29585a = Boolean.valueOf(nyt.m37116i());
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
