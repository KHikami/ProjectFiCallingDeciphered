package p000;

public final class myo extends nyx<myo> {
    public Integer f29163a;
    public Integer f29164b;

    public /* synthetic */ nzf m33836a(nyt nyt) {
        return m33834b(nyt);
    }

    public myo() {
        m33835d();
    }

    private myo m33835d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33837a(nyu nyu) {
        if (this.f29163a != null) {
            nyu.m37168a(1, this.f29163a.intValue());
        }
        if (this.f29164b != null) {
            nyu.m37168a(2, this.f29164b.intValue());
        }
        super.a(nyu);
    }

    protected int m33838b() {
        int b = super.b();
        if (this.f29163a != null) {
            b += nyu.m37147f(1, this.f29163a.intValue());
        }
        if (this.f29164b != null) {
            return b + nyu.m37147f(2, this.f29164b.intValue());
        }
        return b;
    }

    private myo m33834b(nyt nyt) {
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
                            this.f29163a = Integer.valueOf(a);
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
                            this.f29164b = Integer.valueOf(a);
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
