package defpackage;

public final class oby extends nyx<oby> {
    public static final nyy<nzs, oby> a = nyy.a(11, oby.class, 214463250);
    private static final oby[] r = new oby[0];
    public String b;
    public String c;
    public String d;
    public oca e;
    public obw f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public nzs l;
    public nzs m;
    public String n;
    public String o;
    public Boolean p;
    public String q;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oby() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
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
            nyu.b(4, this.e);
        }
        if (this.f != null) {
            nyu.b(5, this.f);
        }
        if (this.g != null) {
            nyu.a(6, this.g);
        }
        if (this.h != null) {
            nyu.a(7, this.h);
        }
        if (this.i != null) {
            nyu.a(8, this.i);
        }
        if (this.j != null) {
            nyu.a(9, this.j);
        }
        if (this.k != null) {
            nyu.a(10, this.k);
        }
        if (this.l != null) {
            nyu.b(11, this.l);
        }
        if (this.m != null) {
            nyu.b(12, this.m);
        }
        if (this.n != null) {
            nyu.a(13, this.n);
        }
        if (this.o != null) {
            nyu.a(14, this.o);
        }
        if (this.p != null) {
            nyu.a(15, this.p.booleanValue());
        }
        if (this.q != null) {
            nyu.a(16, this.q);
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
            b += nyu.d(4, this.e);
        }
        if (this.f != null) {
            b += nyu.d(5, this.f);
        }
        if (this.g != null) {
            b += nyu.b(6, this.g);
        }
        if (this.h != null) {
            b += nyu.b(7, this.h);
        }
        if (this.i != null) {
            b += nyu.b(8, this.i);
        }
        if (this.j != null) {
            b += nyu.b(9, this.j);
        }
        if (this.k != null) {
            b += nyu.b(10, this.k);
        }
        if (this.l != null) {
            b += nyu.d(11, this.l);
        }
        if (this.m != null) {
            b += nyu.d(12, this.m);
        }
        if (this.n != null) {
            b += nyu.b(13, this.n);
        }
        if (this.o != null) {
            b += nyu.b(14, this.o);
        }
        if (this.p != null) {
            this.p.booleanValue();
            b += nyu.h(15) + 1;
        }
        if (this.q != null) {
            return b + nyu.b(16, this.q);
        }
        return b;
    }

    private oby b(nyt nyt) {
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
                    if (this.e == null) {
                        this.e = new oca();
                    }
                    nyt.a(this.e);
                    continue;
                case 42:
                    if (this.f == null) {
                        this.f = new obw();
                    }
                    nyt.a(this.f);
                    continue;
                case 50:
                    this.g = nyt.j();
                    continue;
                case 58:
                    this.h = nyt.j();
                    continue;
                case 66:
                    this.i = nyt.j();
                    continue;
                case 74:
                    this.j = nyt.j();
                    continue;
                case 82:
                    this.k = nyt.j();
                    continue;
                case 90:
                    if (this.l == null) {
                        this.l = new nzs();
                    }
                    nyt.a(this.l);
                    continue;
                case 98:
                    if (this.m == null) {
                        this.m = new nzs();
                    }
                    nyt.a(this.m);
                    continue;
                case 106:
                    this.n = nyt.j();
                    continue;
                case 114:
                    this.o = nyt.j();
                    continue;
                case 120:
                    this.p = Boolean.valueOf(nyt.i());
                    continue;
                case 130:
                    this.q = nyt.j();
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
