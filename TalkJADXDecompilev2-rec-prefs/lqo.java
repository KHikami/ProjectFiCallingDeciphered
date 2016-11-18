package p000;

public final class lqo extends nyx<lqo> {
    public Long f26152a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30066b(nyt);
    }

    public lqo() {
        m30067d();
    }

    private lqo m30067d() {
        this.f26152a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26152a != null) {
            nyu.b(1, this.f26152a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26152a != null) {
            return b + nyu.f(1, this.f26152a.longValue());
        }
        return b;
    }

    private lqo m30066b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26152a = Long.valueOf(nyt.e());
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
