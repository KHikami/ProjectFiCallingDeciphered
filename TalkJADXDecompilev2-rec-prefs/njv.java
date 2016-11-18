package p000;

public final class njv extends nyx<njv> {
    public String f30016a;

    public /* synthetic */ nzf m35289a(nyt nyt) {
        return m35287b(nyt);
    }

    public njv() {
        m35288d();
    }

    private njv m35288d() {
        this.f30016a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35290a(nyu nyu) {
        if (this.f30016a != null) {
            nyu.m37170a(1, this.f30016a);
        }
        super.a(nyu);
    }

    protected int m35291b() {
        int b = super.b();
        if (this.f30016a != null) {
            return b + nyu.m37137b(1, this.f30016a);
        }
        return b;
    }

    private njv m35287b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30016a = nyt.m37117j();
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
