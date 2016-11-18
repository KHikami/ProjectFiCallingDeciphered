package p000;

public final class mav extends nyx<mav> {
    public String f27158a;
    public String f27159b;
    public String f27160c;
    public String f27161d;
    public String f27162e;
    public lko f27163f;
    public lkx f27164g;
    public lkz f27165h;
    public llc f27166i;
    public llj f27167j;
    public lkw f27168k;
    public llf f27169l;
    public lld f27170m;
    public String[] f27171n;
    public Boolean f27172o;
    public Integer f27173p;
    public String f27174q;
    public String f27175r;
    public Boolean f27176s;
    public Long f27177t;
    public Long f27178u;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31492b(nyt);
    }

    public mav() {
        m31493d();
    }

    private mav m31493d() {
        this.f27158a = null;
        this.f27159b = null;
        this.f27160c = null;
        this.f27161d = null;
        this.f27162e = null;
        this.f27163f = null;
        this.f27164g = null;
        this.f27165h = null;
        this.f27166i = null;
        this.f27167j = null;
        this.f27168k = null;
        this.f27169l = null;
        this.f27170m = null;
        this.f27171n = nzl.f;
        this.f27172o = null;
        this.f27174q = null;
        this.f27175r = null;
        this.f27176s = null;
        this.f27177t = null;
        this.f27178u = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27158a != null) {
            nyu.a(1, this.f27158a);
        }
        if (this.f27159b != null) {
            nyu.a(2, this.f27159b);
        }
        if (this.f27162e != null) {
            nyu.a(3, this.f27162e);
        }
        if (this.f27163f != null) {
            nyu.b(4, this.f27163f);
        }
        if (this.f27164g != null) {
            nyu.b(5, this.f27164g);
        }
        if (this.f27165h != null) {
            nyu.b(6, this.f27165h);
        }
        if (this.f27166i != null) {
            nyu.b(7, this.f27166i);
        }
        if (this.f27167j != null) {
            nyu.b(8, this.f27167j);
        }
        if (this.f27173p != null) {
            nyu.a(9, this.f27173p.intValue());
        }
        if (this.f27168k != null) {
            nyu.b(10, this.f27168k);
        }
        if (this.f27171n != null && this.f27171n.length > 0) {
            for (String str : this.f27171n) {
                if (str != null) {
                    nyu.a(11, str);
                }
            }
        }
        if (this.f27172o != null) {
            nyu.a(12, this.f27172o.booleanValue());
        }
        if (this.f27174q != null) {
            nyu.a(13, this.f27174q);
        }
        if (this.f27160c != null) {
            nyu.a(14, this.f27160c);
        }
        if (this.f27170m != null) {
            nyu.b(15, this.f27170m);
        }
        if (this.f27175r != null) {
            nyu.a(16, this.f27175r);
        }
        if (this.f27169l != null) {
            nyu.b(17, this.f27169l);
        }
        if (this.f27176s != null) {
            nyu.a(18, this.f27176s.booleanValue());
        }
        if (this.f27177t != null) {
            nyu.b(19, this.f27177t.longValue());
        }
        if (this.f27178u != null) {
            nyu.b(20, this.f27178u.longValue());
        }
        if (this.f27161d != null) {
            nyu.a(21, this.f27161d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27158a != null) {
            b += nyu.b(1, this.f27158a);
        }
        if (this.f27159b != null) {
            b += nyu.b(2, this.f27159b);
        }
        if (this.f27162e != null) {
            b += nyu.b(3, this.f27162e);
        }
        if (this.f27163f != null) {
            b += nyu.d(4, this.f27163f);
        }
        if (this.f27164g != null) {
            b += nyu.d(5, this.f27164g);
        }
        if (this.f27165h != null) {
            b += nyu.d(6, this.f27165h);
        }
        if (this.f27166i != null) {
            b += nyu.d(7, this.f27166i);
        }
        if (this.f27167j != null) {
            b += nyu.d(8, this.f27167j);
        }
        if (this.f27173p != null) {
            b += nyu.f(9, this.f27173p.intValue());
        }
        if (this.f27168k != null) {
            b += nyu.d(10, this.f27168k);
        }
        if (this.f27171n != null && this.f27171n.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f27171n.length) {
                String str = this.f27171n[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f27172o != null) {
            this.f27172o.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.f27174q != null) {
            b += nyu.b(13, this.f27174q);
        }
        if (this.f27160c != null) {
            b += nyu.b(14, this.f27160c);
        }
        if (this.f27170m != null) {
            b += nyu.d(15, this.f27170m);
        }
        if (this.f27175r != null) {
            b += nyu.b(16, this.f27175r);
        }
        if (this.f27169l != null) {
            b += nyu.d(17, this.f27169l);
        }
        if (this.f27176s != null) {
            this.f27176s.booleanValue();
            b += nyu.h(18) + 1;
        }
        if (this.f27177t != null) {
            b += nyu.f(19, this.f27177t.longValue());
        }
        if (this.f27178u != null) {
            b += nyu.f(20, this.f27178u.longValue());
        }
        if (this.f27161d != null) {
            return b + nyu.b(21, this.f27161d);
        }
        return b;
    }

    private mav m31492b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27158a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f27159b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f27162e = nyt.j();
                    continue;
                case 34:
                    if (this.f27163f == null) {
                        this.f27163f = new lko();
                    }
                    nyt.a(this.f27163f);
                    continue;
                case 42:
                    if (this.f27164g == null) {
                        this.f27164g = new lkx();
                    }
                    nyt.a(this.f27164g);
                    continue;
                case 50:
                    if (this.f27165h == null) {
                        this.f27165h = new lkz();
                    }
                    nyt.a(this.f27165h);
                    continue;
                case 58:
                    if (this.f27166i == null) {
                        this.f27166i = new llc();
                    }
                    nyt.a(this.f27166i);
                    continue;
                case 66:
                    if (this.f27167j == null) {
                        this.f27167j = new llj();
                    }
                    nyt.a(this.f27167j);
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 37:
                        case 42:
                        case 43:
                        case 55:
                        case 58:
                        case 59:
                        case 60:
                            this.f27173p = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 82:
                    if (this.f27168k == null) {
                        this.f27168k = new lkw();
                    }
                    nyt.a(this.f27168k);
                    continue;
                case 90:
                    int b = nzl.b(nyt, 90);
                    a = this.f27171n == null ? 0 : this.f27171n.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27171n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f27171n = obj;
                    continue;
                case 96:
                    this.f27172o = Boolean.valueOf(nyt.i());
                    continue;
                case 106:
                    this.f27174q = nyt.j();
                    continue;
                case 114:
                    this.f27160c = nyt.j();
                    continue;
                case 122:
                    if (this.f27170m == null) {
                        this.f27170m = new lld();
                    }
                    nyt.a(this.f27170m);
                    continue;
                case 130:
                    this.f27175r = nyt.j();
                    continue;
                case 138:
                    if (this.f27169l == null) {
                        this.f27169l = new llf();
                    }
                    nyt.a(this.f27169l);
                    continue;
                case 144:
                    this.f27176s = Boolean.valueOf(nyt.i());
                    continue;
                case 152:
                    this.f27177t = Long.valueOf(nyt.e());
                    continue;
                case 160:
                    this.f27178u = Long.valueOf(nyt.e());
                    continue;
                case 170:
                    this.f27161d = nyt.j();
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
