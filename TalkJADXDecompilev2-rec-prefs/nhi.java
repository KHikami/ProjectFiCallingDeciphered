package p000;

public final class nhi extends nyx<nhi> {
    public Boolean f29833a;

    public /* synthetic */ nzf m34952a(nyt nyt) {
        return m34950b(nyt);
    }

    public nhi() {
        m34951d();
    }

    private nhi m34951d() {
        this.f29833a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34953a(nyu nyu) {
        if (this.f29833a != null) {
            nyu.m37172a(1, this.f29833a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34954b() {
        int b = super.b();
        if (this.f29833a == null) {
            return b;
        }
        this.f29833a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nhi m34950b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29833a = Boolean.valueOf(nyt.m37116i());
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
