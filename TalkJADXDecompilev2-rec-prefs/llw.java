package p000;

public final class llw extends nyx<llw> {
    private static volatile llw[] f25421i;
    public Integer f25422a;
    public String f25423b;
    public Integer f25424c;
    public String f25425d;
    public Integer f25426e;
    public Boolean f25427f;
    public Boolean f25428g;
    public Boolean f25429h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29416b(nyt);
    }

    public static llw[] m29417d() {
        if (f25421i == null) {
            synchronized (nzc.c) {
                if (f25421i == null) {
                    f25421i = new llw[0];
                }
            }
        }
        return f25421i;
    }

    public llw() {
        m29418g();
    }

    private llw m29418g() {
        this.f25422a = null;
        this.f25423b = null;
        this.f25424c = null;
        this.f25425d = null;
        this.f25426e = null;
        this.f25427f = null;
        this.f25428g = null;
        this.f25429h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25422a != null) {
            nyu.a(1, this.f25422a.intValue());
        }
        if (this.f25423b != null) {
            nyu.a(2, this.f25423b);
        }
        if (this.f25424c != null) {
            nyu.a(3, this.f25424c.intValue());
        }
        if (this.f25425d != null) {
            nyu.a(4, this.f25425d);
        }
        if (this.f25426e != null) {
            nyu.a(5, this.f25426e.intValue());
        }
        if (this.f25427f != null) {
            nyu.a(6, this.f25427f.booleanValue());
        }
        if (this.f25428g != null) {
            nyu.a(7, this.f25428g.booleanValue());
        }
        if (this.f25429h != null) {
            nyu.a(8, this.f25429h.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25422a != null) {
            b += nyu.f(1, this.f25422a.intValue());
        }
        if (this.f25423b != null) {
            b += nyu.b(2, this.f25423b);
        }
        if (this.f25424c != null) {
            b += nyu.f(3, this.f25424c.intValue());
        }
        if (this.f25425d != null) {
            b += nyu.b(4, this.f25425d);
        }
        if (this.f25426e != null) {
            b += nyu.f(5, this.f25426e.intValue());
        }
        if (this.f25427f != null) {
            this.f25427f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f25428g != null) {
            this.f25428g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f25429h == null) {
            return b;
        }
        this.f25429h.booleanValue();
        return b + (nyu.h(8) + 1);
    }

    private llw m29416b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25422a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    this.f25423b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f25424c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f25425d = nyt.j();
                    continue;
                case 40:
                    this.f25426e = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f25427f = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.f25428g = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.f25429h = Boolean.valueOf(nyt.i());
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
