package defpackage;

public final class oho extends nyx<oho> {
    public String a;
    public int b;
    public ohc c;
    public ohg d;
    public String e;
    public String f;
    public byte[] g;
    public Long h;
    public Long i;
    public nzi j;
    public nzi k;
    public nzi l;
    public Long m;
    public nzi n;
    public Long o;
    public String p;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oho() {
        this.a = null;
        this.b = nzf.UNSET_ENUM_VALUE;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.m = null;
        this.o = null;
        this.p = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        if (this.f != null) {
            nyu.a(3, this.f);
        }
        if (this.g != null) {
            nyu.a(5, this.g);
        }
        if (this.e != null) {
            nyu.a(6, this.e);
        }
        if (this.c != null) {
            nyu.b(7, this.c);
        }
        if (this.d != null) {
            nyu.b(8, this.d);
        }
        if (this.h != null) {
            nyu.b(9, this.h.longValue());
        }
        if (this.o != null) {
            nyu.b(10, this.o.longValue());
        }
        if (this.i != null) {
            nyu.b(11, this.i.longValue());
        }
        if (this.p != null) {
            nyu.a(12, this.p);
        }
        if (this.m != null) {
            nyu.b(13, this.m.longValue());
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(15, this.b);
        }
        if (this.j != null) {
            nyu.b(18, this.j);
        }
        if (this.k != null) {
            nyu.b(19, this.k);
        }
        if (this.l != null) {
            nyu.b(20, this.l);
        }
        if (this.n != null) {
            nyu.b(21, this.n);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b() + nyu.b(1, this.a);
        if (this.f != null) {
            b += nyu.b(3, this.f);
        }
        if (this.g != null) {
            b += nyu.b(5, this.g);
        }
        if (this.e != null) {
            b += nyu.b(6, this.e);
        }
        if (this.c != null) {
            b += nyu.d(7, this.c);
        }
        if (this.d != null) {
            b += nyu.d(8, this.d);
        }
        if (this.h != null) {
            b += nyu.f(9, this.h.longValue());
        }
        if (this.o != null) {
            b += nyu.f(10, this.o.longValue());
        }
        if (this.i != null) {
            b += nyu.f(11, this.i.longValue());
        }
        if (this.p != null) {
            b += nyu.b(12, this.p);
        }
        if (this.m != null) {
            b += nyu.f(13, this.m.longValue());
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(15, this.b);
        }
        if (this.j != null) {
            b += nyu.d(18, this.j);
        }
        if (this.k != null) {
            b += nyu.d(19, this.k);
        }
        if (this.l != null) {
            b += nyu.d(20, this.l);
        }
        if (this.n != null) {
            return b + nyu.d(21, this.n);
        }
        return b;
    }

    private oho b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f = nyt.j();
                    continue;
                case 42:
                    this.g = nyt.k();
                    continue;
                case 50:
                    this.e = nyt.j();
                    continue;
                case 58:
                    if (this.c == null) {
                        this.c = new ohc();
                    }
                    nyt.a(this.c);
                    continue;
                case 66:
                    if (this.d == null) {
                        this.d = new ohg();
                    }
                    nyt.a(this.d);
                    continue;
                case 72:
                    this.h = Long.valueOf(nyt.e());
                    continue;
                case 80:
                    this.o = Long.valueOf(nyt.e());
                    continue;
                case 88:
                    this.i = Long.valueOf(nyt.e());
                    continue;
                case 98:
                    this.p = nyt.j();
                    continue;
                case 104:
                    this.m = Long.valueOf(nyt.e());
                    continue;
                case 120:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 11:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case 146:
                    if (this.j == null) {
                        this.j = new nzi();
                    }
                    nyt.a(this.j);
                    continue;
                case 154:
                    if (this.k == null) {
                        this.k = new nzi();
                    }
                    nyt.a(this.k);
                    continue;
                case 162:
                    if (this.l == null) {
                        this.l = new nzi();
                    }
                    nyt.a(this.l);
                    continue;
                case 170:
                    if (this.n == null) {
                        this.n = new nzi();
                    }
                    nyt.a(this.n);
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
