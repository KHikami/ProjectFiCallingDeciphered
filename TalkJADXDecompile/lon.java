public final class lon extends nyx<lon> {
    public Integer a;
    public Long b;
    public Integer c;
    public int[] d;
    public ltr e;
    public lsn f;
    public lxf g;
    public Long h;
    public Long i;
    public Long j;
    public Integer k;
    public Boolean l;
    public loo[] m;
    public Integer n;
    public lwt o;
    public Boolean p;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lon() {
        d();
    }

    private lon d() {
        this.b = null;
        this.d = nzl.a;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.l = null;
        this.m = loo.d();
        this.o = null;
        this.p = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.b != null) {
            nyu.a(2, this.b.longValue());
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.a != null) {
            nyu.a(8, this.a.intValue());
        }
        if (this.c != null) {
            nyu.a(9, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (int a : this.d) {
                nyu.a(10, a);
            }
        }
        if (this.e != null) {
            nyu.b(11, this.e);
        }
        if (this.h != null) {
            nyu.a(12, this.h.longValue());
        }
        if (this.j != null) {
            nyu.a(13, this.j.longValue());
        }
        if (this.i != null) {
            nyu.a(14, this.i.longValue());
        }
        if (this.k != null) {
            nyu.a(15, this.k.intValue());
        }
        if (this.l != null) {
            nyu.a(16, this.l.booleanValue());
        }
        if (this.m != null && this.m.length > 0) {
            while (i < this.m.length) {
                nzf nzf = this.m[i];
                if (nzf != null) {
                    nyu.b(17, nzf);
                }
                i++;
            }
        }
        if (this.n != null) {
            nyu.a(18, this.n.intValue());
        }
        if (this.f != null) {
            nyu.b(19, this.f);
        }
        if (this.o != null) {
            nyu.b(20, this.o);
        }
        if (this.p != null) {
            nyu.a(21, this.p.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.b != null) {
            b += nyu.e(2, this.b.longValue());
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.a != null) {
            b += nyu.f(8, this.a.intValue());
        }
        if (this.c != null) {
            b += nyu.f(9, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            int i2 = 0;
            for (int g : this.d) {
                i2 += nyu.g(g);
            }
            b = (b + i2) + (this.d.length * 1);
        }
        if (this.e != null) {
            b += nyu.d(11, this.e);
        }
        if (this.h != null) {
            b += nyu.e(12, this.h.longValue());
        }
        if (this.j != null) {
            b += nyu.e(13, this.j.longValue());
        }
        if (this.i != null) {
            b += nyu.e(14, this.i.longValue());
        }
        if (this.k != null) {
            b += nyu.f(15, this.k.intValue());
        }
        if (this.l != null) {
            this.l.booleanValue();
            b += nyu.h(16) + 1;
        }
        if (this.m != null && this.m.length > 0) {
            while (i < this.m.length) {
                nzf nzf = this.m[i];
                if (nzf != null) {
                    b += nyu.d(17, nzf);
                }
                i++;
            }
        }
        if (this.n != null) {
            b += nyu.f(18, this.n.intValue());
        }
        if (this.f != null) {
            b += nyu.d(19, this.f);
        }
        if (this.o != null) {
            b += nyu.d(20, this.o);
        }
        if (this.p == null) {
            return b;
        }
        this.p.booleanValue();
        return b + (nyu.h(21) + 1);
    }

    private lon b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dI /*16*/:
                    this.b = Long.valueOf(nyt.d());
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new lxf();
                    }
                    nyt.a(this.g);
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case wi.dr /*10*/:
                        case wi.k /*20*/:
                        case wi.dz /*25*/:
                        case 30:
                        case 100:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 80:
                    int b = nzl.b(nyt, 80);
                    Object obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                                a = i2 + 1;
                                obj[i2] = f;
                                break;
                            default:
                                a = i2;
                                break;
                        }
                        i++;
                        i2 = a;
                    }
                    if (i2 != 0) {
                        a = this.d == null ? 0 : this.d.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.d, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.d = obj2;
                            break;
                        }
                        this.d = obj;
                        break;
                    }
                    continue;
                case 82:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.d == null) {
                            i2 = 0;
                        } else {
                            i2 = this.d.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.d, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case wi.w /*0*/:
                                case wi.j /*1*/:
                                case wi.l /*2*/:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.d = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 90:
                    if (this.e == null) {
                        this.e = new ltr();
                    }
                    nyt.a(this.e);
                    continue;
                case 96:
                    this.h = Long.valueOf(nyt.d());
                    continue;
                case 104:
                    this.j = Long.valueOf(nyt.d());
                    continue;
                case 112:
                    this.i = Long.valueOf(nyt.d());
                    continue;
                case 120:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.k = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 128:
                    this.l = Boolean.valueOf(nyt.i());
                    continue;
                case 138:
                    i2 = nzl.b(nyt, 138);
                    if (this.m == null) {
                        a = 0;
                    } else {
                        a = this.m.length;
                    }
                    Object obj4 = new loo[(i2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.m, 0, obj4, 0, a);
                    }
                    while (a < obj4.length - 1) {
                        obj4[a] = new loo();
                        nyt.a(obj4[a]);
                        nyt.a();
                        a++;
                    }
                    obj4[a] = new loo();
                    nyt.a(obj4[a]);
                    this.m = obj4;
                    continue;
                case 144:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.n = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 154:
                    if (this.f == null) {
                        this.f = new lsn();
                    }
                    nyt.a(this.f);
                    continue;
                case 162:
                    if (this.o == null) {
                        this.o = new lwt();
                    }
                    nyt.a(this.o);
                    continue;
                case 168:
                    this.p = Boolean.valueOf(nyt.i());
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
