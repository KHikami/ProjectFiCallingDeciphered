package defpackage;

public final class krx extends nyx<krx> {
    private static volatile krx[] q;
    public String a;
    public String b;
    public int c;
    public kru d;
    public String e;
    public kti f;
    public String g;
    public Long h;
    public Long i;
    public String j;
    public String k;
    public krv l;
    public String m;
    public ksz n;
    public ktc[] o;
    public String p;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static krx[] d() {
        if (q == null) {
            synchronized (nzc.c) {
                if (q == null) {
                    q = new krx[0];
                }
            }
        }
        return q;
    }

    public krx() {
        this.a = null;
        this.b = null;
        this.c = nzf.UNSET_ENUM_VALUE;
        this.e = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.m = null;
        this.o = ktc.d();
        this.p = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b);
        }
        if (this.g != null) {
            nyu.a(2, this.g);
        }
        if (this.h != null) {
            nyu.b(3, this.h.longValue());
        }
        if (this.j != null) {
            nyu.a(4, this.j);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(5, this.c);
        }
        if (this.l != null) {
            nyu.b(6, this.l);
        }
        if (this.m != null) {
            nyu.a(7, this.m);
        }
        if (this.d != null) {
            nyu.b(8, this.d);
        }
        if (this.n != null) {
            nyu.b(9, this.n);
        }
        if (this.o != null && this.o.length > 0) {
            for (nzf nzf : this.o) {
                if (nzf != null) {
                    nyu.b(10, nzf);
                }
            }
        }
        if (this.i != null) {
            nyu.b(11, this.i.longValue());
        }
        if (this.a != null) {
            nyu.a(12, this.a);
        }
        if (this.e != null) {
            nyu.a(13, this.e);
        }
        if (this.k != null) {
            nyu.a(14, this.k);
        }
        if (this.p != null) {
            nyu.a(15, this.p);
        }
        if (this.f != null) {
            nyu.b(16, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.b(1, this.b);
        }
        if (this.g != null) {
            b += nyu.b(2, this.g);
        }
        if (this.h != null) {
            b += nyu.f(3, this.h.longValue());
        }
        if (this.j != null) {
            b += nyu.b(4, this.j);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(5, this.c);
        }
        if (this.l != null) {
            b += nyu.d(6, this.l);
        }
        if (this.m != null) {
            b += nyu.b(7, this.m);
        }
        if (this.d != null) {
            b += nyu.d(8, this.d);
        }
        if (this.n != null) {
            b += nyu.d(9, this.n);
        }
        if (this.o != null && this.o.length > 0) {
            int i = b;
            for (nzf nzf : this.o) {
                if (nzf != null) {
                    i += nyu.d(10, nzf);
                }
            }
            b = i;
        }
        if (this.i != null) {
            b += nyu.f(11, this.i.longValue());
        }
        if (this.a != null) {
            b += nyu.b(12, this.a);
        }
        if (this.e != null) {
            b += nyu.b(13, this.e);
        }
        if (this.k != null) {
            b += nyu.b(14, this.k);
        }
        if (this.p != null) {
            b += nyu.b(15, this.p);
        }
        if (this.f != null) {
            return b + nyu.d(16, this.f);
        }
        return b;
    }

    private krx b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.g = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.h = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    this.j = nyt.j();
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.c = a;
                            break;
                        default:
                            continue;
                    }
                case 50:
                    if (this.l == null) {
                        this.l = new krv();
                    }
                    nyt.a(this.l);
                    continue;
                case 58:
                    this.m = nyt.j();
                    continue;
                case 66:
                    if (this.d == null) {
                        this.d = new kru();
                    }
                    nyt.a(this.d);
                    continue;
                case 74:
                    if (this.n == null) {
                        this.n = new ksz();
                    }
                    nyt.a(this.n);
                    continue;
                case 82:
                    int b = nzl.b(nyt, 82);
                    if (this.o == null) {
                        a = 0;
                    } else {
                        a = this.o.length;
                    }
                    Object obj = new ktc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.o, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ktc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ktc();
                    nyt.a(obj[a]);
                    this.o = obj;
                    continue;
                case 88:
                    this.i = Long.valueOf(nyt.e());
                    continue;
                case 98:
                    this.a = nyt.j();
                    continue;
                case 106:
                    this.e = nyt.j();
                    continue;
                case 114:
                    this.k = nyt.j();
                    continue;
                case 122:
                    this.p = nyt.j();
                    continue;
                case 130:
                    if (this.f == null) {
                        this.f = new kti();
                    }
                    nyt.a(this.f);
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
