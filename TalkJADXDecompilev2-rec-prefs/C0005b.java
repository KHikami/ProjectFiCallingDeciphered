package p000;

public final class C0005b extends nyx<C0005b> {
    private static volatile C0005b[] f2653i;
    public String f2654a;
    public Boolean f2655b;
    public Double f2656c;
    public String[] f2657d;
    public Long f2658e;
    public Long f2659f;
    public Integer f2660g;
    public long[] f2661h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m4517b(nyt);
    }

    public static C0005b[] m4516a() {
        if (f2653i == null) {
            synchronized (nzc.c) {
                if (f2653i == null) {
                    f2653i = new C0005b[0];
                }
            }
        }
        return f2653i;
    }

    public C0005b() {
        m4518d();
    }

    private C0005b m4518d() {
        this.f2654a = null;
        this.f2655b = null;
        this.f2656c = null;
        this.f2657d = nzl.f;
        this.f2658e = null;
        this.f2659f = null;
        this.f2660g = null;
        this.f2661h = nzl.b;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.f2654a);
        if (this.f2655b != null) {
            nyu.a(2, this.f2655b.booleanValue());
        }
        if (this.f2656c != null) {
            nyu.a(3, this.f2656c.doubleValue());
        }
        if (this.f2657d != null && this.f2657d.length > 0) {
            for (String str : this.f2657d) {
                if (str != null) {
                    nyu.a(4, str);
                }
            }
        }
        if (this.f2660g != null) {
            nyu.a(5, this.f2660g.intValue());
        }
        if (this.f2658e != null) {
            nyu.b(6, this.f2658e.longValue());
        }
        if (this.f2659f != null) {
            nyu.b(7, this.f2659f.longValue());
        }
        if (this.f2661h != null && this.f2661h.length > 0) {
            while (i < this.f2661h.length) {
                nyu.b(8, this.f2661h[i]);
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b() + nyu.b(1, this.f2654a);
        if (this.f2655b != null) {
            this.f2655b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f2656c != null) {
            this.f2656c.doubleValue();
            b += nyu.h(3) + 8;
        }
        if (this.f2657d != null && this.f2657d.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f2657d) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f2660g != null) {
            b += nyu.f(5, this.f2660g.intValue());
        }
        if (this.f2658e != null) {
            b += nyu.f(6, this.f2658e.longValue());
        }
        if (this.f2659f != null) {
            b += nyu.f(7, this.f2659f.longValue());
        }
        if (this.f2661h == null || this.f2661h.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f2661h.length) {
            i += nyu.f(this.f2661h[i2]);
            i2++;
        }
        return (b + i) + (this.f2661h.length * 1);
    }

    private C0005b m4517b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f2654a = nyt.j();
                    continue;
                case 16:
                    this.f2655b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dz /*25*/:
                    this.f2656c = Double.valueOf(nyt.b());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    a = this.f2657d == null ? 0 : this.f2657d.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f2657d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f2657d = obj;
                    continue;
                case 40:
                    this.f2660g = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f2658e = Long.valueOf(nyt.e());
                    continue;
                case 56:
                    this.f2659f = Long.valueOf(nyt.e());
                    continue;
                case 64:
                    b = nzl.b(nyt, 64);
                    a = this.f2661h == null ? 0 : this.f2661h.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f2661h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.f2661h = obj;
                    continue;
                case 66:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.e();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f2661h == null ? 0 : this.f2661h.length;
                    Object obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f2661h, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.f2661h = obj2;
                    nyt.e(d);
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
