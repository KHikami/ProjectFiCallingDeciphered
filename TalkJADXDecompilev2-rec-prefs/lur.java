package p000;

public final class lur extends nyx<lur> {
    public Integer f26526a;
    public Long f26527b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30642b(nyt);
    }

    public lur() {
        m30643d();
    }

    private lur m30643d() {
        this.f26527b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26526a != null) {
            nyu.a(1, this.f26526a.intValue());
        }
        if (this.f26527b != null) {
            nyu.a(2, this.f26527b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26526a != null) {
            b += nyu.f(1, this.f26526a.intValue());
        }
        if (this.f26527b != null) {
            return b + nyu.e(2, this.f26527b.longValue());
        }
        return b;
    }

    private lur m30642b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f26526a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f26527b = Long.valueOf(nyt.d());
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
