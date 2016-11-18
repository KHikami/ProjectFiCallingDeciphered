package p000;

public final class kum extends nyx<kum> {
    public Long f23462a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27583b(nyt);
    }

    public kum() {
        this.f23462a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23462a != null) {
            nyu.b(1, this.f23462a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23462a != null) {
            return b + nyu.f(1, this.f23462a.longValue());
        }
        return b;
    }

    private kum m27583b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23462a = Long.valueOf(nyt.e());
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
