package p000;

public final class loy extends nyx<loy> {
    public lor f25960a;
    public Integer f25961b;
    public Integer f25962c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29829b(nyt);
    }

    public loy() {
        m29830d();
    }

    private loy m29830d() {
        this.f25960a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25960a != null) {
            nyu.b(1, this.f25960a);
        }
        if (this.f25961b != null) {
            nyu.a(2, this.f25961b.intValue());
        }
        if (this.f25962c != null) {
            nyu.a(3, this.f25962c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25960a != null) {
            b += nyu.d(1, this.f25960a);
        }
        if (this.f25961b != null) {
            b += nyu.f(2, this.f25961b.intValue());
        }
        if (this.f25962c != null) {
            return b + nyu.f(3, this.f25962c.intValue());
        }
        return b;
    }

    private loy m29829b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25960a == null) {
                        this.f25960a = new lor();
                    }
                    nyt.a(this.f25960a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25961b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25962c = Integer.valueOf(a);
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
