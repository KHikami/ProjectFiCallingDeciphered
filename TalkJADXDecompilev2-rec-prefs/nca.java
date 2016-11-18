package p000;

public final class nca extends nyx<nca> {
    private static volatile nca[] f29475h;
    public String f29476a;
    public int f29477b;
    public String f29478c;
    public long[] f29479d;
    public double[] f29480e;
    public nah f29481f;
    public nan f29482g;

    public /* synthetic */ nzf m34271a(nyt nyt) {
        return m34269b(nyt);
    }

    public static nca[] m34270d() {
        if (f29475h == null) {
            synchronized (nzc.f31309c) {
                if (f29475h == null) {
                    f29475h = new nca[0];
                }
            }
        }
        return f29475h;
    }

    public nca() {
        this.f29476a = null;
        this.f29477b = nzf.UNSET_ENUM_VALUE;
        this.f29478c = null;
        this.f29479d = nzl.f31328b;
        this.f29480e = nzl.f31330d;
        this.cachedSize = -1;
    }

    public void m34272a(nyu nyu) {
        int i = 0;
        if (this.f29476a != null) {
            nyu.m37170a(1, this.f29476a);
        }
        if (this.f29477b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f29477b);
        }
        if (this.f29478c != null) {
            nyu.m37170a(3, this.f29478c);
        }
        if (this.f29479d != null && this.f29479d.length > 0) {
            for (long b : this.f29479d) {
                nyu.m37181b(4, b);
            }
        }
        if (this.f29480e != null && this.f29480e.length > 0) {
            while (i < this.f29480e.length) {
                nyu.m37166a(5, this.f29480e[i]);
                i++;
            }
        }
        if (this.f29481f != null) {
            nyu.m37182b(6, this.f29481f);
        }
        if (this.f29482g != null) {
            nyu.m37182b(7, this.f29482g);
        }
        super.a(nyu);
    }

    protected int m34273b() {
        int i = 0;
        int b = super.b();
        if (this.f29476a != null) {
            b += nyu.m37137b(1, this.f29476a);
        }
        if (this.f29477b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(2, this.f29477b);
        }
        if (this.f29478c != null) {
            b += nyu.m37137b(3, this.f29478c);
        }
        if (this.f29479d != null && this.f29479d.length > 0) {
            int i2 = 0;
            while (i < this.f29479d.length) {
                i2 += nyu.m37149f(this.f29479d[i]);
                i++;
            }
            b = (b + i2) + (this.f29479d.length * 1);
        }
        if (this.f29480e != null && this.f29480e.length > 0) {
            b = (b + (this.f29480e.length * 8)) + (this.f29480e.length * 1);
        }
        if (this.f29481f != null) {
            b += nyu.m37145d(6, this.f29481f);
        }
        if (this.f29482g != null) {
            return b + nyu.m37145d(7, this.f29482g);
        }
        return b;
    }

    private nca m34269b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            int d;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29476a = nyt.m37117j();
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
                            this.f29477b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f29478c = nyt.m37117j();
                    continue;
                case 32:
                    b = nzl.m37265b(nyt, 32);
                    a = this.f29479d == null ? 0 : this.f29479d.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29479d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37110e();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37110e();
                    this.f29479d = obj;
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
                    b = this.f29479d == null ? 0 : this.f29479d.length;
                    Object obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f29479d, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.m37110e();
                        b++;
                    }
                    this.f29479d = obj2;
                    nyt.m37111e(d);
                    continue;
                case 41:
                    b = nzl.m37265b(nyt, 41);
                    a = this.f29480e == null ? 0 : this.f29480e.length;
                    obj = new double[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29480e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37104b();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37104b();
                    this.f29480e = obj;
                    continue;
                case 42:
                    a = nyt.m37125r();
                    b = nyt.m37108d(a);
                    d = a / 8;
                    a = this.f29480e == null ? 0 : this.f29480e.length;
                    Object obj3 = new double[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29480e, 0, obj3, 0, a);
                    }
                    while (a < obj3.length) {
                        obj3[a] = nyt.m37104b();
                        a++;
                    }
                    this.f29480e = obj3;
                    nyt.m37111e(b);
                    continue;
                case 50:
                    if (this.f29481f == null) {
                        this.f29481f = new nah();
                    }
                    nyt.m37101a(this.f29481f);
                    continue;
                case 58:
                    if (this.f29482g == null) {
                        this.f29482g = new nan();
                    }
                    nyt.m37101a(this.f29482g);
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
