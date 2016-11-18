package p000;

public final class kwj extends nyx<kwj> {
    private static volatile kwj[] f23767e;
    public String f23768a;
    public String f23769b;
    public Integer f23770c;
    public Integer f23771d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27800b(nyt);
    }

    public static kwj[] m27801d() {
        if (f23767e == null) {
            synchronized (nzc.c) {
                if (f23767e == null) {
                    f23767e = new kwj[0];
                }
            }
        }
        return f23767e;
    }

    public kwj() {
        this.f23768a = null;
        this.f23769b = null;
        this.f23770c = null;
        this.f23771d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23768a != null) {
            nyu.a(1, this.f23768a);
        }
        if (this.f23769b != null) {
            nyu.a(2, this.f23769b);
        }
        if (this.f23770c != null) {
            nyu.a(3, this.f23770c.intValue());
        }
        if (this.f23771d != null) {
            nyu.a(4, this.f23771d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23768a != null) {
            b += nyu.b(1, this.f23768a);
        }
        if (this.f23769b != null) {
            b += nyu.b(2, this.f23769b);
        }
        if (this.f23770c != null) {
            b += nyu.f(3, this.f23770c.intValue());
        }
        if (this.f23771d != null) {
            return b + nyu.f(4, this.f23771d.intValue());
        }
        return b;
    }

    private kwj m27800b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23768a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23769b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f23770c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f23771d = Integer.valueOf(nyt.f());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
