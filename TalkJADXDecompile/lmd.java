public final class lmd extends nyx<lmd> {
    private static volatile lmd[] l;
    public String a;
    public int[] b;
    public String c;
    public String d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Integer h;
    public Boolean i;
    public Boolean j;
    public Boolean k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lmd[] d() {
        if (l == null) {
            synchronized (nzc.c) {
                if (l == null) {
                    l = new lmd[0];
                }
            }
        }
        return l;
    }

    public lmd() {
        g();
    }

    private lmd g() {
        this.a = null;
        this.b = nzl.a;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.d != null) {
            nyu.a(2, this.d);
        }
        if (this.e != null) {
            nyu.a(3, this.e.booleanValue());
        }
        if (this.f != null) {
            nyu.a(4, this.f.booleanValue());
        }
        if (this.g != null) {
            nyu.a(5, this.g.booleanValue());
        }
        if (this.h != null) {
            nyu.a(6, this.h.intValue());
        }
        if (this.i != null) {
            nyu.a(7, this.i.booleanValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (int a : this.b) {
                nyu.a(8, a);
            }
        }
        if (this.j != null) {
            nyu.a(9, this.j.booleanValue());
        }
        if (this.c != null) {
            nyu.a(10, this.c);
        }
        if (this.k != null) {
            nyu.a(11, this.k.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.d != null) {
            b += nyu.b(2, this.d);
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.h != null) {
            b += nyu.f(6, this.h.intValue());
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.b != null && this.b.length > 0) {
            int i2 = 0;
            while (i < this.b.length) {
                i2 += nyu.g(this.b[i]);
                i++;
            }
            b = (b + i2) + (this.b.length * 1);
        }
        if (this.j != null) {
            this.j.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.c != null) {
            b += nyu.b(10, this.c);
        }
        if (this.k == null) {
            return b;
        }
        this.k.booleanValue();
        return b + (nyu.h(11) + 1);
    }

    private lmd b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.d = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.h = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    b = nzl.b(nyt, 64);
                    a = this.b == null ? 0 : this.b.length;
                    Object obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.b = obj;
                    continue;
                case 66:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.b == null ? 0 : this.b.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.b, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.b = obj2;
                    nyt.e(d);
                    continue;
                case 72:
                    this.j = Boolean.valueOf(nyt.i());
                    continue;
                case 82:
                    this.c = nyt.j();
                    continue;
                case 88:
                    this.k = Boolean.valueOf(nyt.i());
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
