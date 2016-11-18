package p000;

public final class ngl extends nyx<ngl> {
    public Boolean f29793a;

    public /* synthetic */ nzf m34831a(nyt nyt) {
        return m34829b(nyt);
    }

    public ngl() {
        m34830d();
    }

    private ngl m34830d() {
        this.f29793a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34832a(nyu nyu) {
        if (this.f29793a != null) {
            nyu.m37172a(1, this.f29793a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34833b() {
        int b = super.b();
        if (this.f29793a == null) {
            return b;
        }
        this.f29793a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngl m34829b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29793a = Boolean.valueOf(nyt.m37116i());
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
