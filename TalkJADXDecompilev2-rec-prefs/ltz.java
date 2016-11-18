package p000;

public final class ltz extends nyx<ltz> {
    public Long f26433a;
    public Integer f26434b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30532b(nyt);
    }

    public ltz() {
        m30533d();
    }

    private ltz m30533d() {
        this.f26433a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26433a != null) {
            nyu.a(1, this.f26433a.longValue());
        }
        if (this.f26434b != null) {
            nyu.a(2, this.f26434b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26433a != null) {
            b += nyu.e(1, this.f26433a.longValue());
        }
        if (this.f26434b != null) {
            return b + nyu.f(2, this.f26434b.intValue());
        }
        return b;
    }

    private ltz m30532b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26433a = Long.valueOf(nyt.d());
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 10:
                        case 20:
                        case 30:
                        case 40:
                            this.f26434b = Integer.valueOf(a);
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
