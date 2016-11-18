package defpackage;

public final class mxt extends nyx<mxt> {
    private static volatile mxt[] g;
    public int[] a;
    public mxv b;
    public mxv c;
    public mxu d;
    public double[] e;
    public mwq f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mxt[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new mxt[0];
                }
            }
        }
        return g;
    }

    public mxt() {
        this.a = nzl.a;
        this.e = nzl.d;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (int a : this.a) {
                nyu.a(1, a);
            }
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
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
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a == null || this.a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.a.length) {
                i2 += nyu.g(this.a[i]);
                i++;
            }
            i = (b + i2) + (this.a.length * 1);
        }
        if (this.b != null) {
            i += nyu.d(2, this.b);
        }
        if (this.c != null) {
            i += nyu.d(3, this.c);
        }
        if (this.d != null) {
            i += nyu.d(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            i = (i + (this.e.length * 8)) + (this.e.length * 1);
        }
        if (this.f != null) {
            return i + nyu.d(6, this.f);
        }
        return i;
    }

    private mxt b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int d;
            switch (a) {
                case 0:
                    break;
                case 8:
                    b = nzl.b(nyt, 8);
                    a = this.a == null ? 0 : this.a.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.a = obj;
                    continue;
                case 10:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.a == null ? 0 : this.a.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.a, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.a = obj2;
                    nyt.e(d);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new mxv();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new mxv();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new mxu();
                    }
                    nyt.a(this.d);
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
                        this.f = new mwq();
                    }
                    nyt.a(this.f);
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
