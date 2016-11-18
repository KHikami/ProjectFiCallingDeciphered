package p000;

public final class kki extends nyx<kki> {
    public String f22048a;
    public String f22049b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26235b(nyt);
    }

    public kki() {
        m26236d();
    }

    private kki m26236d() {
        this.f22048a = null;
        this.f22049b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22048a != null) {
            nyu.a(1, this.f22048a);
        }
        if (this.f22049b != null) {
            nyu.a(2, this.f22049b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22048a != null) {
            b += nyu.b(1, this.f22048a);
        }
        if (this.f22049b != null) {
            return b + nyu.b(2, this.f22049b);
        }
        return b;
    }

    private kki m26235b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22048a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22049b = nyt.j();
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
