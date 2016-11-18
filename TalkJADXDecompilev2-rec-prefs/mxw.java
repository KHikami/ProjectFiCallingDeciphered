package p000;

public final class mxw extends nyx<mxw> {
    public int f29102a;

    public /* synthetic */ nzf m33742a(nyt nyt) {
        return m33741b(nyt);
    }

    public mxw() {
        this.f29102a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m33743a(nyu nyu) {
        if (this.f29102a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29102a);
        }
        super.a(nyu);
    }

    protected int m33744b() {
        int b = super.b();
        if (this.f29102a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(1, this.f29102a);
        }
        return b;
    }

    private mxw m33741b(nyt nyt) {
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
                            this.f29102a = a;
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
