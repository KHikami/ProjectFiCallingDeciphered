package p000;

public final class nol extends nyx<nol> {
    private static volatile nol[] f30377d;
    public Integer f30378a;
    public Integer f30379b;
    public Integer f30380c;

    public /* synthetic */ nzf m35916a(nyt nyt) {
        return m35913b(nyt);
    }

    public static nol[] m35914d() {
        if (f30377d == null) {
            synchronized (nzc.f31309c) {
                if (f30377d == null) {
                    f30377d = new nol[0];
                }
            }
        }
        return f30377d;
    }

    public nol() {
        m35915g();
    }

    private nol m35915g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35917a(nyu nyu) {
        if (this.f30378a != null) {
            nyu.m37168a(1, this.f30378a.intValue());
        }
        if (this.f30379b != null) {
            nyu.m37168a(2, this.f30379b.intValue());
        }
        if (this.f30380c != null) {
            nyu.m37168a(3, this.f30380c.intValue());
        }
        super.a(nyu);
    }

    protected int m35918b() {
        int b = super.b();
        if (this.f30378a != null) {
            b += nyu.m37147f(1, this.f30378a.intValue());
        }
        if (this.f30379b != null) {
            b += nyu.m37147f(2, this.f30379b.intValue());
        }
        if (this.f30380c != null) {
            return b + nyu.m37147f(3, this.f30380c.intValue());
        }
        return b;
    }

    private nol m35913b(nyt nyt) {
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
                            this.f30378a = Integer.valueOf(a);
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
                            this.f30379b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f30380c = Integer.valueOf(a);
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
