package p000;

public final class kug extends nyx<kug> {
    public Double f23417a;
    public Double f23418b;
    public Double f23419c;
    public Double f23420d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27556b(nyt);
    }

    public kug() {
        this.f23417a = null;
        this.f23418b = null;
        this.f23419c = null;
        this.f23420d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23417a.doubleValue());
        nyu.a(2, this.f23418b.doubleValue());
        nyu.a(3, this.f23419c.doubleValue());
        nyu.a(4, this.f23420d.doubleValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        this.f23417a.doubleValue();
        b += nyu.h(1) + 8;
        this.f23418b.doubleValue();
        b += nyu.h(2) + 8;
        this.f23419c.doubleValue();
        b += nyu.h(3) + 8;
        this.f23420d.doubleValue();
        return b + (nyu.h(4) + 8);
    }

    private kug m27556b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f23417a = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.f23418b = Double.valueOf(nyt.b());
                    continue;
                case wi.dz /*25*/:
                    this.f23419c = Double.valueOf(nyt.b());
                    continue;
                case 33:
                    this.f23420d = Double.valueOf(nyt.b());
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
