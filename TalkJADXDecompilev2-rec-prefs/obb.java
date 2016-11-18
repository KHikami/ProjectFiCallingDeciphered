package p000;

public final class obb extends nyx<obb> {
    public Boolean f31890a;
    public Boolean f31891b;
    public Boolean f31892c;

    public /* synthetic */ nzf m37590a(nyt nyt) {
        return m37588b(nyt);
    }

    public obb() {
        m37589d();
    }

    private obb m37589d() {
        this.f31890a = null;
        this.f31891b = null;
        this.f31892c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37591a(nyu nyu) {
        if (this.f31890a != null) {
            nyu.m37172a(1, this.f31890a.booleanValue());
        }
        if (this.f31891b != null) {
            nyu.m37172a(2, this.f31891b.booleanValue());
        }
        if (this.f31892c != null) {
            nyu.m37172a(3, this.f31892c.booleanValue());
        }
        super.a(nyu);
    }

    protected int m37592b() {
        int b = super.b();
        if (this.f31890a != null) {
            this.f31890a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f31891b != null) {
            this.f31891b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f31892c == null) {
            return b;
        }
        this.f31892c.booleanValue();
        return b + (nyu.m37154h(3) + 1);
    }

    private obb m37588b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31890a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f31891b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f31892c = Boolean.valueOf(nyt.m37116i());
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
