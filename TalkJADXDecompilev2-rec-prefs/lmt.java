package p000;

public final class lmt extends nyx<lmt> {
    private static volatile lmt[] f25668l;
    public String f25669a;
    public int[] f25670b;
    public String f25671c;
    public String f25672d;
    public Boolean f25673e;
    public Boolean f25674f;
    public Boolean f25675g;
    public Integer f25676h;
    public Boolean f25677i;
    public Boolean f25678j;
    public Boolean f25679k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29534b(nyt);
    }

    public static lmt[] m29535d() {
        if (f25668l == null) {
            synchronized (nzc.c) {
                if (f25668l == null) {
                    f25668l = new lmt[0];
                }
            }
        }
        return f25668l;
    }

    public lmt() {
        this.f25669a = null;
        this.f25670b = nzl.a;
        this.f25671c = null;
        this.f25672d = null;
        this.f25673e = null;
        this.f25674f = null;
        this.f25675g = null;
        this.f25676h = null;
        this.f25677i = null;
        this.f25678j = null;
        this.f25679k = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f25669a != null) {
            nyu.a(1, this.f25669a);
        }
        if (this.f25672d != null) {
            nyu.a(2, this.f25672d);
        }
        if (this.f25673e != null) {
            nyu.a(3, this.f25673e.booleanValue());
        }
        if (this.f25674f != null) {
            nyu.a(4, this.f25674f.booleanValue());
        }
        if (this.f25675g != null) {
            nyu.a(5, this.f25675g.booleanValue());
        }
        if (this.f25676h != null) {
            nyu.a(6, this.f25676h.intValue());
        }
        if (this.f25677i != null) {
            nyu.a(7, this.f25677i.booleanValue());
        }
        if (this.f25670b != null && this.f25670b.length > 0) {
            for (int a : this.f25670b) {
                nyu.a(8, a);
            }
        }
        if (this.f25678j != null) {
            nyu.a(9, this.f25678j.booleanValue());
        }
        if (this.f25671c != null) {
            nyu.a(10, this.f25671c);
        }
        if (this.f25679k != null) {
            nyu.a(11, this.f25679k.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f25669a != null) {
            b += nyu.b(1, this.f25669a);
        }
        if (this.f25672d != null) {
            b += nyu.b(2, this.f25672d);
        }
        if (this.f25673e != null) {
            this.f25673e.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f25674f != null) {
            this.f25674f.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f25675g != null) {
            this.f25675g.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f25676h != null) {
            b += nyu.f(6, this.f25676h.intValue());
        }
        if (this.f25677i != null) {
            this.f25677i.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f25670b != null && this.f25670b.length > 0) {
            int i2 = 0;
            while (i < this.f25670b.length) {
                i2 += nyu.g(this.f25670b[i]);
                i++;
            }
            b = (b + i2) + (this.f25670b.length * 1);
        }
        if (this.f25678j != null) {
            this.f25678j.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.f25671c != null) {
            b += nyu.b(10, this.f25671c);
        }
        if (this.f25679k == null) {
            return b;
        }
        this.f25679k.booleanValue();
        return b + (nyu.h(11) + 1);
    }

    private lmt m29534b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25669a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f25672d = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f25673e = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f25674f = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.f25675g = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f25676h = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    this.f25677i = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    b = nzl.b(nyt, 64);
                    a = this.f25670b == null ? 0 : this.f25670b.length;
                    Object obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25670b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f25670b = obj;
                    continue;
                case 66:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f25670b == null ? 0 : this.f25670b.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f25670b, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f25670b = obj2;
                    nyt.e(d);
                    continue;
                case 72:
                    this.f25678j = Boolean.valueOf(nyt.i());
                    continue;
                case 82:
                    this.f25671c = nyt.j();
                    continue;
                case 88:
                    this.f25679k = Boolean.valueOf(nyt.i());
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
