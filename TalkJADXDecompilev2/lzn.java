package defpackage;

public final class lzn extends nyx<lzn> {
    private static volatile lzn[] j;
    public String a;
    public String b;
    public String[] c;
    public Long d;
    public Integer e;
    public lzl f;
    public lzp g;
    public lzo h;
    public Boolean i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lzn[] d() {
        if (j == null) {
            synchronized (nzc.c) {
                if (j == null) {
                    j = new lzn[0];
                }
            }
        }
        return j;
    }

    public lzn() {
        g();
    }

    private lzn g() {
        this.a = null;
        this.b = null;
        this.c = nzl.f;
        this.d = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (String str : this.c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (this.e != null) {
            nyu.a(4, this.e.intValue());
        }
        if (this.f != null) {
            nyu.b(5, this.f);
        }
        if (this.i != null) {
            nyu.a(6, this.i.booleanValue());
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null) {
            nyu.b(8, this.h);
        }
        if (this.d != null) {
            nyu.b(9, this.d.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.c.length) {
                String str = this.c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.e != null) {
            b += nyu.f(4, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.d(5, this.f);
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null) {
            b += nyu.d(8, this.h);
        }
        if (this.d != null) {
            return b + nyu.f(9, this.d.longValue());
        }
        return b;
    }

    private lzn b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    a = this.c == null ? 0 : this.c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.c = obj;
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    if (this.f == null) {
                        this.f = new lzl();
                    }
                    nyt.a(this.f);
                    continue;
                case 48:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new lzp();
                    }
                    nyt.a(this.g);
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new lzo();
                    }
                    nyt.a(this.h);
                    continue;
                case 72:
                    this.d = Long.valueOf(nyt.e());
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
