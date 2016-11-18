package p000;

public final class nif extends nyx<nif> {
    public Integer f29876a;
    public Boolean f29877b;
    public Boolean f29878c;

    public /* synthetic */ nzf m35074a(nyt nyt) {
        return m35072b(nyt);
    }

    public nif() {
        m35073d();
    }

    private nif m35073d() {
        this.f29877b = null;
        this.f29878c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35075a(nyu nyu) {
        if (this.f29876a != null) {
            nyu.m37168a(1, this.f29876a.intValue());
        }
        if (this.f29877b != null) {
            nyu.m37172a(2, this.f29877b.booleanValue());
        }
        if (this.f29878c != null) {
            nyu.m37172a(3, this.f29878c.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35076b() {
        int b = super.b();
        if (this.f29876a != null) {
            b += nyu.m37147f(1, this.f29876a.intValue());
        }
        if (this.f29877b != null) {
            this.f29877b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f29878c == null) {
            return b;
        }
        this.f29878c.booleanValue();
        return b + (nyu.m37154h(3) + 1);
    }

    private nif m35072b(nyt nyt) {
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
                        case 6:
                            this.f29876a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f29877b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f29878c = Boolean.valueOf(nyt.m37116i());
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
