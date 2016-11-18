package p000;

public final class nbw extends nyx<nbw> {
    public Integer f29465a;
    public String f29466b;
    public String f29467c;

    public /* synthetic */ nzf m34241a(nyt nyt) {
        return m34239b(nyt);
    }

    public nbw() {
        m34240d();
    }

    private nbw m34240d() {
        this.f29466b = null;
        this.f29467c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34242a(nyu nyu) {
        if (this.f29465a != null) {
            nyu.m37168a(1, this.f29465a.intValue());
        }
        if (this.f29466b != null) {
            nyu.m37170a(2, this.f29466b);
        }
        if (this.f29467c != null) {
            nyu.m37170a(3, this.f29467c);
        }
        super.a(nyu);
    }

    protected int m34243b() {
        int b = super.b();
        if (this.f29465a != null) {
            b += nyu.m37147f(1, this.f29465a.intValue());
        }
        if (this.f29466b != null) {
            b += nyu.m37137b(2, this.f29466b);
        }
        if (this.f29467c != null) {
            return b + nyu.m37137b(3, this.f29467c);
        }
        return b;
    }

    private nbw m34239b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f29465a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f29466b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f29467c = nyt.m37117j();
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
