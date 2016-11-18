package p000;

public final class krx extends nyx<krx> {
    private static volatile krx[] f22941q;
    public String f22942a;
    public String f22943b;
    public int f22944c;
    public kru f22945d;
    public String f22946e;
    public kti f22947f;
    public String f22948g;
    public Long f22949h;
    public Long f22950i;
    public String f22951j;
    public String f22952k;
    public krv f22953l;
    public String f22954m;
    public ksz f22955n;
    public ktc[] f22956o;
    public String f22957p;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27258b(nyt);
    }

    public static krx[] m27259d() {
        if (f22941q == null) {
            synchronized (nzc.c) {
                if (f22941q == null) {
                    f22941q = new krx[0];
                }
            }
        }
        return f22941q;
    }

    public krx() {
        this.f22942a = null;
        this.f22943b = null;
        this.f22944c = nzf.UNSET_ENUM_VALUE;
        this.f22946e = null;
        this.f22948g = null;
        this.f22949h = null;
        this.f22950i = null;
        this.f22951j = null;
        this.f22952k = null;
        this.f22954m = null;
        this.f22956o = ktc.m27414d();
        this.f22957p = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22943b != null) {
            nyu.a(1, this.f22943b);
        }
        if (this.f22948g != null) {
            nyu.a(2, this.f22948g);
        }
        if (this.f22949h != null) {
            nyu.b(3, this.f22949h.longValue());
        }
        if (this.f22951j != null) {
            nyu.a(4, this.f22951j);
        }
        if (this.f22944c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(5, this.f22944c);
        }
        if (this.f22953l != null) {
            nyu.b(6, this.f22953l);
        }
        if (this.f22954m != null) {
            nyu.a(7, this.f22954m);
        }
        if (this.f22945d != null) {
            nyu.b(8, this.f22945d);
        }
        if (this.f22955n != null) {
            nyu.b(9, this.f22955n);
        }
        if (this.f22956o != null && this.f22956o.length > 0) {
            for (nzf nzf : this.f22956o) {
                if (nzf != null) {
                    nyu.b(10, nzf);
                }
            }
        }
        if (this.f22950i != null) {
            nyu.b(11, this.f22950i.longValue());
        }
        if (this.f22942a != null) {
            nyu.a(12, this.f22942a);
        }
        if (this.f22946e != null) {
            nyu.a(13, this.f22946e);
        }
        if (this.f22952k != null) {
            nyu.a(14, this.f22952k);
        }
        if (this.f22957p != null) {
            nyu.a(15, this.f22957p);
        }
        if (this.f22947f != null) {
            nyu.b(16, this.f22947f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22943b != null) {
            b += nyu.b(1, this.f22943b);
        }
        if (this.f22948g != null) {
            b += nyu.b(2, this.f22948g);
        }
        if (this.f22949h != null) {
            b += nyu.f(3, this.f22949h.longValue());
        }
        if (this.f22951j != null) {
            b += nyu.b(4, this.f22951j);
        }
        if (this.f22944c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(5, this.f22944c);
        }
        if (this.f22953l != null) {
            b += nyu.d(6, this.f22953l);
        }
        if (this.f22954m != null) {
            b += nyu.b(7, this.f22954m);
        }
        if (this.f22945d != null) {
            b += nyu.d(8, this.f22945d);
        }
        if (this.f22955n != null) {
            b += nyu.d(9, this.f22955n);
        }
        if (this.f22956o != null && this.f22956o.length > 0) {
            int i = b;
            for (nzf nzf : this.f22956o) {
                if (nzf != null) {
                    i += nyu.d(10, nzf);
                }
            }
            b = i;
        }
        if (this.f22950i != null) {
            b += nyu.f(11, this.f22950i.longValue());
        }
        if (this.f22942a != null) {
            b += nyu.b(12, this.f22942a);
        }
        if (this.f22946e != null) {
            b += nyu.b(13, this.f22946e);
        }
        if (this.f22952k != null) {
            b += nyu.b(14, this.f22952k);
        }
        if (this.f22957p != null) {
            b += nyu.b(15, this.f22957p);
        }
        if (this.f22947f != null) {
            return b + nyu.d(16, this.f22947f);
        }
        return b;
    }

    private krx m27258b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22943b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22948g = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f22949h = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    this.f22951j = nyt.j();
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f22944c = a;
                            break;
                        default:
                            continue;
                    }
                case 50:
                    if (this.f22953l == null) {
                        this.f22953l = new krv();
                    }
                    nyt.a(this.f22953l);
                    continue;
                case 58:
                    this.f22954m = nyt.j();
                    continue;
                case 66:
                    if (this.f22945d == null) {
                        this.f22945d = new kru();
                    }
                    nyt.a(this.f22945d);
                    continue;
                case 74:
                    if (this.f22955n == null) {
                        this.f22955n = new ksz();
                    }
                    nyt.a(this.f22955n);
                    continue;
                case 82:
                    int b = nzl.b(nyt, 82);
                    if (this.f22956o == null) {
                        a = 0;
                    } else {
                        a = this.f22956o.length;
                    }
                    Object obj = new ktc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22956o, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ktc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ktc();
                    nyt.a(obj[a]);
                    this.f22956o = obj;
                    continue;
                case 88:
                    this.f22950i = Long.valueOf(nyt.e());
                    continue;
                case 98:
                    this.f22942a = nyt.j();
                    continue;
                case 106:
                    this.f22946e = nyt.j();
                    continue;
                case 114:
                    this.f22952k = nyt.j();
                    continue;
                case 122:
                    this.f22957p = nyt.j();
                    continue;
                case 130:
                    if (this.f22947f == null) {
                        this.f22947f = new kti();
                    }
                    nyt.a(this.f22947f);
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
