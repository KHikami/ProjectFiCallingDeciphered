package p000;

public final class ndp extends nyx<ndp> {
    public Boolean f29573a;

    public /* synthetic */ nzf m34448a(nyt nyt) {
        return m34447b(nyt);
    }

    public ndp() {
        this.f29573a = null;
        this.cachedSize = -1;
    }

    public void m34449a(nyu nyu) {
        if (this.f29573a != null) {
            nyu.m37172a(1, this.f29573a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34450b() {
        int b = super.b();
        if (this.f29573a == null) {
            return b;
        }
        this.f29573a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ndp m34447b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29573a = Boolean.valueOf(nyt.m37116i());
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
