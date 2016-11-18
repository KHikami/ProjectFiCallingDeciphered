package p000;

public final class njm extends nyx<njm> {
    public String f29996a;
    public Integer f29997b;
    public String f29998c;

    public /* synthetic */ nzf m35244a(nyt nyt) {
        return m35242b(nyt);
    }

    public njm() {
        m35243d();
    }

    private njm m35243d() {
        this.f29996a = null;
        this.f29998c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35245a(nyu nyu) {
        if (this.f29996a != null) {
            nyu.m37170a(1, this.f29996a);
        }
        if (this.f29997b != null) {
            nyu.m37168a(2, this.f29997b.intValue());
        }
        if (this.f29998c != null) {
            nyu.m37170a(3, this.f29998c);
        }
        super.a(nyu);
    }

    protected int m35246b() {
        int b = super.b();
        if (this.f29996a != null) {
            b += nyu.m37137b(1, this.f29996a);
        }
        if (this.f29997b != null) {
            b += nyu.m37147f(2, this.f29997b.intValue());
        }
        if (this.f29998c != null) {
            return b + nyu.m37137b(3, this.f29998c);
        }
        return b;
    }

    private njm m35242b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29996a = nyt.m37117j();
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f29997b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f29998c = nyt.m37117j();
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
