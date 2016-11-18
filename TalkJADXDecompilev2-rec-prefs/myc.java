package p000;

public final class myc extends nyx<myc> {
    private static volatile myc[] f29122g;
    public int[] f29123a;
    public mye f29124b;
    public mye f29125c;
    public myd f29126d;
    public double[] f29127e;
    public mxz f29128f;

    public /* synthetic */ nzf m33777a(nyt nyt) {
        return m33774b(nyt);
    }

    public static myc[] m33775d() {
        if (f29122g == null) {
            synchronized (nzc.f31309c) {
                if (f29122g == null) {
                    f29122g = new myc[0];
                }
            }
        }
        return f29122g;
    }

    public myc() {
        m33776g();
    }

    private myc m33776g() {
        this.f29123a = nzl.f31327a;
        this.f29124b = null;
        this.f29125c = null;
        this.f29126d = null;
        this.f29127e = nzl.f31330d;
        this.f29128f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33778a(nyu nyu) {
        int i = 0;
        if (this.f29123a != null && this.f29123a.length > 0) {
            for (int a : this.f29123a) {
                nyu.m37168a(1, a);
            }
        }
        if (this.f29124b != null) {
            nyu.m37182b(2, this.f29124b);
        }
        if (this.f29125c != null) {
            nyu.m37182b(3, this.f29125c);
        }
        if (this.f29126d != null) {
            nyu.m37182b(4, this.f29126d);
        }
        if (this.f29127e != null && this.f29127e.length > 0) {
            while (i < this.f29127e.length) {
                nyu.m37166a(5, this.f29127e[i]);
                i++;
            }
        }
        if (this.f29128f != null) {
            nyu.m37182b(6, this.f29128f);
        }
        super.a(nyu);
    }

    protected int m33779b() {
        int i = 0;
        int b = super.b();
        if (this.f29123a == null || this.f29123a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f29123a.length) {
                i2 += nyu.m37150g(this.f29123a[i]);
                i++;
            }
            i = (b + i2) + (this.f29123a.length * 1);
        }
        if (this.f29124b != null) {
            i += nyu.m37145d(2, this.f29124b);
        }
        if (this.f29125c != null) {
            i += nyu.m37145d(3, this.f29125c);
        }
        if (this.f29126d != null) {
            i += nyu.m37145d(4, this.f29126d);
        }
        if (this.f29127e != null && this.f29127e.length > 0) {
            i = (i + (this.f29127e.length * 8)) + (this.f29127e.length * 1);
        }
        if (this.f29128f != null) {
            return i + nyu.m37145d(6, this.f29128f);
        }
        return i;
    }

    private myc m33774b(nyt nyt) {
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
                    a = this.f29123a == null ? 0 : this.f29123a.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29123a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37112f();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37112f();
                    this.f29123a = obj;
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
                    b = this.f29123a == null ? 0 : this.f29123a.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f29123a, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.m37112f();
                        b++;
                    }
                    this.f29123a = obj2;
                    nyt.m37111e(d);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29124b == null) {
                        this.f29124b = new mye();
                    }
                    nyt.m37101a(this.f29124b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29125c == null) {
                        this.f29125c = new mye();
                    }
                    nyt.m37101a(this.f29125c);
                    continue;
                case 34:
                    if (this.f29126d == null) {
                        this.f29126d = new myd();
                    }
                    nyt.m37101a(this.f29126d);
                    continue;
                case 41:
                    b = nzl.m37265b(nyt, 41);
                    a = this.f29127e == null ? 0 : this.f29127e.length;
                    obj = new double[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29127e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37104b();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37104b();
                    this.f29127e = obj;
                    continue;
                case 42:
                    a = nyt.m37125r();
                    b = nyt.m37108d(a);
                    d = a / 8;
                    a = this.f29127e == null ? 0 : this.f29127e.length;
                    Object obj3 = new double[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29127e, 0, obj3, 0, a);
                    }
                    while (a < obj3.length) {
                        obj3[a] = nyt.m37104b();
                        a++;
                    }
                    this.f29127e = obj3;
                    nyt.m37111e(b);
                    continue;
                case 50:
                    if (this.f29128f == null) {
                        this.f29128f = new mxz();
                    }
                    nyt.m37101a(this.f29128f);
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
