package p000;

public final class lqk extends nyx<lqk> {
    public Long f26140a;
    public byte[] f26141b;
    public String f26142c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30046b(nyt);
    }

    public lqk() {
        m30047d();
    }

    private lqk m30047d() {
        this.f26140a = null;
        this.f26141b = null;
        this.f26142c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26142c != null) {
            nyu.a(1, this.f26142c);
        }
        if (this.f26141b != null) {
            nyu.a(2, this.f26141b);
        }
        if (this.f26140a != null) {
            nyu.a(3, this.f26140a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26142c != null) {
            b += nyu.b(1, this.f26142c);
        }
        if (this.f26141b != null) {
            b += nyu.b(2, this.f26141b);
        }
        if (this.f26140a != null) {
            return b + nyu.e(3, this.f26140a.longValue());
        }
        return b;
    }

    private lqk m30046b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26142c = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26141b = nyt.k();
                    continue;
                case wi.dA /*24*/:
                    this.f26140a = Long.valueOf(nyt.d());
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
