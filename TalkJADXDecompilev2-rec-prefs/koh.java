package p000;

public final class koh extends nyx<koh> {
    public kud f22522a;
    public Boolean f22523b;
    public koq f22524c;
    public kui f22525d;
    public nsb f22526e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26783b(nyt);
    }

    public koh() {
        this.f22523b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22522a != null) {
            nyu.b(1, this.f22522a);
        }
        if (this.f22523b != null) {
            nyu.a(2, this.f22523b.booleanValue());
        }
        if (this.f22524c != null) {
            nyu.b(3, this.f22524c);
        }
        if (this.f22525d != null) {
            nyu.b(4, this.f22525d);
        }
        if (this.f22526e != null) {
            nyu.b(5, this.f22526e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22522a != null) {
            b += nyu.d(1, this.f22522a);
        }
        if (this.f22523b != null) {
            this.f22523b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f22524c != null) {
            b += nyu.d(3, this.f22524c);
        }
        if (this.f22525d != null) {
            b += nyu.d(4, this.f22525d);
        }
        if (this.f22526e != null) {
            return b + nyu.d(5, this.f22526e);
        }
        return b;
    }

    private koh m26783b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22522a == null) {
                        this.f22522a = new kud();
                    }
                    nyt.a(this.f22522a);
                    continue;
                case 16:
                    this.f22523b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.f22524c == null) {
                        this.f22524c = new koq();
                    }
                    nyt.a(this.f22524c);
                    continue;
                case 34:
                    if (this.f22525d == null) {
                        this.f22525d = new kui();
                    }
                    nyt.a(this.f22525d);
                    continue;
                case 42:
                    if (this.f22526e == null) {
                        this.f22526e = new nsb();
                    }
                    nyt.a(this.f22526e);
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
