import com.google.api.client.http.HttpStatusCodes;

public final class kza extends nyx<kza> {
    public Integer A;
    public kyb B;
    public Integer C;
    public kzi D;
    public kyy E;
    public kzj F;
    public Boolean G;
    public kzd H;
    public kzc I;
    public Boolean J;
    public Boolean K;
    public Integer L;
    public Integer a;
    public Integer b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Integer h;
    public Integer i;
    public String j;
    public String k;
    public kyd[] l;
    public Integer m;
    public kye n;
    public kwr o;
    public kyp p;
    public Boolean q;
    public Integer r;
    public kzb[] s;
    public Long t;
    public Boolean u;
    public Integer v;
    public Integer w;
    public Integer x;
    public Boolean y;
    public Integer z;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kza() {
        d();
    }

    private kza d() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = kyd.d();
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.s = kzb.d();
        this.t = null;
        this.u = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.a.intValue());
        nyu.a(2, this.b.intValue());
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.h != null) {
            nyu.a(6, this.h.intValue());
        }
        if (this.j != null) {
            nyu.a(7, this.j);
        }
        if (this.k != null) {
            nyu.a(8, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            for (nzf nzf : this.l) {
                if (nzf != null) {
                    nyu.b(9, nzf);
                }
            }
        }
        if (this.m != null) {
            nyu.a(10, this.m.intValue());
        }
        if (this.n != null) {
            nyu.b(11, this.n);
        }
        if (this.o != null) {
            nyu.b(12, this.o);
        }
        if (this.p != null) {
            nyu.b(13, this.p);
        }
        if (this.q != null) {
            nyu.a(14, this.q.booleanValue());
        }
        if (this.r != null) {
            nyu.a(15, this.r.intValue());
        }
        if (this.s != null && this.s.length > 0) {
            while (i < this.s.length) {
                nzf nzf2 = this.s[i];
                if (nzf2 != null) {
                    nyu.b(16, nzf2);
                }
                i++;
            }
        }
        if (this.t != null) {
            nyu.b(17, this.t.longValue());
        }
        if (this.u != null) {
            nyu.a(18, this.u.booleanValue());
        }
        if (this.v != null) {
            nyu.a(19, this.v.intValue());
        }
        if (this.w != null) {
            nyu.a(20, this.w.intValue());
        }
        if (this.z != null) {
            nyu.a(21, this.z.intValue());
        }
        if (this.A != null) {
            nyu.a(22, this.A.intValue());
        }
        if (this.B != null) {
            nyu.b(23, this.B);
        }
        if (this.C != null) {
            nyu.a(24, this.C.intValue());
        }
        if (this.D != null) {
            nyu.b(25, this.D);
        }
        if (this.E != null) {
            nyu.b(26, this.E);
        }
        if (this.F != null) {
            nyu.b(27, this.F);
        }
        if (this.f != null) {
            nyu.a(28, this.f);
        }
        if (this.y != null) {
            nyu.a(29, this.y.booleanValue());
        }
        if (this.i != null) {
            nyu.a(30, this.i.intValue());
        }
        if (this.x != null) {
            nyu.a(31, this.x.intValue());
        }
        if (this.G != null) {
            nyu.a(32, this.G.booleanValue());
        }
        if (this.H != null) {
            nyu.b(33, this.H);
        }
        if (this.g != null) {
            nyu.a(34, this.g);
        }
        if (this.I != null) {
            nyu.b(35, this.I);
        }
        if (this.J != null) {
            nyu.a(36, this.J.booleanValue());
        }
        if (this.K != null) {
            nyu.a(37, this.K.booleanValue());
        }
        if (this.L != null) {
            nyu.a(38, this.L.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = (super.b() + nyu.f(1, this.a.intValue())) + nyu.f(2, this.b.intValue());
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.h != null) {
            b += nyu.f(6, this.h.intValue());
        }
        if (this.j != null) {
            b += nyu.b(7, this.j);
        }
        if (this.k != null) {
            b += nyu.b(8, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            int i2 = b;
            for (nzf nzf : this.l) {
                if (nzf != null) {
                    i2 += nyu.d(9, nzf);
                }
            }
            b = i2;
        }
        if (this.m != null) {
            b += nyu.f(10, this.m.intValue());
        }
        if (this.n != null) {
            b += nyu.d(11, this.n);
        }
        if (this.o != null) {
            b += nyu.d(12, this.o);
        }
        if (this.p != null) {
            b += nyu.d(13, this.p);
        }
        if (this.q != null) {
            this.q.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.r != null) {
            b += nyu.f(15, this.r.intValue());
        }
        if (this.s != null && this.s.length > 0) {
            while (i < this.s.length) {
                nzf nzf2 = this.s[i];
                if (nzf2 != null) {
                    b += nyu.d(16, nzf2);
                }
                i++;
            }
        }
        if (this.t != null) {
            b += nyu.f(17, this.t.longValue());
        }
        if (this.u != null) {
            this.u.booleanValue();
            b += nyu.h(18) + 1;
        }
        if (this.v != null) {
            b += nyu.f(19, this.v.intValue());
        }
        if (this.w != null) {
            b += nyu.f(20, this.w.intValue());
        }
        if (this.z != null) {
            b += nyu.f(21, this.z.intValue());
        }
        if (this.A != null) {
            b += nyu.f(22, this.A.intValue());
        }
        if (this.B != null) {
            b += nyu.d(23, this.B);
        }
        if (this.C != null) {
            b += nyu.f(24, this.C.intValue());
        }
        if (this.D != null) {
            b += nyu.d(25, this.D);
        }
        if (this.E != null) {
            b += nyu.d(26, this.E);
        }
        if (this.F != null) {
            b += nyu.d(27, this.F);
        }
        if (this.f != null) {
            b += nyu.b(28, this.f);
        }
        if (this.y != null) {
            this.y.booleanValue();
            b += nyu.h(29) + 1;
        }
        if (this.i != null) {
            b += nyu.f(30, this.i.intValue());
        }
        if (this.x != null) {
            b += nyu.f(31, this.x.intValue());
        }
        if (this.G != null) {
            this.G.booleanValue();
            b += nyu.h(32) + 1;
        }
        if (this.H != null) {
            b += nyu.d(33, this.H);
        }
        if (this.g != null) {
            b += nyu.b(34, this.g);
        }
        if (this.I != null) {
            b += nyu.d(35, this.I);
        }
        if (this.J != null) {
            this.J.booleanValue();
            b += nyu.h(36) + 1;
        }
        if (this.K != null) {
            this.K.booleanValue();
            b += nyu.h(37) + 1;
        }
        if (this.L != null) {
            return b + nyu.f(38, this.L.intValue());
        }
        return b;
    }

    private kza b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                        case wi.q /*7*/:
                        case wi.m /*8*/:
                        case wi.n /*9*/:
                        case wi.dr /*10*/:
                        case wi.dB /*11*/:
                        case wi.dM /*12*/:
                        case wi.dD /*13*/:
                        case wi.g /*14*/:
                        case wi.dJ /*15*/:
                        case wi.dI /*16*/:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case wi.k /*20*/:
                        case wi.f /*21*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dI /*16*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 48:
                    this.h = Integer.valueOf(nyt.f());
                    continue;
                case 58:
                    this.j = nyt.j();
                    continue;
                case 66:
                    this.k = nyt.j();
                    continue;
                case 74:
                    b = nzl.b(nyt, 74);
                    if (this.l == null) {
                        a = 0;
                    } else {
                        a = this.l.length;
                    }
                    obj = new kyd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kyd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kyd();
                    nyt.a(obj[a]);
                    this.l = obj;
                    continue;
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                            this.m = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 90:
                    if (this.n == null) {
                        this.n = new kye();
                    }
                    nyt.a(this.n);
                    continue;
                case 98:
                    if (this.o == null) {
                        this.o = new kwr();
                    }
                    nyt.a(this.o);
                    continue;
                case 106:
                    if (this.p == null) {
                        this.p = new kyp();
                    }
                    nyt.a(this.p);
                    continue;
                case 112:
                    this.q = Boolean.valueOf(nyt.i());
                    continue;
                case 120:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.r = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 130:
                    b = nzl.b(nyt, 130);
                    if (this.s == null) {
                        a = 0;
                    } else {
                        a = this.s.length;
                    }
                    obj = new kzb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.s, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kzb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kzb();
                    nyt.a(obj[a]);
                    this.s = obj;
                    continue;
                case 136:
                    this.t = Long.valueOf(nyt.e());
                    continue;
                case 144:
                    this.u = Boolean.valueOf(nyt.i());
                    continue;
                case 152:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.v = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 160:
                    this.w = Integer.valueOf(nyt.f());
                    continue;
                case 168:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                            this.z = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 176:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                            this.A = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 186:
                    if (this.B == null) {
                        this.B = new kyb();
                    }
                    nyt.a(this.B);
                    continue;
                case 192:
                    this.C = Integer.valueOf(nyt.f());
                    continue;
                case 202:
                    if (this.D == null) {
                        this.D = new kzi();
                    }
                    nyt.a(this.D);
                    continue;
                case 210:
                    if (this.E == null) {
                        this.E = new kyy();
                    }
                    nyt.a(this.E);
                    continue;
                case 218:
                    if (this.F == null) {
                        this.F = new kzj();
                    }
                    nyt.a(this.F);
                    continue;
                case 226:
                    this.f = nyt.j();
                    continue;
                case 232:
                    this.y = Boolean.valueOf(nyt.i());
                    continue;
                case 240:
                    this.i = Integer.valueOf(nyt.f());
                    continue;
                case 248:
                    this.x = Integer.valueOf(nyt.f());
                    continue;
                case 256:
                    this.G = Boolean.valueOf(nyt.i());
                    continue;
                case 266:
                    if (this.H == null) {
                        this.H = new kzd();
                    }
                    nyt.a(this.H);
                    continue;
                case 274:
                    this.g = nyt.j();
                    continue;
                case 282:
                    if (this.I == null) {
                        this.I = new kzc();
                    }
                    nyt.a(this.I);
                    continue;
                case 288:
                    this.J = Boolean.valueOf(nyt.i());
                    continue;
                case 296:
                    this.K = Boolean.valueOf(nyt.i());
                    continue;
                case HttpStatusCodes.STATUS_CODE_NOT_MODIFIED /*304*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.L = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
