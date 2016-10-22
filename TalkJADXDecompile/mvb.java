public final class mvb extends nyx<mvb> {
    public Float a;
    public Float b;
    public int[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mvb() {
        d();
    }

    private mvb d() {
        this.a = null;
        this.b = null;
        this.c = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.floatValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.floatValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (int a : this.c) {
                nyu.a(3, a);
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            this.a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.b != null) {
            this.b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.c == null || this.c.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.c.length) {
            i2 += nyu.g(this.c[i]);
            i++;
        }
        return (b + i2) + (this.c.length * 1);
    }

    private mvb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dD /*13*/:
                    this.a = Float.valueOf(nyt.c());
                    continue;
                case wi.f /*21*/:
                    this.b = Float.valueOf(nyt.c());
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.c == null ? 0 : this.c.length;
                    Object obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.c = obj;
                    continue;
                case wi.dx /*26*/:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.c == null ? 0 : this.c.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.c = obj2;
                    nyt.e(d);
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
