package p000;

public final class lyr extends nyx<lyr> {
    public lym f26944a;
    public lzj f26945b;
    public lym[] f26946c;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31184b(nyt);
    }

    public lyr() {
        m31185d();
    }

    private lyr m31185d() {
        this.requestHeader = null;
        this.f26944a = null;
        this.f26945b = null;
        this.f26946c = lym.m31158d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26944a != null) {
            nyu.b(2, this.f26944a);
        }
        if (this.f26945b != null) {
            nyu.b(3, this.f26945b);
        }
        if (this.f26946c != null && this.f26946c.length > 0) {
            for (nzf nzf : this.f26946c) {
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
        if (this.f26944a != null) {
            b += nyu.d(2, this.f26944a);
        }
        if (this.f26945b != null) {
            b += nyu.d(3, this.f26945b);
        }
        if (this.f26946c == null || this.f26946c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26946c) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private lyr m31184b(nyt nyt) {
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
                    if (this.f26944a == null) {
                        this.f26944a = new lym();
                    }
                    nyt.a(this.f26944a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26945b == null) {
                        this.f26945b = new lzj();
                    }
                    nyt.a(this.f26945b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f26946c == null) {
                        a = 0;
                    } else {
                        a = this.f26946c.length;
                    }
                    Object obj = new lym[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26946c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lym();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lym();
                    nyt.a(obj[a]);
                    this.f26946c = obj;
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
