package p000;

public final class ldj extends nyx<ldj> {
    public Integer f24671a;
    public Integer f24672b;
    public int[] f24673c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28740b(nyt);
    }

    public ldj() {
        m28741d();
    }

    private ldj m28741d() {
        this.f24672b = null;
        this.f24673c = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24671a != null) {
            nyu.a(1, this.f24671a.intValue());
        }
        if (this.f24672b != null) {
            nyu.a(2, this.f24672b.intValue());
        }
        if (this.f24673c != null && this.f24673c.length > 0) {
            for (int a : this.f24673c) {
                nyu.a(3, a);
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f24671a != null) {
            b += nyu.f(1, this.f24671a.intValue());
        }
        if (this.f24672b != null) {
            b += nyu.f(2, this.f24672b.intValue());
        }
        if (this.f24673c == null || this.f24673c.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f24673c.length) {
            i2 += nyu.g(this.f24673c[i]);
            i++;
        }
        return (b + i2) + (this.f24673c.length * 1);
    }

    private ldj m28740b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case -1:
                        case 0:
                        case 280:
                        case 360:
                        case 440:
                        case 520:
                            this.f24671a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f24672b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.f24673c == null ? 0 : this.f24673c.length;
                    Object obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24673c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f24673c = obj;
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
                    b = this.f24673c == null ? 0 : this.f24673c.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f24673c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f24673c = obj2;
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
