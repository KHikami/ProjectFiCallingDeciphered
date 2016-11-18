package defpackage;

public final class mtz extends nyx<mtz> {
    private static volatile mtz[] h;
    public Integer a;
    public mui[] b;
    public Integer c;
    public mud d;
    public mub e;
    public ozo f;
    public Integer g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mtz[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new mtz[0];
                }
            }
        }
        return h;
    }

    public mtz() {
        g();
    }

    private mtz g() {
        this.b = mui.d();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.c != null) {
            nyu.a(4, this.c.intValue());
        }
        if (this.d != null) {
            nyu.b(5, this.d);
        }
        if (this.e != null) {
            nyu.b(6, this.e);
        }
        if (this.g != null) {
            nyu.a(7, this.g.intValue());
        }
        if (this.f != null) {
            nyu.b(15, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            int i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.c != null) {
            b += nyu.f(4, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.d(5, this.d);
        }
        if (this.e != null) {
            b += nyu.d(6, this.e);
        }
        if (this.g != null) {
            b += nyu.f(7, this.g.intValue());
        }
        if (this.f != null) {
            return b + nyu.d(15, this.f);
        }
        return b;
    }

    private mtz b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case 21:
                        case 22:
                        case wi.do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new mui[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mui();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mui();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 32:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 42:
                    if (this.d == null) {
                        this.d = new mud();
                    }
                    nyt.a(this.d);
                    continue;
                case 50:
                    if (this.e == null) {
                        this.e = new mub();
                    }
                    nyt.a(this.e);
                    continue;
                case 56:
                    this.g = Integer.valueOf(nyt.f());
                    continue;
                case 122:
                    if (this.f == null) {
                        this.f = new ozo();
                    }
                    nyt.a(this.f);
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
