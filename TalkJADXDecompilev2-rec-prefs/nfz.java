package p000;

public final class nfz extends nyx<nfz> {
    public Integer f29744a;
    public Boolean f29745b;

    public /* synthetic */ nzf m34766a(nyt nyt) {
        return m34764b(nyt);
    }

    public nfz() {
        m34765d();
    }

    private nfz m34765d() {
        this.f29745b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34767a(nyu nyu) {
        if (this.f29744a != null) {
            nyu.m37168a(1, this.f29744a.intValue());
        }
        if (this.f29745b != null) {
            nyu.m37172a(2, this.f29745b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34768b() {
        int b = super.b();
        if (this.f29744a != null) {
            b += nyu.m37147f(1, this.f29744a.intValue());
        }
        if (this.f29745b == null) {
            return b;
        }
        this.f29745b.booleanValue();
        return b + (nyu.m37154h(2) + 1);
    }

    private nfz m34764b(nyt nyt) {
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
                            this.f29744a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f29745b = Boolean.valueOf(nyt.m37116i());
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
