package p000;

public final class lte extends nyx<lte> {
    public lqm f26368a;
    public Integer f26369b;
    public byte[] f26370c;
    public Long f26371d;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30424b(nyt);
    }

    public lte() {
        m30425d();
    }

    private lte m30425d() {
        this.requestHeader = null;
        this.f26368a = null;
        this.f26370c = null;
        this.f26371d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26370c != null) {
            nyu.a(2, this.f26370c);
        }
        if (this.f26369b != null) {
            nyu.a(3, this.f26369b.intValue());
        }
        if (this.f26371d != null) {
            nyu.a(4, this.f26371d.longValue());
        }
        if (this.f26368a != null) {
            nyu.b(5, this.f26368a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26370c != null) {
            b += nyu.b(2, this.f26370c);
        }
        if (this.f26369b != null) {
            b += nyu.f(3, this.f26369b.intValue());
        }
        if (this.f26371d != null) {
            b += nyu.e(4, this.f26371d.longValue());
        }
        if (this.f26368a != null) {
            return b + nyu.d(5, this.f26368a);
        }
        return b;
    }

    private lte m30424b(nyt nyt) {
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
                    this.f26370c = nyt.k();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f26369b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.f26371d = Long.valueOf(nyt.d());
                    continue;
                case 42:
                    if (this.f26368a == null) {
                        this.f26368a = new lqm();
                    }
                    nyt.a(this.f26368a);
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
