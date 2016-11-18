package p000;

public final class lvk extends nyx<lvk> {
    public Long f26595a;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30738b(nyt);
    }

    public lvk() {
        m30739d();
    }

    private lvk m30739d() {
        this.responseHeader = null;
        this.f26595a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26595a != null) {
            nyu.a(2, this.f26595a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26595a != null) {
            return b + nyu.e(2, this.f26595a.longValue());
        }
        return b;
    }

    private lvk m30738b(nyt nyt) {
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
                    this.f26595a = Long.valueOf(nyt.d());
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
