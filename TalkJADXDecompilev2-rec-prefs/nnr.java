package p000;

public final class nnr extends nyx<nnr> {
    public Boolean f30306a;
    public Boolean f30307b;

    public /* synthetic */ nzf m35813a(nyt nyt) {
        return m35811b(nyt);
    }

    public nnr() {
        m35812d();
    }

    private nnr m35812d() {
        this.f30306a = null;
        this.f30307b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35814a(nyu nyu) {
        if (this.f30306a != null) {
            nyu.m37172a(1, this.f30306a.booleanValue());
        }
        if (this.f30307b != null) {
            nyu.m37172a(2, this.f30307b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35815b() {
        int b = super.b();
        if (this.f30306a != null) {
            this.f30306a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30307b == null) {
            return b;
        }
        this.f30307b.booleanValue();
        return b + (nyu.m37154h(2) + 1);
    }

    private nnr m35811b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30306a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f30307b = Boolean.valueOf(nyt.m37116i());
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
