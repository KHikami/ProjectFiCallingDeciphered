package p000;

public final class lnp extends nyx<lnp> {
    public lsg[] f25797a;
    public lqg f25798b;
    public lom f25799c;
    public Integer f25800d;
    public Long f25801e;
    public String f25802f;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29642b(nyt);
    }

    public lnp() {
        m29643d();
    }

    private lnp m29643d() {
        this.responseHeader = null;
        this.f25797a = lsg.m30297d();
        this.f25798b = null;
        this.f25799c = null;
        this.f25801e = null;
        this.f25802f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f25797a != null && this.f25797a.length > 0) {
            for (nzf nzf : this.f25797a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f25801e != null) {
            nyu.a(3, this.f25801e.longValue());
        }
        if (this.f25802f != null) {
            nyu.a(4, this.f25802f);
        }
        if (this.f25798b != null) {
            nyu.b(5, this.f25798b);
        }
        if (this.f25799c != null) {
            nyu.b(6, this.f25799c);
        }
        if (this.f25800d != null) {
            nyu.a(8, this.f25800d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f25797a != null && this.f25797a.length > 0) {
            int i = b;
            for (nzf nzf : this.f25797a) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f25801e != null) {
            b += nyu.e(3, this.f25801e.longValue());
        }
        if (this.f25802f != null) {
            b += nyu.b(4, this.f25802f);
        }
        if (this.f25798b != null) {
            b += nyu.d(5, this.f25798b);
        }
        if (this.f25799c != null) {
            b += nyu.d(6, this.f25799c);
        }
        if (this.f25800d != null) {
            return b + nyu.f(8, this.f25800d.intValue());
        }
        return b;
    }

    private lnp m29642b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f25797a == null) {
                        a = 0;
                    } else {
                        a = this.f25797a.length;
                    }
                    Object obj = new lsg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25797a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsg();
                    nyt.a(obj[a]);
                    this.f25797a = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f25801e = Long.valueOf(nyt.d());
                    continue;
                case 34:
                    this.f25802f = nyt.j();
                    continue;
                case 42:
                    if (this.f25798b == null) {
                        this.f25798b = new lqg();
                    }
                    nyt.a(this.f25798b);
                    continue;
                case 50:
                    if (this.f25799c == null) {
                        this.f25799c = new lom();
                    }
                    nyt.a(this.f25799c);
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25800d = Integer.valueOf(a);
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
