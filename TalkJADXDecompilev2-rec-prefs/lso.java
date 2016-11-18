package p000;

public final class lso extends nyx<lso> {
    public Long f26333a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30340b(nyt);
    }

    public lso() {
        m30341d();
    }

    private lso m30341d() {
        this.f26333a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26333a != null) {
            nyu.a(1, this.f26333a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26333a != null) {
            return b + nyu.e(1, this.f26333a.longValue());
        }
        return b;
    }

    private lso m30340b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26333a = Long.valueOf(nyt.d());
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
