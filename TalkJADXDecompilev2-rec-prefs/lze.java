package p000;

public final class lze extends nyx<lze> {
    public String f26987a;
    public String f26988b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31249b(nyt);
    }

    public lze() {
        m31250d();
    }

    private lze m31250d() {
        this.f26987a = null;
        this.f26988b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26987a != null) {
            nyu.a(1, this.f26987a);
        }
        if (this.f26988b != null) {
            nyu.a(2, this.f26988b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26987a != null) {
            b += nyu.b(1, this.f26987a);
        }
        if (this.f26988b != null) {
            return b + nyu.b(2, this.f26988b);
        }
        return b;
    }

    private lze m31249b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26987a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26988b = nyt.j();
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
