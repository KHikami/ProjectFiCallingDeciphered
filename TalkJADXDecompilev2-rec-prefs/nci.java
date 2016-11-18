package p000;

public final class nci extends nyx<nci> {
    public Boolean f29500a;

    public /* synthetic */ nzf m34306a(nyt nyt) {
        return m34305b(nyt);
    }

    public nci() {
        this.f29500a = null;
        this.cachedSize = -1;
    }

    public void m34307a(nyu nyu) {
        if (this.f29500a != null) {
            nyu.m37172a(1, this.f29500a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34308b() {
        int b = super.b();
        if (this.f29500a == null) {
            return b;
        }
        this.f29500a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nci m34305b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29500a = Boolean.valueOf(nyt.m37116i());
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
