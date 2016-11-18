package p000;

public final class krd extends nyx<krd> {
    public Integer f22861a;
    public Integer f22862b;
    public String f22863c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27161b(nyt);
    }

    public krd() {
        m27162d();
    }

    private krd m27162d() {
        this.f22861a = null;
        this.f22862b = null;
        this.f22863c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f22861a.intValue());
        nyu.a(2, this.f22862b.intValue());
        if (this.f22863c != null) {
            nyu.a(3, this.f22863c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.f(1, this.f22861a.intValue())) + nyu.f(2, this.f22862b.intValue());
        if (this.f22863c != null) {
            return b + nyu.b(3, this.f22863c);
        }
        return b;
    }

    private krd m27161b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22861a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f22862b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    this.f22863c = nyt.j();
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
