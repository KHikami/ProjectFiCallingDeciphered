package p000;

public final class mvb extends nyx<mvb> {
    public Float f28437a;
    public Float f28438b;
    public int[] f28439c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33043b(nyt);
    }

    public mvb() {
        m33044d();
    }

    private mvb m33044d() {
        this.f28437a = null;
        this.f28438b = null;
        this.f28439c = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28437a != null) {
            nyu.a(1, this.f28437a.floatValue());
        }
        if (this.f28438b != null) {
            nyu.a(2, this.f28438b.floatValue());
        }
        if (this.f28439c != null && this.f28439c.length > 0) {
            for (int a : this.f28439c) {
                nyu.a(3, a);
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f28437a != null) {
            this.f28437a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f28438b != null) {
            this.f28438b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f28439c == null || this.f28439c.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f28439c.length) {
            i2 += nyu.g(this.f28439c[i]);
            i++;
        }
        return (b + i2) + (this.f28439c.length * 1);
    }

    private mvb m33043b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f28437a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f28438b = Float.valueOf(nyt.c());
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.f28439c == null ? 0 : this.f28439c.length;
                    Object obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28439c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f28439c = obj;
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
                    b = this.f28439c == null ? 0 : this.f28439c.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f28439c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f28439c = obj2;
                    nyt.e(d);
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
