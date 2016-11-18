package p000;

public final class njw extends nyx<njw> {
    public String f30017a;
    public njx f30018b;

    public /* synthetic */ nzf m35294a(nyt nyt) {
        return m35292b(nyt);
    }

    public njw() {
        m35293d();
    }

    private njw m35293d() {
        this.f30017a = null;
        this.f30018b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35295a(nyu nyu) {
        if (this.f30017a != null) {
            nyu.m37170a(1, this.f30017a);
        }
        if (this.f30018b != null) {
            nyu.m37182b(2, this.f30018b);
        }
        super.a(nyu);
    }

    protected int m35296b() {
        int b = super.b();
        if (this.f30017a != null) {
            b += nyu.m37137b(1, this.f30017a);
        }
        if (this.f30018b != null) {
            return b + nyu.m37145d(2, this.f30018b);
        }
        return b;
    }

    private njw m35292b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30017a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f30018b == null) {
                        this.f30018b = new njx();
                    }
                    nyt.m37101a(this.f30018b);
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
