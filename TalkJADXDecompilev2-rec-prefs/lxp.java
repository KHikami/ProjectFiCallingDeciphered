package p000;

public final class lxp extends nyx<lxp> {
    public Long f26797a;
    public Long f26798b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31033b(nyt);
    }

    public lxp() {
        m31034d();
    }

    private lxp m31034d() {
        this.f26797a = null;
        this.f26798b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26797a != null) {
            nyu.b(1, this.f26797a.longValue());
        }
        if (this.f26798b != null) {
            nyu.b(2, this.f26798b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26797a != null) {
            b += nyu.f(1, this.f26797a.longValue());
        }
        if (this.f26798b != null) {
            return b + nyu.f(2, this.f26798b.longValue());
        }
        return b;
    }

    private lxp m31033b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26797a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f26798b = Long.valueOf(nyt.e());
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
