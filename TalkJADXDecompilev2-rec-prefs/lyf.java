package p000;

public final class lyf extends nyx<lyf> {
    public Boolean f26859a;
    public String f26860b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31121b(nyt);
    }

    public lyf() {
        m31122d();
    }

    private lyf m31122d() {
        this.f26859a = null;
        this.f26860b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26859a != null) {
            nyu.a(1, this.f26859a.booleanValue());
        }
        if (this.f26860b != null) {
            nyu.a(2, this.f26860b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26859a != null) {
            this.f26859a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f26860b != null) {
            return b + nyu.b(2, this.f26860b);
        }
        return b;
    }

    private lyf m31121b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26859a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dH /*18*/:
                    this.f26860b = nyt.j();
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
