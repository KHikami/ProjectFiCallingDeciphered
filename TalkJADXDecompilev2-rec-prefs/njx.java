package p000;

public final class njx extends nyx<njx> {
    public String f30019a;
    public Long f30020b;
    public Long f30021c;

    public /* synthetic */ nzf m35299a(nyt nyt) {
        return m35297b(nyt);
    }

    public njx() {
        m35298d();
    }

    private njx m35298d() {
        this.f30019a = null;
        this.f30020b = null;
        this.f30021c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35300a(nyu nyu) {
        if (this.f30019a != null) {
            nyu.m37170a(1, this.f30019a);
        }
        if (this.f30020b != null) {
            nyu.m37187c(2, this.f30020b.longValue());
        }
        if (this.f30021c != null) {
            nyu.m37181b(3, this.f30021c.longValue());
        }
        super.a(nyu);
    }

    protected int m35301b() {
        int b = super.b();
        if (this.f30019a != null) {
            b += nyu.m37137b(1, this.f30019a);
        }
        if (this.f30020b != null) {
            this.f30020b.longValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f30021c != null) {
            return b + nyu.m37148f(3, this.f30021c.longValue());
        }
        return b;
    }

    private njx m35297b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30019a = nyt.m37117j();
                    continue;
                case wi.dK /*17*/:
                    this.f30020b = Long.valueOf(nyt.m37114g());
                    continue;
                case wi.dA /*24*/:
                    this.f30021c = Long.valueOf(nyt.m37110e());
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
