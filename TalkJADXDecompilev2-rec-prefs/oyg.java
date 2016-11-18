package p000;

public final class oyg extends nyx<oyg> {
    private static volatile oyg[] f34627d;
    public oyh f34628a;
    public oyi f34629b;
    public Integer f34630c;

    public /* synthetic */ nzf m39897a(nyt nyt) {
        return m39894b(nyt);
    }

    public static oyg[] m39895d() {
        if (f34627d == null) {
            synchronized (nzc.f31309c) {
                if (f34627d == null) {
                    f34627d = new oyg[0];
                }
            }
        }
        return f34627d;
    }

    public oyg() {
        m39896g();
    }

    private oyg m39896g() {
        this.f34628a = null;
        this.f34629b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39898a(nyu nyu) {
        if (this.f34628a != null) {
            nyu.m37182b(1, this.f34628a);
        }
        if (this.f34630c != null) {
            nyu.m37168a(2, this.f34630c.intValue());
        }
        if (this.f34629b != null) {
            nyu.m37182b(3, this.f34629b);
        }
        super.a(nyu);
    }

    protected int m39899b() {
        int b = super.b();
        if (this.f34628a != null) {
            b += nyu.m37145d(1, this.f34628a);
        }
        if (this.f34630c != null) {
            b += nyu.m37147f(2, this.f34630c.intValue());
        }
        if (this.f34629b != null) {
            return b + nyu.m37145d(3, this.f34629b);
        }
        return b;
    }

    private oyg m39894b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34628a == null) {
                        this.f34628a = new oyh();
                    }
                    nyt.m37101a(this.f34628a);
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 45:
                            this.f34630c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f34629b == null) {
                        this.f34629b = new oyi();
                    }
                    nyt.m37101a(this.f34629b);
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
