package p000;

public final class nlz extends nyx<nlz> {
    public Integer f30195a;
    public Integer f30196b;

    public /* synthetic */ nzf m35585a(nyt nyt) {
        return m35583b(nyt);
    }

    public nlz() {
        m35584d();
    }

    private nlz m35584d() {
        this.f30195a = null;
        this.f30196b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35586a(nyu nyu) {
        if (this.f30195a != null) {
            nyu.m37180b(1, this.f30195a.intValue());
        }
        if (this.f30196b != null) {
            nyu.m37180b(2, this.f30196b.intValue());
        }
        super.a(nyu);
    }

    protected int m35587b() {
        int b = super.b();
        if (this.f30195a != null) {
            this.f30195a.intValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f30196b == null) {
            return b;
        }
        this.f30196b.intValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private nlz m35583b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f30195a = Integer.valueOf(nyt.m37115h());
                    continue;
                case 21:
                    this.f30196b = Integer.valueOf(nyt.m37115h());
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
