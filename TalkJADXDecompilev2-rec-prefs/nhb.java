package p000;

public final class nhb extends nyx<nhb> {
    public Boolean f29817a;

    public /* synthetic */ nzf m34917a(nyt nyt) {
        return m34915b(nyt);
    }

    public nhb() {
        m34916d();
    }

    private nhb m34916d() {
        this.f29817a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34918a(nyu nyu) {
        if (this.f29817a != null) {
            nyu.m37172a(1, this.f29817a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34919b() {
        int b = super.b();
        if (this.f29817a == null) {
            return b;
        }
        this.f29817a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nhb m34915b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29817a = Boolean.valueOf(nyt.m37116i());
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
