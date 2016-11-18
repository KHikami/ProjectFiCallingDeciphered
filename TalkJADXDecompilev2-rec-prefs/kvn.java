package p000;

public final class kvn extends nyx<kvn> {
    public String f23647a;
    public String f23648b;
    public String f23649c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27708b(nyt);
    }

    public kvn() {
        this.f23647a = null;
        this.f23648b = null;
        this.f23649c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23647a);
        if (this.f23648b != null) {
            nyu.a(2, this.f23648b);
        }
        if (this.f23649c != null) {
            nyu.a(3, this.f23649c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.b(1, this.f23647a);
        if (this.f23648b != null) {
            b += nyu.b(2, this.f23648b);
        }
        if (this.f23649c != null) {
            return b + nyu.b(3, this.f23649c);
        }
        return b;
    }

    private kvn m27708b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23647a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23648b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23649c = nyt.j();
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
