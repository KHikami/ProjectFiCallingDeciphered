public final class mub extends nyx<mub> {
    public int[] a;
    public float[] b;
    public Boolean c;
    public String d;
    public String e;
    public ozo f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mub() {
        d();
    }

    private mub d() {
        this.a = nzl.a;
        this.b = nzl.c;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (int a : this.a) {
                nyu.a(1, a);
            }
        }
        if (this.b != null && this.b.length > 0) {
            while (i < this.b.length) {
                nyu.a(2, this.b[i]);
                i++;
            }
        }
        if (this.c != null) {
            nyu.a(3, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.b(15, this.f);
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
        if (this.b != null && this.b.length > 0) {
            i = (i + (this.b.length * 4)) + (this.b.length * 1);
        }
        if (this.c != null) {
            this.c.booleanValue();
            i += nyu.h(3) + 1;
        }
        if (this.d != null) {
            i += nyu.b(4, this.d);
        }
        if (this.e != null) {
            i += nyu.b(5, this.e);
        }
        if (this.f != null) {
            return i + nyu.d(15, this.f);
        }
        return i;
    }

    private mub b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int d;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
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
                case wi.dr /*10*/:
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
                    a = nyt.r();
                    b = nyt.d(a);
                    d = a / 4;
                    a = this.b == null ? 0 : this.b.length;
                    Object obj3 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj3, 0, a);
                    }
                    while (a < obj3.length) {
                        obj3[a] = nyt.c();
                        a++;
                    }
                    this.b = obj3;
                    nyt.e(b);
                    continue;
                case wi.f /*21*/:
                    b = nzl.b(nyt, 21);
                    a = this.b == null ? 0 : this.b.length;
                    obj = new float[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.c();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.c();
                    this.b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 122:
                    if (this.f == null) {
                        this.f = new ozo();
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
