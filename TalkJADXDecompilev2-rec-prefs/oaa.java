package p000;

public final class oaa extends nyx<oaa> {
    public String f31463a;
    public Integer f31464b;
    public Integer f31465c;
    public Boolean f31466d;
    public Boolean f31467e;
    public Boolean f31468f;
    public String f31469g;
    public Integer f31470h;
    public nzz f31471i;

    public /* synthetic */ nzf m37375a(nyt nyt) {
        return m37373b(nyt);
    }

    public oaa() {
        m37374d();
    }

    private oaa m37374d() {
        this.f31463a = null;
        this.f31464b = null;
        this.f31465c = null;
        this.f31466d = null;
        this.f31467e = null;
        this.f31468f = null;
        this.f31469g = null;
        this.f31470h = null;
        this.f31471i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37376a(nyu nyu) {
        if (this.f31463a != null) {
            nyu.m37170a(1, this.f31463a);
        }
        if (this.f31464b != null) {
            nyu.m37168a(2, this.f31464b.intValue());
        }
        if (this.f31465c != null) {
            nyu.m37168a(3, this.f31465c.intValue());
        }
        if (this.f31466d != null) {
            nyu.m37172a(4, this.f31466d.booleanValue());
        }
        if (this.f31467e != null) {
            nyu.m37172a(5, this.f31467e.booleanValue());
        }
        if (this.f31468f != null) {
            nyu.m37172a(6, this.f31468f.booleanValue());
        }
        if (this.f31469g != null) {
            nyu.m37170a(7, this.f31469g);
        }
        if (this.f31470h != null) {
            nyu.m37168a(8, this.f31470h.intValue());
        }
        if (this.f31471i != null) {
            nyu.m37182b(9, this.f31471i);
        }
        super.a(nyu);
    }

    protected int m37377b() {
        int b = super.b();
        if (this.f31463a != null) {
            b += nyu.m37137b(1, this.f31463a);
        }
        if (this.f31464b != null) {
            b += nyu.m37147f(2, this.f31464b.intValue());
        }
        if (this.f31465c != null) {
            b += nyu.m37147f(3, this.f31465c.intValue());
        }
        if (this.f31466d != null) {
            this.f31466d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f31467e != null) {
            this.f31467e.booleanValue();
            b += nyu.m37154h(5) + 1;
        }
        if (this.f31468f != null) {
            this.f31468f.booleanValue();
            b += nyu.m37154h(6) + 1;
        }
        if (this.f31469g != null) {
            b += nyu.m37137b(7, this.f31469g);
        }
        if (this.f31470h != null) {
            b += nyu.m37147f(8, this.f31470h.intValue());
        }
        if (this.f31471i != null) {
            return b + nyu.m37145d(9, this.f31471i);
        }
        return b;
    }

    private oaa m37373b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31463a = nyt.m37117j();
                    continue;
                case 16:
                    this.f31464b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f31465c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f31466d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 40:
                    this.f31467e = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 48:
                    this.f31468f = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 58:
                    this.f31469g = nyt.m37117j();
                    continue;
                case 64:
                    this.f31470h = Integer.valueOf(nyt.m37112f());
                    continue;
                case 74:
                    if (this.f31471i == null) {
                        this.f31471i = new nzz();
                    }
                    nyt.m37101a(this.f31471i);
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
