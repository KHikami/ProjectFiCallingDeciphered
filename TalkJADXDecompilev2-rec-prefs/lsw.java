package p000;

public final class lsw extends nyx<lsw> {
    public Long f26350a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30382b(nyt);
    }

    public lsw() {
        m30383d();
    }

    private lsw m30383d() {
        this.f26350a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26350a != null) {
            nyu.b(1, this.f26350a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26350a != null) {
            return b + nyu.f(1, this.f26350a.longValue());
        }
        return b;
    }

    private lsw m30382b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26350a = Long.valueOf(nyt.e());
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
