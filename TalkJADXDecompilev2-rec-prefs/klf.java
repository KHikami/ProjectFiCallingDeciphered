package p000;

public final class klf extends nyx<klf> {
    public Integer f22142a;
    public String f22143b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26367b(nyt);
    }

    public klf() {
        m26368d();
    }

    private klf m26368d() {
        this.f22142a = null;
        this.f22143b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22142a != null) {
            nyu.c(1, this.f22142a.intValue());
        }
        if (this.f22143b != null) {
            nyu.a(2, this.f22143b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22142a != null) {
            b += nyu.g(1, this.f22142a.intValue());
        }
        if (this.f22143b != null) {
            return b + nyu.b(2, this.f22143b);
        }
        return b;
    }

    private klf m26367b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22142a = Integer.valueOf(nyt.l());
                    continue;
                case wi.dH /*18*/:
                    this.f22143b = nyt.j();
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
