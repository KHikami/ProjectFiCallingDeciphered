package p000;

public final class lpt extends nyx<lpt> {
    public Boolean f26025a;
    public Long f26026b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29951b(nyt);
    }

    public lpt() {
        m29952d();
    }

    private lpt m29952d() {
        this.f26025a = null;
        this.f26026b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26025a != null) {
            nyu.a(1, this.f26025a.booleanValue());
        }
        if (this.f26026b != null) {
            nyu.a(2, this.f26026b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26025a != null) {
            this.f26025a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f26026b != null) {
            return b + nyu.e(2, this.f26026b.longValue());
        }
        return b;
    }

    private lpt m29951b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26025a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f26026b = Long.valueOf(nyt.d());
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
