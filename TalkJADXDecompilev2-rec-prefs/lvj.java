package p000;

public final class lvj extends nyx<lvj> {
    public lor f26592a;
    public Integer f26593b;
    public Integer f26594c;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30733b(nyt);
    }

    public lvj() {
        m30734d();
    }

    private lvj m30734d() {
        this.requestHeader = null;
        this.f26592a = null;
        this.f26594c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26592a != null) {
            nyu.b(2, this.f26592a);
        }
        if (this.f26593b != null) {
            nyu.a(3, this.f26593b.intValue());
        }
        if (this.f26594c != null) {
            nyu.a(4, this.f26594c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26592a != null) {
            b += nyu.d(2, this.f26592a);
        }
        if (this.f26593b != null) {
            b += nyu.f(3, this.f26593b.intValue());
        }
        if (this.f26594c != null) {
            return b + nyu.f(4, this.f26594c.intValue());
        }
        return b;
    }

    private lvj m30733b(nyt nyt) {
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
                    if (this.f26592a == null) {
                        this.f26592a = new lor();
                    }
                    nyt.a(this.f26592a);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 10:
                        case 20:
                        case wi.dz /*25*/:
                        case 30:
                        case 100:
                            this.f26593b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.f26594c = Integer.valueOf(nyt.f());
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
