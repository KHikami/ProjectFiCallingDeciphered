package p000;

public final class nmq extends nyx<nmq> {
    public Integer f30254a;

    public /* synthetic */ nzf m35675a(nyt nyt) {
        return m35673b(nyt);
    }

    public nmq() {
        m35674d();
    }

    private nmq m35674d() {
        this.f30254a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35676a(nyu nyu) {
        if (this.f30254a != null) {
            nyu.m37168a(1, this.f30254a.intValue());
        }
        super.a(nyu);
    }

    protected int m35677b() {
        int b = super.b();
        if (this.f30254a != null) {
            return b + nyu.m37147f(1, this.f30254a.intValue());
        }
        return b;
    }

    private nmq m35673b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30254a = Integer.valueOf(nyt.m37112f());
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
