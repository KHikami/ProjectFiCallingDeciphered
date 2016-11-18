package p000;

public final class ngq extends nyx<ngq> {
    public Boolean f29798a;

    public /* synthetic */ nzf m34856a(nyt nyt) {
        return m34854b(nyt);
    }

    public ngq() {
        m34855d();
    }

    private ngq m34855d() {
        this.f29798a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34857a(nyu nyu) {
        if (this.f29798a != null) {
            nyu.m37172a(1, this.f29798a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34858b() {
        int b = super.b();
        if (this.f29798a == null) {
            return b;
        }
        this.f29798a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngq m34854b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29798a = Boolean.valueOf(nyt.m37116i());
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
