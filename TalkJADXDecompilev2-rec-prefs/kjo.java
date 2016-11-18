package p000;

public final class kjo extends nyx<kjo> {
    public String f21959a;
    public String f21960b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26120b(nyt);
    }

    public kjo() {
        m26121d();
    }

    private kjo m26121d() {
        this.f21959a = null;
        this.f21960b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21959a != null) {
            nyu.a(1, this.f21959a);
        }
        if (this.f21960b != null) {
            nyu.a(2, this.f21960b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21959a != null) {
            b += nyu.b(1, this.f21959a);
        }
        if (this.f21960b != null) {
            return b + nyu.b(2, this.f21960b);
        }
        return b;
    }

    private kjo m26120b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21959a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f21960b = nyt.j();
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
