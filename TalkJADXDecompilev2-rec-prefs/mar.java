package p000;

public final class mar extends nyx<mar> {
    public String f27143a;
    public String f27144b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31471b(nyt);
    }

    public mar() {
        m31472d();
    }

    private mar m31472d() {
        this.f27143a = null;
        this.f27144b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27143a != null) {
            nyu.a(1, this.f27143a);
        }
        if (this.f27144b != null) {
            nyu.a(2, this.f27144b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27143a != null) {
            b += nyu.b(1, this.f27143a);
        }
        if (this.f27144b != null) {
            return b + nyu.b(2, this.f27144b);
        }
        return b;
    }

    private mar m31471b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27143a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f27144b = nyt.j();
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
