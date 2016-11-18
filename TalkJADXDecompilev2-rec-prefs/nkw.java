package p000;

public final class nkw extends nyx<nkw> {
    public Boolean f30084a;

    public /* synthetic */ nzf m35425a(nyt nyt) {
        return m35423b(nyt);
    }

    public nkw() {
        m35424d();
    }

    private nkw m35424d() {
        this.f30084a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35426a(nyu nyu) {
        if (this.f30084a != null) {
            nyu.m37172a(1, this.f30084a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35427b() {
        int b = super.b();
        if (this.f30084a == null) {
            return b;
        }
        this.f30084a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nkw m35423b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30084a = Boolean.valueOf(nyt.m37116i());
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
