package p000;

public final class kxe extends nyx<kxe> {
    public String f23833a;
    public String f23834b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27901b(nyt);
    }

    public kxe() {
        m27902d();
    }

    private kxe m27902d() {
        this.f23833a = null;
        this.f23834b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23833a != null) {
            nyu.a(1, this.f23833a);
        }
        if (this.f23834b != null) {
            nyu.a(2, this.f23834b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23833a != null) {
            b += nyu.b(1, this.f23833a);
        }
        if (this.f23834b != null) {
            return b + nyu.b(2, this.f23834b);
        }
        return b;
    }

    private kxe m27901b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23833a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23834b = nyt.j();
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
