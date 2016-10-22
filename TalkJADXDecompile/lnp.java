public final class lnp extends nyx<lnp> {
    public lsg[] a;
    public lqg b;
    public lom c;
    public Integer d;
    public Long e;
    public String f;
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lnp() {
        d();
    }

    private lnp d() {
        this.responseHeader = null;
        this.a = lsg.d();
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.e != null) {
            nyu.a(3, this.e.longValue());
        }
        if (this.f != null) {
            nyu.a(4, this.f);
        }
        if (this.b != null) {
            nyu.b(5, this.b);
        }
        if (this.c != null) {
            nyu.b(6, this.c);
        }
        if (this.d != null) {
            nyu.a(8, this.d.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.a != null && this.a.length > 0) {
            int i = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.e != null) {
            b += nyu.e(3, this.e.longValue());
        }
        if (this.f != null) {
            b += nyu.b(4, this.f);
        }
        if (this.b != null) {
            b += nyu.d(5, this.b);
        }
        if (this.c != null) {
            b += nyu.d(6, this.c);
        }
        if (this.d != null) {
            return b + nyu.f(8, this.d.intValue());
        }
        return b;
    }

    private lnp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    Object obj = new lsg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsg();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dA /*24*/:
                    this.e = Long.valueOf(nyt.d());
                    continue;
                case 34:
                    this.f = nyt.j();
                    continue;
                case 42:
                    if (this.b == null) {
                        this.b = new lqg();
                    }
                    nyt.a(this.b);
                    continue;
                case 50:
                    if (this.c == null) {
                        this.c = new lom();
                    }
                    nyt.a(this.c);
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.d = Integer.valueOf(a);
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
