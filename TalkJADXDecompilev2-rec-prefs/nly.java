package p000;

public final class nly extends nyx<nly> {
    private static volatile nly[] f30191d;
    public String f30192a;
    public String f30193b;
    public Integer f30194c;

    public /* synthetic */ nzf m35580a(nyt nyt) {
        return m35577b(nyt);
    }

    public static nly[] m35578d() {
        if (f30191d == null) {
            synchronized (nzc.f31309c) {
                if (f30191d == null) {
                    f30191d = new nly[0];
                }
            }
        }
        return f30191d;
    }

    public nly() {
        m35579g();
    }

    private nly m35579g() {
        this.f30192a = null;
        this.f30193b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35581a(nyu nyu) {
        if (this.f30192a != null) {
            nyu.m37170a(1, this.f30192a);
        }
        if (this.f30193b != null) {
            nyu.m37170a(2, this.f30193b);
        }
        if (this.f30194c != null) {
            nyu.m37168a(3, this.f30194c.intValue());
        }
        super.a(nyu);
    }

    protected int m35582b() {
        int b = super.b();
        if (this.f30192a != null) {
            b += nyu.m37137b(1, this.f30192a);
        }
        if (this.f30193b != null) {
            b += nyu.m37137b(2, this.f30193b);
        }
        if (this.f30194c != null) {
            return b + nyu.m37147f(3, this.f30194c.intValue());
        }
        return b;
    }

    private nly m35577b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30192a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f30193b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f30194c = Integer.valueOf(a);
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
