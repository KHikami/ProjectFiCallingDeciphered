package defpackage;

public final class ldj extends nyx<ldj> {
    public Integer a;
    public Integer b;
    public int[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ldj() {
        d();
    }

    private ldj d() {
        this.b = null;
        this.c = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
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
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
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

    private ldj b(nyt nyt) {
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
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = Integer.valueOf(nyt.f());
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
