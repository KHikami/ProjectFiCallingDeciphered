package p000;

public final class nzz extends nyx<nzz> {
    public Integer f31408a;
    public String f31409b;

    public /* synthetic */ nzf m37329a(nyt nyt) {
        return m37327b(nyt);
    }

    public nzz() {
        m37328d();
    }

    private nzz m37328d() {
        this.f31409b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37330a(nyu nyu) {
        if (this.f31408a != null) {
            nyu.m37168a(1, this.f31408a.intValue());
        }
        if (this.f31409b != null) {
            nyu.m37170a(2, this.f31409b);
        }
        super.a(nyu);
    }

    protected int m37331b() {
        int b = super.b();
        if (this.f31408a != null) {
            b += nyu.m37147f(1, this.f31408a.intValue());
        }
        if (this.f31409b != null) {
            return b + nyu.m37137b(2, this.f31409b);
        }
        return b;
    }

    private nzz m37327b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f31408a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f31409b = nyt.m37117j();
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
