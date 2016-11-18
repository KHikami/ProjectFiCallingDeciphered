package p000;

public final class nom extends nyx<nom> {
    private static volatile nom[] f30381e;
    public Integer f30382a;
    public Integer f30383b;
    public Integer f30384c;
    public String f30385d;

    public /* synthetic */ nzf m35922a(nyt nyt) {
        return m35919b(nyt);
    }

    public static nom[] m35920d() {
        if (f30381e == null) {
            synchronized (nzc.f31309c) {
                if (f30381e == null) {
                    f30381e = new nom[0];
                }
            }
        }
        return f30381e;
    }

    public nom() {
        m35921g();
    }

    private nom m35921g() {
        this.f30382a = null;
        this.f30383b = null;
        this.f30384c = null;
        this.f30385d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35923a(nyu nyu) {
        if (this.f30382a != null) {
            nyu.m37168a(1, this.f30382a.intValue());
        }
        if (this.f30383b != null) {
            nyu.m37168a(2, this.f30383b.intValue());
        }
        if (this.f30384c != null) {
            nyu.m37168a(3, this.f30384c.intValue());
        }
        if (this.f30385d != null) {
            nyu.m37170a(4, this.f30385d);
        }
        super.a(nyu);
    }

    protected int m35924b() {
        int b = super.b();
        if (this.f30382a != null) {
            b += nyu.m37147f(1, this.f30382a.intValue());
        }
        if (this.f30383b != null) {
            b += nyu.m37147f(2, this.f30383b.intValue());
        }
        if (this.f30384c != null) {
            b += nyu.m37147f(3, this.f30384c.intValue());
        }
        if (this.f30385d != null) {
            return b + nyu.m37137b(4, this.f30385d);
        }
        return b;
    }

    private nom m35919b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30382a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f30383b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f30384c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    this.f30385d = nyt.m37117j();
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
