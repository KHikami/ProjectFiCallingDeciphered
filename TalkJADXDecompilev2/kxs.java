package defpackage;

public final class kxs extends nyx<kxs> {
    private static volatile kxs[] D;
    public ofv A;
    public kyk B;
    public kyz C;
    public String a;
    public String b;
    public kxh c;
    public String d;
    public kzg e;
    public Long f;
    public String g;
    public String h;
    public kxa i;
    public String j;
    public String k;
    public Boolean l;
    public Boolean m;
    public String n;
    public Boolean o;
    public Boolean p;
    public Long q;
    public kva r;
    public String s;
    public Boolean t;
    public String u;
    public kys v;
    public Integer w;
    public Boolean x;
    public kym y;
    public Integer z;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kxs[] d() {
        if (D == null) {
            synchronized (nzc.c) {
                if (D == null) {
                    D = new kxs[0];
                }
            }
        }
        return D;
    }

    public kxs() {
        g();
    }

    private kxs g() {
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
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.x = null;
        this.y = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(2, this.a);
        nyu.a(3, this.b);
        nyu.b(4, this.f.longValue());
        nyu.a(5, this.g);
        if (this.h != null) {
            nyu.a(6, this.h);
        }
        nyu.a(7, this.j);
        nyu.a(8, this.k);
        nyu.a(9, this.l.booleanValue());
        nyu.a(10, this.m.booleanValue());
        if (this.n != null) {
            nyu.a(11, this.n);
        }
        nyu.a(12, this.o.booleanValue());
        if (this.p != null) {
            nyu.a(13, this.p.booleanValue());
        }
        if (this.q != null) {
            nyu.b(15, this.q.longValue());
        }
        if (this.r != null) {
            nyu.b(16, this.r);
        }
        if (this.s != null) {
            nyu.a(17, this.s);
        }
        if (this.t != null) {
            nyu.a(18, this.t.booleanValue());
        }
        if (this.c != null) {
            nyu.b(19, this.c);
        }
        if (this.i != null) {
            nyu.b(20, this.i);
        }
        if (this.u != null) {
            nyu.a(21, this.u);
        }
        if (this.v != null) {
            nyu.b(22, this.v);
        }
        if (this.w != null) {
            nyu.a(23, this.w.intValue());
        }
        if (this.x != null) {
            nyu.a(24, this.x.booleanValue());
        }
        if (this.d != null) {
            nyu.a(25, this.d);
        }
        if (this.y != null) {
            nyu.b(26, this.y);
        }
        if (this.e != null) {
            nyu.b(27, this.e);
        }
        if (this.A != null) {
            nyu.b(28, this.A);
        }
        if (this.B != null) {
            nyu.b(29, this.B);
        }
        if (this.z != null) {
            nyu.a(30, this.z.intValue());
        }
        if (this.C != null) {
            nyu.b(31, this.C);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = (((super.b() + nyu.b(2, this.a)) + nyu.b(3, this.b)) + nyu.f(4, this.f.longValue())) + nyu.b(5, this.g);
        if (this.h != null) {
            b += nyu.b(6, this.h);
        }
        b = (b + nyu.b(7, this.j)) + nyu.b(8, this.k);
        this.l.booleanValue();
        b += nyu.h(9) + 1;
        this.m.booleanValue();
        b += nyu.h(10) + 1;
        if (this.n != null) {
            b += nyu.b(11, this.n);
        }
        this.o.booleanValue();
        b += nyu.h(12) + 1;
        if (this.p != null) {
            this.p.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.q != null) {
            b += nyu.f(15, this.q.longValue());
        }
        if (this.r != null) {
            b += nyu.d(16, this.r);
        }
        if (this.s != null) {
            b += nyu.b(17, this.s);
        }
        if (this.t != null) {
            this.t.booleanValue();
            b += nyu.h(18) + 1;
        }
        if (this.c != null) {
            b += nyu.d(19, this.c);
        }
        if (this.i != null) {
            b += nyu.d(20, this.i);
        }
        if (this.u != null) {
            b += nyu.b(21, this.u);
        }
        if (this.v != null) {
            b += nyu.d(22, this.v);
        }
        if (this.w != null) {
            b += nyu.f(23, this.w.intValue());
        }
        if (this.x != null) {
            this.x.booleanValue();
            b += nyu.h(24) + 1;
        }
        if (this.d != null) {
            b += nyu.b(25, this.d);
        }
        if (this.y != null) {
            b += nyu.d(26, this.y);
        }
        if (this.e != null) {
            b += nyu.d(27, this.e);
        }
        if (this.A != null) {
            b += nyu.d(28, this.A);
        }
        if (this.B != null) {
            b += nyu.d(29, this.B);
        }
        if (this.z != null) {
            b += nyu.f(30, this.z.intValue());
        }
        if (this.C != null) {
            return b + nyu.d(31, this.C);
        }
        return b;
    }

    private kxs b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    this.a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.b = nyt.j();
                    continue;
                case 32:
                    this.f = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    this.g = nyt.j();
                    continue;
                case 50:
                    this.h = nyt.j();
                    continue;
                case 58:
                    this.j = nyt.j();
                    continue;
                case 66:
                    this.k = nyt.j();
                    continue;
                case 72:
                    this.l = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    this.m = Boolean.valueOf(nyt.i());
                    continue;
                case 90:
                    this.n = nyt.j();
                    continue;
                case 96:
                    this.o = Boolean.valueOf(nyt.i());
                    continue;
                case 104:
                    this.p = Boolean.valueOf(nyt.i());
                    continue;
                case 120:
                    this.q = Long.valueOf(nyt.e());
                    continue;
                case 130:
                    if (this.r == null) {
                        this.r = new kva();
                    }
                    nyt.a(this.r);
                    continue;
                case 138:
                    this.s = nyt.j();
                    continue;
                case 144:
                    this.t = Boolean.valueOf(nyt.i());
                    continue;
                case 154:
                    if (this.c == null) {
                        this.c = new kxh();
                    }
                    nyt.a(this.c);
                    continue;
                case 162:
                    if (this.i == null) {
                        this.i = new kxa();
                    }
                    nyt.a(this.i);
                    continue;
                case 170:
                    this.u = nyt.j();
                    continue;
                case 178:
                    if (this.v == null) {
                        this.v = new kys();
                    }
                    nyt.a(this.v);
                    continue;
                case 184:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.w = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 192:
                    this.x = Boolean.valueOf(nyt.i());
                    continue;
                case 202:
                    this.d = nyt.j();
                    continue;
                case 210:
                    if (this.y == null) {
                        this.y = new kym();
                    }
                    nyt.a(this.y);
                    continue;
                case 218:
                    if (this.e == null) {
                        this.e = new kzg();
                    }
                    nyt.a(this.e);
                    continue;
                case 226:
                    if (this.A == null) {
                        this.A = new ofv();
                    }
                    nyt.a(this.A);
                    continue;
                case 234:
                    if (this.B == null) {
                        this.B = new kyk();
                    }
                    nyt.a(this.B);
                    continue;
                case 240:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.z = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 250:
                    if (this.C == null) {
                        this.C = new kyz();
                    }
                    nyt.a(this.C);
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
