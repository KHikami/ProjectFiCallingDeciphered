package p000;

public final class nok extends nyx<nok> {
    private static volatile nok[] f30372e;
    public Integer f30373a;
    public Integer f30374b;
    public Integer f30375c;
    public String f30376d;

    public /* synthetic */ nzf m35910a(nyt nyt) {
        return m35907b(nyt);
    }

    public static nok[] m35908d() {
        if (f30372e == null) {
            synchronized (nzc.f31309c) {
                if (f30372e == null) {
                    f30372e = new nok[0];
                }
            }
        }
        return f30372e;
    }

    public nok() {
        m35909g();
    }

    private nok m35909g() {
        this.f30374b = null;
        this.f30375c = null;
        this.f30376d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35911a(nyu nyu) {
        if (this.f30373a != null) {
            nyu.m37168a(1, this.f30373a.intValue());
        }
        if (this.f30376d != null) {
            nyu.m37170a(2, this.f30376d);
        }
        if (this.f30374b != null) {
            nyu.m37168a(3, this.f30374b.intValue());
        }
        if (this.f30375c != null) {
            nyu.m37168a(4, this.f30375c.intValue());
        }
        super.a(nyu);
    }

    protected int m35912b() {
        int b = super.b();
        if (this.f30373a != null) {
            b += nyu.m37147f(1, this.f30373a.intValue());
        }
        if (this.f30376d != null) {
            b += nyu.m37137b(2, this.f30376d);
        }
        if (this.f30374b != null) {
            b += nyu.m37147f(3, this.f30374b.intValue());
        }
        if (this.f30375c != null) {
            return b + nyu.m37147f(4, this.f30375c.intValue());
        }
        return b;
    }

    private nok m35907b(nyt nyt) {
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
                            this.f30373a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f30376d = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f30374b = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f30375c = Integer.valueOf(nyt.m37112f());
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
