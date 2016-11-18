package p000;

public final class mub extends nyx<mub> {
    public int[] f28334a;
    public float[] f28335b;
    public Boolean f28336c;
    public String f28337d;
    public String f28338e;
    public ozo f28339f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32920b(nyt);
    }

    public mub() {
        m32921d();
    }

    private mub m32921d() {
        this.f28334a = nzl.a;
        this.f28335b = nzl.c;
        this.f28336c = null;
        this.f28337d = null;
        this.f28338e = null;
        this.f28339f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f28334a != null && this.f28334a.length > 0) {
            for (int a : this.f28334a) {
                nyu.a(1, a);
            }
        }
        if (this.f28335b != null && this.f28335b.length > 0) {
            while (i < this.f28335b.length) {
                nyu.a(2, this.f28335b[i]);
                i++;
            }
        }
        if (this.f28336c != null) {
            nyu.a(3, this.f28336c.booleanValue());
        }
        if (this.f28337d != null) {
            nyu.a(4, this.f28337d);
        }
        if (this.f28338e != null) {
            nyu.a(5, this.f28338e);
        }
        if (this.f28339f != null) {
            nyu.b(15, this.f28339f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f28334a == null || this.f28334a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f28334a.length) {
                i2 += nyu.g(this.f28334a[i]);
                i++;
            }
            i = (b + i2) + (this.f28334a.length * 1);
        }
        if (this.f28335b != null && this.f28335b.length > 0) {
            i = (i + (this.f28335b.length * 4)) + (this.f28335b.length * 1);
        }
        if (this.f28336c != null) {
            this.f28336c.booleanValue();
            i += nyu.h(3) + 1;
        }
        if (this.f28337d != null) {
            i += nyu.b(4, this.f28337d);
        }
        if (this.f28338e != null) {
            i += nyu.b(5, this.f28338e);
        }
        if (this.f28339f != null) {
            return i + nyu.d(15, this.f28339f);
        }
        return i;
    }

    private mub m32920b(nyt nyt) {
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
                    a = this.f28334a == null ? 0 : this.f28334a.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28334a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f28334a = obj;
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
                    b = this.f28334a == null ? 0 : this.f28334a.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f28334a, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f28334a = obj2;
                    nyt.e(d);
                    continue;
                case wi.dH /*18*/:
                    a = nyt.r();
                    b = nyt.d(a);
                    d = a / 4;
                    a = this.f28335b == null ? 0 : this.f28335b.length;
                    Object obj3 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28335b, 0, obj3, 0, a);
                    }
                    while (a < obj3.length) {
                        obj3[a] = nyt.c();
                        a++;
                    }
                    this.f28335b = obj3;
                    nyt.e(b);
                    continue;
                case 21:
                    b = nzl.b(nyt, 21);
                    a = this.f28335b == null ? 0 : this.f28335b.length;
                    obj = new float[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28335b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.c();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.c();
                    this.f28335b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f28336c = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    this.f28337d = nyt.j();
                    continue;
                case 42:
                    this.f28338e = nyt.j();
                    continue;
                case 122:
                    if (this.f28339f == null) {
                        this.f28339f = new ozo();
                    }
                    nyt.a(this.f28339f);
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
