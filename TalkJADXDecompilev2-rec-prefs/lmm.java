package p000;

public final class lmm extends nyx<lmm> {
    private static volatile lmm[] f25579i;
    public Integer f25580a;
    public String f25581b;
    public Integer f25582c;
    public String f25583d;
    public Integer f25584e;
    public Boolean f25585f;
    public Boolean f25586g;
    public Boolean f25587h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29504b(nyt);
    }

    public static lmm[] m29505d() {
        if (f25579i == null) {
            synchronized (nzc.c) {
                if (f25579i == null) {
                    f25579i = new lmm[0];
                }
            }
        }
        return f25579i;
    }

    public lmm() {
        this.f25580a = null;
        this.f25581b = null;
        this.f25582c = null;
        this.f25583d = null;
        this.f25584e = null;
        this.f25585f = null;
        this.f25586g = null;
        this.f25587h = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f25580a != null) {
            nyu.a(1, this.f25580a.intValue());
        }
        if (this.f25581b != null) {
            nyu.a(2, this.f25581b);
        }
        if (this.f25582c != null) {
            nyu.a(3, this.f25582c.intValue());
        }
        if (this.f25583d != null) {
            nyu.a(4, this.f25583d);
        }
        if (this.f25584e != null) {
            nyu.a(5, this.f25584e.intValue());
        }
        if (this.f25585f != null) {
            nyu.a(6, this.f25585f.booleanValue());
        }
        if (this.f25586g != null) {
            nyu.a(7, this.f25586g.booleanValue());
        }
        if (this.f25587h != null) {
            nyu.a(8, this.f25587h.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25580a != null) {
            b += nyu.f(1, this.f25580a.intValue());
        }
        if (this.f25581b != null) {
            b += nyu.b(2, this.f25581b);
        }
        if (this.f25582c != null) {
            b += nyu.f(3, this.f25582c.intValue());
        }
        if (this.f25583d != null) {
            b += nyu.b(4, this.f25583d);
        }
        if (this.f25584e != null) {
            b += nyu.f(5, this.f25584e.intValue());
        }
        if (this.f25585f != null) {
            this.f25585f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f25586g != null) {
            this.f25586g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f25587h == null) {
            return b;
        }
        this.f25587h.booleanValue();
        return b + (nyu.h(8) + 1);
    }

    private lmm m29504b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25580a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    this.f25581b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f25582c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f25583d = nyt.j();
                    continue;
                case 40:
                    this.f25584e = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f25585f = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.f25586g = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.f25587h = Boolean.valueOf(nyt.i());
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
