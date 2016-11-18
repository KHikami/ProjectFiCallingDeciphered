package p000;

public final class oam extends nyx<oam> {
    private static volatile oam[] f31649h;
    public int f31650a;
    public Integer f31651b;
    public oal[] f31652c;
    public Boolean f31653d;
    public Integer f31654e;
    public String f31655f;
    public Boolean f31656g;

    public /* synthetic */ nzf m37432a(nyt nyt) {
        return m37430b(nyt);
    }

    public static oam[] m37431d() {
        if (f31649h == null) {
            synchronized (nzc.f31309c) {
                if (f31649h == null) {
                    f31649h = new oam[0];
                }
            }
        }
        return f31649h;
    }

    public oam() {
        this.f31650a = nzf.UNSET_ENUM_VALUE;
        this.f31651b = null;
        this.f31652c = oal.m37426d();
        this.f31653d = null;
        this.f31654e = null;
        this.f31655f = null;
        this.f31656g = null;
        this.cachedSize = -1;
    }

    public void m37433a(nyu nyu) {
        if (this.f31650a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f31650a);
        }
        if (this.f31651b != null) {
            nyu.m37168a(2, this.f31651b.intValue());
        }
        if (this.f31652c != null && this.f31652c.length > 0) {
            for (nzf nzf : this.f31652c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        if (this.f31653d != null) {
            nyu.m37172a(4, this.f31653d.booleanValue());
        }
        if (this.f31654e != null) {
            nyu.m37168a(5, this.f31654e.intValue());
        }
        if (this.f31655f != null) {
            nyu.m37170a(6, this.f31655f);
        }
        if (this.f31656g != null) {
            nyu.m37172a(7, this.f31656g.booleanValue());
        }
        super.a(nyu);
    }

    protected int m37434b() {
        int b = super.b();
        if (this.f31650a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f31650a);
        }
        if (this.f31651b != null) {
            b += nyu.m37147f(2, this.f31651b.intValue());
        }
        if (this.f31652c != null && this.f31652c.length > 0) {
            int i = b;
            for (nzf nzf : this.f31652c) {
                if (nzf != null) {
                    i += nyu.m37145d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f31653d != null) {
            this.f31653d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f31654e != null) {
            b += nyu.m37147f(5, this.f31654e.intValue());
        }
        if (this.f31655f != null) {
            b += nyu.m37137b(6, this.f31655f);
        }
        if (this.f31656g == null) {
            return b;
        }
        this.f31656g.booleanValue();
        return b + (nyu.m37154h(7) + 1);
    }

    private oam m37430b(nyt nyt) {
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
                            this.f31650a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f31651b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f31652c == null) {
                        a = 0;
                    } else {
                        a = this.f31652c.length;
                    }
                    Object obj = new oal[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31652c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oal();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oal();
                    nyt.m37101a(obj[a]);
                    this.f31652c = obj;
                    continue;
                case 32:
                    this.f31653d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 40:
                    this.f31654e = Integer.valueOf(nyt.m37112f());
                    continue;
                case 50:
                    this.f31655f = nyt.m37117j();
                    continue;
                case 56:
                    this.f31656g = Boolean.valueOf(nyt.m37116i());
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
