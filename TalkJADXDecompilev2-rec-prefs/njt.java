package p000;

public final class njt extends nyx<njt> {
    public String f30010a;
    public Long f30011b;
    public String f30012c;

    public /* synthetic */ nzf m35279a(nyt nyt) {
        return m35277b(nyt);
    }

    public njt() {
        m35278d();
    }

    private njt m35278d() {
        this.f30010a = null;
        this.f30011b = null;
        this.f30012c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35280a(nyu nyu) {
        if (this.f30010a != null) {
            nyu.m37170a(1, this.f30010a);
        }
        if (this.f30011b != null) {
            nyu.m37187c(2, this.f30011b.longValue());
        }
        if (this.f30012c != null) {
            nyu.m37170a(3, this.f30012c);
        }
        super.a(nyu);
    }

    protected int m35281b() {
        int b = super.b();
        if (this.f30010a != null) {
            b += nyu.m37137b(1, this.f30010a);
        }
        if (this.f30011b != null) {
            this.f30011b.longValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f30012c != null) {
            return b + nyu.m37137b(3, this.f30012c);
        }
        return b;
    }

    private njt m35277b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30010a = nyt.m37117j();
                    continue;
                case wi.dK /*17*/:
                    this.f30011b = Long.valueOf(nyt.m37114g());
                    continue;
                case wi.dx /*26*/:
                    this.f30012c = nyt.m37117j();
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
