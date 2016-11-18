package p000;

public final class lyk extends nyx<lyk> {
    public lyh f26899a;
    public lzj f26900b;
    public lyh[] f26901c;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31147b(nyt);
    }

    public lyk() {
        m31148d();
    }

    private lyk m31148d() {
        this.requestHeader = null;
        this.f26899a = null;
        this.f26900b = null;
        this.f26901c = lyh.m31132d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26899a != null) {
            nyu.b(2, this.f26899a);
        }
        if (this.f26900b != null) {
            nyu.b(3, this.f26900b);
        }
        if (this.f26901c != null && this.f26901c.length > 0) {
            for (nzf nzf : this.f26901c) {
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
        if (this.f26899a != null) {
            b += nyu.d(2, this.f26899a);
        }
        if (this.f26900b != null) {
            b += nyu.d(3, this.f26900b);
        }
        if (this.f26901c == null || this.f26901c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26901c) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private lyk m31147b(nyt nyt) {
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
                    if (this.f26899a == null) {
                        this.f26899a = new lyh();
                    }
                    nyt.a(this.f26899a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26900b == null) {
                        this.f26900b = new lzj();
                    }
                    nyt.a(this.f26900b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f26901c == null) {
                        a = 0;
                    } else {
                        a = this.f26901c.length;
                    }
                    Object obj = new lyh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26901c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lyh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lyh();
                    nyt.a(obj[a]);
                    this.f26901c = obj;
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
