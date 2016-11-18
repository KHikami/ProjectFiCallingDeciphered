package p000;

public final class lqa extends nyx<lqa> {
    public Long f26055a;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29991b(nyt);
    }

    public lqa() {
        m29992d();
    }

    private lqa m29992d() {
        this.responseHeader = null;
        this.f26055a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26055a != null) {
            nyu.a(2, this.f26055a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26055a != null) {
            return b + nyu.e(2, this.f26055a.longValue());
        }
        return b;
    }

    private lqa m29991b(nyt nyt) {
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
                    this.f26055a = Long.valueOf(nyt.d());
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
