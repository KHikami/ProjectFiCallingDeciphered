package p000;

public final class nap extends nyx<nap> {
    private static volatile nap[] f29375h;
    public String f29376a;
    public Integer f29377b;
    public String f29378c;
    public long[] f29379d;
    public double[] f29380e;
    public nak f29381f;
    public nao f29382g;

    public /* synthetic */ nzf m34082a(nyt nyt) {
        return m34079b(nyt);
    }

    public static nap[] m34080d() {
        if (f29375h == null) {
            synchronized (nzc.f31309c) {
                if (f29375h == null) {
                    f29375h = new nap[0];
                }
            }
        }
        return f29375h;
    }

    public nap() {
        m34081g();
    }

    private nap m34081g() {
        this.f29376a = null;
        this.f29378c = null;
        this.f29379d = nzl.f31328b;
        this.f29380e = nzl.f31330d;
        this.f29381f = null;
        this.f29382g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34083a(nyu nyu) {
        int i = 0;
        if (this.f29376a != null) {
            nyu.m37170a(1, this.f29376a);
        }
        if (this.f29377b != null) {
            nyu.m37168a(2, this.f29377b.intValue());
        }
        if (this.f29378c != null) {
            nyu.m37170a(3, this.f29378c);
        }
        if (this.f29379d != null && this.f29379d.length > 0) {
            for (long b : this.f29379d) {
                nyu.m37181b(4, b);
            }
        }
        if (this.f29380e != null && this.f29380e.length > 0) {
            while (i < this.f29380e.length) {
                nyu.m37166a(5, this.f29380e[i]);
                i++;
            }
        }
        if (this.f29381f != null) {
            nyu.m37182b(6, this.f29381f);
        }
        if (this.f29382g != null) {
            nyu.m37182b(7, this.f29382g);
        }
        super.a(nyu);
    }

    protected int m34084b() {
        int i = 0;
        int b = super.b();
        if (this.f29376a != null) {
            b += nyu.m37137b(1, this.f29376a);
        }
        if (this.f29377b != null) {
            b += nyu.m37147f(2, this.f29377b.intValue());
        }
        if (this.f29378c != null) {
            b += nyu.m37137b(3, this.f29378c);
        }
        if (this.f29379d != null && this.f29379d.length > 0) {
            int i2 = 0;
            while (i < this.f29379d.length) {
                i2 += nyu.m37149f(this.f29379d[i]);
                i++;
            }
            b = (b + i2) + (this.f29379d.length * 1);
        }
        if (this.f29380e != null && this.f29380e.length > 0) {
            b = (b + (this.f29380e.length * 8)) + (this.f29380e.length * 1);
        }
        if (this.f29381f != null) {
            b += nyu.m37145d(6, this.f29381f);
        }
        if (this.f29382g != null) {
            return b + nyu.m37145d(7, this.f29382g);
        }
        return b;
    }

    private nap m34079b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            int d;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29376a = nyt.m37117j();
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f29377b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f29378c = nyt.m37117j();
                    continue;
                case 32:
                    b = nzl.m37265b(nyt, 32);
                    a = this.f29379d == null ? 0 : this.f29379d.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29379d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37110e();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37110e();
                    this.f29379d = obj;
                    continue;
                case 34:
                    d = nyt.m37108d(nyt.m37125r());
                    b = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        nyt.m37110e();
                        a++;
                    }
                    nyt.m37113f(b);
                    b = this.f29379d == null ? 0 : this.f29379d.length;
                    Object obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f29379d, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.m37110e();
                        b++;
                    }
                    this.f29379d = obj2;
                    nyt.m37111e(d);
                    continue;
                case 41:
                    b = nzl.m37265b(nyt, 41);
                    a = this.f29380e == null ? 0 : this.f29380e.length;
                    obj = new double[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29380e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37104b();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37104b();
                    this.f29380e = obj;
                    continue;
                case 42:
                    a = nyt.m37125r();
                    b = nyt.m37108d(a);
                    d = a / 8;
                    a = this.f29380e == null ? 0 : this.f29380e.length;
                    Object obj3 = new double[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29380e, 0, obj3, 0, a);
                    }
                    while (a < obj3.length) {
                        obj3[a] = nyt.m37104b();
                        a++;
                    }
                    this.f29380e = obj3;
                    nyt.m37111e(b);
                    continue;
                case 50:
                    if (this.f29381f == null) {
                        this.f29381f = new nak();
                    }
                    nyt.m37101a(this.f29381f);
                    continue;
                case 58:
                    if (this.f29382g == null) {
                        this.f29382g = new nao();
                    }
                    nyt.m37101a(this.f29382g);
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
