package p000;

public final class lpv extends nyx<lpv> {
    public Boolean f26030a;
    public Long f26031b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29961b(nyt);
    }

    public lpv() {
        m29962d();
    }

    private lpv m29962d() {
        this.f26030a = null;
        this.f26031b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26030a != null) {
            nyu.a(1, this.f26030a.booleanValue());
        }
        if (this.f26031b != null) {
            nyu.a(2, this.f26031b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26030a != null) {
            this.f26030a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f26031b != null) {
            return b + nyu.e(2, this.f26031b.longValue());
        }
        return b;
    }

    private lpv m29961b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26030a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f26031b = Long.valueOf(nyt.d());
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
