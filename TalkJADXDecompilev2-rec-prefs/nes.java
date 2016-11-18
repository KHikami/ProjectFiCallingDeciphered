package p000;

public final class nes extends nyx<nes> {
    public Boolean f29635a;

    public /* synthetic */ nzf m34598a(nyt nyt) {
        return m34596b(nyt);
    }

    public nes() {
        m34597d();
    }

    private nes m34597d() {
        this.f29635a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34599a(nyu nyu) {
        if (this.f29635a != null) {
            nyu.m37172a(1, this.f29635a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34600b() {
        int b = super.b();
        if (this.f29635a == null) {
            return b;
        }
        this.f29635a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nes m34596b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29635a = Boolean.valueOf(nyt.m37116i());
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
