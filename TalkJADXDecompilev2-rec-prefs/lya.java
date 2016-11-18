package p000;

public final class lya extends nyx<lya> {
    private static volatile lya[] f26836l;
    public String f26837a;
    public String f26838b;
    public Integer f26839c;
    public String f26840d;
    public String f26841e;
    public String[] f26842f;
    public String f26843g;
    public Integer f26844h;
    public String f26845i;
    public String f26846j;
    public Integer f26847k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31095b(nyt);
    }

    public static lya[] m31096d() {
        if (f26836l == null) {
            synchronized (nzc.c) {
                if (f26836l == null) {
                    f26836l = new lya[0];
                }
            }
        }
        return f26836l;
    }

    public lya() {
        m31097g();
    }

    private lya m31097g() {
        this.f26837a = null;
        this.f26838b = null;
        this.f26840d = null;
        this.f26841e = null;
        this.f26842f = nzl.f;
        this.f26843g = null;
        this.f26845i = null;
        this.f26846j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26837a != null) {
            nyu.a(1, this.f26837a);
        }
        if (this.f26838b != null) {
            nyu.a(2, this.f26838b);
        }
        if (this.f26839c != null) {
            nyu.a(3, this.f26839c.intValue());
        }
        if (this.f26840d != null) {
            nyu.a(4, this.f26840d);
        }
        if (this.f26841e != null) {
            nyu.a(5, this.f26841e);
        }
        if (this.f26842f != null && this.f26842f.length > 0) {
            for (String str : this.f26842f) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        if (this.f26843g != null) {
            nyu.a(7, this.f26843g);
        }
        if (this.f26844h != null) {
            nyu.a(8, this.f26844h.intValue());
        }
        if (this.f26845i != null) {
            nyu.a(9, this.f26845i);
        }
        if (this.f26846j != null) {
            nyu.a(10, this.f26846j);
        }
        if (this.f26847k != null) {
            nyu.a(11, this.f26847k.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f26837a != null) {
            b += nyu.b(1, this.f26837a);
        }
        if (this.f26838b != null) {
            b += nyu.b(2, this.f26838b);
        }
        if (this.f26839c != null) {
            b += nyu.f(3, this.f26839c.intValue());
        }
        if (this.f26840d != null) {
            b += nyu.b(4, this.f26840d);
        }
        if (this.f26841e != null) {
            b += nyu.b(5, this.f26841e);
        }
        if (this.f26842f != null && this.f26842f.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f26842f.length) {
                String str = this.f26842f[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f26843g != null) {
            b += nyu.b(7, this.f26843g);
        }
        if (this.f26844h != null) {
            b += nyu.f(8, this.f26844h.intValue());
        }
        if (this.f26845i != null) {
            b += nyu.b(9, this.f26845i);
        }
        if (this.f26846j != null) {
            b += nyu.b(10, this.f26846j);
        }
        if (this.f26847k != null) {
            return b + nyu.f(11, this.f26847k.intValue());
        }
        return b;
    }

    private lya m31095b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26837a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26838b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26839c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.f26840d = nyt.j();
                    continue;
                case 42:
                    this.f26841e = nyt.j();
                    continue;
                case 50:
                    int b = nzl.b(nyt, 50);
                    a = this.f26842f == null ? 0 : this.f26842f.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26842f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26842f = obj;
                    continue;
                case 58:
                    this.f26843g = nyt.j();
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26844h = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 74:
                    this.f26845i = nyt.j();
                    continue;
                case 82:
                    this.f26846j = nyt.j();
                    continue;
                case 88:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26847k = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
