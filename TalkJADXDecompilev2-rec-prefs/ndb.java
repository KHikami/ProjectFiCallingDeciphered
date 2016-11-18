package p000;

public final class ndb extends nyx<ndb> {
    public Boolean f29547a;

    public /* synthetic */ nzf m34391a(nyt nyt) {
        return m34390b(nyt);
    }

    public ndb() {
        this.f29547a = null;
        this.cachedSize = -1;
    }

    public void m34392a(nyu nyu) {
        if (this.f29547a != null) {
            nyu.m37172a(1, this.f29547a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34393b() {
        int b = super.b();
        if (this.f29547a == null) {
            return b;
        }
        this.f29547a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ndb m34390b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29547a = Boolean.valueOf(nyt.m37116i());
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
