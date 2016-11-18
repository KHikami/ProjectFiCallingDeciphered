package p000;

public final class nqq extends nyx<nqq> {
    public int f30519a;

    public /* synthetic */ nzf m36181a(nyt nyt) {
        return m36180b(nyt);
    }

    public nqq() {
        this.f30519a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36182a(nyu nyu) {
        if (this.f30519a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f30519a);
        }
        super.a(nyu);
    }

    protected int m36183b() {
        int b = super.b();
        if (this.f30519a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(1, this.f30519a);
        }
        return b;
    }

    private nqq m36180b(nyt nyt) {
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
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            this.f30519a = a;
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
