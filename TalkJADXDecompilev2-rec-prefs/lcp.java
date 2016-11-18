package p000;

public final class lcp extends nyx<lcp> {
    public String f24602a;
    public String f24603b;
    public String f24604c;
    public Boolean f24605d;
    public Boolean f24606e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28632b(nyt);
    }

    public lcp() {
        m28633d();
    }

    private lcp m28633d() {
        this.f24602a = null;
        this.f24603b = null;
        this.f24604c = null;
        this.f24605d = null;
        this.f24606e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24602a != null) {
            nyu.a(1, this.f24602a);
        }
        if (this.f24603b != null) {
            nyu.a(2, this.f24603b);
        }
        if (this.f24604c != null) {
            nyu.a(3, this.f24604c);
        }
        if (this.f24605d != null) {
            nyu.a(5, this.f24605d.booleanValue());
        }
        if (this.f24606e != null) {
            nyu.a(6, this.f24606e.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24602a != null) {
            b += nyu.b(1, this.f24602a);
        }
        if (this.f24603b != null) {
            b += nyu.b(2, this.f24603b);
        }
        if (this.f24604c != null) {
            b += nyu.b(3, this.f24604c);
        }
        if (this.f24605d != null) {
            this.f24605d.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f24606e == null) {
            return b;
        }
        this.f24606e.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private lcp m28632b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24602a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24603b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24604c = nyt.j();
                    continue;
                case 40:
                    this.f24605d = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f24606e = Boolean.valueOf(nyt.i());
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
