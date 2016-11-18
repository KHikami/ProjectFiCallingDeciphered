package p000;

public final class lyu extends nyx<lyu> {
    public lzj f26956a;
    public Integer f26957b;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31199b(nyt);
    }

    public lyu() {
        m31200d();
    }

    private lyu m31200d() {
        this.responseHeader = null;
        this.f26956a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26956a != null) {
            nyu.b(2, this.f26956a);
        }
        if (this.f26957b != null) {
            nyu.a(3, this.f26957b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26956a != null) {
            b += nyu.d(2, this.f26956a);
        }
        if (this.f26957b != null) {
            return b + nyu.f(3, this.f26957b.intValue());
        }
        return b;
    }

    private lyu m31199b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26956a == null) {
                        this.f26956a = new lzj();
                    }
                    nyt.a(this.f26956a);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            this.f26957b = Integer.valueOf(a);
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
