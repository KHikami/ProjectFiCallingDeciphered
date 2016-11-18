package p000;

public final class mtz extends nyx<mtz> {
    private static volatile mtz[] f28322h;
    public Integer f28323a;
    public mui[] f28324b;
    public Integer f28325c;
    public mud f28326d;
    public mub f28327e;
    public ozo f28328f;
    public Integer f28329g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32908b(nyt);
    }

    public static mtz[] m32909d() {
        if (f28322h == null) {
            synchronized (nzc.c) {
                if (f28322h == null) {
                    f28322h = new mtz[0];
                }
            }
        }
        return f28322h;
    }

    public mtz() {
        m32910g();
    }

    private mtz m32910g() {
        this.f28324b = mui.m32946d();
        this.f28325c = null;
        this.f28326d = null;
        this.f28327e = null;
        this.f28328f = null;
        this.f28329g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28323a != null) {
            nyu.a(1, this.f28323a.intValue());
        }
        if (this.f28324b != null && this.f28324b.length > 0) {
            for (nzf nzf : this.f28324b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f28325c != null) {
            nyu.a(4, this.f28325c.intValue());
        }
        if (this.f28326d != null) {
            nyu.b(5, this.f28326d);
        }
        if (this.f28327e != null) {
            nyu.b(6, this.f28327e);
        }
        if (this.f28329g != null) {
            nyu.a(7, this.f28329g.intValue());
        }
        if (this.f28328f != null) {
            nyu.b(15, this.f28328f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28323a != null) {
            b += nyu.f(1, this.f28323a.intValue());
        }
        if (this.f28324b != null && this.f28324b.length > 0) {
            int i = b;
            for (nzf nzf : this.f28324b) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f28325c != null) {
            b += nyu.f(4, this.f28325c.intValue());
        }
        if (this.f28326d != null) {
            b += nyu.d(5, this.f28326d);
        }
        if (this.f28327e != null) {
            b += nyu.d(6, this.f28327e);
        }
        if (this.f28329g != null) {
            b += nyu.f(7, this.f28329g.intValue());
        }
        if (this.f28328f != null) {
            return b + nyu.d(15, this.f28328f);
        }
        return b;
    }

    private mtz m32908b(nyt nyt) {
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
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                            this.f28323a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f28324b == null) {
                        a = 0;
                    } else {
                        a = this.f28324b.length;
                    }
                    Object obj = new mui[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28324b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mui();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mui();
                    nyt.a(obj[a]);
                    this.f28324b = obj;
                    continue;
                case 32:
                    this.f28325c = Integer.valueOf(nyt.f());
                    continue;
                case 42:
                    if (this.f28326d == null) {
                        this.f28326d = new mud();
                    }
                    nyt.a(this.f28326d);
                    continue;
                case 50:
                    if (this.f28327e == null) {
                        this.f28327e = new mub();
                    }
                    nyt.a(this.f28327e);
                    continue;
                case 56:
                    this.f28329g = Integer.valueOf(nyt.f());
                    continue;
                case 122:
                    if (this.f28328f == null) {
                        this.f28328f = new ozo();
                    }
                    nyt.a(this.f28328f);
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
