package p000;

public final class lzb extends nyx<lzb> {
    public lyg f26972a;
    public lsh[] f26973b;
    public lzd f26974c;
    public Boolean f26975d;
    public Integer f26976e;
    public String f26977f;
    public lzj f26978g;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31234b(nyt);
    }

    public lzb() {
        m31235d();
    }

    private lzb m31235d() {
        this.requestHeader = null;
        this.f26972a = null;
        this.f26973b = lsh.m30303d();
        this.f26974c = null;
        this.f26975d = null;
        this.f26977f = null;
        this.f26978g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26972a != null) {
            nyu.b(2, this.f26972a);
        }
        if (this.f26973b != null && this.f26973b.length > 0) {
            for (nzf nzf : this.f26973b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f26974c != null) {
            nyu.b(4, this.f26974c);
        }
        if (this.f26975d != null) {
            nyu.a(5, this.f26975d.booleanValue());
        }
        if (this.f26976e != null) {
            nyu.a(6, this.f26976e.intValue());
        }
        if (this.f26977f != null) {
            nyu.a(7, this.f26977f);
        }
        if (this.f26978g != null) {
            nyu.b(8, this.f26978g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26972a != null) {
            b += nyu.d(2, this.f26972a);
        }
        if (this.f26973b != null && this.f26973b.length > 0) {
            int i = b;
            for (nzf nzf : this.f26973b) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f26974c != null) {
            b += nyu.d(4, this.f26974c);
        }
        if (this.f26975d != null) {
            this.f26975d.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f26976e != null) {
            b += nyu.f(6, this.f26976e.intValue());
        }
        if (this.f26977f != null) {
            b += nyu.b(7, this.f26977f);
        }
        if (this.f26978g != null) {
            return b + nyu.d(8, this.f26978g);
        }
        return b;
    }

    private lzb m31234b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26972a == null) {
                        this.f26972a = new lyg();
                    }
                    nyt.a(this.f26972a);
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f26973b == null) {
                        a = 0;
                    } else {
                        a = this.f26973b.length;
                    }
                    Object obj = new lsh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26973b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsh();
                    nyt.a(obj[a]);
                    this.f26973b = obj;
                    continue;
                case 34:
                    if (this.f26974c == null) {
                        this.f26974c = new lzd();
                    }
                    nyt.a(this.f26974c);
                    continue;
                case 40:
                    this.f26975d = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f26976e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    this.f26977f = nyt.j();
                    continue;
                case 66:
                    if (this.f26978g == null) {
                        this.f26978g = new lzj();
                    }
                    nyt.a(this.f26978g);
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
