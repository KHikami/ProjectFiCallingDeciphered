package p000;

public final class mve extends nyx<mve> {
    public Float f28454a;
    public Float f28455b;
    public int[] f28456c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33059b(nyt);
    }

    public mve() {
        this.f28454a = null;
        this.f28455b = null;
        this.f28456c = nzl.a;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28454a != null) {
            nyu.a(1, this.f28454a.floatValue());
        }
        if (this.f28455b != null) {
            nyu.a(2, this.f28455b.floatValue());
        }
        if (this.f28456c != null && this.f28456c.length > 0) {
            for (int a : this.f28456c) {
                nyu.a(3, a);
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f28454a != null) {
            this.f28454a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f28455b != null) {
            this.f28455b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f28456c == null || this.f28456c.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f28456c.length) {
            i2 += nyu.g(this.f28456c[i]);
            i++;
        }
        return (b + i2) + (this.f28456c.length * 1);
    }

    private mve m33059b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f28454a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f28455b = Float.valueOf(nyt.c());
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.f28456c == null ? 0 : this.f28456c.length;
                    Object obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28456c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f28456c = obj;
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
                    b = this.f28456c == null ? 0 : this.f28456c.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f28456c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f28456c = obj2;
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
