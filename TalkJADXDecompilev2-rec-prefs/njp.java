package p000;

public final class njp extends nyx<njp> {
    public String f30002a;
    public njq f30003b;

    public /* synthetic */ nzf m35259a(nyt nyt) {
        return m35257b(nyt);
    }

    public njp() {
        m35258d();
    }

    private njp m35258d() {
        this.f30002a = null;
        this.f30003b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35260a(nyu nyu) {
        if (this.f30002a != null) {
            nyu.m37170a(1, this.f30002a);
        }
        if (this.f30003b != null) {
            nyu.m37182b(2, this.f30003b);
        }
        super.a(nyu);
    }

    protected int m35261b() {
        int b = super.b();
        if (this.f30002a != null) {
            b += nyu.m37137b(1, this.f30002a);
        }
        if (this.f30003b != null) {
            return b + nyu.m37145d(2, this.f30003b);
        }
        return b;
    }

    private njp m35257b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30002a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f30003b == null) {
                        this.f30003b = new njq();
                    }
                    nyt.m37101a(this.f30003b);
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
