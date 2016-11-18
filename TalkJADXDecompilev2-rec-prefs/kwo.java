package p000;

public final class kwo extends nyx<kwo> {
    public String f23781a;
    public String f23782b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27822b(nyt);
    }

    public kwo() {
        m27823d();
    }

    private kwo m27823d() {
        this.f23781a = null;
        this.f23782b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23781a != null) {
            nyu.a(1, this.f23781a);
        }
        if (this.f23782b != null) {
            nyu.a(2, this.f23782b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23781a != null) {
            b += nyu.b(1, this.f23781a);
        }
        if (this.f23782b != null) {
            return b + nyu.b(2, this.f23782b);
        }
        return b;
    }

    private kwo m27822b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23781a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23782b = nyt.j();
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
