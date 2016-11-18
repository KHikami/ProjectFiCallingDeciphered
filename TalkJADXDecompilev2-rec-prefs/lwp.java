package p000;

public final class lwp extends nyx<lwp> {
    public Integer f26709a;
    public Long f26710b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30898b(nyt);
    }

    public lwp() {
        m30899d();
    }

    private lwp m30899d() {
        this.f26710b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26709a != null) {
            nyu.a(1, this.f26709a.intValue());
        }
        if (this.f26710b != null) {
            nyu.a(2, this.f26710b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26709a != null) {
            b += nyu.f(1, this.f26709a.intValue());
        }
        if (this.f26710b != null) {
            return b + nyu.e(2, this.f26710b.longValue());
        }
        return b;
    }

    private lwp m30898b(nyt nyt) {
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
                        case 2:
                        case 3:
                            this.f26709a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f26710b = Long.valueOf(nyt.d());
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
