package p000;

public final class nmu extends nyx<nmu> {
    public Boolean f30259a;

    public /* synthetic */ nzf m35695a(nyt nyt) {
        return m35693b(nyt);
    }

    public nmu() {
        m35694d();
    }

    private nmu m35694d() {
        this.f30259a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35696a(nyu nyu) {
        if (this.f30259a != null) {
            nyu.m37172a(1, this.f30259a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35697b() {
        int b = super.b();
        if (this.f30259a == null) {
            return b;
        }
        this.f30259a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nmu m35693b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30259a = Boolean.valueOf(nyt.m37116i());
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
