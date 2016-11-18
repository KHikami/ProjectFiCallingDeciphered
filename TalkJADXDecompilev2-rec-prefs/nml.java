package p000;

public final class nml extends nyx<nml> {
    public Boolean f30244a;

    public /* synthetic */ nzf m35647a(nyt nyt) {
        return m35645b(nyt);
    }

    public nml() {
        m35646d();
    }

    private nml m35646d() {
        this.f30244a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35648a(nyu nyu) {
        if (this.f30244a != null) {
            nyu.m37172a(1, this.f30244a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35649b() {
        int b = super.b();
        if (this.f30244a == null) {
            return b;
        }
        this.f30244a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nml m35645b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30244a = Boolean.valueOf(nyt.m37116i());
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
