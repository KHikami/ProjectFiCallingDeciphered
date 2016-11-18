package p000;

public final class nfi extends nyx<nfi> {
    public Integer f29676a;

    public /* synthetic */ nzf m34678a(nyt nyt) {
        return m34676b(nyt);
    }

    public nfi() {
        m34677d();
    }

    private nfi m34677d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34679a(nyu nyu) {
        if (this.f29676a != null) {
            nyu.m37168a(1, this.f29676a.intValue());
        }
        super.a(nyu);
    }

    protected int m34680b() {
        int b = super.b();
        if (this.f29676a != null) {
            return b + nyu.m37147f(1, this.f29676a.intValue());
        }
        return b;
    }

    private nfi m34676b(nyt nyt) {
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
                        case 4:
                        case 5:
                            this.f29676a = Integer.valueOf(a);
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
