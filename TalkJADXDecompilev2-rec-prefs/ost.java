package p000;

public final class ost extends nyx<ost> {
    private static volatile ost[] f34177g;
    public String f34178a;
    public String f34179b;
    public Boolean f34180c;
    public Boolean f34181d;
    public Integer f34182e;
    public Long f34183f;

    public /* synthetic */ nzf m39618a(nyt nyt) {
        return m39615b(nyt);
    }

    public static ost[] m39616d() {
        if (f34177g == null) {
            synchronized (nzc.f31309c) {
                if (f34177g == null) {
                    f34177g = new ost[0];
                }
            }
        }
        return f34177g;
    }

    public ost() {
        m39617g();
    }

    private ost m39617g() {
        this.f34178a = null;
        this.f34179b = null;
        this.f34180c = null;
        this.f34181d = null;
        this.f34183f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39619a(nyu nyu) {
        if (this.f34178a != null) {
            nyu.m37170a(1, this.f34178a);
        }
        if (this.f34179b != null) {
            nyu.m37170a(2, this.f34179b);
        }
        if (this.f34180c != null) {
            nyu.m37172a(3, this.f34180c.booleanValue());
        }
        if (this.f34181d != null) {
            nyu.m37172a(4, this.f34181d.booleanValue());
        }
        if (this.f34182e != null) {
            nyu.m37168a(5, this.f34182e.intValue());
        }
        if (this.f34183f != null) {
            nyu.m37181b(6, this.f34183f.longValue());
        }
        super.a(nyu);
    }

    protected int m39620b() {
        int b = super.b();
        if (this.f34178a != null) {
            b += nyu.m37137b(1, this.f34178a);
        }
        if (this.f34179b != null) {
            b += nyu.m37137b(2, this.f34179b);
        }
        if (this.f34180c != null) {
            this.f34180c.booleanValue();
            b += nyu.m37154h(3) + 1;
        }
        if (this.f34181d != null) {
            this.f34181d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f34182e != null) {
            b += nyu.m37147f(5, this.f34182e.intValue());
        }
        if (this.f34183f != null) {
            return b + nyu.m37148f(6, this.f34183f.longValue());
        }
        return b;
    }

    private ost m39615b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34178a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f34179b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f34180c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 32:
                    this.f34181d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 40:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f34182e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    this.f34183f = Long.valueOf(nyt.m37110e());
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
