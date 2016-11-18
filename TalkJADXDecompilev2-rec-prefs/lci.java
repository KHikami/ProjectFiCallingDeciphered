package p000;

public final class lci extends nyx<lci> {
    public lby f24574a;
    public String f24575b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28599b(nyt);
    }

    public lci() {
        this.f24575b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24574a != null) {
            nyu.b(1, this.f24574a);
        }
        if (this.f24575b != null) {
            nyu.a(2, this.f24575b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24574a != null) {
            b += nyu.d(1, this.f24574a);
        }
        if (this.f24575b != null) {
            return b + nyu.b(2, this.f24575b);
        }
        return b;
    }

    private lci m28599b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24574a == null) {
                        this.f24574a = new lby();
                    }
                    nyt.a(this.f24574a);
                    continue;
                case wi.dH /*18*/:
                    this.f24575b = nyt.j();
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
