package p000;

public final class ngh extends nyx<ngh> {
    public Boolean f29785a;

    public /* synthetic */ nzf m34811a(nyt nyt) {
        return m34809b(nyt);
    }

    public ngh() {
        m34810d();
    }

    private ngh m34810d() {
        this.f29785a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34812a(nyu nyu) {
        if (this.f29785a != null) {
            nyu.m37172a(1, this.f29785a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34813b() {
        int b = super.b();
        if (this.f29785a == null) {
            return b;
        }
        this.f29785a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngh m34809b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29785a = Boolean.valueOf(nyt.m37116i());
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
