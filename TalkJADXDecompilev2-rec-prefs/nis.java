package p000;

public final class nis extends nyx<nis> {
    public Boolean f29915a;
    public Integer f29916b;

    public /* synthetic */ nzf m35142a(nyt nyt) {
        return m35140b(nyt);
    }

    public nis() {
        m35141d();
    }

    private nis m35141d() {
        this.f29915a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35143a(nyu nyu) {
        if (this.f29915a != null) {
            nyu.m37172a(1, this.f29915a.booleanValue());
        }
        if (this.f29916b != null) {
            nyu.m37168a(2, this.f29916b.intValue());
        }
        super.a(nyu);
    }

    protected int m35144b() {
        int b = super.b();
        if (this.f29915a != null) {
            this.f29915a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f29916b != null) {
            return b + nyu.m37147f(2, this.f29916b.intValue());
        }
        return b;
    }

    private nis m35140b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29915a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f29916b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
