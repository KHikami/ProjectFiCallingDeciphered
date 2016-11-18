package p000;

public final class kpi extends nyx<kpi> {
    public Integer f22645a;
    public String f22646b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26909b(nyt);
    }

    public kpi() {
        m26910d();
    }

    private kpi m26910d() {
        this.f22646b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22645a != null) {
            nyu.a(1, this.f22645a.intValue());
        }
        if (this.f22646b != null) {
            nyu.a(2, this.f22646b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22645a != null) {
            b += nyu.f(1, this.f22645a.intValue());
        }
        if (this.f22646b != null) {
            return b + nyu.b(2, this.f22646b);
        }
        return b;
    }

    private kpi m26909b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f22645a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f22646b = nyt.j();
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
