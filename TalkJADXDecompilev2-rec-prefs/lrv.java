package p000;

public final class lrv extends nyx<lrv> {
    public Integer f26277a;
    public ltr[] f26278b;
    public Long f26279c;
    public lor f26280d;
    public Long f26281e;
    public Boolean f26282f;
    public Integer f26283g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30237b(nyt);
    }

    public lrv() {
        m30238d();
    }

    private lrv m30238d() {
        this.f26278b = ltr.m30492d();
        this.f26279c = null;
        this.f26280d = null;
        this.f26281e = null;
        this.f26282f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26277a != null) {
            nyu.a(1, this.f26277a.intValue());
        }
        if (this.f26278b != null && this.f26278b.length > 0) {
            for (nzf nzf : this.f26278b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f26279c != null) {
            nyu.b(3, this.f26279c.longValue());
        }
        if (this.f26280d != null) {
            nyu.b(4, this.f26280d);
        }
        if (this.f26281e != null) {
            nyu.b(5, this.f26281e.longValue());
        }
        if (this.f26282f != null) {
            nyu.a(6, this.f26282f.booleanValue());
        }
        if (this.f26283g != null) {
            nyu.a(7, this.f26283g.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26277a != null) {
            b += nyu.f(1, this.f26277a.intValue());
        }
        if (this.f26278b != null && this.f26278b.length > 0) {
            int i = b;
            for (nzf nzf : this.f26278b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f26279c != null) {
            b += nyu.f(3, this.f26279c.longValue());
        }
        if (this.f26280d != null) {
            b += nyu.d(4, this.f26280d);
        }
        if (this.f26281e != null) {
            b += nyu.f(5, this.f26281e.longValue());
        }
        if (this.f26282f != null) {
            this.f26282f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f26283g != null) {
            return b + nyu.f(7, this.f26283g.intValue());
        }
        return b;
    }

    private lrv m30237b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f26277a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f26278b == null) {
                        a = 0;
                    } else {
                        a = this.f26278b.length;
                    }
                    Object obj = new ltr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26278b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltr();
                    nyt.a(obj[a]);
                    this.f26278b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f26279c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    if (this.f26280d == null) {
                        this.f26280d = new lor();
                    }
                    nyt.a(this.f26280d);
                    continue;
                case 40:
                    this.f26281e = Long.valueOf(nyt.e());
                    continue;
                case 48:
                    this.f26282f = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f26283g = Integer.valueOf(a);
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
