package p000;

public final class oay extends nyx<oay> {
    private static volatile oay[] f31841h;
    public Integer f31842a;
    public Integer f31843b;
    public oax[] f31844c;
    public Boolean f31845d;
    public Integer f31846e;
    public String f31847f;
    public Boolean f31848g;

    public /* synthetic */ nzf m37489a(nyt nyt) {
        return m37486b(nyt);
    }

    public static oay[] m37487d() {
        if (f31841h == null) {
            synchronized (nzc.f31309c) {
                if (f31841h == null) {
                    f31841h = new oay[0];
                }
            }
        }
        return f31841h;
    }

    public oay() {
        m37488g();
    }

    private oay m37488g() {
        this.f31843b = null;
        this.f31844c = oax.m37481d();
        this.f31845d = null;
        this.f31846e = null;
        this.f31847f = null;
        this.f31848g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37490a(nyu nyu) {
        if (this.f31842a != null) {
            nyu.m37168a(1, this.f31842a.intValue());
        }
        if (this.f31843b != null) {
            nyu.m37168a(2, this.f31843b.intValue());
        }
        if (this.f31844c != null && this.f31844c.length > 0) {
            for (nzf nzf : this.f31844c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        if (this.f31845d != null) {
            nyu.m37172a(4, this.f31845d.booleanValue());
        }
        if (this.f31846e != null) {
            nyu.m37168a(5, this.f31846e.intValue());
        }
        if (this.f31847f != null) {
            nyu.m37170a(6, this.f31847f);
        }
        if (this.f31848g != null) {
            nyu.m37172a(7, this.f31848g.booleanValue());
        }
        super.a(nyu);
    }

    protected int m37491b() {
        int b = super.b();
        if (this.f31842a != null) {
            b += nyu.m37147f(1, this.f31842a.intValue());
        }
        if (this.f31843b != null) {
            b += nyu.m37147f(2, this.f31843b.intValue());
        }
        if (this.f31844c != null && this.f31844c.length > 0) {
            int i = b;
            for (nzf nzf : this.f31844c) {
                if (nzf != null) {
                    i += nyu.m37145d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f31845d != null) {
            this.f31845d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f31846e != null) {
            b += nyu.m37147f(5, this.f31846e.intValue());
        }
        if (this.f31847f != null) {
            b += nyu.m37137b(6, this.f31847f);
        }
        if (this.f31848g == null) {
            return b;
        }
        this.f31848g.booleanValue();
        return b + (nyu.m37154h(7) + 1);
    }

    private oay m37486b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f31842a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f31843b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f31844c == null) {
                        a = 0;
                    } else {
                        a = this.f31844c.length;
                    }
                    Object obj = new oax[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31844c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oax();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oax();
                    nyt.m37101a(obj[a]);
                    this.f31844c = obj;
                    continue;
                case 32:
                    this.f31845d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 40:
                    this.f31846e = Integer.valueOf(nyt.m37112f());
                    continue;
                case 50:
                    this.f31847f = nyt.m37117j();
                    continue;
                case 56:
                    this.f31848g = Boolean.valueOf(nyt.m37116i());
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
