package p000;

public final class oce extends nyx<oce> {
    private static volatile oce[] f32225d;
    public String f32226a;
    public String f32227b;
    public int f32228c;

    public /* synthetic */ nzf m37725a(nyt nyt) {
        return m37723b(nyt);
    }

    public static oce[] m37724d() {
        if (f32225d == null) {
            synchronized (nzc.f31309c) {
                if (f32225d == null) {
                    f32225d = new oce[0];
                }
            }
        }
        return f32225d;
    }

    public oce() {
        this.f32226a = null;
        this.f32227b = null;
        this.f32228c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m37726a(nyu nyu) {
        if (this.f32226a != null) {
            nyu.m37170a(1, this.f32226a);
        }
        if (this.f32227b != null) {
            nyu.m37170a(2, this.f32227b);
        }
        if (this.f32228c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(3, this.f32228c);
        }
        super.a(nyu);
    }

    protected int m37727b() {
        int b = super.b();
        if (this.f32226a != null) {
            b += nyu.m37137b(1, this.f32226a);
        }
        if (this.f32227b != null) {
            b += nyu.m37137b(2, this.f32227b);
        }
        if (this.f32228c != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(3, this.f32228c);
        }
        return b;
    }

    private oce m37723b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32226a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32227b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f32228c = a;
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
