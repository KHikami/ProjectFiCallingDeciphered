package p000;

public final class ksk extends nyx<ksk> {
    public int[] f23060a;
    public int[] f23061b;
    public int[] f23062c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27319b(nyt);
    }

    public ksk() {
        m27320d();
    }

    private ksk m27320d() {
        this.f23060a = nzl.a;
        this.f23061b = nzl.a;
        this.f23062c = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f23060a != null && this.f23060a.length > 0) {
            for (int a : this.f23060a) {
                nyu.a(1, a);
            }
        }
        if (this.f23061b != null && this.f23061b.length > 0) {
            for (int a2 : this.f23061b) {
                nyu.a(2, a2);
            }
        }
        if (this.f23062c != null && this.f23062c.length > 0) {
            while (i < this.f23062c.length) {
                nyu.a(3, this.f23062c[i]);
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo147b();
        if (this.f23060a == null || this.f23060a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            for (int g : this.f23060a) {
                i2 += nyu.g(g);
            }
            i = (b + i2) + (this.f23060a.length * 1);
        }
        if (this.f23061b != null && this.f23061b.length > 0) {
            b = 0;
            for (int g2 : this.f23061b) {
                b += nyu.g(g2);
            }
            i = (i + b) + (this.f23061b.length * 1);
        }
        if (this.f23062c == null || this.f23062c.length <= 0) {
            return i;
        }
        i2 = 0;
        while (i3 < this.f23062c.length) {
            i2 += nyu.g(this.f23062c[i3]);
            i3++;
        }
        return (i + i2) + (this.f23062c.length * 1);
    }

    private ksk m27319b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int d;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    b = nzl.b(nyt, 8);
                    a = this.f23060a == null ? 0 : this.f23060a.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23060a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f23060a = obj;
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
                    b = this.f23060a == null ? 0 : this.f23060a.length;
                    obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f23060a, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f23060a = obj2;
                    nyt.e(d);
                    continue;
                case 16:
                    b = nzl.b(nyt, 16);
                    a = this.f23061b == null ? 0 : this.f23061b.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23061b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f23061b = obj;
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
                    b = this.f23061b == null ? 0 : this.f23061b.length;
                    obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f23061b, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f23061b = obj2;
                    nyt.e(d);
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.f23062c == null ? 0 : this.f23062c.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23062c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f23062c = obj;
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
                    b = this.f23062c == null ? 0 : this.f23062c.length;
                    obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f23062c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f23062c = obj2;
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
