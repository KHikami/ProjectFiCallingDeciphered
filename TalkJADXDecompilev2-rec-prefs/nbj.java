package p000;

public final class nbj extends nyx<nbj> {
    public String f29432a;
    public Integer f29433b;

    public /* synthetic */ nzf m34183a(nyt nyt) {
        return m34182b(nyt);
    }

    public nbj() {
        this.f29432a = null;
        this.f29433b = null;
        this.cachedSize = -1;
    }

    public void m34184a(nyu nyu) {
        if (this.f29432a != null) {
            nyu.m37170a(1, this.f29432a);
        }
        if (this.f29433b != null) {
            nyu.m37168a(2, this.f29433b.intValue());
        }
        super.a(nyu);
    }

    protected int m34185b() {
        int b = super.b();
        if (this.f29432a != null) {
            b += nyu.m37137b(1, this.f29432a);
        }
        if (this.f29433b != null) {
            return b + nyu.m37147f(2, this.f29433b.intValue());
        }
        return b;
    }

    private nbj m34182b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29432a = nyt.m37117j();
                    continue;
                case 16:
                    this.f29433b = Integer.valueOf(nyt.m37112f());
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
