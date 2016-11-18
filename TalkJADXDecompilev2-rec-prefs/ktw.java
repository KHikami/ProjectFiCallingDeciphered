package p000;

public final class ktw extends nyx<ktw> {
    private static volatile ktw[] f23308o;
    public String f23309a;
    public String f23310b;
    public String f23311c;
    public kzl f23312d;
    public kvp f23313e;
    public ofx f23314f;
    public String f23315g;
    public Long f23316h;
    public Long f23317i;
    public kul f23318j;
    public int f23319k;
    public int f23320l;
    public String f23321m;
    public kvg f23322n;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27511b(nyt);
    }

    public static ktw[] m27512d() {
        if (f23308o == null) {
            synchronized (nzc.c) {
                if (f23308o == null) {
                    f23308o = new ktw[0];
                }
            }
        }
        return f23308o;
    }

    public ktw() {
        this.f23309a = null;
        this.f23310b = null;
        this.f23311c = null;
        this.f23315g = null;
        this.f23316h = null;
        this.f23317i = null;
        this.f23319k = nzf.UNSET_ENUM_VALUE;
        this.f23320l = nzf.UNSET_ENUM_VALUE;
        this.f23321m = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23309a);
        nyu.a(2, this.f23310b);
        nyu.a(3, this.f23315g);
        if (this.f23318j != null) {
            nyu.b(4, this.f23318j);
        }
        if (this.f23319k != nzf.UNSET_ENUM_VALUE) {
            nyu.a(5, this.f23319k);
        }
        if (this.f23320l != nzf.UNSET_ENUM_VALUE) {
            nyu.a(6, this.f23320l);
        }
        if (this.f23321m != null) {
            nyu.a(7, this.f23321m);
        }
        if (this.f23322n != null) {
            nyu.b(8, this.f23322n);
        }
        if (this.f23311c != null) {
            nyu.a(9, this.f23311c);
        }
        if (this.f23316h != null) {
            nyu.b(10, this.f23316h.longValue());
        }
        if (this.f23317i != null) {
            nyu.b(11, this.f23317i.longValue());
        }
        if (this.f23312d != null) {
            nyu.b(12, this.f23312d);
        }
        if (this.f23313e != null) {
            nyu.b(13, this.f23313e);
        }
        if (this.f23314f != null) {
            nyu.b(14, this.f23314f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = ((super.mo147b() + nyu.b(1, this.f23309a)) + nyu.b(2, this.f23310b)) + nyu.b(3, this.f23315g);
        if (this.f23318j != null) {
            b += nyu.d(4, this.f23318j);
        }
        if (this.f23319k != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(5, this.f23319k);
        }
        if (this.f23320l != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(6, this.f23320l);
        }
        if (this.f23321m != null) {
            b += nyu.b(7, this.f23321m);
        }
        if (this.f23322n != null) {
            b += nyu.d(8, this.f23322n);
        }
        if (this.f23311c != null) {
            b += nyu.b(9, this.f23311c);
        }
        if (this.f23316h != null) {
            b += nyu.f(10, this.f23316h.longValue());
        }
        if (this.f23317i != null) {
            b += nyu.f(11, this.f23317i.longValue());
        }
        if (this.f23312d != null) {
            b += nyu.d(12, this.f23312d);
        }
        if (this.f23313e != null) {
            b += nyu.d(13, this.f23313e);
        }
        if (this.f23314f != null) {
            return b + nyu.d(14, this.f23314f);
        }
        return b;
    }

    private ktw m27511b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23309a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23310b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23315g = nyt.j();
                    continue;
                case 34:
                    if (this.f23318j == null) {
                        this.f23318j = new kul();
                    }
                    nyt.a(this.f23318j);
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f23319k = a;
                            break;
                        default:
                            continue;
                    }
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f23320l = a;
                            break;
                        default:
                            continue;
                    }
                case 58:
                    this.f23321m = nyt.j();
                    continue;
                case 66:
                    if (this.f23322n == null) {
                        this.f23322n = new kvg();
                    }
                    nyt.a(this.f23322n);
                    continue;
                case 74:
                    this.f23311c = nyt.j();
                    continue;
                case 80:
                    this.f23316h = Long.valueOf(nyt.e());
                    continue;
                case 88:
                    this.f23317i = Long.valueOf(nyt.e());
                    continue;
                case 98:
                    if (this.f23312d == null) {
                        this.f23312d = new kzl();
                    }
                    nyt.a(this.f23312d);
                    continue;
                case 106:
                    if (this.f23313e == null) {
                        this.f23313e = new kvp();
                    }
                    nyt.a(this.f23313e);
                    continue;
                case 114:
                    if (this.f23314f == null) {
                        this.f23314f = new ofx();
                    }
                    nyt.a(this.f23314f);
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
