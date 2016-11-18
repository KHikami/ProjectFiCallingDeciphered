package p000;

public final class lth extends nyx<lth> {
    public String f26378a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30439b(nyt);
    }

    public lth() {
        m30440d();
    }

    private lth m30440d() {
        this.f26378a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26378a != null) {
            nyu.a(1, this.f26378a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26378a != null) {
            return b + nyu.b(1, this.f26378a);
        }
        return b;
    }

    private lth m30439b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26378a = nyt.j();
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
