package p000;

public final class nle extends nyx<nle> {
    public Boolean f30102a;
    public Float f30103b;

    public /* synthetic */ nzf m35475a(nyt nyt) {
        return m35473b(nyt);
    }

    public nle() {
        m35474d();
    }

    private nle m35474d() {
        this.f30102a = null;
        this.f30103b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35476a(nyu nyu) {
        if (this.f30102a != null) {
            nyu.m37172a(1, this.f30102a.booleanValue());
        }
        if (this.f30103b != null) {
            nyu.m37167a(2, this.f30103b.floatValue());
        }
        super.a(nyu);
    }

    protected int m35477b() {
        int b = super.b();
        if (this.f30102a != null) {
            this.f30102a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30103b == null) {
            return b;
        }
        this.f30103b.floatValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private nle m35473b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30102a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 21:
                    this.f30103b = Float.valueOf(nyt.m37106c());
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
