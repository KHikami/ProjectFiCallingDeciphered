package defpackage;

public final class osi extends nyx<osi> {
    public String a;
    public Integer b;
    public Integer c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public Boolean k;
    public Integer l;
    public osj m;
    public String n;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public osi() {
        d();
    }

    private osi d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g);
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        if (this.i != null) {
            nyu.a(9, this.i);
        }
        if (this.j != null) {
            nyu.a(10, this.j);
        }
        if (this.k != null) {
            nyu.a(11, this.k.booleanValue());
        }
        if (this.l != null) {
            nyu.a(12, this.l.intValue());
        }
        if (this.m != null) {
            nyu.b(13, this.m);
        }
        if (this.n != null) {
            nyu.a(14, this.n);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            b += nyu.b(6, this.f);
        }
        if (this.g != null) {
            b += nyu.b(7, this.g);
        }
        if (this.h != null) {
            b += nyu.b(8, this.h);
        }
        if (this.i != null) {
            b += nyu.b(9, this.i);
        }
        if (this.j != null) {
            b += nyu.b(10, this.j);
        }
        if (this.k != null) {
            this.k.booleanValue();
            b += nyu.h(11) + 1;
        }
        if (this.l != null) {
            b += nyu.f(12, this.l.intValue());
        }
        if (this.m != null) {
            b += nyu.d(13, this.m);
        }
        if (this.n != null) {
            return b + nyu.b(14, this.n);
        }
        return b;
    }

    private osi b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 58:
                    this.g = nyt.j();
                    continue;
                case 66:
                    this.h = nyt.j();
                    continue;
                case 74:
                    this.i = nyt.j();
                    continue;
                case 82:
                    this.j = nyt.j();
                    continue;
                case 88:
                    this.k = Boolean.valueOf(nyt.i());
                    continue;
                case 96:
                    this.l = Integer.valueOf(nyt.f());
                    continue;
                case 106:
                    if (this.m == null) {
                        this.m = new osj();
                    }
                    nyt.a(this.m);
                    continue;
                case 114:
                    this.n = nyt.j();
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
