package p000;

public final class oqr extends nyx<oqr> {
    public Integer f33784a;
    public Integer f33785b;

    public /* synthetic */ nzf m39226a(nyt nyt) {
        return m39224b(nyt);
    }

    public oqr() {
        m39225d();
    }

    private oqr m39225d() {
        this.f33784a = null;
        this.f33785b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39227a(nyu nyu) {
        if (this.f33784a != null) {
            nyu.m37191d(1, this.f33784a.intValue());
        }
        if (this.f33785b != null) {
            nyu.m37191d(2, this.f33785b.intValue());
        }
        super.a(nyu);
    }

    protected int m39228b() {
        int b = super.b();
        if (this.f33784a != null) {
            this.f33784a.intValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f33785b == null) {
            return b;
        }
        this.f33785b.intValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private oqr m39224b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f33784a = Integer.valueOf(nyt.m37121n());
                    continue;
                case 21:
                    this.f33785b = Integer.valueOf(nyt.m37121n());
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
