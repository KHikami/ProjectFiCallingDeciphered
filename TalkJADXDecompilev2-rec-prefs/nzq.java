package p000;

public final class nzq extends nyx<nzq> {
    public String f31364a;
    public int f31365b;
    public Long f31366c;
    public Long f31367d;
    public Boolean f31368e;

    public /* synthetic */ nzf m37284a(nyt nyt) {
        return m37283b(nyt);
    }

    public nzq() {
        this.f31364a = null;
        this.f31365b = nzf.UNSET_ENUM_VALUE;
        this.f31366c = null;
        this.f31367d = null;
        this.f31368e = null;
        this.cachedSize = -1;
    }

    public void m37285a(nyu nyu) {
        nyu.m37170a(1, this.f31364a);
        if (this.f31365b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f31365b);
        }
        if (this.f31366c != null) {
            nyu.m37181b(3, this.f31366c.longValue());
        }
        if (this.f31367d != null) {
            nyu.m37181b(4, this.f31367d.longValue());
        }
        if (this.f31368e != null) {
            nyu.m37172a(5, this.f31368e.booleanValue());
        }
        super.a(nyu);
    }

    protected int m37286b() {
        int b = super.b() + nyu.m37137b(1, this.f31364a);
        if (this.f31365b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(2, this.f31365b);
        }
        if (this.f31366c != null) {
            b += nyu.m37148f(3, this.f31366c.longValue());
        }
        if (this.f31367d != null) {
            b += nyu.m37148f(4, this.f31367d.longValue());
        }
        if (this.f31368e == null) {
            return b;
        }
        this.f31368e.booleanValue();
        return b + (nyu.m37154h(5) + 1);
    }

    private nzq m37283b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31364a = nyt.m37117j();
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f31365b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f31366c = Long.valueOf(nyt.m37110e());
                    continue;
                case 32:
                    this.f31367d = Long.valueOf(nyt.m37110e());
                    continue;
                case 40:
                    this.f31368e = Boolean.valueOf(nyt.m37116i());
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
