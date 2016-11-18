package p000;

public final class mcn extends nyx<mcn> {
    public String f27340a;
    public Integer f27341b;
    public Integer f27342c;
    public Integer f27343d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31732b(nyt);
    }

    public mcn() {
        m31733d();
    }

    private mcn m31733d() {
        this.f27340a = null;
        this.f27341b = null;
        this.f27342c = null;
        this.f27343d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27340a != null) {
            nyu.a(1, this.f27340a);
        }
        if (this.f27341b != null) {
            nyu.a(2, this.f27341b.intValue());
        }
        if (this.f27342c != null) {
            nyu.a(3, this.f27342c.intValue());
        }
        if (this.f27343d != null) {
            nyu.a(4, this.f27343d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27340a != null) {
            b += nyu.b(1, this.f27340a);
        }
        if (this.f27341b != null) {
            b += nyu.f(2, this.f27341b.intValue());
        }
        if (this.f27342c != null) {
            b += nyu.f(3, this.f27342c.intValue());
        }
        if (this.f27343d != null) {
            return b + nyu.f(4, this.f27343d.intValue());
        }
        return b;
    }

    private mcn m31732b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27340a = nyt.j();
                    continue;
                case 16:
                    this.f27341b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f27342c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f27343d = Integer.valueOf(nyt.f());
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
