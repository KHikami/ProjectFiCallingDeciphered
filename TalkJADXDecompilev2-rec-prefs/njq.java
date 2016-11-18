package p000;

public final class njq extends nyx<njq> {
    public String f30004a;
    public Long f30005b;

    public /* synthetic */ nzf m35264a(nyt nyt) {
        return m35262b(nyt);
    }

    public njq() {
        m35263d();
    }

    private njq m35263d() {
        this.f30004a = null;
        this.f30005b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35265a(nyu nyu) {
        if (this.f30004a != null) {
            nyu.m37170a(1, this.f30004a);
        }
        if (this.f30005b != null) {
            nyu.m37187c(2, this.f30005b.longValue());
        }
        super.a(nyu);
    }

    protected int m35266b() {
        int b = super.b();
        if (this.f30004a != null) {
            b += nyu.m37137b(1, this.f30004a);
        }
        if (this.f30005b == null) {
            return b;
        }
        this.f30005b.longValue();
        return b + (nyu.m37154h(2) + 8);
    }

    private njq m35262b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30004a = nyt.m37117j();
                    continue;
                case wi.dK /*17*/:
                    this.f30005b = Long.valueOf(nyt.m37114g());
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
