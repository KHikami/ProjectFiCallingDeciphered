package p000;

public final class lzn extends nyx<lzn> {
    private static volatile lzn[] f27010j;
    public String f27011a;
    public String f27012b;
    public String[] f27013c;
    public Long f27014d;
    public Integer f27015e;
    public lzl f27016f;
    public lzp f27017g;
    public lzo f27018h;
    public Boolean f27019i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31299b(nyt);
    }

    public static lzn[] m31300d() {
        if (f27010j == null) {
            synchronized (nzc.c) {
                if (f27010j == null) {
                    f27010j = new lzn[0];
                }
            }
        }
        return f27010j;
    }

    public lzn() {
        m31301g();
    }

    private lzn m31301g() {
        this.f27011a = null;
        this.f27012b = null;
        this.f27013c = nzl.f;
        this.f27014d = null;
        this.f27016f = null;
        this.f27017g = null;
        this.f27018h = null;
        this.f27019i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27011a != null) {
            nyu.a(1, this.f27011a);
        }
        if (this.f27012b != null) {
            nyu.a(2, this.f27012b);
        }
        if (this.f27013c != null && this.f27013c.length > 0) {
            for (String str : this.f27013c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (this.f27015e != null) {
            nyu.a(4, this.f27015e.intValue());
        }
        if (this.f27016f != null) {
            nyu.b(5, this.f27016f);
        }
        if (this.f27019i != null) {
            nyu.a(6, this.f27019i.booleanValue());
        }
        if (this.f27017g != null) {
            nyu.b(7, this.f27017g);
        }
        if (this.f27018h != null) {
            nyu.b(8, this.f27018h);
        }
        if (this.f27014d != null) {
            nyu.b(9, this.f27014d.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27011a != null) {
            b += nyu.b(1, this.f27011a);
        }
        if (this.f27012b != null) {
            b += nyu.b(2, this.f27012b);
        }
        if (this.f27013c != null && this.f27013c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f27013c.length) {
                String str = this.f27013c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f27015e != null) {
            b += nyu.f(4, this.f27015e.intValue());
        }
        if (this.f27016f != null) {
            b += nyu.d(5, this.f27016f);
        }
        if (this.f27019i != null) {
            this.f27019i.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f27017g != null) {
            b += nyu.d(7, this.f27017g);
        }
        if (this.f27018h != null) {
            b += nyu.d(8, this.f27018h);
        }
        if (this.f27014d != null) {
            return b + nyu.f(9, this.f27014d.longValue());
        }
        return b;
    }

    private lzn m31299b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27011a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f27012b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    a = this.f27013c == null ? 0 : this.f27013c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27013c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f27013c = obj;
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f27015e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    if (this.f27016f == null) {
                        this.f27016f = new lzl();
                    }
                    nyt.a(this.f27016f);
                    continue;
                case 48:
                    this.f27019i = Boolean.valueOf(nyt.i());
                    continue;
                case 58:
                    if (this.f27017g == null) {
                        this.f27017g = new lzp();
                    }
                    nyt.a(this.f27017g);
                    continue;
                case 66:
                    if (this.f27018h == null) {
                        this.f27018h = new lzo();
                    }
                    nyt.a(this.f27018h);
                    continue;
                case 72:
                    this.f27014d = Long.valueOf(nyt.e());
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
