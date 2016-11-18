package p000;

public final class lti extends nyx<lti> {
    public String f26379a;
    public Long f26380b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30444b(nyt);
    }

    public lti() {
        m30445d();
    }

    private lti m30445d() {
        this.f26379a = null;
        this.f26380b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26379a != null) {
            nyu.a(1, this.f26379a);
        }
        if (this.f26380b != null) {
            nyu.a(2, this.f26380b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26379a != null) {
            b += nyu.b(1, this.f26379a);
        }
        if (this.f26380b != null) {
            return b + nyu.e(2, this.f26380b.longValue());
        }
        return b;
    }

    private lti m30444b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26379a = nyt.j();
                    continue;
                case 16:
                    this.f26380b = Long.valueOf(nyt.d());
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
