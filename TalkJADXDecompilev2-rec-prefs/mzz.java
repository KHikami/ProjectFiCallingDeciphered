package p000;

public final class mzz extends nyx<mzz> {
    public naf f29306a;

    public /* synthetic */ nzf m33995a(nyt nyt) {
        return m33994b(nyt);
    }

    public mzz() {
        this.cachedSize = -1;
    }

    public void m33996a(nyu nyu) {
        if (this.f29306a != null) {
            nyu.m37182b(1, this.f29306a);
        }
        super.a(nyu);
    }

    protected int m33997b() {
        int b = super.b();
        if (this.f29306a != null) {
            return b + nyu.m37145d(1, this.f29306a);
        }
        return b;
    }

    private mzz m33994b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29306a == null) {
                        this.f29306a = new naf();
                    }
                    nyt.m37101a(this.f29306a);
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
