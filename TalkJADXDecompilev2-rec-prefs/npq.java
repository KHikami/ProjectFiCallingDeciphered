package p000;

public final class npq extends nyx<npq> {
    public npn f30447a;

    public /* synthetic */ nzf m36063a(nyt nyt) {
        return m36061b(nyt);
    }

    public npq() {
        m36062d();
    }

    private npq m36062d() {
        this.f30447a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36064a(nyu nyu) {
        if (this.f30447a != null) {
            nyu.m37182b(2, this.f30447a);
        }
        super.a(nyu);
    }

    protected int m36065b() {
        int b = super.b();
        if (this.f30447a != null) {
            return b + nyu.m37145d(2, this.f30447a);
        }
        return b;
    }

    private npq m36061b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f30447a == null) {
                        this.f30447a = new npn();
                    }
                    nyt.m37101a(this.f30447a);
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
