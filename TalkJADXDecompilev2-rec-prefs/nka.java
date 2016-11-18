package p000;

public final class nka extends nyx<nka> {
    public String f30026a;
    public Long f30027b;
    public String f30028c;

    public /* synthetic */ nzf m35315a(nyt nyt) {
        return m35313b(nyt);
    }

    public nka() {
        m35314d();
    }

    private nka m35314d() {
        this.f30026a = null;
        this.f30027b = null;
        this.f30028c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35316a(nyu nyu) {
        if (this.f30026a != null) {
            nyu.m37170a(1, this.f30026a);
        }
        if (this.f30027b != null) {
            nyu.m37187c(2, this.f30027b.longValue());
        }
        if (this.f30028c != null) {
            nyu.m37170a(3, this.f30028c);
        }
        super.a(nyu);
    }

    protected int m35317b() {
        int b = super.b();
        if (this.f30026a != null) {
            b += nyu.m37137b(1, this.f30026a);
        }
        if (this.f30027b != null) {
            this.f30027b.longValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f30028c != null) {
            return b + nyu.m37137b(3, this.f30028c);
        }
        return b;
    }

    private nka m35313b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30026a = nyt.m37117j();
                    continue;
                case wi.dK /*17*/:
                    this.f30027b = Long.valueOf(nyt.m37114g());
                    continue;
                case wi.dx /*26*/:
                    this.f30028c = nyt.m37117j();
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
