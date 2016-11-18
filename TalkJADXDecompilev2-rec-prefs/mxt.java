package p000;

public final class mxt extends nyx<mxt> {
    private static volatile mxt[] f29087g;
    public int[] f29088a;
    public mxv f29089b;
    public mxv f29090c;
    public mxu f29091d;
    public double[] f29092e;
    public mwq f29093f;

    public /* synthetic */ nzf m33730a(nyt nyt) {
        return m33728b(nyt);
    }

    public static mxt[] m33729d() {
        if (f29087g == null) {
            synchronized (nzc.f31309c) {
                if (f29087g == null) {
                    f29087g = new mxt[0];
                }
            }
        }
        return f29087g;
    }

    public mxt() {
        this.f29088a = nzl.f31327a;
        this.f29092e = nzl.f31330d;
        this.cachedSize = -1;
    }

    public void m33731a(nyu nyu) {
        int i = 0;
        if (this.f29088a != null && this.f29088a.length > 0) {
            for (int a : this.f29088a) {
                nyu.m37168a(1, a);
            }
        }
        if (this.f29089b != null) {
            nyu.m37182b(2, this.f29089b);
        }
        if (this.f29090c != null) {
            nyu.m37182b(3, this.f29090c);
        }
        if (this.f29091d != null) {
            nyu.m37182b(4, this.f29091d);
        }
        if (this.f29092e != null && this.f29092e.length > 0) {
            while (i < this.f29092e.length) {
                nyu.m37166a(5, this.f29092e[i]);
                i++;
            }
        }
        if (this.f29093f != null) {
            nyu.m37182b(6, this.f29093f);
        }
        super.a(nyu);
    }

    protected int m33732b() {
        int i = 0;
        int b = super.b();
        if (this.f29088a == null || this.f29088a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f29088a.length) {
                i2 += nyu.m37150g(this.f29088a[i]);
                i++;
            }
            i = (b + i2) + (this.f29088a.length * 1);
        }
        if (this.f29089b != null) {
            i += nyu.m37145d(2, this.f29089b);
        }
        if (this.f29090c != null) {
            i += nyu.m37145d(3, this.f29090c);
        }
        if (this.f29091d != null) {
            i += nyu.m37145d(4, this.f29091d);
        }
        if (this.f29092e != null && this.f29092e.length > 0) {
            i = (i + (this.f29092e.length * 8)) + (this.f29092e.length * 1);
        }
        if (this.f29093f != null) {
            return i + nyu.m37145d(6, this.f29093f);
        }
        return i;
    }

    private mxt m33728b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            int d;
            switch (a) {
                case 0:
                    break;
                case 8:
                    b = nzl.m37265b(nyt, 8);
                    a = this.f29088a == null ? 0 : this.f29088a.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29088a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37112f();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37112f();
                    this.f29088a = obj;
                    continue;
                case 10:
                    d = nyt.m37108d(nyt.m37125r());
                    b = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        nyt.m37112f();
                        a++;
                    }
                    nyt.m37113f(b);
                    b = this.f29088a == null ? 0 : this.f29088a.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f29088a, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.m37112f();
                        b++;
                    }
                    this.f29088a = obj2;
                    nyt.m37111e(d);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29089b == null) {
                        this.f29089b = new mxv();
                    }
                    nyt.m37101a(this.f29089b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29090c == null) {
                        this.f29090c = new mxv();
                    }
                    nyt.m37101a(this.f29090c);
                    continue;
                case 34:
                    if (this.f29091d == null) {
                        this.f29091d = new mxu();
                    }
                    nyt.m37101a(this.f29091d);
                    continue;
                case 41:
                    b = nzl.m37265b(nyt, 41);
                    a = this.f29092e == null ? 0 : this.f29092e.length;
                    obj = new double[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29092e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37104b();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37104b();
                    this.f29092e = obj;
                    continue;
                case 42:
                    a = nyt.m37125r();
                    b = nyt.m37108d(a);
                    d = a / 8;
                    a = this.f29092e == null ? 0 : this.f29092e.length;
                    Object obj3 = new double[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29092e, 0, obj3, 0, a);
                    }
                    while (a < obj3.length) {
                        obj3[a] = nyt.m37104b();
                        a++;
                    }
                    this.f29092e = obj3;
                    nyt.m37111e(b);
                    continue;
                case 50:
                    if (this.f29093f == null) {
                        this.f29093f = new mwq();
                    }
                    nyt.m37101a(this.f29093f);
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
