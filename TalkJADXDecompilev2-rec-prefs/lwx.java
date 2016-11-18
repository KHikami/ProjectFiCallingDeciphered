package p000;

public final class lwx extends nyx<lwx> {
    public lqw[] f26733a;
    public byte[] f26734b;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30939b(nyt);
    }

    public lwx() {
        m30940d();
    }

    private lwx m30940d() {
        this.requestHeader = null;
        this.f26733a = lqw.m30110d();
        this.f26734b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26733a != null && this.f26733a.length > 0) {
            for (nzf nzf : this.f26733a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f26734b != null) {
            nyu.a(3, this.f26734b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26733a != null && this.f26733a.length > 0) {
            int i = b;
            for (nzf nzf : this.f26733a) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f26734b != null) {
            return b + nyu.b(3, this.f26734b);
        }
        return b;
    }

    private lwx m30939b(nyt nyt) {
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
                    if (this.f26733a == null) {
                        a = 0;
                    } else {
                        a = this.f26733a.length;
                    }
                    Object obj = new lqw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26733a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqw();
                    nyt.a(obj[a]);
                    this.f26733a = obj;
                    continue;
                case wi.dx /*26*/:
                    this.f26734b = nyt.k();
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
