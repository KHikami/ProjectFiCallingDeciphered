package p000;

public final class nqk extends nyx<nqk> {
    public Boolean f30503a;
    public int f30504b;

    public /* synthetic */ nzf m36156a(nyt nyt) {
        return m36155b(nyt);
    }

    public nqk() {
        this.f30503a = null;
        this.f30504b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36157a(nyu nyu) {
        if (this.f30503a != null) {
            nyu.m37172a(1, this.f30503a.booleanValue());
        }
        if (this.f30504b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f30504b);
        }
        super.a(nyu);
    }

    protected int m36158b() {
        int b = super.b();
        if (this.f30503a != null) {
            this.f30503a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30504b != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(2, this.f30504b);
        }
        return b;
    }

    private nqk m36155b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30503a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f30504b = a;
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
