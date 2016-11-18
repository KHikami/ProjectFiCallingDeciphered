package p000;

public final class leh extends nyx<leh> {
    public Integer f24820a;
    public String f24821b;
    public String f24822c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28860b(nyt);
    }

    public leh() {
        m28861d();
    }

    private leh m28861d() {
        this.f24820a = null;
        this.f24821b = null;
        this.f24822c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24820a != null) {
            nyu.a(1, this.f24820a.intValue());
        }
        if (this.f24821b != null) {
            nyu.a(2, this.f24821b);
        }
        if (this.f24822c != null) {
            nyu.a(3, this.f24822c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24820a != null) {
            b += nyu.f(1, this.f24820a.intValue());
        }
        if (this.f24821b != null) {
            b += nyu.b(2, this.f24821b);
        }
        if (this.f24822c != null) {
            return b + nyu.b(3, this.f24822c);
        }
        return b;
    }

    private leh m28860b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24820a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    this.f24821b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24822c = nyt.j();
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
