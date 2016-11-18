package p000;

public final class ntm extends nyx<ntm> {
    public int f30755a;
    public Boolean f30756b;

    public /* synthetic */ nzf m36490a(nyt nyt) {
        return m36489b(nyt);
    }

    public ntm() {
        this.f30755a = nzf.UNSET_ENUM_VALUE;
        this.f30756b = null;
        this.cachedSize = -1;
    }

    public void m36491a(nyu nyu) {
        if (this.f30755a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f30755a);
        }
        if (this.f30756b != null) {
            nyu.m37172a(2, this.f30756b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36492b() {
        int b = super.b();
        if (this.f30755a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f30755a);
        }
        if (this.f30756b == null) {
            return b;
        }
        this.f30756b.booleanValue();
        return b + (nyu.m37154h(2) + 1);
    }

    private ntm m36489b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f30755a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f30756b = Boolean.valueOf(nyt.m37116i());
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
