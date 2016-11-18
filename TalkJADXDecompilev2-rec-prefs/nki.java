package p000;

public final class nki extends nyx<nki> {
    public Boolean f30036a;

    public /* synthetic */ nzf m35355a(nyt nyt) {
        return m35353b(nyt);
    }

    public nki() {
        m35354d();
    }

    private nki m35354d() {
        this.f30036a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35356a(nyu nyu) {
        if (this.f30036a != null) {
            nyu.m37172a(1, this.f30036a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35357b() {
        int b = super.b();
        if (this.f30036a == null) {
            return b;
        }
        this.f30036a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nki m35353b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30036a = Boolean.valueOf(nyt.m37116i());
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
