package p000;

public final class npi extends nyx<npi> {
    public Long f30434a;
    public int f30435b;

    public /* synthetic */ nzf m36028a(nyt nyt) {
        return m36027b(nyt);
    }

    public npi() {
        this.f30434a = null;
        this.f30435b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36029a(nyu nyu) {
        if (this.f30434a != null) {
            nyu.m37181b(1, this.f30434a.longValue());
        }
        if (this.f30435b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f30435b);
        }
        super.a(nyu);
    }

    protected int m36030b() {
        int b = super.b();
        if (this.f30434a != null) {
            b += nyu.m37148f(1, this.f30434a.longValue());
        }
        if (this.f30435b != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(2, this.f30435b);
        }
        return b;
    }

    private npi m36027b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30434a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f30435b = a;
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
