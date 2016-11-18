package p000;

public final class kua extends nyx<kua> {
    public int[] f23352a;
    public int[] f23353b;
    public int[] f23354c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27530b(nyt);
    }

    public kua() {
        this.f23352a = nzl.a;
        this.f23353b = nzl.a;
        this.f23354c = nzl.a;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f23352a != null && this.f23352a.length > 0) {
            for (int a : this.f23352a) {
                nyu.a(1, a);
            }
        }
        if (this.f23353b != null && this.f23353b.length > 0) {
            for (int a2 : this.f23353b) {
                nyu.a(2, a2);
            }
        }
        if (this.f23354c != null && this.f23354c.length > 0) {
            while (i < this.f23354c.length) {
                nyu.a(3, this.f23354c[i]);
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
        if (this.f23352a == null || this.f23352a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            for (int g : this.f23352a) {
                i2 += nyu.g(g);
            }
            i = (b + i2) + (this.f23352a.length * 1);
        }
        if (this.f23353b != null && this.f23353b.length > 0) {
            b = 0;
            for (int g2 : this.f23353b) {
                b += nyu.g(g2);
            }
            i = (i + b) + (this.f23353b.length * 1);
        }
        if (this.f23354c == null || this.f23354c.length <= 0) {
            return i;
        }
        i2 = 0;
        while (i3 < this.f23354c.length) {
            i2 += nyu.g(this.f23354c[i3]);
            i3++;
        }
        return (i + i2) + (this.f23354c.length * 1);
    }

    private kua m27530b(nyt nyt) {
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
                    a = this.f23352a == null ? 0 : this.f23352a.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23352a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f23352a = obj;
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
                    b = this.f23352a == null ? 0 : this.f23352a.length;
                    obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f23352a, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f23352a = obj2;
                    nyt.e(d);
                    continue;
                case 16:
                    b = nzl.b(nyt, 16);
                    a = this.f23353b == null ? 0 : this.f23353b.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23353b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f23353b = obj;
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
                    b = this.f23353b == null ? 0 : this.f23353b.length;
                    obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f23353b, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f23353b = obj2;
                    nyt.e(d);
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.f23354c == null ? 0 : this.f23354c.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23354c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f23354c = obj;
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
                    b = this.f23354c == null ? 0 : this.f23354c.length;
                    obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f23354c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f23354c = obj2;
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
