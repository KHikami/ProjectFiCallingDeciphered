package p000;

public final class ncl extends nyx<ncl> {
    public ncm f29506a;

    public /* synthetic */ nzf m34318a(nyt nyt) {
        return m34317b(nyt);
    }

    public ncl() {
        this.cachedSize = -1;
    }

    public void m34319a(nyu nyu) {
        if (this.f29506a != null) {
            nyu.m37182b(1, this.f29506a);
        }
        super.a(nyu);
    }

    protected int m34320b() {
        int b = super.b();
        if (this.f29506a != null) {
            return b + nyu.m37145d(1, this.f29506a);
        }
        return b;
    }

    private ncl m34317b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29506a == null) {
                        this.f29506a = new ncm();
                    }
                    nyt.m37101a(this.f29506a);
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
