package p000;

public final class mzj extends nyx<mzj> {
    public int f29248a;
    public int f29249b;

    public /* synthetic */ nzf m33940a(nyt nyt) {
        return m33939b(nyt);
    }

    public mzj() {
        this.f29248a = nzf.UNSET_ENUM_VALUE;
        this.f29249b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m33941a(nyu nyu) {
        if (this.f29248a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29248a);
        }
        if (this.f29249b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f29249b);
        }
        super.a(nyu);
    }

    protected int m33942b() {
        int b = super.b();
        if (this.f29248a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29248a);
        }
        if (this.f29249b != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(2, this.f29249b);
        }
        return b;
    }

    private mzj m33939b(nyt nyt) {
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
                        case 3:
                            this.f29248a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f29249b = a;
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
