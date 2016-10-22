public final class loz extends nyx<loz> {
    public Integer a;
    public lqs b;
    public Long c;
    public String d;
    public String e;
    public lsh[] f;
    public lpk g;
    public lse h;
    public Integer i;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public loz() {
        d();
    }

    private loz d() {
        this.requestHeader = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = lsh.d();
        this.g = null;
        this.h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.a != null) {
            nyu.a(2, this.a.intValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.longValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.f != null && this.f.length > 0) {
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.g != null) {
            nyu.b(11, this.g);
        }
        if (this.h != null) {
            nyu.b(12, this.h);
        }
        if (this.b != null) {
            nyu.b(13, this.b);
        }
        if (this.e != null) {
            nyu.a(14, this.e);
        }
        if (this.i != null) {
            nyu.a(15, this.i.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null) {
            b += nyu.f(2, this.a.intValue());
        }
        if (this.c != null) {
            b += nyu.e(3, this.c.longValue());
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.f != null && this.f.length > 0) {
            int i = b;
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    i += nyu.d(5, nzf);
                }
            }
            b = i;
        }
        if (this.g != null) {
            b += nyu.d(11, this.g);
        }
        if (this.h != null) {
            b += nyu.d(12, this.h);
        }
        if (this.b != null) {
            b += nyu.d(13, this.b);
        }
        if (this.e != null) {
            b += nyu.b(14, this.e);
        }
        if (this.i != null) {
            return b + nyu.f(15, this.i.intValue());
        }
        return b;
    }

    private loz b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dI /*16*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.d());
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    Object obj = new lsh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsh();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 90:
                    if (this.g == null) {
                        this.g = new lpk();
                    }
                    nyt.a(this.g);
                    continue;
                case 98:
                    if (this.h == null) {
                        this.h = new lse();
                    }
                    nyt.a(this.h);
                    continue;
                case 106:
                    if (this.b == null) {
                        this.b = new lqs();
                    }
                    nyt.a(this.b);
                    continue;
                case 114:
                    this.e = nyt.j();
                    continue;
                case 120:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
