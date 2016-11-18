package p000;

public final class nps extends nyx<nps> {
    public Boolean f30450a;

    public /* synthetic */ nzf m36073a(nyt nyt) {
        return m36071b(nyt);
    }

    public nps() {
        m36072d();
    }

    private nps m36072d() {
        this.f30450a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36074a(nyu nyu) {
        if (this.f30450a != null) {
            nyu.m37172a(1, this.f30450a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36075b() {
        int b = super.b();
        if (this.f30450a == null) {
            return b;
        }
        this.f30450a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nps m36071b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30450a = Boolean.valueOf(nyt.m37116i());
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
