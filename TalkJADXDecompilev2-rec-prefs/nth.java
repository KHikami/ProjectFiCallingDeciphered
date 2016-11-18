package p000;

public final class nth extends nyx<nth> {
    public Boolean f30748a;

    public /* synthetic */ nzf m36468a(nyt nyt) {
        return m36466b(nyt);
    }

    public nth() {
        m36467d();
    }

    private nth m36467d() {
        this.f30748a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36469a(nyu nyu) {
        if (this.f30748a != null) {
            nyu.m37172a(1, this.f30748a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36470b() {
        int b = super.b();
        if (this.f30748a == null) {
            return b;
        }
        this.f30748a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nth m36466b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30748a = Boolean.valueOf(nyt.m37116i());
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
