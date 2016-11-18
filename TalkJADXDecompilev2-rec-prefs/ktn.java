package p000;

public final class ktn extends nyx<ktn> {
    private static volatile ktn[] f23233q;
    public String f23234a;
    public String f23235b;
    public Integer f23236c;
    public ktk f23237d;
    public String f23238e;
    public kuu f23239f;
    public String f23240g;
    public Long f23241h;
    public Long f23242i;
    public String f23243j;
    public String f23244k;
    public ktl f23245l;
    public String f23246m;
    public kuq f23247n;
    public kut[] f23248o;
    public String f23249p;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27470b(nyt);
    }

    public static ktn[] m27471d() {
        if (f23233q == null) {
            synchronized (nzc.c) {
                if (f23233q == null) {
                    f23233q = new ktn[0];
                }
            }
        }
        return f23233q;
    }

    public ktn() {
        m27472g();
    }

    private ktn m27472g() {
        this.f23234a = null;
        this.f23235b = null;
        this.f23237d = null;
        this.f23238e = null;
        this.f23239f = null;
        this.f23240g = null;
        this.f23241h = null;
        this.f23242i = null;
        this.f23243j = null;
        this.f23244k = null;
        this.f23245l = null;
        this.f23246m = null;
        this.f23247n = null;
        this.f23248o = kut.m27616d();
        this.f23249p = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23235b != null) {
            nyu.a(1, this.f23235b);
        }
        if (this.f23240g != null) {
            nyu.a(2, this.f23240g);
        }
        if (this.f23241h != null) {
            nyu.b(3, this.f23241h.longValue());
        }
        if (this.f23243j != null) {
            nyu.a(4, this.f23243j);
        }
        if (this.f23236c != null) {
            nyu.a(5, this.f23236c.intValue());
        }
        if (this.f23245l != null) {
            nyu.b(6, this.f23245l);
        }
        if (this.f23246m != null) {
            nyu.a(7, this.f23246m);
        }
        if (this.f23237d != null) {
            nyu.b(8, this.f23237d);
        }
        if (this.f23247n != null) {
            nyu.b(9, this.f23247n);
        }
        if (this.f23248o != null && this.f23248o.length > 0) {
            for (nzf nzf : this.f23248o) {
                if (nzf != null) {
                    nyu.b(10, nzf);
                }
            }
        }
        if (this.f23242i != null) {
            nyu.b(11, this.f23242i.longValue());
        }
        if (this.f23234a != null) {
            nyu.a(12, this.f23234a);
        }
        if (this.f23238e != null) {
            nyu.a(13, this.f23238e);
        }
        if (this.f23244k != null) {
            nyu.a(14, this.f23244k);
        }
        if (this.f23249p != null) {
            nyu.a(15, this.f23249p);
        }
        if (this.f23239f != null) {
            nyu.b(16, this.f23239f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23235b != null) {
            b += nyu.b(1, this.f23235b);
        }
        if (this.f23240g != null) {
            b += nyu.b(2, this.f23240g);
        }
        if (this.f23241h != null) {
            b += nyu.f(3, this.f23241h.longValue());
        }
        if (this.f23243j != null) {
            b += nyu.b(4, this.f23243j);
        }
        if (this.f23236c != null) {
            b += nyu.f(5, this.f23236c.intValue());
        }
        if (this.f23245l != null) {
            b += nyu.d(6, this.f23245l);
        }
        if (this.f23246m != null) {
            b += nyu.b(7, this.f23246m);
        }
        if (this.f23237d != null) {
            b += nyu.d(8, this.f23237d);
        }
        if (this.f23247n != null) {
            b += nyu.d(9, this.f23247n);
        }
        if (this.f23248o != null && this.f23248o.length > 0) {
            int i = b;
            for (nzf nzf : this.f23248o) {
                if (nzf != null) {
                    i += nyu.d(10, nzf);
                }
            }
            b = i;
        }
        if (this.f23242i != null) {
            b += nyu.f(11, this.f23242i.longValue());
        }
        if (this.f23234a != null) {
            b += nyu.b(12, this.f23234a);
        }
        if (this.f23238e != null) {
            b += nyu.b(13, this.f23238e);
        }
        if (this.f23244k != null) {
            b += nyu.b(14, this.f23244k);
        }
        if (this.f23249p != null) {
            b += nyu.b(15, this.f23249p);
        }
        if (this.f23239f != null) {
            return b + nyu.d(16, this.f23239f);
        }
        return b;
    }

    private ktn m27470b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23235b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23240g = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f23241h = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    this.f23243j = nyt.j();
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f23236c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    if (this.f23245l == null) {
                        this.f23245l = new ktl();
                    }
                    nyt.a(this.f23245l);
                    continue;
                case 58:
                    this.f23246m = nyt.j();
                    continue;
                case 66:
                    if (this.f23237d == null) {
                        this.f23237d = new ktk();
                    }
                    nyt.a(this.f23237d);
                    continue;
                case 74:
                    if (this.f23247n == null) {
                        this.f23247n = new kuq();
                    }
                    nyt.a(this.f23247n);
                    continue;
                case 82:
                    int b = nzl.b(nyt, 82);
                    if (this.f23248o == null) {
                        a = 0;
                    } else {
                        a = this.f23248o.length;
                    }
                    Object obj = new kut[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23248o, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kut();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kut();
                    nyt.a(obj[a]);
                    this.f23248o = obj;
                    continue;
                case 88:
                    this.f23242i = Long.valueOf(nyt.e());
                    continue;
                case 98:
                    this.f23234a = nyt.j();
                    continue;
                case 106:
                    this.f23238e = nyt.j();
                    continue;
                case 114:
                    this.f23244k = nyt.j();
                    continue;
                case 122:
                    this.f23249p = nyt.j();
                    continue;
                case 130:
                    if (this.f23239f == null) {
                        this.f23239f = new kuu();
                    }
                    nyt.a(this.f23239f);
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
