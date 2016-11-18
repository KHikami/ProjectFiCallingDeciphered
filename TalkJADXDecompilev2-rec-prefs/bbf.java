package p000;

public final class bbf extends nyx<bbf> {
    public Integer f2796a;
    public Integer f2797b;
    public int[] f2798c;
    public Integer f2799d;
    public Boolean f2800e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m4722b(nyt);
    }

    public bbf() {
        m4723d();
    }

    private bbf m4723d() {
        this.f2796a = null;
        this.f2797b = null;
        this.f2798c = nzl.a;
        this.f2800e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f2796a != null) {
            nyu.a(1, this.f2796a.intValue());
        }
        if (this.f2797b != null) {
            nyu.a(2, this.f2797b.intValue());
        }
        if (this.f2798c != null && this.f2798c.length > 0) {
            for (int a : this.f2798c) {
                nyu.a(3, a);
            }
        }
        if (this.f2799d != null) {
            nyu.a(4, this.f2799d.intValue());
        }
        if (this.f2800e != null) {
            nyu.a(5, this.f2800e.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f2796a != null) {
            b += nyu.f(1, this.f2796a.intValue());
        }
        if (this.f2797b != null) {
            b += nyu.f(2, this.f2797b.intValue());
        }
        if (this.f2798c != null && this.f2798c.length > 0) {
            int i2 = 0;
            while (i < this.f2798c.length) {
                i2 += nyu.g(this.f2798c[i]);
                i++;
            }
            b = (b + i2) + (this.f2798c.length * 1);
        }
        if (this.f2799d != null) {
            b += nyu.f(4, this.f2799d.intValue());
        }
        if (this.f2800e == null) {
            return b;
        }
        this.f2800e.booleanValue();
        return b + (nyu.h(5) + 1);
    }

    private bbf m4722b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f2796a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f2797b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.f2798c == null ? 0 : this.f2798c.length;
                    Object obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f2798c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f2798c = obj;
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
                    b = this.f2798c == null ? 0 : this.f2798c.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f2798c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f2798c = obj2;
                    nyt.e(d);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                            this.f2799d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.f2800e = Boolean.valueOf(nyt.i());
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
