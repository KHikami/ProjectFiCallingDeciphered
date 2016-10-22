public final class kua extends nyx<kua> {
    public int[] a;
    public int[] b;
    public int[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kua() {
        this.a = nzl.a;
        this.b = nzl.a;
        this.c = nzl.a;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (int a : this.a) {
                nyu.a(1, a);
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (int a2 : this.b) {
                nyu.a(2, a2);
            }
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nyu.a(3, this.c[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if (this.a == null || this.a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            for (int g : this.a) {
                i2 += nyu.g(g);
            }
            i = (b + i2) + (this.a.length * 1);
        }
        if (this.b != null && this.b.length > 0) {
            b = 0;
            for (int g2 : this.b) {
                b += nyu.g(g2);
            }
            i = (i + b) + (this.b.length * 1);
        }
        if (this.c == null || this.c.length <= 0) {
            return i;
        }
        i2 = 0;
        while (i3 < this.c.length) {
            i2 += nyu.g(this.c[i3]);
            i3++;
        }
        return (i + i2) + (this.c.length * 1);
    }

    private kua b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int d;
            Object obj2;
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
                    obj2 = new int[(a + b)];
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
                case wi.dI /*16*/:
                    b = nzl.b(nyt, 16);
                    a = this.b == null ? 0 : this.b.length;
                    obj = new int[(b + a)];
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
                case wi.dH /*18*/:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.b == null ? 0 : this.b.length;
                    obj2 = new int[(a + b)];
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
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.c == null ? 0 : this.c.length;
                    obj = new int[(b + a)];
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
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.c == null ? 0 : this.c.length;
                    obj2 = new int[(a + b)];
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
