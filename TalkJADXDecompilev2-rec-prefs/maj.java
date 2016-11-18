package p000;

public final class maj extends nyx<maj> {
    public mab f27110a;
    public lzj f27111b;
    public mab[] f27112c;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31429b(nyt);
    }

    public maj() {
        m31430d();
    }

    private maj m31430d() {
        this.requestHeader = null;
        this.f27110a = null;
        this.f27111b = null;
        this.f27112c = mab.m31388d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f27110a != null) {
            nyu.b(2, this.f27110a);
        }
        if (this.f27111b != null) {
            nyu.b(3, this.f27111b);
        }
        if (this.f27112c != null && this.f27112c.length > 0) {
            for (nzf nzf : this.f27112c) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f27110a != null) {
            b += nyu.d(2, this.f27110a);
        }
        if (this.f27111b != null) {
            b += nyu.d(3, this.f27111b);
        }
        if (this.f27112c == null || this.f27112c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f27112c) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private maj m31429b(nyt nyt) {
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
                    if (this.f27110a == null) {
                        this.f27110a = new mab();
                    }
                    nyt.a(this.f27110a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f27111b == null) {
                        this.f27111b = new lzj();
                    }
                    nyt.a(this.f27111b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f27112c == null) {
                        a = 0;
                    } else {
                        a = this.f27112c.length;
                    }
                    Object obj = new mab[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27112c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mab();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mab();
                    nyt.a(obj[a]);
                    this.f27112c = obj;
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
