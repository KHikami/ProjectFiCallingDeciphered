package p000;

public final class kxg extends nyx<kxg> {
    public String f23842a;
    public String f23843b;
    public String f23844c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27912b(nyt);
    }

    public kxg() {
        m27913d();
    }

    private kxg m27913d() {
        this.f23842a = null;
        this.f23843b = null;
        this.f23844c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23842a != null) {
            nyu.a(1, this.f23842a);
        }
        if (this.f23843b != null) {
            nyu.a(2, this.f23843b);
        }
        if (this.f23844c != null) {
            nyu.a(3, this.f23844c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23842a != null) {
            b += nyu.b(1, this.f23842a);
        }
        if (this.f23843b != null) {
            b += nyu.b(2, this.f23843b);
        }
        if (this.f23844c != null) {
            return b + nyu.b(3, this.f23844c);
        }
        return b;
    }

    private kxg m27912b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23842a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23843b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23844c = nyt.j();
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
