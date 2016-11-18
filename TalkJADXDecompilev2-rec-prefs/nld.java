package p000;

public final class nld extends nyx<nld> {
    public String f30101a;

    public /* synthetic */ nzf m35470a(nyt nyt) {
        return m35468b(nyt);
    }

    public nld() {
        m35469d();
    }

    private nld m35469d() {
        this.f30101a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35471a(nyu nyu) {
        if (this.f30101a != null) {
            nyu.m37170a(1, this.f30101a);
        }
        super.a(nyu);
    }

    protected int m35472b() {
        int b = super.b();
        if (this.f30101a != null) {
            return b + nyu.m37137b(1, this.f30101a);
        }
        return b;
    }

    private nld m35468b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30101a = nyt.m37117j();
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
