package p000;

public final class nfn extends nyx<nfn> {
    public Integer f29688a;

    public /* synthetic */ nzf m34704a(nyt nyt) {
        return m34702b(nyt);
    }

    public nfn() {
        m34703d();
    }

    private nfn m34703d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34705a(nyu nyu) {
        if (this.f29688a != null) {
            nyu.m37168a(1, this.f29688a.intValue());
        }
        super.a(nyu);
    }

    protected int m34706b() {
        int b = super.b();
        if (this.f29688a != null) {
            return b + nyu.m37147f(1, this.f29688a.intValue());
        }
        return b;
    }

    private nfn m34702b(nyt nyt) {
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
                            this.f29688a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
