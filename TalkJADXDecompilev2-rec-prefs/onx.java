package p000;

public final class onx extends nyx<onx> {
    public int f33337a;

    public /* synthetic */ nzf m38856a(nyt nyt) {
        return m38855b(nyt);
    }

    public onx() {
        this.f33337a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m38857a(nyu nyu) {
        if (this.f33337a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f33337a);
        }
        super.a(nyu);
    }

    protected int m38858b() {
        int b = super.b();
        if (this.f33337a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(1, this.f33337a);
        }
        return b;
    }

    private onx m38855b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case -1:
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
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                            this.f33337a = a;
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
