package p000;

public final class lvg extends nyx<lvg> {
    public loi[] f26583a;
    public lpn f26584b;
    public Boolean f26585c;
    public Integer f26586d;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30718b(nyt);
    }

    public lvg() {
        m30719d();
    }

    private lvg m30719d() {
        this.requestHeader = null;
        this.f26583a = loi.m29744d();
        this.f26584b = null;
        this.f26585c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26583a != null && this.f26583a.length > 0) {
            for (nzf nzf : this.f26583a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f26584b != null) {
            nyu.b(3, this.f26584b);
        }
        if (this.f26585c != null) {
            nyu.a(4, this.f26585c.booleanValue());
        }
        if (this.f26586d != null) {
            nyu.a(5, this.f26586d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26583a != null && this.f26583a.length > 0) {
            int i = b;
            for (nzf nzf : this.f26583a) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f26584b != null) {
            b += nyu.d(3, this.f26584b);
        }
        if (this.f26585c != null) {
            this.f26585c.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f26586d != null) {
            return b + nyu.f(5, this.f26586d.intValue());
        }
        return b;
    }

    private lvg m30718b(nyt nyt) {
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
                    int b = nzl.b(nyt, 18);
                    if (this.f26583a == null) {
                        a = 0;
                    } else {
                        a = this.f26583a.length;
                    }
                    Object obj = new loi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26583a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new loi();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new loi();
                    nyt.a(obj[a]);
                    this.f26583a = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f26584b == null) {
                        this.f26584b = new lpn();
                    }
                    nyt.a(this.f26584b);
                    continue;
                case 32:
                    this.f26585c = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26586d = Integer.valueOf(a);
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
