package p000;

public final class nju extends nyx<nju> {
    public String f30013a;
    public Integer f30014b;
    public String f30015c;

    public /* synthetic */ nzf m35284a(nyt nyt) {
        return m35282b(nyt);
    }

    public nju() {
        m35283d();
    }

    private nju m35283d() {
        this.f30013a = null;
        this.f30015c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35285a(nyu nyu) {
        if (this.f30013a != null) {
            nyu.m37170a(1, this.f30013a);
        }
        if (this.f30014b != null) {
            nyu.m37168a(2, this.f30014b.intValue());
        }
        if (this.f30015c != null) {
            nyu.m37170a(3, this.f30015c);
        }
        super.a(nyu);
    }

    protected int m35286b() {
        int b = super.b();
        if (this.f30013a != null) {
            b += nyu.m37137b(1, this.f30013a);
        }
        if (this.f30014b != null) {
            b += nyu.m37147f(2, this.f30014b.intValue());
        }
        if (this.f30015c != null) {
            return b + nyu.m37137b(3, this.f30015c);
        }
        return b;
    }

    private nju m35282b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30013a = nyt.m37117j();
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 6:
                        case 10:
                            this.f30014b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f30015c = nyt.m37117j();
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
