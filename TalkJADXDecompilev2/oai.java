package defpackage;

public final class oai extends nyx<oai> {
    public static final nyy<nzs, oai> a = nyy.a(11, oai.class, 220287618);
    private static final oai[] q = new oai[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public obs g;
    public oby h;
    public String i;
    public String j;
    public Integer k;
    public Integer l;
    public String m;
    public String n;
    public nzs o;
    public nzs p;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oai() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b);
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.f != null) {
            nyu.a(5, this.f);
        }
        if (this.g != null) {
            nyu.b(6, this.g);
        }
        if (this.h != null) {
            nyu.b(7, this.h);
        }
        if (this.i != null) {
            nyu.a(8, this.i);
        }
        if (this.j != null) {
            nyu.a(9, this.j);
        }
        if (this.k != null) {
            nyu.a(10, this.k.intValue());
        }
        if (this.l != null) {
            nyu.a(11, this.l.intValue());
        }
        if (this.m != null) {
            nyu.a(12, this.m);
        }
        if (this.n != null) {
            nyu.a(13, this.n);
        }
        if (this.o != null) {
            nyu.b(14, this.o);
        }
        if (this.p != null) {
            nyu.b(15, this.p);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.b(1, this.b);
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.f != null) {
            b += nyu.b(5, this.f);
        }
        if (this.g != null) {
            b += nyu.d(6, this.g);
        }
        if (this.h != null) {
            b += nyu.d(7, this.h);
        }
        if (this.i != null) {
            b += nyu.b(8, this.i);
        }
        if (this.j != null) {
            b += nyu.b(9, this.j);
        }
        if (this.k != null) {
            b += nyu.f(10, this.k.intValue());
        }
        if (this.l != null) {
            b += nyu.f(11, this.l.intValue());
        }
        if (this.m != null) {
            b += nyu.b(12, this.m);
        }
        if (this.n != null) {
            b += nyu.b(13, this.n);
        }
        if (this.o != null) {
            b += nyu.d(14, this.o);
        }
        if (this.p != null) {
            return b + nyu.d(15, this.p);
        }
        return b;
    }

    private oai b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 34:
                    this.e = nyt.j();
                    continue;
                case 42:
                    this.f = nyt.j();
                    continue;
                case 50:
                    if (this.g == null) {
                        this.g = new obs();
                    }
                    nyt.a(this.g);
                    continue;
                case 58:
                    if (this.h == null) {
                        this.h = new oby();
                    }
                    nyt.a(this.h);
                    continue;
                case 66:
                    this.i = nyt.j();
                    continue;
                case 74:
                    this.j = nyt.j();
                    continue;
                case 80:
                    this.k = Integer.valueOf(nyt.f());
                    continue;
                case 88:
                    this.l = Integer.valueOf(nyt.f());
                    continue;
                case 98:
                    this.m = nyt.j();
                    continue;
                case 106:
                    this.n = nyt.j();
                    continue;
                case 114:
                    if (this.o == null) {
                        this.o = new nzs();
                    }
                    nyt.a(this.o);
                    continue;
                case 122:
                    if (this.p == null) {
                        this.p = new nzs();
                    }
                    nyt.a(this.p);
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
