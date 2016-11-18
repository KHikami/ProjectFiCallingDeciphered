package defpackage;

public final class nap extends nyx<nap> {
    private static volatile nap[] h;
    public String a;
    public Integer b;
    public String c;
    public long[] d;
    public double[] e;
    public nak f;
    public nao g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nap[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new nap[0];
                }
            }
        }
        return h;
    }

    public nap() {
        g();
    }

    private nap g() {
        this.a = null;
        this.c = null;
        this.d = nzl.b;
        this.e = nzl.d;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (long b : this.d) {
                nyu.b(4, b);
            }
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nyu.a(5, this.e[i]);
                i++;
            }
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            int i2 = 0;
            while (i < this.d.length) {
                i2 += nyu.f(this.d[i]);
                i++;
            }
            b = (b + i2) + (this.d.length * 1);
        }
        if (this.e != null && this.e.length > 0) {
            b = (b + (this.e.length * 8)) + (this.e.length * 1);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            return b + nyu.d(7, this.g);
        }
        return b;
    }

    private nap b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int d;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 32:
                    b = nzl.b(nyt, 32);
                    a = this.d == null ? 0 : this.d.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.d = obj;
                    continue;
                case 34:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.e();
                        a++;
                    }
                    nyt.f(b);
                    b = this.d == null ? 0 : this.d.length;
                    Object obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.d, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.d = obj2;
                    nyt.e(d);
                    continue;
                case 41:
                    b = nzl.b(nyt, 41);
                    a = this.e == null ? 0 : this.e.length;
                    obj = new double[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.b();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.b();
                    this.e = obj;
                    continue;
                case 42:
                    a = nyt.r();
                    b = nyt.d(a);
                    d = a / 8;
                    a = this.e == null ? 0 : this.e.length;
                    Object obj3 = new double[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj3, 0, a);
                    }
                    while (a < obj3.length) {
                        obj3[a] = nyt.b();
                        a++;
                    }
                    this.e = obj3;
                    nyt.e(b);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new nak();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new nao();
                    }
                    nyt.a(this.g);
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
