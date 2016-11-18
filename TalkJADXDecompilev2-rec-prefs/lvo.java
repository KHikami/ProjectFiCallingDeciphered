package p000;

public final class lvo extends nyx<lvo> {
    public Long f26607a;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30758b(nyt);
    }

    public lvo() {
        m30759d();
    }

    private lvo m30759d() {
        this.responseHeader = null;
        this.f26607a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26607a != null) {
            nyu.a(2, this.f26607a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26607a != null) {
            return b + nyu.e(2, this.f26607a.longValue());
        }
        return b;
    }

    private lvo m30758b(nyt nyt) {
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
                case 16:
                    this.f26607a = Long.valueOf(nyt.d());
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
