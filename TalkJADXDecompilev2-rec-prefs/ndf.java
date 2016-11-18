package p000;

public final class ndf extends nyx<ndf> {
    public Boolean f29551a;

    public /* synthetic */ nzf m34407a(nyt nyt) {
        return m34406b(nyt);
    }

    public ndf() {
        this.f29551a = null;
        this.cachedSize = -1;
    }

    public void m34408a(nyu nyu) {
        if (this.f29551a != null) {
            nyu.m37172a(1, this.f29551a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34409b() {
        int b = super.b();
        if (this.f29551a == null) {
            return b;
        }
        this.f29551a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ndf m34406b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29551a = Boolean.valueOf(nyt.m37116i());
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
